package cn.jesse.omeganet.channel;

import cn.jesse.omeganet.util.concurrent.EventExecutor;

/**
 * Created by jesse on 8/6/16.
 */
public interface EventLoop extends EventExecutor, EventLoopGroup {
    @Override
    EventLoopGroup parent();
}
