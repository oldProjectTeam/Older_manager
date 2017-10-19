package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class GiftmanagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftmanagementExample() {
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

        public Criteria andGiftnameIsNull() {
            addCriterion("giftName is null");
            return (Criteria) this;
        }

        public Criteria andGiftnameIsNotNull() {
            addCriterion("giftName is not null");
            return (Criteria) this;
        }

        public Criteria andGiftnameEqualTo(String value) {
            addCriterion("giftName =", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameNotEqualTo(String value) {
            addCriterion("giftName <>", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameGreaterThan(String value) {
            addCriterion("giftName >", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameGreaterThanOrEqualTo(String value) {
            addCriterion("giftName >=", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameLessThan(String value) {
            addCriterion("giftName <", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameLessThanOrEqualTo(String value) {
            addCriterion("giftName <=", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameLike(String value) {
            addCriterion("giftName like", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameNotLike(String value) {
            addCriterion("giftName not like", value, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameIn(List<String> values) {
            addCriterion("giftName in", values, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameNotIn(List<String> values) {
            addCriterion("giftName not in", values, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameBetween(String value1, String value2) {
            addCriterion("giftName between", value1, value2, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnameNotBetween(String value1, String value2) {
            addCriterion("giftName not between", value1, value2, "giftname");
            return (Criteria) this;
        }

        public Criteria andGiftnumberIsNull() {
            addCriterion("giftNumber is null");
            return (Criteria) this;
        }

        public Criteria andGiftnumberIsNotNull() {
            addCriterion("giftNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGiftnumberEqualTo(Integer value) {
            addCriterion("giftNumber =", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberNotEqualTo(Integer value) {
            addCriterion("giftNumber <>", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberGreaterThan(Integer value) {
            addCriterion("giftNumber >", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftNumber >=", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberLessThan(Integer value) {
            addCriterion("giftNumber <", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberLessThanOrEqualTo(Integer value) {
            addCriterion("giftNumber <=", value, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberIn(List<Integer> values) {
            addCriterion("giftNumber in", values, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberNotIn(List<Integer> values) {
            addCriterion("giftNumber not in", values, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberBetween(Integer value1, Integer value2) {
            addCriterion("giftNumber between", value1, value2, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGiftnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("giftNumber not between", value1, value2, "giftnumber");
            return (Criteria) this;
        }

        public Criteria andGifttypeIsNull() {
            addCriterion("giftType is null");
            return (Criteria) this;
        }

        public Criteria andGifttypeIsNotNull() {
            addCriterion("giftType is not null");
            return (Criteria) this;
        }

        public Criteria andGifttypeEqualTo(String value) {
            addCriterion("giftType =", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotEqualTo(String value) {
            addCriterion("giftType <>", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeGreaterThan(String value) {
            addCriterion("giftType >", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeGreaterThanOrEqualTo(String value) {
            addCriterion("giftType >=", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeLessThan(String value) {
            addCriterion("giftType <", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeLessThanOrEqualTo(String value) {
            addCriterion("giftType <=", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeLike(String value) {
            addCriterion("giftType like", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotLike(String value) {
            addCriterion("giftType not like", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeIn(List<String> values) {
            addCriterion("giftType in", values, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotIn(List<String> values) {
            addCriterion("giftType not in", values, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeBetween(String value1, String value2) {
            addCriterion("giftType between", value1, value2, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotBetween(String value1, String value2) {
            addCriterion("giftType not between", value1, value2, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGiftstateIsNull() {
            addCriterion("giftState is null");
            return (Criteria) this;
        }

        public Criteria andGiftstateIsNotNull() {
            addCriterion("giftState is not null");
            return (Criteria) this;
        }

        public Criteria andGiftstateEqualTo(String value) {
            addCriterion("giftState =", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateNotEqualTo(String value) {
            addCriterion("giftState <>", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateGreaterThan(String value) {
            addCriterion("giftState >", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateGreaterThanOrEqualTo(String value) {
            addCriterion("giftState >=", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateLessThan(String value) {
            addCriterion("giftState <", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateLessThanOrEqualTo(String value) {
            addCriterion("giftState <=", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateLike(String value) {
            addCriterion("giftState like", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateNotLike(String value) {
            addCriterion("giftState not like", value, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateIn(List<String> values) {
            addCriterion("giftState in", values, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateNotIn(List<String> values) {
            addCriterion("giftState not in", values, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateBetween(String value1, String value2) {
            addCriterion("giftState between", value1, value2, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftstateNotBetween(String value1, String value2) {
            addCriterion("giftState not between", value1, value2, "giftstate");
            return (Criteria) this;
        }

        public Criteria andGiftunitIsNull() {
            addCriterion("giftUnit is null");
            return (Criteria) this;
        }

        public Criteria andGiftunitIsNotNull() {
            addCriterion("giftUnit is not null");
            return (Criteria) this;
        }

        public Criteria andGiftunitEqualTo(String value) {
            addCriterion("giftUnit =", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitNotEqualTo(String value) {
            addCriterion("giftUnit <>", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitGreaterThan(String value) {
            addCriterion("giftUnit >", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitGreaterThanOrEqualTo(String value) {
            addCriterion("giftUnit >=", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitLessThan(String value) {
            addCriterion("giftUnit <", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitLessThanOrEqualTo(String value) {
            addCriterion("giftUnit <=", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitLike(String value) {
            addCriterion("giftUnit like", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitNotLike(String value) {
            addCriterion("giftUnit not like", value, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitIn(List<String> values) {
            addCriterion("giftUnit in", values, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitNotIn(List<String> values) {
            addCriterion("giftUnit not in", values, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitBetween(String value1, String value2) {
            addCriterion("giftUnit between", value1, value2, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftunitNotBetween(String value1, String value2) {
            addCriterion("giftUnit not between", value1, value2, "giftunit");
            return (Criteria) this;
        }

        public Criteria andGiftpriceIsNull() {
            addCriterion("giftPrice is null");
            return (Criteria) this;
        }

        public Criteria andGiftpriceIsNotNull() {
            addCriterion("giftPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpriceEqualTo(Double value) {
            addCriterion("giftPrice =", value, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceNotEqualTo(Double value) {
            addCriterion("giftPrice <>", value, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceGreaterThan(Double value) {
            addCriterion("giftPrice >", value, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("giftPrice >=", value, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceLessThan(Double value) {
            addCriterion("giftPrice <", value, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceLessThanOrEqualTo(Double value) {
            addCriterion("giftPrice <=", value, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceIn(List<Double> values) {
            addCriterion("giftPrice in", values, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceNotIn(List<Double> values) {
            addCriterion("giftPrice not in", values, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceBetween(Double value1, Double value2) {
            addCriterion("giftPrice between", value1, value2, "giftprice");
            return (Criteria) this;
        }

        public Criteria andGiftpriceNotBetween(Double value1, Double value2) {
            addCriterion("giftPrice not between", value1, value2, "giftprice");
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

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
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

        public Criteria andLowernumberIsNull() {
            addCriterion("lowerNumber is null");
            return (Criteria) this;
        }

        public Criteria andLowernumberIsNotNull() {
            addCriterion("lowerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLowernumberEqualTo(Integer value) {
            addCriterion("lowerNumber =", value, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberNotEqualTo(Integer value) {
            addCriterion("lowerNumber <>", value, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberGreaterThan(Integer value) {
            addCriterion("lowerNumber >", value, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lowerNumber >=", value, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberLessThan(Integer value) {
            addCriterion("lowerNumber <", value, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberLessThanOrEqualTo(Integer value) {
            addCriterion("lowerNumber <=", value, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberIn(List<Integer> values) {
            addCriterion("lowerNumber in", values, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberNotIn(List<Integer> values) {
            addCriterion("lowerNumber not in", values, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberBetween(Integer value1, Integer value2) {
            addCriterion("lowerNumber between", value1, value2, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andLowernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lowerNumber not between", value1, value2, "lowernumber");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNull() {
            addCriterion("remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("remake not between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1IsNull() {
            addCriterion("giftManagement1 is null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1IsNotNull() {
            addCriterion("giftManagement1 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1EqualTo(String value) {
            addCriterion("giftManagement1 =", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1NotEqualTo(String value) {
            addCriterion("giftManagement1 <>", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1GreaterThan(String value) {
            addCriterion("giftManagement1 >", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1GreaterThanOrEqualTo(String value) {
            addCriterion("giftManagement1 >=", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1LessThan(String value) {
            addCriterion("giftManagement1 <", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1LessThanOrEqualTo(String value) {
            addCriterion("giftManagement1 <=", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1Like(String value) {
            addCriterion("giftManagement1 like", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1NotLike(String value) {
            addCriterion("giftManagement1 not like", value, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1In(List<String> values) {
            addCriterion("giftManagement1 in", values, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1NotIn(List<String> values) {
            addCriterion("giftManagement1 not in", values, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1Between(String value1, String value2) {
            addCriterion("giftManagement1 between", value1, value2, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement1NotBetween(String value1, String value2) {
            addCriterion("giftManagement1 not between", value1, value2, "giftmanagement1");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2IsNull() {
            addCriterion("giftManagement2 is null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2IsNotNull() {
            addCriterion("giftManagement2 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2EqualTo(String value) {
            addCriterion("giftManagement2 =", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2NotEqualTo(String value) {
            addCriterion("giftManagement2 <>", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2GreaterThan(String value) {
            addCriterion("giftManagement2 >", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2GreaterThanOrEqualTo(String value) {
            addCriterion("giftManagement2 >=", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2LessThan(String value) {
            addCriterion("giftManagement2 <", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2LessThanOrEqualTo(String value) {
            addCriterion("giftManagement2 <=", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2Like(String value) {
            addCriterion("giftManagement2 like", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2NotLike(String value) {
            addCriterion("giftManagement2 not like", value, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2In(List<String> values) {
            addCriterion("giftManagement2 in", values, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2NotIn(List<String> values) {
            addCriterion("giftManagement2 not in", values, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2Between(String value1, String value2) {
            addCriterion("giftManagement2 between", value1, value2, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement2NotBetween(String value1, String value2) {
            addCriterion("giftManagement2 not between", value1, value2, "giftmanagement2");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3IsNull() {
            addCriterion("giftManagement3 is null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3IsNotNull() {
            addCriterion("giftManagement3 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3EqualTo(String value) {
            addCriterion("giftManagement3 =", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3NotEqualTo(String value) {
            addCriterion("giftManagement3 <>", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3GreaterThan(String value) {
            addCriterion("giftManagement3 >", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3GreaterThanOrEqualTo(String value) {
            addCriterion("giftManagement3 >=", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3LessThan(String value) {
            addCriterion("giftManagement3 <", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3LessThanOrEqualTo(String value) {
            addCriterion("giftManagement3 <=", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3Like(String value) {
            addCriterion("giftManagement3 like", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3NotLike(String value) {
            addCriterion("giftManagement3 not like", value, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3In(List<String> values) {
            addCriterion("giftManagement3 in", values, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3NotIn(List<String> values) {
            addCriterion("giftManagement3 not in", values, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3Between(String value1, String value2) {
            addCriterion("giftManagement3 between", value1, value2, "giftmanagement3");
            return (Criteria) this;
        }

        public Criteria andGiftmanagement3NotBetween(String value1, String value2) {
            addCriterion("giftManagement3 not between", value1, value2, "giftmanagement3");
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