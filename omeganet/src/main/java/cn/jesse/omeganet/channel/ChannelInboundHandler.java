package cn.jesse.omeganet.channel;

/**
 * Created by jesse on 8/3/16.
 */
public interface ChannelInboundHandler extends ChannelHanlder {
    void channelRegistered(ChannelHandlerContext ctx) throws Exception;


    void channelUnregistered(ChannelHandlerContext ctx) throws Exception;


    void channelActive(ChannelHandlerContext ctx) throws Exception;


    void channelInactive(ChannelHandlerContext ctx) throws Exception;


    void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception;

    void channelReadComplete(ChannelHandlerContext ctx) throws Exception;

    void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception;

    void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception;

    /**
     * Gets called if a {@link Throwable} was thrown.
     */
    @Override
    @SuppressWarnings("deprecated")
    void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception;
}
