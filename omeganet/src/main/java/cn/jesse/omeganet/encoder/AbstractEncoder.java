package cn.jesse.omeganet.encoder;

import java.util.List;

/**
 * Created by jesse on 7/28/16.
 */
public abstract class AbstractEncoder<T> {
    public abstract void encode(T source, List<Object> out);
}
