package cn.jesse.omeganet.util.concurrent;

/**
 * Created by jesse on 8/6/16.
 */
public interface EventExecutor extends EventExecutorGroup{
    @Override
    EventExecutor next();

    EventExecutorGroup parent();

    boolean inEventLoop();

    boolean inEventLoop(Thread thread);

    <V> Future<V> newSucceededFuture(V result);

    <V> Future<V> newFailedFuture(Throwable cause);
}
