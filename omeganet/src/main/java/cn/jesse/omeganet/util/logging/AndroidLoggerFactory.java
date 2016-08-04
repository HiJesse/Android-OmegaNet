package cn.jesse.omeganet.util.logging;

/**
 * Created by jesse on 8/4/16.
 */
public class AndroidLoggerFactory extends ONLoggerFactory {

    @Override
    protected ONLogger newInstance(String name) {
        return new AndroidLogger(name);
    }
}
