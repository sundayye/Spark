package com.ssc.ssgm.fx.ifx.integration.util;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Slf4j
public class VelocityUtil {

    public static VelocityEngine ve = new VelocityEngine();

    public static    String templateFilePath = "";

    static {
        try {
            String temp=ResourceUtils.getURL("classpath:").getPath();
            String classPath=temp.substring(1,temp.length()).replace("/",File.separator);
            templateFilePath = classPath  + "templates";
        } catch (FileNotFoundException e) {
            log.error("FileNotFoundException::",e);
        }
    }

    static {
        Properties p = new Properties();
        p.setProperty("file.resource.loader.path", templateFilePath);
        Velocity.init(p);
    }

    public static void  geneTemplateFile(String data,String fileName){

        File  templateFile=new File(templateFilePath + File.separatorChar+fileName+".vm");

        try {
            FileUtils.writeStringToFile(templateFile,data,"UTF-8");
        } catch (IOException e) {
            log.error("IOException::",e);
        }
    }

    public static String generator(String fileName, Map<String, Object> data) {

        VelocityEngine ve = new VelocityEngine();

        final ResourceLoader resourceLoader = new DefaultResourceLoader();

        Properties p = new Properties();
        //p.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, templateFilePath+File.separator);
        p.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH,"src/main/templates/");
        Velocity.init(p);


        //Template t = ve.getTemplate(templateFilePath+File.separator+fileName+".vm");
        Template t = ve.getTemplate(fileName+".vm");
        VelocityContext vc = new VelocityContext();

        data.entrySet().forEach(e -> {
            vc.put(e.getKey(), e.getValue());
        });

        StringWriter sw = new StringWriter();
        t.merge(vc, sw);
        return sw.getBuffer().toString();

    }

    @Deprecated
    public static StringWriter generator2(String fileName, Map<String, Object> data) {

        Template template = null;
        StringWriter writer = new StringWriter();

        VelocityContext context = new VelocityContext();
        try {
            context.put("customer", null);
            template = Velocity.getTemplate(templateFilePath + File.separatorChar+fileName+".vm");
            template.merge(context, writer);
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        return writer;
    }



    public static void main(String[] args) {
        String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>  \n" +
                "<note>  \n" +
                "  <to>Tove</to>  \n" +
                "  <from>Jani</from>  \n" +
                "  <heading>Reminder</heading>  \n" +
                "  <body>$Message</body>  \n" +
                "</note>  ";
        VelocityUtil.geneTemplateFile(text,"test");
        final val map = new HashMap<String,Object>();
        map.put("message", "hello world!");
        final val format = VelocityUtil.generator("test", map);
        System.out.println(format);

    }

}
