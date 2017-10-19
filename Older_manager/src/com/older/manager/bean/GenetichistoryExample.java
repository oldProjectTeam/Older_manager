package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenetichistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenetichistoryExample() {
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

        public Criteria andInfectiontimeIsNull() {
            addCriterion("infectionTime is null");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeIsNotNull() {
            addCriterion("infectionTime is not null");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeEqualTo(Date value) {
            addCriterion("infectionTime =", value, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeNotEqualTo(Date value) {
            addCriterion("infectionTime <>", value, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeGreaterThan(Date value) {
            addCriterion("infectionTime >", value, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("infectionTime >=", value, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeLessThan(Date value) {
            addCriterion("infectionTime <", value, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeLessThanOrEqualTo(Date value) {
            addCriterion("infectionTime <=", value, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeIn(List<Date> values) {
            addCriterion("infectionTime in", values, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeNotIn(List<Date> values) {
            addCriterion("infectionTime not in", values, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeBetween(Date value1, Date value2) {
            addCriterion("infectionTime between", value1, value2, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andInfectiontimeNotBetween(Date value1, Date value2) {
            addCriterion("infectionTime not between", value1, value2, "infectiontime");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
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

        public Criteria andGenetichistory1IsNull() {
            addCriterion("geneticHistory1 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1IsNotNull() {
            addCriterion("geneticHistory1 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1EqualTo(String value) {
            addCriterion("geneticHistory1 =", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1NotEqualTo(String value) {
            addCriterion("geneticHistory1 <>", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1GreaterThan(String value) {
            addCriterion("geneticHistory1 >", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory1 >=", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1LessThan(String value) {
            addCriterion("geneticHistory1 <", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory1 <=", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1Like(String value) {
            addCriterion("geneticHistory1 like", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1NotLike(String value) {
            addCriterion("geneticHistory1 not like", value, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1In(List<String> values) {
            addCriterion("geneticHistory1 in", values, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1NotIn(List<String> values) {
            addCriterion("geneticHistory1 not in", values, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1Between(String value1, String value2) {
            addCriterion("geneticHistory1 between", value1, value2, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory1NotBetween(String value1, String value2) {
            addCriterion("geneticHistory1 not between", value1, value2, "genetichistory1");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2IsNull() {
            addCriterion("geneticHistory2 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2IsNotNull() {
            addCriterion("geneticHistory2 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2EqualTo(String value) {
            addCriterion("geneticHistory2 =", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2NotEqualTo(String value) {
            addCriterion("geneticHistory2 <>", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2GreaterThan(String value) {
            addCriterion("geneticHistory2 >", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory2 >=", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2LessThan(String value) {
            addCriterion("geneticHistory2 <", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory2 <=", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2Like(String value) {
            addCriterion("geneticHistory2 like", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2NotLike(String value) {
            addCriterion("geneticHistory2 not like", value, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2In(List<String> values) {
            addCriterion("geneticHistory2 in", values, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2NotIn(List<String> values) {
            addCriterion("geneticHistory2 not in", values, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2Between(String value1, String value2) {
            addCriterion("geneticHistory2 between", value1, value2, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory2NotBetween(String value1, String value2) {
            addCriterion("geneticHistory2 not between", value1, value2, "genetichistory2");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3IsNull() {
            addCriterion("geneticHistory3 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3IsNotNull() {
            addCriterion("geneticHistory3 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3EqualTo(String value) {
            addCriterion("geneticHistory3 =", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3NotEqualTo(String value) {
            addCriterion("geneticHistory3 <>", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3GreaterThan(String value) {
            addCriterion("geneticHistory3 >", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory3 >=", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3LessThan(String value) {
            addCriterion("geneticHistory3 <", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory3 <=", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3Like(String value) {
            addCriterion("geneticHistory3 like", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3NotLike(String value) {
            addCriterion("geneticHistory3 not like", value, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3In(List<String> values) {
            addCriterion("geneticHistory3 in", values, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3NotIn(List<String> values) {
            addCriterion("geneticHistory3 not in", values, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3Between(String value1, String value2) {
            addCriterion("geneticHistory3 between", value1, value2, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory3NotBetween(String value1, String value2) {
            addCriterion("geneticHistory3 not between", value1, value2, "genetichistory3");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4IsNull() {
            addCriterion("geneticHistory4 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4IsNotNull() {
            addCriterion("geneticHistory4 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4EqualTo(String value) {
            addCriterion("geneticHistory4 =", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4NotEqualTo(String value) {
            addCriterion("geneticHistory4 <>", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4GreaterThan(String value) {
            addCriterion("geneticHistory4 >", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory4 >=", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4LessThan(String value) {
            addCriterion("geneticHistory4 <", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory4 <=", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4Like(String value) {
            addCriterion("geneticHistory4 like", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4NotLike(String value) {
            addCriterion("geneticHistory4 not like", value, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4In(List<String> values) {
            addCriterion("geneticHistory4 in", values, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4NotIn(List<String> values) {
            addCriterion("geneticHistory4 not in", values, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4Between(String value1, String value2) {
            addCriterion("geneticHistory4 between", value1, value2, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory4NotBetween(String value1, String value2) {
            addCriterion("geneticHistory4 not between", value1, value2, "genetichistory4");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5IsNull() {
            addCriterion("geneticHistory5 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5IsNotNull() {
            addCriterion("geneticHistory5 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5EqualTo(String value) {
            addCriterion("geneticHistory5 =", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5NotEqualTo(String value) {
            addCriterion("geneticHistory5 <>", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5GreaterThan(String value) {
            addCriterion("geneticHistory5 >", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory5 >=", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5LessThan(String value) {
            addCriterion("geneticHistory5 <", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory5 <=", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5Like(String value) {
            addCriterion("geneticHistory5 like", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5NotLike(String value) {
            addCriterion("geneticHistory5 not like", value, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5In(List<String> values) {
            addCriterion("geneticHistory5 in", values, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5NotIn(List<String> values) {
            addCriterion("geneticHistory5 not in", values, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5Between(String value1, String value2) {
            addCriterion("geneticHistory5 between", value1, value2, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory5NotBetween(String value1, String value2) {
            addCriterion("geneticHistory5 not between", value1, value2, "genetichistory5");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6IsNull() {
            addCriterion("geneticHistory6 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6IsNotNull() {
            addCriterion("geneticHistory6 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6EqualTo(String value) {
            addCriterion("geneticHistory6 =", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6NotEqualTo(String value) {
            addCriterion("geneticHistory6 <>", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6GreaterThan(String value) {
            addCriterion("geneticHistory6 >", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory6 >=", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6LessThan(String value) {
            addCriterion("geneticHistory6 <", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory6 <=", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6Like(String value) {
            addCriterion("geneticHistory6 like", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6NotLike(String value) {
            addCriterion("geneticHistory6 not like", value, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6In(List<String> values) {
            addCriterion("geneticHistory6 in", values, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6NotIn(List<String> values) {
            addCriterion("geneticHistory6 not in", values, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6Between(String value1, String value2) {
            addCriterion("geneticHistory6 between", value1, value2, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory6NotBetween(String value1, String value2) {
            addCriterion("geneticHistory6 not between", value1, value2, "genetichistory6");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7IsNull() {
            addCriterion("geneticHistory7 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7IsNotNull() {
            addCriterion("geneticHistory7 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7EqualTo(String value) {
            addCriterion("geneticHistory7 =", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7NotEqualTo(String value) {
            addCriterion("geneticHistory7 <>", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7GreaterThan(String value) {
            addCriterion("geneticHistory7 >", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory7 >=", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7LessThan(String value) {
            addCriterion("geneticHistory7 <", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory7 <=", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7Like(String value) {
            addCriterion("geneticHistory7 like", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7NotLike(String value) {
            addCriterion("geneticHistory7 not like", value, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7In(List<String> values) {
            addCriterion("geneticHistory7 in", values, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7NotIn(List<String> values) {
            addCriterion("geneticHistory7 not in", values, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7Between(String value1, String value2) {
            addCriterion("geneticHistory7 between", value1, value2, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory7NotBetween(String value1, String value2) {
            addCriterion("geneticHistory7 not between", value1, value2, "genetichistory7");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8IsNull() {
            addCriterion("geneticHistory8 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8IsNotNull() {
            addCriterion("geneticHistory8 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8EqualTo(String value) {
            addCriterion("geneticHistory8 =", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8NotEqualTo(String value) {
            addCriterion("geneticHistory8 <>", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8GreaterThan(String value) {
            addCriterion("geneticHistory8 >", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory8 >=", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8LessThan(String value) {
            addCriterion("geneticHistory8 <", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory8 <=", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8Like(String value) {
            addCriterion("geneticHistory8 like", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8NotLike(String value) {
            addCriterion("geneticHistory8 not like", value, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8In(List<String> values) {
            addCriterion("geneticHistory8 in", values, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8NotIn(List<String> values) {
            addCriterion("geneticHistory8 not in", values, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8Between(String value1, String value2) {
            addCriterion("geneticHistory8 between", value1, value2, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory8NotBetween(String value1, String value2) {
            addCriterion("geneticHistory8 not between", value1, value2, "genetichistory8");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9IsNull() {
            addCriterion("geneticHistory9 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9IsNotNull() {
            addCriterion("geneticHistory9 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9EqualTo(String value) {
            addCriterion("geneticHistory9 =", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9NotEqualTo(String value) {
            addCriterion("geneticHistory9 <>", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9GreaterThan(String value) {
            addCriterion("geneticHistory9 >", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory9 >=", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9LessThan(String value) {
            addCriterion("geneticHistory9 <", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory9 <=", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9Like(String value) {
            addCriterion("geneticHistory9 like", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9NotLike(String value) {
            addCriterion("geneticHistory9 not like", value, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9In(List<String> values) {
            addCriterion("geneticHistory9 in", values, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9NotIn(List<String> values) {
            addCriterion("geneticHistory9 not in", values, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9Between(String value1, String value2) {
            addCriterion("geneticHistory9 between", value1, value2, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory9NotBetween(String value1, String value2) {
            addCriterion("geneticHistory9 not between", value1, value2, "genetichistory9");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10IsNull() {
            addCriterion("geneticHistory10 is null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10IsNotNull() {
            addCriterion("geneticHistory10 is not null");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10EqualTo(String value) {
            addCriterion("geneticHistory10 =", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10NotEqualTo(String value) {
            addCriterion("geneticHistory10 <>", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10GreaterThan(String value) {
            addCriterion("geneticHistory10 >", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10GreaterThanOrEqualTo(String value) {
            addCriterion("geneticHistory10 >=", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10LessThan(String value) {
            addCriterion("geneticHistory10 <", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10LessThanOrEqualTo(String value) {
            addCriterion("geneticHistory10 <=", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10Like(String value) {
            addCriterion("geneticHistory10 like", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10NotLike(String value) {
            addCriterion("geneticHistory10 not like", value, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10In(List<String> values) {
            addCriterion("geneticHistory10 in", values, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10NotIn(List<String> values) {
            addCriterion("geneticHistory10 not in", values, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10Between(String value1, String value2) {
            addCriterion("geneticHistory10 between", value1, value2, "genetichistory10");
            return (Criteria) this;
        }

        public Criteria andGenetichistory10NotBetween(String value1, String value2) {
            addCriterion("geneticHistory10 not between", value1, value2, "genetichistory10");
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