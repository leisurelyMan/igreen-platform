package com.igreen.common.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyQueryExecutionRecordExample {
    /**
     * company_query_execution_record
     */
    protected String orderByClause;

    /**
     * company_query_execution_record
     */
    protected boolean distinct;

    /**
     * company_query_execution_record
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryExecutionRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * company_query_execution_record 2018-09-20
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNull() {
            addCriterion("data_version is null");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNotNull() {
            addCriterion("data_version is not null");
            return (Criteria) this;
        }

        public Criteria andDataVersionEqualTo(Integer value) {
            addCriterion("data_version =", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotEqualTo(Integer value) {
            addCriterion("data_version <>", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThan(Integer value) {
            addCriterion("data_version >", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_version >=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThan(Integer value) {
            addCriterion("data_version <", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThanOrEqualTo(Integer value) {
            addCriterion("data_version <=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionIn(List<Integer> values) {
            addCriterion("data_version in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotIn(List<Integer> values) {
            addCriterion("data_version not in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionBetween(Integer value1, Integer value2) {
            addCriterion("data_version between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("data_version not between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdIsNull() {
            addCriterion("execution_record_id is null");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdIsNotNull() {
            addCriterion("execution_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdEqualTo(Integer value) {
            addCriterion("execution_record_id =", value, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdNotEqualTo(Integer value) {
            addCriterion("execution_record_id <>", value, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdGreaterThan(Integer value) {
            addCriterion("execution_record_id >", value, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("execution_record_id >=", value, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdLessThan(Integer value) {
            addCriterion("execution_record_id <", value, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("execution_record_id <=", value, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdIn(List<Integer> values) {
            addCriterion("execution_record_id in", values, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdNotIn(List<Integer> values) {
            addCriterion("execution_record_id not in", values, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("execution_record_id between", value1, value2, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andExecutionRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("execution_record_id not between", value1, value2, "executionRecordId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdIsNull() {
            addCriterion("pollution_id is null");
            return (Criteria) this;
        }

        public Criteria andPollutionIdIsNotNull() {
            addCriterion("pollution_id is not null");
            return (Criteria) this;
        }

        public Criteria andPollutionIdEqualTo(Integer value) {
            addCriterion("pollution_id =", value, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdNotEqualTo(Integer value) {
            addCriterion("pollution_id <>", value, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdGreaterThan(Integer value) {
            addCriterion("pollution_id >", value, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pollution_id >=", value, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdLessThan(Integer value) {
            addCriterion("pollution_id <", value, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdLessThanOrEqualTo(Integer value) {
            addCriterion("pollution_id <=", value, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdIn(List<Integer> values) {
            addCriterion("pollution_id in", values, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdNotIn(List<Integer> values) {
            addCriterion("pollution_id not in", values, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdBetween(Integer value1, Integer value2) {
            addCriterion("pollution_id between", value1, value2, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andPollutionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pollution_id not between", value1, value2, "pollutionId");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }
    }

    /**
     * 描述:company_query_execution_record表的实体类
     * @version
     * @author:  panjingxiao
     * @创建时间: 2018-09-20
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * company_query_execution_record 2018-09-20
     */
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