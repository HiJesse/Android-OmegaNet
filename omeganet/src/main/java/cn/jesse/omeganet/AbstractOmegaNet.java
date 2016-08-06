package cn.jesse.omeganet;


import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import cn.jesse.omeganet.channel.ChannelFactory;
import cn.jesse.omeganet.channel.Channel;
import cn.jesse.omeganet.channel.ChannelException;
import cn.jesse.omeganet.channel.ChannelHandler;
import cn.jesse.omeganet.channel.EventLoopGroup;

/**
 * Created by jesse on 8/3/16.
 */
public abstract class AbstractOmegaNet<B extends AbstractOmegaNet, C extends Channel> {
    private volatile SocketAddress localAddress;
    private volatile EventLoopGroup group;
    private volatile ChannelFactory<? extends C> channelFactory;
    private volatile ChannelHandler handler;


    public B group(EventLoopGroup group) {
        if (group == null) {
            throw new NullPointerException("group");
        }
        if (this.group != null) {
            throw new IllegalStateException("group set already");
        }
        this.group = group;
        return (B) this;
    }

    public B channel(Class<? extends C> channelClass) {
        if (channelClass == null) {
            throw new NullPointerException("channelClass");
        }
        return channelFactory(new BootstrapChannelFactory<C>(channelClass));
    }

    public B channelFactory(ChannelFactory<? extends C> channelFactory) {
        if (channelFactory == null) {
            throw new NullPointerException("channelFactory");
        }
        if (this.channelFactory != null) {
            throw new IllegalStateException("channelFactory set already");
        }

        this.channelFactory = channelFactory;
        return (B) this;
    }

    public B localAddress(SocketAddress localAddress) {
        this.localAddress = localAddress;
        return (B) this;
    }

    public B localAddress(int inetPort) {
        return localAddress(new InetSocketAddress(inetPort));
    }

    public B localAddress(String inetHost, int inetPort) {
        return localAddress(new InetSocketAddress(inetHost, inetPort));
    }

    public B localAddress(InetAddress inetHost, int inetPort) {
        return localAddress(new InetSocketAddress(inetHost, inetPort));
    }

    public B handler(ChannelHandler handler) {
        if (handler == null) {
            throw new NullPointerException("handler");
        }
        this.handler = handler;
        return (B) this;
    }

    final SocketAddress localAddress() {
        return localAddress;
    }

    final ChannelFactory<? extends C> channelFactory() {
        return channelFactory;
    }

    final ChannelHandler handler() {
        return handler;
    }

    public B validate() {
        if (group == null) {
            throw new IllegalStateException("group not set");
        }
        if (channelFactory == null) {
            throw new IllegalStateException("channel or channelFactory not set");
        }
        return (B) this;
    }



    private static final class BootstrapChannelFactory<T extends Channel> implements ChannelFactory<T> {
        private final Class<? extends T> clazz;

        BootstrapChannelFactory(Class<? extends T> clazz) {
            this.clazz = clazz;
        }

        @Override
        public T newChannel() {
            try {
                return clazz.newInstance();
            } catch (Throwable t) {
                throw new ChannelException("Unable to create Channel from class " + clazz, t);
            }
        }
    }
}
