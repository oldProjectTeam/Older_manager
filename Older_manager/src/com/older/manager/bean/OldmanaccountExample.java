package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OldmanaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldmanaccountExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
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

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Date value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Date value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Date value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Date value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Date value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Date value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Date> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Date> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Date value1, Date value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Date value1, Date value2) {
            addCriterion("integral not between", value1, value2, "integral");
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

        public Criteria andOldmanaccount1IsNull() {
            addCriterion("oldManAccount1 is null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1IsNotNull() {
            addCriterion("oldManAccount1 is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1EqualTo(String value) {
            addCriterion("oldManAccount1 =", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1NotEqualTo(String value) {
            addCriterion("oldManAccount1 <>", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1GreaterThan(String value) {
            addCriterion("oldManAccount1 >", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1GreaterThanOrEqualTo(String value) {
            addCriterion("oldManAccount1 >=", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1LessThan(String value) {
            addCriterion("oldManAccount1 <", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1LessThanOrEqualTo(String value) {
            addCriterion("oldManAccount1 <=", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1Like(String value) {
            addCriterion("oldManAccount1 like", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1NotLike(String value) {
            addCriterion("oldManAccount1 not like", value, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1In(List<String> values) {
            addCriterion("oldManAccount1 in", values, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1NotIn(List<String> values) {
            addCriterion("oldManAccount1 not in", values, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1Between(String value1, String value2) {
            addCriterion("oldManAccount1 between", value1, value2, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount1NotBetween(String value1, String value2) {
            addCriterion("oldManAccount1 not between", value1, value2, "oldmanaccount1");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2IsNull() {
            addCriterion("oldManAccount2 is null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2IsNotNull() {
            addCriterion("oldManAccount2 is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2EqualTo(String value) {
            addCriterion("oldManAccount2 =", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2NotEqualTo(String value) {
            addCriterion("oldManAccount2 <>", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2GreaterThan(String value) {
            addCriterion("oldManAccount2 >", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2GreaterThanOrEqualTo(String value) {
            addCriterion("oldManAccount2 >=", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2LessThan(String value) {
            addCriterion("oldManAccount2 <", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2LessThanOrEqualTo(String value) {
            addCriterion("oldManAccount2 <=", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2Like(String value) {
            addCriterion("oldManAccount2 like", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2NotLike(String value) {
            addCriterion("oldManAccount2 not like", value, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2In(List<String> values) {
            addCriterion("oldManAccount2 in", values, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2NotIn(List<String> values) {
            addCriterion("oldManAccount2 not in", values, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2Between(String value1, String value2) {
            addCriterion("oldManAccount2 between", value1, value2, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount2NotBetween(String value1, String value2) {
            addCriterion("oldManAccount2 not between", value1, value2, "oldmanaccount2");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3IsNull() {
            addCriterion("oldManAccount3 is null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3IsNotNull() {
            addCriterion("oldManAccount3 is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3EqualTo(String value) {
            addCriterion("oldManAccount3 =", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3NotEqualTo(String value) {
            addCriterion("oldManAccount3 <>", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3GreaterThan(String value) {
            addCriterion("oldManAccount3 >", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3GreaterThanOrEqualTo(String value) {
            addCriterion("oldManAccount3 >=", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3LessThan(String value) {
            addCriterion("oldManAccount3 <", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3LessThanOrEqualTo(String value) {
            addCriterion("oldManAccount3 <=", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3Like(String value) {
            addCriterion("oldManAccount3 like", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3NotLike(String value) {
            addCriterion("oldManAccount3 not like", value, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3In(List<String> values) {
            addCriterion("oldManAccount3 in", values, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3NotIn(List<String> values) {
            addCriterion("oldManAccount3 not in", values, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3Between(String value1, String value2) {
            addCriterion("oldManAccount3 between", value1, value2, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount3NotBetween(String value1, String value2) {
            addCriterion("oldManAccount3 not between", value1, value2, "oldmanaccount3");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4IsNull() {
            addCriterion("oldManAccount4 is null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4IsNotNull() {
            addCriterion("oldManAccount4 is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4EqualTo(String value) {
            addCriterion("oldManAccount4 =", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4NotEqualTo(String value) {
            addCriterion("oldManAccount4 <>", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4GreaterThan(String value) {
            addCriterion("oldManAccount4 >", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4GreaterThanOrEqualTo(String value) {
            addCriterion("oldManAccount4 >=", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4LessThan(String value) {
            addCriterion("oldManAccount4 <", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4LessThanOrEqualTo(String value) {
            addCriterion("oldManAccount4 <=", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4Like(String value) {
            addCriterion("oldManAccount4 like", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4NotLike(String value) {
            addCriterion("oldManAccount4 not like", value, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4In(List<String> values) {
            addCriterion("oldManAccount4 in", values, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4NotIn(List<String> values) {
            addCriterion("oldManAccount4 not in", values, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4Between(String value1, String value2) {
            addCriterion("oldManAccount4 between", value1, value2, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andOldmanaccount4NotBetween(String value1, String value2) {
            addCriterion("oldManAccount4 not between", value1, value2, "oldmanaccount4");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("userType like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("userType not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("userType not between", value1, value2, "usertype");
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