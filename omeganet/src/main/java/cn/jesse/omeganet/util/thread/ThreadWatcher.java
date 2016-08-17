package cn.jesse.omeganet.util.thread;

import java.util.concurrent.atomic.AtomicBoolean;

import cn.jesse.omeganet.util.logging.ONLogger;
import cn.jesse.omeganet.util.logging.ONLoggerFactory;

/**
 * Created by jesse on 16-8-17.
 */
public final class ThreadWatcher {
    private static final ONLogger logger = ONLoggerFactory.getInstance(ThreadWatcher.class);
    static final ThreadFactory threadFactory = null;

    private static final AtomicBoolean started = new AtomicBoolean();
    private static volatile Thread watcherThread;
}
