package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleIsNull() {
            addCriterion("releasePeople is null");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleIsNotNull() {
            addCriterion("releasePeople is not null");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleEqualTo(String value) {
            addCriterion("releasePeople =", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleNotEqualTo(String value) {
            addCriterion("releasePeople <>", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleGreaterThan(String value) {
            addCriterion("releasePeople >", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("releasePeople >=", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleLessThan(String value) {
            addCriterion("releasePeople <", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleLessThanOrEqualTo(String value) {
            addCriterion("releasePeople <=", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleLike(String value) {
            addCriterion("releasePeople like", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleNotLike(String value) {
            addCriterion("releasePeople not like", value, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleIn(List<String> values) {
            addCriterion("releasePeople in", values, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleNotIn(List<String> values) {
            addCriterion("releasePeople not in", values, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleBetween(String value1, String value2) {
            addCriterion("releasePeople between", value1, value2, "releasepeople");
            return (Criteria) this;
        }

        public Criteria andReleasepeopleNotBetween(String value1, String value2) {
            addCriterion("releasePeople not between", value1, value2, "releasepeople");
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

        public Criteria andNotice1IsNull() {
            addCriterion("notice1 is null");
            return (Criteria) this;
        }

        public Criteria andNotice1IsNotNull() {
            addCriterion("notice1 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice1EqualTo(String value) {
            addCriterion("notice1 =", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1NotEqualTo(String value) {
            addCriterion("notice1 <>", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1GreaterThan(String value) {
            addCriterion("notice1 >", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1GreaterThanOrEqualTo(String value) {
            addCriterion("notice1 >=", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1LessThan(String value) {
            addCriterion("notice1 <", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1LessThanOrEqualTo(String value) {
            addCriterion("notice1 <=", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1Like(String value) {
            addCriterion("notice1 like", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1NotLike(String value) {
            addCriterion("notice1 not like", value, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1In(List<String> values) {
            addCriterion("notice1 in", values, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1NotIn(List<String> values) {
            addCriterion("notice1 not in", values, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1Between(String value1, String value2) {
            addCriterion("notice1 between", value1, value2, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice1NotBetween(String value1, String value2) {
            addCriterion("notice1 not between", value1, value2, "notice1");
            return (Criteria) this;
        }

        public Criteria andNotice2IsNull() {
            addCriterion("notice2 is null");
            return (Criteria) this;
        }

        public Criteria andNotice2IsNotNull() {
            addCriterion("notice2 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice2EqualTo(String value) {
            addCriterion("notice2 =", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2NotEqualTo(String value) {
            addCriterion("notice2 <>", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2GreaterThan(String value) {
            addCriterion("notice2 >", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2GreaterThanOrEqualTo(String value) {
            addCriterion("notice2 >=", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2LessThan(String value) {
            addCriterion("notice2 <", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2LessThanOrEqualTo(String value) {
            addCriterion("notice2 <=", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2Like(String value) {
            addCriterion("notice2 like", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2NotLike(String value) {
            addCriterion("notice2 not like", value, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2In(List<String> values) {
            addCriterion("notice2 in", values, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2NotIn(List<String> values) {
            addCriterion("notice2 not in", values, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2Between(String value1, String value2) {
            addCriterion("notice2 between", value1, value2, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice2NotBetween(String value1, String value2) {
            addCriterion("notice2 not between", value1, value2, "notice2");
            return (Criteria) this;
        }

        public Criteria andNotice3IsNull() {
            addCriterion("notice3 is null");
            return (Criteria) this;
        }

        public Criteria andNotice3IsNotNull() {
            addCriterion("notice3 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice3EqualTo(String value) {
            addCriterion("notice3 =", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3NotEqualTo(String value) {
            addCriterion("notice3 <>", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3GreaterThan(String value) {
            addCriterion("notice3 >", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3GreaterThanOrEqualTo(String value) {
            addCriterion("notice3 >=", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3LessThan(String value) {
            addCriterion("notice3 <", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3LessThanOrEqualTo(String value) {
            addCriterion("notice3 <=", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3Like(String value) {
            addCriterion("notice3 like", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3NotLike(String value) {
            addCriterion("notice3 not like", value, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3In(List<String> values) {
            addCriterion("notice3 in", values, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3NotIn(List<String> values) {
            addCriterion("notice3 not in", values, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3Between(String value1, String value2) {
            addCriterion("notice3 between", value1, value2, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice3NotBetween(String value1, String value2) {
            addCriterion("notice3 not between", value1, value2, "notice3");
            return (Criteria) this;
        }

        public Criteria andNotice4IsNull() {
            addCriterion("notice4 is null");
            return (Criteria) this;
        }

        public Criteria andNotice4IsNotNull() {
            addCriterion("notice4 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice4EqualTo(String value) {
            addCriterion("notice4 =", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4NotEqualTo(String value) {
            addCriterion("notice4 <>", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4GreaterThan(String value) {
            addCriterion("notice4 >", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4GreaterThanOrEqualTo(String value) {
            addCriterion("notice4 >=", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4LessThan(String value) {
            addCriterion("notice4 <", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4LessThanOrEqualTo(String value) {
            addCriterion("notice4 <=", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4Like(String value) {
            addCriterion("notice4 like", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4NotLike(String value) {
            addCriterion("notice4 not like", value, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4In(List<String> values) {
            addCriterion("notice4 in", values, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4NotIn(List<String> values) {
            addCriterion("notice4 not in", values, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4Between(String value1, String value2) {
            addCriterion("notice4 between", value1, value2, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice4NotBetween(String value1, String value2) {
            addCriterion("notice4 not between", value1, value2, "notice4");
            return (Criteria) this;
        }

        public Criteria andNotice5IsNull() {
            addCriterion("notice5 is null");
            return (Criteria) this;
        }

        public Criteria andNotice5IsNotNull() {
            addCriterion("notice5 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice5EqualTo(String value) {
            addCriterion("notice5 =", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5NotEqualTo(String value) {
            addCriterion("notice5 <>", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5GreaterThan(String value) {
            addCriterion("notice5 >", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5GreaterThanOrEqualTo(String value) {
            addCriterion("notice5 >=", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5LessThan(String value) {
            addCriterion("notice5 <", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5LessThanOrEqualTo(String value) {
            addCriterion("notice5 <=", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5Like(String value) {
            addCriterion("notice5 like", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5NotLike(String value) {
            addCriterion("notice5 not like", value, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5In(List<String> values) {
            addCriterion("notice5 in", values, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5NotIn(List<String> values) {
            addCriterion("notice5 not in", values, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5Between(String value1, String value2) {
            addCriterion("notice5 between", value1, value2, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice5NotBetween(String value1, String value2) {
            addCriterion("notice5 not between", value1, value2, "notice5");
            return (Criteria) this;
        }

        public Criteria andNotice6IsNull() {
            addCriterion("notice6 is null");
            return (Criteria) this;
        }

        public Criteria andNotice6IsNotNull() {
            addCriterion("notice6 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice6EqualTo(String value) {
            addCriterion("notice6 =", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6NotEqualTo(String value) {
            addCriterion("notice6 <>", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6GreaterThan(String value) {
            addCriterion("notice6 >", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6GreaterThanOrEqualTo(String value) {
            addCriterion("notice6 >=", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6LessThan(String value) {
            addCriterion("notice6 <", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6LessThanOrEqualTo(String value) {
            addCriterion("notice6 <=", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6Like(String value) {
            addCriterion("notice6 like", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6NotLike(String value) {
            addCriterion("notice6 not like", value, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6In(List<String> values) {
            addCriterion("notice6 in", values, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6NotIn(List<String> values) {
            addCriterion("notice6 not in", values, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6Between(String value1, String value2) {
            addCriterion("notice6 between", value1, value2, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice6NotBetween(String value1, String value2) {
            addCriterion("notice6 not between", value1, value2, "notice6");
            return (Criteria) this;
        }

        public Criteria andNotice7IsNull() {
            addCriterion("notice7 is null");
            return (Criteria) this;
        }

        public Criteria andNotice7IsNotNull() {
            addCriterion("notice7 is not null");
            return (Criteria) this;
        }

        public Criteria andNotice7EqualTo(String value) {
            addCriterion("notice7 =", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7NotEqualTo(String value) {
            addCriterion("notice7 <>", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7GreaterThan(String value) {
            addCriterion("notice7 >", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7GreaterThanOrEqualTo(String value) {
            addCriterion("notice7 >=", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7LessThan(String value) {
            addCriterion("notice7 <", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7LessThanOrEqualTo(String value) {
            addCriterion("notice7 <=", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7Like(String value) {
            addCriterion("notice7 like", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7NotLike(String value) {
            addCriterion("notice7 not like", value, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7In(List<String> values) {
            addCriterion("notice7 in", values, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7NotIn(List<String> values) {
            addCriterion("notice7 not in", values, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7Between(String value1, String value2) {
            addCriterion("notice7 between", value1, value2, "notice7");
            return (Criteria) this;
        }

        public Criteria andNotice7NotBetween(String value1, String value2) {
            addCriterion("notice7 not between", value1, value2, "notice7");
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