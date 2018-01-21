package com.igreen.common.model;

import java.util.ArrayList;
import java.util.List;

public class QichachaCompanyBaseExample {
    /**
     * qichacha_company_base
     */
    protected String orderByClause;

    /**
     * qichacha_company_base
     */
    protected boolean distinct;

    /**
     * qichacha_company_base
     */
    protected List<Criteria> oredCriteria;

    public QichachaCompanyBaseExample() {
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
     * qichacha_company_base 2018-01-20
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

        public Criteria andKeyNoIsNull() {
            addCriterion("key_no is null");
            return (Criteria) this;
        }

        public Criteria andKeyNoIsNotNull() {
            addCriterion("key_no is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNoEqualTo(String value) {
            addCriterion("key_no =", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotEqualTo(String value) {
            addCriterion("key_no <>", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoGreaterThan(String value) {
            addCriterion("key_no >", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoGreaterThanOrEqualTo(String value) {
            addCriterion("key_no >=", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLessThan(String value) {
            addCriterion("key_no <", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLessThanOrEqualTo(String value) {
            addCriterion("key_no <=", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoLike(String value) {
            addCriterion("key_no like", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotLike(String value) {
            addCriterion("key_no not like", value, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoIn(List<String> values) {
            addCriterion("key_no in", values, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotIn(List<String> values) {
            addCriterion("key_no not in", values, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoBetween(String value1, String value2) {
            addCriterion("key_no between", value1, value2, "keyNo");
            return (Criteria) this;
        }

        public Criteria andKeyNoNotBetween(String value1, String value2) {
            addCriterion("key_no not between", value1, value2, "keyNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
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

        public Criteria andIndustryCodeIsNull() {
            addCriterion("industry_code is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNotNull() {
            addCriterion("industry_code is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeEqualTo(String value) {
            addCriterion("industry_code =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotEqualTo(String value) {
            addCriterion("industry_code <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThan(String value) {
            addCriterion("industry_code >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("industry_code >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThan(String value) {
            addCriterion("industry_code <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThanOrEqualTo(String value) {
            addCriterion("industry_code <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLike(String value) {
            addCriterion("industry_code like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotLike(String value) {
            addCriterion("industry_code not like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIn(List<String> values) {
            addCriterion("industry_code in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotIn(List<String> values) {
            addCriterion("industry_code not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeBetween(String value1, String value2) {
            addCriterion("industry_code between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotBetween(String value1, String value2) {
            addCriterion("industry_code not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeIsNull() {
            addCriterion("subIndustry_code is null");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeIsNotNull() {
            addCriterion("subIndustry_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeEqualTo(String value) {
            addCriterion("subIndustry_code =", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeNotEqualTo(String value) {
            addCriterion("subIndustry_code <>", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeGreaterThan(String value) {
            addCriterion("subIndustry_code >", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subIndustry_code >=", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeLessThan(String value) {
            addCriterion("subIndustry_code <", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeLessThanOrEqualTo(String value) {
            addCriterion("subIndustry_code <=", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeLike(String value) {
            addCriterion("subIndustry_code like", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeNotLike(String value) {
            addCriterion("subIndustry_code not like", value, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeIn(List<String> values) {
            addCriterion("subIndustry_code in", values, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeNotIn(List<String> values) {
            addCriterion("subIndustry_code not in", values, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeBetween(String value1, String value2) {
            addCriterion("subIndustry_code between", value1, value2, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andSubindustryCodeNotBetween(String value1, String value2) {
            addCriterion("subIndustry_code not between", value1, value2, "subindustryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andSubindustryIsNull() {
            addCriterion("subIndustry is null");
            return (Criteria) this;
        }

        public Criteria andSubindustryIsNotNull() {
            addCriterion("subIndustry is not null");
            return (Criteria) this;
        }

        public Criteria andSubindustryEqualTo(String value) {
            addCriterion("subIndustry =", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryNotEqualTo(String value) {
            addCriterion("subIndustry <>", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryGreaterThan(String value) {
            addCriterion("subIndustry >", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryGreaterThanOrEqualTo(String value) {
            addCriterion("subIndustry >=", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryLessThan(String value) {
            addCriterion("subIndustry <", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryLessThanOrEqualTo(String value) {
            addCriterion("subIndustry <=", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryLike(String value) {
            addCriterion("subIndustry like", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryNotLike(String value) {
            addCriterion("subIndustry not like", value, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryIn(List<String> values) {
            addCriterion("subIndustry in", values, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryNotIn(List<String> values) {
            addCriterion("subIndustry not in", values, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryBetween(String value1, String value2) {
            addCriterion("subIndustry between", value1, value2, "subindustry");
            return (Criteria) this;
        }

        public Criteria andSubindustryNotBetween(String value1, String value2) {
            addCriterion("subIndustry not between", value1, value2, "subindustry");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("credit_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("credit_code =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("credit_code <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("credit_code >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_code >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("credit_code <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_code <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("credit_code like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("credit_code not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("credit_code in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("credit_code not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("credit_code between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("credit_code not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andRegistCapiIsNull() {
            addCriterion("regist_capi is null");
            return (Criteria) this;
        }

        public Criteria andRegistCapiIsNotNull() {
            addCriterion("regist_capi is not null");
            return (Criteria) this;
        }

        public Criteria andRegistCapiEqualTo(String value) {
            addCriterion("regist_capi =", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiNotEqualTo(String value) {
            addCriterion("regist_capi <>", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiGreaterThan(String value) {
            addCriterion("regist_capi >", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiGreaterThanOrEqualTo(String value) {
            addCriterion("regist_capi >=", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiLessThan(String value) {
            addCriterion("regist_capi <", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiLessThanOrEqualTo(String value) {
            addCriterion("regist_capi <=", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiLike(String value) {
            addCriterion("regist_capi like", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiNotLike(String value) {
            addCriterion("regist_capi not like", value, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiIn(List<String> values) {
            addCriterion("regist_capi in", values, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiNotIn(List<String> values) {
            addCriterion("regist_capi not in", values, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiBetween(String value1, String value2) {
            addCriterion("regist_capi between", value1, value2, "registCapi");
            return (Criteria) this;
        }

        public Criteria andRegistCapiNotBetween(String value1, String value2) {
            addCriterion("regist_capi not between", value1, value2, "registCapi");
            return (Criteria) this;
        }

        public Criteria andEconKindIsNull() {
            addCriterion("econ_kind is null");
            return (Criteria) this;
        }

        public Criteria andEconKindIsNotNull() {
            addCriterion("econ_kind is not null");
            return (Criteria) this;
        }

        public Criteria andEconKindEqualTo(String value) {
            addCriterion("econ_kind =", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindNotEqualTo(String value) {
            addCriterion("econ_kind <>", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindGreaterThan(String value) {
            addCriterion("econ_kind >", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindGreaterThanOrEqualTo(String value) {
            addCriterion("econ_kind >=", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindLessThan(String value) {
            addCriterion("econ_kind <", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindLessThanOrEqualTo(String value) {
            addCriterion("econ_kind <=", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindLike(String value) {
            addCriterion("econ_kind like", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindNotLike(String value) {
            addCriterion("econ_kind not like", value, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindIn(List<String> values) {
            addCriterion("econ_kind in", values, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindNotIn(List<String> values) {
            addCriterion("econ_kind not in", values, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindBetween(String value1, String value2) {
            addCriterion("econ_kind between", value1, value2, "econKind");
            return (Criteria) this;
        }

        public Criteria andEconKindNotBetween(String value1, String value2) {
            addCriterion("econ_kind not between", value1, value2, "econKind");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("org_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("org_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("org_no =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("org_no <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("org_no >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_no >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("org_no <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("org_no <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("org_no like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("org_no not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("org_no in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("org_no not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("org_no between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("org_no not between", value1, value2, "orgNo");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * 描述:qichacha_company_base表的实体类
     * @version
     * @author:  Administrator
     * @创建时间: 2018-01-20
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * qichacha_company_base 2018-01-20
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