package com.ssc.ssgm.fx.ifx.integration.core.parser;

import com.ssc.ssgm.fx.ifx.integration.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Slf4j
public class JSONParser implements Parser<Map<String, Object>> {

    @Override
    public List<Map<String, Object>> parse(byte[] input) {
        ArrayList<Map<String, Object>> maps = new ArrayList<>();
        if (input == null && input.length == 0) {
            return maps;
        }
        try {
            final Map<String, Object> map = JsonUtil.formJson(new String(input, "UTF-8"));
            maps.add(map);
        } catch (UnsupportedEncodingException e) {
            log.error("UnsupportedEncodingException::", e);
        }
        return maps;
    }

}
