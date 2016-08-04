package cn.jesse.omeganet.bootstrap;

import cn.jesse.omeganet.channel.Channel;

/**
 * Created by jesse on 8/4/16.
 */
public interface ChannelFactory<T extends Channel> {

    T newChannel();
}
