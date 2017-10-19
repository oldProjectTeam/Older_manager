package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecomactivitydetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecomactivitydetailsExample() {
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

        public Criteria andRecomactivityIdIsNull() {
            addCriterion("recomActivity_id is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdIsNotNull() {
            addCriterion("recomActivity_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdEqualTo(Integer value) {
            addCriterion("recomActivity_id =", value, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdNotEqualTo(Integer value) {
            addCriterion("recomActivity_id <>", value, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdGreaterThan(Integer value) {
            addCriterion("recomActivity_id >", value, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recomActivity_id >=", value, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdLessThan(Integer value) {
            addCriterion("recomActivity_id <", value, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("recomActivity_id <=", value, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdIn(List<Integer> values) {
            addCriterion("recomActivity_id in", values, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdNotIn(List<Integer> values) {
            addCriterion("recomActivity_id not in", values, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdBetween(Integer value1, Integer value2) {
            addCriterion("recomActivity_id between", value1, value2, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomactivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recomActivity_id not between", value1, value2, "recomactivityId");
            return (Criteria) this;
        }

        public Criteria andRecomtimeIsNull() {
            addCriterion("recomTime is null");
            return (Criteria) this;
        }

        public Criteria andRecomtimeIsNotNull() {
            addCriterion("recomTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecomtimeEqualTo(Date value) {
            addCriterion("recomTime =", value, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeNotEqualTo(Date value) {
            addCriterion("recomTime <>", value, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeGreaterThan(Date value) {
            addCriterion("recomTime >", value, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recomTime >=", value, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeLessThan(Date value) {
            addCriterion("recomTime <", value, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeLessThanOrEqualTo(Date value) {
            addCriterion("recomTime <=", value, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeIn(List<Date> values) {
            addCriterion("recomTime in", values, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeNotIn(List<Date> values) {
            addCriterion("recomTime not in", values, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeBetween(Date value1, Date value2) {
            addCriterion("recomTime between", value1, value2, "recomtime");
            return (Criteria) this;
        }

        public Criteria andRecomtimeNotBetween(Date value1, Date value2) {
            addCriterion("recomTime not between", value1, value2, "recomtime");
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

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIsNull() {
            addCriterion("oldMan_id is null");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIsNotNull() {
            addCriterion("oldMan_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanIdEqualTo(Integer value) {
            addCriterion("oldMan_id =", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotEqualTo(Integer value) {
            addCriterion("oldMan_id <>", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThan(Integer value) {
            addCriterion("oldMan_id >", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldMan_id >=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThan(Integer value) {
            addCriterion("oldMan_id <", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldMan_id <=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIn(List<Integer> values) {
            addCriterion("oldMan_id in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotIn(List<Integer> values) {
            addCriterion("oldMan_id not in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdBetween(Integer value1, Integer value2) {
            addCriterion("oldMan_id between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldMan_id not between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1IsNull() {
            addCriterion("recomActivityDetails1 is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1IsNotNull() {
            addCriterion("recomActivityDetails1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1EqualTo(String value) {
            addCriterion("recomActivityDetails1 =", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1NotEqualTo(String value) {
            addCriterion("recomActivityDetails1 <>", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1GreaterThan(String value) {
            addCriterion("recomActivityDetails1 >", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1GreaterThanOrEqualTo(String value) {
            addCriterion("recomActivityDetails1 >=", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1LessThan(String value) {
            addCriterion("recomActivityDetails1 <", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1LessThanOrEqualTo(String value) {
            addCriterion("recomActivityDetails1 <=", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1Like(String value) {
            addCriterion("recomActivityDetails1 like", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1NotLike(String value) {
            addCriterion("recomActivityDetails1 not like", value, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1In(List<String> values) {
            addCriterion("recomActivityDetails1 in", values, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1NotIn(List<String> values) {
            addCriterion("recomActivityDetails1 not in", values, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1Between(String value1, String value2) {
            addCriterion("recomActivityDetails1 between", value1, value2, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails1NotBetween(String value1, String value2) {
            addCriterion("recomActivityDetails1 not between", value1, value2, "recomactivitydetails1");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2IsNull() {
            addCriterion("recomActivityDetails2 is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2IsNotNull() {
            addCriterion("recomActivityDetails2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2EqualTo(String value) {
            addCriterion("recomActivityDetails2 =", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2NotEqualTo(String value) {
            addCriterion("recomActivityDetails2 <>", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2GreaterThan(String value) {
            addCriterion("recomActivityDetails2 >", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2GreaterThanOrEqualTo(String value) {
            addCriterion("recomActivityDetails2 >=", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2LessThan(String value) {
            addCriterion("recomActivityDetails2 <", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2LessThanOrEqualTo(String value) {
            addCriterion("recomActivityDetails2 <=", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2Like(String value) {
            addCriterion("recomActivityDetails2 like", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2NotLike(String value) {
            addCriterion("recomActivityDetails2 not like", value, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2In(List<String> values) {
            addCriterion("recomActivityDetails2 in", values, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2NotIn(List<String> values) {
            addCriterion("recomActivityDetails2 not in", values, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2Between(String value1, String value2) {
            addCriterion("recomActivityDetails2 between", value1, value2, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails2NotBetween(String value1, String value2) {
            addCriterion("recomActivityDetails2 not between", value1, value2, "recomactivitydetails2");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3IsNull() {
            addCriterion("recomActivityDetails3 is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3IsNotNull() {
            addCriterion("recomActivityDetails3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3EqualTo(String value) {
            addCriterion("recomActivityDetails3 =", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3NotEqualTo(String value) {
            addCriterion("recomActivityDetails3 <>", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3GreaterThan(String value) {
            addCriterion("recomActivityDetails3 >", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3GreaterThanOrEqualTo(String value) {
            addCriterion("recomActivityDetails3 >=", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3LessThan(String value) {
            addCriterion("recomActivityDetails3 <", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3LessThanOrEqualTo(String value) {
            addCriterion("recomActivityDetails3 <=", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3Like(String value) {
            addCriterion("recomActivityDetails3 like", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3NotLike(String value) {
            addCriterion("recomActivityDetails3 not like", value, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3In(List<String> values) {
            addCriterion("recomActivityDetails3 in", values, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3NotIn(List<String> values) {
            addCriterion("recomActivityDetails3 not in", values, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3Between(String value1, String value2) {
            addCriterion("recomActivityDetails3 between", value1, value2, "recomactivitydetails3");
            return (Criteria) this;
        }

        public Criteria andRecomactivitydetails3NotBetween(String value1, String value2) {
            addCriterion("recomActivityDetails3 not between", value1, value2, "recomactivitydetails3");
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