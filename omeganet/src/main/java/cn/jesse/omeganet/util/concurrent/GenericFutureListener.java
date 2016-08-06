package cn.jesse.omeganet.util.concurrent;

import java.util.EventListener;

/**
 * Created by jesse on 8/6/16.
 */
public interface GenericFutureListener<F extends Future<?>> extends EventListener {

    void operationComplete(F future) throws Exception;
}
