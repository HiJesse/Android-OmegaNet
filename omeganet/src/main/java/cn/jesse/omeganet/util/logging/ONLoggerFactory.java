package cn.jesse.omeganet.util.logging;

/**
 * Created by jesse on 8/4/16.
 */
public abstract class ONLoggerFactory {
    private static volatile ONLoggerFactory defaultFactory =
            newDefaultFactory(ONLoggerFactory.class.getName());

    @SuppressWarnings("UnusedCatchParameter")
    private static ONLoggerFactory newDefaultFactory(String name) {
        ONLoggerFactory f;
        try {
            throw new Exception();
//            f = new AndroidLoggerFactory();
//            f.newInstance(name).debug("Using Android as the default logging framework");
        } catch (Throwable t1) {
            f = new JdkLoggerFactory();
            f.newInstance(name).debug("Using java.util.logging as the default logging framework");
        }
        return f;
    }

    public static ONLoggerFactory getDefaultFactory() {
        return defaultFactory;
    }

    /**
     * Changes the default factory.
     */
    public static void setDefaultFactory(ONLoggerFactory defaultFactory) {
        if (defaultFactory == null) {
            throw new NullPointerException("defaultFactory");
        }
        ONLoggerFactory.defaultFactory = defaultFactory;
    }

    /**
     * Creates a new logger instance with the name of the specified class.
     */
    public static ONLogger getInstance(Class<?> clazz) {
        return getInstance(clazz.getName());
    }

    /**
     * Creates a new logger instance with the specified name.
     */
    public static ONLogger getInstance(String name) {
        return getDefaultFactory().newInstance(name);
    }

    /**
     * Creates a new logger instance with the specified name.
     */
    protected abstract ONLogger newInstance(String name);
}
