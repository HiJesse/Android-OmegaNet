package cn.jesse.omeganet.util.thread;

/**
 * Created by jesse on 16-8-17.
 */
public interface ThreadFactory {
    Thread newThread(Runnable r);
}
