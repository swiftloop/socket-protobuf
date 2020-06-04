package com.xinsiwei.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class NettyServer {

    private String host;

    private int port;


    public NettyServer(String host,int port){
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }



    public void start(){

        NioEventLoopGroup boss = new NioEventLoopGroup(1);
        NioEventLoopGroup worker = new NioEventLoopGroup(4);

        new ServerBootstrap().group(boss,worker).channel(NioServerSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY,true)
                .option(ChannelOption.SO_KEEPALIVE,true)
                .childHandler(new LoggingHandler(LogLevel.TRACE))
                .childHandler(new)



    }


}
