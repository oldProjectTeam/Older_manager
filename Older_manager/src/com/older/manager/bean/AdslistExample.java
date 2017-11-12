package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdslistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdslistExample() {
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

        public Criteria andSortnameIsNull() {
            addCriterion("sortname is null");
            return (Criteria) this;
        }

        public Criteria andSortnameIsNotNull() {
            addCriterion("sortname is not null");
            return (Criteria) this;
        }

        public Criteria andSortnameEqualTo(String value) {
            addCriterion("sortname =", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotEqualTo(String value) {
            addCriterion("sortname <>", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameGreaterThan(String value) {
            addCriterion("sortname >", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameGreaterThanOrEqualTo(String value) {
            addCriterion("sortname >=", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameLessThan(String value) {
            addCriterion("sortname <", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameLessThanOrEqualTo(String value) {
            addCriterion("sortname <=", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameLike(String value) {
            addCriterion("sortname like", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotLike(String value) {
            addCriterion("sortname not like", value, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameIn(List<String> values) {
            addCriterion("sortname in", values, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotIn(List<String> values) {
            addCriterion("sortname not in", values, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameBetween(String value1, String value2) {
            addCriterion("sortname between", value1, value2, "sortname");
            return (Criteria) this;
        }

        public Criteria andSortnameNotBetween(String value1, String value2) {
            addCriterion("sortname not between", value1, value2, "sortname");
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

        public Criteria andSortphotoIsNull() {
            addCriterion("sortphoto is null");
            return (Criteria) this;
        }

        public Criteria andSortphotoIsNotNull() {
            addCriterion("sortphoto is not null");
            return (Criteria) this;
        }

        public Criteria andSortphotoEqualTo(String value) {
            addCriterion("sortphoto =", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoNotEqualTo(String value) {
            addCriterion("sortphoto <>", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoGreaterThan(String value) {
            addCriterion("sortphoto >", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoGreaterThanOrEqualTo(String value) {
            addCriterion("sortphoto >=", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoLessThan(String value) {
            addCriterion("sortphoto <", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoLessThanOrEqualTo(String value) {
            addCriterion("sortphoto <=", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoLike(String value) {
            addCriterion("sortphoto like", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoNotLike(String value) {
            addCriterion("sortphoto not like", value, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoIn(List<String> values) {
            addCriterion("sortphoto in", values, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoNotIn(List<String> values) {
            addCriterion("sortphoto not in", values, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoBetween(String value1, String value2) {
            addCriterion("sortphoto between", value1, value2, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortphotoNotBetween(String value1, String value2) {
            addCriterion("sortphoto not between", value1, value2, "sortphoto");
            return (Criteria) this;
        }

        public Criteria andSortsizeIsNull() {
            addCriterion("sortsize is null");
            return (Criteria) this;
        }

        public Criteria andSortsizeIsNotNull() {
            addCriterion("sortsize is not null");
            return (Criteria) this;
        }

        public Criteria andSortsizeEqualTo(String value) {
            addCriterion("sortsize =", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeNotEqualTo(String value) {
            addCriterion("sortsize <>", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeGreaterThan(String value) {
            addCriterion("sortsize >", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeGreaterThanOrEqualTo(String value) {
            addCriterion("sortsize >=", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeLessThan(String value) {
            addCriterion("sortsize <", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeLessThanOrEqualTo(String value) {
            addCriterion("sortsize <=", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeLike(String value) {
            addCriterion("sortsize like", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeNotLike(String value) {
            addCriterion("sortsize not like", value, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeIn(List<String> values) {
            addCriterion("sortsize in", values, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeNotIn(List<String> values) {
            addCriterion("sortsize not in", values, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeBetween(String value1, String value2) {
            addCriterion("sortsize between", value1, value2, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSortsizeNotBetween(String value1, String value2) {
            addCriterion("sortsize not between", value1, value2, "sortsize");
            return (Criteria) this;
        }

        public Criteria andSorthrefIsNull() {
            addCriterion("sorthref is null");
            return (Criteria) this;
        }

        public Criteria andSorthrefIsNotNull() {
            addCriterion("sorthref is not null");
            return (Criteria) this;
        }

        public Criteria andSorthrefEqualTo(String value) {
            addCriterion("sorthref =", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefNotEqualTo(String value) {
            addCriterion("sorthref <>", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefGreaterThan(String value) {
            addCriterion("sorthref >", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefGreaterThanOrEqualTo(String value) {
            addCriterion("sorthref >=", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefLessThan(String value) {
            addCriterion("sorthref <", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefLessThanOrEqualTo(String value) {
            addCriterion("sorthref <=", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefLike(String value) {
            addCriterion("sorthref like", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefNotLike(String value) {
            addCriterion("sorthref not like", value, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefIn(List<String> values) {
            addCriterion("sorthref in", values, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefNotIn(List<String> values) {
            addCriterion("sorthref not in", values, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefBetween(String value1, String value2) {
            addCriterion("sorthref between", value1, value2, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSorthrefNotBetween(String value1, String value2) {
            addCriterion("sorthref not between", value1, value2, "sorthref");
            return (Criteria) this;
        }

        public Criteria andSortjointimeIsNull() {
            addCriterion("sortjointime is null");
            return (Criteria) this;
        }

        public Criteria andSortjointimeIsNotNull() {
            addCriterion("sortjointime is not null");
            return (Criteria) this;
        }

        public Criteria andSortjointimeEqualTo(Date value) {
            addCriterion("sortjointime =", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeNotEqualTo(Date value) {
            addCriterion("sortjointime <>", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeGreaterThan(Date value) {
            addCriterion("sortjointime >", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sortjointime >=", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeLessThan(Date value) {
            addCriterion("sortjointime <", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeLessThanOrEqualTo(Date value) {
            addCriterion("sortjointime <=", value, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeIn(List<Date> values) {
            addCriterion("sortjointime in", values, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeNotIn(List<Date> values) {
            addCriterion("sortjointime not in", values, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeBetween(Date value1, Date value2) {
            addCriterion("sortjointime between", value1, value2, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortjointimeNotBetween(Date value1, Date value2) {
            addCriterion("sortjointime not between", value1, value2, "sortjointime");
            return (Criteria) this;
        }

        public Criteria andSortstateIsNull() {
            addCriterion("sortstate is null");
            return (Criteria) this;
        }

        public Criteria andSortstateIsNotNull() {
            addCriterion("sortstate is not null");
            return (Criteria) this;
        }

        public Criteria andSortstateEqualTo(String value) {
            addCriterion("sortstate =", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotEqualTo(String value) {
            addCriterion("sortstate <>", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateGreaterThan(String value) {
            addCriterion("sortstate >", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateGreaterThanOrEqualTo(String value) {
            addCriterion("sortstate >=", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateLessThan(String value) {
            addCriterion("sortstate <", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateLessThanOrEqualTo(String value) {
            addCriterion("sortstate <=", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateLike(String value) {
            addCriterion("sortstate like", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotLike(String value) {
            addCriterion("sortstate not like", value, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateIn(List<String> values) {
            addCriterion("sortstate in", values, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotIn(List<String> values) {
            addCriterion("sortstate not in", values, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateBetween(String value1, String value2) {
            addCriterion("sortstate between", value1, value2, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortstateNotBetween(String value1, String value2) {
            addCriterion("sortstate not between", value1, value2, "sortstate");
            return (Criteria) this;
        }

        public Criteria andSortoneIsNull() {
            addCriterion("sortone is null");
            return (Criteria) this;
        }

        public Criteria andSortoneIsNotNull() {
            addCriterion("sortone is not null");
            return (Criteria) this;
        }

        public Criteria andSortoneEqualTo(String value) {
            addCriterion("sortone =", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneNotEqualTo(String value) {
            addCriterion("sortone <>", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneGreaterThan(String value) {
            addCriterion("sortone >", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneGreaterThanOrEqualTo(String value) {
            addCriterion("sortone >=", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneLessThan(String value) {
            addCriterion("sortone <", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneLessThanOrEqualTo(String value) {
            addCriterion("sortone <=", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneLike(String value) {
            addCriterion("sortone like", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneNotLike(String value) {
            addCriterion("sortone not like", value, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneIn(List<String> values) {
            addCriterion("sortone in", values, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneNotIn(List<String> values) {
            addCriterion("sortone not in", values, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneBetween(String value1, String value2) {
            addCriterion("sortone between", value1, value2, "sortone");
            return (Criteria) this;
        }

        public Criteria andSortoneNotBetween(String value1, String value2) {
            addCriterion("sortone not between", value1, value2, "sortone");
            return (Criteria) this;
        }

        public Criteria andSorttwoIsNull() {
            addCriterion("sorttwo is null");
            return (Criteria) this;
        }

        public Criteria andSorttwoIsNotNull() {
            addCriterion("sorttwo is not null");
            return (Criteria) this;
        }

        public Criteria andSorttwoEqualTo(String value) {
            addCriterion("sorttwo =", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoNotEqualTo(String value) {
            addCriterion("sorttwo <>", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoGreaterThan(String value) {
            addCriterion("sorttwo >", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoGreaterThanOrEqualTo(String value) {
            addCriterion("sorttwo >=", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoLessThan(String value) {
            addCriterion("sorttwo <", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoLessThanOrEqualTo(String value) {
            addCriterion("sorttwo <=", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoLike(String value) {
            addCriterion("sorttwo like", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoNotLike(String value) {
            addCriterion("sorttwo not like", value, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoIn(List<String> values) {
            addCriterion("sorttwo in", values, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoNotIn(List<String> values) {
            addCriterion("sorttwo not in", values, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoBetween(String value1, String value2) {
            addCriterion("sorttwo between", value1, value2, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSorttwoNotBetween(String value1, String value2) {
            addCriterion("sorttwo not between", value1, value2, "sorttwo");
            return (Criteria) this;
        }

        public Criteria andSortthreeIsNull() {
            addCriterion("sortthree is null");
            return (Criteria) this;
        }

        public Criteria andSortthreeIsNotNull() {
            addCriterion("sortthree is not null");
            return (Criteria) this;
        }

        public Criteria andSortthreeEqualTo(String value) {
            addCriterion("sortthree =", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeNotEqualTo(String value) {
            addCriterion("sortthree <>", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeGreaterThan(String value) {
            addCriterion("sortthree >", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeGreaterThanOrEqualTo(String value) {
            addCriterion("sortthree >=", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeLessThan(String value) {
            addCriterion("sortthree <", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeLessThanOrEqualTo(String value) {
            addCriterion("sortthree <=", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeLike(String value) {
            addCriterion("sortthree like", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeNotLike(String value) {
            addCriterion("sortthree not like", value, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeIn(List<String> values) {
            addCriterion("sortthree in", values, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeNotIn(List<String> values) {
            addCriterion("sortthree not in", values, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeBetween(String value1, String value2) {
            addCriterion("sortthree between", value1, value2, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortthreeNotBetween(String value1, String value2) {
            addCriterion("sortthree not between", value1, value2, "sortthree");
            return (Criteria) this;
        }

        public Criteria andSortfourIsNull() {
            addCriterion("sortfour is null");
            return (Criteria) this;
        }

        public Criteria andSortfourIsNotNull() {
            addCriterion("sortfour is not null");
            return (Criteria) this;
        }

        public Criteria andSortfourEqualTo(Integer value) {
            addCriterion("sortfour =", value, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourNotEqualTo(Integer value) {
            addCriterion("sortfour <>", value, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourGreaterThan(Integer value) {
            addCriterion("sortfour >", value, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortfour >=", value, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourLessThan(Integer value) {
            addCriterion("sortfour <", value, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourLessThanOrEqualTo(Integer value) {
            addCriterion("sortfour <=", value, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourIn(List<Integer> values) {
            addCriterion("sortfour in", values, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourNotIn(List<Integer> values) {
            addCriterion("sortfour not in", values, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourBetween(Integer value1, Integer value2) {
            addCriterion("sortfour between", value1, value2, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortfourNotBetween(Integer value1, Integer value2) {
            addCriterion("sortfour not between", value1, value2, "sortfour");
            return (Criteria) this;
        }

        public Criteria andSortadsidIsNull() {
            addCriterion("sortadsid is null");
            return (Criteria) this;
        }

        public Criteria andSortadsidIsNotNull() {
            addCriterion("sortadsid is not null");
            return (Criteria) this;
        }

        public Criteria andSortadsidEqualTo(Integer value) {
            addCriterion("sortadsid =", value, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidNotEqualTo(Integer value) {
            addCriterion("sortadsid <>", value, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidGreaterThan(Integer value) {
            addCriterion("sortadsid >", value, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortadsid >=", value, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidLessThan(Integer value) {
            addCriterion("sortadsid <", value, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidLessThanOrEqualTo(Integer value) {
            addCriterion("sortadsid <=", value, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidIn(List<Integer> values) {
            addCriterion("sortadsid in", values, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidNotIn(List<Integer> values) {
            addCriterion("sortadsid not in", values, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidBetween(Integer value1, Integer value2) {
            addCriterion("sortadsid between", value1, value2, "sortadsid");
            return (Criteria) this;
        }

        public Criteria andSortadsidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortadsid not between", value1, value2, "sortadsid");
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