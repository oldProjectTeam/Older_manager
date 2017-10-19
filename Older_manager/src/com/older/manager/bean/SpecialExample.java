package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class SpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialExample() {
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

        public Criteria andSpecial1IsNull() {
            addCriterion("special1 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial1IsNotNull() {
            addCriterion("special1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial1EqualTo(String value) {
            addCriterion("special1 =", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1NotEqualTo(String value) {
            addCriterion("special1 <>", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1GreaterThan(String value) {
            addCriterion("special1 >", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1GreaterThanOrEqualTo(String value) {
            addCriterion("special1 >=", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1LessThan(String value) {
            addCriterion("special1 <", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1LessThanOrEqualTo(String value) {
            addCriterion("special1 <=", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1Like(String value) {
            addCriterion("special1 like", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1NotLike(String value) {
            addCriterion("special1 not like", value, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1In(List<String> values) {
            addCriterion("special1 in", values, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1NotIn(List<String> values) {
            addCriterion("special1 not in", values, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1Between(String value1, String value2) {
            addCriterion("special1 between", value1, value2, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial1NotBetween(String value1, String value2) {
            addCriterion("special1 not between", value1, value2, "special1");
            return (Criteria) this;
        }

        public Criteria andSpecial2IsNull() {
            addCriterion("special2 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial2IsNotNull() {
            addCriterion("special2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial2EqualTo(String value) {
            addCriterion("special2 =", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2NotEqualTo(String value) {
            addCriterion("special2 <>", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2GreaterThan(String value) {
            addCriterion("special2 >", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2GreaterThanOrEqualTo(String value) {
            addCriterion("special2 >=", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2LessThan(String value) {
            addCriterion("special2 <", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2LessThanOrEqualTo(String value) {
            addCriterion("special2 <=", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2Like(String value) {
            addCriterion("special2 like", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2NotLike(String value) {
            addCriterion("special2 not like", value, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2In(List<String> values) {
            addCriterion("special2 in", values, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2NotIn(List<String> values) {
            addCriterion("special2 not in", values, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2Between(String value1, String value2) {
            addCriterion("special2 between", value1, value2, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial2NotBetween(String value1, String value2) {
            addCriterion("special2 not between", value1, value2, "special2");
            return (Criteria) this;
        }

        public Criteria andSpecial3IsNull() {
            addCriterion("special3 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial3IsNotNull() {
            addCriterion("special3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial3EqualTo(String value) {
            addCriterion("special3 =", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3NotEqualTo(String value) {
            addCriterion("special3 <>", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3GreaterThan(String value) {
            addCriterion("special3 >", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3GreaterThanOrEqualTo(String value) {
            addCriterion("special3 >=", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3LessThan(String value) {
            addCriterion("special3 <", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3LessThanOrEqualTo(String value) {
            addCriterion("special3 <=", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3Like(String value) {
            addCriterion("special3 like", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3NotLike(String value) {
            addCriterion("special3 not like", value, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3In(List<String> values) {
            addCriterion("special3 in", values, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3NotIn(List<String> values) {
            addCriterion("special3 not in", values, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3Between(String value1, String value2) {
            addCriterion("special3 between", value1, value2, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial3NotBetween(String value1, String value2) {
            addCriterion("special3 not between", value1, value2, "special3");
            return (Criteria) this;
        }

        public Criteria andSpecial4IsNull() {
            addCriterion("special4 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial4IsNotNull() {
            addCriterion("special4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial4EqualTo(String value) {
            addCriterion("special4 =", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4NotEqualTo(String value) {
            addCriterion("special4 <>", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4GreaterThan(String value) {
            addCriterion("special4 >", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4GreaterThanOrEqualTo(String value) {
            addCriterion("special4 >=", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4LessThan(String value) {
            addCriterion("special4 <", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4LessThanOrEqualTo(String value) {
            addCriterion("special4 <=", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4Like(String value) {
            addCriterion("special4 like", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4NotLike(String value) {
            addCriterion("special4 not like", value, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4In(List<String> values) {
            addCriterion("special4 in", values, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4NotIn(List<String> values) {
            addCriterion("special4 not in", values, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4Between(String value1, String value2) {
            addCriterion("special4 between", value1, value2, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial4NotBetween(String value1, String value2) {
            addCriterion("special4 not between", value1, value2, "special4");
            return (Criteria) this;
        }

        public Criteria andSpecial5IsNull() {
            addCriterion("special5 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial5IsNotNull() {
            addCriterion("special5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial5EqualTo(String value) {
            addCriterion("special5 =", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5NotEqualTo(String value) {
            addCriterion("special5 <>", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5GreaterThan(String value) {
            addCriterion("special5 >", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5GreaterThanOrEqualTo(String value) {
            addCriterion("special5 >=", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5LessThan(String value) {
            addCriterion("special5 <", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5LessThanOrEqualTo(String value) {
            addCriterion("special5 <=", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5Like(String value) {
            addCriterion("special5 like", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5NotLike(String value) {
            addCriterion("special5 not like", value, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5In(List<String> values) {
            addCriterion("special5 in", values, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5NotIn(List<String> values) {
            addCriterion("special5 not in", values, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5Between(String value1, String value2) {
            addCriterion("special5 between", value1, value2, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial5NotBetween(String value1, String value2) {
            addCriterion("special5 not between", value1, value2, "special5");
            return (Criteria) this;
        }

        public Criteria andSpecial6IsNull() {
            addCriterion("special6 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial6IsNotNull() {
            addCriterion("special6 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial6EqualTo(String value) {
            addCriterion("special6 =", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6NotEqualTo(String value) {
            addCriterion("special6 <>", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6GreaterThan(String value) {
            addCriterion("special6 >", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6GreaterThanOrEqualTo(String value) {
            addCriterion("special6 >=", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6LessThan(String value) {
            addCriterion("special6 <", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6LessThanOrEqualTo(String value) {
            addCriterion("special6 <=", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6Like(String value) {
            addCriterion("special6 like", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6NotLike(String value) {
            addCriterion("special6 not like", value, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6In(List<String> values) {
            addCriterion("special6 in", values, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6NotIn(List<String> values) {
            addCriterion("special6 not in", values, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6Between(String value1, String value2) {
            addCriterion("special6 between", value1, value2, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial6NotBetween(String value1, String value2) {
            addCriterion("special6 not between", value1, value2, "special6");
            return (Criteria) this;
        }

        public Criteria andSpecial7IsNull() {
            addCriterion("special7 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial7IsNotNull() {
            addCriterion("special7 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial7EqualTo(String value) {
            addCriterion("special7 =", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7NotEqualTo(String value) {
            addCriterion("special7 <>", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7GreaterThan(String value) {
            addCriterion("special7 >", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7GreaterThanOrEqualTo(String value) {
            addCriterion("special7 >=", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7LessThan(String value) {
            addCriterion("special7 <", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7LessThanOrEqualTo(String value) {
            addCriterion("special7 <=", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7Like(String value) {
            addCriterion("special7 like", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7NotLike(String value) {
            addCriterion("special7 not like", value, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7In(List<String> values) {
            addCriterion("special7 in", values, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7NotIn(List<String> values) {
            addCriterion("special7 not in", values, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7Between(String value1, String value2) {
            addCriterion("special7 between", value1, value2, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial7NotBetween(String value1, String value2) {
            addCriterion("special7 not between", value1, value2, "special7");
            return (Criteria) this;
        }

        public Criteria andSpecial8IsNull() {
            addCriterion("special8 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial8IsNotNull() {
            addCriterion("special8 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial8EqualTo(String value) {
            addCriterion("special8 =", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8NotEqualTo(String value) {
            addCriterion("special8 <>", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8GreaterThan(String value) {
            addCriterion("special8 >", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8GreaterThanOrEqualTo(String value) {
            addCriterion("special8 >=", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8LessThan(String value) {
            addCriterion("special8 <", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8LessThanOrEqualTo(String value) {
            addCriterion("special8 <=", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8Like(String value) {
            addCriterion("special8 like", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8NotLike(String value) {
            addCriterion("special8 not like", value, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8In(List<String> values) {
            addCriterion("special8 in", values, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8NotIn(List<String> values) {
            addCriterion("special8 not in", values, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8Between(String value1, String value2) {
            addCriterion("special8 between", value1, value2, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial8NotBetween(String value1, String value2) {
            addCriterion("special8 not between", value1, value2, "special8");
            return (Criteria) this;
        }

        public Criteria andSpecial9IsNull() {
            addCriterion("special9 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial9IsNotNull() {
            addCriterion("special9 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial9EqualTo(String value) {
            addCriterion("special9 =", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9NotEqualTo(String value) {
            addCriterion("special9 <>", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9GreaterThan(String value) {
            addCriterion("special9 >", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9GreaterThanOrEqualTo(String value) {
            addCriterion("special9 >=", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9LessThan(String value) {
            addCriterion("special9 <", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9LessThanOrEqualTo(String value) {
            addCriterion("special9 <=", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9Like(String value) {
            addCriterion("special9 like", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9NotLike(String value) {
            addCriterion("special9 not like", value, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9In(List<String> values) {
            addCriterion("special9 in", values, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9NotIn(List<String> values) {
            addCriterion("special9 not in", values, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9Between(String value1, String value2) {
            addCriterion("special9 between", value1, value2, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial9NotBetween(String value1, String value2) {
            addCriterion("special9 not between", value1, value2, "special9");
            return (Criteria) this;
        }

        public Criteria andSpecial10IsNull() {
            addCriterion("special10 is null");
            return (Criteria) this;
        }

        public Criteria andSpecial10IsNotNull() {
            addCriterion("special10 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial10EqualTo(String value) {
            addCriterion("special10 =", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10NotEqualTo(String value) {
            addCriterion("special10 <>", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10GreaterThan(String value) {
            addCriterion("special10 >", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10GreaterThanOrEqualTo(String value) {
            addCriterion("special10 >=", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10LessThan(String value) {
            addCriterion("special10 <", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10LessThanOrEqualTo(String value) {
            addCriterion("special10 <=", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10Like(String value) {
            addCriterion("special10 like", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10NotLike(String value) {
            addCriterion("special10 not like", value, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10In(List<String> values) {
            addCriterion("special10 in", values, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10NotIn(List<String> values) {
            addCriterion("special10 not in", values, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10Between(String value1, String value2) {
            addCriterion("special10 between", value1, value2, "special10");
            return (Criteria) this;
        }

        public Criteria andSpecial10NotBetween(String value1, String value2) {
            addCriterion("special10 not between", value1, value2, "special10");
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