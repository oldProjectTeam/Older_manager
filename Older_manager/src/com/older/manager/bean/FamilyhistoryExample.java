package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class FamilyhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyhistoryExample() {
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

        public Criteria andDiseasenameIsNull() {
            addCriterion("DiseaseName is null");
            return (Criteria) this;
        }

        public Criteria andDiseasenameIsNotNull() {
            addCriterion("DiseaseName is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasenameEqualTo(String value) {
            addCriterion("DiseaseName =", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotEqualTo(String value) {
            addCriterion("DiseaseName <>", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameGreaterThan(String value) {
            addCriterion("DiseaseName >", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameGreaterThanOrEqualTo(String value) {
            addCriterion("DiseaseName >=", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameLessThan(String value) {
            addCriterion("DiseaseName <", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameLessThanOrEqualTo(String value) {
            addCriterion("DiseaseName <=", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameLike(String value) {
            addCriterion("DiseaseName like", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotLike(String value) {
            addCriterion("DiseaseName not like", value, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameIn(List<String> values) {
            addCriterion("DiseaseName in", values, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotIn(List<String> values) {
            addCriterion("DiseaseName not in", values, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameBetween(String value1, String value2) {
            addCriterion("DiseaseName between", value1, value2, "diseasename");
            return (Criteria) this;
        }

        public Criteria andDiseasenameNotBetween(String value1, String value2) {
            addCriterion("DiseaseName not between", value1, value2, "diseasename");
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