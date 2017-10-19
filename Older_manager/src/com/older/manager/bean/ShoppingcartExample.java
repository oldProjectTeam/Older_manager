package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcartExample() {
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

        public Criteria andProdutsIdIsNull() {
            addCriterion("Produts_id is null");
            return (Criteria) this;
        }

        public Criteria andProdutsIdIsNotNull() {
            addCriterion("Produts_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdutsIdEqualTo(Integer value) {
            addCriterion("Produts_id =", value, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdNotEqualTo(Integer value) {
            addCriterion("Produts_id <>", value, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdGreaterThan(Integer value) {
            addCriterion("Produts_id >", value, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Produts_id >=", value, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdLessThan(Integer value) {
            addCriterion("Produts_id <", value, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Produts_id <=", value, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdIn(List<Integer> values) {
            addCriterion("Produts_id in", values, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdNotIn(List<Integer> values) {
            addCriterion("Produts_id not in", values, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdBetween(Integer value1, Integer value2) {
            addCriterion("Produts_id between", value1, value2, "produtsId");
            return (Criteria) this;
        }

        public Criteria andProdutsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Produts_id not between", value1, value2, "produtsId");
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

        public Criteria andBasepriceIsNull() {
            addCriterion("basePrice is null");
            return (Criteria) this;
        }

        public Criteria andBasepriceIsNotNull() {
            addCriterion("basePrice is not null");
            return (Criteria) this;
        }

        public Criteria andBasepriceEqualTo(Double value) {
            addCriterion("basePrice =", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceNotEqualTo(Double value) {
            addCriterion("basePrice <>", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceGreaterThan(Double value) {
            addCriterion("basePrice >", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("basePrice >=", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceLessThan(Double value) {
            addCriterion("basePrice <", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceLessThanOrEqualTo(Double value) {
            addCriterion("basePrice <=", value, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceIn(List<Double> values) {
            addCriterion("basePrice in", values, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceNotIn(List<Double> values) {
            addCriterion("basePrice not in", values, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceBetween(Double value1, Double value2) {
            addCriterion("basePrice between", value1, value2, "baseprice");
            return (Criteria) this;
        }

        public Criteria andBasepriceNotBetween(Double value1, Double value2) {
            addCriterion("basePrice not between", value1, value2, "baseprice");
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
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1IsNull() {
            addCriterion("shoppingCart1 is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1IsNotNull() {
            addCriterion("shoppingCart1 is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1EqualTo(String value) {
            addCriterion("shoppingCart1 =", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1NotEqualTo(String value) {
            addCriterion("shoppingCart1 <>", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1GreaterThan(String value) {
            addCriterion("shoppingCart1 >", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1GreaterThanOrEqualTo(String value) {
            addCriterion("shoppingCart1 >=", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1LessThan(String value) {
            addCriterion("shoppingCart1 <", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1LessThanOrEqualTo(String value) {
            addCriterion("shoppingCart1 <=", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1Like(String value) {
            addCriterion("shoppingCart1 like", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1NotLike(String value) {
            addCriterion("shoppingCart1 not like", value, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1In(List<String> values) {
            addCriterion("shoppingCart1 in", values, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1NotIn(List<String> values) {
            addCriterion("shoppingCart1 not in", values, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1Between(String value1, String value2) {
            addCriterion("shoppingCart1 between", value1, value2, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart1NotBetween(String value1, String value2) {
            addCriterion("shoppingCart1 not between", value1, value2, "shoppingcart1");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2IsNull() {
            addCriterion("shoppingCart2 is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2IsNotNull() {
            addCriterion("shoppingCart2 is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2EqualTo(String value) {
            addCriterion("shoppingCart2 =", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2NotEqualTo(String value) {
            addCriterion("shoppingCart2 <>", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2GreaterThan(String value) {
            addCriterion("shoppingCart2 >", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2GreaterThanOrEqualTo(String value) {
            addCriterion("shoppingCart2 >=", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2LessThan(String value) {
            addCriterion("shoppingCart2 <", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2LessThanOrEqualTo(String value) {
            addCriterion("shoppingCart2 <=", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2Like(String value) {
            addCriterion("shoppingCart2 like", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2NotLike(String value) {
            addCriterion("shoppingCart2 not like", value, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2In(List<String> values) {
            addCriterion("shoppingCart2 in", values, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2NotIn(List<String> values) {
            addCriterion("shoppingCart2 not in", values, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2Between(String value1, String value2) {
            addCriterion("shoppingCart2 between", value1, value2, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart2NotBetween(String value1, String value2) {
            addCriterion("shoppingCart2 not between", value1, value2, "shoppingcart2");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3IsNull() {
            addCriterion("shoppingCart3 is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3IsNotNull() {
            addCriterion("shoppingCart3 is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3EqualTo(String value) {
            addCriterion("shoppingCart3 =", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3NotEqualTo(String value) {
            addCriterion("shoppingCart3 <>", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3GreaterThan(String value) {
            addCriterion("shoppingCart3 >", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3GreaterThanOrEqualTo(String value) {
            addCriterion("shoppingCart3 >=", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3LessThan(String value) {
            addCriterion("shoppingCart3 <", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3LessThanOrEqualTo(String value) {
            addCriterion("shoppingCart3 <=", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3Like(String value) {
            addCriterion("shoppingCart3 like", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3NotLike(String value) {
            addCriterion("shoppingCart3 not like", value, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3In(List<String> values) {
            addCriterion("shoppingCart3 in", values, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3NotIn(List<String> values) {
            addCriterion("shoppingCart3 not in", values, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3Between(String value1, String value2) {
            addCriterion("shoppingCart3 between", value1, value2, "shoppingcart3");
            return (Criteria) this;
        }

        public Criteria andShoppingcart3NotBetween(String value1, String value2) {
            addCriterion("shoppingCart3 not between", value1, value2, "shoppingcart3");
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