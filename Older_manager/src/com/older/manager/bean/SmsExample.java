package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsExample() {
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

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andReceiverphoneIsNull() {
            addCriterion("receiverphone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneIsNotNull() {
            addCriterion("receiverphone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneEqualTo(String value) {
            addCriterion("receiverphone =", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotEqualTo(String value) {
            addCriterion("receiverphone <>", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneGreaterThan(String value) {
            addCriterion("receiverphone >", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiverphone >=", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneLessThan(String value) {
            addCriterion("receiverphone <", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneLessThanOrEqualTo(String value) {
            addCriterion("receiverphone <=", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneLike(String value) {
            addCriterion("receiverphone like", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotLike(String value) {
            addCriterion("receiverphone not like", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneIn(List<String> values) {
            addCriterion("receiverphone in", values, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotIn(List<String> values) {
            addCriterion("receiverphone not in", values, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneBetween(String value1, String value2) {
            addCriterion("receiverphone between", value1, value2, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotBetween(String value1, String value2) {
            addCriterion("receiverphone not between", value1, value2, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("receivername is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("receivername is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("receivername =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("receivername <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("receivername >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("receivername >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("receivername <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("receivername <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("receivername like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("receivername not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("receivername in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("receivername not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("receivername between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("receivername not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andSms3IsNull() {
            addCriterion("SMS3 is null");
            return (Criteria) this;
        }

        public Criteria andSms3IsNotNull() {
            addCriterion("SMS3 is not null");
            return (Criteria) this;
        }

        public Criteria andSms3EqualTo(String value) {
            addCriterion("SMS3 =", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3NotEqualTo(String value) {
            addCriterion("SMS3 <>", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3GreaterThan(String value) {
            addCriterion("SMS3 >", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3GreaterThanOrEqualTo(String value) {
            addCriterion("SMS3 >=", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3LessThan(String value) {
            addCriterion("SMS3 <", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3LessThanOrEqualTo(String value) {
            addCriterion("SMS3 <=", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3Like(String value) {
            addCriterion("SMS3 like", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3NotLike(String value) {
            addCriterion("SMS3 not like", value, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3In(List<String> values) {
            addCriterion("SMS3 in", values, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3NotIn(List<String> values) {
            addCriterion("SMS3 not in", values, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3Between(String value1, String value2) {
            addCriterion("SMS3 between", value1, value2, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms3NotBetween(String value1, String value2) {
            addCriterion("SMS3 not between", value1, value2, "sms3");
            return (Criteria) this;
        }

        public Criteria andSms4IsNull() {
            addCriterion("SMS4 is null");
            return (Criteria) this;
        }

        public Criteria andSms4IsNotNull() {
            addCriterion("SMS4 is not null");
            return (Criteria) this;
        }

        public Criteria andSms4EqualTo(String value) {
            addCriterion("SMS4 =", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4NotEqualTo(String value) {
            addCriterion("SMS4 <>", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4GreaterThan(String value) {
            addCriterion("SMS4 >", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4GreaterThanOrEqualTo(String value) {
            addCriterion("SMS4 >=", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4LessThan(String value) {
            addCriterion("SMS4 <", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4LessThanOrEqualTo(String value) {
            addCriterion("SMS4 <=", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4Like(String value) {
            addCriterion("SMS4 like", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4NotLike(String value) {
            addCriterion("SMS4 not like", value, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4In(List<String> values) {
            addCriterion("SMS4 in", values, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4NotIn(List<String> values) {
            addCriterion("SMS4 not in", values, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4Between(String value1, String value2) {
            addCriterion("SMS4 between", value1, value2, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms4NotBetween(String value1, String value2) {
            addCriterion("SMS4 not between", value1, value2, "sms4");
            return (Criteria) this;
        }

        public Criteria andSms5IsNull() {
            addCriterion("SMS5 is null");
            return (Criteria) this;
        }

        public Criteria andSms5IsNotNull() {
            addCriterion("SMS5 is not null");
            return (Criteria) this;
        }

        public Criteria andSms5EqualTo(String value) {
            addCriterion("SMS5 =", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5NotEqualTo(String value) {
            addCriterion("SMS5 <>", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5GreaterThan(String value) {
            addCriterion("SMS5 >", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5GreaterThanOrEqualTo(String value) {
            addCriterion("SMS5 >=", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5LessThan(String value) {
            addCriterion("SMS5 <", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5LessThanOrEqualTo(String value) {
            addCriterion("SMS5 <=", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5Like(String value) {
            addCriterion("SMS5 like", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5NotLike(String value) {
            addCriterion("SMS5 not like", value, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5In(List<String> values) {
            addCriterion("SMS5 in", values, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5NotIn(List<String> values) {
            addCriterion("SMS5 not in", values, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5Between(String value1, String value2) {
            addCriterion("SMS5 between", value1, value2, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms5NotBetween(String value1, String value2) {
            addCriterion("SMS5 not between", value1, value2, "sms5");
            return (Criteria) this;
        }

        public Criteria andSms6IsNull() {
            addCriterion("SMS6 is null");
            return (Criteria) this;
        }

        public Criteria andSms6IsNotNull() {
            addCriterion("SMS6 is not null");
            return (Criteria) this;
        }

        public Criteria andSms6EqualTo(String value) {
            addCriterion("SMS6 =", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6NotEqualTo(String value) {
            addCriterion("SMS6 <>", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6GreaterThan(String value) {
            addCriterion("SMS6 >", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6GreaterThanOrEqualTo(String value) {
            addCriterion("SMS6 >=", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6LessThan(String value) {
            addCriterion("SMS6 <", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6LessThanOrEqualTo(String value) {
            addCriterion("SMS6 <=", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6Like(String value) {
            addCriterion("SMS6 like", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6NotLike(String value) {
            addCriterion("SMS6 not like", value, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6In(List<String> values) {
            addCriterion("SMS6 in", values, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6NotIn(List<String> values) {
            addCriterion("SMS6 not in", values, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6Between(String value1, String value2) {
            addCriterion("SMS6 between", value1, value2, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms6NotBetween(String value1, String value2) {
            addCriterion("SMS6 not between", value1, value2, "sms6");
            return (Criteria) this;
        }

        public Criteria andSms7IsNull() {
            addCriterion("SMS7 is null");
            return (Criteria) this;
        }

        public Criteria andSms7IsNotNull() {
            addCriterion("SMS7 is not null");
            return (Criteria) this;
        }

        public Criteria andSms7EqualTo(String value) {
            addCriterion("SMS7 =", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7NotEqualTo(String value) {
            addCriterion("SMS7 <>", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7GreaterThan(String value) {
            addCriterion("SMS7 >", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7GreaterThanOrEqualTo(String value) {
            addCriterion("SMS7 >=", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7LessThan(String value) {
            addCriterion("SMS7 <", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7LessThanOrEqualTo(String value) {
            addCriterion("SMS7 <=", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7Like(String value) {
            addCriterion("SMS7 like", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7NotLike(String value) {
            addCriterion("SMS7 not like", value, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7In(List<String> values) {
            addCriterion("SMS7 in", values, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7NotIn(List<String> values) {
            addCriterion("SMS7 not in", values, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7Between(String value1, String value2) {
            addCriterion("SMS7 between", value1, value2, "sms7");
            return (Criteria) this;
        }

        public Criteria andSms7NotBetween(String value1, String value2) {
            addCriterion("SMS7 not between", value1, value2, "sms7");
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