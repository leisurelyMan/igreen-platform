package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlerIpeIndustryRecordExample {
    /**
     * crawler_ipe_industry_record
     */
    protected String orderByClause;

    /**
     * crawler_ipe_industry_record
     */
    protected boolean distinct;

    /**
     * crawler_ipe_industry_record
     */
    protected List<Criteria> oredCriteria;

    public CrawlerIpeIndustryRecordExample() {
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
     * crawler_ipe_industry_record 2019-01-16
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

        public Criteria andWebNameIsNull() {
            addCriterion("web_name is null");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNotNull() {
            addCriterion("web_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebNameEqualTo(String value) {
            addCriterion("web_name =", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotEqualTo(String value) {
            addCriterion("web_name <>", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThan(String value) {
            addCriterion("web_name >", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThanOrEqualTo(String value) {
            addCriterion("web_name >=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThan(String value) {
            addCriterion("web_name <", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThanOrEqualTo(String value) {
            addCriterion("web_name <=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLike(String value) {
            addCriterion("web_name like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotLike(String value) {
            addCriterion("web_name not like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameIn(List<String> values) {
            addCriterion("web_name in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotIn(List<String> values) {
            addCriterion("web_name not in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameBetween(String value1, String value2) {
            addCriterion("web_name between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotBetween(String value1, String value2) {
            addCriterion("web_name not between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebDomainIsNull() {
            addCriterion("web_domain is null");
            return (Criteria) this;
        }

        public Criteria andWebDomainIsNotNull() {
            addCriterion("web_domain is not null");
            return (Criteria) this;
        }

        public Criteria andWebDomainEqualTo(String value) {
            addCriterion("web_domain =", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainNotEqualTo(String value) {
            addCriterion("web_domain <>", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainGreaterThan(String value) {
            addCriterion("web_domain >", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainGreaterThanOrEqualTo(String value) {
            addCriterion("web_domain >=", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainLessThan(String value) {
            addCriterion("web_domain <", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainLessThanOrEqualTo(String value) {
            addCriterion("web_domain <=", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainLike(String value) {
            addCriterion("web_domain like", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainNotLike(String value) {
            addCriterion("web_domain not like", value, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainIn(List<String> values) {
            addCriterion("web_domain in", values, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainNotIn(List<String> values) {
            addCriterion("web_domain not in", values, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainBetween(String value1, String value2) {
            addCriterion("web_domain between", value1, value2, "webDomain");
            return (Criteria) this;
        }

        public Criteria andWebDomainNotBetween(String value1, String value2) {
            addCriterion("web_domain not between", value1, value2, "webDomain");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameIsNull() {
            addCriterion("web_detail_name is null");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameIsNotNull() {
            addCriterion("web_detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameEqualTo(String value) {
            addCriterion("web_detail_name =", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameNotEqualTo(String value) {
            addCriterion("web_detail_name <>", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameGreaterThan(String value) {
            addCriterion("web_detail_name >", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("web_detail_name >=", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameLessThan(String value) {
            addCriterion("web_detail_name <", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameLessThanOrEqualTo(String value) {
            addCriterion("web_detail_name <=", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameLike(String value) {
            addCriterion("web_detail_name like", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameNotLike(String value) {
            addCriterion("web_detail_name not like", value, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameIn(List<String> values) {
            addCriterion("web_detail_name in", values, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameNotIn(List<String> values) {
            addCriterion("web_detail_name not in", values, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameBetween(String value1, String value2) {
            addCriterion("web_detail_name between", value1, value2, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailNameNotBetween(String value1, String value2) {
            addCriterion("web_detail_name not between", value1, value2, "webDetailName");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlIsNull() {
            addCriterion("web_detail_url is null");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlIsNotNull() {
            addCriterion("web_detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlEqualTo(String value) {
            addCriterion("web_detail_url =", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlNotEqualTo(String value) {
            addCriterion("web_detail_url <>", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlGreaterThan(String value) {
            addCriterion("web_detail_url >", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("web_detail_url >=", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlLessThan(String value) {
            addCriterion("web_detail_url <", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("web_detail_url <=", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlLike(String value) {
            addCriterion("web_detail_url like", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlNotLike(String value) {
            addCriterion("web_detail_url not like", value, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlIn(List<String> values) {
            addCriterion("web_detail_url in", values, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlNotIn(List<String> values) {
            addCriterion("web_detail_url not in", values, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlBetween(String value1, String value2) {
            addCriterion("web_detail_url between", value1, value2, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailUrlNotBetween(String value1, String value2) {
            addCriterion("web_detail_url not between", value1, value2, "webDetailUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlIsNull() {
            addCriterion("web_detail_result_url is null");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlIsNotNull() {
            addCriterion("web_detail_result_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlEqualTo(String value) {
            addCriterion("web_detail_result_url =", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlNotEqualTo(String value) {
            addCriterion("web_detail_result_url <>", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlGreaterThan(String value) {
            addCriterion("web_detail_result_url >", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlGreaterThanOrEqualTo(String value) {
            addCriterion("web_detail_result_url >=", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlLessThan(String value) {
            addCriterion("web_detail_result_url <", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlLessThanOrEqualTo(String value) {
            addCriterion("web_detail_result_url <=", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlLike(String value) {
            addCriterion("web_detail_result_url like", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlNotLike(String value) {
            addCriterion("web_detail_result_url not like", value, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlIn(List<String> values) {
            addCriterion("web_detail_result_url in", values, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlNotIn(List<String> values) {
            addCriterion("web_detail_result_url not in", values, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlBetween(String value1, String value2) {
            addCriterion("web_detail_result_url between", value1, value2, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andWebDetailResultUrlNotBetween(String value1, String value2) {
            addCriterion("web_detail_result_url not between", value1, value2, "webDetailResultUrl");
            return (Criteria) this;
        }

        public Criteria andSavePathIsNull() {
            addCriterion("save_path is null");
            return (Criteria) this;
        }

        public Criteria andSavePathIsNotNull() {
            addCriterion("save_path is not null");
            return (Criteria) this;
        }

        public Criteria andSavePathEqualTo(String value) {
            addCriterion("save_path =", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathNotEqualTo(String value) {
            addCriterion("save_path <>", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathGreaterThan(String value) {
            addCriterion("save_path >", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathGreaterThanOrEqualTo(String value) {
            addCriterion("save_path >=", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathLessThan(String value) {
            addCriterion("save_path <", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathLessThanOrEqualTo(String value) {
            addCriterion("save_path <=", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathLike(String value) {
            addCriterion("save_path like", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathNotLike(String value) {
            addCriterion("save_path not like", value, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathIn(List<String> values) {
            addCriterion("save_path in", values, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathNotIn(List<String> values) {
            addCriterion("save_path not in", values, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathBetween(String value1, String value2) {
            addCriterion("save_path between", value1, value2, "savePath");
            return (Criteria) this;
        }

        public Criteria andSavePathNotBetween(String value1, String value2) {
            addCriterion("save_path not between", value1, value2, "savePath");
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andPunishTypeIsNull() {
            addCriterion("punish_type is null");
            return (Criteria) this;
        }

        public Criteria andPunishTypeIsNotNull() {
            addCriterion("punish_type is not null");
            return (Criteria) this;
        }

        public Criteria andPunishTypeEqualTo(String value) {
            addCriterion("punish_type =", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeNotEqualTo(String value) {
            addCriterion("punish_type <>", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeGreaterThan(String value) {
            addCriterion("punish_type >", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeGreaterThanOrEqualTo(String value) {
            addCriterion("punish_type >=", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeLessThan(String value) {
            addCriterion("punish_type <", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeLessThanOrEqualTo(String value) {
            addCriterion("punish_type <=", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeLike(String value) {
            addCriterion("punish_type like", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeNotLike(String value) {
            addCriterion("punish_type not like", value, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeIn(List<String> values) {
            addCriterion("punish_type in", values, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeNotIn(List<String> values) {
            addCriterion("punish_type not in", values, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeBetween(String value1, String value2) {
            addCriterion("punish_type between", value1, value2, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTypeNotBetween(String value1, String value2) {
            addCriterion("punish_type not between", value1, value2, "punishType");
            return (Criteria) this;
        }

        public Criteria andPunishTimeIsNull() {
            addCriterion("punish_time is null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeIsNotNull() {
            addCriterion("punish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeEqualTo(String value) {
            addCriterion("punish_time =", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotEqualTo(String value) {
            addCriterion("punish_time <>", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeGreaterThan(String value) {
            addCriterion("punish_time >", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("punish_time >=", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeLessThan(String value) {
            addCriterion("punish_time <", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeLessThanOrEqualTo(String value) {
            addCriterion("punish_time <=", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeLike(String value) {
            addCriterion("punish_time like", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotLike(String value) {
            addCriterion("punish_time not like", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeIn(List<String> values) {
            addCriterion("punish_time in", values, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotIn(List<String> values) {
            addCriterion("punish_time not in", values, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeBetween(String value1, String value2) {
            addCriterion("punish_time between", value1, value2, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotBetween(String value1, String value2) {
            addCriterion("punish_time not between", value1, value2, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyIsNull() {
            addCriterion("punish_money is null");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyIsNotNull() {
            addCriterion("punish_money is not null");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyEqualTo(String value) {
            addCriterion("punish_money =", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotEqualTo(String value) {
            addCriterion("punish_money <>", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyGreaterThan(String value) {
            addCriterion("punish_money >", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("punish_money >=", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyLessThan(String value) {
            addCriterion("punish_money <", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyLessThanOrEqualTo(String value) {
            addCriterion("punish_money <=", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyLike(String value) {
            addCriterion("punish_money like", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotLike(String value) {
            addCriterion("punish_money not like", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyIn(List<String> values) {
            addCriterion("punish_money in", values, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotIn(List<String> values) {
            addCriterion("punish_money not in", values, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyBetween(String value1, String value2) {
            addCriterion("punish_money between", value1, value2, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotBetween(String value1, String value2) {
            addCriterion("punish_money not between", value1, value2, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishNoIsNull() {
            addCriterion("punish_no is null");
            return (Criteria) this;
        }

        public Criteria andPunishNoIsNotNull() {
            addCriterion("punish_no is not null");
            return (Criteria) this;
        }

        public Criteria andPunishNoEqualTo(String value) {
            addCriterion("punish_no =", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoNotEqualTo(String value) {
            addCriterion("punish_no <>", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoGreaterThan(String value) {
            addCriterion("punish_no >", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoGreaterThanOrEqualTo(String value) {
            addCriterion("punish_no >=", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoLessThan(String value) {
            addCriterion("punish_no <", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoLessThanOrEqualTo(String value) {
            addCriterion("punish_no <=", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoLike(String value) {
            addCriterion("punish_no like", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoNotLike(String value) {
            addCriterion("punish_no not like", value, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoIn(List<String> values) {
            addCriterion("punish_no in", values, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoNotIn(List<String> values) {
            addCriterion("punish_no not in", values, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoBetween(String value1, String value2) {
            addCriterion("punish_no between", value1, value2, "punishNo");
            return (Criteria) this;
        }

        public Criteria andPunishNoNotBetween(String value1, String value2) {
            addCriterion("punish_no not between", value1, value2, "punishNo");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     * 描述:crawler_ipe_industry_record表的实体类
     * @version
     * @author:  panjingxiao
     * @创建时间: 2019-01-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * crawler_ipe_industry_record 2019-01-16
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