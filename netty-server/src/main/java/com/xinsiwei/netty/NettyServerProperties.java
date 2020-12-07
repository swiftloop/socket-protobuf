package com.xinsiwei.netty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sorata 2020-06-08 15:46
 */
@Component
@ConfigurationProperties(prefix = "netty.server")
public class NettyServerProperties {

    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
