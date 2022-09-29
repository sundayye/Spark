package com.ssc.ssgm.fx.ifx.integration.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FreeMarkerUtil {

    static Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);

    static String templateFilePath = "";

    static {
        try {
            String temp = ResourceUtils.getURL("classpath:").getPath();
            String classPath = temp.substring(1, temp.length()).replace("/", File.separator);
            templateFilePath = classPath + "templates";
        } catch (FileNotFoundException e) {
            log.error("FileNotFoundException::", e);
        }
    }

    static {
        try {
            cfg.setDirectoryForTemplateLoading(new File(templateFilePath));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        } catch (IOException e) {
            log.error("IOException::", e);
        }
    }

    public static void geneTemplateFile(String data, String fileName) {
        File templateFile = new File(templateFilePath + File.separatorChar + fileName + ".ftl");
        if (templateFile.exists()) {
            return;
        }
        try {
            FileUtils.writeStringToFile(templateFile, data, "UTF-8");
        } catch (IOException e) {
            log.error("IOException::", e);
        }
    }

    public static String generator(String fileName, Map<String, Object> data) {
        try (StringWriter out = new StringWriter()) {
            Template template = cfg.getTemplate(fileName + ".ftl");
            Map<String, Object> templateData = new HashMap<>();
            data.entrySet().forEach(e -> {
                templateData.put(e.getKey(), e.getValue());
            });
            template.process(templateData, out);
            return out.getBuffer().toString();
        } catch (TemplateException e) {
            log.error("TemplateException::", e);
        } catch (IOException e) {
            log.error("IOException::", e);
        }
        return null;
    }


    public static void main(String[] args) {
        String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>  \n" +
                "<note>  \n" +
                "  <to>Tove</to>  \n" +
                "  <from>Jani</from>  \n" +
                "  <heading>Reminder</heading>  \n" +
                "  <body>${message}</body>  \n" +
                "</note>  ";
        FreeMarkerUtil.geneTemplateFile(text, "test");
        final val map = new HashMap<String, Object>();
        map.put("message", "hello world!");
        final val format = FreeMarkerUtil.generator("test", map);
        System.out.println(format);

        FreeMarkerUtil.geneTemplateFile(text, "test2");
        final val format2 = FreeMarkerUtil.generator("test2", map);
        System.out.println(format2);

    }

}
