package com.ssc.ssgm.fx.ifx.integration.core.parser;

public enum ParserEnum {

    JSON,
    XML,
    KEY_VALUE;

    public static Parser getParser(String type) {

        switch (ParserEnum.valueOf(type)) {
            case XML:
                return new XMlParser();
            case JSON:
                return new JSONParser();
            default:
                return new KeyValueParser();
        }
    }

}
