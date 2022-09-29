package com.ssc.ssgm.fx.ifx.integration.core.mapper;

import com.ssc.ssgm.fx.ifx.integration.core.config.KeyMapperConfig;
import com.ssc.ssgm.fx.ifx.integration.util.KeyValueConfigLoadUtil;
import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultKeyMapper implements KeyMapper {

    KeyMapperConfig config;

    Map<String, String> keyValueConfig;

    public DefaultKeyMapper(KeyMapperConfig keyMapperConfig) {

        this.config = keyMapperConfig;

        val properties = KeyValueConfigLoadUtil.loadConfig(config.getProperties());

        keyValueConfig = new HashMap<>();
        keyValueConfig.putAll(properties);

    }

    void init() {
        Map<String, String> keyValueConfig = KeyValueConfigLoadUtil.loadConfig(config.getProperties());
    }

    @Override
    public Map<String, Object> keyMap(Map<String, Object> input) {

        if (keyValueConfig.isEmpty()) {
            return input;
        }
        Map<String, Object> newMap = new HashMap<>();
        input.entrySet().forEach(e -> {
            String targetKey = keyValueConfig.get(e.getKey());
            if (targetKey == null) {
                newMap.put(e.getKey(), e.getValue());
            }else{
                newMap.put(targetKey, e.getValue());
            }
        });
        return newMap;
    }

    @Override
    public List<String> getSrcKeys() {
        return new ArrayList<>(keyValueConfig.keySet());
    }

}
