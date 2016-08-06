package cn.jesse.omeganet.channel;

import cn.jesse.omeganet.util.logging.ONLogger;
import cn.jesse.omeganet.util.logging.ONLoggerFactory;

/**
 * Created by jesse on 8/6/16.
 */
public abstract class ChannelInitializer<T extends Channel> extends ChannelInboundHandlerAdapter {
    private static final ONLogger logger = ONLoggerFactory.getInstance(ChannelInitializer.class);

    protected abstract void initChannel(T ch) throws Exception;

    @Override
    @SuppressWarnings("unchecked")
    public final void channelRegistered(ChannelHandlerContext ctx) throws Exception {
//        initChannel((T) ctx.channel());
//        ctx.pipeline().remove(this);
//        ctx.pipeline().fireChannelRegistered();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        logger.warn("Failed to initialize a channel. Closing: " + ctx.channel(), cause);
//        try {
//            ChannelPipeline pipeline = ctx.pipeline();
//            if (pipeline.context(this) != null) {
//                pipeline.remove(this);
//            }
//        } finally {
//            ctx.close();
//        }
    }
}
