package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyQueryExcelEnergyEfficiencyLabelExample {
    /**
     * company_query_excel_energy_efficiency_label
     */
    protected String orderByClause;

    /**
     * company_query_excel_energy_efficiency_label
     */
    protected boolean distinct;

    /**
     * company_query_excel_energy_efficiency_label
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryExcelEnergyEfficiencyLabelExample() {
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
     * company_query_excel_energy_efficiency_label 2018-08-27
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andNoticeNoIsNull() {
            addCriterion("notice_no is null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIsNotNull() {
            addCriterion("notice_no is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoEqualTo(String value) {
            addCriterion("notice_no =", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotEqualTo(String value) {
            addCriterion("notice_no <>", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoGreaterThan(String value) {
            addCriterion("notice_no >", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoGreaterThanOrEqualTo(String value) {
            addCriterion("notice_no >=", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLessThan(String value) {
            addCriterion("notice_no <", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLessThanOrEqualTo(String value) {
            addCriterion("notice_no <=", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLike(String value) {
            addCriterion("notice_no like", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotLike(String value) {
            addCriterion("notice_no not like", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIn(List<String> values) {
            addCriterion("notice_no in", values, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotIn(List<String> values) {
            addCriterion("notice_no not in", values, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoBetween(String value1, String value2) {
            addCriterion("notice_no between", value1, value2, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotBetween(String value1, String value2) {
            addCriterion("notice_no not between", value1, value2, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyIsNull() {
            addCriterion("filing_company is null");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyIsNotNull() {
            addCriterion("filing_company is not null");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyEqualTo(String value) {
            addCriterion("filing_company =", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyNotEqualTo(String value) {
            addCriterion("filing_company <>", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyGreaterThan(String value) {
            addCriterion("filing_company >", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("filing_company >=", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyLessThan(String value) {
            addCriterion("filing_company <", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyLessThanOrEqualTo(String value) {
            addCriterion("filing_company <=", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyLike(String value) {
            addCriterion("filing_company like", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyNotLike(String value) {
            addCriterion("filing_company not like", value, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyIn(List<String> values) {
            addCriterion("filing_company in", values, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyNotIn(List<String> values) {
            addCriterion("filing_company not in", values, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyBetween(String value1, String value2) {
            addCriterion("filing_company between", value1, value2, "filingCompany");
            return (Criteria) this;
        }

        public Criteria andFilingCompanyNotBetween(String value1, String value2) {
            addCriterion("filing_company not between", value1, value2, "filingCompany");
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

        public Criteria andStatasIsNull() {
            addCriterion("statas is null");
            return (Criteria) this;
        }

        public Criteria andStatasIsNotNull() {
            addCriterion("statas is not null");
            return (Criteria) this;
        }

        public Criteria andStatasEqualTo(Integer value) {
            addCriterion("statas =", value, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasNotEqualTo(Integer value) {
            addCriterion("statas <>", value, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasGreaterThan(Integer value) {
            addCriterion("statas >", value, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasGreaterThanOrEqualTo(Integer value) {
            addCriterion("statas >=", value, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasLessThan(Integer value) {
            addCriterion("statas <", value, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasLessThanOrEqualTo(Integer value) {
            addCriterion("statas <=", value, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasIn(List<Integer> values) {
            addCriterion("statas in", values, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasNotIn(List<Integer> values) {
            addCriterion("statas not in", values, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasBetween(Integer value1, Integer value2) {
            addCriterion("statas between", value1, value2, "statas");
            return (Criteria) this;
        }

        public Criteria andStatasNotBetween(Integer value1, Integer value2) {
            addCriterion("statas not between", value1, value2, "statas");
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

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
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

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
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
    }

    /**
     * 描述:company_query_excel_energy_efficiency_label表的实体类
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
     * company_query_excel_energy_efficiency_label 2018-08-27
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