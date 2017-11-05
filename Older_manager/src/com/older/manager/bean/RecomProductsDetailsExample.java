package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecomProductsDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecomProductsDetailsExample() {
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

        public Criteria andRecomproductsIdIsNull() {
            addCriterion("\"recomProducts _id\" is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdIsNotNull() {
            addCriterion("\"recomProducts _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdEqualTo(Integer value) {
            addCriterion("\"recomProducts _id\" =", value, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdNotEqualTo(Integer value) {
            addCriterion("\"recomProducts _id\" <>", value, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdGreaterThan(Integer value) {
            addCriterion("\"recomProducts _id\" >", value, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"recomProducts _id\" >=", value, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdLessThan(Integer value) {
            addCriterion("\"recomProducts _id\" <", value, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdLessThanOrEqualTo(Integer value) {
            addCriterion("\"recomProducts _id\" <=", value, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdIn(List<Integer> values) {
            addCriterion("\"recomProducts _id\" in", values, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdNotIn(List<Integer> values) {
            addCriterion("\"recomProducts _id\" not in", values, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdBetween(Integer value1, Integer value2) {
            addCriterion("\"recomProducts _id\" between", value1, value2, "recomproductsId");
            return (Criteria) this;
        }

        public Criteria andRecomproductsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\"recomProducts _id\" not between", value1, value2, "recomproductsId");
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

        public Criteria andRecomproductsdetails1IsNull() {
            addCriterion("recomProductsDetails1 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1IsNotNull() {
            addCriterion("recomProductsDetails1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1EqualTo(String value) {
            addCriterion("recomProductsDetails1 =", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1NotEqualTo(String value) {
            addCriterion("recomProductsDetails1 <>", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1GreaterThan(String value) {
            addCriterion("recomProductsDetails1 >", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails1 >=", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1LessThan(String value) {
            addCriterion("recomProductsDetails1 <", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails1 <=", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1Like(String value) {
            addCriterion("recomProductsDetails1 like", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1NotLike(String value) {
            addCriterion("recomProductsDetails1 not like", value, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1In(List<String> values) {
            addCriterion("recomProductsDetails1 in", values, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1NotIn(List<String> values) {
            addCriterion("recomProductsDetails1 not in", values, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1Between(String value1, String value2) {
            addCriterion("recomProductsDetails1 between", value1, value2, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails1NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails1 not between", value1, value2, "recomproductsdetails1");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2IsNull() {
            addCriterion("recomProductsDetails2 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2IsNotNull() {
            addCriterion("recomProductsDetails2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2EqualTo(String value) {
            addCriterion("recomProductsDetails2 =", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2NotEqualTo(String value) {
            addCriterion("recomProductsDetails2 <>", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2GreaterThan(String value) {
            addCriterion("recomProductsDetails2 >", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails2 >=", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2LessThan(String value) {
            addCriterion("recomProductsDetails2 <", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails2 <=", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2Like(String value) {
            addCriterion("recomProductsDetails2 like", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2NotLike(String value) {
            addCriterion("recomProductsDetails2 not like", value, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2In(List<String> values) {
            addCriterion("recomProductsDetails2 in", values, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2NotIn(List<String> values) {
            addCriterion("recomProductsDetails2 not in", values, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2Between(String value1, String value2) {
            addCriterion("recomProductsDetails2 between", value1, value2, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails2NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails2 not between", value1, value2, "recomproductsdetails2");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3IsNull() {
            addCriterion("recomProductsDetails3 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3IsNotNull() {
            addCriterion("recomProductsDetails3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3EqualTo(String value) {
            addCriterion("recomProductsDetails3 =", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3NotEqualTo(String value) {
            addCriterion("recomProductsDetails3 <>", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3GreaterThan(String value) {
            addCriterion("recomProductsDetails3 >", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails3 >=", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3LessThan(String value) {
            addCriterion("recomProductsDetails3 <", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails3 <=", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3Like(String value) {
            addCriterion("recomProductsDetails3 like", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3NotLike(String value) {
            addCriterion("recomProductsDetails3 not like", value, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3In(List<String> values) {
            addCriterion("recomProductsDetails3 in", values, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3NotIn(List<String> values) {
            addCriterion("recomProductsDetails3 not in", values, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3Between(String value1, String value2) {
            addCriterion("recomProductsDetails3 between", value1, value2, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails3NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails3 not between", value1, value2, "recomproductsdetails3");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4IsNull() {
            addCriterion("recomProductsDetails4 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4IsNotNull() {
            addCriterion("recomProductsDetails4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4EqualTo(String value) {
            addCriterion("recomProductsDetails4 =", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4NotEqualTo(String value) {
            addCriterion("recomProductsDetails4 <>", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4GreaterThan(String value) {
            addCriterion("recomProductsDetails4 >", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails4 >=", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4LessThan(String value) {
            addCriterion("recomProductsDetails4 <", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails4 <=", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4Like(String value) {
            addCriterion("recomProductsDetails4 like", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4NotLike(String value) {
            addCriterion("recomProductsDetails4 not like", value, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4In(List<String> values) {
            addCriterion("recomProductsDetails4 in", values, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4NotIn(List<String> values) {
            addCriterion("recomProductsDetails4 not in", values, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4Between(String value1, String value2) {
            addCriterion("recomProductsDetails4 between", value1, value2, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails4NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails4 not between", value1, value2, "recomproductsdetails4");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5IsNull() {
            addCriterion("recomProductsDetails5 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5IsNotNull() {
            addCriterion("recomProductsDetails5 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5EqualTo(String value) {
            addCriterion("recomProductsDetails5 =", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5NotEqualTo(String value) {
            addCriterion("recomProductsDetails5 <>", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5GreaterThan(String value) {
            addCriterion("recomProductsDetails5 >", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails5 >=", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5LessThan(String value) {
            addCriterion("recomProductsDetails5 <", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails5 <=", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5Like(String value) {
            addCriterion("recomProductsDetails5 like", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5NotLike(String value) {
            addCriterion("recomProductsDetails5 not like", value, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5In(List<String> values) {
            addCriterion("recomProductsDetails5 in", values, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5NotIn(List<String> values) {
            addCriterion("recomProductsDetails5 not in", values, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5Between(String value1, String value2) {
            addCriterion("recomProductsDetails5 between", value1, value2, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails5NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails5 not between", value1, value2, "recomproductsdetails5");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6IsNull() {
            addCriterion("recomProductsDetails6 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6IsNotNull() {
            addCriterion("recomProductsDetails6 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6EqualTo(String value) {
            addCriterion("recomProductsDetails6 =", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6NotEqualTo(String value) {
            addCriterion("recomProductsDetails6 <>", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6GreaterThan(String value) {
            addCriterion("recomProductsDetails6 >", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails6 >=", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6LessThan(String value) {
            addCriterion("recomProductsDetails6 <", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails6 <=", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6Like(String value) {
            addCriterion("recomProductsDetails6 like", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6NotLike(String value) {
            addCriterion("recomProductsDetails6 not like", value, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6In(List<String> values) {
            addCriterion("recomProductsDetails6 in", values, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6NotIn(List<String> values) {
            addCriterion("recomProductsDetails6 not in", values, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6Between(String value1, String value2) {
            addCriterion("recomProductsDetails6 between", value1, value2, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails6NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails6 not between", value1, value2, "recomproductsdetails6");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7IsNull() {
            addCriterion("recomProductsDetails7 is null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7IsNotNull() {
            addCriterion("recomProductsDetails7 is not null");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7EqualTo(String value) {
            addCriterion("recomProductsDetails7 =", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7NotEqualTo(String value) {
            addCriterion("recomProductsDetails7 <>", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7GreaterThan(String value) {
            addCriterion("recomProductsDetails7 >", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7GreaterThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails7 >=", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7LessThan(String value) {
            addCriterion("recomProductsDetails7 <", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7LessThanOrEqualTo(String value) {
            addCriterion("recomProductsDetails7 <=", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7Like(String value) {
            addCriterion("recomProductsDetails7 like", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7NotLike(String value) {
            addCriterion("recomProductsDetails7 not like", value, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7In(List<String> values) {
            addCriterion("recomProductsDetails7 in", values, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7NotIn(List<String> values) {
            addCriterion("recomProductsDetails7 not in", values, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7Between(String value1, String value2) {
            addCriterion("recomProductsDetails7 between", value1, value2, "recomproductsdetails7");
            return (Criteria) this;
        }

        public Criteria andRecomproductsdetails7NotBetween(String value1, String value2) {
            addCriterion("recomProductsDetails7 not between", value1, value2, "recomproductsdetails7");
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