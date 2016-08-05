package cn.jesse.omeganet.handler.logging;

import java.net.SocketAddress;

import cn.jesse.omeganet.channel.ChannelDuplexHandler;
import cn.jesse.omeganet.channel.ChannelHandlerContext;
import cn.jesse.omeganet.util.logging.ONLogLevel;
import cn.jesse.omeganet.util.logging.ONLogger;
import cn.jesse.omeganet.util.logging.ONLoggerFactory;

/**
 * Created by jesse on 8/5/16.
 */
public class LoggingHandler extends ChannelDuplexHandler {
    private static final LogLevel DEFAULT_LEVEL = LogLevel.DEBUG;

    protected final ONLogger logger;
    protected final ONLogLevel onLogLevel;

    private final LogLevel level;

    public LoggingHandler() {
        this(DEFAULT_LEVEL);
    }

    public LoggingHandler(LogLevel level) {
        if (level == null) {
            throw new NullPointerException("level");
        }

        logger = ONLoggerFactory.getInstance(getClass());
        this.level = level;
        onLogLevel = level.toONLevel();
    }

    public LoggingHandler(Class<?> clazz) {
        this(clazz, DEFAULT_LEVEL);
    }

    public LoggingHandler(Class<?> clazz, LogLevel level) {
        if (clazz == null) {
            throw new NullPointerException("clazz");
        }
        if (level == null) {
            throw new NullPointerException("level");
        }
        logger = ONLoggerFactory.getInstance(clazz);
        this.level = level;
        onLogLevel = level.toONLevel();
    }

    public LoggingHandler(String name) {
        this(name, DEFAULT_LEVEL);
    }

    public LoggingHandler(String name, LogLevel level) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        if (level == null) {
            throw new NullPointerException("level");
        }
        logger = ONLoggerFactory.getInstance(name);
        this.level = level;
        onLogLevel = level.toONLevel();
    }

    public LogLevel level() {
        return level;
    }

    protected String format(ChannelHandlerContext ctx, String message) {
//        String chStr = ctx.channel().toString();
//        return new StringBuilder(chStr.length() + message.length() + 1)
//                .append(chStr)
//                .append(' ')
//                .append(message)
//                .toString();
        return null;
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx)
            throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "REGISTERED"));
        }
        super.channelRegistered(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx)
            throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "UNREGISTERED"));
        }
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx)
            throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "ACTIVE"));
        }
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx)
            throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "INACTIVE"));
        }
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,
                                Throwable cause) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "EXCEPTION: " + cause), cause);
        }
        super.exceptionCaught(ctx, cause);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx,
                                   Object evt) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "USER_EVENT: " + evt));
        }
        super.userEventTriggered(ctx, evt);
    }

    @Override
    public void bind(ChannelHandlerContext ctx, SocketAddress localAddress) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "BIND(" + localAddress + ')'));
        }
        super.bind(ctx, localAddress);
    }

    @Override
    public void connect(ChannelHandlerContext ctx,
                        SocketAddress remoteAddress, SocketAddress localAddress) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "CONNECT(" + remoteAddress + ", " + localAddress + ')'));
        }
        super.connect(ctx, remoteAddress, localAddress);
    }

    @Override
    public void disconnect(ChannelHandlerContext ctx) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "DISCONNECT()"));
        }
        super.disconnect(ctx);
    }

    @Override
    public void close(ChannelHandlerContext ctx) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "CLOSE()"));
        }
        super.close(ctx);
    }

    @Override
    public void deregister(ChannelHandlerContext ctx) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "DEREGISTER()"));
        }
        super.deregister(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        logMessage(ctx, "RECEIVED", msg);
//        ctx.fireChannelRead(msg);
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg) throws Exception {
        logMessage(ctx, "WRITE", msg);
//        ctx.write(msg);
    }

    @Override
    public void flush(ChannelHandlerContext ctx) throws Exception {
        if (logger.isEnabled(onLogLevel)) {
            logger.log(onLogLevel, format(ctx, "FLUSH"));
        }
//        ctx.flush();
    }

    private void logMessage(ChannelHandlerContext ctx, String eventName, Object msg) {
        if (logger.isEnabled(onLogLevel)) {
//            logger.log(onLogLevel, format(ctx, formatMessage(eventName, msg)));
        }
    }

//    protected String formatMessage(String eventName, Object msg) {
//        if (msg instanceof ByteBuf) {
//            return formatByteBuf(eventName, (ByteBuf) msg);
//        } else if (msg instanceof ByteBufHolder) {
//            return formatByteBufHolder(eventName, (ByteBufHolder) msg);
//        } else {
//            return formatNonByteBuf(eventName, msg);
//        }
//    }
//
//    /**
//     * Returns a String which contains all details to log the {@link ByteBuf}
//     */
//    protected String formatByteBuf(String eventName, ByteBuf msg) {
//        int length = msg.readableBytes();
//        if (length == 0) {
//            StringBuilder buf = new StringBuilder(eventName.length() + 4);
//            buf.append(eventName).append(": 0B");
//            return buf.toString();
//        } else {
//            int rows = length / 16 + (length % 15 == 0? 0 : 1) + 4;
//            StringBuilder buf = new StringBuilder(eventName.length() + 2 + 10 + 1 + 2 + rows * 80);
//
//            buf.append(eventName).append(": ").append(length).append('B').append(NEWLINE);
//            appendPrettyHexDump(buf, msg);
//
//            return buf.toString();
//        }
//    }
//
//    /**
//     * Returns a String which contains all details to log the {@link Object}
//     */
//    protected String formatNonByteBuf(String eventName, Object msg) {
//        return eventName + ": " + msg;
//    }
//
//    /**
//     * Returns a String which contains all details to log the {@link ByteBufHolder}.
//     *
//     * By default this method just delegates to {@link #formatByteBuf(String, ByteBuf)},
//     * using the content of the {@link ByteBufHolder}. Sub-classes may override this.
//     */
//    protected String formatByteBufHolder(String eventName, ByteBufHolder msg) {
//        String msgStr = msg.toString();
//        ByteBuf content = msg.content();
//        int length = content.readableBytes();
//        if (length == 0) {
//            StringBuilder buf = new StringBuilder(eventName.length() + 2 + msgStr.length() + 4);
//            buf.append(eventName).append(", ").append(msgStr).append(", 0B");
//            return buf.toString();
//        } else {
//            int rows = length / 16 + (length % 15 == 0? 0 : 1) + 4;
//            StringBuilder buf = new StringBuilder(
//                    eventName.length() + 2 + msgStr.length() + 2 + 10 + 1 + 2 + rows * 80);
//
//            buf.append(eventName).append(": ")
//                    .append(msgStr).append(", ").append(length).append('B').append(NEWLINE);
//            appendPrettyHexDump(buf, content);
//
//            return buf.toString();
//        }
//    }
}
