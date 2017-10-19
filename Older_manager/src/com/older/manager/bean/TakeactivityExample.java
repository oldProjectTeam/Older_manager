package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakeactivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeactivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("Activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("Activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("Activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("Activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("Activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("Activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("Activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("Activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("Activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("Activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andTaketimeIsNull() {
            addCriterion("takeTime is null");
            return (Criteria) this;
        }

        public Criteria andTaketimeIsNotNull() {
            addCriterion("takeTime is not null");
            return (Criteria) this;
        }

        public Criteria andTaketimeEqualTo(Date value) {
            addCriterion("takeTime =", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeNotEqualTo(Date value) {
            addCriterion("takeTime <>", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeGreaterThan(Date value) {
            addCriterion("takeTime >", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeGreaterThanOrEqualTo(Date value) {
            addCriterion("takeTime >=", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeLessThan(Date value) {
            addCriterion("takeTime <", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeLessThanOrEqualTo(Date value) {
            addCriterion("takeTime <=", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeIn(List<Date> values) {
            addCriterion("takeTime in", values, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeNotIn(List<Date> values) {
            addCriterion("takeTime not in", values, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeBetween(Date value1, Date value2) {
            addCriterion("takeTime between", value1, value2, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeNotBetween(Date value1, Date value2) {
            addCriterion("takeTime not between", value1, value2, "taketime");
            return (Criteria) this;
        }

        public Criteria andIspresentIsNull() {
            addCriterion("isPresent is null");
            return (Criteria) this;
        }

        public Criteria andIspresentIsNotNull() {
            addCriterion("isPresent is not null");
            return (Criteria) this;
        }

        public Criteria andIspresentEqualTo(String value) {
            addCriterion("isPresent =", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentNotEqualTo(String value) {
            addCriterion("isPresent <>", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentGreaterThan(String value) {
            addCriterion("isPresent >", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentGreaterThanOrEqualTo(String value) {
            addCriterion("isPresent >=", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentLessThan(String value) {
            addCriterion("isPresent <", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentLessThanOrEqualTo(String value) {
            addCriterion("isPresent <=", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentLike(String value) {
            addCriterion("isPresent like", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentNotLike(String value) {
            addCriterion("isPresent not like", value, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentIn(List<String> values) {
            addCriterion("isPresent in", values, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentNotIn(List<String> values) {
            addCriterion("isPresent not in", values, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentBetween(String value1, String value2) {
            addCriterion("isPresent between", value1, value2, "ispresent");
            return (Criteria) this;
        }

        public Criteria andIspresentNotBetween(String value1, String value2) {
            addCriterion("isPresent not between", value1, value2, "ispresent");
            return (Criteria) this;
        }

        public Criteria andRemakIsNull() {
            addCriterion("remak is null");
            return (Criteria) this;
        }

        public Criteria andRemakIsNotNull() {
            addCriterion("remak is not null");
            return (Criteria) this;
        }

        public Criteria andRemakEqualTo(String value) {
            addCriterion("remak =", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakNotEqualTo(String value) {
            addCriterion("remak <>", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakGreaterThan(String value) {
            addCriterion("remak >", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakGreaterThanOrEqualTo(String value) {
            addCriterion("remak >=", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakLessThan(String value) {
            addCriterion("remak <", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakLessThanOrEqualTo(String value) {
            addCriterion("remak <=", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakLike(String value) {
            addCriterion("remak like", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakNotLike(String value) {
            addCriterion("remak not like", value, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakIn(List<String> values) {
            addCriterion("remak in", values, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakNotIn(List<String> values) {
            addCriterion("remak not in", values, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakBetween(String value1, String value2) {
            addCriterion("remak between", value1, value2, "remak");
            return (Criteria) this;
        }

        public Criteria andRemakNotBetween(String value1, String value2) {
            addCriterion("remak not between", value1, value2, "remak");
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

        public Criteria andTakeactivity1IsNull() {
            addCriterion("takeActivity1 is null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1IsNotNull() {
            addCriterion("takeActivity1 is not null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1EqualTo(String value) {
            addCriterion("takeActivity1 =", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1NotEqualTo(String value) {
            addCriterion("takeActivity1 <>", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1GreaterThan(String value) {
            addCriterion("takeActivity1 >", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1GreaterThanOrEqualTo(String value) {
            addCriterion("takeActivity1 >=", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1LessThan(String value) {
            addCriterion("takeActivity1 <", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1LessThanOrEqualTo(String value) {
            addCriterion("takeActivity1 <=", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1Like(String value) {
            addCriterion("takeActivity1 like", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1NotLike(String value) {
            addCriterion("takeActivity1 not like", value, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1In(List<String> values) {
            addCriterion("takeActivity1 in", values, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1NotIn(List<String> values) {
            addCriterion("takeActivity1 not in", values, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1Between(String value1, String value2) {
            addCriterion("takeActivity1 between", value1, value2, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity1NotBetween(String value1, String value2) {
            addCriterion("takeActivity1 not between", value1, value2, "takeactivity1");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2IsNull() {
            addCriterion("takeActivity2 is null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2IsNotNull() {
            addCriterion("takeActivity2 is not null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2EqualTo(String value) {
            addCriterion("takeActivity2 =", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2NotEqualTo(String value) {
            addCriterion("takeActivity2 <>", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2GreaterThan(String value) {
            addCriterion("takeActivity2 >", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2GreaterThanOrEqualTo(String value) {
            addCriterion("takeActivity2 >=", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2LessThan(String value) {
            addCriterion("takeActivity2 <", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2LessThanOrEqualTo(String value) {
            addCriterion("takeActivity2 <=", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2Like(String value) {
            addCriterion("takeActivity2 like", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2NotLike(String value) {
            addCriterion("takeActivity2 not like", value, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2In(List<String> values) {
            addCriterion("takeActivity2 in", values, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2NotIn(List<String> values) {
            addCriterion("takeActivity2 not in", values, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2Between(String value1, String value2) {
            addCriterion("takeActivity2 between", value1, value2, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity2NotBetween(String value1, String value2) {
            addCriterion("takeActivity2 not between", value1, value2, "takeactivity2");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3IsNull() {
            addCriterion("takeActivity3 is null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3IsNotNull() {
            addCriterion("takeActivity3 is not null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3EqualTo(String value) {
            addCriterion("takeActivity3 =", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3NotEqualTo(String value) {
            addCriterion("takeActivity3 <>", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3GreaterThan(String value) {
            addCriterion("takeActivity3 >", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3GreaterThanOrEqualTo(String value) {
            addCriterion("takeActivity3 >=", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3LessThan(String value) {
            addCriterion("takeActivity3 <", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3LessThanOrEqualTo(String value) {
            addCriterion("takeActivity3 <=", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3Like(String value) {
            addCriterion("takeActivity3 like", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3NotLike(String value) {
            addCriterion("takeActivity3 not like", value, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3In(List<String> values) {
            addCriterion("takeActivity3 in", values, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3NotIn(List<String> values) {
            addCriterion("takeActivity3 not in", values, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3Between(String value1, String value2) {
            addCriterion("takeActivity3 between", value1, value2, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity3NotBetween(String value1, String value2) {
            addCriterion("takeActivity3 not between", value1, value2, "takeactivity3");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4IsNull() {
            addCriterion("takeActivity4 is null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4IsNotNull() {
            addCriterion("takeActivity4 is not null");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4EqualTo(String value) {
            addCriterion("takeActivity4 =", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4NotEqualTo(String value) {
            addCriterion("takeActivity4 <>", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4GreaterThan(String value) {
            addCriterion("takeActivity4 >", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4GreaterThanOrEqualTo(String value) {
            addCriterion("takeActivity4 >=", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4LessThan(String value) {
            addCriterion("takeActivity4 <", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4LessThanOrEqualTo(String value) {
            addCriterion("takeActivity4 <=", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4Like(String value) {
            addCriterion("takeActivity4 like", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4NotLike(String value) {
            addCriterion("takeActivity4 not like", value, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4In(List<String> values) {
            addCriterion("takeActivity4 in", values, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4NotIn(List<String> values) {
            addCriterion("takeActivity4 not in", values, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4Between(String value1, String value2) {
            addCriterion("takeActivity4 between", value1, value2, "takeactivity4");
            return (Criteria) this;
        }

        public Criteria andTakeactivity4NotBetween(String value1, String value2) {
            addCriterion("takeActivity4 not between", value1, value2, "takeactivity4");
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