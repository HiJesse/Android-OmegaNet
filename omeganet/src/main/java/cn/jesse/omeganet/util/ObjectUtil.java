package cn.jesse.omeganet.util;

/**
 * Created by jesse on 8/4/16.
 */
public final class ObjectUtil {

    private ObjectUtil() {
    }

    public static <T> T checkNotNull(T arg, String text) {
        if (arg == null) {
            throw new NullPointerException(text);
        }
        return arg;
    }
}
