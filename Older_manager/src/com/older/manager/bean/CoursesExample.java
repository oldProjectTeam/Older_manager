package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoursesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursesExample() {
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

        public Criteria andTeachingwayIsNull() {
            addCriterion("teachingWay is null");
            return (Criteria) this;
        }

        public Criteria andTeachingwayIsNotNull() {
            addCriterion("teachingWay is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingwayEqualTo(String value) {
            addCriterion("teachingWay =", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayNotEqualTo(String value) {
            addCriterion("teachingWay <>", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayGreaterThan(String value) {
            addCriterion("teachingWay >", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayGreaterThanOrEqualTo(String value) {
            addCriterion("teachingWay >=", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayLessThan(String value) {
            addCriterion("teachingWay <", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayLessThanOrEqualTo(String value) {
            addCriterion("teachingWay <=", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayLike(String value) {
            addCriterion("teachingWay like", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayNotLike(String value) {
            addCriterion("teachingWay not like", value, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayIn(List<String> values) {
            addCriterion("teachingWay in", values, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayNotIn(List<String> values) {
            addCriterion("teachingWay not in", values, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayBetween(String value1, String value2) {
            addCriterion("teachingWay between", value1, value2, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeachingwayNotBetween(String value1, String value2) {
            addCriterion("teachingWay not between", value1, value2, "teachingway");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andLimitnumberIsNull() {
            addCriterion("limitNumber is null");
            return (Criteria) this;
        }

        public Criteria andLimitnumberIsNotNull() {
            addCriterion("limitNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLimitnumberEqualTo(Integer value) {
            addCriterion("limitNumber =", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberNotEqualTo(Integer value) {
            addCriterion("limitNumber <>", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberGreaterThan(Integer value) {
            addCriterion("limitNumber >", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitNumber >=", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberLessThan(Integer value) {
            addCriterion("limitNumber <", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberLessThanOrEqualTo(Integer value) {
            addCriterion("limitNumber <=", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberIn(List<Integer> values) {
            addCriterion("limitNumber in", values, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberNotIn(List<Integer> values) {
            addCriterion("limitNumber not in", values, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberBetween(Integer value1, Integer value2) {
            addCriterion("limitNumber between", value1, value2, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("limitNumber not between", value1, value2, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andBytimeIsNull() {
            addCriterion("byTime is null");
            return (Criteria) this;
        }

        public Criteria andBytimeIsNotNull() {
            addCriterion("byTime is not null");
            return (Criteria) this;
        }

        public Criteria andBytimeEqualTo(Date value) {
            addCriterion("byTime =", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeNotEqualTo(Date value) {
            addCriterion("byTime <>", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeGreaterThan(Date value) {
            addCriterion("byTime >", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("byTime >=", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeLessThan(Date value) {
            addCriterion("byTime <", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeLessThanOrEqualTo(Date value) {
            addCriterion("byTime <=", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeIn(List<Date> values) {
            addCriterion("byTime in", values, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeNotIn(List<Date> values) {
            addCriterion("byTime not in", values, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeBetween(Date value1, Date value2) {
            addCriterion("byTime between", value1, value2, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeNotBetween(Date value1, Date value2) {
            addCriterion("byTime not between", value1, value2, "bytime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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

        public Criteria andCourses1IsNull() {
            addCriterion("courses1 is null");
            return (Criteria) this;
        }

        public Criteria andCourses1IsNotNull() {
            addCriterion("courses1 is not null");
            return (Criteria) this;
        }

        public Criteria andCourses1EqualTo(String value) {
            addCriterion("courses1 =", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1NotEqualTo(String value) {
            addCriterion("courses1 <>", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1GreaterThan(String value) {
            addCriterion("courses1 >", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1GreaterThanOrEqualTo(String value) {
            addCriterion("courses1 >=", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1LessThan(String value) {
            addCriterion("courses1 <", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1LessThanOrEqualTo(String value) {
            addCriterion("courses1 <=", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1Like(String value) {
            addCriterion("courses1 like", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1NotLike(String value) {
            addCriterion("courses1 not like", value, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1In(List<String> values) {
            addCriterion("courses1 in", values, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1NotIn(List<String> values) {
            addCriterion("courses1 not in", values, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1Between(String value1, String value2) {
            addCriterion("courses1 between", value1, value2, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses1NotBetween(String value1, String value2) {
            addCriterion("courses1 not between", value1, value2, "courses1");
            return (Criteria) this;
        }

        public Criteria andCourses2IsNull() {
            addCriterion("courses2 is null");
            return (Criteria) this;
        }

        public Criteria andCourses2IsNotNull() {
            addCriterion("courses2 is not null");
            return (Criteria) this;
        }

        public Criteria andCourses2EqualTo(String value) {
            addCriterion("courses2 =", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2NotEqualTo(String value) {
            addCriterion("courses2 <>", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2GreaterThan(String value) {
            addCriterion("courses2 >", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2GreaterThanOrEqualTo(String value) {
            addCriterion("courses2 >=", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2LessThan(String value) {
            addCriterion("courses2 <", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2LessThanOrEqualTo(String value) {
            addCriterion("courses2 <=", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2Like(String value) {
            addCriterion("courses2 like", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2NotLike(String value) {
            addCriterion("courses2 not like", value, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2In(List<String> values) {
            addCriterion("courses2 in", values, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2NotIn(List<String> values) {
            addCriterion("courses2 not in", values, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2Between(String value1, String value2) {
            addCriterion("courses2 between", value1, value2, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses2NotBetween(String value1, String value2) {
            addCriterion("courses2 not between", value1, value2, "courses2");
            return (Criteria) this;
        }

        public Criteria andCourses3IsNull() {
            addCriterion("courses3 is null");
            return (Criteria) this;
        }

        public Criteria andCourses3IsNotNull() {
            addCriterion("courses3 is not null");
            return (Criteria) this;
        }

        public Criteria andCourses3EqualTo(String value) {
            addCriterion("courses3 =", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3NotEqualTo(String value) {
            addCriterion("courses3 <>", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3GreaterThan(String value) {
            addCriterion("courses3 >", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3GreaterThanOrEqualTo(String value) {
            addCriterion("courses3 >=", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3LessThan(String value) {
            addCriterion("courses3 <", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3LessThanOrEqualTo(String value) {
            addCriterion("courses3 <=", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3Like(String value) {
            addCriterion("courses3 like", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3NotLike(String value) {
            addCriterion("courses3 not like", value, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3In(List<String> values) {
            addCriterion("courses3 in", values, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3NotIn(List<String> values) {
            addCriterion("courses3 not in", values, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3Between(String value1, String value2) {
            addCriterion("courses3 between", value1, value2, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses3NotBetween(String value1, String value2) {
            addCriterion("courses3 not between", value1, value2, "courses3");
            return (Criteria) this;
        }

        public Criteria andCourses4IsNull() {
            addCriterion("courses4 is null");
            return (Criteria) this;
        }

        public Criteria andCourses4IsNotNull() {
            addCriterion("courses4 is not null");
            return (Criteria) this;
        }

        public Criteria andCourses4EqualTo(String value) {
            addCriterion("courses4 =", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4NotEqualTo(String value) {
            addCriterion("courses4 <>", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4GreaterThan(String value) {
            addCriterion("courses4 >", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4GreaterThanOrEqualTo(String value) {
            addCriterion("courses4 >=", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4LessThan(String value) {
            addCriterion("courses4 <", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4LessThanOrEqualTo(String value) {
            addCriterion("courses4 <=", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4Like(String value) {
            addCriterion("courses4 like", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4NotLike(String value) {
            addCriterion("courses4 not like", value, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4In(List<String> values) {
            addCriterion("courses4 in", values, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4NotIn(List<String> values) {
            addCriterion("courses4 not in", values, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4Between(String value1, String value2) {
            addCriterion("courses4 between", value1, value2, "courses4");
            return (Criteria) this;
        }

        public Criteria andCourses4NotBetween(String value1, String value2) {
            addCriterion("courses4 not between", value1, value2, "courses4");
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