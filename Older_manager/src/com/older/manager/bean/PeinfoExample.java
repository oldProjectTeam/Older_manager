package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeinfoExample() {
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

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andPetimeIsNull() {
            addCriterion("peTime is null");
            return (Criteria) this;
        }

        public Criteria andPetimeIsNotNull() {
            addCriterion("peTime is not null");
            return (Criteria) this;
        }

        public Criteria andPetimeEqualTo(Date value) {
            addCriterion("peTime =", value, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeNotEqualTo(Date value) {
            addCriterion("peTime <>", value, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeGreaterThan(Date value) {
            addCriterion("peTime >", value, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("peTime >=", value, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeLessThan(Date value) {
            addCriterion("peTime <", value, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeLessThanOrEqualTo(Date value) {
            addCriterion("peTime <=", value, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeIn(List<Date> values) {
            addCriterion("peTime in", values, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeNotIn(List<Date> values) {
            addCriterion("peTime not in", values, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeBetween(Date value1, Date value2) {
            addCriterion("peTime between", value1, value2, "petime");
            return (Criteria) this;
        }

        public Criteria andPetimeNotBetween(Date value1, Date value2) {
            addCriterion("peTime not between", value1, value2, "petime");
            return (Criteria) this;
        }

        public Criteria andNexttimeIsNull() {
            addCriterion("nextTime is null");
            return (Criteria) this;
        }

        public Criteria andNexttimeIsNotNull() {
            addCriterion("nextTime is not null");
            return (Criteria) this;
        }

        public Criteria andNexttimeEqualTo(Date value) {
            addCriterion("nextTime =", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotEqualTo(Date value) {
            addCriterion("nextTime <>", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeGreaterThan(Date value) {
            addCriterion("nextTime >", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nextTime >=", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLessThan(Date value) {
            addCriterion("nextTime <", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeLessThanOrEqualTo(Date value) {
            addCriterion("nextTime <=", value, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeIn(List<Date> values) {
            addCriterion("nextTime in", values, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotIn(List<Date> values) {
            addCriterion("nextTime not in", values, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeBetween(Date value1, Date value2) {
            addCriterion("nextTime between", value1, value2, "nexttime");
            return (Criteria) this;
        }

        public Criteria andNexttimeNotBetween(Date value1, Date value2) {
            addCriterion("nextTime not between", value1, value2, "nexttime");
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

        public Criteria andOldmanIdIsNull() {
            addCriterion("oldMan_id is null");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIsNotNull() {
            addCriterion("oldMan_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanIdEqualTo(Integer value) {
            addCriterion("oldMan_id =", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotEqualTo(Integer value) {
            addCriterion("oldMan_id <>", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThan(Integer value) {
            addCriterion("oldMan_id >", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldMan_id >=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThan(Integer value) {
            addCriterion("oldMan_id <", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldMan_id <=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIn(List<Integer> values) {
            addCriterion("oldMan_id in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotIn(List<Integer> values) {
            addCriterion("oldMan_id not in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdBetween(Integer value1, Integer value2) {
            addCriterion("oldMan_id between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldMan_id not between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andPeinfo1IsNull() {
            addCriterion("PEInfo1 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo1IsNotNull() {
            addCriterion("PEInfo1 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo1EqualTo(String value) {
            addCriterion("PEInfo1 =", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1NotEqualTo(String value) {
            addCriterion("PEInfo1 <>", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1GreaterThan(String value) {
            addCriterion("PEInfo1 >", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo1 >=", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1LessThan(String value) {
            addCriterion("PEInfo1 <", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1LessThanOrEqualTo(String value) {
            addCriterion("PEInfo1 <=", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1Like(String value) {
            addCriterion("PEInfo1 like", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1NotLike(String value) {
            addCriterion("PEInfo1 not like", value, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1In(List<String> values) {
            addCriterion("PEInfo1 in", values, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1NotIn(List<String> values) {
            addCriterion("PEInfo1 not in", values, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1Between(String value1, String value2) {
            addCriterion("PEInfo1 between", value1, value2, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo1NotBetween(String value1, String value2) {
            addCriterion("PEInfo1 not between", value1, value2, "peinfo1");
            return (Criteria) this;
        }

        public Criteria andPeinfo2IsNull() {
            addCriterion("PEInfo2 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo2IsNotNull() {
            addCriterion("PEInfo2 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo2EqualTo(String value) {
            addCriterion("PEInfo2 =", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2NotEqualTo(String value) {
            addCriterion("PEInfo2 <>", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2GreaterThan(String value) {
            addCriterion("PEInfo2 >", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo2 >=", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2LessThan(String value) {
            addCriterion("PEInfo2 <", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2LessThanOrEqualTo(String value) {
            addCriterion("PEInfo2 <=", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2Like(String value) {
            addCriterion("PEInfo2 like", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2NotLike(String value) {
            addCriterion("PEInfo2 not like", value, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2In(List<String> values) {
            addCriterion("PEInfo2 in", values, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2NotIn(List<String> values) {
            addCriterion("PEInfo2 not in", values, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2Between(String value1, String value2) {
            addCriterion("PEInfo2 between", value1, value2, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo2NotBetween(String value1, String value2) {
            addCriterion("PEInfo2 not between", value1, value2, "peinfo2");
            return (Criteria) this;
        }

        public Criteria andPeinfo3IsNull() {
            addCriterion("PEInfo3 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo3IsNotNull() {
            addCriterion("PEInfo3 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo3EqualTo(String value) {
            addCriterion("PEInfo3 =", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3NotEqualTo(String value) {
            addCriterion("PEInfo3 <>", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3GreaterThan(String value) {
            addCriterion("PEInfo3 >", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo3 >=", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3LessThan(String value) {
            addCriterion("PEInfo3 <", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3LessThanOrEqualTo(String value) {
            addCriterion("PEInfo3 <=", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3Like(String value) {
            addCriterion("PEInfo3 like", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3NotLike(String value) {
            addCriterion("PEInfo3 not like", value, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3In(List<String> values) {
            addCriterion("PEInfo3 in", values, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3NotIn(List<String> values) {
            addCriterion("PEInfo3 not in", values, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3Between(String value1, String value2) {
            addCriterion("PEInfo3 between", value1, value2, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo3NotBetween(String value1, String value2) {
            addCriterion("PEInfo3 not between", value1, value2, "peinfo3");
            return (Criteria) this;
        }

        public Criteria andPeinfo4IsNull() {
            addCriterion("PEInfo4 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo4IsNotNull() {
            addCriterion("PEInfo4 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo4EqualTo(String value) {
            addCriterion("PEInfo4 =", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4NotEqualTo(String value) {
            addCriterion("PEInfo4 <>", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4GreaterThan(String value) {
            addCriterion("PEInfo4 >", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo4 >=", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4LessThan(String value) {
            addCriterion("PEInfo4 <", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4LessThanOrEqualTo(String value) {
            addCriterion("PEInfo4 <=", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4Like(String value) {
            addCriterion("PEInfo4 like", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4NotLike(String value) {
            addCriterion("PEInfo4 not like", value, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4In(List<String> values) {
            addCriterion("PEInfo4 in", values, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4NotIn(List<String> values) {
            addCriterion("PEInfo4 not in", values, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4Between(String value1, String value2) {
            addCriterion("PEInfo4 between", value1, value2, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo4NotBetween(String value1, String value2) {
            addCriterion("PEInfo4 not between", value1, value2, "peinfo4");
            return (Criteria) this;
        }

        public Criteria andPeinfo5IsNull() {
            addCriterion("PEInfo5 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo5IsNotNull() {
            addCriterion("PEInfo5 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo5EqualTo(String value) {
            addCriterion("PEInfo5 =", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5NotEqualTo(String value) {
            addCriterion("PEInfo5 <>", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5GreaterThan(String value) {
            addCriterion("PEInfo5 >", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo5 >=", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5LessThan(String value) {
            addCriterion("PEInfo5 <", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5LessThanOrEqualTo(String value) {
            addCriterion("PEInfo5 <=", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5Like(String value) {
            addCriterion("PEInfo5 like", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5NotLike(String value) {
            addCriterion("PEInfo5 not like", value, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5In(List<String> values) {
            addCriterion("PEInfo5 in", values, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5NotIn(List<String> values) {
            addCriterion("PEInfo5 not in", values, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5Between(String value1, String value2) {
            addCriterion("PEInfo5 between", value1, value2, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo5NotBetween(String value1, String value2) {
            addCriterion("PEInfo5 not between", value1, value2, "peinfo5");
            return (Criteria) this;
        }

        public Criteria andPeinfo6IsNull() {
            addCriterion("PEInfo6 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo6IsNotNull() {
            addCriterion("PEInfo6 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo6EqualTo(String value) {
            addCriterion("PEInfo6 =", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6NotEqualTo(String value) {
            addCriterion("PEInfo6 <>", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6GreaterThan(String value) {
            addCriterion("PEInfo6 >", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo6 >=", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6LessThan(String value) {
            addCriterion("PEInfo6 <", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6LessThanOrEqualTo(String value) {
            addCriterion("PEInfo6 <=", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6Like(String value) {
            addCriterion("PEInfo6 like", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6NotLike(String value) {
            addCriterion("PEInfo6 not like", value, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6In(List<String> values) {
            addCriterion("PEInfo6 in", values, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6NotIn(List<String> values) {
            addCriterion("PEInfo6 not in", values, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6Between(String value1, String value2) {
            addCriterion("PEInfo6 between", value1, value2, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo6NotBetween(String value1, String value2) {
            addCriterion("PEInfo6 not between", value1, value2, "peinfo6");
            return (Criteria) this;
        }

        public Criteria andPeinfo7IsNull() {
            addCriterion("PEInfo7 is null");
            return (Criteria) this;
        }

        public Criteria andPeinfo7IsNotNull() {
            addCriterion("PEInfo7 is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfo7EqualTo(String value) {
            addCriterion("PEInfo7 =", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7NotEqualTo(String value) {
            addCriterion("PEInfo7 <>", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7GreaterThan(String value) {
            addCriterion("PEInfo7 >", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7GreaterThanOrEqualTo(String value) {
            addCriterion("PEInfo7 >=", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7LessThan(String value) {
            addCriterion("PEInfo7 <", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7LessThanOrEqualTo(String value) {
            addCriterion("PEInfo7 <=", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7Like(String value) {
            addCriterion("PEInfo7 like", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7NotLike(String value) {
            addCriterion("PEInfo7 not like", value, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7In(List<String> values) {
            addCriterion("PEInfo7 in", values, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7NotIn(List<String> values) {
            addCriterion("PEInfo7 not in", values, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7Between(String value1, String value2) {
            addCriterion("PEInfo7 between", value1, value2, "peinfo7");
            return (Criteria) this;
        }

        public Criteria andPeinfo7NotBetween(String value1, String value2) {
            addCriterion("PEInfo7 not between", value1, value2, "peinfo7");
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