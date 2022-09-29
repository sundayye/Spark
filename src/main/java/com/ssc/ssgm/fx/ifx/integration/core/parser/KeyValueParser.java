package com.ssc.ssgm.fx.ifx.integration.core.parser;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;

@Slf4j
public class KeyValueParser implements Parser<Map<String, Object>> {

    @Override
    public List<Map<String, Object>> parse(byte[] input) {
        ObjectInputStream out = null;
        try {
            out = new ObjectInputStream(new ByteArrayInputStream(input));
            final Object object = out.readObject();
            return (List<Map<String, Object>>) object;
        } catch (IOException | ClassNotFoundException e) {
            log.error("Exception::", e);
        }
        return null;
    }
}
