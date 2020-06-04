package com.xinsiwei.netty.server;

import com.google.protobuf.ExtensionRegistry;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class ChannelInitializerHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("protobufEncoder",new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast("encoder",new ProtobufEncoder());

        pipeline.addLast("protobufDecoder",new ProtobufVarint32FrameDecoder());
        pipeline.addLast("decoder",new ProtobufDecoder());
        ExtensionRegistry extensionRegistry = ExtensionRegistry.newInstance();
        extensionRegistry.add();
    }
}
