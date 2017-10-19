package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterionForJDBCDate("creatTime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creatTime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creatTime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creatTime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterionForJDBCDate("creatTime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creatTime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterionForJDBCDate("creatTime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creatTime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creatTime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creatTime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdIsNull() {
            addCriterion("oldManAccount_id is null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdIsNotNull() {
            addCriterion("oldManAccount_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdEqualTo(Integer value) {
            addCriterion("oldManAccount_id =", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdNotEqualTo(Integer value) {
            addCriterion("oldManAccount_id <>", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdGreaterThan(Integer value) {
            addCriterion("oldManAccount_id >", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldManAccount_id >=", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdLessThan(Integer value) {
            addCriterion("oldManAccount_id <", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldManAccount_id <=", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdIn(List<Integer> values) {
            addCriterion("oldManAccount_id in", values, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdNotIn(List<Integer> values) {
            addCriterion("oldManAccount_id not in", values, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdBetween(Integer value1, Integer value2) {
            addCriterion("oldManAccount_id between", value1, value2, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldManAccount_id not between", value1, value2, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressIsNull() {
            addCriterion("harvestAddress is null");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressIsNotNull() {
            addCriterion("harvestAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressEqualTo(String value) {
            addCriterion("harvestAddress =", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressNotEqualTo(String value) {
            addCriterion("harvestAddress <>", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressGreaterThan(String value) {
            addCriterion("harvestAddress >", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressGreaterThanOrEqualTo(String value) {
            addCriterion("harvestAddress >=", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressLessThan(String value) {
            addCriterion("harvestAddress <", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressLessThanOrEqualTo(String value) {
            addCriterion("harvestAddress <=", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressLike(String value) {
            addCriterion("harvestAddress like", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressNotLike(String value) {
            addCriterion("harvestAddress not like", value, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressIn(List<String> values) {
            addCriterion("harvestAddress in", values, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressNotIn(List<String> values) {
            addCriterion("harvestAddress not in", values, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressBetween(String value1, String value2) {
            addCriterion("harvestAddress between", value1, value2, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andHarvestaddressNotBetween(String value1, String value2) {
            addCriterion("harvestAddress not between", value1, value2, "harvestaddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneIsNull() {
            addCriterion("consigneePhone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneIsNotNull() {
            addCriterion("consigneePhone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneEqualTo(String value) {
            addCriterion("consigneePhone =", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneNotEqualTo(String value) {
            addCriterion("consigneePhone <>", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneGreaterThan(String value) {
            addCriterion("consigneePhone >", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneGreaterThanOrEqualTo(String value) {
            addCriterion("consigneePhone >=", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneLessThan(String value) {
            addCriterion("consigneePhone <", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneLessThanOrEqualTo(String value) {
            addCriterion("consigneePhone <=", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneLike(String value) {
            addCriterion("consigneePhone like", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneNotLike(String value) {
            addCriterion("consigneePhone not like", value, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneIn(List<String> values) {
            addCriterion("consigneePhone in", values, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneNotIn(List<String> values) {
            addCriterion("consigneePhone not in", values, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneBetween(String value1, String value2) {
            addCriterion("consigneePhone between", value1, value2, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andConsigneephoneNotBetween(String value1, String value2) {
            addCriterion("consigneePhone not between", value1, value2, "consigneephone");
            return (Criteria) this;
        }

        public Criteria andShipperIsNull() {
            addCriterion("shipper is null");
            return (Criteria) this;
        }

        public Criteria andShipperIsNotNull() {
            addCriterion("shipper is not null");
            return (Criteria) this;
        }

        public Criteria andShipperEqualTo(String value) {
            addCriterion("shipper =", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotEqualTo(String value) {
            addCriterion("shipper <>", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperGreaterThan(String value) {
            addCriterion("shipper >", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperGreaterThanOrEqualTo(String value) {
            addCriterion("shipper >=", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperLessThan(String value) {
            addCriterion("shipper <", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperLessThanOrEqualTo(String value) {
            addCriterion("shipper <=", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperLike(String value) {
            addCriterion("shipper like", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotLike(String value) {
            addCriterion("shipper not like", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperIn(List<String> values) {
            addCriterion("shipper in", values, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotIn(List<String> values) {
            addCriterion("shipper not in", values, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperBetween(String value1, String value2) {
            addCriterion("shipper between", value1, value2, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotBetween(String value1, String value2) {
            addCriterion("shipper not between", value1, value2, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperphoneIsNull() {
            addCriterion("shipperPhone is null");
            return (Criteria) this;
        }

        public Criteria andShipperphoneIsNotNull() {
            addCriterion("shipperPhone is not null");
            return (Criteria) this;
        }

        public Criteria andShipperphoneEqualTo(String value) {
            addCriterion("shipperPhone =", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneNotEqualTo(String value) {
            addCriterion("shipperPhone <>", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneGreaterThan(String value) {
            addCriterion("shipperPhone >", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneGreaterThanOrEqualTo(String value) {
            addCriterion("shipperPhone >=", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneLessThan(String value) {
            addCriterion("shipperPhone <", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneLessThanOrEqualTo(String value) {
            addCriterion("shipperPhone <=", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneLike(String value) {
            addCriterion("shipperPhone like", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneNotLike(String value) {
            addCriterion("shipperPhone not like", value, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneIn(List<String> values) {
            addCriterion("shipperPhone in", values, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneNotIn(List<String> values) {
            addCriterion("shipperPhone not in", values, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneBetween(String value1, String value2) {
            addCriterion("shipperPhone between", value1, value2, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andShipperphoneNotBetween(String value1, String value2) {
            addCriterion("shipperPhone not between", value1, value2, "shipperphone");
            return (Criteria) this;
        }

        public Criteria andFormulawayIsNull() {
            addCriterion("formulaWay is null");
            return (Criteria) this;
        }

        public Criteria andFormulawayIsNotNull() {
            addCriterion("formulaWay is not null");
            return (Criteria) this;
        }

        public Criteria andFormulawayEqualTo(String value) {
            addCriterion("formulaWay =", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayNotEqualTo(String value) {
            addCriterion("formulaWay <>", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayGreaterThan(String value) {
            addCriterion("formulaWay >", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayGreaterThanOrEqualTo(String value) {
            addCriterion("formulaWay >=", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayLessThan(String value) {
            addCriterion("formulaWay <", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayLessThanOrEqualTo(String value) {
            addCriterion("formulaWay <=", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayLike(String value) {
            addCriterion("formulaWay like", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayNotLike(String value) {
            addCriterion("formulaWay not like", value, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayIn(List<String> values) {
            addCriterion("formulaWay in", values, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayNotIn(List<String> values) {
            addCriterion("formulaWay not in", values, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayBetween(String value1, String value2) {
            addCriterion("formulaWay between", value1, value2, "formulaway");
            return (Criteria) this;
        }

        public Criteria andFormulawayNotBetween(String value1, String value2) {
            addCriterion("formulaWay not between", value1, value2, "formulaway");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Double value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Double value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Double value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Double value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Double value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Double> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Double> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Double value1, Double value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Double value1, Double value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andOrders1IsNull() {
            addCriterion("orders1 is null");
            return (Criteria) this;
        }

        public Criteria andOrders1IsNotNull() {
            addCriterion("orders1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders1EqualTo(String value) {
            addCriterion("orders1 =", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1NotEqualTo(String value) {
            addCriterion("orders1 <>", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1GreaterThan(String value) {
            addCriterion("orders1 >", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1GreaterThanOrEqualTo(String value) {
            addCriterion("orders1 >=", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1LessThan(String value) {
            addCriterion("orders1 <", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1LessThanOrEqualTo(String value) {
            addCriterion("orders1 <=", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1Like(String value) {
            addCriterion("orders1 like", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1NotLike(String value) {
            addCriterion("orders1 not like", value, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1In(List<String> values) {
            addCriterion("orders1 in", values, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1NotIn(List<String> values) {
            addCriterion("orders1 not in", values, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1Between(String value1, String value2) {
            addCriterion("orders1 between", value1, value2, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders1NotBetween(String value1, String value2) {
            addCriterion("orders1 not between", value1, value2, "orders1");
            return (Criteria) this;
        }

        public Criteria andOrders2IsNull() {
            addCriterion("orders2 is null");
            return (Criteria) this;
        }

        public Criteria andOrders2IsNotNull() {
            addCriterion("orders2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders2EqualTo(String value) {
            addCriterion("orders2 =", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2NotEqualTo(String value) {
            addCriterion("orders2 <>", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2GreaterThan(String value) {
            addCriterion("orders2 >", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2GreaterThanOrEqualTo(String value) {
            addCriterion("orders2 >=", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2LessThan(String value) {
            addCriterion("orders2 <", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2LessThanOrEqualTo(String value) {
            addCriterion("orders2 <=", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2Like(String value) {
            addCriterion("orders2 like", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2NotLike(String value) {
            addCriterion("orders2 not like", value, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2In(List<String> values) {
            addCriterion("orders2 in", values, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2NotIn(List<String> values) {
            addCriterion("orders2 not in", values, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2Between(String value1, String value2) {
            addCriterion("orders2 between", value1, value2, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders2NotBetween(String value1, String value2) {
            addCriterion("orders2 not between", value1, value2, "orders2");
            return (Criteria) this;
        }

        public Criteria andOrders3IsNull() {
            addCriterion("orders3 is null");
            return (Criteria) this;
        }

        public Criteria andOrders3IsNotNull() {
            addCriterion("orders3 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders3EqualTo(String value) {
            addCriterion("orders3 =", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3NotEqualTo(String value) {
            addCriterion("orders3 <>", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3GreaterThan(String value) {
            addCriterion("orders3 >", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3GreaterThanOrEqualTo(String value) {
            addCriterion("orders3 >=", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3LessThan(String value) {
            addCriterion("orders3 <", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3LessThanOrEqualTo(String value) {
            addCriterion("orders3 <=", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3Like(String value) {
            addCriterion("orders3 like", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3NotLike(String value) {
            addCriterion("orders3 not like", value, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3In(List<String> values) {
            addCriterion("orders3 in", values, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3NotIn(List<String> values) {
            addCriterion("orders3 not in", values, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3Between(String value1, String value2) {
            addCriterion("orders3 between", value1, value2, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders3NotBetween(String value1, String value2) {
            addCriterion("orders3 not between", value1, value2, "orders3");
            return (Criteria) this;
        }

        public Criteria andOrders4IsNull() {
            addCriterion("orders4 is null");
            return (Criteria) this;
        }

        public Criteria andOrders4IsNotNull() {
            addCriterion("orders4 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders4EqualTo(String value) {
            addCriterion("orders4 =", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4NotEqualTo(String value) {
            addCriterion("orders4 <>", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4GreaterThan(String value) {
            addCriterion("orders4 >", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4GreaterThanOrEqualTo(String value) {
            addCriterion("orders4 >=", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4LessThan(String value) {
            addCriterion("orders4 <", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4LessThanOrEqualTo(String value) {
            addCriterion("orders4 <=", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4Like(String value) {
            addCriterion("orders4 like", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4NotLike(String value) {
            addCriterion("orders4 not like", value, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4In(List<String> values) {
            addCriterion("orders4 in", values, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4NotIn(List<String> values) {
            addCriterion("orders4 not in", values, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4Between(String value1, String value2) {
            addCriterion("orders4 between", value1, value2, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders4NotBetween(String value1, String value2) {
            addCriterion("orders4 not between", value1, value2, "orders4");
            return (Criteria) this;
        }

        public Criteria andOrders5IsNull() {
            addCriterion("orders5 is null");
            return (Criteria) this;
        }

        public Criteria andOrders5IsNotNull() {
            addCriterion("orders5 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders5EqualTo(String value) {
            addCriterion("orders5 =", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5NotEqualTo(String value) {
            addCriterion("orders5 <>", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5GreaterThan(String value) {
            addCriterion("orders5 >", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5GreaterThanOrEqualTo(String value) {
            addCriterion("orders5 >=", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5LessThan(String value) {
            addCriterion("orders5 <", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5LessThanOrEqualTo(String value) {
            addCriterion("orders5 <=", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5Like(String value) {
            addCriterion("orders5 like", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5NotLike(String value) {
            addCriterion("orders5 not like", value, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5In(List<String> values) {
            addCriterion("orders5 in", values, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5NotIn(List<String> values) {
            addCriterion("orders5 not in", values, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5Between(String value1, String value2) {
            addCriterion("orders5 between", value1, value2, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders5NotBetween(String value1, String value2) {
            addCriterion("orders5 not between", value1, value2, "orders5");
            return (Criteria) this;
        }

        public Criteria andOrders6IsNull() {
            addCriterion("orders6 is null");
            return (Criteria) this;
        }

        public Criteria andOrders6IsNotNull() {
            addCriterion("orders6 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders6EqualTo(String value) {
            addCriterion("orders6 =", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6NotEqualTo(String value) {
            addCriterion("orders6 <>", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6GreaterThan(String value) {
            addCriterion("orders6 >", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6GreaterThanOrEqualTo(String value) {
            addCriterion("orders6 >=", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6LessThan(String value) {
            addCriterion("orders6 <", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6LessThanOrEqualTo(String value) {
            addCriterion("orders6 <=", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6Like(String value) {
            addCriterion("orders6 like", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6NotLike(String value) {
            addCriterion("orders6 not like", value, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6In(List<String> values) {
            addCriterion("orders6 in", values, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6NotIn(List<String> values) {
            addCriterion("orders6 not in", values, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6Between(String value1, String value2) {
            addCriterion("orders6 between", value1, value2, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders6NotBetween(String value1, String value2) {
            addCriterion("orders6 not between", value1, value2, "orders6");
            return (Criteria) this;
        }

        public Criteria andOrders7IsNull() {
            addCriterion("orders7 is null");
            return (Criteria) this;
        }

        public Criteria andOrders7IsNotNull() {
            addCriterion("orders7 is not null");
            return (Criteria) this;
        }

        public Criteria andOrders7EqualTo(String value) {
            addCriterion("orders7 =", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7NotEqualTo(String value) {
            addCriterion("orders7 <>", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7GreaterThan(String value) {
            addCriterion("orders7 >", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7GreaterThanOrEqualTo(String value) {
            addCriterion("orders7 >=", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7LessThan(String value) {
            addCriterion("orders7 <", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7LessThanOrEqualTo(String value) {
            addCriterion("orders7 <=", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7Like(String value) {
            addCriterion("orders7 like", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7NotLike(String value) {
            addCriterion("orders7 not like", value, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7In(List<String> values) {
            addCriterion("orders7 in", values, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7NotIn(List<String> values) {
            addCriterion("orders7 not in", values, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7Between(String value1, String value2) {
            addCriterion("orders7 between", value1, value2, "orders7");
            return (Criteria) this;
        }

        public Criteria andOrders7NotBetween(String value1, String value2) {
            addCriterion("orders7 not between", value1, value2, "orders7");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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