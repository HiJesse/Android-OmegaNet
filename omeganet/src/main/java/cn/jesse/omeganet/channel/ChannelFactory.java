package cn.jesse.omeganet.channel;


/**
 * Created by jesse on 8/4/16.
 */
public interface ChannelFactory<T extends Channel> {

    T newChannel();
}
