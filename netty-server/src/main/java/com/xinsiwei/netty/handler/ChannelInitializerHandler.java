package com.xinsiwei.netty.handler;

import com.xinsiwei.netty.message.MessagePacket;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.timeout.IdleStateHandler;

public class ChannelInitializerHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("protobufEncoder", new LengthFieldPrepender(4));
        pipeline.addLast("encoder", new ProtobufEncoder());
        pipeline.addLast("protobufDecoder", new LengthFieldBasedFrameDecoder(5242880, 0,
                4, 0, 4));
        pipeline.addLast("decode", new ProtobufDecoder(MessagePacket.Packet.getDefaultInstance()));
        pipeline.addLast("timeoutHandler", new IdleStateHandler(30, 10, 0));
        pipeline.addLast("idleHandler", new IdleHandler());
        pipeline.addLast("messageHandler", new MessageResolverHandler());

    }


}
