package cn.jesse.omeganet.util.internal;

/**
 * Created by jesse on 8/24/16.
 */
public final class NoOpTypeParameterMatcher extends TypeParameterMatcher {
    @Override
    public boolean match(Object msg) {
        return true;
    }
}
