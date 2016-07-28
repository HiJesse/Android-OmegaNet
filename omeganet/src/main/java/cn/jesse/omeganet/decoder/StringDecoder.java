package cn.jesse.omeganet.decoder;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by jesse on 7/28/16.
 */
public class StringDecoder extends AbstractDecoder<ByteBuffer> {
    private final Charset charset;

    public StringDecoder() {
        this(Charset.defaultCharset());
    }

    public StringDecoder(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.charset = charset;
    }

    @Override
    public void decode(ByteBuffer source, List<Object> out) {
        out.add(charset.decode(source).toString());
    }
}
