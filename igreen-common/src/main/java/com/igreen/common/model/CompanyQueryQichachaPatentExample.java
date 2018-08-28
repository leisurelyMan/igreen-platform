package com.igreen.common.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyQueryQichachaPatentExample {
    /**
     * company_query_qichacha_patent
     */
    protected String orderByClause;

    /**
     * company_query_qichacha_patent
     */
    protected boolean distinct;

    /**
     * company_query_qichacha_patent
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryQichachaPatentExample() {
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
     * company_query_qichacha_patent 2018-08-27
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

        public Criteria andKeyNopIsNull() {
            addCriterion("key_nop is null");
            return (Criteria) this;
        }

        public Criteria andKeyNopIsNotNull() {
            addCriterion("key_nop is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNopEqualTo(String value) {
            addCriterion("key_nop =", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopNotEqualTo(String value) {
            addCriterion("key_nop <>", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopGreaterThan(String value) {
            addCriterion("key_nop >", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopGreaterThanOrEqualTo(String value) {
            addCriterion("key_nop >=", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopLessThan(String value) {
            addCriterion("key_nop <", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopLessThanOrEqualTo(String value) {
            addCriterion("key_nop <=", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopLike(String value) {
            addCriterion("key_nop like", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopNotLike(String value) {
            addCriterion("key_nop not like", value, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopIn(List<String> values) {
            addCriterion("key_nop in", values, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopNotIn(List<String> values) {
            addCriterion("key_nop not in", values, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopBetween(String value1, String value2) {
            addCriterion("key_nop between", value1, value2, "keyNop");
            return (Criteria) this;
        }

        public Criteria andKeyNopNotBetween(String value1, String value2) {
            addCriterion("key_nop not between", value1, value2, "keyNop");
            return (Criteria) this;
        }

        public Criteria andIpcListIsNull() {
            addCriterion("ipc_list is null");
            return (Criteria) this;
        }

        public Criteria andIpcListIsNotNull() {
            addCriterion("ipc_list is not null");
            return (Criteria) this;
        }

        public Criteria andIpcListEqualTo(String value) {
            addCriterion("ipc_list =", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListNotEqualTo(String value) {
            addCriterion("ipc_list <>", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListGreaterThan(String value) {
            addCriterion("ipc_list >", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListGreaterThanOrEqualTo(String value) {
            addCriterion("ipc_list >=", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListLessThan(String value) {
            addCriterion("ipc_list <", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListLessThanOrEqualTo(String value) {
            addCriterion("ipc_list <=", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListLike(String value) {
            addCriterion("ipc_list like", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListNotLike(String value) {
            addCriterion("ipc_list not like", value, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListIn(List<String> values) {
            addCriterion("ipc_list in", values, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListNotIn(List<String> values) {
            addCriterion("ipc_list not in", values, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListBetween(String value1, String value2) {
            addCriterion("ipc_list between", value1, value2, "ipcList");
            return (Criteria) this;
        }

        public Criteria andIpcListNotBetween(String value1, String value2) {
            addCriterion("ipc_list not between", value1, value2, "ipcList");
            return (Criteria) this;
        }

        public Criteria andKindCodeIsNull() {
            addCriterion("kind_code is null");
            return (Criteria) this;
        }

        public Criteria andKindCodeIsNotNull() {
            addCriterion("kind_code is not null");
            return (Criteria) this;
        }

        public Criteria andKindCodeEqualTo(String value) {
            addCriterion("kind_code =", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotEqualTo(String value) {
            addCriterion("kind_code <>", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeGreaterThan(String value) {
            addCriterion("kind_code >", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("kind_code >=", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLessThan(String value) {
            addCriterion("kind_code <", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLessThanOrEqualTo(String value) {
            addCriterion("kind_code <=", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeLike(String value) {
            addCriterion("kind_code like", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotLike(String value) {
            addCriterion("kind_code not like", value, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeIn(List<String> values) {
            addCriterion("kind_code in", values, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotIn(List<String> values) {
            addCriterion("kind_code not in", values, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeBetween(String value1, String value2) {
            addCriterion("kind_code between", value1, value2, "kindCode");
            return (Criteria) this;
        }

        public Criteria andKindCodeNotBetween(String value1, String value2) {
            addCriterion("kind_code not between", value1, value2, "kindCode");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberIsNull() {
            addCriterion("application_number is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberIsNotNull() {
            addCriterion("application_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberEqualTo(String value) {
            addCriterion("application_number =", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberNotEqualTo(String value) {
            addCriterion("application_number <>", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberGreaterThan(String value) {
            addCriterion("application_number >", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("application_number >=", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberLessThan(String value) {
            addCriterion("application_number <", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberLessThanOrEqualTo(String value) {
            addCriterion("application_number <=", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberLike(String value) {
            addCriterion("application_number like", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberNotLike(String value) {
            addCriterion("application_number not like", value, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberIn(List<String> values) {
            addCriterion("application_number in", values, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberNotIn(List<String> values) {
            addCriterion("application_number not in", values, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberBetween(String value1, String value2) {
            addCriterion("application_number between", value1, value2, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationNumberNotBetween(String value1, String value2) {
            addCriterion("application_number not between", value1, value2, "applicationNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNull() {
            addCriterion("application_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNotNull() {
            addCriterion("application_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateEqualTo(String value) {
            addCriterion("application_date =", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotEqualTo(String value) {
            addCriterion("application_date <>", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThan(String value) {
            addCriterion("application_date >", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThanOrEqualTo(String value) {
            addCriterion("application_date >=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThan(String value) {
            addCriterion("application_date <", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThanOrEqualTo(String value) {
            addCriterion("application_date <=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLike(String value) {
            addCriterion("application_date like", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotLike(String value) {
            addCriterion("application_date not like", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIn(List<String> values) {
            addCriterion("application_date in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotIn(List<String> values) {
            addCriterion("application_date not in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateBetween(String value1, String value2) {
            addCriterion("application_date between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotBetween(String value1, String value2) {
            addCriterion("application_date not between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberIsNull() {
            addCriterion("publication_number is null");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberIsNotNull() {
            addCriterion("publication_number is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberEqualTo(String value) {
            addCriterion("publication_number =", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberNotEqualTo(String value) {
            addCriterion("publication_number <>", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberGreaterThan(String value) {
            addCriterion("publication_number >", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("publication_number >=", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberLessThan(String value) {
            addCriterion("publication_number <", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberLessThanOrEqualTo(String value) {
            addCriterion("publication_number <=", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberLike(String value) {
            addCriterion("publication_number like", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberNotLike(String value) {
            addCriterion("publication_number not like", value, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberIn(List<String> values) {
            addCriterion("publication_number in", values, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberNotIn(List<String> values) {
            addCriterion("publication_number not in", values, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberBetween(String value1, String value2) {
            addCriterion("publication_number between", value1, value2, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationNumberNotBetween(String value1, String value2) {
            addCriterion("publication_number not between", value1, value2, "publicationNumber");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNull() {
            addCriterion("publication_date is null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIsNotNull() {
            addCriterion("publication_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationDateEqualTo(String value) {
            addCriterion("publication_date =", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotEqualTo(String value) {
            addCriterion("publication_date <>", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThan(String value) {
            addCriterion("publication_date >", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateGreaterThanOrEqualTo(String value) {
            addCriterion("publication_date >=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThan(String value) {
            addCriterion("publication_date <", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLessThanOrEqualTo(String value) {
            addCriterion("publication_date <=", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateLike(String value) {
            addCriterion("publication_date like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotLike(String value) {
            addCriterion("publication_date not like", value, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateIn(List<String> values) {
            addCriterion("publication_date in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotIn(List<String> values) {
            addCriterion("publication_date not in", values, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateBetween(String value1, String value2) {
            addCriterion("publication_date between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andPublicationDateNotBetween(String value1, String value2) {
            addCriterion("publication_date not between", value1, value2, "publicationDate");
            return (Criteria) this;
        }

        public Criteria andLegalStatusIsNull() {
            addCriterion("legal_status is null");
            return (Criteria) this;
        }

        public Criteria andLegalStatusIsNotNull() {
            addCriterion("legal_status is not null");
            return (Criteria) this;
        }

        public Criteria andLegalStatusEqualTo(String value) {
            addCriterion("legal_status =", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotEqualTo(String value) {
            addCriterion("legal_status <>", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusGreaterThan(String value) {
            addCriterion("legal_status >", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("legal_status >=", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLessThan(String value) {
            addCriterion("legal_status <", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLessThanOrEqualTo(String value) {
            addCriterion("legal_status <=", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusLike(String value) {
            addCriterion("legal_status like", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotLike(String value) {
            addCriterion("legal_status not like", value, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusIn(List<String> values) {
            addCriterion("legal_status in", values, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotIn(List<String> values) {
            addCriterion("legal_status not in", values, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusBetween(String value1, String value2) {
            addCriterion("legal_status between", value1, value2, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusNotBetween(String value1, String value2) {
            addCriterion("legal_status not between", value1, value2, "legalStatus");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescIsNull() {
            addCriterion("legal_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescIsNotNull() {
            addCriterion("legal_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescEqualTo(String value) {
            addCriterion("legal_status_desc =", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescNotEqualTo(String value) {
            addCriterion("legal_status_desc <>", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescGreaterThan(String value) {
            addCriterion("legal_status_desc >", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("legal_status_desc >=", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescLessThan(String value) {
            addCriterion("legal_status_desc <", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescLessThanOrEqualTo(String value) {
            addCriterion("legal_status_desc <=", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescLike(String value) {
            addCriterion("legal_status_desc like", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescNotLike(String value) {
            addCriterion("legal_status_desc not like", value, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescIn(List<String> values) {
            addCriterion("legal_status_desc in", values, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescNotIn(List<String> values) {
            addCriterion("legal_status_desc not in", values, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescBetween(String value1, String value2) {
            addCriterion("legal_status_desc between", value1, value2, "legalStatusDesc");
            return (Criteria) this;
        }

        public Criteria andLegalStatusDescNotBetween(String value1, String value2) {
            addCriterion("legal_status_desc not between", value1, value2, "legalStatusDesc");
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

        public Criteria andAgencyIsNull() {
            addCriterion("agency is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIsNotNull() {
            addCriterion("agency is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyEqualTo(String value) {
            addCriterion("agency =", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotEqualTo(String value) {
            addCriterion("agency <>", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThan(String value) {
            addCriterion("agency >", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("agency >=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThan(String value) {
            addCriterion("agency <", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLessThanOrEqualTo(String value) {
            addCriterion("agency <=", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyLike(String value) {
            addCriterion("agency like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotLike(String value) {
            addCriterion("agency not like", value, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyIn(List<String> values) {
            addCriterion("agency in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotIn(List<String> values) {
            addCriterion("agency not in", values, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyBetween(String value1, String value2) {
            addCriterion("agency between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andAgencyNotBetween(String value1, String value2) {
            addCriterion("agency not between", value1, value2, "agency");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescIsNull() {
            addCriterion("kind_code_desc is null");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescIsNotNull() {
            addCriterion("kind_code_desc is not null");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescEqualTo(String value) {
            addCriterion("kind_code_desc =", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescNotEqualTo(String value) {
            addCriterion("kind_code_desc <>", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescGreaterThan(String value) {
            addCriterion("kind_code_desc >", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescGreaterThanOrEqualTo(String value) {
            addCriterion("kind_code_desc >=", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescLessThan(String value) {
            addCriterion("kind_code_desc <", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescLessThanOrEqualTo(String value) {
            addCriterion("kind_code_desc <=", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescLike(String value) {
            addCriterion("kind_code_desc like", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescNotLike(String value) {
            addCriterion("kind_code_desc not like", value, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescIn(List<String> values) {
            addCriterion("kind_code_desc in", values, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescNotIn(List<String> values) {
            addCriterion("kind_code_desc not in", values, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescBetween(String value1, String value2) {
            addCriterion("kind_code_desc between", value1, value2, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andKindCodeDescNotBetween(String value1, String value2) {
            addCriterion("kind_code_desc not between", value1, value2, "kindCodeDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescIsNull() {
            addCriterion("ipc_desc is null");
            return (Criteria) this;
        }

        public Criteria andIpcDescIsNotNull() {
            addCriterion("ipc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIpcDescEqualTo(String value) {
            addCriterion("ipc_desc =", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescNotEqualTo(String value) {
            addCriterion("ipc_desc <>", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescGreaterThan(String value) {
            addCriterion("ipc_desc >", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescGreaterThanOrEqualTo(String value) {
            addCriterion("ipc_desc >=", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescLessThan(String value) {
            addCriterion("ipc_desc <", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescLessThanOrEqualTo(String value) {
            addCriterion("ipc_desc <=", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescLike(String value) {
            addCriterion("ipc_desc like", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescNotLike(String value) {
            addCriterion("ipc_desc not like", value, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescIn(List<String> values) {
            addCriterion("ipc_desc in", values, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescNotIn(List<String> values) {
            addCriterion("ipc_desc not in", values, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescBetween(String value1, String value2) {
            addCriterion("ipc_desc between", value1, value2, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andIpcDescNotBetween(String value1, String value2) {
            addCriterion("ipc_desc not between", value1, value2, "ipcDesc");
            return (Criteria) this;
        }

        public Criteria andInventorStringListIsNull() {
            addCriterion("inventor_string_list is null");
            return (Criteria) this;
        }

        public Criteria andInventorStringListIsNotNull() {
            addCriterion("inventor_string_list is not null");
            return (Criteria) this;
        }

        public Criteria andInventorStringListEqualTo(String value) {
            addCriterion("inventor_string_list =", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListNotEqualTo(String value) {
            addCriterion("inventor_string_list <>", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListGreaterThan(String value) {
            addCriterion("inventor_string_list >", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListGreaterThanOrEqualTo(String value) {
            addCriterion("inventor_string_list >=", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListLessThan(String value) {
            addCriterion("inventor_string_list <", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListLessThanOrEqualTo(String value) {
            addCriterion("inventor_string_list <=", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListLike(String value) {
            addCriterion("inventor_string_list like", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListNotLike(String value) {
            addCriterion("inventor_string_list not like", value, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListIn(List<String> values) {
            addCriterion("inventor_string_list in", values, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListNotIn(List<String> values) {
            addCriterion("inventor_string_list not in", values, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListBetween(String value1, String value2) {
            addCriterion("inventor_string_list between", value1, value2, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andInventorStringListNotBetween(String value1, String value2) {
            addCriterion("inventor_string_list not between", value1, value2, "inventorStringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListIsNull() {
            addCriterion("assigneestring_list is null");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListIsNotNull() {
            addCriterion("assigneestring_list is not null");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListEqualTo(String value) {
            addCriterion("assigneestring_list =", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListNotEqualTo(String value) {
            addCriterion("assigneestring_list <>", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListGreaterThan(String value) {
            addCriterion("assigneestring_list >", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListGreaterThanOrEqualTo(String value) {
            addCriterion("assigneestring_list >=", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListLessThan(String value) {
            addCriterion("assigneestring_list <", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListLessThanOrEqualTo(String value) {
            addCriterion("assigneestring_list <=", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListLike(String value) {
            addCriterion("assigneestring_list like", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListNotLike(String value) {
            addCriterion("assigneestring_list not like", value, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListIn(List<String> values) {
            addCriterion("assigneestring_list in", values, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListNotIn(List<String> values) {
            addCriterion("assigneestring_list not in", values, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListBetween(String value1, String value2) {
            addCriterion("assigneestring_list between", value1, value2, "assigneestringList");
            return (Criteria) this;
        }

        public Criteria andAssigneestringListNotBetween(String value1, String value2) {
            addCriterion("assigneestring_list not between", value1, value2, "assigneestringList");
            return (Criteria) this;
        }
    }

    /**
     * 描述:company_query_qichacha_patent表的实体类
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
     * company_query_qichacha_patent 2018-08-27
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