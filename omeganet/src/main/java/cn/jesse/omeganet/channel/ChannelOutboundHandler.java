package cn.jesse.omeganet.channel;

import java.net.SocketAddress;

/**
 * Created by jesse on 8/3/16.
 */
public interface ChannelOutboundHandler extends ChannelHanlder {
    void bind(ChannelHandlerContext ctx, SocketAddress localAddress) throws Exception;

    void connect(
            ChannelHandlerContext ctx, SocketAddress remoteAddress,
            SocketAddress localAddress) throws Exception;


    void disconnect(ChannelHandlerContext ctx) throws Exception;


    void close(ChannelHandlerContext ctx) throws Exception;


    void deregister(ChannelHandlerContext ctx) throws Exception;


    void read(ChannelHandlerContext ctx) throws Exception;


    void write(ChannelHandlerContext ctx, Object msg) throws Exception;


    void flush(ChannelHandlerContext ctx) throws Exception;
}
