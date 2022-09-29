package com.ssc.ssgm.fx.ifx.integration.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.val;

import java.util.Map;

public class JsonUtil {

    //2. Using GsonBuilder
    static Gson gson = new GsonBuilder()
            .disableHtmlEscaping()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .serializeNulls()
            .create();


    public static Map<String, Object> formJson(String json) {
        final val map = gson.fromJson(json, Map.class);
        return map;
    }

    public static String byteToJson(byte[] bytes) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        @SuppressWarnings("unchecked")
        Map<String, Object> config = objectMapper.readValue(bytes, Map.class);
        ObjectMapper Obj = new ObjectMapper();
        String jasonStr = Obj.writeValueAsString(config);
        return  jasonStr;
    }


    public static void main(String[] args) {

        String test = "{'id':1,'firstName':'Lokesh','lastName':'Gupta'," +
                "'roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}";

        final val stringObjectMap = JsonUtil.formJson(test);

        System.out.println(stringObjectMap);


    }

}
