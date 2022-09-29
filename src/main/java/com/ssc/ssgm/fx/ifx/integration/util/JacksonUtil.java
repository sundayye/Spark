
package com.ssc.ssgm.fx.ifx.integration.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.ssc.ssgm.fx.ifx.integration.common.exception.JsonFormatException;

import java.util.List;


public class JacksonUtil {

    private JacksonUtil() {
        throw new IllegalStateException("JacksonUtil class");
    }

    public static String object2jackson(Object target) throws JsonFormatException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(target);
        } catch (Exception e) {
            throw new JsonFormatException(String.format("cannot support to convert from {%s} to String", target), e);
        }
    }

    public static <T> T jackson2Object(String source, Class<T> clazz) throws JsonFormatException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            /**
             * ignore UNKNOWN_PROPERTIES
             */
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            return objectMapper.readValue(source, clazz);
        } catch (Exception e) {
            throw new JsonFormatException(String.format("{%s} cannot support to convert from String to Object", source), e);
        }
    }

    public static <T> List<T> jackson2ListObject(String source, Class<T> clazz) throws JsonFormatException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            TypeFactory typeFactory = objectMapper.getTypeFactory();
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return objectMapper.readValue(source, typeFactory.constructCollectionType(List.class, clazz));
        } catch (Exception e) {
            throw new JsonFormatException(String.format("{%s} cannot support to convert from String to List Object", source),
                    e);
        }
    }
}
