package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralExample() {
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

        public Criteria andBeforechangeintegralIsNull() {
            addCriterion("beforeChangeIntegral is null");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralIsNotNull() {
            addCriterion("beforeChangeIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralEqualTo(Integer value) {
            addCriterion("beforeChangeIntegral =", value, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralNotEqualTo(Integer value) {
            addCriterion("beforeChangeIntegral <>", value, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralGreaterThan(Integer value) {
            addCriterion("beforeChangeIntegral >", value, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("beforeChangeIntegral >=", value, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralLessThan(Integer value) {
            addCriterion("beforeChangeIntegral <", value, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralLessThanOrEqualTo(Integer value) {
            addCriterion("beforeChangeIntegral <=", value, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralIn(List<Integer> values) {
            addCriterion("beforeChangeIntegral in", values, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralNotIn(List<Integer> values) {
            addCriterion("beforeChangeIntegral not in", values, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralBetween(Integer value1, Integer value2) {
            addCriterion("beforeChangeIntegral between", value1, value2, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andBeforechangeintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("beforeChangeIntegral not between", value1, value2, "beforechangeintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralIsNull() {
            addCriterion("currentIntegral is null");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralIsNotNull() {
            addCriterion("currentIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralEqualTo(Integer value) {
            addCriterion("currentIntegral =", value, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralNotEqualTo(Integer value) {
            addCriterion("currentIntegral <>", value, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralGreaterThan(Integer value) {
            addCriterion("currentIntegral >", value, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentIntegral >=", value, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralLessThan(Integer value) {
            addCriterion("currentIntegral <", value, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralLessThanOrEqualTo(Integer value) {
            addCriterion("currentIntegral <=", value, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralIn(List<Integer> values) {
            addCriterion("currentIntegral in", values, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralNotIn(List<Integer> values) {
            addCriterion("currentIntegral not in", values, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralBetween(Integer value1, Integer value2) {
            addCriterion("currentIntegral between", value1, value2, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andCurrentintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("currentIntegral not between", value1, value2, "currentintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralIsNull() {
            addCriterion("afterChangeIntegral is null");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralIsNotNull() {
            addCriterion("afterChangeIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralEqualTo(Integer value) {
            addCriterion("afterChangeIntegral =", value, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralNotEqualTo(Integer value) {
            addCriterion("afterChangeIntegral <>", value, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralGreaterThan(Integer value) {
            addCriterion("afterChangeIntegral >", value, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterChangeIntegral >=", value, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralLessThan(Integer value) {
            addCriterion("afterChangeIntegral <", value, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralLessThanOrEqualTo(Integer value) {
            addCriterion("afterChangeIntegral <=", value, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralIn(List<Integer> values) {
            addCriterion("afterChangeIntegral in", values, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralNotIn(List<Integer> values) {
            addCriterion("afterChangeIntegral not in", values, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralBetween(Integer value1, Integer value2) {
            addCriterion("afterChangeIntegral between", value1, value2, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andAfterchangeintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("afterChangeIntegral not between", value1, value2, "afterchangeintegral");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("changeTime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changeTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("changeTime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("changeTime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("changeTime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("changeTime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("changeTime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("changeTime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("changeTime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("changeTime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("changeTime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("changeTime not between", value1, value2, "changetime");
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