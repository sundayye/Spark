package com.ssc.ssgm.fx.ifx.integration.core.formatter;

import com.ssc.ssgm.fx.ifx.integration.core.config.FormatterConfig;

public class JSONFormatter extends AbstractFormatter<String> implements Formatter<String> {

    public JSONFormatter(FormatterConfig formatterConfig) {
        this.formatterConfig=formatterConfig;
    }

    @Override
    public FormatterEnum getFormatType() {
        return FormatterEnum.JSON;
    }

}
