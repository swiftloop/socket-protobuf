package com.xinsiwei.socket.netty;

import android.util.Log;
import com.xinsiwei.socket.netty.message.MessagePacket;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * @author sorata 2020/6/11 10:29 上午
 */
public class NettyClient {

    private NioEventLoopGroup worker;

    private static final String TAG = "NettyClient";

    public void start(String host,int port) throws Exception{
        worker = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap().group(worker).channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new LoggingHandler(LogLevel.DEBUG))
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast("encoder",new LengthFieldPrepender(4));
                        pipeline.addLast("protobutfEncoder",new ProtobufEncoder());
                        pipeline.addLast("decoder",new LengthFieldBasedFrameDecoder(5*1024*1024,
                                0,4,0,4));
                        pipeline.addLast("protobufDecoer",new ProtobufDecoder(MessagePacket.Packet.getDefaultInstance()));
                        //读超时 指的是通道读取服务器发送的数据超时 也就是服务器在指定的周期内没有发送过来数据 （断开连接）
                        //写超时 指的是通道发送数据到服务器超时 也就是客户端在指定的周期内没有向服务器发送过数据 （发送ping数据包）
                        pipeline.addLast("idleHandler",new IdleStateHandler(30,15,0));
                        pipeline.addLast("timeoutHandler",new TimeoutEventHandler());
                        pipeline.addLast("messagehandler",new MessageHandler());

                    }
                });
        try {
            ChannelFuture future = bootstrap.connect(host, port).sync();
            Log.e(TAG, "netty client start: "+ future.channel().remoteAddress());
            future.channel().closeFuture().sync();
        }  finally {
            worker.shutdownGracefully();
        }
    }


    public void shutdown(){
        if (worker != null){
            worker.shutdownGracefully();
        }
    }


}
