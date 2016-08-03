package cn.jesse.omeganet;

import cn.jesse.omeganet.decoder.AbstractDecoder;

/**
 * Created by jesse on 7/28/16.
 */
public abstract class AbstractOmegaNetClient {
    public abstract AbstractOmegaNetClient newClient();
    public abstract AbstractOmegaNetClient encoder(AbstractDecoder encoder);
    public abstract AbstractOmegaNetClient decoder(AbstractDecoder decoder);
}
