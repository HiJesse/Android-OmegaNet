package cn.jesse.omeganet.channel;

/**
 * Created by jesse on 8/5/16.
 */
public abstract class ChannelHandlerAdapter implements ChannelHandler{
    boolean added;

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        // NOOP
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        // NOOP
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        ctx.fireExceptionCaught(cause);
    }
}
