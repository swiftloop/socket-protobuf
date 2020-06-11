package com.xinsiwei.socket.netty;

import com.xinsiwei.socket.netty.message.MessagePacket;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * @author sorata 2020/6/11 11:35 上午
 */
public class TimeoutEventHandler extends ChannelDuplexHandler {
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
        if (evt instanceof IdleStateEvent){
            if (((IdleStateEvent) evt).state() == IdleState.READER_IDLE){
                ctx.close();
            }else if (((IdleStateEvent) evt).state() == IdleState.WRITER_IDLE){
                ctx.write(MessagePacket.Packet.newBuilder().setSid(MessagePacket.ServiceType.HEARTBEAT_VALUE)
                .setCid(MessagePacket.HeartbeatType.PING_VALUE).build());
            }
        }
    }
}
