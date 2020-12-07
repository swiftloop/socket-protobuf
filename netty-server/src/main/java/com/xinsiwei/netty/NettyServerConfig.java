package com.xinsiwei.netty;

import com.xinsiwei.netty.server.NettyServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sorata 2020-06-08 15:42
 */
@Configuration(proxyBeanMethods = false)
public class NettyServerConfig implements CommandLineRunner {

    private final NettyServerProperties properties;



    public NettyServerConfig(NettyServerProperties properties) {
        this.properties = properties;
    }


    @Override
    public void run(String... args) throws Exception {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1),
                new CustomizableThreadFactory("netty-start-"));
        executor.submit(()-> new NettyServer(properties.getHost(),properties.getPort()).start());
    }
}
