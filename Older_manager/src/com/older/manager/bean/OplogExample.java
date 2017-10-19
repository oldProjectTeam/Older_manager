package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OplogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OplogExample() {
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

        public Criteria andLoginipIsNull() {
            addCriterion("loginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNull() {
            addCriterion("loginCount is null");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNotNull() {
            addCriterion("loginCount is not null");
            return (Criteria) this;
        }

        public Criteria andLogincountEqualTo(Integer value) {
            addCriterion("loginCount =", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotEqualTo(Integer value) {
            addCriterion("loginCount <>", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThan(Integer value) {
            addCriterion("loginCount >", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginCount >=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThan(Integer value) {
            addCriterion("loginCount <", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThanOrEqualTo(Integer value) {
            addCriterion("loginCount <=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountIn(List<Integer> values) {
            addCriterion("loginCount in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotIn(List<Integer> values) {
            addCriterion("loginCount not in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountBetween(Integer value1, Integer value2) {
            addCriterion("loginCount between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("loginCount not between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andOpmsgIsNull() {
            addCriterion("opmsg is null");
            return (Criteria) this;
        }

        public Criteria andOpmsgIsNotNull() {
            addCriterion("opmsg is not null");
            return (Criteria) this;
        }

        public Criteria andOpmsgEqualTo(String value) {
            addCriterion("opmsg =", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotEqualTo(String value) {
            addCriterion("opmsg <>", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgGreaterThan(String value) {
            addCriterion("opmsg >", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgGreaterThanOrEqualTo(String value) {
            addCriterion("opmsg >=", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgLessThan(String value) {
            addCriterion("opmsg <", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgLessThanOrEqualTo(String value) {
            addCriterion("opmsg <=", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgLike(String value) {
            addCriterion("opmsg like", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotLike(String value) {
            addCriterion("opmsg not like", value, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgIn(List<String> values) {
            addCriterion("opmsg in", values, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotIn(List<String> values) {
            addCriterion("opmsg not in", values, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgBetween(String value1, String value2) {
            addCriterion("opmsg between", value1, value2, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOpmsgNotBetween(String value1, String value2) {
            addCriterion("opmsg not between", value1, value2, "opmsg");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNull() {
            addCriterion("opType is null");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNotNull() {
            addCriterion("opType is not null");
            return (Criteria) this;
        }

        public Criteria andOptypeEqualTo(String value) {
            addCriterion("opType =", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotEqualTo(String value) {
            addCriterion("opType <>", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThan(String value) {
            addCriterion("opType >", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThanOrEqualTo(String value) {
            addCriterion("opType >=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThan(String value) {
            addCriterion("opType <", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThanOrEqualTo(String value) {
            addCriterion("opType <=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLike(String value) {
            addCriterion("opType like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotLike(String value) {
            addCriterion("opType not like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeIn(List<String> values) {
            addCriterion("opType in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotIn(List<String> values) {
            addCriterion("opType not in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeBetween(String value1, String value2) {
            addCriterion("opType between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotBetween(String value1, String value2) {
            addCriterion("opType not between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOplog1IsNull() {
            addCriterion("opLog1 is null");
            return (Criteria) this;
        }

        public Criteria andOplog1IsNotNull() {
            addCriterion("opLog1 is not null");
            return (Criteria) this;
        }

        public Criteria andOplog1EqualTo(String value) {
            addCriterion("opLog1 =", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1NotEqualTo(String value) {
            addCriterion("opLog1 <>", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1GreaterThan(String value) {
            addCriterion("opLog1 >", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1GreaterThanOrEqualTo(String value) {
            addCriterion("opLog1 >=", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1LessThan(String value) {
            addCriterion("opLog1 <", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1LessThanOrEqualTo(String value) {
            addCriterion("opLog1 <=", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1Like(String value) {
            addCriterion("opLog1 like", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1NotLike(String value) {
            addCriterion("opLog1 not like", value, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1In(List<String> values) {
            addCriterion("opLog1 in", values, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1NotIn(List<String> values) {
            addCriterion("opLog1 not in", values, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1Between(String value1, String value2) {
            addCriterion("opLog1 between", value1, value2, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog1NotBetween(String value1, String value2) {
            addCriterion("opLog1 not between", value1, value2, "oplog1");
            return (Criteria) this;
        }

        public Criteria andOplog2IsNull() {
            addCriterion("opLog2 is null");
            return (Criteria) this;
        }

        public Criteria andOplog2IsNotNull() {
            addCriterion("opLog2 is not null");
            return (Criteria) this;
        }

        public Criteria andOplog2EqualTo(String value) {
            addCriterion("opLog2 =", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2NotEqualTo(String value) {
            addCriterion("opLog2 <>", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2GreaterThan(String value) {
            addCriterion("opLog2 >", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2GreaterThanOrEqualTo(String value) {
            addCriterion("opLog2 >=", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2LessThan(String value) {
            addCriterion("opLog2 <", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2LessThanOrEqualTo(String value) {
            addCriterion("opLog2 <=", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2Like(String value) {
            addCriterion("opLog2 like", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2NotLike(String value) {
            addCriterion("opLog2 not like", value, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2In(List<String> values) {
            addCriterion("opLog2 in", values, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2NotIn(List<String> values) {
            addCriterion("opLog2 not in", values, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2Between(String value1, String value2) {
            addCriterion("opLog2 between", value1, value2, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog2NotBetween(String value1, String value2) {
            addCriterion("opLog2 not between", value1, value2, "oplog2");
            return (Criteria) this;
        }

        public Criteria andOplog3IsNull() {
            addCriterion("opLog3 is null");
            return (Criteria) this;
        }

        public Criteria andOplog3IsNotNull() {
            addCriterion("opLog3 is not null");
            return (Criteria) this;
        }

        public Criteria andOplog3EqualTo(String value) {
            addCriterion("opLog3 =", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3NotEqualTo(String value) {
            addCriterion("opLog3 <>", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3GreaterThan(String value) {
            addCriterion("opLog3 >", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3GreaterThanOrEqualTo(String value) {
            addCriterion("opLog3 >=", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3LessThan(String value) {
            addCriterion("opLog3 <", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3LessThanOrEqualTo(String value) {
            addCriterion("opLog3 <=", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3Like(String value) {
            addCriterion("opLog3 like", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3NotLike(String value) {
            addCriterion("opLog3 not like", value, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3In(List<String> values) {
            addCriterion("opLog3 in", values, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3NotIn(List<String> values) {
            addCriterion("opLog3 not in", values, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3Between(String value1, String value2) {
            addCriterion("opLog3 between", value1, value2, "oplog3");
            return (Criteria) this;
        }

        public Criteria andOplog3NotBetween(String value1, String value2) {
            addCriterion("opLog3 not between", value1, value2, "oplog3");
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