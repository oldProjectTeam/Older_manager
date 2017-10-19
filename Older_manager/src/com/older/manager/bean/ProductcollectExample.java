package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductcollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductcollectExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOldmanaccountIdIsNull() {
            addCriterion("oldManAccount_id is null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdIsNotNull() {
            addCriterion("oldManAccount_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdEqualTo(Integer value) {
            addCriterion("oldManAccount_id =", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdNotEqualTo(Integer value) {
            addCriterion("oldManAccount_id <>", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdGreaterThan(Integer value) {
            addCriterion("oldManAccount_id >", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldManAccount_id >=", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdLessThan(Integer value) {
            addCriterion("oldManAccount_id <", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldManAccount_id <=", value, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdIn(List<Integer> values) {
            addCriterion("oldManAccount_id in", values, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdNotIn(List<Integer> values) {
            addCriterion("oldManAccount_id not in", values, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdBetween(Integer value1, Integer value2) {
            addCriterion("oldManAccount_id between", value1, value2, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andOldmanaccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldManAccount_id not between", value1, value2, "oldmanaccountId");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNull() {
            addCriterion("Products_id is null");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNotNull() {
            addCriterion("Products_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductsIdEqualTo(Integer value) {
            addCriterion("Products_id =", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotEqualTo(Integer value) {
            addCriterion("Products_id <>", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThan(Integer value) {
            addCriterion("Products_id >", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Products_id >=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThan(Integer value) {
            addCriterion("Products_id <", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Products_id <=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdIn(List<Integer> values) {
            addCriterion("Products_id in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotIn(List<Integer> values) {
            addCriterion("Products_id not in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdBetween(Integer value1, Integer value2) {
            addCriterion("Products_id between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Products_id not between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andProductcollect1IsNull() {
            addCriterion("productCollect1 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect1IsNotNull() {
            addCriterion("productCollect1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect1EqualTo(String value) {
            addCriterion("productCollect1 =", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1NotEqualTo(String value) {
            addCriterion("productCollect1 <>", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1GreaterThan(String value) {
            addCriterion("productCollect1 >", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect1 >=", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1LessThan(String value) {
            addCriterion("productCollect1 <", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1LessThanOrEqualTo(String value) {
            addCriterion("productCollect1 <=", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1Like(String value) {
            addCriterion("productCollect1 like", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1NotLike(String value) {
            addCriterion("productCollect1 not like", value, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1In(List<String> values) {
            addCriterion("productCollect1 in", values, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1NotIn(List<String> values) {
            addCriterion("productCollect1 not in", values, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1Between(String value1, String value2) {
            addCriterion("productCollect1 between", value1, value2, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect1NotBetween(String value1, String value2) {
            addCriterion("productCollect1 not between", value1, value2, "productcollect1");
            return (Criteria) this;
        }

        public Criteria andProductcollect2IsNull() {
            addCriterion("productCollect2 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect2IsNotNull() {
            addCriterion("productCollect2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect2EqualTo(String value) {
            addCriterion("productCollect2 =", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2NotEqualTo(String value) {
            addCriterion("productCollect2 <>", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2GreaterThan(String value) {
            addCriterion("productCollect2 >", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect2 >=", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2LessThan(String value) {
            addCriterion("productCollect2 <", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2LessThanOrEqualTo(String value) {
            addCriterion("productCollect2 <=", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2Like(String value) {
            addCriterion("productCollect2 like", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2NotLike(String value) {
            addCriterion("productCollect2 not like", value, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2In(List<String> values) {
            addCriterion("productCollect2 in", values, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2NotIn(List<String> values) {
            addCriterion("productCollect2 not in", values, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2Between(String value1, String value2) {
            addCriterion("productCollect2 between", value1, value2, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect2NotBetween(String value1, String value2) {
            addCriterion("productCollect2 not between", value1, value2, "productcollect2");
            return (Criteria) this;
        }

        public Criteria andProductcollect3IsNull() {
            addCriterion("productCollect3 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect3IsNotNull() {
            addCriterion("productCollect3 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect3EqualTo(String value) {
            addCriterion("productCollect3 =", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3NotEqualTo(String value) {
            addCriterion("productCollect3 <>", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3GreaterThan(String value) {
            addCriterion("productCollect3 >", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect3 >=", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3LessThan(String value) {
            addCriterion("productCollect3 <", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3LessThanOrEqualTo(String value) {
            addCriterion("productCollect3 <=", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3Like(String value) {
            addCriterion("productCollect3 like", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3NotLike(String value) {
            addCriterion("productCollect3 not like", value, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3In(List<String> values) {
            addCriterion("productCollect3 in", values, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3NotIn(List<String> values) {
            addCriterion("productCollect3 not in", values, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3Between(String value1, String value2) {
            addCriterion("productCollect3 between", value1, value2, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect3NotBetween(String value1, String value2) {
            addCriterion("productCollect3 not between", value1, value2, "productcollect3");
            return (Criteria) this;
        }

        public Criteria andProductcollect4IsNull() {
            addCriterion("productCollect4 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect4IsNotNull() {
            addCriterion("productCollect4 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect4EqualTo(String value) {
            addCriterion("productCollect4 =", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4NotEqualTo(String value) {
            addCriterion("productCollect4 <>", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4GreaterThan(String value) {
            addCriterion("productCollect4 >", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect4 >=", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4LessThan(String value) {
            addCriterion("productCollect4 <", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4LessThanOrEqualTo(String value) {
            addCriterion("productCollect4 <=", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4Like(String value) {
            addCriterion("productCollect4 like", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4NotLike(String value) {
            addCriterion("productCollect4 not like", value, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4In(List<String> values) {
            addCriterion("productCollect4 in", values, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4NotIn(List<String> values) {
            addCriterion("productCollect4 not in", values, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4Between(String value1, String value2) {
            addCriterion("productCollect4 between", value1, value2, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect4NotBetween(String value1, String value2) {
            addCriterion("productCollect4 not between", value1, value2, "productcollect4");
            return (Criteria) this;
        }

        public Criteria andProductcollect5IsNull() {
            addCriterion("productCollect5 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect5IsNotNull() {
            addCriterion("productCollect5 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect5EqualTo(String value) {
            addCriterion("productCollect5 =", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5NotEqualTo(String value) {
            addCriterion("productCollect5 <>", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5GreaterThan(String value) {
            addCriterion("productCollect5 >", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect5 >=", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5LessThan(String value) {
            addCriterion("productCollect5 <", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5LessThanOrEqualTo(String value) {
            addCriterion("productCollect5 <=", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5Like(String value) {
            addCriterion("productCollect5 like", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5NotLike(String value) {
            addCriterion("productCollect5 not like", value, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5In(List<String> values) {
            addCriterion("productCollect5 in", values, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5NotIn(List<String> values) {
            addCriterion("productCollect5 not in", values, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5Between(String value1, String value2) {
            addCriterion("productCollect5 between", value1, value2, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect5NotBetween(String value1, String value2) {
            addCriterion("productCollect5 not between", value1, value2, "productcollect5");
            return (Criteria) this;
        }

        public Criteria andProductcollect6IsNull() {
            addCriterion("productCollect6 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect6IsNotNull() {
            addCriterion("productCollect6 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect6EqualTo(String value) {
            addCriterion("productCollect6 =", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6NotEqualTo(String value) {
            addCriterion("productCollect6 <>", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6GreaterThan(String value) {
            addCriterion("productCollect6 >", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect6 >=", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6LessThan(String value) {
            addCriterion("productCollect6 <", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6LessThanOrEqualTo(String value) {
            addCriterion("productCollect6 <=", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6Like(String value) {
            addCriterion("productCollect6 like", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6NotLike(String value) {
            addCriterion("productCollect6 not like", value, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6In(List<String> values) {
            addCriterion("productCollect6 in", values, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6NotIn(List<String> values) {
            addCriterion("productCollect6 not in", values, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6Between(String value1, String value2) {
            addCriterion("productCollect6 between", value1, value2, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect6NotBetween(String value1, String value2) {
            addCriterion("productCollect6 not between", value1, value2, "productcollect6");
            return (Criteria) this;
        }

        public Criteria andProductcollect7IsNull() {
            addCriterion("productCollect7 is null");
            return (Criteria) this;
        }

        public Criteria andProductcollect7IsNotNull() {
            addCriterion("productCollect7 is not null");
            return (Criteria) this;
        }

        public Criteria andProductcollect7EqualTo(String value) {
            addCriterion("productCollect7 =", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7NotEqualTo(String value) {
            addCriterion("productCollect7 <>", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7GreaterThan(String value) {
            addCriterion("productCollect7 >", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7GreaterThanOrEqualTo(String value) {
            addCriterion("productCollect7 >=", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7LessThan(String value) {
            addCriterion("productCollect7 <", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7LessThanOrEqualTo(String value) {
            addCriterion("productCollect7 <=", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7Like(String value) {
            addCriterion("productCollect7 like", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7NotLike(String value) {
            addCriterion("productCollect7 not like", value, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7In(List<String> values) {
            addCriterion("productCollect7 in", values, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7NotIn(List<String> values) {
            addCriterion("productCollect7 not in", values, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7Between(String value1, String value2) {
            addCriterion("productCollect7 between", value1, value2, "productcollect7");
            return (Criteria) this;
        }

        public Criteria andProductcollect7NotBetween(String value1, String value2) {
            addCriterion("productCollect7 not between", value1, value2, "productcollect7");
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