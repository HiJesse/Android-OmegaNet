package cn.jesse.omeganet.channel;

import java.net.SocketAddress;

/**
 * Created by jesse on 8/5/16.
 */
public class ChannelDuplexHandler extends ChannelInboundHandlerAdapter implements ChannelOutboundHandler {

    @Override
    public void bind(ChannelHandlerContext ctx, SocketAddress localAddress) throws Exception {
//        ctx.bind(localAddress, future);
    }

    @Override
    public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress,
                        SocketAddress localAddress) throws Exception {
//        ctx.connect(remoteAddress, localAddress, future);
    }

    @Override
    public void disconnect(ChannelHandlerContext ctx)
            throws Exception {
//        ctx.disconnect(future);
    }

    @Override
    public void close(ChannelHandlerContext ctx) throws Exception {
//        ctx.close(future);
    }

    @Override
    public void deregister(ChannelHandlerContext ctx) throws Exception {
//        ctx.deregister(future);
    }

    @Override
    public void read(ChannelHandlerContext ctx) throws Exception {
//        ctx.read();
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg) throws Exception {
//        ctx.write(msg, promise);
    }

    @Override
    public void flush(ChannelHandlerContext ctx) throws Exception {
//        ctx.flush();
    }
}
