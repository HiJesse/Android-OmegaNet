package cn.jesse.omeganet.channel.socket;

/**
 * Created by jesse on 8/6/16.
 */
public class SocketChannel implements DuplexChannel {
    @Override
    public boolean isInputShutdown() {
        return false;
    }

    @Override
    public boolean isOutputShutdown() {
        return false;
    }
}
