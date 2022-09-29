package com.ssc.ssgm.fx.ifx.integration.curd.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: OUTBOUND_CONFIG
 */
@Data
public class OutboundConfigEntity {
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
     * Column: outbound_type
     * Type: VARCHAR2(100)
     */
    private String outboundType;

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