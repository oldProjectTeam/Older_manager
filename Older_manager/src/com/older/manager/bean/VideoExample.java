package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNull() {
            addCriterion("marking is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("marking is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(String value) {
            addCriterion("marking =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(String value) {
            addCriterion("marking <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(String value) {
            addCriterion("marking >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(String value) {
            addCriterion("marking >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(String value) {
            addCriterion("marking <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(String value) {
            addCriterion("marking <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLike(String value) {
            addCriterion("marking like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotLike(String value) {
            addCriterion("marking not like", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(List<String> values) {
            addCriterion("marking in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(List<String> values) {
            addCriterion("marking not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(String value1, String value2) {
            addCriterion("marking between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(String value1, String value2) {
            addCriterion("marking not between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andLenghtIsNull() {
            addCriterion("lenght is null");
            return (Criteria) this;
        }

        public Criteria andLenghtIsNotNull() {
            addCriterion("lenght is not null");
            return (Criteria) this;
        }

        public Criteria andLenghtEqualTo(String value) {
            addCriterion("lenght =", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtNotEqualTo(String value) {
            addCriterion("lenght <>", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtGreaterThan(String value) {
            addCriterion("lenght >", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtGreaterThanOrEqualTo(String value) {
            addCriterion("lenght >=", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtLessThan(String value) {
            addCriterion("lenght <", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtLessThanOrEqualTo(String value) {
            addCriterion("lenght <=", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtLike(String value) {
            addCriterion("lenght like", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtNotLike(String value) {
            addCriterion("lenght not like", value, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtIn(List<String> values) {
            addCriterion("lenght in", values, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtNotIn(List<String> values) {
            addCriterion("lenght not in", values, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtBetween(String value1, String value2) {
            addCriterion("lenght between", value1, value2, "lenght");
            return (Criteria) this;
        }

        public Criteria andLenghtNotBetween(String value1, String value2) {
            addCriterion("lenght not between", value1, value2, "lenght");
            return (Criteria) this;
        }

        public Criteria andFrameheightIsNull() {
            addCriterion("frameHeight is null");
            return (Criteria) this;
        }

        public Criteria andFrameheightIsNotNull() {
            addCriterion("frameHeight is not null");
            return (Criteria) this;
        }

        public Criteria andFrameheightEqualTo(Double value) {
            addCriterion("frameHeight =", value, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightNotEqualTo(Double value) {
            addCriterion("frameHeight <>", value, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightGreaterThan(Double value) {
            addCriterion("frameHeight >", value, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightGreaterThanOrEqualTo(Double value) {
            addCriterion("frameHeight >=", value, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightLessThan(Double value) {
            addCriterion("frameHeight <", value, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightLessThanOrEqualTo(Double value) {
            addCriterion("frameHeight <=", value, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightIn(List<Double> values) {
            addCriterion("frameHeight in", values, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightNotIn(List<Double> values) {
            addCriterion("frameHeight not in", values, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightBetween(Double value1, Double value2) {
            addCriterion("frameHeight between", value1, value2, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFrameheightNotBetween(Double value1, Double value2) {
            addCriterion("frameHeight not between", value1, value2, "frameheight");
            return (Criteria) this;
        }

        public Criteria andFramewidthIsNull() {
            addCriterion("frameWidth is null");
            return (Criteria) this;
        }

        public Criteria andFramewidthIsNotNull() {
            addCriterion("frameWidth is not null");
            return (Criteria) this;
        }

        public Criteria andFramewidthEqualTo(Double value) {
            addCriterion("frameWidth =", value, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthNotEqualTo(Double value) {
            addCriterion("frameWidth <>", value, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthGreaterThan(Double value) {
            addCriterion("frameWidth >", value, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthGreaterThanOrEqualTo(Double value) {
            addCriterion("frameWidth >=", value, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthLessThan(Double value) {
            addCriterion("frameWidth <", value, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthLessThanOrEqualTo(Double value) {
            addCriterion("frameWidth <=", value, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthIn(List<Double> values) {
            addCriterion("frameWidth in", values, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthNotIn(List<Double> values) {
            addCriterion("frameWidth not in", values, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthBetween(Double value1, Double value2) {
            addCriterion("frameWidth between", value1, value2, "framewidth");
            return (Criteria) this;
        }

        public Criteria andFramewidthNotBetween(Double value1, Double value2) {
            addCriterion("frameWidth not between", value1, value2, "framewidth");
            return (Criteria) this;
        }

        public Criteria andDaterateIsNull() {
            addCriterion("dateRate is null");
            return (Criteria) this;
        }

        public Criteria andDaterateIsNotNull() {
            addCriterion("dateRate is not null");
            return (Criteria) this;
        }

        public Criteria andDaterateEqualTo(String value) {
            addCriterion("dateRate =", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateNotEqualTo(String value) {
            addCriterion("dateRate <>", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateGreaterThan(String value) {
            addCriterion("dateRate >", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateGreaterThanOrEqualTo(String value) {
            addCriterion("dateRate >=", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateLessThan(String value) {
            addCriterion("dateRate <", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateLessThanOrEqualTo(String value) {
            addCriterion("dateRate <=", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateLike(String value) {
            addCriterion("dateRate like", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateNotLike(String value) {
            addCriterion("dateRate not like", value, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateIn(List<String> values) {
            addCriterion("dateRate in", values, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateNotIn(List<String> values) {
            addCriterion("dateRate not in", values, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateBetween(String value1, String value2) {
            addCriterion("dateRate between", value1, value2, "daterate");
            return (Criteria) this;
        }

        public Criteria andDaterateNotBetween(String value1, String value2) {
            addCriterion("dateRate not between", value1, value2, "daterate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateIsNull() {
            addCriterion("totalBitRate is null");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateIsNotNull() {
            addCriterion("totalBitRate is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateEqualTo(String value) {
            addCriterion("totalBitRate =", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateNotEqualTo(String value) {
            addCriterion("totalBitRate <>", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateGreaterThan(String value) {
            addCriterion("totalBitRate >", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateGreaterThanOrEqualTo(String value) {
            addCriterion("totalBitRate >=", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateLessThan(String value) {
            addCriterion("totalBitRate <", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateLessThanOrEqualTo(String value) {
            addCriterion("totalBitRate <=", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateLike(String value) {
            addCriterion("totalBitRate like", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateNotLike(String value) {
            addCriterion("totalBitRate not like", value, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateIn(List<String> values) {
            addCriterion("totalBitRate in", values, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateNotIn(List<String> values) {
            addCriterion("totalBitRate not in", values, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateBetween(String value1, String value2) {
            addCriterion("totalBitRate between", value1, value2, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andTotalbitrateNotBetween(String value1, String value2) {
            addCriterion("totalBitRate not between", value1, value2, "totalbitrate");
            return (Criteria) this;
        }

        public Criteria andFramerateIsNull() {
            addCriterion("frameRate is null");
            return (Criteria) this;
        }

        public Criteria andFramerateIsNotNull() {
            addCriterion("frameRate is not null");
            return (Criteria) this;
        }

        public Criteria andFramerateEqualTo(String value) {
            addCriterion("frameRate =", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateNotEqualTo(String value) {
            addCriterion("frameRate <>", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateGreaterThan(String value) {
            addCriterion("frameRate >", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateGreaterThanOrEqualTo(String value) {
            addCriterion("frameRate >=", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateLessThan(String value) {
            addCriterion("frameRate <", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateLessThanOrEqualTo(String value) {
            addCriterion("frameRate <=", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateLike(String value) {
            addCriterion("frameRate like", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateNotLike(String value) {
            addCriterion("frameRate not like", value, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateIn(List<String> values) {
            addCriterion("frameRate in", values, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateNotIn(List<String> values) {
            addCriterion("frameRate not in", values, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateBetween(String value1, String value2) {
            addCriterion("frameRate between", value1, value2, "framerate");
            return (Criteria) this;
        }

        public Criteria andFramerateNotBetween(String value1, String value2) {
            addCriterion("frameRate not between", value1, value2, "framerate");
            return (Criteria) this;
        }

        public Criteria andBitrateIsNull() {
            addCriterion("bitRate is null");
            return (Criteria) this;
        }

        public Criteria andBitrateIsNotNull() {
            addCriterion("bitRate is not null");
            return (Criteria) this;
        }

        public Criteria andBitrateEqualTo(String value) {
            addCriterion("bitRate =", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateNotEqualTo(String value) {
            addCriterion("bitRate <>", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateGreaterThan(String value) {
            addCriterion("bitRate >", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateGreaterThanOrEqualTo(String value) {
            addCriterion("bitRate >=", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateLessThan(String value) {
            addCriterion("bitRate <", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateLessThanOrEqualTo(String value) {
            addCriterion("bitRate <=", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateLike(String value) {
            addCriterion("bitRate like", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateNotLike(String value) {
            addCriterion("bitRate not like", value, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateIn(List<String> values) {
            addCriterion("bitRate in", values, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateNotIn(List<String> values) {
            addCriterion("bitRate not in", values, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateBetween(String value1, String value2) {
            addCriterion("bitRate between", value1, value2, "bitrate");
            return (Criteria) this;
        }

        public Criteria andBitrateNotBetween(String value1, String value2) {
            addCriterion("bitRate not between", value1, value2, "bitrate");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andAfsfIsNull() {
            addCriterion("afsf is null");
            return (Criteria) this;
        }

        public Criteria andAfsfIsNotNull() {
            addCriterion("afsf is not null");
            return (Criteria) this;
        }

        public Criteria andAfsfEqualTo(String value) {
            addCriterion("afsf =", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfNotEqualTo(String value) {
            addCriterion("afsf <>", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfGreaterThan(String value) {
            addCriterion("afsf >", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfGreaterThanOrEqualTo(String value) {
            addCriterion("afsf >=", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfLessThan(String value) {
            addCriterion("afsf <", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfLessThanOrEqualTo(String value) {
            addCriterion("afsf <=", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfLike(String value) {
            addCriterion("afsf like", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfNotLike(String value) {
            addCriterion("afsf not like", value, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfIn(List<String> values) {
            addCriterion("afsf in", values, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfNotIn(List<String> values) {
            addCriterion("afsf not in", values, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfBetween(String value1, String value2) {
            addCriterion("afsf between", value1, value2, "afsf");
            return (Criteria) this;
        }

        public Criteria andAfsfNotBetween(String value1, String value2) {
            addCriterion("afsf not between", value1, value2, "afsf");
            return (Criteria) this;
        }

        public Criteria andArtistsIsNull() {
            addCriterion("artists is null");
            return (Criteria) this;
        }

        public Criteria andArtistsIsNotNull() {
            addCriterion("artists is not null");
            return (Criteria) this;
        }

        public Criteria andArtistsEqualTo(String value) {
            addCriterion("artists =", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsNotEqualTo(String value) {
            addCriterion("artists <>", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsGreaterThan(String value) {
            addCriterion("artists >", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsGreaterThanOrEqualTo(String value) {
            addCriterion("artists >=", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsLessThan(String value) {
            addCriterion("artists <", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsLessThanOrEqualTo(String value) {
            addCriterion("artists <=", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsLike(String value) {
            addCriterion("artists like", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsNotLike(String value) {
            addCriterion("artists not like", value, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsIn(List<String> values) {
            addCriterion("artists in", values, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsNotIn(List<String> values) {
            addCriterion("artists not in", values, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsBetween(String value1, String value2) {
            addCriterion("artists between", value1, value2, "artists");
            return (Criteria) this;
        }

        public Criteria andArtistsNotBetween(String value1, String value2) {
            addCriterion("artists not between", value1, value2, "artists");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(String value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(String value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(String value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(String value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(String value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(String value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLike(String value) {
            addCriterion("years like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotLike(String value) {
            addCriterion("years not like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<String> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<String> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(String value1, String value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(String value1, String value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("producer is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("producer is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("producer =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("producer <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("producer >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("producer >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("producer <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("producer <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("producer like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("producer not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("producer in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("producer not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("producer between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("producer not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andCreatorsIsNull() {
            addCriterion("creators is null");
            return (Criteria) this;
        }

        public Criteria andCreatorsIsNotNull() {
            addCriterion("creators is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorsEqualTo(String value) {
            addCriterion("creators =", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotEqualTo(String value) {
            addCriterion("creators <>", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsGreaterThan(String value) {
            addCriterion("creators >", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsGreaterThanOrEqualTo(String value) {
            addCriterion("creators >=", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsLessThan(String value) {
            addCriterion("creators <", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsLessThanOrEqualTo(String value) {
            addCriterion("creators <=", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsLike(String value) {
            addCriterion("creators like", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotLike(String value) {
            addCriterion("creators not like", value, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsIn(List<String> values) {
            addCriterion("creators in", values, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotIn(List<String> values) {
            addCriterion("creators not in", values, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsBetween(String value1, String value2) {
            addCriterion("creators between", value1, value2, "creators");
            return (Criteria) this;
        }

        public Criteria andCreatorsNotBetween(String value1, String value2) {
            addCriterion("creators not between", value1, value2, "creators");
            return (Criteria) this;
        }

        public Criteria andPromulgatorIsNull() {
            addCriterion("promulgator is null");
            return (Criteria) this;
        }

        public Criteria andPromulgatorIsNotNull() {
            addCriterion("promulgator is not null");
            return (Criteria) this;
        }

        public Criteria andPromulgatorEqualTo(String value) {
            addCriterion("promulgator =", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotEqualTo(String value) {
            addCriterion("promulgator <>", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorGreaterThan(String value) {
            addCriterion("promulgator >", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorGreaterThanOrEqualTo(String value) {
            addCriterion("promulgator >=", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorLessThan(String value) {
            addCriterion("promulgator <", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorLessThanOrEqualTo(String value) {
            addCriterion("promulgator <=", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorLike(String value) {
            addCriterion("promulgator like", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotLike(String value) {
            addCriterion("promulgator not like", value, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorIn(List<String> values) {
            addCriterion("promulgator in", values, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotIn(List<String> values) {
            addCriterion("promulgator not in", values, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorBetween(String value1, String value2) {
            addCriterion("promulgator between", value1, value2, "promulgator");
            return (Criteria) this;
        }

        public Criteria andPromulgatorNotBetween(String value1, String value2) {
            addCriterion("promulgator not between", value1, value2, "promulgator");
            return (Criteria) this;
        }

        public Criteria andContentproviderIsNull() {
            addCriterion("contentProvider is null");
            return (Criteria) this;
        }

        public Criteria andContentproviderIsNotNull() {
            addCriterion("contentProvider is not null");
            return (Criteria) this;
        }

        public Criteria andContentproviderEqualTo(String value) {
            addCriterion("contentProvider =", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderNotEqualTo(String value) {
            addCriterion("contentProvider <>", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderGreaterThan(String value) {
            addCriterion("contentProvider >", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderGreaterThanOrEqualTo(String value) {
            addCriterion("contentProvider >=", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderLessThan(String value) {
            addCriterion("contentProvider <", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderLessThanOrEqualTo(String value) {
            addCriterion("contentProvider <=", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderLike(String value) {
            addCriterion("contentProvider like", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderNotLike(String value) {
            addCriterion("contentProvider not like", value, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderIn(List<String> values) {
            addCriterion("contentProvider in", values, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderNotIn(List<String> values) {
            addCriterion("contentProvider not in", values, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderBetween(String value1, String value2) {
            addCriterion("contentProvider between", value1, value2, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andContentproviderNotBetween(String value1, String value2) {
            addCriterion("contentProvider not between", value1, value2, "contentprovider");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyRight is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyRight is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyRight =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyRight <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyRight >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyRight >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyRight <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyRight <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyRight like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyRight not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyRight in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyRight not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyRight between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyRight not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andVcountIsNull() {
            addCriterion("vcount is null");
            return (Criteria) this;
        }

        public Criteria andVcountIsNotNull() {
            addCriterion("vcount is not null");
            return (Criteria) this;
        }

        public Criteria andVcountEqualTo(Integer value) {
            addCriterion("vcount =", value, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountNotEqualTo(Integer value) {
            addCriterion("vcount <>", value, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountGreaterThan(Integer value) {
            addCriterion("vcount >", value, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("vcount >=", value, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountLessThan(Integer value) {
            addCriterion("vcount <", value, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountLessThanOrEqualTo(Integer value) {
            addCriterion("vcount <=", value, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountIn(List<Integer> values) {
            addCriterion("vcount in", values, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountNotIn(List<Integer> values) {
            addCriterion("vcount not in", values, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountBetween(Integer value1, Integer value2) {
            addCriterion("vcount between", value1, value2, "vcount");
            return (Criteria) this;
        }

        public Criteria andVcountNotBetween(Integer value1, Integer value2) {
            addCriterion("vcount not between", value1, value2, "vcount");
            return (Criteria) this;
        }

        public Criteria andVideo2IsNull() {
            addCriterion("video2 is null");
            return (Criteria) this;
        }

        public Criteria andVideo2IsNotNull() {
            addCriterion("video2 is not null");
            return (Criteria) this;
        }

        public Criteria andVideo2EqualTo(String value) {
            addCriterion("video2 =", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2NotEqualTo(String value) {
            addCriterion("video2 <>", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2GreaterThan(String value) {
            addCriterion("video2 >", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2GreaterThanOrEqualTo(String value) {
            addCriterion("video2 >=", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2LessThan(String value) {
            addCriterion("video2 <", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2LessThanOrEqualTo(String value) {
            addCriterion("video2 <=", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2Like(String value) {
            addCriterion("video2 like", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2NotLike(String value) {
            addCriterion("video2 not like", value, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2In(List<String> values) {
            addCriterion("video2 in", values, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2NotIn(List<String> values) {
            addCriterion("video2 not in", values, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2Between(String value1, String value2) {
            addCriterion("video2 between", value1, value2, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo2NotBetween(String value1, String value2) {
            addCriterion("video2 not between", value1, value2, "video2");
            return (Criteria) this;
        }

        public Criteria andVideo3IsNull() {
            addCriterion("video3 is null");
            return (Criteria) this;
        }

        public Criteria andVideo3IsNotNull() {
            addCriterion("video3 is not null");
            return (Criteria) this;
        }

        public Criteria andVideo3EqualTo(String value) {
            addCriterion("video3 =", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3NotEqualTo(String value) {
            addCriterion("video3 <>", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3GreaterThan(String value) {
            addCriterion("video3 >", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3GreaterThanOrEqualTo(String value) {
            addCriterion("video3 >=", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3LessThan(String value) {
            addCriterion("video3 <", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3LessThanOrEqualTo(String value) {
            addCriterion("video3 <=", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3Like(String value) {
            addCriterion("video3 like", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3NotLike(String value) {
            addCriterion("video3 not like", value, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3In(List<String> values) {
            addCriterion("video3 in", values, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3NotIn(List<String> values) {
            addCriterion("video3 not in", values, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3Between(String value1, String value2) {
            addCriterion("video3 between", value1, value2, "video3");
            return (Criteria) this;
        }

        public Criteria andVideo3NotBetween(String value1, String value2) {
            addCriterion("video3 not between", value1, value2, "video3");
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