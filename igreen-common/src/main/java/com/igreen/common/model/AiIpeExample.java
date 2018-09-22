package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AiIpeExample {
    /**
     * ai_ipe
     */
    protected String orderByClause;

    /**
     * ai_ipe
     */
    protected boolean distinct;

    /**
     * ai_ipe
     */
    protected List<Criteria> oredCriteria;

    public AiIpeExample() {
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
     * ai_ipe 2018-09-22
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

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(String value) {
            addCriterion("fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(String value) {
            addCriterion("fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(String value) {
            addCriterion("fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(String value) {
            addCriterion("fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(String value) {
            addCriterion("fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(String value) {
            addCriterion("fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLike(String value) {
            addCriterion("fine like", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotLike(String value) {
            addCriterion("fine not like", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<String> values) {
            addCriterion("fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<String> values) {
            addCriterion("fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(String value1, String value2) {
            addCriterion("fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(String value1, String value2) {
            addCriterion("fine not between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andRevokedIsNull() {
            addCriterion("revoked is null");
            return (Criteria) this;
        }

        public Criteria andRevokedIsNotNull() {
            addCriterion("revoked is not null");
            return (Criteria) this;
        }

        public Criteria andRevokedEqualTo(String value) {
            addCriterion("revoked =", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedNotEqualTo(String value) {
            addCriterion("revoked <>", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedGreaterThan(String value) {
            addCriterion("revoked >", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedGreaterThanOrEqualTo(String value) {
            addCriterion("revoked >=", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedLessThan(String value) {
            addCriterion("revoked <", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedLessThanOrEqualTo(String value) {
            addCriterion("revoked <=", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedLike(String value) {
            addCriterion("revoked like", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedNotLike(String value) {
            addCriterion("revoked not like", value, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedIn(List<String> values) {
            addCriterion("revoked in", values, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedNotIn(List<String> values) {
            addCriterion("revoked not in", values, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedBetween(String value1, String value2) {
            addCriterion("revoked between", value1, value2, "revoked");
            return (Criteria) this;
        }

        public Criteria andRevokedNotBetween(String value1, String value2) {
            addCriterion("revoked not between", value1, value2, "revoked");
            return (Criteria) this;
        }

        public Criteria andConfiscateIsNull() {
            addCriterion("confiscate is null");
            return (Criteria) this;
        }

        public Criteria andConfiscateIsNotNull() {
            addCriterion("confiscate is not null");
            return (Criteria) this;
        }

        public Criteria andConfiscateEqualTo(String value) {
            addCriterion("confiscate =", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateNotEqualTo(String value) {
            addCriterion("confiscate <>", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateGreaterThan(String value) {
            addCriterion("confiscate >", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateGreaterThanOrEqualTo(String value) {
            addCriterion("confiscate >=", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateLessThan(String value) {
            addCriterion("confiscate <", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateLessThanOrEqualTo(String value) {
            addCriterion("confiscate <=", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateLike(String value) {
            addCriterion("confiscate like", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateNotLike(String value) {
            addCriterion("confiscate not like", value, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateIn(List<String> values) {
            addCriterion("confiscate in", values, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateNotIn(List<String> values) {
            addCriterion("confiscate not in", values, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateBetween(String value1, String value2) {
            addCriterion("confiscate between", value1, value2, "confiscate");
            return (Criteria) this;
        }

        public Criteria andConfiscateNotBetween(String value1, String value2) {
            addCriterion("confiscate not between", value1, value2, "confiscate");
            return (Criteria) this;
        }

        public Criteria andDetentionIsNull() {
            addCriterion("detention is null");
            return (Criteria) this;
        }

        public Criteria andDetentionIsNotNull() {
            addCriterion("detention is not null");
            return (Criteria) this;
        }

        public Criteria andDetentionEqualTo(String value) {
            addCriterion("detention =", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionNotEqualTo(String value) {
            addCriterion("detention <>", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionGreaterThan(String value) {
            addCriterion("detention >", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionGreaterThanOrEqualTo(String value) {
            addCriterion("detention >=", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionLessThan(String value) {
            addCriterion("detention <", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionLessThanOrEqualTo(String value) {
            addCriterion("detention <=", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionLike(String value) {
            addCriterion("detention like", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionNotLike(String value) {
            addCriterion("detention not like", value, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionIn(List<String> values) {
            addCriterion("detention in", values, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionNotIn(List<String> values) {
            addCriterion("detention not in", values, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionBetween(String value1, String value2) {
            addCriterion("detention between", value1, value2, "detention");
            return (Criteria) this;
        }

        public Criteria andDetentionNotBetween(String value1, String value2) {
            addCriterion("detention not between", value1, value2, "detention");
            return (Criteria) this;
        }

        public Criteria andProductionIsNull() {
            addCriterion("production is null");
            return (Criteria) this;
        }

        public Criteria andProductionIsNotNull() {
            addCriterion("production is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEqualTo(String value) {
            addCriterion("production =", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotEqualTo(String value) {
            addCriterion("production <>", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThan(String value) {
            addCriterion("production >", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThanOrEqualTo(String value) {
            addCriterion("production >=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThan(String value) {
            addCriterion("production <", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThanOrEqualTo(String value) {
            addCriterion("production <=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLike(String value) {
            addCriterion("production like", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotLike(String value) {
            addCriterion("production not like", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionIn(List<String> values) {
            addCriterion("production in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotIn(List<String> values) {
            addCriterion("production not in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionBetween(String value1, String value2) {
            addCriterion("production between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotBetween(String value1, String value2) {
            addCriterion("production not between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andInstructIsNull() {
            addCriterion("instruct is null");
            return (Criteria) this;
        }

        public Criteria andInstructIsNotNull() {
            addCriterion("instruct is not null");
            return (Criteria) this;
        }

        public Criteria andInstructEqualTo(String value) {
            addCriterion("instruct =", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructNotEqualTo(String value) {
            addCriterion("instruct <>", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructGreaterThan(String value) {
            addCriterion("instruct >", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructGreaterThanOrEqualTo(String value) {
            addCriterion("instruct >=", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructLessThan(String value) {
            addCriterion("instruct <", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructLessThanOrEqualTo(String value) {
            addCriterion("instruct <=", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructLike(String value) {
            addCriterion("instruct like", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructNotLike(String value) {
            addCriterion("instruct not like", value, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructIn(List<String> values) {
            addCriterion("instruct in", values, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructNotIn(List<String> values) {
            addCriterion("instruct not in", values, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructBetween(String value1, String value2) {
            addCriterion("instruct between", value1, value2, "instruct");
            return (Criteria) this;
        }

        public Criteria andInstructNotBetween(String value1, String value2) {
            addCriterion("instruct not between", value1, value2, "instruct");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNull() {
            addCriterion("total_sum is null");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNotNull() {
            addCriterion("total_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSumEqualTo(String value) {
            addCriterion("total_sum =", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotEqualTo(String value) {
            addCriterion("total_sum <>", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThan(String value) {
            addCriterion("total_sum >", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThanOrEqualTo(String value) {
            addCriterion("total_sum >=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThan(String value) {
            addCriterion("total_sum <", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThanOrEqualTo(String value) {
            addCriterion("total_sum <=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLike(String value) {
            addCriterion("total_sum like", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotLike(String value) {
            addCriterion("total_sum not like", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumIn(List<String> values) {
            addCriterion("total_sum in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotIn(List<String> values) {
            addCriterion("total_sum not in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumBetween(String value1, String value2) {
            addCriterion("total_sum between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotBetween(String value1, String value2) {
            addCriterion("total_sum not between", value1, value2, "totalSum");
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
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:ai_ipe表的实体类
     * @version
     * @author:  panjingxiao
     * @创建时间: 2018-09-22
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ai_ipe 2018-09-22
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