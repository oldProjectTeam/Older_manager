package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class PedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PedetailsExample() {
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

        public Criteria andPeprojectIsNull() {
            addCriterion("peProject is null");
            return (Criteria) this;
        }

        public Criteria andPeprojectIsNotNull() {
            addCriterion("peProject is not null");
            return (Criteria) this;
        }

        public Criteria andPeprojectEqualTo(String value) {
            addCriterion("peProject =", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectNotEqualTo(String value) {
            addCriterion("peProject <>", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectGreaterThan(String value) {
            addCriterion("peProject >", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectGreaterThanOrEqualTo(String value) {
            addCriterion("peProject >=", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectLessThan(String value) {
            addCriterion("peProject <", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectLessThanOrEqualTo(String value) {
            addCriterion("peProject <=", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectLike(String value) {
            addCriterion("peProject like", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectNotLike(String value) {
            addCriterion("peProject not like", value, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectIn(List<String> values) {
            addCriterion("peProject in", values, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectNotIn(List<String> values) {
            addCriterion("peProject not in", values, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectBetween(String value1, String value2) {
            addCriterion("peProject between", value1, value2, "peproject");
            return (Criteria) this;
        }

        public Criteria andPeprojectNotBetween(String value1, String value2) {
            addCriterion("peProject not between", value1, value2, "peproject");
            return (Criteria) this;
        }

        public Criteria andPevalueIsNull() {
            addCriterion("peValue is null");
            return (Criteria) this;
        }

        public Criteria andPevalueIsNotNull() {
            addCriterion("peValue is not null");
            return (Criteria) this;
        }

        public Criteria andPevalueEqualTo(String value) {
            addCriterion("peValue =", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueNotEqualTo(String value) {
            addCriterion("peValue <>", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueGreaterThan(String value) {
            addCriterion("peValue >", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueGreaterThanOrEqualTo(String value) {
            addCriterion("peValue >=", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueLessThan(String value) {
            addCriterion("peValue <", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueLessThanOrEqualTo(String value) {
            addCriterion("peValue <=", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueLike(String value) {
            addCriterion("peValue like", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueNotLike(String value) {
            addCriterion("peValue not like", value, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueIn(List<String> values) {
            addCriterion("peValue in", values, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueNotIn(List<String> values) {
            addCriterion("peValue not in", values, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueBetween(String value1, String value2) {
            addCriterion("peValue between", value1, value2, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPevalueNotBetween(String value1, String value2) {
            addCriterion("peValue not between", value1, value2, "pevalue");
            return (Criteria) this;
        }

        public Criteria andPeresultIsNull() {
            addCriterion("peResult is null");
            return (Criteria) this;
        }

        public Criteria andPeresultIsNotNull() {
            addCriterion("peResult is not null");
            return (Criteria) this;
        }

        public Criteria andPeresultEqualTo(String value) {
            addCriterion("peResult =", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultNotEqualTo(String value) {
            addCriterion("peResult <>", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultGreaterThan(String value) {
            addCriterion("peResult >", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultGreaterThanOrEqualTo(String value) {
            addCriterion("peResult >=", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultLessThan(String value) {
            addCriterion("peResult <", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultLessThanOrEqualTo(String value) {
            addCriterion("peResult <=", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultLike(String value) {
            addCriterion("peResult like", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultNotLike(String value) {
            addCriterion("peResult not like", value, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultIn(List<String> values) {
            addCriterion("peResult in", values, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultNotIn(List<String> values) {
            addCriterion("peResult not in", values, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultBetween(String value1, String value2) {
            addCriterion("peResult between", value1, value2, "peresult");
            return (Criteria) this;
        }

        public Criteria andPeresultNotBetween(String value1, String value2) {
            addCriterion("peResult not between", value1, value2, "peresult");
            return (Criteria) this;
        }

        public Criteria andResultanalysisIsNull() {
            addCriterion("resultAnalysis is null");
            return (Criteria) this;
        }

        public Criteria andResultanalysisIsNotNull() {
            addCriterion("resultAnalysis is not null");
            return (Criteria) this;
        }

        public Criteria andResultanalysisEqualTo(String value) {
            addCriterion("resultAnalysis =", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisNotEqualTo(String value) {
            addCriterion("resultAnalysis <>", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisGreaterThan(String value) {
            addCriterion("resultAnalysis >", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("resultAnalysis >=", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisLessThan(String value) {
            addCriterion("resultAnalysis <", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisLessThanOrEqualTo(String value) {
            addCriterion("resultAnalysis <=", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisLike(String value) {
            addCriterion("resultAnalysis like", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisNotLike(String value) {
            addCriterion("resultAnalysis not like", value, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisIn(List<String> values) {
            addCriterion("resultAnalysis in", values, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisNotIn(List<String> values) {
            addCriterion("resultAnalysis not in", values, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisBetween(String value1, String value2) {
            addCriterion("resultAnalysis between", value1, value2, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andResultanalysisNotBetween(String value1, String value2) {
            addCriterion("resultAnalysis not between", value1, value2, "resultanalysis");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdIsNull() {
            addCriterion("peInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdIsNotNull() {
            addCriterion("peInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdEqualTo(Integer value) {
            addCriterion("peInfo_id =", value, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdNotEqualTo(Integer value) {
            addCriterion("peInfo_id <>", value, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdGreaterThan(Integer value) {
            addCriterion("peInfo_id >", value, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("peInfo_id >=", value, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdLessThan(Integer value) {
            addCriterion("peInfo_id <", value, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("peInfo_id <=", value, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdIn(List<Integer> values) {
            addCriterion("peInfo_id in", values, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdNotIn(List<Integer> values) {
            addCriterion("peInfo_id not in", values, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("peInfo_id between", value1, value2, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPeinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("peInfo_id not between", value1, value2, "peinfoId");
            return (Criteria) this;
        }

        public Criteria andPedetails1IsNull() {
            addCriterion("PEDetails1 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails1IsNotNull() {
            addCriterion("PEDetails1 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails1EqualTo(String value) {
            addCriterion("PEDetails1 =", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1NotEqualTo(String value) {
            addCriterion("PEDetails1 <>", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1GreaterThan(String value) {
            addCriterion("PEDetails1 >", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails1 >=", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1LessThan(String value) {
            addCriterion("PEDetails1 <", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1LessThanOrEqualTo(String value) {
            addCriterion("PEDetails1 <=", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1Like(String value) {
            addCriterion("PEDetails1 like", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1NotLike(String value) {
            addCriterion("PEDetails1 not like", value, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1In(List<String> values) {
            addCriterion("PEDetails1 in", values, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1NotIn(List<String> values) {
            addCriterion("PEDetails1 not in", values, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1Between(String value1, String value2) {
            addCriterion("PEDetails1 between", value1, value2, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails1NotBetween(String value1, String value2) {
            addCriterion("PEDetails1 not between", value1, value2, "pedetails1");
            return (Criteria) this;
        }

        public Criteria andPedetails2IsNull() {
            addCriterion("PEDetails2 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails2IsNotNull() {
            addCriterion("PEDetails2 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails2EqualTo(String value) {
            addCriterion("PEDetails2 =", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2NotEqualTo(String value) {
            addCriterion("PEDetails2 <>", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2GreaterThan(String value) {
            addCriterion("PEDetails2 >", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails2 >=", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2LessThan(String value) {
            addCriterion("PEDetails2 <", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2LessThanOrEqualTo(String value) {
            addCriterion("PEDetails2 <=", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2Like(String value) {
            addCriterion("PEDetails2 like", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2NotLike(String value) {
            addCriterion("PEDetails2 not like", value, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2In(List<String> values) {
            addCriterion("PEDetails2 in", values, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2NotIn(List<String> values) {
            addCriterion("PEDetails2 not in", values, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2Between(String value1, String value2) {
            addCriterion("PEDetails2 between", value1, value2, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails2NotBetween(String value1, String value2) {
            addCriterion("PEDetails2 not between", value1, value2, "pedetails2");
            return (Criteria) this;
        }

        public Criteria andPedetails3IsNull() {
            addCriterion("PEDetails3 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails3IsNotNull() {
            addCriterion("PEDetails3 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails3EqualTo(String value) {
            addCriterion("PEDetails3 =", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3NotEqualTo(String value) {
            addCriterion("PEDetails3 <>", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3GreaterThan(String value) {
            addCriterion("PEDetails3 >", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails3 >=", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3LessThan(String value) {
            addCriterion("PEDetails3 <", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3LessThanOrEqualTo(String value) {
            addCriterion("PEDetails3 <=", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3Like(String value) {
            addCriterion("PEDetails3 like", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3NotLike(String value) {
            addCriterion("PEDetails3 not like", value, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3In(List<String> values) {
            addCriterion("PEDetails3 in", values, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3NotIn(List<String> values) {
            addCriterion("PEDetails3 not in", values, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3Between(String value1, String value2) {
            addCriterion("PEDetails3 between", value1, value2, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails3NotBetween(String value1, String value2) {
            addCriterion("PEDetails3 not between", value1, value2, "pedetails3");
            return (Criteria) this;
        }

        public Criteria andPedetails4IsNull() {
            addCriterion("PEDetails4 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails4IsNotNull() {
            addCriterion("PEDetails4 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails4EqualTo(String value) {
            addCriterion("PEDetails4 =", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4NotEqualTo(String value) {
            addCriterion("PEDetails4 <>", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4GreaterThan(String value) {
            addCriterion("PEDetails4 >", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails4 >=", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4LessThan(String value) {
            addCriterion("PEDetails4 <", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4LessThanOrEqualTo(String value) {
            addCriterion("PEDetails4 <=", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4Like(String value) {
            addCriterion("PEDetails4 like", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4NotLike(String value) {
            addCriterion("PEDetails4 not like", value, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4In(List<String> values) {
            addCriterion("PEDetails4 in", values, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4NotIn(List<String> values) {
            addCriterion("PEDetails4 not in", values, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4Between(String value1, String value2) {
            addCriterion("PEDetails4 between", value1, value2, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails4NotBetween(String value1, String value2) {
            addCriterion("PEDetails4 not between", value1, value2, "pedetails4");
            return (Criteria) this;
        }

        public Criteria andPedetails5IsNull() {
            addCriterion("PEDetails5 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails5IsNotNull() {
            addCriterion("PEDetails5 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails5EqualTo(String value) {
            addCriterion("PEDetails5 =", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5NotEqualTo(String value) {
            addCriterion("PEDetails5 <>", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5GreaterThan(String value) {
            addCriterion("PEDetails5 >", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails5 >=", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5LessThan(String value) {
            addCriterion("PEDetails5 <", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5LessThanOrEqualTo(String value) {
            addCriterion("PEDetails5 <=", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5Like(String value) {
            addCriterion("PEDetails5 like", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5NotLike(String value) {
            addCriterion("PEDetails5 not like", value, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5In(List<String> values) {
            addCriterion("PEDetails5 in", values, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5NotIn(List<String> values) {
            addCriterion("PEDetails5 not in", values, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5Between(String value1, String value2) {
            addCriterion("PEDetails5 between", value1, value2, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails5NotBetween(String value1, String value2) {
            addCriterion("PEDetails5 not between", value1, value2, "pedetails5");
            return (Criteria) this;
        }

        public Criteria andPedetails6IsNull() {
            addCriterion("PEDetails6 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails6IsNotNull() {
            addCriterion("PEDetails6 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails6EqualTo(String value) {
            addCriterion("PEDetails6 =", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6NotEqualTo(String value) {
            addCriterion("PEDetails6 <>", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6GreaterThan(String value) {
            addCriterion("PEDetails6 >", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails6 >=", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6LessThan(String value) {
            addCriterion("PEDetails6 <", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6LessThanOrEqualTo(String value) {
            addCriterion("PEDetails6 <=", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6Like(String value) {
            addCriterion("PEDetails6 like", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6NotLike(String value) {
            addCriterion("PEDetails6 not like", value, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6In(List<String> values) {
            addCriterion("PEDetails6 in", values, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6NotIn(List<String> values) {
            addCriterion("PEDetails6 not in", values, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6Between(String value1, String value2) {
            addCriterion("PEDetails6 between", value1, value2, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails6NotBetween(String value1, String value2) {
            addCriterion("PEDetails6 not between", value1, value2, "pedetails6");
            return (Criteria) this;
        }

        public Criteria andPedetails7IsNull() {
            addCriterion("PEDetails7 is null");
            return (Criteria) this;
        }

        public Criteria andPedetails7IsNotNull() {
            addCriterion("PEDetails7 is not null");
            return (Criteria) this;
        }

        public Criteria andPedetails7EqualTo(String value) {
            addCriterion("PEDetails7 =", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7NotEqualTo(String value) {
            addCriterion("PEDetails7 <>", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7GreaterThan(String value) {
            addCriterion("PEDetails7 >", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7GreaterThanOrEqualTo(String value) {
            addCriterion("PEDetails7 >=", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7LessThan(String value) {
            addCriterion("PEDetails7 <", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7LessThanOrEqualTo(String value) {
            addCriterion("PEDetails7 <=", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7Like(String value) {
            addCriterion("PEDetails7 like", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7NotLike(String value) {
            addCriterion("PEDetails7 not like", value, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7In(List<String> values) {
            addCriterion("PEDetails7 in", values, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7NotIn(List<String> values) {
            addCriterion("PEDetails7 not in", values, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7Between(String value1, String value2) {
            addCriterion("PEDetails7 between", value1, value2, "pedetails7");
            return (Criteria) this;
        }

        public Criteria andPedetails7NotBetween(String value1, String value2) {
            addCriterion("PEDetails7 not between", value1, value2, "pedetails7");
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