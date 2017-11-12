package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SortadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SortadsExample() {
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

        public Criteria andSortnameIsNull() {
            addCriterion("sortname is null");
            return (Criteria) this;
        }

        public Criteria andSortnameIsNotNull() {
            addCriterion("sortname is not null");
            return (Criteria) this;
        }

        public Criteria andSortnameEqualTo(String value) {
            addCriterion("sortname =", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotEqualTo(String value) {
            addCriterion("sortname <>", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameGreaterThan(String value) {
            addCriterion("sortname >", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameGreaterThanOrEqualTo(String value) {
            addCriterion("sortname >=", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameLessThan(String value) {
            addCriterion("sortname <", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameLessThanOrEqualTo(String value) {
            addCriterion("sortname <=", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameLike(String value) {
            addCriterion("sortname like", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotLike(String value) {
            addCriterion("sortname not like", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameIn(List<String> values) {
            addCriterion("sortname in", values, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotIn(List<String> values) {
            addCriterion("sortname not in", values, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameBetween(String value1, String value2) {
            addCriterion("sortname between", value1, value2, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotBetween(String value1, String value2) {
            addCriterion("sortname not between", value1, value2, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnumIsNull() {
            addCriterion("sortnum is null");
            return (Criteria) this;
        }

        public Criteria andSortnumIsNotNull() {
            addCriterion("sortnum is not null");
            return (Criteria) this;
        }

        public Criteria andSortnumEqualTo(Integer value) {
            addCriterion("sortnum =", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotEqualTo(Integer value) {
            addCriterion("sortnum <>", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumGreaterThan(Integer value) {
            addCriterion("sortnum >", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortnum >=", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLessThan(Integer value) {
            addCriterion("sortnum <", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLessThanOrEqualTo(Integer value) {
            addCriterion("sortnum <=", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumIn(List<Integer> values) {
            addCriterion("sortnum in", values, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotIn(List<Integer> values) {
            addCriterion("sortnum not in", values, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumBetween(Integer value1, Integer value2) {
            addCriterion("sortnum between", value1, value2, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sortnum not between", value1, value2, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortcontentIsNull() {
            addCriterion("sortcontent is null");
            return (Criteria) this;
        }

        public Criteria andSortcontentIsNotNull() {
            addCriterion("sortcontent is not null");
            return (Criteria) this;
        }

        public Criteria andSortcontentEqualTo(String value) {
            addCriterion("sortcontent =", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentNotEqualTo(String value) {
            addCriterion("sortcontent <>", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentGreaterThan(String value) {
            addCriterion("sortcontent >", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentGreaterThanOrEqualTo(String value) {
            addCriterion("sortcontent >=", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentLessThan(String value) {
            addCriterion("sortcontent <", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentLessThanOrEqualTo(String value) {
            addCriterion("sortcontent <=", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentLike(String value) {
            addCriterion("sortcontent like", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentNotLike(String value) {
            addCriterion("sortcontent not like", value, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentIn(List<String> values) {
            addCriterion("sortcontent in", values, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentNotIn(List<String> values) {
            addCriterion("sortcontent not in", values, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentBetween(String value1, String value2) {
            addCriterion("sortcontent between", value1, value2, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortcontentNotBetween(String value1, String value2) {
            addCriterion("sortcontent not between", value1, value2, "sortcontent");
            return (Criteria) this;
        }

        public Criteria andSortjointimeIsNull() {
            addCriterion("sortjointime is null");
            return (Criteria) this;
        }

        public Criteria andSortjointimeIsNotNull() {
            addCriterion("sortjointime is not null");
            return (Criteria) this;
        }

        public Criteria andSortjointimeEqualTo(Date value) {
            addCriterion("sortjointime =", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeNotEqualTo(Date value) {
            addCriterion("sortjointime <>", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeGreaterThan(Date value) {
            addCriterion("sortjointime >", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sortjointime >=", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeLessThan(Date value) {
            addCriterion("sortjointime <", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeLessThanOrEqualTo(Date value) {
            addCriterion("sortjointime <=", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeIn(List<Date> values) {
            addCriterion("sortjointime in", values, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeNotIn(List<Date> values) {
            addCriterion("sortjointime not in", values, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeBetween(Date value1, Date value2) {
            addCriterion("sortjointime between", value1, value2, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeNotBetween(Date value1, Date value2) {
            addCriterion("sortjointime not between", value1, value2, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortstateIsNull() {
            addCriterion("sortstate is null");
            return (Criteria) this;
        }

        public Criteria andSortstateIsNotNull() {
            addCriterion("sortstate is not null");
            return (Criteria) this;
        }

        public Criteria andSortstateEqualTo(String value) {
            addCriterion("sortstate =", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotEqualTo(String value) {
            addCriterion("sortstate <>", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateGreaterThan(String value) {
            addCriterion("sortstate >", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateGreaterThanOrEqualTo(String value) {
            addCriterion("sortstate >=", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateLessThan(String value) {
            addCriterion("sortstate <", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateLessThanOrEqualTo(String value) {
            addCriterion("sortstate <=", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateLike(String value) {
            addCriterion("sortstate like", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotLike(String value) {
            addCriterion("sortstate not like", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateIn(List<String> values) {
            addCriterion("sortstate in", values, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotIn(List<String> values) {
            addCriterion("sortstate not in", values, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateBetween(String value1, String value2) {
            addCriterion("sortstate between", value1, value2, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotBetween(String value1, String value2) {
            addCriterion("sortstate not between", value1, value2, "sortstate");
            return (Criteria) this;
        }

        public Criteria andNumoneIsNull() {
            addCriterion("numone is null");
            return (Criteria) this;
        }

        public Criteria andNumoneIsNotNull() {
            addCriterion("numone is not null");
            return (Criteria) this;
        }

        public Criteria andNumoneEqualTo(String value) {
            addCriterion("numone =", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotEqualTo(String value) {
            addCriterion("numone <>", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneGreaterThan(String value) {
            addCriterion("numone >", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneGreaterThanOrEqualTo(String value) {
            addCriterion("numone >=", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneLessThan(String value) {
            addCriterion("numone <", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneLessThanOrEqualTo(String value) {
            addCriterion("numone <=", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneLike(String value) {
            addCriterion("numone like", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotLike(String value) {
            addCriterion("numone not like", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneIn(List<String> values) {
            addCriterion("numone in", values, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotIn(List<String> values) {
            addCriterion("numone not in", values, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneBetween(String value1, String value2) {
            addCriterion("numone between", value1, value2, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotBetween(String value1, String value2) {
            addCriterion("numone not between", value1, value2, "numone");
            return (Criteria) this;
        }

        public Criteria andNumtwoIsNull() {
            addCriterion("numtwo is null");
            return (Criteria) this;
        }

        public Criteria andNumtwoIsNotNull() {
            addCriterion("numtwo is not null");
            return (Criteria) this;
        }

        public Criteria andNumtwoEqualTo(String value) {
            addCriterion("numtwo =", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotEqualTo(String value) {
            addCriterion("numtwo <>", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoGreaterThan(String value) {
            addCriterion("numtwo >", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoGreaterThanOrEqualTo(String value) {
            addCriterion("numtwo >=", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoLessThan(String value) {
            addCriterion("numtwo <", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoLessThanOrEqualTo(String value) {
            addCriterion("numtwo <=", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoLike(String value) {
            addCriterion("numtwo like", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotLike(String value) {
            addCriterion("numtwo not like", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoIn(List<String> values) {
            addCriterion("numtwo in", values, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotIn(List<String> values) {
            addCriterion("numtwo not in", values, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoBetween(String value1, String value2) {
            addCriterion("numtwo between", value1, value2, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotBetween(String value1, String value2) {
            addCriterion("numtwo not between", value1, value2, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumthreeIsNull() {
            addCriterion("numthree is null");
            return (Criteria) this;
        }

        public Criteria andNumthreeIsNotNull() {
            addCriterion("numthree is not null");
            return (Criteria) this;
        }

        public Criteria andNumthreeEqualTo(String value) {
            addCriterion("numthree =", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotEqualTo(String value) {
            addCriterion("numthree <>", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeGreaterThan(String value) {
            addCriterion("numthree >", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeGreaterThanOrEqualTo(String value) {
            addCriterion("numthree >=", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeLessThan(String value) {
            addCriterion("numthree <", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeLessThanOrEqualTo(String value) {
            addCriterion("numthree <=", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeLike(String value) {
            addCriterion("numthree like", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotLike(String value) {
            addCriterion("numthree not like", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeIn(List<String> values) {
            addCriterion("numthree in", values, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotIn(List<String> values) {
            addCriterion("numthree not in", values, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeBetween(String value1, String value2) {
            addCriterion("numthree between", value1, value2, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotBetween(String value1, String value2) {
            addCriterion("numthree not between", value1, value2, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumforeIsNull() {
            addCriterion("numfore is null");
            return (Criteria) this;
        }

        public Criteria andNumforeIsNotNull() {
            addCriterion("numfore is not null");
            return (Criteria) this;
        }

        public Criteria andNumforeEqualTo(Integer value) {
            addCriterion("numfore =", value, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeNotEqualTo(Integer value) {
            addCriterion("numfore <>", value, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeGreaterThan(Integer value) {
            addCriterion("numfore >", value, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("numfore >=", value, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeLessThan(Integer value) {
            addCriterion("numfore <", value, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeLessThanOrEqualTo(Integer value) {
            addCriterion("numfore <=", value, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeIn(List<Integer> values) {
            addCriterion("numfore in", values, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeNotIn(List<Integer> values) {
            addCriterion("numfore not in", values, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeBetween(Integer value1, Integer value2) {
            addCriterion("numfore between", value1, value2, "numfore");
            return (Criteria) this;
        }

        public Criteria andNumforeNotBetween(Integer value1, Integer value2) {
            addCriterion("numfore not between", value1, value2, "numfore");
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