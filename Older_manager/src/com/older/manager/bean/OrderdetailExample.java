package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailExample() {
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

        public Criteria andDetialNumberIsNull() {
            addCriterion("detial_number is null");
            return (Criteria) this;
        }

        public Criteria andDetialNumberIsNotNull() {
            addCriterion("detial_number is not null");
            return (Criteria) this;
        }

        public Criteria andDetialNumberEqualTo(String value) {
            addCriterion("detial_number =", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberNotEqualTo(String value) {
            addCriterion("detial_number <>", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberGreaterThan(String value) {
            addCriterion("detial_number >", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("detial_number >=", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberLessThan(String value) {
            addCriterion("detial_number <", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberLessThanOrEqualTo(String value) {
            addCriterion("detial_number <=", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberLike(String value) {
            addCriterion("detial_number like", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberNotLike(String value) {
            addCriterion("detial_number not like", value, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberIn(List<String> values) {
            addCriterion("detial_number in", values, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberNotIn(List<String> values) {
            addCriterion("detial_number not in", values, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberBetween(String value1, String value2) {
            addCriterion("detial_number between", value1, value2, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andDetialNumberNotBetween(String value1, String value2) {
            addCriterion("detial_number not between", value1, value2, "detialNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdIsNull() {
            addCriterion("produccts_id is null");
            return (Criteria) this;
        }

        public Criteria andProducctsIdIsNotNull() {
            addCriterion("produccts_id is not null");
            return (Criteria) this;
        }

        public Criteria andProducctsIdEqualTo(Integer value) {
            addCriterion("produccts_id =", value, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdNotEqualTo(Integer value) {
            addCriterion("produccts_id <>", value, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdGreaterThan(Integer value) {
            addCriterion("produccts_id >", value, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("produccts_id >=", value, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdLessThan(Integer value) {
            addCriterion("produccts_id <", value, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdLessThanOrEqualTo(Integer value) {
            addCriterion("produccts_id <=", value, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdIn(List<Integer> values) {
            addCriterion("produccts_id in", values, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdNotIn(List<Integer> values) {
            addCriterion("produccts_id not in", values, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdBetween(Integer value1, Integer value2) {
            addCriterion("produccts_id between", value1, value2, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("produccts_id not between", value1, value2, "producctsId");
            return (Criteria) this;
        }

        public Criteria andProducctnameIsNull() {
            addCriterion("producctName is null");
            return (Criteria) this;
        }

        public Criteria andProducctnameIsNotNull() {
            addCriterion("producctName is not null");
            return (Criteria) this;
        }

        public Criteria andProducctnameEqualTo(String value) {
            addCriterion("producctName =", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameNotEqualTo(String value) {
            addCriterion("producctName <>", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameGreaterThan(String value) {
            addCriterion("producctName >", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameGreaterThanOrEqualTo(String value) {
            addCriterion("producctName >=", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameLessThan(String value) {
            addCriterion("producctName <", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameLessThanOrEqualTo(String value) {
            addCriterion("producctName <=", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameLike(String value) {
            addCriterion("producctName like", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameNotLike(String value) {
            addCriterion("producctName not like", value, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameIn(List<String> values) {
            addCriterion("producctName in", values, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameNotIn(List<String> values) {
            addCriterion("producctName not in", values, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameBetween(String value1, String value2) {
            addCriterion("producctName between", value1, value2, "producctname");
            return (Criteria) this;
        }

        public Criteria andProducctnameNotBetween(String value1, String value2) {
            addCriterion("producctName not between", value1, value2, "producctname");
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

        public Criteria andOrderdetail1IsNull() {
            addCriterion("orderDetail1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1IsNotNull() {
            addCriterion("orderDetail1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1EqualTo(String value) {
            addCriterion("orderDetail1 =", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1NotEqualTo(String value) {
            addCriterion("orderDetail1 <>", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1GreaterThan(String value) {
            addCriterion("orderDetail1 >", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail1 >=", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1LessThan(String value) {
            addCriterion("orderDetail1 <", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1LessThanOrEqualTo(String value) {
            addCriterion("orderDetail1 <=", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1Like(String value) {
            addCriterion("orderDetail1 like", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1NotLike(String value) {
            addCriterion("orderDetail1 not like", value, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1In(List<String> values) {
            addCriterion("orderDetail1 in", values, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1NotIn(List<String> values) {
            addCriterion("orderDetail1 not in", values, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1Between(String value1, String value2) {
            addCriterion("orderDetail1 between", value1, value2, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail1NotBetween(String value1, String value2) {
            addCriterion("orderDetail1 not between", value1, value2, "orderdetail1");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2IsNull() {
            addCriterion("orderDetail2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2IsNotNull() {
            addCriterion("orderDetail2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2EqualTo(String value) {
            addCriterion("orderDetail2 =", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2NotEqualTo(String value) {
            addCriterion("orderDetail2 <>", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2GreaterThan(String value) {
            addCriterion("orderDetail2 >", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail2 >=", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2LessThan(String value) {
            addCriterion("orderDetail2 <", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2LessThanOrEqualTo(String value) {
            addCriterion("orderDetail2 <=", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2Like(String value) {
            addCriterion("orderDetail2 like", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2NotLike(String value) {
            addCriterion("orderDetail2 not like", value, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2In(List<String> values) {
            addCriterion("orderDetail2 in", values, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2NotIn(List<String> values) {
            addCriterion("orderDetail2 not in", values, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2Between(String value1, String value2) {
            addCriterion("orderDetail2 between", value1, value2, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail2NotBetween(String value1, String value2) {
            addCriterion("orderDetail2 not between", value1, value2, "orderdetail2");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3IsNull() {
            addCriterion("orderDetail3 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3IsNotNull() {
            addCriterion("orderDetail3 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3EqualTo(String value) {
            addCriterion("orderDetail3 =", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3NotEqualTo(String value) {
            addCriterion("orderDetail3 <>", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3GreaterThan(String value) {
            addCriterion("orderDetail3 >", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail3 >=", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3LessThan(String value) {
            addCriterion("orderDetail3 <", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3LessThanOrEqualTo(String value) {
            addCriterion("orderDetail3 <=", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3Like(String value) {
            addCriterion("orderDetail3 like", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3NotLike(String value) {
            addCriterion("orderDetail3 not like", value, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3In(List<String> values) {
            addCriterion("orderDetail3 in", values, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3NotIn(List<String> values) {
            addCriterion("orderDetail3 not in", values, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3Between(String value1, String value2) {
            addCriterion("orderDetail3 between", value1, value2, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail3NotBetween(String value1, String value2) {
            addCriterion("orderDetail3 not between", value1, value2, "orderdetail3");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4IsNull() {
            addCriterion("orderDetail4 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4IsNotNull() {
            addCriterion("orderDetail4 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4EqualTo(String value) {
            addCriterion("orderDetail4 =", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4NotEqualTo(String value) {
            addCriterion("orderDetail4 <>", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4GreaterThan(String value) {
            addCriterion("orderDetail4 >", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail4 >=", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4LessThan(String value) {
            addCriterion("orderDetail4 <", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4LessThanOrEqualTo(String value) {
            addCriterion("orderDetail4 <=", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4Like(String value) {
            addCriterion("orderDetail4 like", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4NotLike(String value) {
            addCriterion("orderDetail4 not like", value, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4In(List<String> values) {
            addCriterion("orderDetail4 in", values, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4NotIn(List<String> values) {
            addCriterion("orderDetail4 not in", values, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4Between(String value1, String value2) {
            addCriterion("orderDetail4 between", value1, value2, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail4NotBetween(String value1, String value2) {
            addCriterion("orderDetail4 not between", value1, value2, "orderdetail4");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5IsNull() {
            addCriterion("orderDetail5 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5IsNotNull() {
            addCriterion("orderDetail5 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5EqualTo(String value) {
            addCriterion("orderDetail5 =", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5NotEqualTo(String value) {
            addCriterion("orderDetail5 <>", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5GreaterThan(String value) {
            addCriterion("orderDetail5 >", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail5 >=", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5LessThan(String value) {
            addCriterion("orderDetail5 <", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5LessThanOrEqualTo(String value) {
            addCriterion("orderDetail5 <=", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5Like(String value) {
            addCriterion("orderDetail5 like", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5NotLike(String value) {
            addCriterion("orderDetail5 not like", value, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5In(List<String> values) {
            addCriterion("orderDetail5 in", values, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5NotIn(List<String> values) {
            addCriterion("orderDetail5 not in", values, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5Between(String value1, String value2) {
            addCriterion("orderDetail5 between", value1, value2, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail5NotBetween(String value1, String value2) {
            addCriterion("orderDetail5 not between", value1, value2, "orderdetail5");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6IsNull() {
            addCriterion("orderDetail6 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6IsNotNull() {
            addCriterion("orderDetail6 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6EqualTo(String value) {
            addCriterion("orderDetail6 =", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6NotEqualTo(String value) {
            addCriterion("orderDetail6 <>", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6GreaterThan(String value) {
            addCriterion("orderDetail6 >", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail6 >=", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6LessThan(String value) {
            addCriterion("orderDetail6 <", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6LessThanOrEqualTo(String value) {
            addCriterion("orderDetail6 <=", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6Like(String value) {
            addCriterion("orderDetail6 like", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6NotLike(String value) {
            addCriterion("orderDetail6 not like", value, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6In(List<String> values) {
            addCriterion("orderDetail6 in", values, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6NotIn(List<String> values) {
            addCriterion("orderDetail6 not in", values, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6Between(String value1, String value2) {
            addCriterion("orderDetail6 between", value1, value2, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail6NotBetween(String value1, String value2) {
            addCriterion("orderDetail6 not between", value1, value2, "orderdetail6");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7IsNull() {
            addCriterion("orderDetail7 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7IsNotNull() {
            addCriterion("orderDetail7 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7EqualTo(String value) {
            addCriterion("orderDetail7 =", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7NotEqualTo(String value) {
            addCriterion("orderDetail7 <>", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7GreaterThan(String value) {
            addCriterion("orderDetail7 >", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetail7 >=", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7LessThan(String value) {
            addCriterion("orderDetail7 <", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7LessThanOrEqualTo(String value) {
            addCriterion("orderDetail7 <=", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7Like(String value) {
            addCriterion("orderDetail7 like", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7NotLike(String value) {
            addCriterion("orderDetail7 not like", value, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7In(List<String> values) {
            addCriterion("orderDetail7 in", values, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7NotIn(List<String> values) {
            addCriterion("orderDetail7 not in", values, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7Between(String value1, String value2) {
            addCriterion("orderDetail7 between", value1, value2, "orderdetail7");
            return (Criteria) this;
        }

        public Criteria andOrderdetail7NotBetween(String value1, String value2) {
            addCriterion("orderDetail7 not between", value1, value2, "orderdetail7");
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