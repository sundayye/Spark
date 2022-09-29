package com.ssc.ssgm.fx.ifx.integration.curd.model;

import java.util.Date;

/**
 * Table: FORMATTER_CONFIG
 */
public class FormatterConfigEntity {
    /**
     * Column: NAME
     * Type: VARCHAR2(100)
     */
    private String name;

    /**
     * Column: CREATED_TIME
     * Type: TIMESTAMP(6)
     */
    private Date createdTime;

    /**
     * Column: FORMATTER_TYPE
     * Type: VARCHAR2(100)
     */
    private String formatterType;

    /**
     * Column: ID
     * Type: LONG
     */
    private String id;

    /**
     * Column: TEMPLATE
     * Type: CLOB
     */
    private String template;

    /**
     * Column: PROPERTIES
     * Type: CLOB
     */
    private String properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getFormatterType() {
        return formatterType;
    }

    public void setFormatterType(String formatterType) {
        this.formatterType = formatterType == null ? null : formatterType.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }
}