package cn.jesse.omeganet.channel.socket;

import cn.jesse.omeganet.channel.Channel;

/**
 * Created by jesse on 8/6/16.
 */
public interface DuplexChannel extends Channel {
    boolean isInputShutdown();


    boolean isOutputShutdown();


//    ChannelFuture shutdownOutput();
}
