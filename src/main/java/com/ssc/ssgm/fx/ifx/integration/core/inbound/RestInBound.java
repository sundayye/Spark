package com.ssc.ssgm.fx.ifx.integration.core.inbound;

import com.ssc.ssgm.fx.ifx.integration.core.config.InboundConfig;

public class RestInBound implements Inbound {

    public RestInBound(InboundConfig inboundConfig) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public byte[] next() {
        return new byte[0];
    }

    @Override
    public byte[] get() {
        return null;
    }

    @Override
    public byte[] getWithTransaction() {
        return new byte[0];
    }

    @Override
    public void rollback() {

    }

    @Override
    public void commit() {

    }

    @Override
    public void close() {

    }
}
