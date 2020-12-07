package com.xinsiwei.netty.handler;

import com.google.protobuf.ByteString;
import com.xinsiwei.netty.message.MessagePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sorata 2020-06-08 11:34
 */
@Slf4j
public class MessageResolverHandler extends SimpleChannelInboundHandler<MessagePacket.Packet> {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(MessagePacket.Packet.newBuilder().setCid(2).setSid(2).setBody(ByteString.copyFromUtf8("hello client")));
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessagePacket.Packet msg) throws Exception {
        if (msg.getSid() == MessagePacket.ServiceType.HEARTBEAT_VALUE) {
            if (msg.getCid() == MessagePacket.HeartbeatType.PING_VALUE) {
                log.warn("ping message.the cid is {}",msg.getCid());
                ctx.write(MessagePacket.Packet.newBuilder()
                        .setSeqNo(System.nanoTime() + "")
                        .setSid(MessagePacket.ServiceType.HEARTBEAT_VALUE)
                        .setCid(MessagePacket.HeartbeatType.PONG_VALUE));
            }
            return;
        }

        //处理其他业务
        log.info("message: {}",msg.toString());

    }
}
