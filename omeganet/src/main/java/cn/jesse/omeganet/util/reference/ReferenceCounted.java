package cn.jesse.omeganet.util.reference;

/**
 * Created by jesse on 16-8-16.
 */
public interface ReferenceCounted {
    int refCnt();

    ReferenceCounted retain();

    ReferenceCounted retain(int increment);

    boolean release();

    boolean release(int decrement);
}
