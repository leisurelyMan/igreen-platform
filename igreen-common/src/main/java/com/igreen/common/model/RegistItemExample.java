package com.igreen.common.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistItemExample {
    /**
     * regist_item
     */
    protected String orderByClause;

    /**
     * regist_item
     */
    protected boolean distinct;

    /**
     * regist_item
     */
    protected List<Criteria> oredCriteria;

    public RegistItemExample() {
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
     * regist_item 2018-08-28
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNull() {
            addCriterion("regist_number is null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNotNull() {
            addCriterion("regist_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberEqualTo(String value) {
            addCriterion("regist_number =", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotEqualTo(String value) {
            addCriterion("regist_number <>", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThan(String value) {
            addCriterion("regist_number >", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThanOrEqualTo(String value) {
            addCriterion("regist_number >=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThan(String value) {
            addCriterion("regist_number <", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThanOrEqualTo(String value) {
            addCriterion("regist_number <=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLike(String value) {
            addCriterion("regist_number like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotLike(String value) {
            addCriterion("regist_number not like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIn(List<String> values) {
            addCriterion("regist_number in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotIn(List<String> values) {
            addCriterion("regist_number not in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberBetween(String value1, String value2) {
            addCriterion("regist_number between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotBetween(String value1, String value2) {
            addCriterion("regist_number not between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberIsNull() {
            addCriterion("old_regist_number is null");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberIsNotNull() {
            addCriterion("old_regist_number is not null");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberEqualTo(String value) {
            addCriterion("old_regist_number =", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberNotEqualTo(String value) {
            addCriterion("old_regist_number <>", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberGreaterThan(String value) {
            addCriterion("old_regist_number >", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberGreaterThanOrEqualTo(String value) {
            addCriterion("old_regist_number >=", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberLessThan(String value) {
            addCriterion("old_regist_number <", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberLessThanOrEqualTo(String value) {
            addCriterion("old_regist_number <=", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberLike(String value) {
            addCriterion("old_regist_number like", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberNotLike(String value) {
            addCriterion("old_regist_number not like", value, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberIn(List<String> values) {
            addCriterion("old_regist_number in", values, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberNotIn(List<String> values) {
            addCriterion("old_regist_number not in", values, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberBetween(String value1, String value2) {
            addCriterion("old_regist_number between", value1, value2, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andOldRegistNumberNotBetween(String value1, String value2) {
            addCriterion("old_regist_number not between", value1, value2, "oldRegistNumber");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(BigDecimal value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(BigDecimal value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(BigDecimal value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(BigDecimal value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<BigDecimal> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<BigDecimal> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalIsNull() {
            addCriterion("paid_in_capital is null");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalIsNotNull() {
            addCriterion("paid_in_capital is not null");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalEqualTo(BigDecimal value) {
            addCriterion("paid_in_capital =", value, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalNotEqualTo(BigDecimal value) {
            addCriterion("paid_in_capital <>", value, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalGreaterThan(BigDecimal value) {
            addCriterion("paid_in_capital >", value, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_in_capital >=", value, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalLessThan(BigDecimal value) {
            addCriterion("paid_in_capital <", value, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_in_capital <=", value, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalIn(List<BigDecimal> values) {
            addCriterion("paid_in_capital in", values, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalNotIn(List<BigDecimal> values) {
            addCriterion("paid_in_capital not in", values, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_in_capital between", value1, value2, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andPaidInCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_in_capital not between", value1, value2, "paidInCapital");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andOperateStateIsNull() {
            addCriterion("operate_state is null");
            return (Criteria) this;
        }

        public Criteria andOperateStateIsNotNull() {
            addCriterion("operate_state is not null");
            return (Criteria) this;
        }

        public Criteria andOperateStateEqualTo(String value) {
            addCriterion("operate_state =", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateNotEqualTo(String value) {
            addCriterion("operate_state <>", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateGreaterThan(String value) {
            addCriterion("operate_state >", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateGreaterThanOrEqualTo(String value) {
            addCriterion("operate_state >=", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateLessThan(String value) {
            addCriterion("operate_state <", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateLessThanOrEqualTo(String value) {
            addCriterion("operate_state <=", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateLike(String value) {
            addCriterion("operate_state like", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateNotLike(String value) {
            addCriterion("operate_state not like", value, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateIn(List<String> values) {
            addCriterion("operate_state in", values, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateNotIn(List<String> values) {
            addCriterion("operate_state not in", values, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateBetween(String value1, String value2) {
            addCriterion("operate_state between", value1, value2, "operateState");
            return (Criteria) this;
        }

        public Criteria andOperateStateNotBetween(String value1, String value2) {
            addCriterion("operate_state not between", value1, value2, "operateState");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(String value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(String value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(String value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(String value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(String value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLike(String value) {
            addCriterion("cancel_time like", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotLike(String value) {
            addCriterion("cancel_time not like", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<String> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<String> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(String value1, String value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(String value1, String value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeIsNull() {
            addCriterion("revoke_time is null");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeIsNotNull() {
            addCriterion("revoke_time is not null");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeEqualTo(String value) {
            addCriterion("revoke_time =", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeNotEqualTo(String value) {
            addCriterion("revoke_time <>", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeGreaterThan(String value) {
            addCriterion("revoke_time >", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("revoke_time >=", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeLessThan(String value) {
            addCriterion("revoke_time <", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeLessThanOrEqualTo(String value) {
            addCriterion("revoke_time <=", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeLike(String value) {
            addCriterion("revoke_time like", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeNotLike(String value) {
            addCriterion("revoke_time not like", value, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeIn(List<String> values) {
            addCriterion("revoke_time in", values, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeNotIn(List<String> values) {
            addCriterion("revoke_time not in", values, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeBetween(String value1, String value2) {
            addCriterion("revoke_time between", value1, value2, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRevokeTimeNotBetween(String value1, String value2) {
            addCriterion("revoke_time not between", value1, value2, "revokeTime");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeIsNull() {
            addCriterion("regist_office is null");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeIsNotNull() {
            addCriterion("regist_office is not null");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeEqualTo(String value) {
            addCriterion("regist_office =", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeNotEqualTo(String value) {
            addCriterion("regist_office <>", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeGreaterThan(String value) {
            addCriterion("regist_office >", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("regist_office >=", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeLessThan(String value) {
            addCriterion("regist_office <", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeLessThanOrEqualTo(String value) {
            addCriterion("regist_office <=", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeLike(String value) {
            addCriterion("regist_office like", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeNotLike(String value) {
            addCriterion("regist_office not like", value, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeIn(List<String> values) {
            addCriterion("regist_office in", values, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeNotIn(List<String> values) {
            addCriterion("regist_office not in", values, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeBetween(String value1, String value2) {
            addCriterion("regist_office between", value1, value2, "registOffice");
            return (Criteria) this;
        }

        public Criteria andRegistOfficeNotBetween(String value1, String value2) {
            addCriterion("regist_office not between", value1, value2, "registOffice");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAnnualYearIsNull() {
            addCriterion("annual_year is null");
            return (Criteria) this;
        }

        public Criteria andAnnualYearIsNotNull() {
            addCriterion("annual_year is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualYearEqualTo(String value) {
            addCriterion("annual_year =", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearNotEqualTo(String value) {
            addCriterion("annual_year <>", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearGreaterThan(String value) {
            addCriterion("annual_year >", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearGreaterThanOrEqualTo(String value) {
            addCriterion("annual_year >=", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearLessThan(String value) {
            addCriterion("annual_year <", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearLessThanOrEqualTo(String value) {
            addCriterion("annual_year <=", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearLike(String value) {
            addCriterion("annual_year like", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearNotLike(String value) {
            addCriterion("annual_year not like", value, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearIn(List<String> values) {
            addCriterion("annual_year in", values, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearNotIn(List<String> values) {
            addCriterion("annual_year not in", values, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearBetween(String value1, String value2) {
            addCriterion("annual_year between", value1, value2, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualYearNotBetween(String value1, String value2) {
            addCriterion("annual_year not between", value1, value2, "annualYear");
            return (Criteria) this;
        }

        public Criteria andAnnualDayIsNull() {
            addCriterion("annual_day is null");
            return (Criteria) this;
        }

        public Criteria andAnnualDayIsNotNull() {
            addCriterion("annual_day is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualDayEqualTo(String value) {
            addCriterion("annual_day =", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayNotEqualTo(String value) {
            addCriterion("annual_day <>", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayGreaterThan(String value) {
            addCriterion("annual_day >", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayGreaterThanOrEqualTo(String value) {
            addCriterion("annual_day >=", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayLessThan(String value) {
            addCriterion("annual_day <", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayLessThanOrEqualTo(String value) {
            addCriterion("annual_day <=", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayLike(String value) {
            addCriterion("annual_day like", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayNotLike(String value) {
            addCriterion("annual_day not like", value, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayIn(List<String> values) {
            addCriterion("annual_day in", values, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayNotIn(List<String> values) {
            addCriterion("annual_day not in", values, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayBetween(String value1, String value2) {
            addCriterion("annual_day between", value1, value2, "annualDay");
            return (Criteria) this;
        }

        public Criteria andAnnualDayNotBetween(String value1, String value2) {
            addCriterion("annual_day not between", value1, value2, "annualDay");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIsNull() {
            addCriterion("trade_code is null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIsNotNull() {
            addCriterion("trade_code is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeEqualTo(String value) {
            addCriterion("trade_code =", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotEqualTo(String value) {
            addCriterion("trade_code <>", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThan(String value) {
            addCriterion("trade_code >", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_code >=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThan(String value) {
            addCriterion("trade_code <", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("trade_code <=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLike(String value) {
            addCriterion("trade_code like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotLike(String value) {
            addCriterion("trade_code not like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIn(List<String> values) {
            addCriterion("trade_code in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotIn(List<String> values) {
            addCriterion("trade_code not in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeBetween(String value1, String value2) {
            addCriterion("trade_code between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotBetween(String value1, String value2) {
            addCriterion("trade_code not between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNull() {
            addCriterion("trade_name is null");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNotNull() {
            addCriterion("trade_name is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNameEqualTo(String value) {
            addCriterion("trade_name =", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotEqualTo(String value) {
            addCriterion("trade_name <>", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThan(String value) {
            addCriterion("trade_name >", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_name >=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThan(String value) {
            addCriterion("trade_name <", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThanOrEqualTo(String value) {
            addCriterion("trade_name <=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLike(String value) {
            addCriterion("trade_name like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotLike(String value) {
            addCriterion("trade_name not like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameIn(List<String> values) {
            addCriterion("trade_name in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotIn(List<String> values) {
            addCriterion("trade_name not in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameBetween(String value1, String value2) {
            addCriterion("trade_name between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotBetween(String value1, String value2) {
            addCriterion("trade_name not between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeIsNull() {
            addCriterion("country_trade_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeIsNotNull() {
            addCriterion("country_trade_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeEqualTo(String value) {
            addCriterion("country_trade_code =", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeNotEqualTo(String value) {
            addCriterion("country_trade_code <>", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeGreaterThan(String value) {
            addCriterion("country_trade_code >", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_trade_code >=", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeLessThan(String value) {
            addCriterion("country_trade_code <", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("country_trade_code <=", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeLike(String value) {
            addCriterion("country_trade_code like", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeNotLike(String value) {
            addCriterion("country_trade_code not like", value, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeIn(List<String> values) {
            addCriterion("country_trade_code in", values, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeNotIn(List<String> values) {
            addCriterion("country_trade_code not in", values, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeBetween(String value1, String value2) {
            addCriterion("country_trade_code between", value1, value2, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeCodeNotBetween(String value1, String value2) {
            addCriterion("country_trade_code not between", value1, value2, "countryTradeCode");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameIsNull() {
            addCriterion("country_trade_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameIsNotNull() {
            addCriterion("country_trade_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameEqualTo(String value) {
            addCriterion("country_trade_name =", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameNotEqualTo(String value) {
            addCriterion("country_trade_name <>", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameGreaterThan(String value) {
            addCriterion("country_trade_name >", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_trade_name >=", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameLessThan(String value) {
            addCriterion("country_trade_name <", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameLessThanOrEqualTo(String value) {
            addCriterion("country_trade_name <=", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameLike(String value) {
            addCriterion("country_trade_name like", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameNotLike(String value) {
            addCriterion("country_trade_name not like", value, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameIn(List<String> values) {
            addCriterion("country_trade_name in", values, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameNotIn(List<String> values) {
            addCriterion("country_trade_name not in", values, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameBetween(String value1, String value2) {
            addCriterion("country_trade_name between", value1, value2, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andCountryTradeNameNotBetween(String value1, String value2) {
            addCriterion("country_trade_name not between", value1, value2, "countryTradeName");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andGeneralIsNull() {
            addCriterion("general is null");
            return (Criteria) this;
        }

        public Criteria andGeneralIsNotNull() {
            addCriterion("general is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralEqualTo(String value) {
            addCriterion("general =", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralNotEqualTo(String value) {
            addCriterion("general <>", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralGreaterThan(String value) {
            addCriterion("general >", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralGreaterThanOrEqualTo(String value) {
            addCriterion("general >=", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralLessThan(String value) {
            addCriterion("general <", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralLessThanOrEqualTo(String value) {
            addCriterion("general <=", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralLike(String value) {
            addCriterion("general like", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralNotLike(String value) {
            addCriterion("general not like", value, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralIn(List<String> values) {
            addCriterion("general in", values, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralNotIn(List<String> values) {
            addCriterion("general not in", values, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralBetween(String value1, String value2) {
            addCriterion("general between", value1, value2, "general");
            return (Criteria) this;
        }

        public Criteria andGeneralNotBetween(String value1, String value2) {
            addCriterion("general not between", value1, value2, "general");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessWayIsNull() {
            addCriterion("business_way is null");
            return (Criteria) this;
        }

        public Criteria andBusinessWayIsNotNull() {
            addCriterion("business_way is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessWayEqualTo(String value) {
            addCriterion("business_way =", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotEqualTo(String value) {
            addCriterion("business_way <>", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayGreaterThan(String value) {
            addCriterion("business_way >", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayGreaterThanOrEqualTo(String value) {
            addCriterion("business_way >=", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayLessThan(String value) {
            addCriterion("business_way <", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayLessThanOrEqualTo(String value) {
            addCriterion("business_way <=", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayLike(String value) {
            addCriterion("business_way like", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotLike(String value) {
            addCriterion("business_way not like", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayIn(List<String> values) {
            addCriterion("business_way in", values, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotIn(List<String> values) {
            addCriterion("business_way not in", values, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayBetween(String value1, String value2) {
            addCriterion("business_way between", value1, value2, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotBetween(String value1, String value2) {
            addCriterion("business_way not between", value1, value2, "businessWay");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(Integer value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(Integer value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(Integer value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(Integer value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(Integer value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<Integer> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<Integer> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(Integer value1, Integer value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(Integer value1, Integer value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterionForJDBCDate("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(Integer value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(Integer value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(Integer value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(Integer value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(Integer value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<Integer> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<Integer> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(Integer value1, Integer value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(Integer value1, Integer value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterionForJDBCDate("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(Integer value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(Integer value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(Integer value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(Integer value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(Integer value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<Integer> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<Integer> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(Integer value1, Integer value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicIsNull() {
            addCriterion("group_company_public is null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicIsNotNull() {
            addCriterion("group_company_public is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicEqualTo(String value) {
            addCriterion("group_company_public =", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicNotEqualTo(String value) {
            addCriterion("group_company_public <>", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicGreaterThan(String value) {
            addCriterion("group_company_public >", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicGreaterThanOrEqualTo(String value) {
            addCriterion("group_company_public >=", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicLessThan(String value) {
            addCriterion("group_company_public <", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicLessThanOrEqualTo(String value) {
            addCriterion("group_company_public <=", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicLike(String value) {
            addCriterion("group_company_public like", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicNotLike(String value) {
            addCriterion("group_company_public not like", value, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicIn(List<String> values) {
            addCriterion("group_company_public in", values, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicNotIn(List<String> values) {
            addCriterion("group_company_public not in", values, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicBetween(String value1, String value2) {
            addCriterion("group_company_public between", value1, value2, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyPublicNotBetween(String value1, String value2) {
            addCriterion("group_company_public not between", value1, value2, "groupCompanyPublic");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameIsNull() {
            addCriterion("group_company_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameIsNotNull() {
            addCriterion("group_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameEqualTo(String value) {
            addCriterion("group_company_name =", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameNotEqualTo(String value) {
            addCriterion("group_company_name <>", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameGreaterThan(String value) {
            addCriterion("group_company_name >", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_company_name >=", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameLessThan(String value) {
            addCriterion("group_company_name <", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("group_company_name <=", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameLike(String value) {
            addCriterion("group_company_name like", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameNotLike(String value) {
            addCriterion("group_company_name not like", value, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameIn(List<String> values) {
            addCriterion("group_company_name in", values, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameNotIn(List<String> values) {
            addCriterion("group_company_name not in", values, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameBetween(String value1, String value2) {
            addCriterion("group_company_name between", value1, value2, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNameNotBetween(String value1, String value2) {
            addCriterion("group_company_name not between", value1, value2, "groupCompanyName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameIsNull() {
            addCriterion("group_company_exchange_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameIsNotNull() {
            addCriterion("group_company_exchange_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameEqualTo(String value) {
            addCriterion("group_company_exchange_name =", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameNotEqualTo(String value) {
            addCriterion("group_company_exchange_name <>", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameGreaterThan(String value) {
            addCriterion("group_company_exchange_name >", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_company_exchange_name >=", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameLessThan(String value) {
            addCriterion("group_company_exchange_name <", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameLessThanOrEqualTo(String value) {
            addCriterion("group_company_exchange_name <=", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameLike(String value) {
            addCriterion("group_company_exchange_name like", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameNotLike(String value) {
            addCriterion("group_company_exchange_name not like", value, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameIn(List<String> values) {
            addCriterion("group_company_exchange_name in", values, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameNotIn(List<String> values) {
            addCriterion("group_company_exchange_name not in", values, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameBetween(String value1, String value2) {
            addCriterion("group_company_exchange_name between", value1, value2, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyExchangeNameNotBetween(String value1, String value2) {
            addCriterion("group_company_exchange_name not between", value1, value2, "groupCompanyExchangeName");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeIsNull() {
            addCriterion("group_company_stock_code is null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeIsNotNull() {
            addCriterion("group_company_stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeEqualTo(String value) {
            addCriterion("group_company_stock_code =", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeNotEqualTo(String value) {
            addCriterion("group_company_stock_code <>", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeGreaterThan(String value) {
            addCriterion("group_company_stock_code >", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("group_company_stock_code >=", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeLessThan(String value) {
            addCriterion("group_company_stock_code <", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeLessThanOrEqualTo(String value) {
            addCriterion("group_company_stock_code <=", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeLike(String value) {
            addCriterion("group_company_stock_code like", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeNotLike(String value) {
            addCriterion("group_company_stock_code not like", value, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeIn(List<String> values) {
            addCriterion("group_company_stock_code in", values, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeNotIn(List<String> values) {
            addCriterion("group_company_stock_code not in", values, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeBetween(String value1, String value2) {
            addCriterion("group_company_stock_code between", value1, value2, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyStockCodeNotBetween(String value1, String value2) {
            addCriterion("group_company_stock_code not between", value1, value2, "groupCompanyStockCode");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityIsNull() {
            addCriterion("sewage_facility is null");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityIsNotNull() {
            addCriterion("sewage_facility is not null");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityEqualTo(String value) {
            addCriterion("sewage_facility =", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityNotEqualTo(String value) {
            addCriterion("sewage_facility <>", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityGreaterThan(String value) {
            addCriterion("sewage_facility >", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("sewage_facility >=", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityLessThan(String value) {
            addCriterion("sewage_facility <", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityLessThanOrEqualTo(String value) {
            addCriterion("sewage_facility <=", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityLike(String value) {
            addCriterion("sewage_facility like", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityNotLike(String value) {
            addCriterion("sewage_facility not like", value, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityIn(List<String> values) {
            addCriterion("sewage_facility in", values, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityNotIn(List<String> values) {
            addCriterion("sewage_facility not in", values, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityBetween(String value1, String value2) {
            addCriterion("sewage_facility between", value1, value2, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andSewageFacilityNotBetween(String value1, String value2) {
            addCriterion("sewage_facility not between", value1, value2, "sewageFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityIsNull() {
            addCriterion("process_gas_facility is null");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityIsNotNull() {
            addCriterion("process_gas_facility is not null");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityEqualTo(String value) {
            addCriterion("process_gas_facility =", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityNotEqualTo(String value) {
            addCriterion("process_gas_facility <>", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityGreaterThan(String value) {
            addCriterion("process_gas_facility >", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("process_gas_facility >=", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityLessThan(String value) {
            addCriterion("process_gas_facility <", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityLessThanOrEqualTo(String value) {
            addCriterion("process_gas_facility <=", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityLike(String value) {
            addCriterion("process_gas_facility like", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityNotLike(String value) {
            addCriterion("process_gas_facility not like", value, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityIn(List<String> values) {
            addCriterion("process_gas_facility in", values, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityNotIn(List<String> values) {
            addCriterion("process_gas_facility not in", values, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityBetween(String value1, String value2) {
            addCriterion("process_gas_facility between", value1, value2, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andProcessGasFacilityNotBetween(String value1, String value2) {
            addCriterion("process_gas_facility not between", value1, value2, "processGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityIsNull() {
            addCriterion("boiler_gas_facility is null");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityIsNotNull() {
            addCriterion("boiler_gas_facility is not null");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityEqualTo(String value) {
            addCriterion("boiler_gas_facility =", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityNotEqualTo(String value) {
            addCriterion("boiler_gas_facility <>", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityGreaterThan(String value) {
            addCriterion("boiler_gas_facility >", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("boiler_gas_facility >=", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityLessThan(String value) {
            addCriterion("boiler_gas_facility <", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityLessThanOrEqualTo(String value) {
            addCriterion("boiler_gas_facility <=", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityLike(String value) {
            addCriterion("boiler_gas_facility like", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityNotLike(String value) {
            addCriterion("boiler_gas_facility not like", value, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityIn(List<String> values) {
            addCriterion("boiler_gas_facility in", values, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityNotIn(List<String> values) {
            addCriterion("boiler_gas_facility not in", values, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityBetween(String value1, String value2) {
            addCriterion("boiler_gas_facility between", value1, value2, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andBoilerGasFacilityNotBetween(String value1, String value2) {
            addCriterion("boiler_gas_facility not between", value1, value2, "boilerGasFacility");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeIsNull() {
            addCriterion("industrial_sewage_discharge is null");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeIsNotNull() {
            addCriterion("industrial_sewage_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeEqualTo(String value) {
            addCriterion("industrial_sewage_discharge =", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeNotEqualTo(String value) {
            addCriterion("industrial_sewage_discharge <>", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeGreaterThan(String value) {
            addCriterion("industrial_sewage_discharge >", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("industrial_sewage_discharge >=", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeLessThan(String value) {
            addCriterion("industrial_sewage_discharge <", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeLessThanOrEqualTo(String value) {
            addCriterion("industrial_sewage_discharge <=", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeLike(String value) {
            addCriterion("industrial_sewage_discharge like", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeNotLike(String value) {
            addCriterion("industrial_sewage_discharge not like", value, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeIn(List<String> values) {
            addCriterion("industrial_sewage_discharge in", values, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeNotIn(List<String> values) {
            addCriterion("industrial_sewage_discharge not in", values, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeBetween(String value1, String value2) {
            addCriterion("industrial_sewage_discharge between", value1, value2, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageDischargeNotBetween(String value1, String value2) {
            addCriterion("industrial_sewage_discharge not between", value1, value2, "industrialSewageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeIsNull() {
            addCriterion("life_sweage_discharge is null");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeIsNotNull() {
            addCriterion("life_sweage_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeEqualTo(String value) {
            addCriterion("life_sweage_discharge =", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeNotEqualTo(String value) {
            addCriterion("life_sweage_discharge <>", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeGreaterThan(String value) {
            addCriterion("life_sweage_discharge >", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("life_sweage_discharge >=", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeLessThan(String value) {
            addCriterion("life_sweage_discharge <", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeLessThanOrEqualTo(String value) {
            addCriterion("life_sweage_discharge <=", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeLike(String value) {
            addCriterion("life_sweage_discharge like", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeNotLike(String value) {
            addCriterion("life_sweage_discharge not like", value, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeIn(List<String> values) {
            addCriterion("life_sweage_discharge in", values, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeNotIn(List<String> values) {
            addCriterion("life_sweage_discharge not in", values, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeBetween(String value1, String value2) {
            addCriterion("life_sweage_discharge between", value1, value2, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andLifeSweageDischargeNotBetween(String value1, String value2) {
            addCriterion("life_sweage_discharge not between", value1, value2, "lifeSweageDischarge");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardIsNull() {
            addCriterion("industrial_sewage_emission_standard is null");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardIsNotNull() {
            addCriterion("industrial_sewage_emission_standard is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardEqualTo(String value) {
            addCriterion("industrial_sewage_emission_standard =", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardNotEqualTo(String value) {
            addCriterion("industrial_sewage_emission_standard <>", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardGreaterThan(String value) {
            addCriterion("industrial_sewage_emission_standard >", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardGreaterThanOrEqualTo(String value) {
            addCriterion("industrial_sewage_emission_standard >=", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardLessThan(String value) {
            addCriterion("industrial_sewage_emission_standard <", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardLessThanOrEqualTo(String value) {
            addCriterion("industrial_sewage_emission_standard <=", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardLike(String value) {
            addCriterion("industrial_sewage_emission_standard like", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardNotLike(String value) {
            addCriterion("industrial_sewage_emission_standard not like", value, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardIn(List<String> values) {
            addCriterion("industrial_sewage_emission_standard in", values, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardNotIn(List<String> values) {
            addCriterion("industrial_sewage_emission_standard not in", values, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardBetween(String value1, String value2) {
            addCriterion("industrial_sewage_emission_standard between", value1, value2, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andIndustrialSewageEmissionStandardNotBetween(String value1, String value2) {
            addCriterion("industrial_sewage_emission_standard not between", value1, value2, "industrialSewageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardIsNull() {
            addCriterion("life_sweage_emission_standard is null");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardIsNotNull() {
            addCriterion("life_sweage_emission_standard is not null");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardEqualTo(String value) {
            addCriterion("life_sweage_emission_standard =", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardNotEqualTo(String value) {
            addCriterion("life_sweage_emission_standard <>", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardGreaterThan(String value) {
            addCriterion("life_sweage_emission_standard >", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardGreaterThanOrEqualTo(String value) {
            addCriterion("life_sweage_emission_standard >=", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardLessThan(String value) {
            addCriterion("life_sweage_emission_standard <", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardLessThanOrEqualTo(String value) {
            addCriterion("life_sweage_emission_standard <=", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardLike(String value) {
            addCriterion("life_sweage_emission_standard like", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardNotLike(String value) {
            addCriterion("life_sweage_emission_standard not like", value, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardIn(List<String> values) {
            addCriterion("life_sweage_emission_standard in", values, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardNotIn(List<String> values) {
            addCriterion("life_sweage_emission_standard not in", values, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardBetween(String value1, String value2) {
            addCriterion("life_sweage_emission_standard between", value1, value2, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andLifeSweageEmissionStandardNotBetween(String value1, String value2) {
            addCriterion("life_sweage_emission_standard not between", value1, value2, "lifeSweageEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardIsNull() {
            addCriterion("gas_emission_standard is null");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardIsNotNull() {
            addCriterion("gas_emission_standard is not null");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardEqualTo(String value) {
            addCriterion("gas_emission_standard =", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardNotEqualTo(String value) {
            addCriterion("gas_emission_standard <>", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardGreaterThan(String value) {
            addCriterion("gas_emission_standard >", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardGreaterThanOrEqualTo(String value) {
            addCriterion("gas_emission_standard >=", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardLessThan(String value) {
            addCriterion("gas_emission_standard <", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardLessThanOrEqualTo(String value) {
            addCriterion("gas_emission_standard <=", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardLike(String value) {
            addCriterion("gas_emission_standard like", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardNotLike(String value) {
            addCriterion("gas_emission_standard not like", value, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardIn(List<String> values) {
            addCriterion("gas_emission_standard in", values, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardNotIn(List<String> values) {
            addCriterion("gas_emission_standard not in", values, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardBetween(String value1, String value2) {
            addCriterion("gas_emission_standard between", value1, value2, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andGasEmissionStandardNotBetween(String value1, String value2) {
            addCriterion("gas_emission_standard not between", value1, value2, "gasEmissionStandard");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceIsNull() {
            addCriterion("pollutant_source is null");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceIsNotNull() {
            addCriterion("pollutant_source is not null");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceEqualTo(String value) {
            addCriterion("pollutant_source =", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceNotEqualTo(String value) {
            addCriterion("pollutant_source <>", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceGreaterThan(String value) {
            addCriterion("pollutant_source >", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceGreaterThanOrEqualTo(String value) {
            addCriterion("pollutant_source >=", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceLessThan(String value) {
            addCriterion("pollutant_source <", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceLessThanOrEqualTo(String value) {
            addCriterion("pollutant_source <=", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceLike(String value) {
            addCriterion("pollutant_source like", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceNotLike(String value) {
            addCriterion("pollutant_source not like", value, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceIn(List<String> values) {
            addCriterion("pollutant_source in", values, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceNotIn(List<String> values) {
            addCriterion("pollutant_source not in", values, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceBetween(String value1, String value2) {
            addCriterion("pollutant_source between", value1, value2, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andPollutantSourceNotBetween(String value1, String value2) {
            addCriterion("pollutant_source not between", value1, value2, "pollutantSource");
            return (Criteria) this;
        }

        public Criteria andMainProductionIsNull() {
            addCriterion("main_production is null");
            return (Criteria) this;
        }

        public Criteria andMainProductionIsNotNull() {
            addCriterion("main_production is not null");
            return (Criteria) this;
        }

        public Criteria andMainProductionEqualTo(String value) {
            addCriterion("main_production =", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionNotEqualTo(String value) {
            addCriterion("main_production <>", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionGreaterThan(String value) {
            addCriterion("main_production >", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionGreaterThanOrEqualTo(String value) {
            addCriterion("main_production >=", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionLessThan(String value) {
            addCriterion("main_production <", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionLessThanOrEqualTo(String value) {
            addCriterion("main_production <=", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionLike(String value) {
            addCriterion("main_production like", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionNotLike(String value) {
            addCriterion("main_production not like", value, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionIn(List<String> values) {
            addCriterion("main_production in", values, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionNotIn(List<String> values) {
            addCriterion("main_production not in", values, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionBetween(String value1, String value2) {
            addCriterion("main_production between", value1, value2, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andMainProductionNotBetween(String value1, String value2) {
            addCriterion("main_production not between", value1, value2, "mainProduction");
            return (Criteria) this;
        }

        public Criteria andPollutantDescIsNull() {
            addCriterion("pollutant_desc is null");
            return (Criteria) this;
        }

        public Criteria andPollutantDescIsNotNull() {
            addCriterion("pollutant_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPollutantDescEqualTo(String value) {
            addCriterion("pollutant_desc =", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescNotEqualTo(String value) {
            addCriterion("pollutant_desc <>", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescGreaterThan(String value) {
            addCriterion("pollutant_desc >", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescGreaterThanOrEqualTo(String value) {
            addCriterion("pollutant_desc >=", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescLessThan(String value) {
            addCriterion("pollutant_desc <", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescLessThanOrEqualTo(String value) {
            addCriterion("pollutant_desc <=", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescLike(String value) {
            addCriterion("pollutant_desc like", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescNotLike(String value) {
            addCriterion("pollutant_desc not like", value, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescIn(List<String> values) {
            addCriterion("pollutant_desc in", values, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescNotIn(List<String> values) {
            addCriterion("pollutant_desc not in", values, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescBetween(String value1, String value2) {
            addCriterion("pollutant_desc between", value1, value2, "pollutantDesc");
            return (Criteria) this;
        }

        public Criteria andPollutantDescNotBetween(String value1, String value2) {
            addCriterion("pollutant_desc not between", value1, value2, "pollutantDesc");
            return (Criteria) this;
        }
    }

    /**
     * 描述:regist_item表的实体类
     * @version
     * @author:  panjingxiao
     * @创建时间: 2018-08-28
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * regist_item 2018-08-28
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