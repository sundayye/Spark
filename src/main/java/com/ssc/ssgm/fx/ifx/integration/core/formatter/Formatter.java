package com.ssc.ssgm.fx.ifx.integration.core.formatter;

import com.ssc.ssgm.fx.ifx.integration.core.config.FormatterConfig;

import java.util.Map;

public interface Formatter<T> {

    T format(Map<String, Object> input);

    FormatterEnum getFormatType();

    static Formatter build(FormatterConfig formatterConfig) {

        switch (formatterConfig.getFormatterType()) {
            case JSON:
                return new JSONFormatter(formatterConfig);
            case JDBC:
                return new JDBCFormatter(formatterConfig);
            case CSV:
                return new CSVFormatter(formatterConfig);
            default:
                return new XMLFormatter(formatterConfig);
        }

    }

    ;

}
