package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class UsehealthproductdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsehealthproductdetailsExample() {
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

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andBuypatternsIsNull() {
            addCriterion("buyPatterns is null");
            return (Criteria) this;
        }

        public Criteria andBuypatternsIsNotNull() {
            addCriterion("buyPatterns is not null");
            return (Criteria) this;
        }

        public Criteria andBuypatternsEqualTo(String value) {
            addCriterion("buyPatterns =", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsNotEqualTo(String value) {
            addCriterion("buyPatterns <>", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsGreaterThan(String value) {
            addCriterion("buyPatterns >", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsGreaterThanOrEqualTo(String value) {
            addCriterion("buyPatterns >=", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsLessThan(String value) {
            addCriterion("buyPatterns <", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsLessThanOrEqualTo(String value) {
            addCriterion("buyPatterns <=", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsLike(String value) {
            addCriterion("buyPatterns like", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsNotLike(String value) {
            addCriterion("buyPatterns not like", value, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsIn(List<String> values) {
            addCriterion("buyPatterns in", values, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsNotIn(List<String> values) {
            addCriterion("buyPatterns not in", values, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsBetween(String value1, String value2) {
            addCriterion("buyPatterns between", value1, value2, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andBuypatternsNotBetween(String value1, String value2) {
            addCriterion("buyPatterns not between", value1, value2, "buypatterns");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyIsNull() {
            addCriterion("spendMoney is null");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyIsNotNull() {
            addCriterion("spendMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyEqualTo(Double value) {
            addCriterion("spendMoney =", value, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyNotEqualTo(Double value) {
            addCriterion("spendMoney <>", value, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyGreaterThan(Double value) {
            addCriterion("spendMoney >", value, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("spendMoney >=", value, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyLessThan(Double value) {
            addCriterion("spendMoney <", value, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyLessThanOrEqualTo(Double value) {
            addCriterion("spendMoney <=", value, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyIn(List<Double> values) {
            addCriterion("spendMoney in", values, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyNotIn(List<Double> values) {
            addCriterion("spendMoney not in", values, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyBetween(Double value1, Double value2) {
            addCriterion("spendMoney between", value1, value2, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSpendmoneyNotBetween(Double value1, Double value2) {
            addCriterion("spendMoney not between", value1, value2, "spendmoney");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemIsNull() {
            addCriterion("solvedProblem is null");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemIsNotNull() {
            addCriterion("solvedProblem is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemEqualTo(String value) {
            addCriterion("solvedProblem =", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemNotEqualTo(String value) {
            addCriterion("solvedProblem <>", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemGreaterThan(String value) {
            addCriterion("solvedProblem >", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemGreaterThanOrEqualTo(String value) {
            addCriterion("solvedProblem >=", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemLessThan(String value) {
            addCriterion("solvedProblem <", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemLessThanOrEqualTo(String value) {
            addCriterion("solvedProblem <=", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemLike(String value) {
            addCriterion("solvedProblem like", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemNotLike(String value) {
            addCriterion("solvedProblem not like", value, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemIn(List<String> values) {
            addCriterion("solvedProblem in", values, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemNotIn(List<String> values) {
            addCriterion("solvedProblem not in", values, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemBetween(String value1, String value2) {
            addCriterion("solvedProblem between", value1, value2, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andSolvedproblemNotBetween(String value1, String value2) {
            addCriterion("solvedProblem not between", value1, value2, "solvedproblem");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(String value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(String value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(String value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(String value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(String value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(String value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLike(String value) {
            addCriterion("effect like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotLike(String value) {
            addCriterion("effect not like", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<String> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<String> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(String value1, String value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(String value1, String value2) {
            addCriterion("effect not between", value1, value2, "effect");
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

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1IsNull() {
            addCriterion("useHealthProductDetails1 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1IsNotNull() {
            addCriterion("useHealthProductDetails1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1EqualTo(String value) {
            addCriterion("useHealthProductDetails1 =", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1NotEqualTo(String value) {
            addCriterion("useHealthProductDetails1 <>", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1GreaterThan(String value) {
            addCriterion("useHealthProductDetails1 >", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails1 >=", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1LessThan(String value) {
            addCriterion("useHealthProductDetails1 <", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails1 <=", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1Like(String value) {
            addCriterion("useHealthProductDetails1 like", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1NotLike(String value) {
            addCriterion("useHealthProductDetails1 not like", value, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1In(List<String> values) {
            addCriterion("useHealthProductDetails1 in", values, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1NotIn(List<String> values) {
            addCriterion("useHealthProductDetails1 not in", values, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1Between(String value1, String value2) {
            addCriterion("useHealthProductDetails1 between", value1, value2, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails1NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails1 not between", value1, value2, "usehealthproductdetails1");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2IsNull() {
            addCriterion("useHealthProductDetails2 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2IsNotNull() {
            addCriterion("useHealthProductDetails2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2EqualTo(String value) {
            addCriterion("useHealthProductDetails2 =", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2NotEqualTo(String value) {
            addCriterion("useHealthProductDetails2 <>", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2GreaterThan(String value) {
            addCriterion("useHealthProductDetails2 >", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails2 >=", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2LessThan(String value) {
            addCriterion("useHealthProductDetails2 <", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails2 <=", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2Like(String value) {
            addCriterion("useHealthProductDetails2 like", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2NotLike(String value) {
            addCriterion("useHealthProductDetails2 not like", value, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2In(List<String> values) {
            addCriterion("useHealthProductDetails2 in", values, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2NotIn(List<String> values) {
            addCriterion("useHealthProductDetails2 not in", values, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2Between(String value1, String value2) {
            addCriterion("useHealthProductDetails2 between", value1, value2, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails2NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails2 not between", value1, value2, "usehealthproductdetails2");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3IsNull() {
            addCriterion("useHealthProductDetails3 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3IsNotNull() {
            addCriterion("useHealthProductDetails3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3EqualTo(String value) {
            addCriterion("useHealthProductDetails3 =", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3NotEqualTo(String value) {
            addCriterion("useHealthProductDetails3 <>", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3GreaterThan(String value) {
            addCriterion("useHealthProductDetails3 >", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails3 >=", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3LessThan(String value) {
            addCriterion("useHealthProductDetails3 <", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails3 <=", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3Like(String value) {
            addCriterion("useHealthProductDetails3 like", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3NotLike(String value) {
            addCriterion("useHealthProductDetails3 not like", value, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3In(List<String> values) {
            addCriterion("useHealthProductDetails3 in", values, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3NotIn(List<String> values) {
            addCriterion("useHealthProductDetails3 not in", values, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3Between(String value1, String value2) {
            addCriterion("useHealthProductDetails3 between", value1, value2, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails3NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails3 not between", value1, value2, "usehealthproductdetails3");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4IsNull() {
            addCriterion("useHealthProductDetails4 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4IsNotNull() {
            addCriterion("useHealthProductDetails4 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4EqualTo(String value) {
            addCriterion("useHealthProductDetails4 =", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4NotEqualTo(String value) {
            addCriterion("useHealthProductDetails4 <>", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4GreaterThan(String value) {
            addCriterion("useHealthProductDetails4 >", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails4 >=", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4LessThan(String value) {
            addCriterion("useHealthProductDetails4 <", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails4 <=", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4Like(String value) {
            addCriterion("useHealthProductDetails4 like", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4NotLike(String value) {
            addCriterion("useHealthProductDetails4 not like", value, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4In(List<String> values) {
            addCriterion("useHealthProductDetails4 in", values, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4NotIn(List<String> values) {
            addCriterion("useHealthProductDetails4 not in", values, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4Between(String value1, String value2) {
            addCriterion("useHealthProductDetails4 between", value1, value2, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails4NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails4 not between", value1, value2, "usehealthproductdetails4");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5IsNull() {
            addCriterion("useHealthProductDetails5 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5IsNotNull() {
            addCriterion("useHealthProductDetails5 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5EqualTo(String value) {
            addCriterion("useHealthProductDetails5 =", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5NotEqualTo(String value) {
            addCriterion("useHealthProductDetails5 <>", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5GreaterThan(String value) {
            addCriterion("useHealthProductDetails5 >", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails5 >=", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5LessThan(String value) {
            addCriterion("useHealthProductDetails5 <", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails5 <=", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5Like(String value) {
            addCriterion("useHealthProductDetails5 like", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5NotLike(String value) {
            addCriterion("useHealthProductDetails5 not like", value, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5In(List<String> values) {
            addCriterion("useHealthProductDetails5 in", values, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5NotIn(List<String> values) {
            addCriterion("useHealthProductDetails5 not in", values, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5Between(String value1, String value2) {
            addCriterion("useHealthProductDetails5 between", value1, value2, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails5NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails5 not between", value1, value2, "usehealthproductdetails5");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6IsNull() {
            addCriterion("useHealthProductDetails6 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6IsNotNull() {
            addCriterion("useHealthProductDetails6 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6EqualTo(String value) {
            addCriterion("useHealthProductDetails6 =", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6NotEqualTo(String value) {
            addCriterion("useHealthProductDetails6 <>", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6GreaterThan(String value) {
            addCriterion("useHealthProductDetails6 >", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails6 >=", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6LessThan(String value) {
            addCriterion("useHealthProductDetails6 <", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails6 <=", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6Like(String value) {
            addCriterion("useHealthProductDetails6 like", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6NotLike(String value) {
            addCriterion("useHealthProductDetails6 not like", value, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6In(List<String> values) {
            addCriterion("useHealthProductDetails6 in", values, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6NotIn(List<String> values) {
            addCriterion("useHealthProductDetails6 not in", values, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6Between(String value1, String value2) {
            addCriterion("useHealthProductDetails6 between", value1, value2, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails6NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails6 not between", value1, value2, "usehealthproductdetails6");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7IsNull() {
            addCriterion("useHealthProductDetails7 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7IsNotNull() {
            addCriterion("useHealthProductDetails7 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7EqualTo(String value) {
            addCriterion("useHealthProductDetails7 =", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7NotEqualTo(String value) {
            addCriterion("useHealthProductDetails7 <>", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7GreaterThan(String value) {
            addCriterion("useHealthProductDetails7 >", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails7 >=", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7LessThan(String value) {
            addCriterion("useHealthProductDetails7 <", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails7 <=", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7Like(String value) {
            addCriterion("useHealthProductDetails7 like", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7NotLike(String value) {
            addCriterion("useHealthProductDetails7 not like", value, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7In(List<String> values) {
            addCriterion("useHealthProductDetails7 in", values, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7NotIn(List<String> values) {
            addCriterion("useHealthProductDetails7 not in", values, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7Between(String value1, String value2) {
            addCriterion("useHealthProductDetails7 between", value1, value2, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails7NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails7 not between", value1, value2, "usehealthproductdetails7");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8IsNull() {
            addCriterion("useHealthProductDetails8 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8IsNotNull() {
            addCriterion("useHealthProductDetails8 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8EqualTo(String value) {
            addCriterion("useHealthProductDetails8 =", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8NotEqualTo(String value) {
            addCriterion("useHealthProductDetails8 <>", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8GreaterThan(String value) {
            addCriterion("useHealthProductDetails8 >", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails8 >=", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8LessThan(String value) {
            addCriterion("useHealthProductDetails8 <", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails8 <=", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8Like(String value) {
            addCriterion("useHealthProductDetails8 like", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8NotLike(String value) {
            addCriterion("useHealthProductDetails8 not like", value, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8In(List<String> values) {
            addCriterion("useHealthProductDetails8 in", values, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8NotIn(List<String> values) {
            addCriterion("useHealthProductDetails8 not in", values, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8Between(String value1, String value2) {
            addCriterion("useHealthProductDetails8 between", value1, value2, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails8NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails8 not between", value1, value2, "usehealthproductdetails8");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9IsNull() {
            addCriterion("useHealthProductDetails9 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9IsNotNull() {
            addCriterion("useHealthProductDetails9 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9EqualTo(String value) {
            addCriterion("useHealthProductDetails9 =", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9NotEqualTo(String value) {
            addCriterion("useHealthProductDetails9 <>", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9GreaterThan(String value) {
            addCriterion("useHealthProductDetails9 >", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails9 >=", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9LessThan(String value) {
            addCriterion("useHealthProductDetails9 <", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails9 <=", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9Like(String value) {
            addCriterion("useHealthProductDetails9 like", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9NotLike(String value) {
            addCriterion("useHealthProductDetails9 not like", value, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9In(List<String> values) {
            addCriterion("useHealthProductDetails9 in", values, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9NotIn(List<String> values) {
            addCriterion("useHealthProductDetails9 not in", values, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9Between(String value1, String value2) {
            addCriterion("useHealthProductDetails9 between", value1, value2, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails9NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails9 not between", value1, value2, "usehealthproductdetails9");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10IsNull() {
            addCriterion("useHealthProductDetails10 is null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10IsNotNull() {
            addCriterion("useHealthProductDetails10 is not null");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10EqualTo(String value) {
            addCriterion("useHealthProductDetails10 =", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10NotEqualTo(String value) {
            addCriterion("useHealthProductDetails10 <>", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10GreaterThan(String value) {
            addCriterion("useHealthProductDetails10 >", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10GreaterThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails10 >=", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10LessThan(String value) {
            addCriterion("useHealthProductDetails10 <", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10LessThanOrEqualTo(String value) {
            addCriterion("useHealthProductDetails10 <=", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10Like(String value) {
            addCriterion("useHealthProductDetails10 like", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10NotLike(String value) {
            addCriterion("useHealthProductDetails10 not like", value, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10In(List<String> values) {
            addCriterion("useHealthProductDetails10 in", values, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10NotIn(List<String> values) {
            addCriterion("useHealthProductDetails10 not in", values, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10Between(String value1, String value2) {
            addCriterion("useHealthProductDetails10 between", value1, value2, "usehealthproductdetails10");
            return (Criteria) this;
        }

        public Criteria andUsehealthproductdetails10NotBetween(String value1, String value2) {
            addCriterion("useHealthProductDetails10 not between", value1, value2, "usehealthproductdetails10");
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