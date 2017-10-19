package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsdetailsExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSendidIsNull() {
            addCriterion("sendId is null");
            return (Criteria) this;
        }

        public Criteria andSendidIsNotNull() {
            addCriterion("sendId is not null");
            return (Criteria) this;
        }

        public Criteria andSendidEqualTo(String value) {
            addCriterion("sendId =", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotEqualTo(String value) {
            addCriterion("sendId <>", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThan(String value) {
            addCriterion("sendId >", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidGreaterThanOrEqualTo(String value) {
            addCriterion("sendId >=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThan(String value) {
            addCriterion("sendId <", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLessThanOrEqualTo(String value) {
            addCriterion("sendId <=", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidLike(String value) {
            addCriterion("sendId like", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotLike(String value) {
            addCriterion("sendId not like", value, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidIn(List<String> values) {
            addCriterion("sendId in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotIn(List<String> values) {
            addCriterion("sendId not in", values, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidBetween(String value1, String value2) {
            addCriterion("sendId between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andSendidNotBetween(String value1, String value2) {
            addCriterion("sendId not between", value1, value2, "sendid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("operatorId is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("operatorId is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(String value) {
            addCriterion("operatorId =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(String value) {
            addCriterion("operatorId <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(String value) {
            addCriterion("operatorId >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(String value) {
            addCriterion("operatorId >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(String value) {
            addCriterion("operatorId <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(String value) {
            addCriterion("operatorId <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLike(String value) {
            addCriterion("operatorId like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotLike(String value) {
            addCriterion("operatorId not like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<String> values) {
            addCriterion("operatorId in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<String> values) {
            addCriterion("operatorId not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(String value1, String value2) {
            addCriterion("operatorId between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(String value1, String value2) {
            addCriterion("operatorId not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andSendresultIsNull() {
            addCriterion("sendResult is null");
            return (Criteria) this;
        }

        public Criteria andSendresultIsNotNull() {
            addCriterion("sendResult is not null");
            return (Criteria) this;
        }

        public Criteria andSendresultEqualTo(String value) {
            addCriterion("sendResult =", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultNotEqualTo(String value) {
            addCriterion("sendResult <>", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultGreaterThan(String value) {
            addCriterion("sendResult >", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultGreaterThanOrEqualTo(String value) {
            addCriterion("sendResult >=", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultLessThan(String value) {
            addCriterion("sendResult <", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultLessThanOrEqualTo(String value) {
            addCriterion("sendResult <=", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultLike(String value) {
            addCriterion("sendResult like", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultNotLike(String value) {
            addCriterion("sendResult not like", value, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultIn(List<String> values) {
            addCriterion("sendResult in", values, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultNotIn(List<String> values) {
            addCriterion("sendResult not in", values, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultBetween(String value1, String value2) {
            addCriterion("sendResult between", value1, value2, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendresultNotBetween(String value1, String value2) {
            addCriterion("sendResult not between", value1, value2, "sendresult");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNull() {
            addCriterion("SMS_id is null");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNotNull() {
            addCriterion("SMS_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmsIdEqualTo(Integer value) {
            addCriterion("SMS_id =", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotEqualTo(Integer value) {
            addCriterion("SMS_id <>", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThan(Integer value) {
            addCriterion("SMS_id >", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SMS_id >=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThan(Integer value) {
            addCriterion("SMS_id <", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThanOrEqualTo(Integer value) {
            addCriterion("SMS_id <=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIn(List<Integer> values) {
            addCriterion("SMS_id in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotIn(List<Integer> values) {
            addCriterion("SMS_id not in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdBetween(Integer value1, Integer value2) {
            addCriterion("SMS_id between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SMS_id not between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1IsNull() {
            addCriterion("SMSDetails1 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1IsNotNull() {
            addCriterion("SMSDetails1 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1EqualTo(String value) {
            addCriterion("SMSDetails1 =", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1NotEqualTo(String value) {
            addCriterion("SMSDetails1 <>", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1GreaterThan(String value) {
            addCriterion("SMSDetails1 >", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails1 >=", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1LessThan(String value) {
            addCriterion("SMSDetails1 <", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails1 <=", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1Like(String value) {
            addCriterion("SMSDetails1 like", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1NotLike(String value) {
            addCriterion("SMSDetails1 not like", value, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1In(List<String> values) {
            addCriterion("SMSDetails1 in", values, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1NotIn(List<String> values) {
            addCriterion("SMSDetails1 not in", values, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1Between(String value1, String value2) {
            addCriterion("SMSDetails1 between", value1, value2, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails1NotBetween(String value1, String value2) {
            addCriterion("SMSDetails1 not between", value1, value2, "smsdetails1");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2IsNull() {
            addCriterion("SMSDetails2 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2IsNotNull() {
            addCriterion("SMSDetails2 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2EqualTo(String value) {
            addCriterion("SMSDetails2 =", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2NotEqualTo(String value) {
            addCriterion("SMSDetails2 <>", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2GreaterThan(String value) {
            addCriterion("SMSDetails2 >", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails2 >=", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2LessThan(String value) {
            addCriterion("SMSDetails2 <", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails2 <=", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2Like(String value) {
            addCriterion("SMSDetails2 like", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2NotLike(String value) {
            addCriterion("SMSDetails2 not like", value, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2In(List<String> values) {
            addCriterion("SMSDetails2 in", values, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2NotIn(List<String> values) {
            addCriterion("SMSDetails2 not in", values, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2Between(String value1, String value2) {
            addCriterion("SMSDetails2 between", value1, value2, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails2NotBetween(String value1, String value2) {
            addCriterion("SMSDetails2 not between", value1, value2, "smsdetails2");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3IsNull() {
            addCriterion("SMSDetails3 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3IsNotNull() {
            addCriterion("SMSDetails3 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3EqualTo(String value) {
            addCriterion("SMSDetails3 =", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3NotEqualTo(String value) {
            addCriterion("SMSDetails3 <>", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3GreaterThan(String value) {
            addCriterion("SMSDetails3 >", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails3 >=", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3LessThan(String value) {
            addCriterion("SMSDetails3 <", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails3 <=", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3Like(String value) {
            addCriterion("SMSDetails3 like", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3NotLike(String value) {
            addCriterion("SMSDetails3 not like", value, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3In(List<String> values) {
            addCriterion("SMSDetails3 in", values, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3NotIn(List<String> values) {
            addCriterion("SMSDetails3 not in", values, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3Between(String value1, String value2) {
            addCriterion("SMSDetails3 between", value1, value2, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails3NotBetween(String value1, String value2) {
            addCriterion("SMSDetails3 not between", value1, value2, "smsdetails3");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4IsNull() {
            addCriterion("SMSDetails4 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4IsNotNull() {
            addCriterion("SMSDetails4 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4EqualTo(String value) {
            addCriterion("SMSDetails4 =", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4NotEqualTo(String value) {
            addCriterion("SMSDetails4 <>", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4GreaterThan(String value) {
            addCriterion("SMSDetails4 >", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails4 >=", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4LessThan(String value) {
            addCriterion("SMSDetails4 <", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails4 <=", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4Like(String value) {
            addCriterion("SMSDetails4 like", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4NotLike(String value) {
            addCriterion("SMSDetails4 not like", value, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4In(List<String> values) {
            addCriterion("SMSDetails4 in", values, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4NotIn(List<String> values) {
            addCriterion("SMSDetails4 not in", values, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4Between(String value1, String value2) {
            addCriterion("SMSDetails4 between", value1, value2, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails4NotBetween(String value1, String value2) {
            addCriterion("SMSDetails4 not between", value1, value2, "smsdetails4");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5IsNull() {
            addCriterion("SMSDetails5 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5IsNotNull() {
            addCriterion("SMSDetails5 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5EqualTo(String value) {
            addCriterion("SMSDetails5 =", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5NotEqualTo(String value) {
            addCriterion("SMSDetails5 <>", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5GreaterThan(String value) {
            addCriterion("SMSDetails5 >", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails5 >=", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5LessThan(String value) {
            addCriterion("SMSDetails5 <", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails5 <=", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5Like(String value) {
            addCriterion("SMSDetails5 like", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5NotLike(String value) {
            addCriterion("SMSDetails5 not like", value, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5In(List<String> values) {
            addCriterion("SMSDetails5 in", values, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5NotIn(List<String> values) {
            addCriterion("SMSDetails5 not in", values, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5Between(String value1, String value2) {
            addCriterion("SMSDetails5 between", value1, value2, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails5NotBetween(String value1, String value2) {
            addCriterion("SMSDetails5 not between", value1, value2, "smsdetails5");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6IsNull() {
            addCriterion("SMSDetails6 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6IsNotNull() {
            addCriterion("SMSDetails6 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6EqualTo(String value) {
            addCriterion("SMSDetails6 =", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6NotEqualTo(String value) {
            addCriterion("SMSDetails6 <>", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6GreaterThan(String value) {
            addCriterion("SMSDetails6 >", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails6 >=", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6LessThan(String value) {
            addCriterion("SMSDetails6 <", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails6 <=", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6Like(String value) {
            addCriterion("SMSDetails6 like", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6NotLike(String value) {
            addCriterion("SMSDetails6 not like", value, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6In(List<String> values) {
            addCriterion("SMSDetails6 in", values, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6NotIn(List<String> values) {
            addCriterion("SMSDetails6 not in", values, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6Between(String value1, String value2) {
            addCriterion("SMSDetails6 between", value1, value2, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails6NotBetween(String value1, String value2) {
            addCriterion("SMSDetails6 not between", value1, value2, "smsdetails6");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7IsNull() {
            addCriterion("SMSDetails7 is null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7IsNotNull() {
            addCriterion("SMSDetails7 is not null");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7EqualTo(String value) {
            addCriterion("SMSDetails7 =", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7NotEqualTo(String value) {
            addCriterion("SMSDetails7 <>", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7GreaterThan(String value) {
            addCriterion("SMSDetails7 >", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7GreaterThanOrEqualTo(String value) {
            addCriterion("SMSDetails7 >=", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7LessThan(String value) {
            addCriterion("SMSDetails7 <", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7LessThanOrEqualTo(String value) {
            addCriterion("SMSDetails7 <=", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7Like(String value) {
            addCriterion("SMSDetails7 like", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7NotLike(String value) {
            addCriterion("SMSDetails7 not like", value, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7In(List<String> values) {
            addCriterion("SMSDetails7 in", values, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7NotIn(List<String> values) {
            addCriterion("SMSDetails7 not in", values, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7Between(String value1, String value2) {
            addCriterion("SMSDetails7 between", value1, value2, "smsdetails7");
            return (Criteria) this;
        }

        public Criteria andSmsdetails7NotBetween(String value1, String value2) {
            addCriterion("SMSDetails7 not between", value1, value2, "smsdetails7");
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