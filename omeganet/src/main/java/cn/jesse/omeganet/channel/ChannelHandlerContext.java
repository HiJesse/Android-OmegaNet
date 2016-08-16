package cn.jesse.omeganet.channel;

import java.net.SocketAddress;

import cn.jesse.omeganet.util.concurrent.ChannelFuture;
import cn.jesse.omeganet.util.concurrent.EventExecutor;

/**
 * Created by jesse on 8/3/16.
 */
public interface ChannelHandlerContext {
    Channel channel();

    EventExecutor executor();

    String name();

    ChannelHandler handler();

    boolean isRemoved();

    ChannelHandlerContext fireChannelRegistered();

    ChannelHandlerContext fireChannelUnregistered();

    ChannelHandlerContext fireChannelActive();

    ChannelHandlerContext fireChannelInactive();

    ChannelHandlerContext fireExceptionCaught(Throwable cause);

    ChannelHandlerContext fireUserEventTriggered(Object evt);

    ChannelHandlerContext fireChannelRead(Object msg);

    ChannelHandlerContext fireChannelReadComplete();

    ChannelHandlerContext fireChannelWritabilityChanged();

    ChannelFuture bind(SocketAddress localAddress);

    ChannelFuture connect(SocketAddress remoteAddress);

    ChannelFuture connect(SocketAddress remoteAddress, SocketAddress localAddress);

    ChannelFuture disconnect();

    ChannelFuture close();

    ChannelFuture deregister();

    ChannelHandlerContext read();

    ChannelFuture write(Object msg);

    ChannelHandlerContext flush();

    ChannelFuture writeAndFlush(Object msg);

    ChannelPipeline pipeline();

//    ByteBufAllocator alloc();//TODO alloc byte buffer

    ChannelFuture newSucceededFuture();

    ChannelFuture newFailedFuture(Throwable cause);
}
