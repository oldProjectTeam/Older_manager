package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeExample() {
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

        public Criteria andUsidIsNull() {
            addCriterion("usid is null");
            return (Criteria) this;
        }

        public Criteria andUsidIsNotNull() {
            addCriterion("usid is not null");
            return (Criteria) this;
        }

        public Criteria andUsidEqualTo(Integer value) {
            addCriterion("usid =", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotEqualTo(Integer value) {
            addCriterion("usid <>", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThan(Integer value) {
            addCriterion("usid >", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usid >=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThan(Integer value) {
            addCriterion("usid <", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThanOrEqualTo(Integer value) {
            addCriterion("usid <=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidIn(List<Integer> values) {
            addCriterion("usid in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotIn(List<Integer> values) {
            addCriterion("usid not in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidBetween(Integer value1, Integer value2) {
            addCriterion("usid between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotBetween(Integer value1, Integer value2) {
            addCriterion("usid not between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andChnoIsNull() {
            addCriterion("chno is null");
            return (Criteria) this;
        }

        public Criteria andChnoIsNotNull() {
            addCriterion("chno is not null");
            return (Criteria) this;
        }

        public Criteria andChnoEqualTo(String value) {
            addCriterion("chno =", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotEqualTo(String value) {
            addCriterion("chno <>", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoGreaterThan(String value) {
            addCriterion("chno >", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoGreaterThanOrEqualTo(String value) {
            addCriterion("chno >=", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoLessThan(String value) {
            addCriterion("chno <", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoLessThanOrEqualTo(String value) {
            addCriterion("chno <=", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoLike(String value) {
            addCriterion("chno like", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotLike(String value) {
            addCriterion("chno not like", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoIn(List<String> values) {
            addCriterion("chno in", values, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotIn(List<String> values) {
            addCriterion("chno not in", values, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoBetween(String value1, String value2) {
            addCriterion("chno between", value1, value2, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotBetween(String value1, String value2) {
            addCriterion("chno not between", value1, value2, "chno");
            return (Criteria) this;
        }

        public Criteria andChtimeIsNull() {
            addCriterion("chtime is null");
            return (Criteria) this;
        }

        public Criteria andChtimeIsNotNull() {
            addCriterion("chtime is not null");
            return (Criteria) this;
        }

        public Criteria andChtimeEqualTo(Date value) {
            addCriterion("chtime =", value, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeNotEqualTo(Date value) {
            addCriterion("chtime <>", value, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeGreaterThan(Date value) {
            addCriterion("chtime >", value, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chtime >=", value, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeLessThan(Date value) {
            addCriterion("chtime <", value, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeLessThanOrEqualTo(Date value) {
            addCriterion("chtime <=", value, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeIn(List<Date> values) {
            addCriterion("chtime in", values, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeNotIn(List<Date> values) {
            addCriterion("chtime not in", values, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeBetween(Date value1, Date value2) {
            addCriterion("chtime between", value1, value2, "chtime");
            return (Criteria) this;
        }

        public Criteria andChtimeNotBetween(Date value1, Date value2) {
            addCriterion("chtime not between", value1, value2, "chtime");
            return (Criteria) this;
        }

        public Criteria andChphotoIsNull() {
            addCriterion("chphoto is null");
            return (Criteria) this;
        }

        public Criteria andChphotoIsNotNull() {
            addCriterion("chphoto is not null");
            return (Criteria) this;
        }

        public Criteria andChphotoEqualTo(String value) {
            addCriterion("chphoto =", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoNotEqualTo(String value) {
            addCriterion("chphoto <>", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoGreaterThan(String value) {
            addCriterion("chphoto >", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoGreaterThanOrEqualTo(String value) {
            addCriterion("chphoto >=", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoLessThan(String value) {
            addCriterion("chphoto <", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoLessThanOrEqualTo(String value) {
            addCriterion("chphoto <=", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoLike(String value) {
            addCriterion("chphoto like", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoNotLike(String value) {
            addCriterion("chphoto not like", value, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoIn(List<String> values) {
            addCriterion("chphoto in", values, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoNotIn(List<String> values) {
            addCriterion("chphoto not in", values, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoBetween(String value1, String value2) {
            addCriterion("chphoto between", value1, value2, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChphotoNotBetween(String value1, String value2) {
            addCriterion("chphoto not between", value1, value2, "chphoto");
            return (Criteria) this;
        }

        public Criteria andChbrieftIsNull() {
            addCriterion("chbrieft is null");
            return (Criteria) this;
        }

        public Criteria andChbrieftIsNotNull() {
            addCriterion("chbrieft is not null");
            return (Criteria) this;
        }

        public Criteria andChbrieftEqualTo(String value) {
            addCriterion("chbrieft =", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftNotEqualTo(String value) {
            addCriterion("chbrieft <>", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftGreaterThan(String value) {
            addCriterion("chbrieft >", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftGreaterThanOrEqualTo(String value) {
            addCriterion("chbrieft >=", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftLessThan(String value) {
            addCriterion("chbrieft <", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftLessThanOrEqualTo(String value) {
            addCriterion("chbrieft <=", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftLike(String value) {
            addCriterion("chbrieft like", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftNotLike(String value) {
            addCriterion("chbrieft not like", value, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftIn(List<String> values) {
            addCriterion("chbrieft in", values, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftNotIn(List<String> values) {
            addCriterion("chbrieft not in", values, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftBetween(String value1, String value2) {
            addCriterion("chbrieft between", value1, value2, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChbrieftNotBetween(String value1, String value2) {
            addCriterion("chbrieft not between", value1, value2, "chbrieft");
            return (Criteria) this;
        }

        public Criteria andChnameIsNull() {
            addCriterion("chname is null");
            return (Criteria) this;
        }

        public Criteria andChnameIsNotNull() {
            addCriterion("chname is not null");
            return (Criteria) this;
        }

        public Criteria andChnameEqualTo(String value) {
            addCriterion("chname =", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotEqualTo(String value) {
            addCriterion("chname <>", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameGreaterThan(String value) {
            addCriterion("chname >", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameGreaterThanOrEqualTo(String value) {
            addCriterion("chname >=", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameLessThan(String value) {
            addCriterion("chname <", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameLessThanOrEqualTo(String value) {
            addCriterion("chname <=", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameLike(String value) {
            addCriterion("chname like", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotLike(String value) {
            addCriterion("chname not like", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameIn(List<String> values) {
            addCriterion("chname in", values, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotIn(List<String> values) {
            addCriterion("chname not in", values, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameBetween(String value1, String value2) {
            addCriterion("chname between", value1, value2, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotBetween(String value1, String value2) {
            addCriterion("chname not between", value1, value2, "chname");
            return (Criteria) this;
        }

        public Criteria andChmoenyIsNull() {
            addCriterion("chmoeny is null");
            return (Criteria) this;
        }

        public Criteria andChmoenyIsNotNull() {
            addCriterion("chmoeny is not null");
            return (Criteria) this;
        }

        public Criteria andChmoenyEqualTo(Double value) {
            addCriterion("chmoeny =", value, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyNotEqualTo(Double value) {
            addCriterion("chmoeny <>", value, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyGreaterThan(Double value) {
            addCriterion("chmoeny >", value, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyGreaterThanOrEqualTo(Double value) {
            addCriterion("chmoeny >=", value, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyLessThan(Double value) {
            addCriterion("chmoeny <", value, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyLessThanOrEqualTo(Double value) {
            addCriterion("chmoeny <=", value, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyIn(List<Double> values) {
            addCriterion("chmoeny in", values, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyNotIn(List<Double> values) {
            addCriterion("chmoeny not in", values, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyBetween(Double value1, Double value2) {
            addCriterion("chmoeny between", value1, value2, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChmoenyNotBetween(Double value1, Double value2) {
            addCriterion("chmoeny not between", value1, value2, "chmoeny");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyIsNull() {
            addCriterion("chaftermoney is null");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyIsNotNull() {
            addCriterion("chaftermoney is not null");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyEqualTo(Double value) {
            addCriterion("chaftermoney =", value, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyNotEqualTo(Double value) {
            addCriterion("chaftermoney <>", value, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyGreaterThan(Double value) {
            addCriterion("chaftermoney >", value, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("chaftermoney >=", value, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyLessThan(Double value) {
            addCriterion("chaftermoney <", value, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyLessThanOrEqualTo(Double value) {
            addCriterion("chaftermoney <=", value, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyIn(List<Double> values) {
            addCriterion("chaftermoney in", values, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyNotIn(List<Double> values) {
            addCriterion("chaftermoney not in", values, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyBetween(Double value1, Double value2) {
            addCriterion("chaftermoney between", value1, value2, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChaftermoneyNotBetween(Double value1, Double value2) {
            addCriterion("chaftermoney not between", value1, value2, "chaftermoney");
            return (Criteria) this;
        }

        public Criteria andChstateIsNull() {
            addCriterion("chstate is null");
            return (Criteria) this;
        }

        public Criteria andChstateIsNotNull() {
            addCriterion("chstate is not null");
            return (Criteria) this;
        }

        public Criteria andChstateEqualTo(Integer value) {
            addCriterion("chstate =", value, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateNotEqualTo(Integer value) {
            addCriterion("chstate <>", value, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateGreaterThan(Integer value) {
            addCriterion("chstate >", value, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chstate >=", value, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateLessThan(Integer value) {
            addCriterion("chstate <", value, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateLessThanOrEqualTo(Integer value) {
            addCriterion("chstate <=", value, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateIn(List<Integer> values) {
            addCriterion("chstate in", values, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateNotIn(List<Integer> values) {
            addCriterion("chstate not in", values, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateBetween(Integer value1, Integer value2) {
            addCriterion("chstate between", value1, value2, "chstate");
            return (Criteria) this;
        }

        public Criteria andChstateNotBetween(Integer value1, Integer value2) {
            addCriterion("chstate not between", value1, value2, "chstate");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andChoneIsNull() {
            addCriterion("chone is null");
            return (Criteria) this;
        }

        public Criteria andChoneIsNotNull() {
            addCriterion("chone is not null");
            return (Criteria) this;
        }

        public Criteria andChoneEqualTo(Integer value) {
            addCriterion("chone =", value, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneNotEqualTo(Integer value) {
            addCriterion("chone <>", value, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneGreaterThan(Integer value) {
            addCriterion("chone >", value, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("chone >=", value, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneLessThan(Integer value) {
            addCriterion("chone <", value, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneLessThanOrEqualTo(Integer value) {
            addCriterion("chone <=", value, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneIn(List<Integer> values) {
            addCriterion("chone in", values, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneNotIn(List<Integer> values) {
            addCriterion("chone not in", values, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneBetween(Integer value1, Integer value2) {
            addCriterion("chone between", value1, value2, "chone");
            return (Criteria) this;
        }

        public Criteria andChoneNotBetween(Integer value1, Integer value2) {
            addCriterion("chone not between", value1, value2, "chone");
            return (Criteria) this;
        }

        public Criteria andChtwoIsNull() {
            addCriterion("chtwo is null");
            return (Criteria) this;
        }

        public Criteria andChtwoIsNotNull() {
            addCriterion("chtwo is not null");
            return (Criteria) this;
        }

        public Criteria andChtwoEqualTo(String value) {
            addCriterion("chtwo =", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoNotEqualTo(String value) {
            addCriterion("chtwo <>", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoGreaterThan(String value) {
            addCriterion("chtwo >", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoGreaterThanOrEqualTo(String value) {
            addCriterion("chtwo >=", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoLessThan(String value) {
            addCriterion("chtwo <", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoLessThanOrEqualTo(String value) {
            addCriterion("chtwo <=", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoLike(String value) {
            addCriterion("chtwo like", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoNotLike(String value) {
            addCriterion("chtwo not like", value, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoIn(List<String> values) {
            addCriterion("chtwo in", values, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoNotIn(List<String> values) {
            addCriterion("chtwo not in", values, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoBetween(String value1, String value2) {
            addCriterion("chtwo between", value1, value2, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChtwoNotBetween(String value1, String value2) {
            addCriterion("chtwo not between", value1, value2, "chtwo");
            return (Criteria) this;
        }

        public Criteria andChthreeIsNull() {
            addCriterion("chthree is null");
            return (Criteria) this;
        }

        public Criteria andChthreeIsNotNull() {
            addCriterion("chthree is not null");
            return (Criteria) this;
        }

        public Criteria andChthreeEqualTo(String value) {
            addCriterion("chthree =", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeNotEqualTo(String value) {
            addCriterion("chthree <>", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeGreaterThan(String value) {
            addCriterion("chthree >", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeGreaterThanOrEqualTo(String value) {
            addCriterion("chthree >=", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeLessThan(String value) {
            addCriterion("chthree <", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeLessThanOrEqualTo(String value) {
            addCriterion("chthree <=", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeLike(String value) {
            addCriterion("chthree like", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeNotLike(String value) {
            addCriterion("chthree not like", value, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeIn(List<String> values) {
            addCriterion("chthree in", values, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeNotIn(List<String> values) {
            addCriterion("chthree not in", values, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeBetween(String value1, String value2) {
            addCriterion("chthree between", value1, value2, "chthree");
            return (Criteria) this;
        }

        public Criteria andChthreeNotBetween(String value1, String value2) {
            addCriterion("chthree not between", value1, value2, "chthree");
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