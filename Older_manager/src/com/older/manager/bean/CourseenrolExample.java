package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseenrolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseenrolExample() {
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

        public Criteria andEnroltimeIsNull() {
            addCriterion("enrolTime is null");
            return (Criteria) this;
        }

        public Criteria andEnroltimeIsNotNull() {
            addCriterion("enrolTime is not null");
            return (Criteria) this;
        }

        public Criteria andEnroltimeEqualTo(Date value) {
            addCriterion("enrolTime =", value, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeNotEqualTo(Date value) {
            addCriterion("enrolTime <>", value, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeGreaterThan(Date value) {
            addCriterion("enrolTime >", value, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enrolTime >=", value, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeLessThan(Date value) {
            addCriterion("enrolTime <", value, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeLessThanOrEqualTo(Date value) {
            addCriterion("enrolTime <=", value, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeIn(List<Date> values) {
            addCriterion("enrolTime in", values, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeNotIn(List<Date> values) {
            addCriterion("enrolTime not in", values, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeBetween(Date value1, Date value2) {
            addCriterion("enrolTime between", value1, value2, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnroltimeNotBetween(Date value1, Date value2) {
            addCriterion("enrolTime not between", value1, value2, "enroltime");
            return (Criteria) this;
        }

        public Criteria andEnrolstateIsNull() {
            addCriterion("enrolState is null");
            return (Criteria) this;
        }

        public Criteria andEnrolstateIsNotNull() {
            addCriterion("enrolState is not null");
            return (Criteria) this;
        }

        public Criteria andEnrolstateEqualTo(String value) {
            addCriterion("enrolState =", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateNotEqualTo(String value) {
            addCriterion("enrolState <>", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateGreaterThan(String value) {
            addCriterion("enrolState >", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateGreaterThanOrEqualTo(String value) {
            addCriterion("enrolState >=", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateLessThan(String value) {
            addCriterion("enrolState <", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateLessThanOrEqualTo(String value) {
            addCriterion("enrolState <=", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateLike(String value) {
            addCriterion("enrolState like", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateNotLike(String value) {
            addCriterion("enrolState not like", value, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateIn(List<String> values) {
            addCriterion("enrolState in", values, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateNotIn(List<String> values) {
            addCriterion("enrolState not in", values, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateBetween(String value1, String value2) {
            addCriterion("enrolState between", value1, value2, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andEnrolstateNotBetween(String value1, String value2) {
            addCriterion("enrolState not between", value1, value2, "enrolstate");
            return (Criteria) this;
        }

        public Criteria andOldmamIdIsNull() {
            addCriterion("oldMam_id is null");
            return (Criteria) this;
        }

        public Criteria andOldmamIdIsNotNull() {
            addCriterion("oldMam_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldmamIdEqualTo(Integer value) {
            addCriterion("oldMam_id =", value, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdNotEqualTo(Integer value) {
            addCriterion("oldMam_id <>", value, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdGreaterThan(Integer value) {
            addCriterion("oldMam_id >", value, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldMam_id >=", value, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdLessThan(Integer value) {
            addCriterion("oldMam_id <", value, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldMam_id <=", value, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdIn(List<Integer> values) {
            addCriterion("oldMam_id in", values, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdNotIn(List<Integer> values) {
            addCriterion("oldMam_id not in", values, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdBetween(Integer value1, Integer value2) {
            addCriterion("oldMam_id between", value1, value2, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andOldmamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldMam_id not between", value1, value2, "oldmamId");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionIsNull() {
            addCriterion("courseCompletion is null");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionIsNotNull() {
            addCriterion("courseCompletion is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionEqualTo(String value) {
            addCriterion("courseCompletion =", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionNotEqualTo(String value) {
            addCriterion("courseCompletion <>", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionGreaterThan(String value) {
            addCriterion("courseCompletion >", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionGreaterThanOrEqualTo(String value) {
            addCriterion("courseCompletion >=", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionLessThan(String value) {
            addCriterion("courseCompletion <", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionLessThanOrEqualTo(String value) {
            addCriterion("courseCompletion <=", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionLike(String value) {
            addCriterion("courseCompletion like", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionNotLike(String value) {
            addCriterion("courseCompletion not like", value, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionIn(List<String> values) {
            addCriterion("courseCompletion in", values, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionNotIn(List<String> values) {
            addCriterion("courseCompletion not in", values, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionBetween(String value1, String value2) {
            addCriterion("courseCompletion between", value1, value2, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andCoursecompletionNotBetween(String value1, String value2) {
            addCriterion("courseCompletion not between", value1, value2, "coursecompletion");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Double value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Double value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Double value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Double value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Double value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Double> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Double> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Double value1, Double value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Double value1, Double value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(String value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(String value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(String value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(String value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(String value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(String value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLike(String value) {
            addCriterion("rating like", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotLike(String value) {
            addCriterion("rating not like", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<String> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<String> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(String value1, String value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(String value1, String value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassIsNull() {
            addCriterion("isNormalClass is null");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassIsNotNull() {
            addCriterion("isNormalClass is not null");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassEqualTo(String value) {
            addCriterion("isNormalClass =", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassNotEqualTo(String value) {
            addCriterion("isNormalClass <>", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassGreaterThan(String value) {
            addCriterion("isNormalClass >", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassGreaterThanOrEqualTo(String value) {
            addCriterion("isNormalClass >=", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassLessThan(String value) {
            addCriterion("isNormalClass <", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassLessThanOrEqualTo(String value) {
            addCriterion("isNormalClass <=", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassLike(String value) {
            addCriterion("isNormalClass like", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassNotLike(String value) {
            addCriterion("isNormalClass not like", value, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassIn(List<String> values) {
            addCriterion("isNormalClass in", values, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassNotIn(List<String> values) {
            addCriterion("isNormalClass not in", values, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassBetween(String value1, String value2) {
            addCriterion("isNormalClass between", value1, value2, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andIsnormalclassNotBetween(String value1, String value2) {
            addCriterion("isNormalClass not between", value1, value2, "isnormalclass");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1IsNull() {
            addCriterion("courseEnrol1 is null");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1IsNotNull() {
            addCriterion("courseEnrol1 is not null");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1EqualTo(String value) {
            addCriterion("courseEnrol1 =", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1NotEqualTo(String value) {
            addCriterion("courseEnrol1 <>", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1GreaterThan(String value) {
            addCriterion("courseEnrol1 >", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1GreaterThanOrEqualTo(String value) {
            addCriterion("courseEnrol1 >=", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1LessThan(String value) {
            addCriterion("courseEnrol1 <", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1LessThanOrEqualTo(String value) {
            addCriterion("courseEnrol1 <=", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1Like(String value) {
            addCriterion("courseEnrol1 like", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1NotLike(String value) {
            addCriterion("courseEnrol1 not like", value, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1In(List<String> values) {
            addCriterion("courseEnrol1 in", values, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1NotIn(List<String> values) {
            addCriterion("courseEnrol1 not in", values, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1Between(String value1, String value2) {
            addCriterion("courseEnrol1 between", value1, value2, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol1NotBetween(String value1, String value2) {
            addCriterion("courseEnrol1 not between", value1, value2, "courseenrol1");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2IsNull() {
            addCriterion("courseEnrol2 is null");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2IsNotNull() {
            addCriterion("courseEnrol2 is not null");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2EqualTo(String value) {
            addCriterion("courseEnrol2 =", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2NotEqualTo(String value) {
            addCriterion("courseEnrol2 <>", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2GreaterThan(String value) {
            addCriterion("courseEnrol2 >", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2GreaterThanOrEqualTo(String value) {
            addCriterion("courseEnrol2 >=", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2LessThan(String value) {
            addCriterion("courseEnrol2 <", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2LessThanOrEqualTo(String value) {
            addCriterion("courseEnrol2 <=", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2Like(String value) {
            addCriterion("courseEnrol2 like", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2NotLike(String value) {
            addCriterion("courseEnrol2 not like", value, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2In(List<String> values) {
            addCriterion("courseEnrol2 in", values, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2NotIn(List<String> values) {
            addCriterion("courseEnrol2 not in", values, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2Between(String value1, String value2) {
            addCriterion("courseEnrol2 between", value1, value2, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol2NotBetween(String value1, String value2) {
            addCriterion("courseEnrol2 not between", value1, value2, "courseenrol2");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3IsNull() {
            addCriterion("courseEnrol3 is null");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3IsNotNull() {
            addCriterion("courseEnrol3 is not null");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3EqualTo(String value) {
            addCriterion("courseEnrol3 =", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3NotEqualTo(String value) {
            addCriterion("courseEnrol3 <>", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3GreaterThan(String value) {
            addCriterion("courseEnrol3 >", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3GreaterThanOrEqualTo(String value) {
            addCriterion("courseEnrol3 >=", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3LessThan(String value) {
            addCriterion("courseEnrol3 <", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3LessThanOrEqualTo(String value) {
            addCriterion("courseEnrol3 <=", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3Like(String value) {
            addCriterion("courseEnrol3 like", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3NotLike(String value) {
            addCriterion("courseEnrol3 not like", value, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3In(List<String> values) {
            addCriterion("courseEnrol3 in", values, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3NotIn(List<String> values) {
            addCriterion("courseEnrol3 not in", values, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3Between(String value1, String value2) {
            addCriterion("courseEnrol3 between", value1, value2, "courseenrol3");
            return (Criteria) this;
        }

        public Criteria andCourseenrol3NotBetween(String value1, String value2) {
            addCriterion("courseEnrol3 not between", value1, value2, "courseenrol3");
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