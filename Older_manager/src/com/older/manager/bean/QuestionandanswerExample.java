package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class QuestionandanswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionandanswerExample() {
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

        public Criteria andQuestiononeIsNull() {
            addCriterion("questionone is null");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIsNotNull() {
            addCriterion("questionone is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiononeEqualTo(String value) {
            addCriterion("questionone =", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotEqualTo(String value) {
            addCriterion("questionone <>", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeGreaterThan(String value) {
            addCriterion("questionone >", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeGreaterThanOrEqualTo(String value) {
            addCriterion("questionone >=", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLessThan(String value) {
            addCriterion("questionone <", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLessThanOrEqualTo(String value) {
            addCriterion("questionone <=", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLike(String value) {
            addCriterion("questionone like", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotLike(String value) {
            addCriterion("questionone not like", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIn(List<String> values) {
            addCriterion("questionone in", values, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotIn(List<String> values) {
            addCriterion("questionone not in", values, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeBetween(String value1, String value2) {
            addCriterion("questionone between", value1, value2, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotBetween(String value1, String value2) {
            addCriterion("questionone not between", value1, value2, "questionone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneIsNull() {
            addCriterion("answerone is null");
            return (Criteria) this;
        }

        public Criteria andAnsweroneIsNotNull() {
            addCriterion("answerone is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweroneEqualTo(String value) {
            addCriterion("answerone =", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotEqualTo(String value) {
            addCriterion("answerone <>", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneGreaterThan(String value) {
            addCriterion("answerone >", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneGreaterThanOrEqualTo(String value) {
            addCriterion("answerone >=", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneLessThan(String value) {
            addCriterion("answerone <", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneLessThanOrEqualTo(String value) {
            addCriterion("answerone <=", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneLike(String value) {
            addCriterion("answerone like", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotLike(String value) {
            addCriterion("answerone not like", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneIn(List<String> values) {
            addCriterion("answerone in", values, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotIn(List<String> values) {
            addCriterion("answerone not in", values, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneBetween(String value1, String value2) {
            addCriterion("answerone between", value1, value2, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotBetween(String value1, String value2) {
            addCriterion("answerone not between", value1, value2, "answerone");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoIsNull() {
            addCriterion("questiontwo is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoIsNotNull() {
            addCriterion("questiontwo is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoEqualTo(String value) {
            addCriterion("questiontwo =", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotEqualTo(String value) {
            addCriterion("questiontwo <>", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoGreaterThan(String value) {
            addCriterion("questiontwo >", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoGreaterThanOrEqualTo(String value) {
            addCriterion("questiontwo >=", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoLessThan(String value) {
            addCriterion("questiontwo <", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoLessThanOrEqualTo(String value) {
            addCriterion("questiontwo <=", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoLike(String value) {
            addCriterion("questiontwo like", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotLike(String value) {
            addCriterion("questiontwo not like", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoIn(List<String> values) {
            addCriterion("questiontwo in", values, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotIn(List<String> values) {
            addCriterion("questiontwo not in", values, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoBetween(String value1, String value2) {
            addCriterion("questiontwo between", value1, value2, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotBetween(String value1, String value2) {
            addCriterion("questiontwo not between", value1, value2, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoIsNull() {
            addCriterion("answertwo is null");
            return (Criteria) this;
        }

        public Criteria andAnswertwoIsNotNull() {
            addCriterion("answertwo is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertwoEqualTo(String value) {
            addCriterion("answertwo =", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotEqualTo(String value) {
            addCriterion("answertwo <>", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoGreaterThan(String value) {
            addCriterion("answertwo >", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoGreaterThanOrEqualTo(String value) {
            addCriterion("answertwo >=", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoLessThan(String value) {
            addCriterion("answertwo <", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoLessThanOrEqualTo(String value) {
            addCriterion("answertwo <=", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoLike(String value) {
            addCriterion("answertwo like", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotLike(String value) {
            addCriterion("answertwo not like", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoIn(List<String> values) {
            addCriterion("answertwo in", values, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotIn(List<String> values) {
            addCriterion("answertwo not in", values, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoBetween(String value1, String value2) {
            addCriterion("answertwo between", value1, value2, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotBetween(String value1, String value2) {
            addCriterion("answertwo not between", value1, value2, "answertwo");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOneIsNull() {
            addCriterion("one is null");
            return (Criteria) this;
        }

        public Criteria andOneIsNotNull() {
            addCriterion("one is not null");
            return (Criteria) this;
        }

        public Criteria andOneEqualTo(String value) {
            addCriterion("one =", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotEqualTo(String value) {
            addCriterion("one <>", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneGreaterThan(String value) {
            addCriterion("one >", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneGreaterThanOrEqualTo(String value) {
            addCriterion("one >=", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneLessThan(String value) {
            addCriterion("one <", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneLessThanOrEqualTo(String value) {
            addCriterion("one <=", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneLike(String value) {
            addCriterion("one like", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotLike(String value) {
            addCriterion("one not like", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneIn(List<String> values) {
            addCriterion("one in", values, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotIn(List<String> values) {
            addCriterion("one not in", values, "one");
            return (Criteria) this;
        }

        public Criteria andOneBetween(String value1, String value2) {
            addCriterion("one between", value1, value2, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotBetween(String value1, String value2) {
            addCriterion("one not between", value1, value2, "one");
            return (Criteria) this;
        }

        public Criteria andTwoIsNull() {
            addCriterion("two is null");
            return (Criteria) this;
        }

        public Criteria andTwoIsNotNull() {
            addCriterion("two is not null");
            return (Criteria) this;
        }

        public Criteria andTwoEqualTo(String value) {
            addCriterion("two =", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotEqualTo(String value) {
            addCriterion("two <>", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoGreaterThan(String value) {
            addCriterion("two >", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoGreaterThanOrEqualTo(String value) {
            addCriterion("two >=", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoLessThan(String value) {
            addCriterion("two <", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoLessThanOrEqualTo(String value) {
            addCriterion("two <=", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoLike(String value) {
            addCriterion("two like", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotLike(String value) {
            addCriterion("two not like", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoIn(List<String> values) {
            addCriterion("two in", values, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotIn(List<String> values) {
            addCriterion("two not in", values, "two");
            return (Criteria) this;
        }

        public Criteria andTwoBetween(String value1, String value2) {
            addCriterion("two between", value1, value2, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotBetween(String value1, String value2) {
            addCriterion("two not between", value1, value2, "two");
            return (Criteria) this;
        }

        public Criteria andThreeIsNull() {
            addCriterion("three is null");
            return (Criteria) this;
        }

        public Criteria andThreeIsNotNull() {
            addCriterion("three is not null");
            return (Criteria) this;
        }

        public Criteria andThreeEqualTo(Integer value) {
            addCriterion("three =", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotEqualTo(Integer value) {
            addCriterion("three <>", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeGreaterThan(Integer value) {
            addCriterion("three >", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("three >=", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLessThan(Integer value) {
            addCriterion("three <", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLessThanOrEqualTo(Integer value) {
            addCriterion("three <=", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeIn(List<Integer> values) {
            addCriterion("three in", values, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotIn(List<Integer> values) {
            addCriterion("three not in", values, "three");
            return (Criteria) this;
        }

        public Criteria andThreeBetween(Integer value1, Integer value2) {
            addCriterion("three between", value1, value2, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("three not between", value1, value2, "three");
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