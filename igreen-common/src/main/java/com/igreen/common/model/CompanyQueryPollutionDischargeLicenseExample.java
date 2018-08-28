package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyQueryPollutionDischargeLicenseExample {
    /**
     * company_query_pollution_discharge_license
     */
    protected String orderByClause;

    /**
     * company_query_pollution_discharge_license
     */
    protected boolean distinct;

    /**
     * company_query_pollution_discharge_license
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryPollutionDischargeLicenseExample() {
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
     * company_query_pollution_discharge_license 2018-08-27
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

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
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

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("valid_date like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("valid_date not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateIsNull() {
            addCriterion("start_valid_date is null");
            return (Criteria) this;
        }

        public Criteria andStartValidDateIsNotNull() {
            addCriterion("start_valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartValidDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_valid_date =", value, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_valid_date <>", value, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_valid_date >", value, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_valid_date >=", value, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateLessThan(Date value) {
            addCriterionForJDBCDate("start_valid_date <", value, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_valid_date <=", value, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_valid_date in", values, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_valid_date not in", values, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_valid_date between", value1, value2, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andStartValidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_valid_date not between", value1, value2, "startValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateIsNull() {
            addCriterion("end_valid_date is null");
            return (Criteria) this;
        }

        public Criteria andEndValidDateIsNotNull() {
            addCriterion("end_valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndValidDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_valid_date =", value, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_valid_date <>", value, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_valid_date >", value, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_valid_date >=", value, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateLessThan(Date value) {
            addCriterionForJDBCDate("end_valid_date <", value, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_valid_date <=", value, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_valid_date in", values, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_valid_date not in", values, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_valid_date between", value1, value2, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andEndValidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_valid_date not between", value1, value2, "endValidDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateIsNull() {
            addCriterion("certification_date is null");
            return (Criteria) this;
        }

        public Criteria andCertificationDateIsNotNull() {
            addCriterion("certification_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationDateEqualTo(Date value) {
            addCriterionForJDBCDate("certification_date =", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("certification_date <>", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("certification_date >", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("certification_date >=", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateLessThan(Date value) {
            addCriterionForJDBCDate("certification_date <", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("certification_date <=", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateIn(List<Date> values) {
            addCriterionForJDBCDate("certification_date in", values, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("certification_date not in", values, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("certification_date between", value1, value2, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("certification_date not between", value1, value2, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
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

        public Criteria andCertificateOrganizationIsNull() {
            addCriterion("certificate_organization is null");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationIsNotNull() {
            addCriterion("certificate_organization is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationEqualTo(String value) {
            addCriterion("certificate_organization =", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationNotEqualTo(String value) {
            addCriterion("certificate_organization <>", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationGreaterThan(String value) {
            addCriterion("certificate_organization >", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_organization >=", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationLessThan(String value) {
            addCriterion("certificate_organization <", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationLessThanOrEqualTo(String value) {
            addCriterion("certificate_organization <=", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationLike(String value) {
            addCriterion("certificate_organization like", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationNotLike(String value) {
            addCriterion("certificate_organization not like", value, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationIn(List<String> values) {
            addCriterion("certificate_organization in", values, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationNotIn(List<String> values) {
            addCriterion("certificate_organization not in", values, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationBetween(String value1, String value2) {
            addCriterion("certificate_organization between", value1, value2, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andCertificateOrganizationNotBetween(String value1, String value2) {
            addCriterion("certificate_organization not between", value1, value2, "certificateOrganization");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeIsNull() {
            addCriterion("pollution_type is null");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeIsNotNull() {
            addCriterion("pollution_type is not null");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeEqualTo(String value) {
            addCriterion("pollution_type =", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeNotEqualTo(String value) {
            addCriterion("pollution_type <>", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeGreaterThan(String value) {
            addCriterion("pollution_type >", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pollution_type >=", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeLessThan(String value) {
            addCriterion("pollution_type <", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeLessThanOrEqualTo(String value) {
            addCriterion("pollution_type <=", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeLike(String value) {
            addCriterion("pollution_type like", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeNotLike(String value) {
            addCriterion("pollution_type not like", value, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeIn(List<String> values) {
            addCriterion("pollution_type in", values, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeNotIn(List<String> values) {
            addCriterion("pollution_type not in", values, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeBetween(String value1, String value2) {
            addCriterion("pollution_type between", value1, value2, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andPollutionTypeNotBetween(String value1, String value2) {
            addCriterion("pollution_type not between", value1, value2, "pollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeIsNull() {
            addCriterion("air_pollution_type is null");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeIsNotNull() {
            addCriterion("air_pollution_type is not null");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeEqualTo(String value) {
            addCriterion("air_pollution_type =", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeNotEqualTo(String value) {
            addCriterion("air_pollution_type <>", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeGreaterThan(String value) {
            addCriterion("air_pollution_type >", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("air_pollution_type >=", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeLessThan(String value) {
            addCriterion("air_pollution_type <", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeLessThanOrEqualTo(String value) {
            addCriterion("air_pollution_type <=", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeLike(String value) {
            addCriterion("air_pollution_type like", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeNotLike(String value) {
            addCriterion("air_pollution_type not like", value, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeIn(List<String> values) {
            addCriterion("air_pollution_type in", values, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeNotIn(List<String> values) {
            addCriterion("air_pollution_type not in", values, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeBetween(String value1, String value2) {
            addCriterion("air_pollution_type between", value1, value2, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionTypeNotBetween(String value1, String value2) {
            addCriterion("air_pollution_type not between", value1, value2, "airPollutionType");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleIsNull() {
            addCriterion("air_pollution_discharge_rule is null");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleIsNotNull() {
            addCriterion("air_pollution_discharge_rule is not null");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleEqualTo(String value) {
            addCriterion("air_pollution_discharge_rule =", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleNotEqualTo(String value) {
            addCriterion("air_pollution_discharge_rule <>", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleGreaterThan(String value) {
            addCriterion("air_pollution_discharge_rule >", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleGreaterThanOrEqualTo(String value) {
            addCriterion("air_pollution_discharge_rule >=", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleLessThan(String value) {
            addCriterion("air_pollution_discharge_rule <", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleLessThanOrEqualTo(String value) {
            addCriterion("air_pollution_discharge_rule <=", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleLike(String value) {
            addCriterion("air_pollution_discharge_rule like", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleNotLike(String value) {
            addCriterion("air_pollution_discharge_rule not like", value, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleIn(List<String> values) {
            addCriterion("air_pollution_discharge_rule in", values, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleNotIn(List<String> values) {
            addCriterion("air_pollution_discharge_rule not in", values, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleBetween(String value1, String value2) {
            addCriterion("air_pollution_discharge_rule between", value1, value2, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeRuleNotBetween(String value1, String value2) {
            addCriterion("air_pollution_discharge_rule not between", value1, value2, "airPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardIsNull() {
            addCriterion("air_pollution_discharge_standard is null");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardIsNotNull() {
            addCriterion("air_pollution_discharge_standard is not null");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardEqualTo(String value) {
            addCriterion("air_pollution_discharge_standard =", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardNotEqualTo(String value) {
            addCriterion("air_pollution_discharge_standard <>", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardGreaterThan(String value) {
            addCriterion("air_pollution_discharge_standard >", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardGreaterThanOrEqualTo(String value) {
            addCriterion("air_pollution_discharge_standard >=", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardLessThan(String value) {
            addCriterion("air_pollution_discharge_standard <", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardLessThanOrEqualTo(String value) {
            addCriterion("air_pollution_discharge_standard <=", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardLike(String value) {
            addCriterion("air_pollution_discharge_standard like", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardNotLike(String value) {
            addCriterion("air_pollution_discharge_standard not like", value, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardIn(List<String> values) {
            addCriterion("air_pollution_discharge_standard in", values, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardNotIn(List<String> values) {
            addCriterion("air_pollution_discharge_standard not in", values, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardBetween(String value1, String value2) {
            addCriterion("air_pollution_discharge_standard between", value1, value2, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andAirPollutionDischargeStandardNotBetween(String value1, String value2) {
            addCriterion("air_pollution_discharge_standard not between", value1, value2, "airPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeIsNull() {
            addCriterion("water_pollution_type is null");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeIsNotNull() {
            addCriterion("water_pollution_type is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeEqualTo(String value) {
            addCriterion("water_pollution_type =", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeNotEqualTo(String value) {
            addCriterion("water_pollution_type <>", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeGreaterThan(String value) {
            addCriterion("water_pollution_type >", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("water_pollution_type >=", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeLessThan(String value) {
            addCriterion("water_pollution_type <", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeLessThanOrEqualTo(String value) {
            addCriterion("water_pollution_type <=", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeLike(String value) {
            addCriterion("water_pollution_type like", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeNotLike(String value) {
            addCriterion("water_pollution_type not like", value, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeIn(List<String> values) {
            addCriterion("water_pollution_type in", values, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeNotIn(List<String> values) {
            addCriterion("water_pollution_type not in", values, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeBetween(String value1, String value2) {
            addCriterion("water_pollution_type between", value1, value2, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionTypeNotBetween(String value1, String value2) {
            addCriterion("water_pollution_type not between", value1, value2, "waterPollutionType");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleIsNull() {
            addCriterion("water_pollution_discharge_rule is null");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleIsNotNull() {
            addCriterion("water_pollution_discharge_rule is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleEqualTo(String value) {
            addCriterion("water_pollution_discharge_rule =", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleNotEqualTo(String value) {
            addCriterion("water_pollution_discharge_rule <>", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleGreaterThan(String value) {
            addCriterion("water_pollution_discharge_rule >", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleGreaterThanOrEqualTo(String value) {
            addCriterion("water_pollution_discharge_rule >=", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleLessThan(String value) {
            addCriterion("water_pollution_discharge_rule <", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleLessThanOrEqualTo(String value) {
            addCriterion("water_pollution_discharge_rule <=", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleLike(String value) {
            addCriterion("water_pollution_discharge_rule like", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleNotLike(String value) {
            addCriterion("water_pollution_discharge_rule not like", value, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleIn(List<String> values) {
            addCriterion("water_pollution_discharge_rule in", values, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleNotIn(List<String> values) {
            addCriterion("water_pollution_discharge_rule not in", values, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleBetween(String value1, String value2) {
            addCriterion("water_pollution_discharge_rule between", value1, value2, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeRuleNotBetween(String value1, String value2) {
            addCriterion("water_pollution_discharge_rule not between", value1, value2, "waterPollutionDischargeRule");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardIsNull() {
            addCriterion("water_pollution_discharge_standard is null");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardIsNotNull() {
            addCriterion("water_pollution_discharge_standard is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardEqualTo(String value) {
            addCriterion("water_pollution_discharge_standard =", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardNotEqualTo(String value) {
            addCriterion("water_pollution_discharge_standard <>", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardGreaterThan(String value) {
            addCriterion("water_pollution_discharge_standard >", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardGreaterThanOrEqualTo(String value) {
            addCriterion("water_pollution_discharge_standard >=", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardLessThan(String value) {
            addCriterion("water_pollution_discharge_standard <", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardLessThanOrEqualTo(String value) {
            addCriterion("water_pollution_discharge_standard <=", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardLike(String value) {
            addCriterion("water_pollution_discharge_standard like", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardNotLike(String value) {
            addCriterion("water_pollution_discharge_standard not like", value, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardIn(List<String> values) {
            addCriterion("water_pollution_discharge_standard in", values, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardNotIn(List<String> values) {
            addCriterion("water_pollution_discharge_standard not in", values, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardBetween(String value1, String value2) {
            addCriterion("water_pollution_discharge_standard between", value1, value2, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andWaterPollutionDischargeStandardNotBetween(String value1, String value2) {
            addCriterion("water_pollution_discharge_standard not between", value1, value2, "waterPollutionDischargeStandard");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeIsNull() {
            addCriterion("pollution_trade is null");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeIsNotNull() {
            addCriterion("pollution_trade is not null");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeEqualTo(String value) {
            addCriterion("pollution_trade =", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeNotEqualTo(String value) {
            addCriterion("pollution_trade <>", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeGreaterThan(String value) {
            addCriterion("pollution_trade >", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeGreaterThanOrEqualTo(String value) {
            addCriterion("pollution_trade >=", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeLessThan(String value) {
            addCriterion("pollution_trade <", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeLessThanOrEqualTo(String value) {
            addCriterion("pollution_trade <=", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeLike(String value) {
            addCriterion("pollution_trade like", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeNotLike(String value) {
            addCriterion("pollution_trade not like", value, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeIn(List<String> values) {
            addCriterion("pollution_trade in", values, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeNotIn(List<String> values) {
            addCriterion("pollution_trade not in", values, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeBetween(String value1, String value2) {
            addCriterion("pollution_trade between", value1, value2, "pollutionTrade");
            return (Criteria) this;
        }

        public Criteria andPollutionTradeNotBetween(String value1, String value2) {
            addCriterion("pollution_trade not between", value1, value2, "pollutionTrade");
            return (Criteria) this;
        }
    }

    /**
     * 描述:company_query_pollution_discharge_license表的实体类
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
     * company_query_pollution_discharge_license 2018-08-27
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