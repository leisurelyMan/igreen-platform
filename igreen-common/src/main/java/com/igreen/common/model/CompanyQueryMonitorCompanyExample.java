package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyQueryMonitorCompanyExample {
    /**
     * company_query_monitor_company
     */
    protected String orderByClause;

    /**
     * company_query_monitor_company
     */
    protected boolean distinct;

    /**
     * company_query_monitor_company
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryMonitorCompanyExample() {
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
     * company_query_monitor_company 2018-08-27
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdIsNull() {
            addCriterion("regist_item_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdIsNotNull() {
            addCriterion("regist_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdEqualTo(Integer value) {
            addCriterion("regist_item_id =", value, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdNotEqualTo(Integer value) {
            addCriterion("regist_item_id <>", value, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdGreaterThan(Integer value) {
            addCriterion("regist_item_id >", value, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regist_item_id >=", value, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdLessThan(Integer value) {
            addCriterion("regist_item_id <", value, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("regist_item_id <=", value, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdIn(List<Integer> values) {
            addCriterion("regist_item_id in", values, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdNotIn(List<Integer> values) {
            addCriterion("regist_item_id not in", values, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdBetween(Integer value1, Integer value2) {
            addCriterion("regist_item_id between", value1, value2, "registItemId");
            return (Criteria) this;
        }

        public Criteria andRegistItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regist_item_id not between", value1, value2, "registItemId");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceIsNull() {
            addCriterion("monitor_sequence is null");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceIsNotNull() {
            addCriterion("monitor_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceEqualTo(Integer value) {
            addCriterion("monitor_sequence =", value, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceNotEqualTo(Integer value) {
            addCriterion("monitor_sequence <>", value, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceGreaterThan(Integer value) {
            addCriterion("monitor_sequence >", value, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_sequence >=", value, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceLessThan(Integer value) {
            addCriterion("monitor_sequence <", value, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_sequence <=", value, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceIn(List<Integer> values) {
            addCriterion("monitor_sequence in", values, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceNotIn(List<Integer> values) {
            addCriterion("monitor_sequence not in", values, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceBetween(Integer value1, Integer value2) {
            addCriterion("monitor_sequence between", value1, value2, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andMonitorSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_sequence not between", value1, value2, "monitorSequence");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeIsNull() {
            addCriterion("legal_person_code is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeIsNotNull() {
            addCriterion("legal_person_code is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeEqualTo(String value) {
            addCriterion("legal_person_code =", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeNotEqualTo(String value) {
            addCriterion("legal_person_code <>", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeGreaterThan(String value) {
            addCriterion("legal_person_code >", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_code >=", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeLessThan(String value) {
            addCriterion("legal_person_code <", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeLessThanOrEqualTo(String value) {
            addCriterion("legal_person_code <=", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeLike(String value) {
            addCriterion("legal_person_code like", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeNotLike(String value) {
            addCriterion("legal_person_code not like", value, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeIn(List<String> values) {
            addCriterion("legal_person_code in", values, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeNotIn(List<String> values) {
            addCriterion("legal_person_code not in", values, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeBetween(String value1, String value2) {
            addCriterion("legal_person_code between", value1, value2, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCodeNotBetween(String value1, String value2) {
            addCriterion("legal_person_code not between", value1, value2, "legalPersonCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNull() {
            addCriterion("monitor_type is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNotNull() {
            addCriterion("monitor_type is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeEqualTo(String value) {
            addCriterion("monitor_type =", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotEqualTo(String value) {
            addCriterion("monitor_type <>", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThan(String value) {
            addCriterion("monitor_type >", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_type >=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThan(String value) {
            addCriterion("monitor_type <", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThanOrEqualTo(String value) {
            addCriterion("monitor_type <=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLike(String value) {
            addCriterion("monitor_type like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotLike(String value) {
            addCriterion("monitor_type not like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIn(List<String> values) {
            addCriterion("monitor_type in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotIn(List<String> values) {
            addCriterion("monitor_type not in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeBetween(String value1, String value2) {
            addCriterion("monitor_type between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotBetween(String value1, String value2) {
            addCriterion("monitor_type not between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andMonitorYearIsNull() {
            addCriterion("monitor_year is null");
            return (Criteria) this;
        }

        public Criteria andMonitorYearIsNotNull() {
            addCriterion("monitor_year is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorYearEqualTo(String value) {
            addCriterion("monitor_year =", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearNotEqualTo(String value) {
            addCriterion("monitor_year <>", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearGreaterThan(String value) {
            addCriterion("monitor_year >", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_year >=", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearLessThan(String value) {
            addCriterion("monitor_year <", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearLessThanOrEqualTo(String value) {
            addCriterion("monitor_year <=", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearLike(String value) {
            addCriterion("monitor_year like", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearNotLike(String value) {
            addCriterion("monitor_year not like", value, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearIn(List<String> values) {
            addCriterion("monitor_year in", values, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearNotIn(List<String> values) {
            addCriterion("monitor_year not in", values, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearBetween(String value1, String value2) {
            addCriterion("monitor_year between", value1, value2, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andMonitorYearNotBetween(String value1, String value2) {
            addCriterion("monitor_year not between", value1, value2, "monitorYear");
            return (Criteria) this;
        }

        public Criteria andCreateTmIsNull() {
            addCriterion("create_tm is null");
            return (Criteria) this;
        }

        public Criteria andCreateTmIsNotNull() {
            addCriterion("create_tm is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTmEqualTo(Date value) {
            addCriterion("create_tm =", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotEqualTo(Date value) {
            addCriterion("create_tm <>", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmGreaterThan(Date value) {
            addCriterion("create_tm >", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmGreaterThanOrEqualTo(Date value) {
            addCriterion("create_tm >=", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmLessThan(Date value) {
            addCriterion("create_tm <", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmLessThanOrEqualTo(Date value) {
            addCriterion("create_tm <=", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmIn(List<Date> values) {
            addCriterion("create_tm in", values, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotIn(List<Date> values) {
            addCriterion("create_tm not in", values, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmBetween(Date value1, Date value2) {
            addCriterion("create_tm between", value1, value2, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotBetween(Date value1, Date value2) {
            addCriterion("create_tm not between", value1, value2, "createTm");
            return (Criteria) this;
        }
    }

    /**
     * 描述:company_query_monitor_company表的实体类
     * @version
     * @author:  panjingxiao
     * @创建时间: 2018-08-27
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * company_query_monitor_company 2018-08-27
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