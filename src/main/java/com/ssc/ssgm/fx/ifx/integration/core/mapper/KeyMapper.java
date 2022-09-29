package com.ssc.ssgm.fx.ifx.integration.core.mapper;

import com.ssc.ssgm.fx.ifx.integration.core.config.KeyMapperConfig;

import java.util.List;
import java.util.Map;

public interface KeyMapper {

    Map<String, Object> keyMap(Map<String, Object> input);

    List<String> getSrcKeys();

    static KeyMapper build(KeyMapperConfig keyMapperConfig) {

        switch (keyMapperConfig.getKeyMapperType()) {
            default:
                return new DefaultKeyMapper(keyMapperConfig);
        }

    }

}
