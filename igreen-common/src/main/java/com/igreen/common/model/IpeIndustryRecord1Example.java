package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IpeIndustryRecord1Example {
    /**
     * ipe_industry_record
     */
    protected String orderByClause;

    /**
     * ipe_industry_record
     */
    protected boolean distinct;

    /**
     * ipe_industry_record
     */
    protected List<Criteria> oredCriteria;

    public IpeIndustryRecord1Example() {
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
     * ipe_industry_record 2019-02-19
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIpeIdIsNull() {
            addCriterion("ipe_id is null");
            return (Criteria) this;
        }

        public Criteria andIpeIdIsNotNull() {
            addCriterion("ipe_id is not null");
            return (Criteria) this;
        }

        public Criteria andIpeIdEqualTo(Long value) {
            addCriterion("ipe_id =", value, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdNotEqualTo(Long value) {
            addCriterion("ipe_id <>", value, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdGreaterThan(Long value) {
            addCriterion("ipe_id >", value, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ipe_id >=", value, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdLessThan(Long value) {
            addCriterion("ipe_id <", value, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdLessThanOrEqualTo(Long value) {
            addCriterion("ipe_id <=", value, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdIn(List<Long> values) {
            addCriterion("ipe_id in", values, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdNotIn(List<Long> values) {
            addCriterion("ipe_id not in", values, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdBetween(Long value1, Long value2) {
            addCriterion("ipe_id between", value1, value2, "ipeId");
            return (Criteria) this;
        }

        public Criteria andIpeIdNotBetween(Long value1, Long value2) {
            addCriterion("ipe_id not between", value1, value2, "ipeId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPunishReasonIsNull() {
            addCriterion("punish_reason is null");
            return (Criteria) this;
        }

        public Criteria andPunishReasonIsNotNull() {
            addCriterion("punish_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPunishReasonEqualTo(String value) {
            addCriterion("punish_reason =", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonNotEqualTo(String value) {
            addCriterion("punish_reason <>", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonGreaterThan(String value) {
            addCriterion("punish_reason >", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonGreaterThanOrEqualTo(String value) {
            addCriterion("punish_reason >=", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonLessThan(String value) {
            addCriterion("punish_reason <", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonLessThanOrEqualTo(String value) {
            addCriterion("punish_reason <=", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonLike(String value) {
            addCriterion("punish_reason like", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonNotLike(String value) {
            addCriterion("punish_reason not like", value, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonIn(List<String> values) {
            addCriterion("punish_reason in", values, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonNotIn(List<String> values) {
            addCriterion("punish_reason not in", values, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonBetween(String value1, String value2) {
            addCriterion("punish_reason between", value1, value2, "punishReason");
            return (Criteria) this;
        }

        public Criteria andPunishReasonNotBetween(String value1, String value2) {
            addCriterion("punish_reason not between", value1, value2, "punishReason");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeIsNull() {
            addCriterion("majority_type is null");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeIsNotNull() {
            addCriterion("majority_type is not null");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeEqualTo(String value) {
            addCriterion("majority_type =", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeNotEqualTo(String value) {
            addCriterion("majority_type <>", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeGreaterThan(String value) {
            addCriterion("majority_type >", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("majority_type >=", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeLessThan(String value) {
            addCriterion("majority_type <", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeLessThanOrEqualTo(String value) {
            addCriterion("majority_type <=", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeLike(String value) {
            addCriterion("majority_type like", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeNotLike(String value) {
            addCriterion("majority_type not like", value, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeIn(List<String> values) {
            addCriterion("majority_type in", values, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeNotIn(List<String> values) {
            addCriterion("majority_type not in", values, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeBetween(String value1, String value2) {
            addCriterion("majority_type between", value1, value2, "majorityType");
            return (Criteria) this;
        }

        public Criteria andMajorityTypeNotBetween(String value1, String value2) {
            addCriterion("majority_type not between", value1, value2, "majorityType");
            return (Criteria) this;
        }
    }

    /**
     * 描述:ipe_industry_record表的实体类
     * @version
     * @author:  panjingxiao
     * @创建时间: 2019-02-19
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ipe_industry_record 2019-02-19
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