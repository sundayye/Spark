package com.ssc.ssgm.fx.ifx.integration.core.config;

import com.ssc.ssgm.fx.ifx.integration.core.mapper.KeyMapperEnum;
import lombok.Data;

import java.util.Date;

@Data
public class KeyMapperConfig extends BaseConfig{


    String properties;//Key-value text

    KeyMapperEnum keyMapperType;

    class Mapper {
        String id;
        String srcKey;
        String targetKey;
        Object defaultValue;
    }

}
