package com.ssc.ssgm.fx.ifx.integration.core.formatter;

import com.ssc.ssgm.fx.ifx.integration.common.exception.SystemException;
import com.ssc.ssgm.fx.ifx.integration.core.config.FormatterConfig;
import com.ssc.ssgm.fx.ifx.integration.util.FreeMarkerUtil;
import lombok.Data;

import java.util.Map;

@Data
public abstract class AbstractFormatter<T> implements Formatter<String> {

    FormatterConfig formatterConfig;

    @Override
    public String format(Map<String, Object> input) {

        String fileName = formatterConfig.getId() + "_" + formatterConfig.getName();
        FreeMarkerUtil.geneTemplateFile(formatterConfig.getTemplate(), fileName);
        String generator = FreeMarkerUtil.generator(fileName, input);

        if (generator == null) {
            throw new SystemException("formate error,generator null value");
        }
        return generator;
    }


}
