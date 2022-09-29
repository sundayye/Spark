package com.ssc.ssgm.fx.ifx.integration.core.outbound;

import com.ssc.ssgm.fx.ifx.integration.common.exception.SystemException;
import com.ssc.ssgm.fx.ifx.integration.core.config.OutboundConfig;

import java.io.Closeable;
import java.util.List;

public interface OutBound<T> extends Closeable {

    void put(T format);

    void close();

    void putWithTransAction(Object format);

    void rollback();

    void commit();

    default  boolean backup(List<T> dataList){
        throw new SystemException("Non-Implement");
    }

    static OutBound build(OutboundConfig outboundConfig) {
        switch (outboundConfig.getOutboundType()) {
            case KAFKA:
                return new KafkaOutbound(outboundConfig);
            case ACTIVEMQ:
                return new ActiveMQOutbound(outboundConfig);
            case REST:
                return new RestOutbound(outboundConfig);
            default:
                return new JDBCOutbound(outboundConfig);
        }
    }
}
