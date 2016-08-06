package cn.jesse.omeganet.util.concurrent;

import java.util.Iterator;

/**
 * Created by jesse on 8/6/16.
 */
public interface Iterable<T> {

    /**
     * Returns an {@link Iterator} for the elements in this object.
     *
     * @return An {@code Iterator} instance.
     */
    Iterator<T> iterator();
}
