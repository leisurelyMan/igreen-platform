package com.igreen.common.model;

import java.util.ArrayList;
import java.util.List;

public class QichachaPenaltyExample {
    /**
     * qichacha_penalty
     */
    protected String orderByClause;

    /**
     * qichacha_penalty
     */
    protected boolean distinct;

    /**
     * qichacha_penalty
     */
    protected List<Criteria> oredCriteria;

    public QichachaPenaltyExample() {
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
     * qichacha_penalty 2018-01-20
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNull() {
            addCriterion("doc_no is null");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNotNull() {
            addCriterion("doc_no is not null");
            return (Criteria) this;
        }

        public Criteria andDocNoEqualTo(String value) {
            addCriterion("doc_no =", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotEqualTo(String value) {
            addCriterion("doc_no <>", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThan(String value) {
            addCriterion("doc_no >", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("doc_no >=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThan(String value) {
            addCriterion("doc_no <", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThanOrEqualTo(String value) {
            addCriterion("doc_no <=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLike(String value) {
            addCriterion("doc_no like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotLike(String value) {
            addCriterion("doc_no not like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoIn(List<String> values) {
            addCriterion("doc_no in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotIn(List<String> values) {
            addCriterion("doc_no not in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoBetween(String value1, String value2) {
            addCriterion("doc_no between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotBetween(String value1, String value2) {
            addCriterion("doc_no not between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeIsNull() {
            addCriterion("penalty_type is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeIsNotNull() {
            addCriterion("penalty_type is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeEqualTo(String value) {
            addCriterion("penalty_type =", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeNotEqualTo(String value) {
            addCriterion("penalty_type <>", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeGreaterThan(String value) {
            addCriterion("penalty_type >", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("penalty_type >=", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeLessThan(String value) {
            addCriterion("penalty_type <", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeLessThanOrEqualTo(String value) {
            addCriterion("penalty_type <=", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeLike(String value) {
            addCriterion("penalty_type like", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeNotLike(String value) {
            addCriterion("penalty_type not like", value, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeIn(List<String> values) {
            addCriterion("penalty_type in", values, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeNotIn(List<String> values) {
            addCriterion("penalty_type not in", values, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeBetween(String value1, String value2) {
            addCriterion("penalty_type between", value1, value2, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andPenaltyTypeNotBetween(String value1, String value2) {
            addCriterion("penalty_type not between", value1, value2, "penaltyType");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIsNull() {
            addCriterion("office_name is null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIsNotNull() {
            addCriterion("office_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameEqualTo(String value) {
            addCriterion("office_name =", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotEqualTo(String value) {
            addCriterion("office_name <>", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameGreaterThan(String value) {
            addCriterion("office_name >", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("office_name >=", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLessThan(String value) {
            addCriterion("office_name <", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLessThanOrEqualTo(String value) {
            addCriterion("office_name <=", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLike(String value) {
            addCriterion("office_name like", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotLike(String value) {
            addCriterion("office_name not like", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIn(List<String> values) {
            addCriterion("office_name in", values, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotIn(List<String> values) {
            addCriterion("office_name not in", values, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameBetween(String value1, String value2) {
            addCriterion("office_name between", value1, value2, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotBetween(String value1, String value2) {
            addCriterion("office_name not between", value1, value2, "officeName");
            return (Criteria) this;
        }

        public Criteria andPublicDateIsNull() {
            addCriterion("public_date is null");
            return (Criteria) this;
        }

        public Criteria andPublicDateIsNotNull() {
            addCriterion("public_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublicDateEqualTo(String value) {
            addCriterion("public_date =", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotEqualTo(String value) {
            addCriterion("public_date <>", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateGreaterThan(String value) {
            addCriterion("public_date >", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateGreaterThanOrEqualTo(String value) {
            addCriterion("public_date >=", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateLessThan(String value) {
            addCriterion("public_date <", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateLessThanOrEqualTo(String value) {
            addCriterion("public_date <=", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateLike(String value) {
            addCriterion("public_date like", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotLike(String value) {
            addCriterion("public_date not like", value, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateIn(List<String> values) {
            addCriterion("public_date in", values, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotIn(List<String> values) {
            addCriterion("public_date not in", values, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateBetween(String value1, String value2) {
            addCriterion("public_date between", value1, value2, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPublicDateNotBetween(String value1, String value2) {
            addCriterion("public_date not between", value1, value2, "publicDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateIsNull() {
            addCriterion("penalty_date is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateIsNotNull() {
            addCriterion("penalty_date is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateEqualTo(String value) {
            addCriterion("penalty_date =", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateNotEqualTo(String value) {
            addCriterion("penalty_date <>", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateGreaterThan(String value) {
            addCriterion("penalty_date >", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateGreaterThanOrEqualTo(String value) {
            addCriterion("penalty_date >=", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateLessThan(String value) {
            addCriterion("penalty_date <", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateLessThanOrEqualTo(String value) {
            addCriterion("penalty_date <=", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateLike(String value) {
            addCriterion("penalty_date like", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateNotLike(String value) {
            addCriterion("penalty_date not like", value, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateIn(List<String> values) {
            addCriterion("penalty_date in", values, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateNotIn(List<String> values) {
            addCriterion("penalty_date not in", values, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateBetween(String value1, String value2) {
            addCriterion("penalty_date between", value1, value2, "penaltyDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyDateNotBetween(String value1, String value2) {
            addCriterion("penalty_date not between", value1, value2, "penaltyDate");
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

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNull() {
            addCriterion("reg_no is null");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNotNull() {
            addCriterion("reg_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegNoEqualTo(String value) {
            addCriterion("reg_no =", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotEqualTo(String value) {
            addCriterion("reg_no <>", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThan(String value) {
            addCriterion("reg_no >", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("reg_no >=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThan(String value) {
            addCriterion("reg_no <", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThanOrEqualTo(String value) {
            addCriterion("reg_no <=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLike(String value) {
            addCriterion("reg_no like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotLike(String value) {
            addCriterion("reg_no not like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoIn(List<String> values) {
            addCriterion("reg_no in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotIn(List<String> values) {
            addCriterion("reg_no not in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoBetween(String value1, String value2) {
            addCriterion("reg_no between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotBetween(String value1, String value2) {
            addCriterion("reg_no not between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkIsNull() {
            addCriterion("ad_penalty_link is null");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkIsNotNull() {
            addCriterion("ad_penalty_link is not null");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkEqualTo(String value) {
            addCriterion("ad_penalty_link =", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkNotEqualTo(String value) {
            addCriterion("ad_penalty_link <>", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkGreaterThan(String value) {
            addCriterion("ad_penalty_link >", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ad_penalty_link >=", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkLessThan(String value) {
            addCriterion("ad_penalty_link <", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkLessThanOrEqualTo(String value) {
            addCriterion("ad_penalty_link <=", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkLike(String value) {
            addCriterion("ad_penalty_link like", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkNotLike(String value) {
            addCriterion("ad_penalty_link not like", value, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkIn(List<String> values) {
            addCriterion("ad_penalty_link in", values, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkNotIn(List<String> values) {
            addCriterion("ad_penalty_link not in", values, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkBetween(String value1, String value2) {
            addCriterion("ad_penalty_link between", value1, value2, "adPenaltyLink");
            return (Criteria) this;
        }

        public Criteria andAdPenaltyLinkNotBetween(String value1, String value2) {
            addCriterion("ad_penalty_link not between", value1, value2, "adPenaltyLink");
            return (Criteria) this;
        }
    }

    /**
     * 描述:qichacha_penalty表的实体类
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
     * qichacha_penalty 2018-01-20
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