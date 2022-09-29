package com.ssc.ssgm.fx.ifx.integration.core.inbound;

import com.ssc.ssgm.fx.ifx.integration.common.exception.SystemException;
import com.ssc.ssgm.fx.ifx.integration.core.config.InboundConfig;

import java.io.Closeable;

public interface Inbound extends Closeable {

    /**
     * will blocked when no data
     *
     * @return
     */
    byte[] next();

    @Override
    void close();

    /**
     * will blocked when no data
     *
     * @return
     */
    @Deprecated
    boolean hasNext();

    /**
     * will blocked when no data
     *
     * @return
     */
    @Deprecated
    byte[] get();

    byte[] getWithTransaction();

    void rollback();

    void commit();

    default boolean backup(byte[] data) {
        throw new SystemException("Non-Implement");
    }

    static Inbound build(InboundConfig inboundConfig) {
        switch (inboundConfig.getInboundType()) {
            case KAFKA:
                return new KafkaInbound(inboundConfig);
            case ACTIVEMQ:
                return new ActiveMQInbound(inboundConfig);
            case REST:
                return new RestInBound(inboundConfig);
            default:
                return new JDBCInbound(inboundConfig);
        }
    }

}
