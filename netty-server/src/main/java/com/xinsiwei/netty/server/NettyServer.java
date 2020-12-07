package com.xinsiwei.netty.server;

import com.xinsiwei.netty.handler.ChannelInitializerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyServer {

    private String host;
    private int port;

    private NioEventLoopGroup boss;
    private NioEventLoopGroup worker;


    public NettyServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }


    public void start() {
        boss = new NioEventLoopGroup(1);
        worker = new NioEventLoopGroup(4);
        ServerBootstrap bootstrap = new ServerBootstrap().group(boss, worker).channel(NioServerSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.SO_BACKLOG, 2048)
                .childHandler(new LoggingHandler(LogLevel.TRACE))
                .childHandler(new ChannelInitializerHandler());
        try {
            host = host == null || host.isEmpty() ? "0.0.0.0" : host;
            ChannelFuture future = bootstrap.bind(host, port <= 0 ? 8888 : port).sync();
            log.info("netty server start successfully! {}", future.channel().localAddress());
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            log.error("netty server start error {}", e.getMessage());
            e.printStackTrace();
            System.exit(0);
        } finally {
            worker.shutdownGracefully();
            boss.shutdownGracefully();
        }
    }


    public void shutdown() {
        if (worker != null) {
            worker.shutdownGracefully();
        }

        if (boss != null) {
            boss.shutdownGracefully();
        }
    }

}
