package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrpriceIsNull() {
            addCriterion("orPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrpriceIsNotNull() {
            addCriterion("orPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrpriceEqualTo(Double value) {
            addCriterion("orPrice =", value, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceNotEqualTo(Double value) {
            addCriterion("orPrice <>", value, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceGreaterThan(Double value) {
            addCriterion("orPrice >", value, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orPrice >=", value, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceLessThan(Double value) {
            addCriterion("orPrice <", value, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceLessThanOrEqualTo(Double value) {
            addCriterion("orPrice <=", value, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceIn(List<Double> values) {
            addCriterion("orPrice in", values, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceNotIn(List<Double> values) {
            addCriterion("orPrice not in", values, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceBetween(Double value1, Double value2) {
            addCriterion("orPrice between", value1, value2, "orprice");
            return (Criteria) this;
        }

        public Criteria andOrpriceNotBetween(Double value1, Double value2) {
            addCriterion("orPrice not between", value1, value2, "orprice");
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

        public Criteria andNowpriceIsNull() {
            addCriterion("nowPrice is null");
            return (Criteria) this;
        }

        public Criteria andNowpriceIsNotNull() {
            addCriterion("nowPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNowpriceEqualTo(Double value) {
            addCriterion("nowPrice =", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceNotEqualTo(Double value) {
            addCriterion("nowPrice <>", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceGreaterThan(Double value) {
            addCriterion("nowPrice >", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("nowPrice >=", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceLessThan(Double value) {
            addCriterion("nowPrice <", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceLessThanOrEqualTo(Double value) {
            addCriterion("nowPrice <=", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceIn(List<Double> values) {
            addCriterion("nowPrice in", values, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceNotIn(List<Double> values) {
            addCriterion("nowPrice not in", values, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceBetween(Double value1, Double value2) {
            addCriterion("nowPrice between", value1, value2, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceNotBetween(Double value1, Double value2) {
            addCriterion("nowPrice not between", value1, value2, "nowprice");
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

        public Criteria andAuditstatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("auditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("auditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("auditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("auditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("auditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("auditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus not between", value1, value2, "auditstatus");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andImagetitleIsNull() {
            addCriterion("imageTitle is null");
            return (Criteria) this;
        }

        public Criteria andImagetitleIsNotNull() {
            addCriterion("imageTitle is not null");
            return (Criteria) this;
        }

        public Criteria andImagetitleEqualTo(String value) {
            addCriterion("imageTitle =", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleNotEqualTo(String value) {
            addCriterion("imageTitle <>", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleGreaterThan(String value) {
            addCriterion("imageTitle >", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("imageTitle >=", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleLessThan(String value) {
            addCriterion("imageTitle <", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleLessThanOrEqualTo(String value) {
            addCriterion("imageTitle <=", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleLike(String value) {
            addCriterion("imageTitle like", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleNotLike(String value) {
            addCriterion("imageTitle not like", value, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleIn(List<String> values) {
            addCriterion("imageTitle in", values, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleNotIn(List<String> values) {
            addCriterion("imageTitle not in", values, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleBetween(String value1, String value2) {
            addCriterion("imageTitle between", value1, value2, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andImagetitleNotBetween(String value1, String value2) {
            addCriterion("imageTitle not between", value1, value2, "imagetitle");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginIsNull() {
            addCriterion("placeOrigin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginIsNotNull() {
            addCriterion("placeOrigin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginEqualTo(String value) {
            addCriterion("placeOrigin =", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotEqualTo(String value) {
            addCriterion("placeOrigin <>", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginGreaterThan(String value) {
            addCriterion("placeOrigin >", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginGreaterThanOrEqualTo(String value) {
            addCriterion("placeOrigin >=", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginLessThan(String value) {
            addCriterion("placeOrigin <", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginLessThanOrEqualTo(String value) {
            addCriterion("placeOrigin <=", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginLike(String value) {
            addCriterion("placeOrigin like", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotLike(String value) {
            addCriterion("placeOrigin not like", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginIn(List<String> values) {
            addCriterion("placeOrigin in", values, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotIn(List<String> values) {
            addCriterion("placeOrigin not in", values, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginBetween(String value1, String value2) {
            addCriterion("placeOrigin between", value1, value2, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotBetween(String value1, String value2) {
            addCriterion("placeOrigin not between", value1, value2, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andTextureIsNull() {
            addCriterion("texture is null");
            return (Criteria) this;
        }

        public Criteria andTextureIsNotNull() {
            addCriterion("texture is not null");
            return (Criteria) this;
        }

        public Criteria andTextureEqualTo(String value) {
            addCriterion("texture =", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotEqualTo(String value) {
            addCriterion("texture <>", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureGreaterThan(String value) {
            addCriterion("texture >", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureGreaterThanOrEqualTo(String value) {
            addCriterion("texture >=", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLessThan(String value) {
            addCriterion("texture <", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLessThanOrEqualTo(String value) {
            addCriterion("texture <=", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLike(String value) {
            addCriterion("texture like", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotLike(String value) {
            addCriterion("texture not like", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureIn(List<String> values) {
            addCriterion("texture in", values, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotIn(List<String> values) {
            addCriterion("texture not in", values, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureBetween(String value1, String value2) {
            addCriterion("texture between", value1, value2, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotBetween(String value1, String value2) {
            addCriterion("texture not between", value1, value2, "texture");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andSynopsisIsNull() {
            addCriterion("synopsis is null");
            return (Criteria) this;
        }

        public Criteria andSynopsisIsNotNull() {
            addCriterion("synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andSynopsisEqualTo(String value) {
            addCriterion("synopsis =", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotEqualTo(String value) {
            addCriterion("synopsis <>", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisGreaterThan(String value) {
            addCriterion("synopsis >", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("synopsis >=", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLessThan(String value) {
            addCriterion("synopsis <", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLessThanOrEqualTo(String value) {
            addCriterion("synopsis <=", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLike(String value) {
            addCriterion("synopsis like", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotLike(String value) {
            addCriterion("synopsis not like", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisIn(List<String> values) {
            addCriterion("synopsis in", values, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotIn(List<String> values) {
            addCriterion("synopsis not in", values, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisBetween(String value1, String value2) {
            addCriterion("synopsis between", value1, value2, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotBetween(String value1, String value2) {
            addCriterion("synopsis not between", value1, value2, "synopsis");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
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

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
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