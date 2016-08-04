package cn.jesse.omeganet.channel;

/**
 * Created by jesse on 8/4/16.
 */
public class ChannelException extends RuntimeException {

    public ChannelException() {
    }

    public ChannelException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChannelException(String message) {
        super(message);
    }

    public ChannelException(Throwable cause) {
        super(cause);
    }
}
