package com.xinsiwei.netty.handler;

import com.xinsiwei.netty.message.MessagePacket;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * @author sorata 2020-06-08 11:22
 */
public class IdleHandler extends ChannelDuplexHandler {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent){
            if (((IdleStateEvent) evt).state() == IdleState.READER_IDLE){
                ctx.close();
            }else if (((IdleStateEvent) evt).state() == IdleState.WRITER_IDLE){
                MessagePacket.Packet packet = MessagePacket.Packet.newBuilder()
                        .setSid(MessagePacket.ServiceType.HEARTBEAT_VALUE)
                        .setCid(MessagePacket.HeartbeatType.PING_VALUE).build();
                ctx.writeAndFlush(packet);
            }
        }
    }
}
