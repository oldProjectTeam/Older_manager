package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitplanExample() {
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

        public Criteria andVisiplantimeIsNull() {
            addCriterion("visiPlanTime is null");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeIsNotNull() {
            addCriterion("visiPlanTime is not null");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeEqualTo(Date value) {
            addCriterion("visiPlanTime =", value, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeNotEqualTo(Date value) {
            addCriterion("visiPlanTime <>", value, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeGreaterThan(Date value) {
            addCriterion("visiPlanTime >", value, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("visiPlanTime >=", value, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeLessThan(Date value) {
            addCriterion("visiPlanTime <", value, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeLessThanOrEqualTo(Date value) {
            addCriterion("visiPlanTime <=", value, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeIn(List<Date> values) {
            addCriterion("visiPlanTime in", values, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeNotIn(List<Date> values) {
            addCriterion("visiPlanTime not in", values, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeBetween(Date value1, Date value2) {
            addCriterion("visiPlanTime between", value1, value2, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andVisiplantimeNotBetween(Date value1, Date value2) {
            addCriterion("visiPlanTime not between", value1, value2, "visiplantime");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsIsNull() {
            addCriterion("plannedVisits is null");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsIsNotNull() {
            addCriterion("plannedVisits is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsEqualTo(String value) {
            addCriterion("plannedVisits =", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsNotEqualTo(String value) {
            addCriterion("plannedVisits <>", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsGreaterThan(String value) {
            addCriterion("plannedVisits >", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsGreaterThanOrEqualTo(String value) {
            addCriterion("plannedVisits >=", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsLessThan(String value) {
            addCriterion("plannedVisits <", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsLessThanOrEqualTo(String value) {
            addCriterion("plannedVisits <=", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsLike(String value) {
            addCriterion("plannedVisits like", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsNotLike(String value) {
            addCriterion("plannedVisits not like", value, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsIn(List<String> values) {
            addCriterion("plannedVisits in", values, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsNotIn(List<String> values) {
            addCriterion("plannedVisits not in", values, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsBetween(String value1, String value2) {
            addCriterion("plannedVisits between", value1, value2, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andPlannedvisitsNotBetween(String value1, String value2) {
            addCriterion("plannedVisits not between", value1, value2, "plannedvisits");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeIsNull() {
            addCriterion("remindVistitPlanTime is null");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeIsNotNull() {
            addCriterion("remindVistitPlanTime is not null");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeEqualTo(Date value) {
            addCriterion("remindVistitPlanTime =", value, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeNotEqualTo(Date value) {
            addCriterion("remindVistitPlanTime <>", value, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeGreaterThan(Date value) {
            addCriterion("remindVistitPlanTime >", value, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remindVistitPlanTime >=", value, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeLessThan(Date value) {
            addCriterion("remindVistitPlanTime <", value, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeLessThanOrEqualTo(Date value) {
            addCriterion("remindVistitPlanTime <=", value, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeIn(List<Date> values) {
            addCriterion("remindVistitPlanTime in", values, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeNotIn(List<Date> values) {
            addCriterion("remindVistitPlanTime not in", values, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeBetween(Date value1, Date value2) {
            addCriterion("remindVistitPlanTime between", value1, value2, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindvistitplantimeNotBetween(Date value1, Date value2) {
            addCriterion("remindVistitPlanTime not between", value1, value2, "remindvistitplantime");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleIsNull() {
            addCriterion("remindPeople is null");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleIsNotNull() {
            addCriterion("remindPeople is not null");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleEqualTo(String value) {
            addCriterion("remindPeople =", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleNotEqualTo(String value) {
            addCriterion("remindPeople <>", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleGreaterThan(String value) {
            addCriterion("remindPeople >", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("remindPeople >=", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleLessThan(String value) {
            addCriterion("remindPeople <", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleLessThanOrEqualTo(String value) {
            addCriterion("remindPeople <=", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleLike(String value) {
            addCriterion("remindPeople like", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleNotLike(String value) {
            addCriterion("remindPeople not like", value, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleIn(List<String> values) {
            addCriterion("remindPeople in", values, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleNotIn(List<String> values) {
            addCriterion("remindPeople not in", values, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleBetween(String value1, String value2) {
            addCriterion("remindPeople between", value1, value2, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andRemindpeopleNotBetween(String value1, String value2) {
            addCriterion("remindPeople not between", value1, value2, "remindpeople");
            return (Criteria) this;
        }

        public Criteria andPendingeventIsNull() {
            addCriterion("pendingEvent is null");
            return (Criteria) this;
        }

        public Criteria andPendingeventIsNotNull() {
            addCriterion("pendingEvent is not null");
            return (Criteria) this;
        }

        public Criteria andPendingeventEqualTo(String value) {
            addCriterion("pendingEvent =", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventNotEqualTo(String value) {
            addCriterion("pendingEvent <>", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventGreaterThan(String value) {
            addCriterion("pendingEvent >", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventGreaterThanOrEqualTo(String value) {
            addCriterion("pendingEvent >=", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventLessThan(String value) {
            addCriterion("pendingEvent <", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventLessThanOrEqualTo(String value) {
            addCriterion("pendingEvent <=", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventLike(String value) {
            addCriterion("pendingEvent like", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventNotLike(String value) {
            addCriterion("pendingEvent not like", value, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventIn(List<String> values) {
            addCriterion("pendingEvent in", values, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventNotIn(List<String> values) {
            addCriterion("pendingEvent not in", values, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventBetween(String value1, String value2) {
            addCriterion("pendingEvent between", value1, value2, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andPendingeventNotBetween(String value1, String value2) {
            addCriterion("pendingEvent not between", value1, value2, "pendingevent");
            return (Criteria) this;
        }

        public Criteria andActualtimeIsNull() {
            addCriterion("actualTime is null");
            return (Criteria) this;
        }

        public Criteria andActualtimeIsNotNull() {
            addCriterion("actualTime is not null");
            return (Criteria) this;
        }

        public Criteria andActualtimeEqualTo(Date value) {
            addCriterion("actualTime =", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotEqualTo(Date value) {
            addCriterion("actualTime <>", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeGreaterThan(Date value) {
            addCriterion("actualTime >", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("actualTime >=", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeLessThan(Date value) {
            addCriterion("actualTime <", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeLessThanOrEqualTo(Date value) {
            addCriterion("actualTime <=", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeIn(List<Date> values) {
            addCriterion("actualTime in", values, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotIn(List<Date> values) {
            addCriterion("actualTime not in", values, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeBetween(Date value1, Date value2) {
            addCriterion("actualTime between", value1, value2, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotBetween(Date value1, Date value2) {
            addCriterion("actualTime not between", value1, value2, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsIsNull() {
            addCriterion("actualPlannedVisits is null");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsIsNotNull() {
            addCriterion("actualPlannedVisits is not null");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsEqualTo(String value) {
            addCriterion("actualPlannedVisits =", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsNotEqualTo(String value) {
            addCriterion("actualPlannedVisits <>", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsGreaterThan(String value) {
            addCriterion("actualPlannedVisits >", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsGreaterThanOrEqualTo(String value) {
            addCriterion("actualPlannedVisits >=", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsLessThan(String value) {
            addCriterion("actualPlannedVisits <", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsLessThanOrEqualTo(String value) {
            addCriterion("actualPlannedVisits <=", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsLike(String value) {
            addCriterion("actualPlannedVisits like", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsNotLike(String value) {
            addCriterion("actualPlannedVisits not like", value, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsIn(List<String> values) {
            addCriterion("actualPlannedVisits in", values, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsNotIn(List<String> values) {
            addCriterion("actualPlannedVisits not in", values, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsBetween(String value1, String value2) {
            addCriterion("actualPlannedVisits between", value1, value2, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andActualplannedvisitsNotBetween(String value1, String value2) {
            addCriterion("actualPlannedVisits not between", value1, value2, "actualplannedvisits");
            return (Criteria) this;
        }

        public Criteria andVisitrecordIsNull() {
            addCriterion("visitRecord is null");
            return (Criteria) this;
        }

        public Criteria andVisitrecordIsNotNull() {
            addCriterion("visitRecord is not null");
            return (Criteria) this;
        }

        public Criteria andVisitrecordEqualTo(String value) {
            addCriterion("visitRecord =", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordNotEqualTo(String value) {
            addCriterion("visitRecord <>", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordGreaterThan(String value) {
            addCriterion("visitRecord >", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordGreaterThanOrEqualTo(String value) {
            addCriterion("visitRecord >=", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordLessThan(String value) {
            addCriterion("visitRecord <", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordLessThanOrEqualTo(String value) {
            addCriterion("visitRecord <=", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordLike(String value) {
            addCriterion("visitRecord like", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordNotLike(String value) {
            addCriterion("visitRecord not like", value, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordIn(List<String> values) {
            addCriterion("visitRecord in", values, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordNotIn(List<String> values) {
            addCriterion("visitRecord not in", values, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordBetween(String value1, String value2) {
            addCriterion("visitRecord between", value1, value2, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andVisitrecordNotBetween(String value1, String value2) {
            addCriterion("visitRecord not between", value1, value2, "visitrecord");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andRecordingIsNull() {
            addCriterion("recording is null");
            return (Criteria) this;
        }

        public Criteria andRecordingIsNotNull() {
            addCriterion("recording is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingEqualTo(String value) {
            addCriterion("recording =", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotEqualTo(String value) {
            addCriterion("recording <>", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingGreaterThan(String value) {
            addCriterion("recording >", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingGreaterThanOrEqualTo(String value) {
            addCriterion("recording >=", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingLessThan(String value) {
            addCriterion("recording <", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingLessThanOrEqualTo(String value) {
            addCriterion("recording <=", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingLike(String value) {
            addCriterion("recording like", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotLike(String value) {
            addCriterion("recording not like", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingIn(List<String> values) {
            addCriterion("recording in", values, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotIn(List<String> values) {
            addCriterion("recording not in", values, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingBetween(String value1, String value2) {
            addCriterion("recording between", value1, value2, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotBetween(String value1, String value2) {
            addCriterion("recording not between", value1, value2, "recording");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andVisitplan1IsNull() {
            addCriterion("visitPlan1 is null");
            return (Criteria) this;
        }

        public Criteria andVisitplan1IsNotNull() {
            addCriterion("visitPlan1 is not null");
            return (Criteria) this;
        }

        public Criteria andVisitplan1EqualTo(String value) {
            addCriterion("visitPlan1 =", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1NotEqualTo(String value) {
            addCriterion("visitPlan1 <>", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1GreaterThan(String value) {
            addCriterion("visitPlan1 >", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1GreaterThanOrEqualTo(String value) {
            addCriterion("visitPlan1 >=", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1LessThan(String value) {
            addCriterion("visitPlan1 <", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1LessThanOrEqualTo(String value) {
            addCriterion("visitPlan1 <=", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1Like(String value) {
            addCriterion("visitPlan1 like", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1NotLike(String value) {
            addCriterion("visitPlan1 not like", value, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1In(List<String> values) {
            addCriterion("visitPlan1 in", values, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1NotIn(List<String> values) {
            addCriterion("visitPlan1 not in", values, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1Between(String value1, String value2) {
            addCriterion("visitPlan1 between", value1, value2, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan1NotBetween(String value1, String value2) {
            addCriterion("visitPlan1 not between", value1, value2, "visitplan1");
            return (Criteria) this;
        }

        public Criteria andVisitplan2IsNull() {
            addCriterion("visitPlan2 is null");
            return (Criteria) this;
        }

        public Criteria andVisitplan2IsNotNull() {
            addCriterion("visitPlan2 is not null");
            return (Criteria) this;
        }

        public Criteria andVisitplan2EqualTo(String value) {
            addCriterion("visitPlan2 =", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2NotEqualTo(String value) {
            addCriterion("visitPlan2 <>", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2GreaterThan(String value) {
            addCriterion("visitPlan2 >", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2GreaterThanOrEqualTo(String value) {
            addCriterion("visitPlan2 >=", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2LessThan(String value) {
            addCriterion("visitPlan2 <", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2LessThanOrEqualTo(String value) {
            addCriterion("visitPlan2 <=", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2Like(String value) {
            addCriterion("visitPlan2 like", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2NotLike(String value) {
            addCriterion("visitPlan2 not like", value, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2In(List<String> values) {
            addCriterion("visitPlan2 in", values, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2NotIn(List<String> values) {
            addCriterion("visitPlan2 not in", values, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2Between(String value1, String value2) {
            addCriterion("visitPlan2 between", value1, value2, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan2NotBetween(String value1, String value2) {
            addCriterion("visitPlan2 not between", value1, value2, "visitplan2");
            return (Criteria) this;
        }

        public Criteria andVisitplan3IsNull() {
            addCriterion("visitPlan3 is null");
            return (Criteria) this;
        }

        public Criteria andVisitplan3IsNotNull() {
            addCriterion("visitPlan3 is not null");
            return (Criteria) this;
        }

        public Criteria andVisitplan3EqualTo(String value) {
            addCriterion("visitPlan3 =", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3NotEqualTo(String value) {
            addCriterion("visitPlan3 <>", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3GreaterThan(String value) {
            addCriterion("visitPlan3 >", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3GreaterThanOrEqualTo(String value) {
            addCriterion("visitPlan3 >=", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3LessThan(String value) {
            addCriterion("visitPlan3 <", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3LessThanOrEqualTo(String value) {
            addCriterion("visitPlan3 <=", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3Like(String value) {
            addCriterion("visitPlan3 like", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3NotLike(String value) {
            addCriterion("visitPlan3 not like", value, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3In(List<String> values) {
            addCriterion("visitPlan3 in", values, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3NotIn(List<String> values) {
            addCriterion("visitPlan3 not in", values, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3Between(String value1, String value2) {
            addCriterion("visitPlan3 between", value1, value2, "visitplan3");
            return (Criteria) this;
        }

        public Criteria andVisitplan3NotBetween(String value1, String value2) {
            addCriterion("visitPlan3 not between", value1, value2, "visitplan3");
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