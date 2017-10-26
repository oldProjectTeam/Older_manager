package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OldmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldmanExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("marriage like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("marriage not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactIsNull() {
            addCriterion("urgencyContact is null");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactIsNotNull() {
            addCriterion("urgencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactEqualTo(String value) {
            addCriterion("urgencyContact =", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactNotEqualTo(String value) {
            addCriterion("urgencyContact <>", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactGreaterThan(String value) {
            addCriterion("urgencyContact >", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("urgencyContact >=", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactLessThan(String value) {
            addCriterion("urgencyContact <", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactLessThanOrEqualTo(String value) {
            addCriterion("urgencyContact <=", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactLike(String value) {
            addCriterion("urgencyContact like", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactNotLike(String value) {
            addCriterion("urgencyContact not like", value, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactIn(List<String> values) {
            addCriterion("urgencyContact in", values, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactNotIn(List<String> values) {
            addCriterion("urgencyContact not in", values, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactBetween(String value1, String value2) {
            addCriterion("urgencyContact between", value1, value2, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactNotBetween(String value1, String value2) {
            addCriterion("urgencyContact not between", value1, value2, "urgencycontact");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneIsNull() {
            addCriterion("urgencyContactPhone is null");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneIsNotNull() {
            addCriterion("urgencyContactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneEqualTo(String value) {
            addCriterion("urgencyContactPhone =", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneNotEqualTo(String value) {
            addCriterion("urgencyContactPhone <>", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneGreaterThan(String value) {
            addCriterion("urgencyContactPhone >", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("urgencyContactPhone >=", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneLessThan(String value) {
            addCriterion("urgencyContactPhone <", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneLessThanOrEqualTo(String value) {
            addCriterion("urgencyContactPhone <=", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneLike(String value) {
            addCriterion("urgencyContactPhone like", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneNotLike(String value) {
            addCriterion("urgencyContactPhone not like", value, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneIn(List<String> values) {
            addCriterion("urgencyContactPhone in", values, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneNotIn(List<String> values) {
            addCriterion("urgencyContactPhone not in", values, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneBetween(String value1, String value2) {
            addCriterion("urgencyContactPhone between", value1, value2, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andUrgencycontactphoneNotBetween(String value1, String value2) {
            addCriterion("urgencyContactPhone not between", value1, value2, "urgencycontactphone");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNull() {
            addCriterion("serviceType is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNotNull() {
            addCriterion("serviceType is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeEqualTo(String value) {
            addCriterion("serviceType =", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotEqualTo(String value) {
            addCriterion("serviceType <>", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThan(String value) {
            addCriterion("serviceType >", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("serviceType >=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThan(String value) {
            addCriterion("serviceType <", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThanOrEqualTo(String value) {
            addCriterion("serviceType <=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLike(String value) {
            addCriterion("serviceType like", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotLike(String value) {
            addCriterion("serviceType not like", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeIn(List<String> values) {
            addCriterion("serviceType in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotIn(List<String> values) {
            addCriterion("serviceType not in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeBetween(String value1, String value2) {
            addCriterion("serviceType between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotBetween(String value1, String value2) {
            addCriterion("serviceType not between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicestatuIsNull() {
            addCriterion("serviceStatu is null");
            return (Criteria) this;
        }

        public Criteria andServicestatuIsNotNull() {
            addCriterion("serviceStatu is not null");
            return (Criteria) this;
        }

        public Criteria andServicestatuEqualTo(String value) {
            addCriterion("serviceStatu =", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuNotEqualTo(String value) {
            addCriterion("serviceStatu <>", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuGreaterThan(String value) {
            addCriterion("serviceStatu >", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuGreaterThanOrEqualTo(String value) {
            addCriterion("serviceStatu >=", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuLessThan(String value) {
            addCriterion("serviceStatu <", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuLessThanOrEqualTo(String value) {
            addCriterion("serviceStatu <=", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuLike(String value) {
            addCriterion("serviceStatu like", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuNotLike(String value) {
            addCriterion("serviceStatu not like", value, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuIn(List<String> values) {
            addCriterion("serviceStatu in", values, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuNotIn(List<String> values) {
            addCriterion("serviceStatu not in", values, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuBetween(String value1, String value2) {
            addCriterion("serviceStatu between", value1, value2, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andServicestatuNotBetween(String value1, String value2) {
            addCriterion("serviceStatu not between", value1, value2, "servicestatu");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceIsNull() {
            addCriterion("economicSource is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceIsNotNull() {
            addCriterion("economicSource is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceEqualTo(String value) {
            addCriterion("economicSource =", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceNotEqualTo(String value) {
            addCriterion("economicSource <>", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceGreaterThan(String value) {
            addCriterion("economicSource >", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceGreaterThanOrEqualTo(String value) {
            addCriterion("economicSource >=", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceLessThan(String value) {
            addCriterion("economicSource <", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceLessThanOrEqualTo(String value) {
            addCriterion("economicSource <=", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceLike(String value) {
            addCriterion("economicSource like", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceNotLike(String value) {
            addCriterion("economicSource not like", value, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceIn(List<String> values) {
            addCriterion("economicSource in", values, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceNotIn(List<String> values) {
            addCriterion("economicSource not in", values, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceBetween(String value1, String value2) {
            addCriterion("economicSource between", value1, value2, "economicsource");
            return (Criteria) this;
        }

        public Criteria andEconomicsourceNotBetween(String value1, String value2) {
            addCriterion("economicSource not between", value1, value2, "economicsource");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNull() {
            addCriterion("monthlyIncome is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNotNull() {
            addCriterion("monthlyIncome is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeEqualTo(Double value) {
            addCriterion("monthlyIncome =", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotEqualTo(Double value) {
            addCriterion("monthlyIncome <>", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThan(Double value) {
            addCriterion("monthlyIncome >", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThanOrEqualTo(Double value) {
            addCriterion("monthlyIncome >=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThan(Double value) {
            addCriterion("monthlyIncome <", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThanOrEqualTo(Double value) {
            addCriterion("monthlyIncome <=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIn(List<Double> values) {
            addCriterion("monthlyIncome in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotIn(List<Double> values) {
            addCriterion("monthlyIncome not in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeBetween(Double value1, Double value2) {
            addCriterion("monthlyIncome between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotBetween(Double value1, Double value2) {
            addCriterion("monthlyIncome not between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andHealthcareIsNull() {
            addCriterion("healthCare is null");
            return (Criteria) this;
        }

        public Criteria andHealthcareIsNotNull() {
            addCriterion("healthCare is not null");
            return (Criteria) this;
        }

        public Criteria andHealthcareEqualTo(String value) {
            addCriterion("healthCare =", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareNotEqualTo(String value) {
            addCriterion("healthCare <>", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareGreaterThan(String value) {
            addCriterion("healthCare >", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareGreaterThanOrEqualTo(String value) {
            addCriterion("healthCare >=", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareLessThan(String value) {
            addCriterion("healthCare <", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareLessThanOrEqualTo(String value) {
            addCriterion("healthCare <=", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareLike(String value) {
            addCriterion("healthCare like", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareNotLike(String value) {
            addCriterion("healthCare not like", value, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareIn(List<String> values) {
            addCriterion("healthCare in", values, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareNotIn(List<String> values) {
            addCriterion("healthCare not in", values, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareBetween(String value1, String value2) {
            addCriterion("healthCare between", value1, value2, "healthcare");
            return (Criteria) this;
        }

        public Criteria andHealthcareNotBetween(String value1, String value2) {
            addCriterion("healthCare not between", value1, value2, "healthcare");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoIsNull() {
            addCriterion("socialSecurityNo is null");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoIsNotNull() {
            addCriterion("socialSecurityNo is not null");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoEqualTo(String value) {
            addCriterion("socialSecurityNo =", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoNotEqualTo(String value) {
            addCriterion("socialSecurityNo <>", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoGreaterThan(String value) {
            addCriterion("socialSecurityNo >", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoGreaterThanOrEqualTo(String value) {
            addCriterion("socialSecurityNo >=", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoLessThan(String value) {
            addCriterion("socialSecurityNo <", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoLessThanOrEqualTo(String value) {
            addCriterion("socialSecurityNo <=", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoLike(String value) {
            addCriterion("socialSecurityNo like", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoNotLike(String value) {
            addCriterion("socialSecurityNo not like", value, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoIn(List<String> values) {
            addCriterion("socialSecurityNo in", values, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoNotIn(List<String> values) {
            addCriterion("socialSecurityNo not in", values, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoBetween(String value1, String value2) {
            addCriterion("socialSecurityNo between", value1, value2, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynoNotBetween(String value1, String value2) {
            addCriterion("socialSecurityNo not between", value1, value2, "socialsecurityno");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesIsNull() {
            addCriterion("chronicDiseases is null");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesIsNotNull() {
            addCriterion("chronicDiseases is not null");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesEqualTo(String value) {
            addCriterion("chronicDiseases =", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesNotEqualTo(String value) {
            addCriterion("chronicDiseases <>", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesGreaterThan(String value) {
            addCriterion("chronicDiseases >", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesGreaterThanOrEqualTo(String value) {
            addCriterion("chronicDiseases >=", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesLessThan(String value) {
            addCriterion("chronicDiseases <", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesLessThanOrEqualTo(String value) {
            addCriterion("chronicDiseases <=", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesLike(String value) {
            addCriterion("chronicDiseases like", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesNotLike(String value) {
            addCriterion("chronicDiseases not like", value, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesIn(List<String> values) {
            addCriterion("chronicDiseases in", values, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesNotIn(List<String> values) {
            addCriterion("chronicDiseases not in", values, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesBetween(String value1, String value2) {
            addCriterion("chronicDiseases between", value1, value2, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andChronicdiseasesNotBetween(String value1, String value2) {
            addCriterion("chronicDiseases not between", value1, value2, "chronicdiseases");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNull() {
            addCriterion("bloodType is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNotNull() {
            addCriterion("bloodType is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeEqualTo(String value) {
            addCriterion("bloodType =", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotEqualTo(String value) {
            addCriterion("bloodType <>", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThan(String value) {
            addCriterion("bloodType >", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bloodType >=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThan(String value) {
            addCriterion("bloodType <", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThanOrEqualTo(String value) {
            addCriterion("bloodType <=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLike(String value) {
            addCriterion("bloodType like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotLike(String value) {
            addCriterion("bloodType not like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIn(List<String> values) {
            addCriterion("bloodType in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotIn(List<String> values) {
            addCriterion("bloodType not in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeBetween(String value1, String value2) {
            addCriterion("bloodType between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotBetween(String value1, String value2) {
            addCriterion("bloodType not between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationIsNull() {
            addCriterion("disabilitySituation is null");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationIsNotNull() {
            addCriterion("disabilitySituation is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationEqualTo(String value) {
            addCriterion("disabilitySituation =", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationNotEqualTo(String value) {
            addCriterion("disabilitySituation <>", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationGreaterThan(String value) {
            addCriterion("disabilitySituation >", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationGreaterThanOrEqualTo(String value) {
            addCriterion("disabilitySituation >=", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationLessThan(String value) {
            addCriterion("disabilitySituation <", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationLessThanOrEqualTo(String value) {
            addCriterion("disabilitySituation <=", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationLike(String value) {
            addCriterion("disabilitySituation like", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationNotLike(String value) {
            addCriterion("disabilitySituation not like", value, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationIn(List<String> values) {
            addCriterion("disabilitySituation in", values, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationNotIn(List<String> values) {
            addCriterion("disabilitySituation not in", values, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationBetween(String value1, String value2) {
            addCriterion("disabilitySituation between", value1, value2, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilitysituationNotBetween(String value1, String value2) {
            addCriterion("disabilitySituation not between", value1, value2, "disabilitysituation");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNull() {
            addCriterion("disability is null");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNotNull() {
            addCriterion("disability is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilityEqualTo(String value) {
            addCriterion("disability =", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotEqualTo(String value) {
            addCriterion("disability <>", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThan(String value) {
            addCriterion("disability >", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThanOrEqualTo(String value) {
            addCriterion("disability >=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThan(String value) {
            addCriterion("disability <", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThanOrEqualTo(String value) {
            addCriterion("disability <=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLike(String value) {
            addCriterion("disability like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotLike(String value) {
            addCriterion("disability not like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityIn(List<String> values) {
            addCriterion("disability in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotIn(List<String> values) {
            addCriterion("disability not in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityBetween(String value1, String value2) {
            addCriterion("disability between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotBetween(String value1, String value2) {
            addCriterion("disability not between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIsNull() {
            addCriterion("educationLevel is null");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIsNotNull() {
            addCriterion("educationLevel is not null");
            return (Criteria) this;
        }

        public Criteria andEducationlevelEqualTo(String value) {
            addCriterion("educationLevel =", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotEqualTo(String value) {
            addCriterion("educationLevel <>", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelGreaterThan(String value) {
            addCriterion("educationLevel >", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelGreaterThanOrEqualTo(String value) {
            addCriterion("educationLevel >=", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLessThan(String value) {
            addCriterion("educationLevel <", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLessThanOrEqualTo(String value) {
            addCriterion("educationLevel <=", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLike(String value) {
            addCriterion("educationLevel like", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotLike(String value) {
            addCriterion("educationLevel not like", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIn(List<String> values) {
            addCriterion("educationLevel in", values, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotIn(List<String> values) {
            addCriterion("educationLevel not in", values, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelBetween(String value1, String value2) {
            addCriterion("educationLevel between", value1, value2, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotBetween(String value1, String value2) {
            addCriterion("educationLevel not between", value1, value2, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andMajorsIsNull() {
            addCriterion("majors is null");
            return (Criteria) this;
        }

        public Criteria andMajorsIsNotNull() {
            addCriterion("majors is not null");
            return (Criteria) this;
        }

        public Criteria andMajorsEqualTo(String value) {
            addCriterion("majors =", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotEqualTo(String value) {
            addCriterion("majors <>", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsGreaterThan(String value) {
            addCriterion("majors >", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsGreaterThanOrEqualTo(String value) {
            addCriterion("majors >=", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsLessThan(String value) {
            addCriterion("majors <", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsLessThanOrEqualTo(String value) {
            addCriterion("majors <=", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsLike(String value) {
            addCriterion("majors like", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotLike(String value) {
            addCriterion("majors not like", value, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsIn(List<String> values) {
            addCriterion("majors in", values, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotIn(List<String> values) {
            addCriterion("majors not in", values, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsBetween(String value1, String value2) {
            addCriterion("majors between", value1, value2, "majors");
            return (Criteria) this;
        }

        public Criteria andMajorsNotBetween(String value1, String value2) {
            addCriterion("majors not between", value1, value2, "majors");
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

        public Criteria andUnitorignalIsNull() {
            addCriterion("unitOrignal is null");
            return (Criteria) this;
        }

        public Criteria andUnitorignalIsNotNull() {
            addCriterion("unitOrignal is not null");
            return (Criteria) this;
        }

        public Criteria andUnitorignalEqualTo(String value) {
            addCriterion("unitOrignal =", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalNotEqualTo(String value) {
            addCriterion("unitOrignal <>", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalGreaterThan(String value) {
            addCriterion("unitOrignal >", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalGreaterThanOrEqualTo(String value) {
            addCriterion("unitOrignal >=", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalLessThan(String value) {
            addCriterion("unitOrignal <", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalLessThanOrEqualTo(String value) {
            addCriterion("unitOrignal <=", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalLike(String value) {
            addCriterion("unitOrignal like", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalNotLike(String value) {
            addCriterion("unitOrignal not like", value, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalIn(List<String> values) {
            addCriterion("unitOrignal in", values, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalNotIn(List<String> values) {
            addCriterion("unitOrignal not in", values, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalBetween(String value1, String value2) {
            addCriterion("unitOrignal between", value1, value2, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andUnitorignalNotBetween(String value1, String value2) {
            addCriterion("unitOrignal not between", value1, value2, "unitorignal");
            return (Criteria) this;
        }

        public Criteria andIdcarIsNull() {
            addCriterion("idcar is null");
            return (Criteria) this;
        }

        public Criteria andIdcarIsNotNull() {
            addCriterion("idcar is not null");
            return (Criteria) this;
        }

        public Criteria andIdcarEqualTo(String value) {
            addCriterion("idcar =", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarNotEqualTo(String value) {
            addCriterion("idcar <>", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarGreaterThan(String value) {
            addCriterion("idcar >", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarGreaterThanOrEqualTo(String value) {
            addCriterion("idcar >=", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarLessThan(String value) {
            addCriterion("idcar <", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarLessThanOrEqualTo(String value) {
            addCriterion("idcar <=", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarLike(String value) {
            addCriterion("idcar like", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarNotLike(String value) {
            addCriterion("idcar not like", value, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarIn(List<String> values) {
            addCriterion("idcar in", values, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarNotIn(List<String> values) {
            addCriterion("idcar not in", values, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarBetween(String value1, String value2) {
            addCriterion("idcar between", value1, value2, "idcar");
            return (Criteria) this;
        }

        public Criteria andIdcarNotBetween(String value1, String value2) {
            addCriterion("idcar not between", value1, value2, "idcar");
            return (Criteria) this;
        }

        public Criteria andLiveinfoIsNull() {
            addCriterion("liveinfo is null");
            return (Criteria) this;
        }

        public Criteria andLiveinfoIsNotNull() {
            addCriterion("liveinfo is not null");
            return (Criteria) this;
        }

        public Criteria andLiveinfoEqualTo(String value) {
            addCriterion("liveinfo =", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoNotEqualTo(String value) {
            addCriterion("liveinfo <>", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoGreaterThan(String value) {
            addCriterion("liveinfo >", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoGreaterThanOrEqualTo(String value) {
            addCriterion("liveinfo >=", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoLessThan(String value) {
            addCriterion("liveinfo <", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoLessThanOrEqualTo(String value) {
            addCriterion("liveinfo <=", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoLike(String value) {
            addCriterion("liveinfo like", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoNotLike(String value) {
            addCriterion("liveinfo not like", value, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoIn(List<String> values) {
            addCriterion("liveinfo in", values, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoNotIn(List<String> values) {
            addCriterion("liveinfo not in", values, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoBetween(String value1, String value2) {
            addCriterion("liveinfo between", value1, value2, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andLiveinfoNotBetween(String value1, String value2) {
            addCriterion("liveinfo not between", value1, value2, "liveinfo");
            return (Criteria) this;
        }

        public Criteria andNumoneIsNull() {
            addCriterion("numone is null");
            return (Criteria) this;
        }

        public Criteria andNumoneIsNotNull() {
            addCriterion("numone is not null");
            return (Criteria) this;
        }

        public Criteria andNumoneEqualTo(String value) {
            addCriterion("numone =", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotEqualTo(String value) {
            addCriterion("numone <>", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneGreaterThan(String value) {
            addCriterion("numone >", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneGreaterThanOrEqualTo(String value) {
            addCriterion("numone >=", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneLessThan(String value) {
            addCriterion("numone <", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneLessThanOrEqualTo(String value) {
            addCriterion("numone <=", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneLike(String value) {
            addCriterion("numone like", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotLike(String value) {
            addCriterion("numone not like", value, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneIn(List<String> values) {
            addCriterion("numone in", values, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotIn(List<String> values) {
            addCriterion("numone not in", values, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneBetween(String value1, String value2) {
            addCriterion("numone between", value1, value2, "numone");
            return (Criteria) this;
        }

        public Criteria andNumoneNotBetween(String value1, String value2) {
            addCriterion("numone not between", value1, value2, "numone");
            return (Criteria) this;
        }

        public Criteria andNumtwoIsNull() {
            addCriterion("numtwo is null");
            return (Criteria) this;
        }

        public Criteria andNumtwoIsNotNull() {
            addCriterion("numtwo is not null");
            return (Criteria) this;
        }

        public Criteria andNumtwoEqualTo(String value) {
            addCriterion("numtwo =", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotEqualTo(String value) {
            addCriterion("numtwo <>", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoGreaterThan(String value) {
            addCriterion("numtwo >", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoGreaterThanOrEqualTo(String value) {
            addCriterion("numtwo >=", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoLessThan(String value) {
            addCriterion("numtwo <", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoLessThanOrEqualTo(String value) {
            addCriterion("numtwo <=", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoLike(String value) {
            addCriterion("numtwo like", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotLike(String value) {
            addCriterion("numtwo not like", value, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoIn(List<String> values) {
            addCriterion("numtwo in", values, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotIn(List<String> values) {
            addCriterion("numtwo not in", values, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoBetween(String value1, String value2) {
            addCriterion("numtwo between", value1, value2, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumtwoNotBetween(String value1, String value2) {
            addCriterion("numtwo not between", value1, value2, "numtwo");
            return (Criteria) this;
        }

        public Criteria andNumthreeIsNull() {
            addCriterion("numthree is null");
            return (Criteria) this;
        }

        public Criteria andNumthreeIsNotNull() {
            addCriterion("numthree is not null");
            return (Criteria) this;
        }

        public Criteria andNumthreeEqualTo(String value) {
            addCriterion("numthree =", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotEqualTo(String value) {
            addCriterion("numthree <>", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeGreaterThan(String value) {
            addCriterion("numthree >", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeGreaterThanOrEqualTo(String value) {
            addCriterion("numthree >=", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeLessThan(String value) {
            addCriterion("numthree <", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeLessThanOrEqualTo(String value) {
            addCriterion("numthree <=", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeLike(String value) {
            addCriterion("numthree like", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotLike(String value) {
            addCriterion("numthree not like", value, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeIn(List<String> values) {
            addCriterion("numthree in", values, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotIn(List<String> values) {
            addCriterion("numthree not in", values, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeBetween(String value1, String value2) {
            addCriterion("numthree between", value1, value2, "numthree");
            return (Criteria) this;
        }

        public Criteria andNumthreeNotBetween(String value1, String value2) {
            addCriterion("numthree not between", value1, value2, "numthree");
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