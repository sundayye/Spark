package com.ssc.ssgm.fx.ifx.integration.core.config;

import com.ssc.ssgm.fx.ifx.integration.core.formatter.FormatterEnum;
import lombok.Data;

import java.util.Date;

@Data
public class FormatterConfig extends BaseConfig{


    String template;
    String properties;

    FormatterEnum formatterType;

}
