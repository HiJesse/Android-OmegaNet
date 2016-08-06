package cn.jesse.omeganet.channel;

import cn.jesse.omeganet.util.concurrent.ChannelFuture;
import cn.jesse.omeganet.util.concurrent.EventExecutorGroup;

/**
 * Created by jesse on 8/4/16.
 */
public interface EventLoopGroup extends EventExecutorGroup{
    @Override
    EventLoop next();

    ChannelFuture register(Channel channel);
}
