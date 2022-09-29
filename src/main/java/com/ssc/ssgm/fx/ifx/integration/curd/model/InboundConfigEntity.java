package com.ssc.ssgm.fx.ifx.integration.curd.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: INBOUND_CONFIG
 */
@Data
public class InboundConfigEntity {
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
     * Column: inbound_type
     * Type: VARCHAR2(100)
     */
    private String inboundType;

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