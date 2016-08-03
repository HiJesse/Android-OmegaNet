package cn.jesse.omeganet.channel;

/**
 * Created by jesse on 8/3/16.
 */
public interface ChannelHanlder {
    void handlerAdded(ChannelHandlerContext ctx) throws Exception;

    void handlerRemoved(ChannelHandlerContext ctx) throws Exception;

    @Deprecated
    void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception;
}
