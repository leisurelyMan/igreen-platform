package com.igreen.common.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyQueryQichachaJudgementExample {
    /**
     * company_query_qichacha_judgement
     */
    protected String orderByClause;

    /**
     * company_query_qichacha_judgement
     */
    protected boolean distinct;

    /**
     * company_query_qichacha_judgement
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryQichachaJudgementExample() {
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
     * company_query_qichacha_judgement 2018-09-20
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

        public Criteria andJudgementIdIsNull() {
            addCriterion("judgement_id is null");
            return (Criteria) this;
        }

        public Criteria andJudgementIdIsNotNull() {
            addCriterion("judgement_id is not null");
            return (Criteria) this;
        }

        public Criteria andJudgementIdEqualTo(String value) {
            addCriterion("judgement_id =", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdNotEqualTo(String value) {
            addCriterion("judgement_id <>", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdGreaterThan(String value) {
            addCriterion("judgement_id >", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdGreaterThanOrEqualTo(String value) {
            addCriterion("judgement_id >=", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdLessThan(String value) {
            addCriterion("judgement_id <", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdLessThanOrEqualTo(String value) {
            addCriterion("judgement_id <=", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdLike(String value) {
            addCriterion("judgement_id like", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdNotLike(String value) {
            addCriterion("judgement_id not like", value, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdIn(List<String> values) {
            addCriterion("judgement_id in", values, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdNotIn(List<String> values) {
            addCriterion("judgement_id not in", values, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdBetween(String value1, String value2) {
            addCriterion("judgement_id between", value1, value2, "judgementId");
            return (Criteria) this;
        }

        public Criteria andJudgementIdNotBetween(String value1, String value2) {
            addCriterion("judgement_id not between", value1, value2, "judgementId");
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andCourtIsNull() {
            addCriterion("court is null");
            return (Criteria) this;
        }

        public Criteria andCourtIsNotNull() {
            addCriterion("court is not null");
            return (Criteria) this;
        }

        public Criteria andCourtEqualTo(String value) {
            addCriterion("court =", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotEqualTo(String value) {
            addCriterion("court <>", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThan(String value) {
            addCriterion("court >", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThanOrEqualTo(String value) {
            addCriterion("court >=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThan(String value) {
            addCriterion("court <", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThanOrEqualTo(String value) {
            addCriterion("court <=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLike(String value) {
            addCriterion("court like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotLike(String value) {
            addCriterion("court not like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtIn(List<String> values) {
            addCriterion("court in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotIn(List<String> values) {
            addCriterion("court not in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtBetween(String value1, String value2) {
            addCriterion("court between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotBetween(String value1, String value2) {
            addCriterion("court not between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNull() {
            addCriterion("case_name is null");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNotNull() {
            addCriterion("case_name is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNameEqualTo(String value) {
            addCriterion("case_name =", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotEqualTo(String value) {
            addCriterion("case_name <>", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThan(String value) {
            addCriterion("case_name >", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("case_name >=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThan(String value) {
            addCriterion("case_name <", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThanOrEqualTo(String value) {
            addCriterion("case_name <=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLike(String value) {
            addCriterion("case_name like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotLike(String value) {
            addCriterion("case_name not like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameIn(List<String> values) {
            addCriterion("case_name in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotIn(List<String> values) {
            addCriterion("case_name not in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameBetween(String value1, String value2) {
            addCriterion("case_name between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotBetween(String value1, String value2) {
            addCriterion("case_name not between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNull() {
            addCriterion("case_no is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("case_no is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("case_no =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("case_no <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("case_no >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("case_no >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("case_no <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("case_no <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("case_no like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("case_no not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("case_no in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("case_no not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("case_no between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("case_no not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNull() {
            addCriterion("case_type is null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNotNull() {
            addCriterion("case_type is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeEqualTo(String value) {
            addCriterion("case_type =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(String value) {
            addCriterion("case_type <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(String value) {
            addCriterion("case_type >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("case_type >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(String value) {
            addCriterion("case_type <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(String value) {
            addCriterion("case_type <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLike(String value) {
            addCriterion("case_type like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotLike(String value) {
            addCriterion("case_type not like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<String> values) {
            addCriterion("case_type in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<String> values) {
            addCriterion("case_type not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(String value1, String value2) {
            addCriterion("case_type between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(String value1, String value2) {
            addCriterion("case_type not between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(String value) {
            addCriterion("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(String value) {
            addCriterion("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(String value) {
            addCriterion("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(String value) {
            addCriterion("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(String value) {
            addCriterion("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(String value) {
            addCriterion("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLike(String value) {
            addCriterion("submit_date like", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotLike(String value) {
            addCriterion("submit_date not like", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<String> values) {
            addCriterion("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<String> values) {
            addCriterion("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(String value1, String value2) {
            addCriterion("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(String value1, String value2) {
            addCriterion("submit_date not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorIsNull() {
            addCriterion("is_prosecutor is null");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorIsNotNull() {
            addCriterion("is_prosecutor is not null");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorEqualTo(String value) {
            addCriterion("is_prosecutor =", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorNotEqualTo(String value) {
            addCriterion("is_prosecutor <>", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorGreaterThan(String value) {
            addCriterion("is_prosecutor >", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorGreaterThanOrEqualTo(String value) {
            addCriterion("is_prosecutor >=", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorLessThan(String value) {
            addCriterion("is_prosecutor <", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorLessThanOrEqualTo(String value) {
            addCriterion("is_prosecutor <=", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorLike(String value) {
            addCriterion("is_prosecutor like", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorNotLike(String value) {
            addCriterion("is_prosecutor not like", value, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorIn(List<String> values) {
            addCriterion("is_prosecutor in", values, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorNotIn(List<String> values) {
            addCriterion("is_prosecutor not in", values, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorBetween(String value1, String value2) {
            addCriterion("is_prosecutor between", value1, value2, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsProsecutorNotBetween(String value1, String value2) {
            addCriterion("is_prosecutor not between", value1, value2, "isProsecutor");
            return (Criteria) this;
        }

        public Criteria andIsDefendantIsNull() {
            addCriterion("is_defendant is null");
            return (Criteria) this;
        }

        public Criteria andIsDefendantIsNotNull() {
            addCriterion("is_defendant is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefendantEqualTo(String value) {
            addCriterion("is_defendant =", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantNotEqualTo(String value) {
            addCriterion("is_defendant <>", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantGreaterThan(String value) {
            addCriterion("is_defendant >", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantGreaterThanOrEqualTo(String value) {
            addCriterion("is_defendant >=", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantLessThan(String value) {
            addCriterion("is_defendant <", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantLessThanOrEqualTo(String value) {
            addCriterion("is_defendant <=", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantLike(String value) {
            addCriterion("is_defendant like", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantNotLike(String value) {
            addCriterion("is_defendant not like", value, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantIn(List<String> values) {
            addCriterion("is_defendant in", values, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantNotIn(List<String> values) {
            addCriterion("is_defendant not in", values, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantBetween(String value1, String value2) {
            addCriterion("is_defendant between", value1, value2, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andIsDefendantNotBetween(String value1, String value2) {
            addCriterion("is_defendant not between", value1, value2, "isDefendant");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("update_date like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("update_date not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCourtYearIsNull() {
            addCriterion("court_year is null");
            return (Criteria) this;
        }

        public Criteria andCourtYearIsNotNull() {
            addCriterion("court_year is not null");
            return (Criteria) this;
        }

        public Criteria andCourtYearEqualTo(String value) {
            addCriterion("court_year =", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearNotEqualTo(String value) {
            addCriterion("court_year <>", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearGreaterThan(String value) {
            addCriterion("court_year >", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearGreaterThanOrEqualTo(String value) {
            addCriterion("court_year >=", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearLessThan(String value) {
            addCriterion("court_year <", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearLessThanOrEqualTo(String value) {
            addCriterion("court_year <=", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearLike(String value) {
            addCriterion("court_year like", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearNotLike(String value) {
            addCriterion("court_year not like", value, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearIn(List<String> values) {
            addCriterion("court_year in", values, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearNotIn(List<String> values) {
            addCriterion("court_year not in", values, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearBetween(String value1, String value2) {
            addCriterion("court_year between", value1, value2, "courtYear");
            return (Criteria) this;
        }

        public Criteria andCourtYearNotBetween(String value1, String value2) {
            addCriterion("court_year not between", value1, value2, "courtYear");
            return (Criteria) this;
        }
    }

    /**
     * 描述:company_query_qichacha_judgement表的实体类
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
     * company_query_qichacha_judgement 2018-09-20
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