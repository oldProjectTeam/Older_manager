package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class HobbyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HobbyExample() {
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

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
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

        public Criteria andHobby1IsNull() {
            addCriterion("Hobby1 is null");
            return (Criteria) this;
        }

        public Criteria andHobby1IsNotNull() {
            addCriterion("Hobby1 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby1EqualTo(String value) {
            addCriterion("Hobby1 =", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1NotEqualTo(String value) {
            addCriterion("Hobby1 <>", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1GreaterThan(String value) {
            addCriterion("Hobby1 >", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby1 >=", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1LessThan(String value) {
            addCriterion("Hobby1 <", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1LessThanOrEqualTo(String value) {
            addCriterion("Hobby1 <=", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1Like(String value) {
            addCriterion("Hobby1 like", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1NotLike(String value) {
            addCriterion("Hobby1 not like", value, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1In(List<String> values) {
            addCriterion("Hobby1 in", values, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1NotIn(List<String> values) {
            addCriterion("Hobby1 not in", values, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1Between(String value1, String value2) {
            addCriterion("Hobby1 between", value1, value2, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby1NotBetween(String value1, String value2) {
            addCriterion("Hobby1 not between", value1, value2, "hobby1");
            return (Criteria) this;
        }

        public Criteria andHobby2IsNull() {
            addCriterion("Hobby2 is null");
            return (Criteria) this;
        }

        public Criteria andHobby2IsNotNull() {
            addCriterion("Hobby2 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby2EqualTo(String value) {
            addCriterion("Hobby2 =", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2NotEqualTo(String value) {
            addCriterion("Hobby2 <>", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2GreaterThan(String value) {
            addCriterion("Hobby2 >", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby2 >=", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2LessThan(String value) {
            addCriterion("Hobby2 <", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2LessThanOrEqualTo(String value) {
            addCriterion("Hobby2 <=", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2Like(String value) {
            addCriterion("Hobby2 like", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2NotLike(String value) {
            addCriterion("Hobby2 not like", value, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2In(List<String> values) {
            addCriterion("Hobby2 in", values, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2NotIn(List<String> values) {
            addCriterion("Hobby2 not in", values, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2Between(String value1, String value2) {
            addCriterion("Hobby2 between", value1, value2, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby2NotBetween(String value1, String value2) {
            addCriterion("Hobby2 not between", value1, value2, "hobby2");
            return (Criteria) this;
        }

        public Criteria andHobby3IsNull() {
            addCriterion("Hobby3 is null");
            return (Criteria) this;
        }

        public Criteria andHobby3IsNotNull() {
            addCriterion("Hobby3 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby3EqualTo(String value) {
            addCriterion("Hobby3 =", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3NotEqualTo(String value) {
            addCriterion("Hobby3 <>", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3GreaterThan(String value) {
            addCriterion("Hobby3 >", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby3 >=", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3LessThan(String value) {
            addCriterion("Hobby3 <", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3LessThanOrEqualTo(String value) {
            addCriterion("Hobby3 <=", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3Like(String value) {
            addCriterion("Hobby3 like", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3NotLike(String value) {
            addCriterion("Hobby3 not like", value, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3In(List<String> values) {
            addCriterion("Hobby3 in", values, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3NotIn(List<String> values) {
            addCriterion("Hobby3 not in", values, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3Between(String value1, String value2) {
            addCriterion("Hobby3 between", value1, value2, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby3NotBetween(String value1, String value2) {
            addCriterion("Hobby3 not between", value1, value2, "hobby3");
            return (Criteria) this;
        }

        public Criteria andHobby4IsNull() {
            addCriterion("Hobby4 is null");
            return (Criteria) this;
        }

        public Criteria andHobby4IsNotNull() {
            addCriterion("Hobby4 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby4EqualTo(String value) {
            addCriterion("Hobby4 =", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4NotEqualTo(String value) {
            addCriterion("Hobby4 <>", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4GreaterThan(String value) {
            addCriterion("Hobby4 >", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby4 >=", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4LessThan(String value) {
            addCriterion("Hobby4 <", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4LessThanOrEqualTo(String value) {
            addCriterion("Hobby4 <=", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4Like(String value) {
            addCriterion("Hobby4 like", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4NotLike(String value) {
            addCriterion("Hobby4 not like", value, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4In(List<String> values) {
            addCriterion("Hobby4 in", values, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4NotIn(List<String> values) {
            addCriterion("Hobby4 not in", values, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4Between(String value1, String value2) {
            addCriterion("Hobby4 between", value1, value2, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby4NotBetween(String value1, String value2) {
            addCriterion("Hobby4 not between", value1, value2, "hobby4");
            return (Criteria) this;
        }

        public Criteria andHobby5IsNull() {
            addCriterion("Hobby5 is null");
            return (Criteria) this;
        }

        public Criteria andHobby5IsNotNull() {
            addCriterion("Hobby5 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby5EqualTo(String value) {
            addCriterion("Hobby5 =", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5NotEqualTo(String value) {
            addCriterion("Hobby5 <>", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5GreaterThan(String value) {
            addCriterion("Hobby5 >", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby5 >=", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5LessThan(String value) {
            addCriterion("Hobby5 <", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5LessThanOrEqualTo(String value) {
            addCriterion("Hobby5 <=", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5Like(String value) {
            addCriterion("Hobby5 like", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5NotLike(String value) {
            addCriterion("Hobby5 not like", value, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5In(List<String> values) {
            addCriterion("Hobby5 in", values, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5NotIn(List<String> values) {
            addCriterion("Hobby5 not in", values, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5Between(String value1, String value2) {
            addCriterion("Hobby5 between", value1, value2, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby5NotBetween(String value1, String value2) {
            addCriterion("Hobby5 not between", value1, value2, "hobby5");
            return (Criteria) this;
        }

        public Criteria andHobby6IsNull() {
            addCriterion("Hobby6 is null");
            return (Criteria) this;
        }

        public Criteria andHobby6IsNotNull() {
            addCriterion("Hobby6 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby6EqualTo(String value) {
            addCriterion("Hobby6 =", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6NotEqualTo(String value) {
            addCriterion("Hobby6 <>", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6GreaterThan(String value) {
            addCriterion("Hobby6 >", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby6 >=", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6LessThan(String value) {
            addCriterion("Hobby6 <", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6LessThanOrEqualTo(String value) {
            addCriterion("Hobby6 <=", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6Like(String value) {
            addCriterion("Hobby6 like", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6NotLike(String value) {
            addCriterion("Hobby6 not like", value, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6In(List<String> values) {
            addCriterion("Hobby6 in", values, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6NotIn(List<String> values) {
            addCriterion("Hobby6 not in", values, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6Between(String value1, String value2) {
            addCriterion("Hobby6 between", value1, value2, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby6NotBetween(String value1, String value2) {
            addCriterion("Hobby6 not between", value1, value2, "hobby6");
            return (Criteria) this;
        }

        public Criteria andHobby7IsNull() {
            addCriterion("Hobby7 is null");
            return (Criteria) this;
        }

        public Criteria andHobby7IsNotNull() {
            addCriterion("Hobby7 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby7EqualTo(String value) {
            addCriterion("Hobby7 =", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7NotEqualTo(String value) {
            addCriterion("Hobby7 <>", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7GreaterThan(String value) {
            addCriterion("Hobby7 >", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby7 >=", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7LessThan(String value) {
            addCriterion("Hobby7 <", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7LessThanOrEqualTo(String value) {
            addCriterion("Hobby7 <=", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7Like(String value) {
            addCriterion("Hobby7 like", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7NotLike(String value) {
            addCriterion("Hobby7 not like", value, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7In(List<String> values) {
            addCriterion("Hobby7 in", values, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7NotIn(List<String> values) {
            addCriterion("Hobby7 not in", values, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7Between(String value1, String value2) {
            addCriterion("Hobby7 between", value1, value2, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby7NotBetween(String value1, String value2) {
            addCriterion("Hobby7 not between", value1, value2, "hobby7");
            return (Criteria) this;
        }

        public Criteria andHobby8IsNull() {
            addCriterion("Hobby8 is null");
            return (Criteria) this;
        }

        public Criteria andHobby8IsNotNull() {
            addCriterion("Hobby8 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby8EqualTo(String value) {
            addCriterion("Hobby8 =", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8NotEqualTo(String value) {
            addCriterion("Hobby8 <>", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8GreaterThan(String value) {
            addCriterion("Hobby8 >", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby8 >=", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8LessThan(String value) {
            addCriterion("Hobby8 <", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8LessThanOrEqualTo(String value) {
            addCriterion("Hobby8 <=", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8Like(String value) {
            addCriterion("Hobby8 like", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8NotLike(String value) {
            addCriterion("Hobby8 not like", value, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8In(List<String> values) {
            addCriterion("Hobby8 in", values, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8NotIn(List<String> values) {
            addCriterion("Hobby8 not in", values, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8Between(String value1, String value2) {
            addCriterion("Hobby8 between", value1, value2, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby8NotBetween(String value1, String value2) {
            addCriterion("Hobby8 not between", value1, value2, "hobby8");
            return (Criteria) this;
        }

        public Criteria andHobby9IsNull() {
            addCriterion("Hobby9 is null");
            return (Criteria) this;
        }

        public Criteria andHobby9IsNotNull() {
            addCriterion("Hobby9 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby9EqualTo(String value) {
            addCriterion("Hobby9 =", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9NotEqualTo(String value) {
            addCriterion("Hobby9 <>", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9GreaterThan(String value) {
            addCriterion("Hobby9 >", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby9 >=", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9LessThan(String value) {
            addCriterion("Hobby9 <", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9LessThanOrEqualTo(String value) {
            addCriterion("Hobby9 <=", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9Like(String value) {
            addCriterion("Hobby9 like", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9NotLike(String value) {
            addCriterion("Hobby9 not like", value, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9In(List<String> values) {
            addCriterion("Hobby9 in", values, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9NotIn(List<String> values) {
            addCriterion("Hobby9 not in", values, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9Between(String value1, String value2) {
            addCriterion("Hobby9 between", value1, value2, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby9NotBetween(String value1, String value2) {
            addCriterion("Hobby9 not between", value1, value2, "hobby9");
            return (Criteria) this;
        }

        public Criteria andHobby10IsNull() {
            addCriterion("Hobby10 is null");
            return (Criteria) this;
        }

        public Criteria andHobby10IsNotNull() {
            addCriterion("Hobby10 is not null");
            return (Criteria) this;
        }

        public Criteria andHobby10EqualTo(String value) {
            addCriterion("Hobby10 =", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10NotEqualTo(String value) {
            addCriterion("Hobby10 <>", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10GreaterThan(String value) {
            addCriterion("Hobby10 >", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10GreaterThanOrEqualTo(String value) {
            addCriterion("Hobby10 >=", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10LessThan(String value) {
            addCriterion("Hobby10 <", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10LessThanOrEqualTo(String value) {
            addCriterion("Hobby10 <=", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10Like(String value) {
            addCriterion("Hobby10 like", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10NotLike(String value) {
            addCriterion("Hobby10 not like", value, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10In(List<String> values) {
            addCriterion("Hobby10 in", values, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10NotIn(List<String> values) {
            addCriterion("Hobby10 not in", values, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10Between(String value1, String value2) {
            addCriterion("Hobby10 between", value1, value2, "hobby10");
            return (Criteria) this;
        }

        public Criteria andHobby10NotBetween(String value1, String value2) {
            addCriterion("Hobby10 not between", value1, value2, "hobby10");
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