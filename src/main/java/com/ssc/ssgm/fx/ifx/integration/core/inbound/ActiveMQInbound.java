package com.ssc.ssgm.fx.ifx.integration.core.inbound;

import com.ssc.ssgm.fx.ifx.integration.core.config.InboundConfig;
import com.ssc.ssgm.fx.ifx.integration.util.KeyValueConfigLoadUtil;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;


@Slf4j
public class ActiveMQInbound implements Inbound {

    final AtomicBoolean stopFlag = new AtomicBoolean(false);

    BlockingQueue<List<Map<String, Object>>> dataQueue = new ArrayBlockingQueue(1);

    InboundConfig inboundConfig;

    public ActiveMQInbound(InboundConfig inboundConfig) {
        this.inboundConfig = inboundConfig;
        final val config = inboundConfig.getProperties();
        final val properties = KeyValueConfigLoadUtil.loadConfig(inboundConfig.getProperties());

        //TODO init active mq connection

    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public byte[] next() {
        if (stopFlag.get()) {
            return null;
        }
        List<Map<String, Object>> take = null;
        try {
            take = dataQueue.take();
        } catch (InterruptedException e) {
            log.error("InterruptedException::", e);
        }

        if (take == null || take.isEmpty()) {
            this.get();
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(take);
        } catch (IOException e) {
            log.error("IOException::", e);
        }
        return bos.toByteArray();
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
        this.stopFlag.set(true);
    }
}
