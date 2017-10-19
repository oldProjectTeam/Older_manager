package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftexchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftexchangeExample() {
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

        public Criteria andGiftmanagementIdIsNull() {
            addCriterion("giftManagement_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdIsNotNull() {
            addCriterion("giftManagement_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdEqualTo(Integer value) {
            addCriterion("giftManagement_id =", value, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdNotEqualTo(Integer value) {
            addCriterion("giftManagement_id <>", value, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdGreaterThan(Integer value) {
            addCriterion("giftManagement_id >", value, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftManagement_id >=", value, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdLessThan(Integer value) {
            addCriterion("giftManagement_id <", value, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdLessThanOrEqualTo(Integer value) {
            addCriterion("giftManagement_id <=", value, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdIn(List<Integer> values) {
            addCriterion("giftManagement_id in", values, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdNotIn(List<Integer> values) {
            addCriterion("giftManagement_id not in", values, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdBetween(Integer value1, Integer value2) {
            addCriterion("giftManagement_id between", value1, value2, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andGiftmanagementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("giftManagement_id not between", value1, value2, "giftmanagementId");
            return (Criteria) this;
        }

        public Criteria andExchangetimeIsNull() {
            addCriterion("exchangeTime is null");
            return (Criteria) this;
        }

        public Criteria andExchangetimeIsNotNull() {
            addCriterion("exchangeTime is not null");
            return (Criteria) this;
        }

        public Criteria andExchangetimeEqualTo(Date value) {
            addCriterion("exchangeTime =", value, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeNotEqualTo(Date value) {
            addCriterion("exchangeTime <>", value, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeGreaterThan(Date value) {
            addCriterion("exchangeTime >", value, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exchangeTime >=", value, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeLessThan(Date value) {
            addCriterion("exchangeTime <", value, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeLessThanOrEqualTo(Date value) {
            addCriterion("exchangeTime <=", value, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeIn(List<Date> values) {
            addCriterion("exchangeTime in", values, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeNotIn(List<Date> values) {
            addCriterion("exchangeTime not in", values, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeBetween(Date value1, Date value2) {
            addCriterion("exchangeTime between", value1, value2, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andExchangetimeNotBetween(Date value1, Date value2) {
            addCriterion("exchangeTime not between", value1, value2, "exchangetime");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("Staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("Staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("Staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("Staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("Staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("Staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("Staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("Staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("Staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("Staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andExchangenoIsNull() {
            addCriterion("exchangeNo is null");
            return (Criteria) this;
        }

        public Criteria andExchangenoIsNotNull() {
            addCriterion("exchangeNo is not null");
            return (Criteria) this;
        }

        public Criteria andExchangenoEqualTo(String value) {
            addCriterion("exchangeNo =", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoNotEqualTo(String value) {
            addCriterion("exchangeNo <>", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoGreaterThan(String value) {
            addCriterion("exchangeNo >", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoGreaterThanOrEqualTo(String value) {
            addCriterion("exchangeNo >=", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoLessThan(String value) {
            addCriterion("exchangeNo <", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoLessThanOrEqualTo(String value) {
            addCriterion("exchangeNo <=", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoLike(String value) {
            addCriterion("exchangeNo like", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoNotLike(String value) {
            addCriterion("exchangeNo not like", value, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoIn(List<String> values) {
            addCriterion("exchangeNo in", values, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoNotIn(List<String> values) {
            addCriterion("exchangeNo not in", values, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoBetween(String value1, String value2) {
            addCriterion("exchangeNo between", value1, value2, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenoNotBetween(String value1, String value2) {
            addCriterion("exchangeNo not between", value1, value2, "exchangeno");
            return (Criteria) this;
        }

        public Criteria andExchangenumIsNull() {
            addCriterion("exchangeNum is null");
            return (Criteria) this;
        }

        public Criteria andExchangenumIsNotNull() {
            addCriterion("exchangeNum is not null");
            return (Criteria) this;
        }

        public Criteria andExchangenumEqualTo(Integer value) {
            addCriterion("exchangeNum =", value, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumNotEqualTo(Integer value) {
            addCriterion("exchangeNum <>", value, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumGreaterThan(Integer value) {
            addCriterion("exchangeNum >", value, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeNum >=", value, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumLessThan(Integer value) {
            addCriterion("exchangeNum <", value, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeNum <=", value, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumIn(List<Integer> values) {
            addCriterion("exchangeNum in", values, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumNotIn(List<Integer> values) {
            addCriterion("exchangeNum not in", values, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumBetween(Integer value1, Integer value2) {
            addCriterion("exchangeNum between", value1, value2, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangenumNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeNum not between", value1, value2, "exchangenum");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralIsNull() {
            addCriterion("exchangeIntegral is null");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralIsNotNull() {
            addCriterion("exchangeIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralEqualTo(Integer value) {
            addCriterion("exchangeIntegral =", value, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralNotEqualTo(Integer value) {
            addCriterion("exchangeIntegral <>", value, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralGreaterThan(Integer value) {
            addCriterion("exchangeIntegral >", value, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeIntegral >=", value, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralLessThan(Integer value) {
            addCriterion("exchangeIntegral <", value, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeIntegral <=", value, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralIn(List<Integer> values) {
            addCriterion("exchangeIntegral in", values, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralNotIn(List<Integer> values) {
            addCriterion("exchangeIntegral not in", values, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralBetween(Integer value1, Integer value2) {
            addCriterion("exchangeIntegral between", value1, value2, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andExchangeintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeIntegral not between", value1, value2, "exchangeintegral");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1IsNull() {
            addCriterion("giftExchange1 is null");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1IsNotNull() {
            addCriterion("giftExchange1 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1EqualTo(String value) {
            addCriterion("giftExchange1 =", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1NotEqualTo(String value) {
            addCriterion("giftExchange1 <>", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1GreaterThan(String value) {
            addCriterion("giftExchange1 >", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1GreaterThanOrEqualTo(String value) {
            addCriterion("giftExchange1 >=", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1LessThan(String value) {
            addCriterion("giftExchange1 <", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1LessThanOrEqualTo(String value) {
            addCriterion("giftExchange1 <=", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1Like(String value) {
            addCriterion("giftExchange1 like", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1NotLike(String value) {
            addCriterion("giftExchange1 not like", value, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1In(List<String> values) {
            addCriterion("giftExchange1 in", values, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1NotIn(List<String> values) {
            addCriterion("giftExchange1 not in", values, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1Between(String value1, String value2) {
            addCriterion("giftExchange1 between", value1, value2, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange1NotBetween(String value1, String value2) {
            addCriterion("giftExchange1 not between", value1, value2, "giftexchange1");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2IsNull() {
            addCriterion("giftExchange2 is null");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2IsNotNull() {
            addCriterion("giftExchange2 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2EqualTo(String value) {
            addCriterion("giftExchange2 =", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2NotEqualTo(String value) {
            addCriterion("giftExchange2 <>", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2GreaterThan(String value) {
            addCriterion("giftExchange2 >", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2GreaterThanOrEqualTo(String value) {
            addCriterion("giftExchange2 >=", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2LessThan(String value) {
            addCriterion("giftExchange2 <", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2LessThanOrEqualTo(String value) {
            addCriterion("giftExchange2 <=", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2Like(String value) {
            addCriterion("giftExchange2 like", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2NotLike(String value) {
            addCriterion("giftExchange2 not like", value, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2In(List<String> values) {
            addCriterion("giftExchange2 in", values, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2NotIn(List<String> values) {
            addCriterion("giftExchange2 not in", values, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2Between(String value1, String value2) {
            addCriterion("giftExchange2 between", value1, value2, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange2NotBetween(String value1, String value2) {
            addCriterion("giftExchange2 not between", value1, value2, "giftexchange2");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3IsNull() {
            addCriterion("giftExchange3 is null");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3IsNotNull() {
            addCriterion("giftExchange3 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3EqualTo(String value) {
            addCriterion("giftExchange3 =", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3NotEqualTo(String value) {
            addCriterion("giftExchange3 <>", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3GreaterThan(String value) {
            addCriterion("giftExchange3 >", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3GreaterThanOrEqualTo(String value) {
            addCriterion("giftExchange3 >=", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3LessThan(String value) {
            addCriterion("giftExchange3 <", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3LessThanOrEqualTo(String value) {
            addCriterion("giftExchange3 <=", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3Like(String value) {
            addCriterion("giftExchange3 like", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3NotLike(String value) {
            addCriterion("giftExchange3 not like", value, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3In(List<String> values) {
            addCriterion("giftExchange3 in", values, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3NotIn(List<String> values) {
            addCriterion("giftExchange3 not in", values, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3Between(String value1, String value2) {
            addCriterion("giftExchange3 between", value1, value2, "giftexchange3");
            return (Criteria) this;
        }

        public Criteria andGiftexchange3NotBetween(String value1, String value2) {
            addCriterion("giftExchange3 not between", value1, value2, "giftexchange3");
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