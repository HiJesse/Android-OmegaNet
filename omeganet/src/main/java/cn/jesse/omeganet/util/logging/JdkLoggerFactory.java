package cn.jesse.omeganet.util.logging;

import java.util.logging.Logger;

/**
 * Created by jesse on 8/4/16.
 */
public class JdkLoggerFactory extends ONLoggerFactory {
    @Override
    protected ONLogger newInstance(String name) {
        return new JdkLogger(Logger.getLogger(name));
    }
}
