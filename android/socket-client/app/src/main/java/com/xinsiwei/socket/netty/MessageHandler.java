package com.xinsiwei.socket.netty;

import android.util.Log;
import com.xinsiwei.socket.netty.message.MessagePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author sorata 2020/6/11 11:38 上午
 */
public class MessageHandler extends SimpleChannelInboundHandler<MessagePacket.Packet> {
    private static final String TAG = "MessageHandler";


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessagePacket.Packet msg) throws Exception {
        Log.e(TAG, "channelRead0: message is: "+ msg.toString());
    }


    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
        Log.e(TAG, "channelRegistered: ");
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
        Log.e(TAG, "channelUnregistered: ");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        Log.e(TAG, "channelActive: ");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        Log.e(TAG, "channelInactive: ");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
        Log.e(TAG, "channelReadComplete: ");
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
        Log.e(TAG, "userEventTriggered: " + evt);
    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
        super.channelWritabilityChanged(ctx);
        Log.e(TAG, "channelWritabilityChanged: ");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        Log.e(TAG, "exceptionCaught: " + cause.getMessage());
        cause.printStackTrace();
    }
}
