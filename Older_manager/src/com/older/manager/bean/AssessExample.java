package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class AssessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessExample() {
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

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(String value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(String value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(String value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(String value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(String value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLike(String value) {
            addCriterion("doctor like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotLike(String value) {
            addCriterion("doctor not like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<String> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<String> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(String value1, String value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(String value1, String value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentIsNull() {
            addCriterion("healthDataAssessment is null");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentIsNotNull() {
            addCriterion("healthDataAssessment is not null");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentEqualTo(String value) {
            addCriterion("healthDataAssessment =", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentNotEqualTo(String value) {
            addCriterion("healthDataAssessment <>", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentGreaterThan(String value) {
            addCriterion("healthDataAssessment >", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentGreaterThanOrEqualTo(String value) {
            addCriterion("healthDataAssessment >=", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentLessThan(String value) {
            addCriterion("healthDataAssessment <", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentLessThanOrEqualTo(String value) {
            addCriterion("healthDataAssessment <=", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentLike(String value) {
            addCriterion("healthDataAssessment like", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentNotLike(String value) {
            addCriterion("healthDataAssessment not like", value, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentIn(List<String> values) {
            addCriterion("healthDataAssessment in", values, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentNotIn(List<String> values) {
            addCriterion("healthDataAssessment not in", values, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentBetween(String value1, String value2) {
            addCriterion("healthDataAssessment between", value1, value2, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andHealthdataassessmentNotBetween(String value1, String value2) {
            addCriterion("healthDataAssessment not between", value1, value2, "healthdataassessment");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNull() {
            addCriterion("suggest is null");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNotNull() {
            addCriterion("suggest is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestEqualTo(String value) {
            addCriterion("suggest =", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotEqualTo(String value) {
            addCriterion("suggest <>", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThan(String value) {
            addCriterion("suggest >", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("suggest >=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThan(String value) {
            addCriterion("suggest <", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThanOrEqualTo(String value) {
            addCriterion("suggest <=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLike(String value) {
            addCriterion("suggest like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotLike(String value) {
            addCriterion("suggest not like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestIn(List<String> values) {
            addCriterion("suggest in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotIn(List<String> values) {
            addCriterion("suggest not in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestBetween(String value1, String value2) {
            addCriterion("suggest between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotBetween(String value1, String value2) {
            addCriterion("suggest not between", value1, value2, "suggest");
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

        public Criteria andNum1IsNull() {
            addCriterion("num1 is null");
            return (Criteria) this;
        }

        public Criteria andNum1IsNotNull() {
            addCriterion("num1 is not null");
            return (Criteria) this;
        }

        public Criteria andNum1EqualTo(String value) {
            addCriterion("num1 =", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotEqualTo(String value) {
            addCriterion("num1 <>", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThan(String value) {
            addCriterion("num1 >", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1GreaterThanOrEqualTo(String value) {
            addCriterion("num1 >=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThan(String value) {
            addCriterion("num1 <", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1LessThanOrEqualTo(String value) {
            addCriterion("num1 <=", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Like(String value) {
            addCriterion("num1 like", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotLike(String value) {
            addCriterion("num1 not like", value, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1In(List<String> values) {
            addCriterion("num1 in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotIn(List<String> values) {
            addCriterion("num1 not in", values, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1Between(String value1, String value2) {
            addCriterion("num1 between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum1NotBetween(String value1, String value2) {
            addCriterion("num1 not between", value1, value2, "num1");
            return (Criteria) this;
        }

        public Criteria andNum2IsNull() {
            addCriterion("num2 is null");
            return (Criteria) this;
        }

        public Criteria andNum2IsNotNull() {
            addCriterion("num2 is not null");
            return (Criteria) this;
        }

        public Criteria andNum2EqualTo(String value) {
            addCriterion("num2 =", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotEqualTo(String value) {
            addCriterion("num2 <>", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThan(String value) {
            addCriterion("num2 >", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThanOrEqualTo(String value) {
            addCriterion("num2 >=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThan(String value) {
            addCriterion("num2 <", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThanOrEqualTo(String value) {
            addCriterion("num2 <=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2Like(String value) {
            addCriterion("num2 like", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotLike(String value) {
            addCriterion("num2 not like", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2In(List<String> values) {
            addCriterion("num2 in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotIn(List<String> values) {
            addCriterion("num2 not in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2Between(String value1, String value2) {
            addCriterion("num2 between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotBetween(String value1, String value2) {
            addCriterion("num2 not between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum3IsNull() {
            addCriterion("num3 is null");
            return (Criteria) this;
        }

        public Criteria andNum3IsNotNull() {
            addCriterion("num3 is not null");
            return (Criteria) this;
        }

        public Criteria andNum3EqualTo(String value) {
            addCriterion("num3 =", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotEqualTo(String value) {
            addCriterion("num3 <>", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3GreaterThan(String value) {
            addCriterion("num3 >", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3GreaterThanOrEqualTo(String value) {
            addCriterion("num3 >=", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3LessThan(String value) {
            addCriterion("num3 <", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3LessThanOrEqualTo(String value) {
            addCriterion("num3 <=", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3Like(String value) {
            addCriterion("num3 like", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotLike(String value) {
            addCriterion("num3 not like", value, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3In(List<String> values) {
            addCriterion("num3 in", values, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotIn(List<String> values) {
            addCriterion("num3 not in", values, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3Between(String value1, String value2) {
            addCriterion("num3 between", value1, value2, "num3");
            return (Criteria) this;
        }

        public Criteria andNum3NotBetween(String value1, String value2) {
            addCriterion("num3 not between", value1, value2, "num3");
            return (Criteria) this;
        }

        public Criteria andNum4IsNull() {
            addCriterion("num4 is null");
            return (Criteria) this;
        }

        public Criteria andNum4IsNotNull() {
            addCriterion("num4 is not null");
            return (Criteria) this;
        }

        public Criteria andNum4EqualTo(String value) {
            addCriterion("num4 =", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4NotEqualTo(String value) {
            addCriterion("num4 <>", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4GreaterThan(String value) {
            addCriterion("num4 >", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4GreaterThanOrEqualTo(String value) {
            addCriterion("num4 >=", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4LessThan(String value) {
            addCriterion("num4 <", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4LessThanOrEqualTo(String value) {
            addCriterion("num4 <=", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4Like(String value) {
            addCriterion("num4 like", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4NotLike(String value) {
            addCriterion("num4 not like", value, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4In(List<String> values) {
            addCriterion("num4 in", values, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4NotIn(List<String> values) {
            addCriterion("num4 not in", values, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4Between(String value1, String value2) {
            addCriterion("num4 between", value1, value2, "num4");
            return (Criteria) this;
        }

        public Criteria andNum4NotBetween(String value1, String value2) {
            addCriterion("num4 not between", value1, value2, "num4");
            return (Criteria) this;
        }

        public Criteria andNum5IsNull() {
            addCriterion("num5 is null");
            return (Criteria) this;
        }

        public Criteria andNum5IsNotNull() {
            addCriterion("num5 is not null");
            return (Criteria) this;
        }

        public Criteria andNum5EqualTo(String value) {
            addCriterion("num5 =", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5NotEqualTo(String value) {
            addCriterion("num5 <>", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5GreaterThan(String value) {
            addCriterion("num5 >", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5GreaterThanOrEqualTo(String value) {
            addCriterion("num5 >=", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5LessThan(String value) {
            addCriterion("num5 <", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5LessThanOrEqualTo(String value) {
            addCriterion("num5 <=", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5Like(String value) {
            addCriterion("num5 like", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5NotLike(String value) {
            addCriterion("num5 not like", value, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5In(List<String> values) {
            addCriterion("num5 in", values, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5NotIn(List<String> values) {
            addCriterion("num5 not in", values, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5Between(String value1, String value2) {
            addCriterion("num5 between", value1, value2, "num5");
            return (Criteria) this;
        }

        public Criteria andNum5NotBetween(String value1, String value2) {
            addCriterion("num5 not between", value1, value2, "num5");
            return (Criteria) this;
        }

        public Criteria andNum6IsNull() {
            addCriterion("num6 is null");
            return (Criteria) this;
        }

        public Criteria andNum6IsNotNull() {
            addCriterion("num6 is not null");
            return (Criteria) this;
        }

        public Criteria andNum6EqualTo(String value) {
            addCriterion("num6 =", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6NotEqualTo(String value) {
            addCriterion("num6 <>", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6GreaterThan(String value) {
            addCriterion("num6 >", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6GreaterThanOrEqualTo(String value) {
            addCriterion("num6 >=", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6LessThan(String value) {
            addCriterion("num6 <", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6LessThanOrEqualTo(String value) {
            addCriterion("num6 <=", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6Like(String value) {
            addCriterion("num6 like", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6NotLike(String value) {
            addCriterion("num6 not like", value, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6In(List<String> values) {
            addCriterion("num6 in", values, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6NotIn(List<String> values) {
            addCriterion("num6 not in", values, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6Between(String value1, String value2) {
            addCriterion("num6 between", value1, value2, "num6");
            return (Criteria) this;
        }

        public Criteria andNum6NotBetween(String value1, String value2) {
            addCriterion("num6 not between", value1, value2, "num6");
            return (Criteria) this;
        }

        public Criteria andNum7IsNull() {
            addCriterion("num7 is null");
            return (Criteria) this;
        }

        public Criteria andNum7IsNotNull() {
            addCriterion("num7 is not null");
            return (Criteria) this;
        }

        public Criteria andNum7EqualTo(String value) {
            addCriterion("num7 =", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7NotEqualTo(String value) {
            addCriterion("num7 <>", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7GreaterThan(String value) {
            addCriterion("num7 >", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7GreaterThanOrEqualTo(String value) {
            addCriterion("num7 >=", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7LessThan(String value) {
            addCriterion("num7 <", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7LessThanOrEqualTo(String value) {
            addCriterion("num7 <=", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7Like(String value) {
            addCriterion("num7 like", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7NotLike(String value) {
            addCriterion("num7 not like", value, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7In(List<String> values) {
            addCriterion("num7 in", values, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7NotIn(List<String> values) {
            addCriterion("num7 not in", values, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7Between(String value1, String value2) {
            addCriterion("num7 between", value1, value2, "num7");
            return (Criteria) this;
        }

        public Criteria andNum7NotBetween(String value1, String value2) {
            addCriterion("num7 not between", value1, value2, "num7");
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