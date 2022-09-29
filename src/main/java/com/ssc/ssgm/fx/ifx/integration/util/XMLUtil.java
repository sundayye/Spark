package com.ssc.ssgm.fx.ifx.integration.util;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.io.IOException;
import java.util.Map;

@Slf4j
public class XMLUtil {

    public static Map<String, Object> parseForm(String xml) {

        XmlMapper xmlMapper = new XmlMapper();

        try {
            final val map = xmlMapper.readValue(xml, Map.class);
            return map;
        } catch (IOException e) {
            log.error("IOException::", e);
        }
        return null;
    }

    ;

    static String test = "<Person>\n" +
            "    <firstName>Rohan</firstName>\n" +
            "    <lastName>Daye</lastName>\n" +
            "    <phoneNumbers>\n" +
            "        <phoneNumbers>9911034731</phoneNumbers>\n" +
            "        <phoneNumbers>9911033478</phoneNumbers>\n" +
            "    </phoneNumbers>\n" +
            "    <address>\n" +
            "        <streetName>Name1</streetName>\n" +
            "        <city>City1</city>\n" +
            "    </address>\n" +
            "    <address>\n" +
            "        <streetName>Name2</streetName>\n" +
            "        <city>City2</city>\n" +
            "    </address>\n" +
            "</Person>";

    public static void main(String[] args) {
        final val stringObjectMap = XMLUtil.parseForm(test);
        System.out.println(stringObjectMap);
    }

}
