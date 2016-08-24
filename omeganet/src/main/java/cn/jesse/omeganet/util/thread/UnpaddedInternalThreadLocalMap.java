package cn.jesse.omeganet.util.thread;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import cn.jesse.omeganet.util.internal.IntegerHolder;
import cn.jesse.omeganet.util.internal.TypeParameterMatcher;

/**
 * Created by jesse on 8/24/16.
 */
public class UnpaddedInternalThreadLocalMap {
    static final ThreadLocal<InternalThreadLocalMap> slowThreadLocalMap = new ThreadLocal<>();
    static final AtomicInteger nextIndex = new AtomicInteger();

    Object[] indexedVariables;

    // Core thread-locals
    int futureListenerStackDepth;
    int localChannelReaderStackDepth;
    Map<Class<?>, Boolean> handlerSharableCache;
    IntegerHolder counterHashCode;
    ThreadLocalRandom random;
    Map<Class<?>, TypeParameterMatcher> typeParameterMatcherGetCache;
    Map<Class<?>, Map<String, TypeParameterMatcher>> typeParameterMatcherFindCache;

    // String-related thread-locals
    StringBuilder stringBuilder;
    Map<Charset, CharsetEncoder> charsetEncoderCache;
    Map<Charset, CharsetDecoder> charsetDecoderCache;

    // ArrayList-related thread-locals
    ArrayList<Object> arrayList;

    UnpaddedInternalThreadLocalMap(Object[] indexedVariables) {
        this.indexedVariables = indexedVariables;
    }
}
