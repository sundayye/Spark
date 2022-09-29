package com.ssc.ssgm.fx.ifx.integration.core.formatter;

import com.ssc.ssgm.fx.ifx.integration.core.config.FormatterConfig;

public class JDBCFormatter extends  AbstractFormatter<String> implements Formatter<String>{

    public JDBCFormatter(FormatterConfig formatterConfig) {
        this.formatterConfig=formatterConfig;
    }

    @Override
    public FormatterEnum getFormatType() {
        return FormatterEnum.JDBC;
    }

    public String insert(){

        return null;
    }

    public String update(){

        return null;
    }

    public String  delete(){

        return null;
    }

}
