package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakedrugdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakedrugdetailsExample() {
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

        public Criteria andMedicinesIsNull() {
            addCriterion("medicines is null");
            return (Criteria) this;
        }

        public Criteria andMedicinesIsNotNull() {
            addCriterion("medicines is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinesEqualTo(String value) {
            addCriterion("medicines =", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesNotEqualTo(String value) {
            addCriterion("medicines <>", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesGreaterThan(String value) {
            addCriterion("medicines >", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesGreaterThanOrEqualTo(String value) {
            addCriterion("medicines >=", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesLessThan(String value) {
            addCriterion("medicines <", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesLessThanOrEqualTo(String value) {
            addCriterion("medicines <=", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesLike(String value) {
            addCriterion("medicines like", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesNotLike(String value) {
            addCriterion("medicines not like", value, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesIn(List<String> values) {
            addCriterion("medicines in", values, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesNotIn(List<String> values) {
            addCriterion("medicines not in", values, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesBetween(String value1, String value2) {
            addCriterion("medicines between", value1, value2, "medicines");
            return (Criteria) this;
        }

        public Criteria andMedicinesNotBetween(String value1, String value2) {
            addCriterion("medicines not between", value1, value2, "medicines");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateIsNull() {
            addCriterion("startTakingDate is null");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateIsNotNull() {
            addCriterion("startTakingDate is not null");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateEqualTo(Date value) {
            addCriterion("startTakingDate =", value, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateNotEqualTo(Date value) {
            addCriterion("startTakingDate <>", value, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateGreaterThan(Date value) {
            addCriterion("startTakingDate >", value, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startTakingDate >=", value, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateLessThan(Date value) {
            addCriterion("startTakingDate <", value, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateLessThanOrEqualTo(Date value) {
            addCriterion("startTakingDate <=", value, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateIn(List<Date> values) {
            addCriterion("startTakingDate in", values, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateNotIn(List<Date> values) {
            addCriterion("startTakingDate not in", values, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateBetween(Date value1, Date value2) {
            addCriterion("startTakingDate between", value1, value2, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andStarttakingdateNotBetween(Date value1, Date value2) {
            addCriterion("startTakingDate not between", value1, value2, "starttakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateIsNull() {
            addCriterion("endTakingDate is null");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateIsNotNull() {
            addCriterion("endTakingDate is not null");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateEqualTo(Date value) {
            addCriterion("endTakingDate =", value, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateNotEqualTo(Date value) {
            addCriterion("endTakingDate <>", value, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateGreaterThan(Date value) {
            addCriterion("endTakingDate >", value, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("endTakingDate >=", value, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateLessThan(Date value) {
            addCriterion("endTakingDate <", value, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateLessThanOrEqualTo(Date value) {
            addCriterion("endTakingDate <=", value, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateIn(List<Date> values) {
            addCriterion("endTakingDate in", values, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateNotIn(List<Date> values) {
            addCriterion("endTakingDate not in", values, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateBetween(Date value1, Date value2) {
            addCriterion("endTakingDate between", value1, value2, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andEndtakingdateNotBetween(Date value1, Date value2) {
            addCriterion("endTakingDate not between", value1, value2, "endtakingdate");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(String value) {
            addCriterion("dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(String value) {
            addCriterion("dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(String value) {
            addCriterion("dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(String value) {
            addCriterion("dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(String value) {
            addCriterion("dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(String value) {
            addCriterion("dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLike(String value) {
            addCriterion("dosage like", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotLike(String value) {
            addCriterion("dosage not like", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<String> values) {
            addCriterion("dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<String> values) {
            addCriterion("dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(String value1, String value2) {
            addCriterion("dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(String value1, String value2) {
            addCriterion("dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andMethoduseIsNull() {
            addCriterion("methodUse is null");
            return (Criteria) this;
        }

        public Criteria andMethoduseIsNotNull() {
            addCriterion("methodUse is not null");
            return (Criteria) this;
        }

        public Criteria andMethoduseEqualTo(String value) {
            addCriterion("methodUse =", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseNotEqualTo(String value) {
            addCriterion("methodUse <>", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseGreaterThan(String value) {
            addCriterion("methodUse >", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseGreaterThanOrEqualTo(String value) {
            addCriterion("methodUse >=", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseLessThan(String value) {
            addCriterion("methodUse <", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseLessThanOrEqualTo(String value) {
            addCriterion("methodUse <=", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseLike(String value) {
            addCriterion("methodUse like", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseNotLike(String value) {
            addCriterion("methodUse not like", value, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseIn(List<String> values) {
            addCriterion("methodUse in", values, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseNotIn(List<String> values) {
            addCriterion("methodUse not in", values, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseBetween(String value1, String value2) {
            addCriterion("methodUse between", value1, value2, "methoduse");
            return (Criteria) this;
        }

        public Criteria andMethoduseNotBetween(String value1, String value2) {
            addCriterion("methodUse not between", value1, value2, "methoduse");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
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

        public Criteria andTakedrugdetails1IsNull() {
            addCriterion("takeDrugDetails1 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1IsNotNull() {
            addCriterion("takeDrugDetails1 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1EqualTo(String value) {
            addCriterion("takeDrugDetails1 =", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1NotEqualTo(String value) {
            addCriterion("takeDrugDetails1 <>", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1GreaterThan(String value) {
            addCriterion("takeDrugDetails1 >", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails1 >=", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1LessThan(String value) {
            addCriterion("takeDrugDetails1 <", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails1 <=", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1Like(String value) {
            addCriterion("takeDrugDetails1 like", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1NotLike(String value) {
            addCriterion("takeDrugDetails1 not like", value, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1In(List<String> values) {
            addCriterion("takeDrugDetails1 in", values, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1NotIn(List<String> values) {
            addCriterion("takeDrugDetails1 not in", values, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1Between(String value1, String value2) {
            addCriterion("takeDrugDetails1 between", value1, value2, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails1NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails1 not between", value1, value2, "takedrugdetails1");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2IsNull() {
            addCriterion("takeDrugDetails2 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2IsNotNull() {
            addCriterion("takeDrugDetails2 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2EqualTo(String value) {
            addCriterion("takeDrugDetails2 =", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2NotEqualTo(String value) {
            addCriterion("takeDrugDetails2 <>", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2GreaterThan(String value) {
            addCriterion("takeDrugDetails2 >", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails2 >=", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2LessThan(String value) {
            addCriterion("takeDrugDetails2 <", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails2 <=", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2Like(String value) {
            addCriterion("takeDrugDetails2 like", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2NotLike(String value) {
            addCriterion("takeDrugDetails2 not like", value, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2In(List<String> values) {
            addCriterion("takeDrugDetails2 in", values, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2NotIn(List<String> values) {
            addCriterion("takeDrugDetails2 not in", values, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2Between(String value1, String value2) {
            addCriterion("takeDrugDetails2 between", value1, value2, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails2NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails2 not between", value1, value2, "takedrugdetails2");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3IsNull() {
            addCriterion("takeDrugDetails3 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3IsNotNull() {
            addCriterion("takeDrugDetails3 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3EqualTo(String value) {
            addCriterion("takeDrugDetails3 =", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3NotEqualTo(String value) {
            addCriterion("takeDrugDetails3 <>", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3GreaterThan(String value) {
            addCriterion("takeDrugDetails3 >", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails3 >=", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3LessThan(String value) {
            addCriterion("takeDrugDetails3 <", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails3 <=", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3Like(String value) {
            addCriterion("takeDrugDetails3 like", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3NotLike(String value) {
            addCriterion("takeDrugDetails3 not like", value, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3In(List<String> values) {
            addCriterion("takeDrugDetails3 in", values, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3NotIn(List<String> values) {
            addCriterion("takeDrugDetails3 not in", values, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3Between(String value1, String value2) {
            addCriterion("takeDrugDetails3 between", value1, value2, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails3NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails3 not between", value1, value2, "takedrugdetails3");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4IsNull() {
            addCriterion("takeDrugDetails4 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4IsNotNull() {
            addCriterion("takeDrugDetails4 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4EqualTo(String value) {
            addCriterion("takeDrugDetails4 =", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4NotEqualTo(String value) {
            addCriterion("takeDrugDetails4 <>", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4GreaterThan(String value) {
            addCriterion("takeDrugDetails4 >", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails4 >=", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4LessThan(String value) {
            addCriterion("takeDrugDetails4 <", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails4 <=", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4Like(String value) {
            addCriterion("takeDrugDetails4 like", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4NotLike(String value) {
            addCriterion("takeDrugDetails4 not like", value, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4In(List<String> values) {
            addCriterion("takeDrugDetails4 in", values, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4NotIn(List<String> values) {
            addCriterion("takeDrugDetails4 not in", values, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4Between(String value1, String value2) {
            addCriterion("takeDrugDetails4 between", value1, value2, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails4NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails4 not between", value1, value2, "takedrugdetails4");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5IsNull() {
            addCriterion("takeDrugDetails5 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5IsNotNull() {
            addCriterion("takeDrugDetails5 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5EqualTo(String value) {
            addCriterion("takeDrugDetails5 =", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5NotEqualTo(String value) {
            addCriterion("takeDrugDetails5 <>", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5GreaterThan(String value) {
            addCriterion("takeDrugDetails5 >", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails5 >=", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5LessThan(String value) {
            addCriterion("takeDrugDetails5 <", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails5 <=", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5Like(String value) {
            addCriterion("takeDrugDetails5 like", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5NotLike(String value) {
            addCriterion("takeDrugDetails5 not like", value, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5In(List<String> values) {
            addCriterion("takeDrugDetails5 in", values, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5NotIn(List<String> values) {
            addCriterion("takeDrugDetails5 not in", values, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5Between(String value1, String value2) {
            addCriterion("takeDrugDetails5 between", value1, value2, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails5NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails5 not between", value1, value2, "takedrugdetails5");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6IsNull() {
            addCriterion("takeDrugDetails6 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6IsNotNull() {
            addCriterion("takeDrugDetails6 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6EqualTo(String value) {
            addCriterion("takeDrugDetails6 =", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6NotEqualTo(String value) {
            addCriterion("takeDrugDetails6 <>", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6GreaterThan(String value) {
            addCriterion("takeDrugDetails6 >", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails6 >=", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6LessThan(String value) {
            addCriterion("takeDrugDetails6 <", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails6 <=", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6Like(String value) {
            addCriterion("takeDrugDetails6 like", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6NotLike(String value) {
            addCriterion("takeDrugDetails6 not like", value, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6In(List<String> values) {
            addCriterion("takeDrugDetails6 in", values, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6NotIn(List<String> values) {
            addCriterion("takeDrugDetails6 not in", values, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6Between(String value1, String value2) {
            addCriterion("takeDrugDetails6 between", value1, value2, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails6NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails6 not between", value1, value2, "takedrugdetails6");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7IsNull() {
            addCriterion("takeDrugDetails7 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7IsNotNull() {
            addCriterion("takeDrugDetails7 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7EqualTo(String value) {
            addCriterion("takeDrugDetails7 =", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7NotEqualTo(String value) {
            addCriterion("takeDrugDetails7 <>", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7GreaterThan(String value) {
            addCriterion("takeDrugDetails7 >", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails7 >=", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7LessThan(String value) {
            addCriterion("takeDrugDetails7 <", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails7 <=", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7Like(String value) {
            addCriterion("takeDrugDetails7 like", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7NotLike(String value) {
            addCriterion("takeDrugDetails7 not like", value, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7In(List<String> values) {
            addCriterion("takeDrugDetails7 in", values, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7NotIn(List<String> values) {
            addCriterion("takeDrugDetails7 not in", values, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7Between(String value1, String value2) {
            addCriterion("takeDrugDetails7 between", value1, value2, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails7NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails7 not between", value1, value2, "takedrugdetails7");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8IsNull() {
            addCriterion("takeDrugDetails8 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8IsNotNull() {
            addCriterion("takeDrugDetails8 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8EqualTo(String value) {
            addCriterion("takeDrugDetails8 =", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8NotEqualTo(String value) {
            addCriterion("takeDrugDetails8 <>", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8GreaterThan(String value) {
            addCriterion("takeDrugDetails8 >", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails8 >=", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8LessThan(String value) {
            addCriterion("takeDrugDetails8 <", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails8 <=", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8Like(String value) {
            addCriterion("takeDrugDetails8 like", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8NotLike(String value) {
            addCriterion("takeDrugDetails8 not like", value, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8In(List<String> values) {
            addCriterion("takeDrugDetails8 in", values, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8NotIn(List<String> values) {
            addCriterion("takeDrugDetails8 not in", values, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8Between(String value1, String value2) {
            addCriterion("takeDrugDetails8 between", value1, value2, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails8NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails8 not between", value1, value2, "takedrugdetails8");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9IsNull() {
            addCriterion("takeDrugDetails9 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9IsNotNull() {
            addCriterion("takeDrugDetails9 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9EqualTo(String value) {
            addCriterion("takeDrugDetails9 =", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9NotEqualTo(String value) {
            addCriterion("takeDrugDetails9 <>", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9GreaterThan(String value) {
            addCriterion("takeDrugDetails9 >", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails9 >=", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9LessThan(String value) {
            addCriterion("takeDrugDetails9 <", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails9 <=", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9Like(String value) {
            addCriterion("takeDrugDetails9 like", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9NotLike(String value) {
            addCriterion("takeDrugDetails9 not like", value, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9In(List<String> values) {
            addCriterion("takeDrugDetails9 in", values, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9NotIn(List<String> values) {
            addCriterion("takeDrugDetails9 not in", values, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9Between(String value1, String value2) {
            addCriterion("takeDrugDetails9 between", value1, value2, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails9NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails9 not between", value1, value2, "takedrugdetails9");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10IsNull() {
            addCriterion("takeDrugDetails10 is null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10IsNotNull() {
            addCriterion("takeDrugDetails10 is not null");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10EqualTo(String value) {
            addCriterion("takeDrugDetails10 =", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10NotEqualTo(String value) {
            addCriterion("takeDrugDetails10 <>", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10GreaterThan(String value) {
            addCriterion("takeDrugDetails10 >", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10GreaterThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails10 >=", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10LessThan(String value) {
            addCriterion("takeDrugDetails10 <", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10LessThanOrEqualTo(String value) {
            addCriterion("takeDrugDetails10 <=", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10Like(String value) {
            addCriterion("takeDrugDetails10 like", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10NotLike(String value) {
            addCriterion("takeDrugDetails10 not like", value, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10In(List<String> values) {
            addCriterion("takeDrugDetails10 in", values, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10NotIn(List<String> values) {
            addCriterion("takeDrugDetails10 not in", values, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10Between(String value1, String value2) {
            addCriterion("takeDrugDetails10 between", value1, value2, "takedrugdetails10");
            return (Criteria) this;
        }

        public Criteria andTakedrugdetails10NotBetween(String value1, String value2) {
            addCriterion("takeDrugDetails10 not between", value1, value2, "takedrugdetails10");
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