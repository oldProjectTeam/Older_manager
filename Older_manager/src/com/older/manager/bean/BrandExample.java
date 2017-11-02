package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(String value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(String value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(String value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(String value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(String value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(String value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLike(String value) {
            addCriterion("brandId like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotLike(String value) {
            addCriterion("brandId not like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<String> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<String> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(String value1, String value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(String value1, String value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
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

        public Criteria andBrand1IsNull() {
            addCriterion("brand1 is null");
            return (Criteria) this;
        }

        public Criteria andBrand1IsNotNull() {
            addCriterion("brand1 is not null");
            return (Criteria) this;
        }

        public Criteria andBrand1EqualTo(String value) {
            addCriterion("brand1 =", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1NotEqualTo(String value) {
            addCriterion("brand1 <>", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1GreaterThan(String value) {
            addCriterion("brand1 >", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1GreaterThanOrEqualTo(String value) {
            addCriterion("brand1 >=", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1LessThan(String value) {
            addCriterion("brand1 <", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1LessThanOrEqualTo(String value) {
            addCriterion("brand1 <=", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1Like(String value) {
            addCriterion("brand1 like", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1NotLike(String value) {
            addCriterion("brand1 not like", value, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1In(List<String> values) {
            addCriterion("brand1 in", values, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1NotIn(List<String> values) {
            addCriterion("brand1 not in", values, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1Between(String value1, String value2) {
            addCriterion("brand1 between", value1, value2, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand1NotBetween(String value1, String value2) {
            addCriterion("brand1 not between", value1, value2, "brand1");
            return (Criteria) this;
        }

        public Criteria andBrand2IsNull() {
            addCriterion("brand2 is null");
            return (Criteria) this;
        }

        public Criteria andBrand2IsNotNull() {
            addCriterion("brand2 is not null");
            return (Criteria) this;
        }

        public Criteria andBrand2EqualTo(String value) {
            addCriterion("brand2 =", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2NotEqualTo(String value) {
            addCriterion("brand2 <>", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2GreaterThan(String value) {
            addCriterion("brand2 >", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2GreaterThanOrEqualTo(String value) {
            addCriterion("brand2 >=", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2LessThan(String value) {
            addCriterion("brand2 <", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2LessThanOrEqualTo(String value) {
            addCriterion("brand2 <=", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2Like(String value) {
            addCriterion("brand2 like", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2NotLike(String value) {
            addCriterion("brand2 not like", value, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2In(List<String> values) {
            addCriterion("brand2 in", values, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2NotIn(List<String> values) {
            addCriterion("brand2 not in", values, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2Between(String value1, String value2) {
            addCriterion("brand2 between", value1, value2, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand2NotBetween(String value1, String value2) {
            addCriterion("brand2 not between", value1, value2, "brand2");
            return (Criteria) this;
        }

        public Criteria andBrand3IsNull() {
            addCriterion("brand3 is null");
            return (Criteria) this;
        }

        public Criteria andBrand3IsNotNull() {
            addCriterion("brand3 is not null");
            return (Criteria) this;
        }

        public Criteria andBrand3EqualTo(Integer value) {
            addCriterion("brand3 =", value, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3NotEqualTo(Integer value) {
            addCriterion("brand3 <>", value, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3GreaterThan(Integer value) {
            addCriterion("brand3 >", value, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3GreaterThanOrEqualTo(Integer value) {
            addCriterion("brand3 >=", value, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3LessThan(Integer value) {
            addCriterion("brand3 <", value, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3LessThanOrEqualTo(Integer value) {
            addCriterion("brand3 <=", value, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3In(List<Integer> values) {
            addCriterion("brand3 in", values, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3NotIn(List<Integer> values) {
            addCriterion("brand3 not in", values, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3Between(Integer value1, Integer value2) {
            addCriterion("brand3 between", value1, value2, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand3NotBetween(Integer value1, Integer value2) {
            addCriterion("brand3 not between", value1, value2, "brand3");
            return (Criteria) this;
        }

        public Criteria andBrand4IsNull() {
            addCriterion("brand4 is null");
            return (Criteria) this;
        }

        public Criteria andBrand4IsNotNull() {
            addCriterion("brand4 is not null");
            return (Criteria) this;
        }

        public Criteria andBrand4EqualTo(Double value) {
            addCriterion("brand4 =", value, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4NotEqualTo(Double value) {
            addCriterion("brand4 <>", value, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4GreaterThan(Double value) {
            addCriterion("brand4 >", value, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4GreaterThanOrEqualTo(Double value) {
            addCriterion("brand4 >=", value, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4LessThan(Double value) {
            addCriterion("brand4 <", value, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4LessThanOrEqualTo(Double value) {
            addCriterion("brand4 <=", value, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4In(List<Double> values) {
            addCriterion("brand4 in", values, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4NotIn(List<Double> values) {
            addCriterion("brand4 not in", values, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4Between(Double value1, Double value2) {
            addCriterion("brand4 between", value1, value2, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand4NotBetween(Double value1, Double value2) {
            addCriterion("brand4 not between", value1, value2, "brand4");
            return (Criteria) this;
        }

        public Criteria andBrand5IsNull() {
            addCriterion("brand5 is null");
            return (Criteria) this;
        }

        public Criteria andBrand5IsNotNull() {
            addCriterion("brand5 is not null");
            return (Criteria) this;
        }

        public Criteria andBrand5EqualTo(String value) {
            addCriterion("brand5 =", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5NotEqualTo(String value) {
            addCriterion("brand5 <>", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5GreaterThan(String value) {
            addCriterion("brand5 >", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5GreaterThanOrEqualTo(String value) {
            addCriterion("brand5 >=", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5LessThan(String value) {
            addCriterion("brand5 <", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5LessThanOrEqualTo(String value) {
            addCriterion("brand5 <=", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5Like(String value) {
            addCriterion("brand5 like", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5NotLike(String value) {
            addCriterion("brand5 not like", value, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5In(List<String> values) {
            addCriterion("brand5 in", values, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5NotIn(List<String> values) {
            addCriterion("brand5 not in", values, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5Between(String value1, String value2) {
            addCriterion("brand5 between", value1, value2, "brand5");
            return (Criteria) this;
        }

        public Criteria andBrand5NotBetween(String value1, String value2) {
            addCriterion("brand5 not between", value1, value2, "brand5");
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