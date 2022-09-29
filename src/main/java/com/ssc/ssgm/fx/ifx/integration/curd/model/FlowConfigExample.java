package com.ssc.ssgm.fx.ifx.integration.curd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowConfigExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public FlowConfigExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNameIsNull() {
            addCriterion("`NAME` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`NAME` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`NAME` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`NAME` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`NAME` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`NAME` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`NAME` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`NAME` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`NAME` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`NAME` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`NAME` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`NAME` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`NAME` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdIsNull() {
            addCriterion("INBOUND_CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdIsNotNull() {
            addCriterion("INBOUND_CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdEqualTo(BigDecimal value) {
            addCriterion("INBOUND_CONFIG_ID =", value, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdNotEqualTo(BigDecimal value) {
            addCriterion("INBOUND_CONFIG_ID <>", value, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdGreaterThan(BigDecimal value) {
            addCriterion("INBOUND_CONFIG_ID >", value, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INBOUND_CONFIG_ID >=", value, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdLessThan(BigDecimal value) {
            addCriterion("INBOUND_CONFIG_ID <", value, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INBOUND_CONFIG_ID <=", value, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdIn(List<BigDecimal> values) {
            addCriterion("INBOUND_CONFIG_ID in", values, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdNotIn(List<BigDecimal> values) {
            addCriterion("INBOUND_CONFIG_ID not in", values, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INBOUND_CONFIG_ID between", value1, value2, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andInboundConfigIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INBOUND_CONFIG_ID not between", value1, value2, "inboundConfigId");
            return (Criteria) this;
        }

        public Criteria andParserTypeIsNull() {
            addCriterion("PARSER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParserTypeIsNotNull() {
            addCriterion("PARSER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParserTypeEqualTo(String value) {
            addCriterion("PARSER_TYPE =", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeNotEqualTo(String value) {
            addCriterion("PARSER_TYPE <>", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeGreaterThan(String value) {
            addCriterion("PARSER_TYPE >", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARSER_TYPE >=", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeLessThan(String value) {
            addCriterion("PARSER_TYPE <", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeLessThanOrEqualTo(String value) {
            addCriterion("PARSER_TYPE <=", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeLike(String value) {
            addCriterion("PARSER_TYPE like", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeNotLike(String value) {
            addCriterion("PARSER_TYPE not like", value, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeIn(List<String> values) {
            addCriterion("PARSER_TYPE in", values, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeNotIn(List<String> values) {
            addCriterion("PARSER_TYPE not in", values, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeBetween(String value1, String value2) {
            addCriterion("PARSER_TYPE between", value1, value2, "parserType");
            return (Criteria) this;
        }

        public Criteria andParserTypeNotBetween(String value1, String value2) {
            addCriterion("PARSER_TYPE not between", value1, value2, "parserType");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdIsNull() {
            addCriterion("KEY_MAPPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdIsNotNull() {
            addCriterion("KEY_MAPPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdEqualTo(BigDecimal value) {
            addCriterion("KEY_MAPPER_ID =", value, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdNotEqualTo(BigDecimal value) {
            addCriterion("KEY_MAPPER_ID <>", value, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdGreaterThan(BigDecimal value) {
            addCriterion("KEY_MAPPER_ID >", value, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KEY_MAPPER_ID >=", value, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdLessThan(BigDecimal value) {
            addCriterion("KEY_MAPPER_ID <", value, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KEY_MAPPER_ID <=", value, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdIn(List<BigDecimal> values) {
            addCriterion("KEY_MAPPER_ID in", values, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdNotIn(List<BigDecimal> values) {
            addCriterion("KEY_MAPPER_ID not in", values, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KEY_MAPPER_ID between", value1, value2, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andKeyMapperIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KEY_MAPPER_ID not between", value1, value2, "keyMapperId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdIsNull() {
            addCriterion("FORMATTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormatterIdIsNotNull() {
            addCriterion("FORMATTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatterIdEqualTo(BigDecimal value) {
            addCriterion("FORMATTER_ID =", value, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdNotEqualTo(BigDecimal value) {
            addCriterion("FORMATTER_ID <>", value, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdGreaterThan(BigDecimal value) {
            addCriterion("FORMATTER_ID >", value, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMATTER_ID >=", value, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdLessThan(BigDecimal value) {
            addCriterion("FORMATTER_ID <", value, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMATTER_ID <=", value, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdIn(List<BigDecimal> values) {
            addCriterion("FORMATTER_ID in", values, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdNotIn(List<BigDecimal> values) {
            addCriterion("FORMATTER_ID not in", values, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMATTER_ID between", value1, value2, "formatterId");
            return (Criteria) this;
        }

        public Criteria andFormatterIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMATTER_ID not between", value1, value2, "formatterId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdIsNull() {
            addCriterion("OUTBOUND_CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdIsNotNull() {
            addCriterion("OUTBOUND_CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdEqualTo(BigDecimal value) {
            addCriterion("OUTBOUND_CONFIG_ID =", value, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdNotEqualTo(BigDecimal value) {
            addCriterion("OUTBOUND_CONFIG_ID <>", value, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdGreaterThan(BigDecimal value) {
            addCriterion("OUTBOUND_CONFIG_ID >", value, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTBOUND_CONFIG_ID >=", value, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdLessThan(BigDecimal value) {
            addCriterion("OUTBOUND_CONFIG_ID <", value, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTBOUND_CONFIG_ID <=", value, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdIn(List<BigDecimal> values) {
            addCriterion("OUTBOUND_CONFIG_ID in", values, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdNotIn(List<BigDecimal> values) {
            addCriterion("OUTBOUND_CONFIG_ID not in", values, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTBOUND_CONFIG_ID between", value1, value2, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andOutboundConfigIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTBOUND_CONFIG_ID not between", value1, value2, "outboundConfigId");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNull() {
            addCriterion("TRANSACTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("TRANSACTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(String value) {
            addCriterion("TRANSACTION_TYPE =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(String value) {
            addCriterion("TRANSACTION_TYPE <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(String value) {
            addCriterion("TRANSACTION_TYPE >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_TYPE >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(String value) {
            addCriterion("TRANSACTION_TYPE <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_TYPE <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLike(String value) {
            addCriterion("TRANSACTION_TYPE like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotLike(String value) {
            addCriterion("TRANSACTION_TYPE not like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<String> values) {
            addCriterion("TRANSACTION_TYPE in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<String> values) {
            addCriterion("TRANSACTION_TYPE not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(String value1, String value2) {
            addCriterion("TRANSACTION_TYPE between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_TYPE not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIsNull() {
            addCriterion("FLOW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIsNotNull() {
            addCriterion("FLOW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStatusEqualTo(String value) {
            addCriterion("FLOW_STATUS =", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotEqualTo(String value) {
            addCriterion("FLOW_STATUS <>", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusGreaterThan(String value) {
            addCriterion("FLOW_STATUS >", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_STATUS >=", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLessThan(String value) {
            addCriterion("FLOW_STATUS <", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLessThanOrEqualTo(String value) {
            addCriterion("FLOW_STATUS <=", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLike(String value) {
            addCriterion("FLOW_STATUS like", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotLike(String value) {
            addCriterion("FLOW_STATUS not like", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIn(List<String> values) {
            addCriterion("FLOW_STATUS in", values, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotIn(List<String> values) {
            addCriterion("FLOW_STATUS not in", values, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusBetween(String value1, String value2) {
            addCriterion("FLOW_STATUS between", value1, value2, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotBetween(String value1, String value2) {
            addCriterion("FLOW_STATUS not between", value1, value2, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIsNull() {
            addCriterion("FLOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIsNotNull() {
            addCriterion("FLOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFlowTypeEqualTo(String value) {
            addCriterion("FLOW_TYPE =", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotEqualTo(String value) {
            addCriterion("FLOW_TYPE <>", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeGreaterThan(String value) {
            addCriterion("FLOW_TYPE >", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_TYPE >=", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLessThan(String value) {
            addCriterion("FLOW_TYPE <", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLessThanOrEqualTo(String value) {
            addCriterion("FLOW_TYPE <=", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeLike(String value) {
            addCriterion("FLOW_TYPE like", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotLike(String value) {
            addCriterion("FLOW_TYPE not like", value, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeIn(List<String> values) {
            addCriterion("FLOW_TYPE in", values, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotIn(List<String> values) {
            addCriterion("FLOW_TYPE not in", values, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeBetween(String value1, String value2) {
            addCriterion("FLOW_TYPE between", value1, value2, "flowType");
            return (Criteria) this;
        }

        public Criteria andFlowTypeNotBetween(String value1, String value2) {
            addCriterion("FLOW_TYPE not between", value1, value2, "flowType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}