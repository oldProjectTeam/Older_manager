package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecomProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecomProductsExample() {
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

        public Criteria andProductsIdIsNull() {
            addCriterion("\"products _id\" is null");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNotNull() {
            addCriterion("\"products _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductsIdEqualTo(Integer value) {
            addCriterion("\"products _id\" =", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotEqualTo(Integer value) {
            addCriterion("\"products _id\" <>", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThan(Integer value) {
            addCriterion("\"products _id\" >", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"products _id\" >=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThan(Integer value) {
            addCriterion("\"products _id\" <", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"products _id\" <=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdIn(List<Integer> values) {
            addCriterion("\"products _id\" in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotIn(List<Integer> values) {
            addCriterion("\"products _id\" not in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdBetween(Integer value1, Integer value2) {
            addCriterion("\"products _id\" between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"products _id\" not between", value1, value2, "productsId");
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

        public Criteria andRecomidEqualTo(String value) {
            addCriterion("recomId =", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotEqualTo(String value) {
            addCriterion("recomId <>", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThan(String value) {
            addCriterion("recomId >", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThanOrEqualTo(String value) {
            addCriterion("recomId >=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThan(String value) {
            addCriterion("recomId <", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThanOrEqualTo(String value) {
            addCriterion("recomId <=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLike(String value) {
            addCriterion("recomId like", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotLike(String value) {
            addCriterion("recomId not like", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidIn(List<String> values) {
            addCriterion("recomId in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotIn(List<String> values) {
            addCriterion("recomId not in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidBetween(String value1, String value2) {
            addCriterion("recomId between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotBetween(String value1, String value2) {
            addCriterion("recomId not between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1IsNull() {
            addCriterion("recomProducts1 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1IsNotNull() {
            addCriterion("recomProducts1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1EqualTo(String value) {
            addCriterion("recomProducts1 =", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1NotEqualTo(String value) {
            addCriterion("recomProducts1 <>", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1GreaterThan(String value) {
            addCriterion("recomProducts1 >", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts1 >=", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1LessThan(String value) {
            addCriterion("recomProducts1 <", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1LessThanOrEqualTo(String value) {
            addCriterion("recomProducts1 <=", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1Like(String value) {
            addCriterion("recomProducts1 like", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1NotLike(String value) {
            addCriterion("recomProducts1 not like", value, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1In(List<String> values) {
            addCriterion("recomProducts1 in", values, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1NotIn(List<String> values) {
            addCriterion("recomProducts1 not in", values, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1Between(String value1, String value2) {
            addCriterion("recomProducts1 between", value1, value2, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts1NotBetween(String value1, String value2) {
            addCriterion("recomProducts1 not between", value1, value2, "recomproducts1");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2IsNull() {
            addCriterion("recomProducts2 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2IsNotNull() {
            addCriterion("recomProducts2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2EqualTo(String value) {
            addCriterion("recomProducts2 =", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2NotEqualTo(String value) {
            addCriterion("recomProducts2 <>", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2GreaterThan(String value) {
            addCriterion("recomProducts2 >", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts2 >=", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2LessThan(String value) {
            addCriterion("recomProducts2 <", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2LessThanOrEqualTo(String value) {
            addCriterion("recomProducts2 <=", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2Like(String value) {
            addCriterion("recomProducts2 like", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2NotLike(String value) {
            addCriterion("recomProducts2 not like", value, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2In(List<String> values) {
            addCriterion("recomProducts2 in", values, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2NotIn(List<String> values) {
            addCriterion("recomProducts2 not in", values, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2Between(String value1, String value2) {
            addCriterion("recomProducts2 between", value1, value2, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts2NotBetween(String value1, String value2) {
            addCriterion("recomProducts2 not between", value1, value2, "recomproducts2");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3IsNull() {
            addCriterion("recomProducts3 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3IsNotNull() {
            addCriterion("recomProducts3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3EqualTo(String value) {
            addCriterion("recomProducts3 =", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3NotEqualTo(String value) {
            addCriterion("recomProducts3 <>", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3GreaterThan(String value) {
            addCriterion("recomProducts3 >", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts3 >=", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3LessThan(String value) {
            addCriterion("recomProducts3 <", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3LessThanOrEqualTo(String value) {
            addCriterion("recomProducts3 <=", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3Like(String value) {
            addCriterion("recomProducts3 like", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3NotLike(String value) {
            addCriterion("recomProducts3 not like", value, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3In(List<String> values) {
            addCriterion("recomProducts3 in", values, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3NotIn(List<String> values) {
            addCriterion("recomProducts3 not in", values, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3Between(String value1, String value2) {
            addCriterion("recomProducts3 between", value1, value2, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts3NotBetween(String value1, String value2) {
            addCriterion("recomProducts3 not between", value1, value2, "recomproducts3");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4IsNull() {
            addCriterion("recomProducts4 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4IsNotNull() {
            addCriterion("recomProducts4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4EqualTo(String value) {
            addCriterion("recomProducts4 =", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4NotEqualTo(String value) {
            addCriterion("recomProducts4 <>", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4GreaterThan(String value) {
            addCriterion("recomProducts4 >", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts4 >=", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4LessThan(String value) {
            addCriterion("recomProducts4 <", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4LessThanOrEqualTo(String value) {
            addCriterion("recomProducts4 <=", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4Like(String value) {
            addCriterion("recomProducts4 like", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4NotLike(String value) {
            addCriterion("recomProducts4 not like", value, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4In(List<String> values) {
            addCriterion("recomProducts4 in", values, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4NotIn(List<String> values) {
            addCriterion("recomProducts4 not in", values, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4Between(String value1, String value2) {
            addCriterion("recomProducts4 between", value1, value2, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts4NotBetween(String value1, String value2) {
            addCriterion("recomProducts4 not between", value1, value2, "recomproducts4");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5IsNull() {
            addCriterion("recomProducts5 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5IsNotNull() {
            addCriterion("recomProducts5 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5EqualTo(String value) {
            addCriterion("recomProducts5 =", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5NotEqualTo(String value) {
            addCriterion("recomProducts5 <>", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5GreaterThan(String value) {
            addCriterion("recomProducts5 >", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts5 >=", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5LessThan(String value) {
            addCriterion("recomProducts5 <", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5LessThanOrEqualTo(String value) {
            addCriterion("recomProducts5 <=", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5Like(String value) {
            addCriterion("recomProducts5 like", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5NotLike(String value) {
            addCriterion("recomProducts5 not like", value, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5In(List<String> values) {
            addCriterion("recomProducts5 in", values, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5NotIn(List<String> values) {
            addCriterion("recomProducts5 not in", values, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5Between(String value1, String value2) {
            addCriterion("recomProducts5 between", value1, value2, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts5NotBetween(String value1, String value2) {
            addCriterion("recomProducts5 not between", value1, value2, "recomproducts5");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6IsNull() {
            addCriterion("recomProducts6 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6IsNotNull() {
            addCriterion("recomProducts6 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6EqualTo(String value) {
            addCriterion("recomProducts6 =", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6NotEqualTo(String value) {
            addCriterion("recomProducts6 <>", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6GreaterThan(String value) {
            addCriterion("recomProducts6 >", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts6 >=", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6LessThan(String value) {
            addCriterion("recomProducts6 <", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6LessThanOrEqualTo(String value) {
            addCriterion("recomProducts6 <=", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6Like(String value) {
            addCriterion("recomProducts6 like", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6NotLike(String value) {
            addCriterion("recomProducts6 not like", value, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6In(List<String> values) {
            addCriterion("recomProducts6 in", values, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6NotIn(List<String> values) {
            addCriterion("recomProducts6 not in", values, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6Between(String value1, String value2) {
            addCriterion("recomProducts6 between", value1, value2, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts6NotBetween(String value1, String value2) {
            addCriterion("recomProducts6 not between", value1, value2, "recomproducts6");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7IsNull() {
            addCriterion("recomProducts7 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7IsNotNull() {
            addCriterion("recomProducts7 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7EqualTo(String value) {
            addCriterion("recomProducts7 =", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7NotEqualTo(String value) {
            addCriterion("recomProducts7 <>", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7GreaterThan(String value) {
            addCriterion("recomProducts7 >", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7GreaterThanOrEqualTo(String value) {
            addCriterion("recomProducts7 >=", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7LessThan(String value) {
            addCriterion("recomProducts7 <", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7LessThanOrEqualTo(String value) {
            addCriterion("recomProducts7 <=", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7Like(String value) {
            addCriterion("recomProducts7 like", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7NotLike(String value) {
            addCriterion("recomProducts7 not like", value, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7In(List<String> values) {
            addCriterion("recomProducts7 in", values, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7NotIn(List<String> values) {
            addCriterion("recomProducts7 not in", values, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7Between(String value1, String value2) {
            addCriterion("recomProducts7 between", value1, value2, "recomproducts7");
            return (Criteria) this;
        }

        public Criteria andRecomproducts7NotBetween(String value1, String value2) {
            addCriterion("recomProducts7 not between", value1, value2, "recomproducts7");
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