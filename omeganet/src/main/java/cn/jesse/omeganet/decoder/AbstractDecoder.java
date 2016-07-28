package cn.jesse.omeganet.decoder;

import java.util.List;

/**
 * Created by jesse on 7/28/16.
 */
public abstract class AbstractDecoder<T> {
    public abstract void decode(T source, List<Object> out);
}
