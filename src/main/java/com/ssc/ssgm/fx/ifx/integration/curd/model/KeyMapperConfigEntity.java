package com.ssc.ssgm.fx.ifx.integration.curd.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: KEY_MAPPER_CONFIG
 */
@Data
public class KeyMapperConfigEntity {
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
     * Column: KEY_MAPPER_TYPE
     * Type: VARCHAR2(100)
     */
    private String keyMapperType;

    /**
     * Column: ID
     * Type: LONG
     */
    private String id;

    /**
     * Column: PROPERTIES
     * Type: CLOB
     */
    private String properties;
}