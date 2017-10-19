package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecomactivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecomactivityExample() {
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
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
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

        public Criteria andRecompeopleIsNull() {
            addCriterion("recomPeople is null");
            return (Criteria) this;
        }

        public Criteria andRecompeopleIsNotNull() {
            addCriterion("recomPeople is not null");
            return (Criteria) this;
        }

        public Criteria andRecompeopleEqualTo(String value) {
            addCriterion("recomPeople =", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleNotEqualTo(String value) {
            addCriterion("recomPeople <>", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleGreaterThan(String value) {
            addCriterion("recomPeople >", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleGreaterThanOrEqualTo(String value) {
            addCriterion("recomPeople >=", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleLessThan(String value) {
            addCriterion("recomPeople <", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleLessThanOrEqualTo(String value) {
            addCriterion("recomPeople <=", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleLike(String value) {
            addCriterion("recomPeople like", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleNotLike(String value) {
            addCriterion("recomPeople not like", value, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleIn(List<String> values) {
            addCriterion("recomPeople in", values, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleNotIn(List<String> values) {
            addCriterion("recomPeople not in", values, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleBetween(String value1, String value2) {
            addCriterion("recomPeople between", value1, value2, "recompeople");
            return (Criteria) this;
        }

        public Criteria andRecompeopleNotBetween(String value1, String value2) {
            addCriterion("recomPeople not between", value1, value2, "recompeople");
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

        public Criteria andRecomidIsNull() {
            addCriterion("recomId is null");
            return (Criteria) this;
        }

        public Criteria andRecomidIsNotNull() {
            addCriterion("recomId is not null");
            return (Criteria) this;
        }

        public Criteria andRecomidEqualTo(Integer value) {
            addCriterion("recomId =", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotEqualTo(Integer value) {
            addCriterion("recomId <>", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThan(Integer value) {
            addCriterion("recomId >", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recomId >=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThan(Integer value) {
            addCriterion("recomId <", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThanOrEqualTo(Integer value) {
            addCriterion("recomId <=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidIn(List<Integer> values) {
            addCriterion("recomId in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotIn(List<Integer> values) {
            addCriterion("recomId not in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidBetween(Integer value1, Integer value2) {
            addCriterion("recomId between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotBetween(Integer value1, Integer value2) {
            addCriterion("recomId not between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1IsNull() {
            addCriterion("recomActivity1 is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1IsNotNull() {
            addCriterion("recomActivity1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1EqualTo(String value) {
            addCriterion("recomActivity1 =", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1NotEqualTo(String value) {
            addCriterion("recomActivity1 <>", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1GreaterThan(String value) {
            addCriterion("recomActivity1 >", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1GreaterThanOrEqualTo(String value) {
            addCriterion("recomActivity1 >=", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1LessThan(String value) {
            addCriterion("recomActivity1 <", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1LessThanOrEqualTo(String value) {
            addCriterion("recomActivity1 <=", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1Like(String value) {
            addCriterion("recomActivity1 like", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1NotLike(String value) {
            addCriterion("recomActivity1 not like", value, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1In(List<String> values) {
            addCriterion("recomActivity1 in", values, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1NotIn(List<String> values) {
            addCriterion("recomActivity1 not in", values, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1Between(String value1, String value2) {
            addCriterion("recomActivity1 between", value1, value2, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity1NotBetween(String value1, String value2) {
            addCriterion("recomActivity1 not between", value1, value2, "recomactivity1");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2IsNull() {
            addCriterion("recomActivity2 is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2IsNotNull() {
            addCriterion("recomActivity2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2EqualTo(String value) {
            addCriterion("recomActivity2 =", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2NotEqualTo(String value) {
            addCriterion("recomActivity2 <>", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2GreaterThan(String value) {
            addCriterion("recomActivity2 >", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2GreaterThanOrEqualTo(String value) {
            addCriterion("recomActivity2 >=", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2LessThan(String value) {
            addCriterion("recomActivity2 <", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2LessThanOrEqualTo(String value) {
            addCriterion("recomActivity2 <=", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2Like(String value) {
            addCriterion("recomActivity2 like", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2NotLike(String value) {
            addCriterion("recomActivity2 not like", value, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2In(List<String> values) {
            addCriterion("recomActivity2 in", values, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2NotIn(List<String> values) {
            addCriterion("recomActivity2 not in", values, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2Between(String value1, String value2) {
            addCriterion("recomActivity2 between", value1, value2, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity2NotBetween(String value1, String value2) {
            addCriterion("recomActivity2 not between", value1, value2, "recomactivity2");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3IsNull() {
            addCriterion("recomActivity3 is null");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3IsNotNull() {
            addCriterion("recomActivity3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3EqualTo(String value) {
            addCriterion("recomActivity3 =", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3NotEqualTo(String value) {
            addCriterion("recomActivity3 <>", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3GreaterThan(String value) {
            addCriterion("recomActivity3 >", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3GreaterThanOrEqualTo(String value) {
            addCriterion("recomActivity3 >=", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3LessThan(String value) {
            addCriterion("recomActivity3 <", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3LessThanOrEqualTo(String value) {
            addCriterion("recomActivity3 <=", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3Like(String value) {
            addCriterion("recomActivity3 like", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3NotLike(String value) {
            addCriterion("recomActivity3 not like", value, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3In(List<String> values) {
            addCriterion("recomActivity3 in", values, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3NotIn(List<String> values) {
            addCriterion("recomActivity3 not in", values, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3Between(String value1, String value2) {
            addCriterion("recomActivity3 between", value1, value2, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRecomactivity3NotBetween(String value1, String value2) {
            addCriterion("recomActivity3 not between", value1, value2, "recomactivity3");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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