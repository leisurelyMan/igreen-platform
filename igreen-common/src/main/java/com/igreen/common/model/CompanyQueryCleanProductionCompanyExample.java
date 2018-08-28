package com.igreen.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyQueryCleanProductionCompanyExample {
    /**
     * company_query_clean_production_company
     */
    protected String orderByClause;

    /**
     * company_query_clean_production_company
     */
    protected boolean distinct;

    /**
     * company_query_clean_production_company
     */
    protected List<Criteria> oredCriteria;

    public CompanyQueryCleanProductionCompanyExample() {
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
     * company_query_clean_production_company 2018-08-27
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

        public Criteria andCheckYearIsNull() {
            addCriterion("check_year is null");
            return (Criteria) this;
        }

        public Criteria andCheckYearIsNotNull() {
            addCriterion("check_year is not null");
            return (Criteria) this;
        }

        public Criteria andCheckYearEqualTo(String value) {
            addCriterion("check_year =", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearNotEqualTo(String value) {
            addCriterion("check_year <>", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearGreaterThan(String value) {
            addCriterion("check_year >", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearGreaterThanOrEqualTo(String value) {
            addCriterion("check_year >=", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearLessThan(String value) {
            addCriterion("check_year <", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearLessThanOrEqualTo(String value) {
            addCriterion("check_year <=", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearLike(String value) {
            addCriterion("check_year like", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearNotLike(String value) {
            addCriterion("check_year not like", value, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearIn(List<String> values) {
            addCriterion("check_year in", values, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearNotIn(List<String> values) {
            addCriterion("check_year not in", values, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearBetween(String value1, String value2) {
            addCriterion("check_year between", value1, value2, "checkYear");
            return (Criteria) this;
        }

        public Criteria andCheckYearNotBetween(String value1, String value2) {
            addCriterion("check_year not between", value1, value2, "checkYear");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
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

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(String value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(String value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(String value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(String value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(String value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(String value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLike(String value) {
            addCriterion("trade like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotLike(String value) {
            addCriterion("trade not like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<String> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<String> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(String value1, String value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(String value1, String value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountIsNull() {
            addCriterion("product_sales_amount is null");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountIsNotNull() {
            addCriterion("product_sales_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountEqualTo(String value) {
            addCriterion("product_sales_amount =", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountNotEqualTo(String value) {
            addCriterion("product_sales_amount <>", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountGreaterThan(String value) {
            addCriterion("product_sales_amount >", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountGreaterThanOrEqualTo(String value) {
            addCriterion("product_sales_amount >=", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountLessThan(String value) {
            addCriterion("product_sales_amount <", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountLessThanOrEqualTo(String value) {
            addCriterion("product_sales_amount <=", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountLike(String value) {
            addCriterion("product_sales_amount like", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountNotLike(String value) {
            addCriterion("product_sales_amount not like", value, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountIn(List<String> values) {
            addCriterion("product_sales_amount in", values, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountNotIn(List<String> values) {
            addCriterion("product_sales_amount not in", values, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountBetween(String value1, String value2) {
            addCriterion("product_sales_amount between", value1, value2, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andProductSalesAmountNotBetween(String value1, String value2) {
            addCriterion("product_sales_amount not between", value1, value2, "productSalesAmount");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
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

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(String value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(String value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(String value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(String value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(String value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLike(String value) {
            addCriterion("report_time like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotLike(String value) {
            addCriterion("report_time not like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<String> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<String> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(String value1, String value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(String value1, String value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeIsNull() {
            addCriterion("submit_check_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeIsNotNull() {
            addCriterion("submit_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeEqualTo(String value) {
            addCriterion("submit_check_time =", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeNotEqualTo(String value) {
            addCriterion("submit_check_time <>", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeGreaterThan(String value) {
            addCriterion("submit_check_time >", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("submit_check_time >=", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeLessThan(String value) {
            addCriterion("submit_check_time <", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("submit_check_time <=", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeLike(String value) {
            addCriterion("submit_check_time like", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeNotLike(String value) {
            addCriterion("submit_check_time not like", value, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeIn(List<String> values) {
            addCriterion("submit_check_time in", values, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeNotIn(List<String> values) {
            addCriterion("submit_check_time not in", values, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeBetween(String value1, String value2) {
            addCriterion("submit_check_time between", value1, value2, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andSubmitCheckTimeNotBetween(String value1, String value2) {
            addCriterion("submit_check_time not between", value1, value2, "submitCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeIsNull() {
            addCriterion("complete_estimate_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeIsNotNull() {
            addCriterion("complete_estimate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeEqualTo(String value) {
            addCriterion("complete_estimate_time =", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeNotEqualTo(String value) {
            addCriterion("complete_estimate_time <>", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeGreaterThan(String value) {
            addCriterion("complete_estimate_time >", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("complete_estimate_time >=", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeLessThan(String value) {
            addCriterion("complete_estimate_time <", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeLessThanOrEqualTo(String value) {
            addCriterion("complete_estimate_time <=", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeLike(String value) {
            addCriterion("complete_estimate_time like", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeNotLike(String value) {
            addCriterion("complete_estimate_time not like", value, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeIn(List<String> values) {
            addCriterion("complete_estimate_time in", values, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeNotIn(List<String> values) {
            addCriterion("complete_estimate_time not in", values, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeBetween(String value1, String value2) {
            addCriterion("complete_estimate_time between", value1, value2, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteEstimateTimeNotBetween(String value1, String value2) {
            addCriterion("complete_estimate_time not between", value1, value2, "completeEstimateTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeIsNull() {
            addCriterion("complete_check_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeIsNotNull() {
            addCriterion("complete_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeEqualTo(String value) {
            addCriterion("complete_check_time =", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeNotEqualTo(String value) {
            addCriterion("complete_check_time <>", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeGreaterThan(String value) {
            addCriterion("complete_check_time >", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("complete_check_time >=", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeLessThan(String value) {
            addCriterion("complete_check_time <", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("complete_check_time <=", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeLike(String value) {
            addCriterion("complete_check_time like", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeNotLike(String value) {
            addCriterion("complete_check_time not like", value, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeIn(List<String> values) {
            addCriterion("complete_check_time in", values, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeNotIn(List<String> values) {
            addCriterion("complete_check_time not in", values, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeBetween(String value1, String value2) {
            addCriterion("complete_check_time between", value1, value2, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCompleteCheckTimeNotBetween(String value1, String value2) {
            addCriterion("complete_check_time not between", value1, value2, "completeCheckTime");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationIsNull() {
            addCriterion("check_organization is null");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationIsNotNull() {
            addCriterion("check_organization is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationEqualTo(String value) {
            addCriterion("check_organization =", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationNotEqualTo(String value) {
            addCriterion("check_organization <>", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationGreaterThan(String value) {
            addCriterion("check_organization >", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("check_organization >=", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationLessThan(String value) {
            addCriterion("check_organization <", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationLessThanOrEqualTo(String value) {
            addCriterion("check_organization <=", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationLike(String value) {
            addCriterion("check_organization like", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationNotLike(String value) {
            addCriterion("check_organization not like", value, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationIn(List<String> values) {
            addCriterion("check_organization in", values, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationNotIn(List<String> values) {
            addCriterion("check_organization not in", values, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationBetween(String value1, String value2) {
            addCriterion("check_organization between", value1, value2, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCheckOrganizationNotBetween(String value1, String value2) {
            addCriterion("check_organization not between", value1, value2, "checkOrganization");
            return (Criteria) this;
        }

        public Criteria andCreateTmIsNull() {
            addCriterion("create_tm is null");
            return (Criteria) this;
        }

        public Criteria andCreateTmIsNotNull() {
            addCriterion("create_tm is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTmEqualTo(Date value) {
            addCriterion("create_tm =", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotEqualTo(Date value) {
            addCriterion("create_tm <>", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmGreaterThan(Date value) {
            addCriterion("create_tm >", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmGreaterThanOrEqualTo(Date value) {
            addCriterion("create_tm >=", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmLessThan(Date value) {
            addCriterion("create_tm <", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmLessThanOrEqualTo(Date value) {
            addCriterion("create_tm <=", value, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmIn(List<Date> values) {
            addCriterion("create_tm in", values, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotIn(List<Date> values) {
            addCriterion("create_tm not in", values, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmBetween(Date value1, Date value2) {
            addCriterion("create_tm between", value1, value2, "createTm");
            return (Criteria) this;
        }

        public Criteria andCreateTmNotBetween(Date value1, Date value2) {
            addCriterion("create_tm not between", value1, value2, "createTm");
            return (Criteria) this;
        }
    }

    /**
     * 描述:company_query_clean_production_company表的实体类
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
     * company_query_clean_production_company 2018-08-27
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