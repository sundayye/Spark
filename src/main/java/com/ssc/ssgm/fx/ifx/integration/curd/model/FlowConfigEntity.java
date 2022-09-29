package com.ssc.ssgm.fx.ifx.integration.curd.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Table: FLOW_CONFIG
 */
@Data
public class FlowConfigEntity {
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
     * Column: INBOUND_CONFIG_ID
     * Type: NUMBER
     */
    private String inboundConfigId;

    /**
     * Column: PARSER_TYPE
     * Type: VARCHAR2(100)
     */
    private String parserType;

    /**
     * Column: KEY_MAPPER_ID
     * Type: NUMBER
     */
    private String keyMapperId;

    /**
     * Column: FORMATTER_ID
     * Type: NUMBER
     */
    private String formatterId;

    /**
     * Column: OUTBOUND_CONFIG_ID
     * Type: NUMBER
     */
    private String outboundConfigId;

    /**
     * Column: TRANSACTION_TYPE
     * Type: VARCHAR2(100)
     */
    private String transactionType;

    /**
     * Column: FLOW_STATUS
     * Type: VARCHAR2(100)
     */
    private String flowStatus;

    /**
     * Column: FLOW_TYPE
     * Type: VARCHAR2(100)
     */
    private String flowType;

    /**
     * Column: ID
     * Type: LONG
     */
    private String id;
}