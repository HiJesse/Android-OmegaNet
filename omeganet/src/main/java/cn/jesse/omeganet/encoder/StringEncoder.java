package cn.jesse.omeganet.encoder;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by jesse on 7/28/16.
 */
public class StringEncoder extends AbstractEncoder<CharSequence>{
    private final Charset charset;

    public StringEncoder() {
        this(Charset.defaultCharset());
    }

    public StringEncoder(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.charset = charset;
    }

    @Override
    public void encode(CharSequence source, List<Object> out) {
        if (source.length() == 0) {
            return;
        }
        out.add(charset.encode(CharBuffer.wrap(source)));
    }
}
