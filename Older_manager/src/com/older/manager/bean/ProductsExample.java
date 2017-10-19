package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andParal1IsNull() {
            addCriterion("paral1 is null");
            return (Criteria) this;
        }

        public Criteria andParal1IsNotNull() {
            addCriterion("paral1 is not null");
            return (Criteria) this;
        }

        public Criteria andParal1EqualTo(String value) {
            addCriterion("paral1 =", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1NotEqualTo(String value) {
            addCriterion("paral1 <>", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1GreaterThan(String value) {
            addCriterion("paral1 >", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1GreaterThanOrEqualTo(String value) {
            addCriterion("paral1 >=", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1LessThan(String value) {
            addCriterion("paral1 <", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1LessThanOrEqualTo(String value) {
            addCriterion("paral1 <=", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1Like(String value) {
            addCriterion("paral1 like", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1NotLike(String value) {
            addCriterion("paral1 not like", value, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1In(List<String> values) {
            addCriterion("paral1 in", values, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1NotIn(List<String> values) {
            addCriterion("paral1 not in", values, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1Between(String value1, String value2) {
            addCriterion("paral1 between", value1, value2, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal1NotBetween(String value1, String value2) {
            addCriterion("paral1 not between", value1, value2, "paral1");
            return (Criteria) this;
        }

        public Criteria andParal2IsNull() {
            addCriterion("paral2 is null");
            return (Criteria) this;
        }

        public Criteria andParal2IsNotNull() {
            addCriterion("paral2 is not null");
            return (Criteria) this;
        }

        public Criteria andParal2EqualTo(String value) {
            addCriterion("paral2 =", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2NotEqualTo(String value) {
            addCriterion("paral2 <>", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2GreaterThan(String value) {
            addCriterion("paral2 >", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2GreaterThanOrEqualTo(String value) {
            addCriterion("paral2 >=", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2LessThan(String value) {
            addCriterion("paral2 <", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2LessThanOrEqualTo(String value) {
            addCriterion("paral2 <=", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2Like(String value) {
            addCriterion("paral2 like", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2NotLike(String value) {
            addCriterion("paral2 not like", value, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2In(List<String> values) {
            addCriterion("paral2 in", values, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2NotIn(List<String> values) {
            addCriterion("paral2 not in", values, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2Between(String value1, String value2) {
            addCriterion("paral2 between", value1, value2, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal2NotBetween(String value1, String value2) {
            addCriterion("paral2 not between", value1, value2, "paral2");
            return (Criteria) this;
        }

        public Criteria andParal3IsNull() {
            addCriterion("paral3 is null");
            return (Criteria) this;
        }

        public Criteria andParal3IsNotNull() {
            addCriterion("paral3 is not null");
            return (Criteria) this;
        }

        public Criteria andParal3EqualTo(String value) {
            addCriterion("paral3 =", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3NotEqualTo(String value) {
            addCriterion("paral3 <>", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3GreaterThan(String value) {
            addCriterion("paral3 >", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3GreaterThanOrEqualTo(String value) {
            addCriterion("paral3 >=", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3LessThan(String value) {
            addCriterion("paral3 <", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3LessThanOrEqualTo(String value) {
            addCriterion("paral3 <=", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3Like(String value) {
            addCriterion("paral3 like", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3NotLike(String value) {
            addCriterion("paral3 not like", value, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3In(List<String> values) {
            addCriterion("paral3 in", values, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3NotIn(List<String> values) {
            addCriterion("paral3 not in", values, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3Between(String value1, String value2) {
            addCriterion("paral3 between", value1, value2, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal3NotBetween(String value1, String value2) {
            addCriterion("paral3 not between", value1, value2, "paral3");
            return (Criteria) this;
        }

        public Criteria andParal4IsNull() {
            addCriterion("paral4 is null");
            return (Criteria) this;
        }

        public Criteria andParal4IsNotNull() {
            addCriterion("paral4 is not null");
            return (Criteria) this;
        }

        public Criteria andParal4EqualTo(String value) {
            addCriterion("paral4 =", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4NotEqualTo(String value) {
            addCriterion("paral4 <>", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4GreaterThan(String value) {
            addCriterion("paral4 >", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4GreaterThanOrEqualTo(String value) {
            addCriterion("paral4 >=", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4LessThan(String value) {
            addCriterion("paral4 <", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4LessThanOrEqualTo(String value) {
            addCriterion("paral4 <=", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4Like(String value) {
            addCriterion("paral4 like", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4NotLike(String value) {
            addCriterion("paral4 not like", value, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4In(List<String> values) {
            addCriterion("paral4 in", values, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4NotIn(List<String> values) {
            addCriterion("paral4 not in", values, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4Between(String value1, String value2) {
            addCriterion("paral4 between", value1, value2, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal4NotBetween(String value1, String value2) {
            addCriterion("paral4 not between", value1, value2, "paral4");
            return (Criteria) this;
        }

        public Criteria andParal5IsNull() {
            addCriterion("paral5 is null");
            return (Criteria) this;
        }

        public Criteria andParal5IsNotNull() {
            addCriterion("paral5 is not null");
            return (Criteria) this;
        }

        public Criteria andParal5EqualTo(String value) {
            addCriterion("paral5 =", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5NotEqualTo(String value) {
            addCriterion("paral5 <>", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5GreaterThan(String value) {
            addCriterion("paral5 >", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5GreaterThanOrEqualTo(String value) {
            addCriterion("paral5 >=", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5LessThan(String value) {
            addCriterion("paral5 <", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5LessThanOrEqualTo(String value) {
            addCriterion("paral5 <=", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5Like(String value) {
            addCriterion("paral5 like", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5NotLike(String value) {
            addCriterion("paral5 not like", value, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5In(List<String> values) {
            addCriterion("paral5 in", values, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5NotIn(List<String> values) {
            addCriterion("paral5 not in", values, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5Between(String value1, String value2) {
            addCriterion("paral5 between", value1, value2, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal5NotBetween(String value1, String value2) {
            addCriterion("paral5 not between", value1, value2, "paral5");
            return (Criteria) this;
        }

        public Criteria andParal6IsNull() {
            addCriterion("paral6 is null");
            return (Criteria) this;
        }

        public Criteria andParal6IsNotNull() {
            addCriterion("paral6 is not null");
            return (Criteria) this;
        }

        public Criteria andParal6EqualTo(String value) {
            addCriterion("paral6 =", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6NotEqualTo(String value) {
            addCriterion("paral6 <>", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6GreaterThan(String value) {
            addCriterion("paral6 >", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6GreaterThanOrEqualTo(String value) {
            addCriterion("paral6 >=", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6LessThan(String value) {
            addCriterion("paral6 <", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6LessThanOrEqualTo(String value) {
            addCriterion("paral6 <=", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6Like(String value) {
            addCriterion("paral6 like", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6NotLike(String value) {
            addCriterion("paral6 not like", value, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6In(List<String> values) {
            addCriterion("paral6 in", values, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6NotIn(List<String> values) {
            addCriterion("paral6 not in", values, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6Between(String value1, String value2) {
            addCriterion("paral6 between", value1, value2, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal6NotBetween(String value1, String value2) {
            addCriterion("paral6 not between", value1, value2, "paral6");
            return (Criteria) this;
        }

        public Criteria andParal7IsNull() {
            addCriterion("paral7 is null");
            return (Criteria) this;
        }

        public Criteria andParal7IsNotNull() {
            addCriterion("paral7 is not null");
            return (Criteria) this;
        }

        public Criteria andParal7EqualTo(String value) {
            addCriterion("paral7 =", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7NotEqualTo(String value) {
            addCriterion("paral7 <>", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7GreaterThan(String value) {
            addCriterion("paral7 >", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7GreaterThanOrEqualTo(String value) {
            addCriterion("paral7 >=", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7LessThan(String value) {
            addCriterion("paral7 <", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7LessThanOrEqualTo(String value) {
            addCriterion("paral7 <=", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7Like(String value) {
            addCriterion("paral7 like", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7NotLike(String value) {
            addCriterion("paral7 not like", value, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7In(List<String> values) {
            addCriterion("paral7 in", values, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7NotIn(List<String> values) {
            addCriterion("paral7 not in", values, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7Between(String value1, String value2) {
            addCriterion("paral7 between", value1, value2, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal7NotBetween(String value1, String value2) {
            addCriterion("paral7 not between", value1, value2, "paral7");
            return (Criteria) this;
        }

        public Criteria andParal8IsNull() {
            addCriterion("paral8 is null");
            return (Criteria) this;
        }

        public Criteria andParal8IsNotNull() {
            addCriterion("paral8 is not null");
            return (Criteria) this;
        }

        public Criteria andParal8EqualTo(String value) {
            addCriterion("paral8 =", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8NotEqualTo(String value) {
            addCriterion("paral8 <>", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8GreaterThan(String value) {
            addCriterion("paral8 >", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8GreaterThanOrEqualTo(String value) {
            addCriterion("paral8 >=", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8LessThan(String value) {
            addCriterion("paral8 <", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8LessThanOrEqualTo(String value) {
            addCriterion("paral8 <=", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8Like(String value) {
            addCriterion("paral8 like", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8NotLike(String value) {
            addCriterion("paral8 not like", value, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8In(List<String> values) {
            addCriterion("paral8 in", values, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8NotIn(List<String> values) {
            addCriterion("paral8 not in", values, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8Between(String value1, String value2) {
            addCriterion("paral8 between", value1, value2, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal8NotBetween(String value1, String value2) {
            addCriterion("paral8 not between", value1, value2, "paral8");
            return (Criteria) this;
        }

        public Criteria andParal9IsNull() {
            addCriterion("paral9 is null");
            return (Criteria) this;
        }

        public Criteria andParal9IsNotNull() {
            addCriterion("paral9 is not null");
            return (Criteria) this;
        }

        public Criteria andParal9EqualTo(String value) {
            addCriterion("paral9 =", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9NotEqualTo(String value) {
            addCriterion("paral9 <>", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9GreaterThan(String value) {
            addCriterion("paral9 >", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9GreaterThanOrEqualTo(String value) {
            addCriterion("paral9 >=", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9LessThan(String value) {
            addCriterion("paral9 <", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9LessThanOrEqualTo(String value) {
            addCriterion("paral9 <=", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9Like(String value) {
            addCriterion("paral9 like", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9NotLike(String value) {
            addCriterion("paral9 not like", value, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9In(List<String> values) {
            addCriterion("paral9 in", values, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9NotIn(List<String> values) {
            addCriterion("paral9 not in", values, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9Between(String value1, String value2) {
            addCriterion("paral9 between", value1, value2, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal9NotBetween(String value1, String value2) {
            addCriterion("paral9 not between", value1, value2, "paral9");
            return (Criteria) this;
        }

        public Criteria andParal10IsNull() {
            addCriterion("paral10 is null");
            return (Criteria) this;
        }

        public Criteria andParal10IsNotNull() {
            addCriterion("paral10 is not null");
            return (Criteria) this;
        }

        public Criteria andParal10EqualTo(String value) {
            addCriterion("paral10 =", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10NotEqualTo(String value) {
            addCriterion("paral10 <>", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10GreaterThan(String value) {
            addCriterion("paral10 >", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10GreaterThanOrEqualTo(String value) {
            addCriterion("paral10 >=", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10LessThan(String value) {
            addCriterion("paral10 <", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10LessThanOrEqualTo(String value) {
            addCriterion("paral10 <=", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10Like(String value) {
            addCriterion("paral10 like", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10NotLike(String value) {
            addCriterion("paral10 not like", value, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10In(List<String> values) {
            addCriterion("paral10 in", values, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10NotIn(List<String> values) {
            addCriterion("paral10 not in", values, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10Between(String value1, String value2) {
            addCriterion("paral10 between", value1, value2, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal10NotBetween(String value1, String value2) {
            addCriterion("paral10 not between", value1, value2, "paral10");
            return (Criteria) this;
        }

        public Criteria andParal11IsNull() {
            addCriterion("paral11 is null");
            return (Criteria) this;
        }

        public Criteria andParal11IsNotNull() {
            addCriterion("paral11 is not null");
            return (Criteria) this;
        }

        public Criteria andParal11EqualTo(Double value) {
            addCriterion("paral11 =", value, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11NotEqualTo(Double value) {
            addCriterion("paral11 <>", value, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11GreaterThan(Double value) {
            addCriterion("paral11 >", value, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11GreaterThanOrEqualTo(Double value) {
            addCriterion("paral11 >=", value, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11LessThan(Double value) {
            addCriterion("paral11 <", value, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11LessThanOrEqualTo(Double value) {
            addCriterion("paral11 <=", value, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11In(List<Double> values) {
            addCriterion("paral11 in", values, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11NotIn(List<Double> values) {
            addCriterion("paral11 not in", values, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11Between(Double value1, Double value2) {
            addCriterion("paral11 between", value1, value2, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal11NotBetween(Double value1, Double value2) {
            addCriterion("paral11 not between", value1, value2, "paral11");
            return (Criteria) this;
        }

        public Criteria andParal12IsNull() {
            addCriterion("paral12 is null");
            return (Criteria) this;
        }

        public Criteria andParal12IsNotNull() {
            addCriterion("paral12 is not null");
            return (Criteria) this;
        }

        public Criteria andParal12EqualTo(Double value) {
            addCriterion("paral12 =", value, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12NotEqualTo(Double value) {
            addCriterion("paral12 <>", value, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12GreaterThan(Double value) {
            addCriterion("paral12 >", value, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12GreaterThanOrEqualTo(Double value) {
            addCriterion("paral12 >=", value, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12LessThan(Double value) {
            addCriterion("paral12 <", value, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12LessThanOrEqualTo(Double value) {
            addCriterion("paral12 <=", value, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12In(List<Double> values) {
            addCriterion("paral12 in", values, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12NotIn(List<Double> values) {
            addCriterion("paral12 not in", values, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12Between(Double value1, Double value2) {
            addCriterion("paral12 between", value1, value2, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal12NotBetween(Double value1, Double value2) {
            addCriterion("paral12 not between", value1, value2, "paral12");
            return (Criteria) this;
        }

        public Criteria andParal13IsNull() {
            addCriterion("paral13 is null");
            return (Criteria) this;
        }

        public Criteria andParal13IsNotNull() {
            addCriterion("paral13 is not null");
            return (Criteria) this;
        }

        public Criteria andParal13EqualTo(Double value) {
            addCriterion("paral13 =", value, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13NotEqualTo(Double value) {
            addCriterion("paral13 <>", value, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13GreaterThan(Double value) {
            addCriterion("paral13 >", value, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13GreaterThanOrEqualTo(Double value) {
            addCriterion("paral13 >=", value, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13LessThan(Double value) {
            addCriterion("paral13 <", value, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13LessThanOrEqualTo(Double value) {
            addCriterion("paral13 <=", value, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13In(List<Double> values) {
            addCriterion("paral13 in", values, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13NotIn(List<Double> values) {
            addCriterion("paral13 not in", values, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13Between(Double value1, Double value2) {
            addCriterion("paral13 between", value1, value2, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal13NotBetween(Double value1, Double value2) {
            addCriterion("paral13 not between", value1, value2, "paral13");
            return (Criteria) this;
        }

        public Criteria andParal14IsNull() {
            addCriterion("paral14 is null");
            return (Criteria) this;
        }

        public Criteria andParal14IsNotNull() {
            addCriterion("paral14 is not null");
            return (Criteria) this;
        }

        public Criteria andParal14EqualTo(Double value) {
            addCriterion("paral14 =", value, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14NotEqualTo(Double value) {
            addCriterion("paral14 <>", value, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14GreaterThan(Double value) {
            addCriterion("paral14 >", value, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14GreaterThanOrEqualTo(Double value) {
            addCriterion("paral14 >=", value, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14LessThan(Double value) {
            addCriterion("paral14 <", value, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14LessThanOrEqualTo(Double value) {
            addCriterion("paral14 <=", value, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14In(List<Double> values) {
            addCriterion("paral14 in", values, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14NotIn(List<Double> values) {
            addCriterion("paral14 not in", values, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14Between(Double value1, Double value2) {
            addCriterion("paral14 between", value1, value2, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal14NotBetween(Double value1, Double value2) {
            addCriterion("paral14 not between", value1, value2, "paral14");
            return (Criteria) this;
        }

        public Criteria andParal15IsNull() {
            addCriterion("paral15 is null");
            return (Criteria) this;
        }

        public Criteria andParal15IsNotNull() {
            addCriterion("paral15 is not null");
            return (Criteria) this;
        }

        public Criteria andParal15EqualTo(Double value) {
            addCriterion("paral15 =", value, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15NotEqualTo(Double value) {
            addCriterion("paral15 <>", value, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15GreaterThan(Double value) {
            addCriterion("paral15 >", value, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15GreaterThanOrEqualTo(Double value) {
            addCriterion("paral15 >=", value, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15LessThan(Double value) {
            addCriterion("paral15 <", value, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15LessThanOrEqualTo(Double value) {
            addCriterion("paral15 <=", value, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15In(List<Double> values) {
            addCriterion("paral15 in", values, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15NotIn(List<Double> values) {
            addCriterion("paral15 not in", values, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15Between(Double value1, Double value2) {
            addCriterion("paral15 between", value1, value2, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal15NotBetween(Double value1, Double value2) {
            addCriterion("paral15 not between", value1, value2, "paral15");
            return (Criteria) this;
        }

        public Criteria andParal16IsNull() {
            addCriterion("paral16 is null");
            return (Criteria) this;
        }

        public Criteria andParal16IsNotNull() {
            addCriterion("paral16 is not null");
            return (Criteria) this;
        }

        public Criteria andParal16EqualTo(Double value) {
            addCriterion("paral16 =", value, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16NotEqualTo(Double value) {
            addCriterion("paral16 <>", value, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16GreaterThan(Double value) {
            addCriterion("paral16 >", value, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16GreaterThanOrEqualTo(Double value) {
            addCriterion("paral16 >=", value, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16LessThan(Double value) {
            addCriterion("paral16 <", value, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16LessThanOrEqualTo(Double value) {
            addCriterion("paral16 <=", value, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16In(List<Double> values) {
            addCriterion("paral16 in", values, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16NotIn(List<Double> values) {
            addCriterion("paral16 not in", values, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16Between(Double value1, Double value2) {
            addCriterion("paral16 between", value1, value2, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal16NotBetween(Double value1, Double value2) {
            addCriterion("paral16 not between", value1, value2, "paral16");
            return (Criteria) this;
        }

        public Criteria andParal17IsNull() {
            addCriterion("paral17 is null");
            return (Criteria) this;
        }

        public Criteria andParal17IsNotNull() {
            addCriterion("paral17 is not null");
            return (Criteria) this;
        }

        public Criteria andParal17EqualTo(Double value) {
            addCriterion("paral17 =", value, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17NotEqualTo(Double value) {
            addCriterion("paral17 <>", value, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17GreaterThan(Double value) {
            addCriterion("paral17 >", value, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17GreaterThanOrEqualTo(Double value) {
            addCriterion("paral17 >=", value, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17LessThan(Double value) {
            addCriterion("paral17 <", value, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17LessThanOrEqualTo(Double value) {
            addCriterion("paral17 <=", value, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17In(List<Double> values) {
            addCriterion("paral17 in", values, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17NotIn(List<Double> values) {
            addCriterion("paral17 not in", values, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17Between(Double value1, Double value2) {
            addCriterion("paral17 between", value1, value2, "paral17");
            return (Criteria) this;
        }

        public Criteria andParal17NotBetween(Double value1, Double value2) {
            addCriterion("paral17 not between", value1, value2, "paral17");
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