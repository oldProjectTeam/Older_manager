package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNull() {
            addCriterion("EnterPriseName is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNotNull() {
            addCriterion("EnterPriseName is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameEqualTo(String value) {
            addCriterion("EnterPriseName =", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotEqualTo(String value) {
            addCriterion("EnterPriseName <>", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThan(String value) {
            addCriterion("EnterPriseName >", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("EnterPriseName >=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThan(String value) {
            addCriterion("EnterPriseName <", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("EnterPriseName <=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLike(String value) {
            addCriterion("EnterPriseName like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotLike(String value) {
            addCriterion("EnterPriseName not like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIn(List<String> values) {
            addCriterion("EnterPriseName in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotIn(List<String> values) {
            addCriterion("EnterPriseName not in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameBetween(String value1, String value2) {
            addCriterion("EnterPriseName between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("EnterPriseName not between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdIsNull() {
            addCriterion("userRoles_id is null");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdIsNotNull() {
            addCriterion("userRoles_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdEqualTo(Integer value) {
            addCriterion("userRoles_id =", value, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdNotEqualTo(Integer value) {
            addCriterion("userRoles_id <>", value, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdGreaterThan(Integer value) {
            addCriterion("userRoles_id >", value, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRoles_id >=", value, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdLessThan(Integer value) {
            addCriterion("userRoles_id <", value, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdLessThanOrEqualTo(Integer value) {
            addCriterion("userRoles_id <=", value, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdIn(List<Integer> values) {
            addCriterion("userRoles_id in", values, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdNotIn(List<Integer> values) {
            addCriterion("userRoles_id not in", values, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdBetween(Integer value1, Integer value2) {
            addCriterion("userRoles_id between", value1, value2, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andUserrolesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userRoles_id not between", value1, value2, "userrolesId");
            return (Criteria) this;
        }

        public Criteria andStaff1IsNull() {
            addCriterion("staff1 is null");
            return (Criteria) this;
        }

        public Criteria andStaff1IsNotNull() {
            addCriterion("staff1 is not null");
            return (Criteria) this;
        }

        public Criteria andStaff1EqualTo(String value) {
            addCriterion("staff1 =", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1NotEqualTo(String value) {
            addCriterion("staff1 <>", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1GreaterThan(String value) {
            addCriterion("staff1 >", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1GreaterThanOrEqualTo(String value) {
            addCriterion("staff1 >=", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1LessThan(String value) {
            addCriterion("staff1 <", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1LessThanOrEqualTo(String value) {
            addCriterion("staff1 <=", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1Like(String value) {
            addCriterion("staff1 like", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1NotLike(String value) {
            addCriterion("staff1 not like", value, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1In(List<String> values) {
            addCriterion("staff1 in", values, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1NotIn(List<String> values) {
            addCriterion("staff1 not in", values, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1Between(String value1, String value2) {
            addCriterion("staff1 between", value1, value2, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff1NotBetween(String value1, String value2) {
            addCriterion("staff1 not between", value1, value2, "staff1");
            return (Criteria) this;
        }

        public Criteria andStaff2IsNull() {
            addCriterion("staff2 is null");
            return (Criteria) this;
        }

        public Criteria andStaff2IsNotNull() {
            addCriterion("staff2 is not null");
            return (Criteria) this;
        }

        public Criteria andStaff2EqualTo(String value) {
            addCriterion("staff2 =", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2NotEqualTo(String value) {
            addCriterion("staff2 <>", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2GreaterThan(String value) {
            addCriterion("staff2 >", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2GreaterThanOrEqualTo(String value) {
            addCriterion("staff2 >=", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2LessThan(String value) {
            addCriterion("staff2 <", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2LessThanOrEqualTo(String value) {
            addCriterion("staff2 <=", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2Like(String value) {
            addCriterion("staff2 like", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2NotLike(String value) {
            addCriterion("staff2 not like", value, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2In(List<String> values) {
            addCriterion("staff2 in", values, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2NotIn(List<String> values) {
            addCriterion("staff2 not in", values, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2Between(String value1, String value2) {
            addCriterion("staff2 between", value1, value2, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff2NotBetween(String value1, String value2) {
            addCriterion("staff2 not between", value1, value2, "staff2");
            return (Criteria) this;
        }

        public Criteria andStaff3IsNull() {
            addCriterion("staff3 is null");
            return (Criteria) this;
        }

        public Criteria andStaff3IsNotNull() {
            addCriterion("staff3 is not null");
            return (Criteria) this;
        }

        public Criteria andStaff3EqualTo(String value) {
            addCriterion("staff3 =", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3NotEqualTo(String value) {
            addCriterion("staff3 <>", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3GreaterThan(String value) {
            addCriterion("staff3 >", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3GreaterThanOrEqualTo(String value) {
            addCriterion("staff3 >=", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3LessThan(String value) {
            addCriterion("staff3 <", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3LessThanOrEqualTo(String value) {
            addCriterion("staff3 <=", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3Like(String value) {
            addCriterion("staff3 like", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3NotLike(String value) {
            addCriterion("staff3 not like", value, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3In(List<String> values) {
            addCriterion("staff3 in", values, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3NotIn(List<String> values) {
            addCriterion("staff3 not in", values, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3Between(String value1, String value2) {
            addCriterion("staff3 between", value1, value2, "staff3");
            return (Criteria) this;
        }

        public Criteria andStaff3NotBetween(String value1, String value2) {
            addCriterion("staff3 not between", value1, value2, "staff3");
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