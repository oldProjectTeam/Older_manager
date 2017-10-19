package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andReleasetimeIsNull() {
            addCriterion("releaseTime is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("releaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(Date value) {
            addCriterion("releaseTime =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(Date value) {
            addCriterion("releaseTime <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(Date value) {
            addCriterion("releaseTime >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("releaseTime >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(Date value) {
            addCriterion("releaseTime <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("releaseTime <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<Date> values) {
            addCriterion("releaseTime in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<Date> values) {
            addCriterion("releaseTime not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(Date value1, Date value2) {
            addCriterion("releaseTime between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("releaseTime not between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeIsNull() {
            addCriterion("activityTime is null");
            return (Criteria) this;
        }

        public Criteria andActivitytimeIsNotNull() {
            addCriterion("activityTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytimeEqualTo(Date value) {
            addCriterion("activityTime =", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeNotEqualTo(Date value) {
            addCriterion("activityTime <>", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeGreaterThan(Date value) {
            addCriterion("activityTime >", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activityTime >=", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeLessThan(Date value) {
            addCriterion("activityTime <", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeLessThanOrEqualTo(Date value) {
            addCriterion("activityTime <=", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeIn(List<Date> values) {
            addCriterion("activityTime in", values, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeNotIn(List<Date> values) {
            addCriterion("activityTime not in", values, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeBetween(Date value1, Date value2) {
            addCriterion("activityTime between", value1, value2, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeNotBetween(Date value1, Date value2) {
            addCriterion("activityTime not between", value1, value2, "activitytime");
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

        public Criteria andRemakeIsNull() {
            addCriterion("remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("remake not between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andReleaseregionIsNull() {
            addCriterion("releaseRegion is null");
            return (Criteria) this;
        }

        public Criteria andReleaseregionIsNotNull() {
            addCriterion("releaseRegion is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseregionEqualTo(String value) {
            addCriterion("releaseRegion =", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionNotEqualTo(String value) {
            addCriterion("releaseRegion <>", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionGreaterThan(String value) {
            addCriterion("releaseRegion >", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionGreaterThanOrEqualTo(String value) {
            addCriterion("releaseRegion >=", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionLessThan(String value) {
            addCriterion("releaseRegion <", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionLessThanOrEqualTo(String value) {
            addCriterion("releaseRegion <=", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionLike(String value) {
            addCriterion("releaseRegion like", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionNotLike(String value) {
            addCriterion("releaseRegion not like", value, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionIn(List<String> values) {
            addCriterion("releaseRegion in", values, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionNotIn(List<String> values) {
            addCriterion("releaseRegion not in", values, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionBetween(String value1, String value2) {
            addCriterion("releaseRegion between", value1, value2, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andReleaseregionNotBetween(String value1, String value2) {
            addCriterion("releaseRegion not between", value1, value2, "releaseregion");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetIsNull() {
            addCriterion("activityOperatingBudget is null");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetIsNotNull() {
            addCriterion("activityOperatingBudget is not null");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetEqualTo(Double value) {
            addCriterion("activityOperatingBudget =", value, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetNotEqualTo(Double value) {
            addCriterion("activityOperatingBudget <>", value, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetGreaterThan(Double value) {
            addCriterion("activityOperatingBudget >", value, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetGreaterThanOrEqualTo(Double value) {
            addCriterion("activityOperatingBudget >=", value, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetLessThan(Double value) {
            addCriterion("activityOperatingBudget <", value, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetLessThanOrEqualTo(Double value) {
            addCriterion("activityOperatingBudget <=", value, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetIn(List<Double> values) {
            addCriterion("activityOperatingBudget in", values, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetNotIn(List<Double> values) {
            addCriterion("activityOperatingBudget not in", values, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetBetween(Double value1, Double value2) {
            addCriterion("activityOperatingBudget between", value1, value2, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andActivityoperatingbudgetNotBetween(Double value1, Double value2) {
            addCriterion("activityOperatingBudget not between", value1, value2, "activityoperatingbudget");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplypeopleIsNull() {
            addCriterion("applyPeople is null");
            return (Criteria) this;
        }

        public Criteria andApplypeopleIsNotNull() {
            addCriterion("applyPeople is not null");
            return (Criteria) this;
        }

        public Criteria andApplypeopleEqualTo(String value) {
            addCriterion("applyPeople =", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleNotEqualTo(String value) {
            addCriterion("applyPeople <>", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleGreaterThan(String value) {
            addCriterion("applyPeople >", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleGreaterThanOrEqualTo(String value) {
            addCriterion("applyPeople >=", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleLessThan(String value) {
            addCriterion("applyPeople <", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleLessThanOrEqualTo(String value) {
            addCriterion("applyPeople <=", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleLike(String value) {
            addCriterion("applyPeople like", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleNotLike(String value) {
            addCriterion("applyPeople not like", value, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleIn(List<String> values) {
            addCriterion("applyPeople in", values, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleNotIn(List<String> values) {
            addCriterion("applyPeople not in", values, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleBetween(String value1, String value2) {
            addCriterion("applyPeople between", value1, value2, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApplypeopleNotBetween(String value1, String value2) {
            addCriterion("applyPeople not between", value1, value2, "applypeople");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNull() {
            addCriterion("approvalState is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNotNull() {
            addCriterion("approvalState is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateEqualTo(String value) {
            addCriterion("approvalState =", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotEqualTo(String value) {
            addCriterion("approvalState <>", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThan(String value) {
            addCriterion("approvalState >", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThanOrEqualTo(String value) {
            addCriterion("approvalState >=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThan(String value) {
            addCriterion("approvalState <", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThanOrEqualTo(String value) {
            addCriterion("approvalState <=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLike(String value) {
            addCriterion("approvalState like", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotLike(String value) {
            addCriterion("approvalState not like", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIn(List<String> values) {
            addCriterion("approvalState in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotIn(List<String> values) {
            addCriterion("approvalState not in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateBetween(String value1, String value2) {
            addCriterion("approvalState between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotBetween(String value1, String value2) {
            addCriterion("approvalState not between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleIsNull() {
            addCriterion("approvalPeople is null");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleIsNotNull() {
            addCriterion("approvalPeople is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleEqualTo(String value) {
            addCriterion("approvalPeople =", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleNotEqualTo(String value) {
            addCriterion("approvalPeople <>", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleGreaterThan(String value) {
            addCriterion("approvalPeople >", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("approvalPeople >=", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleLessThan(String value) {
            addCriterion("approvalPeople <", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleLessThanOrEqualTo(String value) {
            addCriterion("approvalPeople <=", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleLike(String value) {
            addCriterion("approvalPeople like", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleNotLike(String value) {
            addCriterion("approvalPeople not like", value, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleIn(List<String> values) {
            addCriterion("approvalPeople in", values, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleNotIn(List<String> values) {
            addCriterion("approvalPeople not in", values, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleBetween(String value1, String value2) {
            addCriterion("approvalPeople between", value1, value2, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalpeopleNotBetween(String value1, String value2) {
            addCriterion("approvalPeople not between", value1, value2, "approvalpeople");
            return (Criteria) this;
        }

        public Criteria andApprovalresultIsNull() {
            addCriterion("approvalResult is null");
            return (Criteria) this;
        }

        public Criteria andApprovalresultIsNotNull() {
            addCriterion("approvalResult is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalresultEqualTo(String value) {
            addCriterion("approvalResult =", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultNotEqualTo(String value) {
            addCriterion("approvalResult <>", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultGreaterThan(String value) {
            addCriterion("approvalResult >", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultGreaterThanOrEqualTo(String value) {
            addCriterion("approvalResult >=", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultLessThan(String value) {
            addCriterion("approvalResult <", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultLessThanOrEqualTo(String value) {
            addCriterion("approvalResult <=", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultLike(String value) {
            addCriterion("approvalResult like", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultNotLike(String value) {
            addCriterion("approvalResult not like", value, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultIn(List<String> values) {
            addCriterion("approvalResult in", values, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultNotIn(List<String> values) {
            addCriterion("approvalResult not in", values, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultBetween(String value1, String value2) {
            addCriterion("approvalResult between", value1, value2, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalresultNotBetween(String value1, String value2) {
            addCriterion("approvalResult not between", value1, value2, "approvalresult");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonIsNull() {
            addCriterion("approvalReason is null");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonIsNotNull() {
            addCriterion("approvalReason is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonEqualTo(String value) {
            addCriterion("approvalReason =", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonNotEqualTo(String value) {
            addCriterion("approvalReason <>", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonGreaterThan(String value) {
            addCriterion("approvalReason >", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonGreaterThanOrEqualTo(String value) {
            addCriterion("approvalReason >=", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonLessThan(String value) {
            addCriterion("approvalReason <", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonLessThanOrEqualTo(String value) {
            addCriterion("approvalReason <=", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonLike(String value) {
            addCriterion("approvalReason like", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonNotLike(String value) {
            addCriterion("approvalReason not like", value, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonIn(List<String> values) {
            addCriterion("approvalReason in", values, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonNotIn(List<String> values) {
            addCriterion("approvalReason not in", values, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonBetween(String value1, String value2) {
            addCriterion("approvalReason between", value1, value2, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovalreasonNotBetween(String value1, String value2) {
            addCriterion("approvalReason not between", value1, value2, "approvalreason");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIsNull() {
            addCriterion("approvalTime is null");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIsNotNull() {
            addCriterion("approvalTime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeEqualTo(Date value) {
            addCriterion("approvalTime =", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotEqualTo(Date value) {
            addCriterion("approvalTime <>", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeGreaterThan(Date value) {
            addCriterion("approvalTime >", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approvalTime >=", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLessThan(Date value) {
            addCriterion("approvalTime <", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLessThanOrEqualTo(Date value) {
            addCriterion("approvalTime <=", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIn(List<Date> values) {
            addCriterion("approvalTime in", values, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotIn(List<Date> values) {
            addCriterion("approvalTime not in", values, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeBetween(Date value1, Date value2) {
            addCriterion("approvalTime between", value1, value2, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotBetween(Date value1, Date value2) {
            addCriterion("approvalTime not between", value1, value2, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andActivity1IsNull() {
            addCriterion("activity1 is null");
            return (Criteria) this;
        }

        public Criteria andActivity1IsNotNull() {
            addCriterion("activity1 is not null");
            return (Criteria) this;
        }

        public Criteria andActivity1EqualTo(String value) {
            addCriterion("activity1 =", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1NotEqualTo(String value) {
            addCriterion("activity1 <>", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1GreaterThan(String value) {
            addCriterion("activity1 >", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1GreaterThanOrEqualTo(String value) {
            addCriterion("activity1 >=", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1LessThan(String value) {
            addCriterion("activity1 <", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1LessThanOrEqualTo(String value) {
            addCriterion("activity1 <=", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1Like(String value) {
            addCriterion("activity1 like", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1NotLike(String value) {
            addCriterion("activity1 not like", value, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1In(List<String> values) {
            addCriterion("activity1 in", values, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1NotIn(List<String> values) {
            addCriterion("activity1 not in", values, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1Between(String value1, String value2) {
            addCriterion("activity1 between", value1, value2, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity1NotBetween(String value1, String value2) {
            addCriterion("activity1 not between", value1, value2, "activity1");
            return (Criteria) this;
        }

        public Criteria andActivity2IsNull() {
            addCriterion("activity2 is null");
            return (Criteria) this;
        }

        public Criteria andActivity2IsNotNull() {
            addCriterion("activity2 is not null");
            return (Criteria) this;
        }

        public Criteria andActivity2EqualTo(String value) {
            addCriterion("activity2 =", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2NotEqualTo(String value) {
            addCriterion("activity2 <>", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2GreaterThan(String value) {
            addCriterion("activity2 >", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2GreaterThanOrEqualTo(String value) {
            addCriterion("activity2 >=", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2LessThan(String value) {
            addCriterion("activity2 <", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2LessThanOrEqualTo(String value) {
            addCriterion("activity2 <=", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2Like(String value) {
            addCriterion("activity2 like", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2NotLike(String value) {
            addCriterion("activity2 not like", value, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2In(List<String> values) {
            addCriterion("activity2 in", values, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2NotIn(List<String> values) {
            addCriterion("activity2 not in", values, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2Between(String value1, String value2) {
            addCriterion("activity2 between", value1, value2, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity2NotBetween(String value1, String value2) {
            addCriterion("activity2 not between", value1, value2, "activity2");
            return (Criteria) this;
        }

        public Criteria andActivity3IsNull() {
            addCriterion("activity3 is null");
            return (Criteria) this;
        }

        public Criteria andActivity3IsNotNull() {
            addCriterion("activity3 is not null");
            return (Criteria) this;
        }

        public Criteria andActivity3EqualTo(String value) {
            addCriterion("activity3 =", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3NotEqualTo(String value) {
            addCriterion("activity3 <>", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3GreaterThan(String value) {
            addCriterion("activity3 >", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3GreaterThanOrEqualTo(String value) {
            addCriterion("activity3 >=", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3LessThan(String value) {
            addCriterion("activity3 <", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3LessThanOrEqualTo(String value) {
            addCriterion("activity3 <=", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3Like(String value) {
            addCriterion("activity3 like", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3NotLike(String value) {
            addCriterion("activity3 not like", value, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3In(List<String> values) {
            addCriterion("activity3 in", values, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3NotIn(List<String> values) {
            addCriterion("activity3 not in", values, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3Between(String value1, String value2) {
            addCriterion("activity3 between", value1, value2, "activity3");
            return (Criteria) this;
        }

        public Criteria andActivity3NotBetween(String value1, String value2) {
            addCriterion("activity3 not between", value1, value2, "activity3");
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