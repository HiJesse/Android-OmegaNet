package cn.jesse.omeganet.handler.logging;

import cn.jesse.omeganet.util.logging.ONLogLevel;

/**
 * Created by jesse on 8/5/16.
 */
public enum LogLevel {
    TRACE(ONLogLevel.TRACE),
    DEBUG(ONLogLevel.DEBUG),
    INFO(ONLogLevel.INFO),
    WARN(ONLogLevel.WARN),
    ERROR(ONLogLevel.ERROR);

    private final ONLogLevel onLogLevel;

    LogLevel(ONLogLevel onLogLevel) {
        this.onLogLevel = onLogLevel;
    }

    ONLogLevel toONLevel() {
        return onLogLevel;
    }
}
