package com.older.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalrecordExample() {
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

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
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

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(String value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(String value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(String value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(String value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(String value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLike(String value) {
            addCriterion("doctor like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotLike(String value) {
            addCriterion("doctor not like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<String> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<String> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(String value1, String value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(String value1, String value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeIsNull() {
            addCriterion("clinicalTime is null");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeIsNotNull() {
            addCriterion("clinicalTime is not null");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeEqualTo(Date value) {
            addCriterion("clinicalTime =", value, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeNotEqualTo(Date value) {
            addCriterion("clinicalTime <>", value, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeGreaterThan(Date value) {
            addCriterion("clinicalTime >", value, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clinicalTime >=", value, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeLessThan(Date value) {
            addCriterion("clinicalTime <", value, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeLessThanOrEqualTo(Date value) {
            addCriterion("clinicalTime <=", value, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeIn(List<Date> values) {
            addCriterion("clinicalTime in", values, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeNotIn(List<Date> values) {
            addCriterion("clinicalTime not in", values, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeBetween(Date value1, Date value2) {
            addCriterion("clinicalTime between", value1, value2, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andClinicaltimeNotBetween(Date value1, Date value2) {
            addCriterion("clinicalTime not between", value1, value2, "clinicaltime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeIsNull() {
            addCriterion("appointmentTime is null");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeIsNotNull() {
            addCriterion("appointmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeEqualTo(Date value) {
            addCriterion("appointmentTime =", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeNotEqualTo(Date value) {
            addCriterion("appointmentTime <>", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeGreaterThan(Date value) {
            addCriterion("appointmentTime >", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointmentTime >=", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeLessThan(Date value) {
            addCriterion("appointmentTime <", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeLessThanOrEqualTo(Date value) {
            addCriterion("appointmentTime <=", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeIn(List<Date> values) {
            addCriterion("appointmentTime in", values, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeNotIn(List<Date> values) {
            addCriterion("appointmentTime not in", values, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeBetween(Date value1, Date value2) {
            addCriterion("appointmentTime between", value1, value2, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeNotBetween(Date value1, Date value2) {
            addCriterion("appointmentTime not between", value1, value2, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andChekcontentIsNull() {
            addCriterion("chekContent is null");
            return (Criteria) this;
        }

        public Criteria andChekcontentIsNotNull() {
            addCriterion("chekContent is not null");
            return (Criteria) this;
        }

        public Criteria andChekcontentEqualTo(String value) {
            addCriterion("chekContent =", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentNotEqualTo(String value) {
            addCriterion("chekContent <>", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentGreaterThan(String value) {
            addCriterion("chekContent >", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentGreaterThanOrEqualTo(String value) {
            addCriterion("chekContent >=", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentLessThan(String value) {
            addCriterion("chekContent <", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentLessThanOrEqualTo(String value) {
            addCriterion("chekContent <=", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentLike(String value) {
            addCriterion("chekContent like", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentNotLike(String value) {
            addCriterion("chekContent not like", value, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentIn(List<String> values) {
            addCriterion("chekContent in", values, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentNotIn(List<String> values) {
            addCriterion("chekContent not in", values, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentBetween(String value1, String value2) {
            addCriterion("chekContent between", value1, value2, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andChekcontentNotBetween(String value1, String value2) {
            addCriterion("chekContent not between", value1, value2, "chekcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentIsNull() {
            addCriterion("ancillaryCheckContent is null");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentIsNotNull() {
            addCriterion("ancillaryCheckContent is not null");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentEqualTo(String value) {
            addCriterion("ancillaryCheckContent =", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentNotEqualTo(String value) {
            addCriterion("ancillaryCheckContent <>", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentGreaterThan(String value) {
            addCriterion("ancillaryCheckContent >", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ancillaryCheckContent >=", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentLessThan(String value) {
            addCriterion("ancillaryCheckContent <", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentLessThanOrEqualTo(String value) {
            addCriterion("ancillaryCheckContent <=", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentLike(String value) {
            addCriterion("ancillaryCheckContent like", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentNotLike(String value) {
            addCriterion("ancillaryCheckContent not like", value, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentIn(List<String> values) {
            addCriterion("ancillaryCheckContent in", values, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentNotIn(List<String> values) {
            addCriterion("ancillaryCheckContent not in", values, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentBetween(String value1, String value2) {
            addCriterion("ancillaryCheckContent between", value1, value2, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andAncillarycheckcontentNotBetween(String value1, String value2) {
            addCriterion("ancillaryCheckContent not between", value1, value2, "ancillarycheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentIsNull() {
            addCriterion("realCheckContent is null");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentIsNotNull() {
            addCriterion("realCheckContent is not null");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentEqualTo(String value) {
            addCriterion("realCheckContent =", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentNotEqualTo(String value) {
            addCriterion("realCheckContent <>", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentGreaterThan(String value) {
            addCriterion("realCheckContent >", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentGreaterThanOrEqualTo(String value) {
            addCriterion("realCheckContent >=", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentLessThan(String value) {
            addCriterion("realCheckContent <", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentLessThanOrEqualTo(String value) {
            addCriterion("realCheckContent <=", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentLike(String value) {
            addCriterion("realCheckContent like", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentNotLike(String value) {
            addCriterion("realCheckContent not like", value, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentIn(List<String> values) {
            addCriterion("realCheckContent in", values, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentNotIn(List<String> values) {
            addCriterion("realCheckContent not in", values, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentBetween(String value1, String value2) {
            addCriterion("realCheckContent between", value1, value2, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andRealcheckcontentNotBetween(String value1, String value2) {
            addCriterion("realCheckContent not between", value1, value2, "realcheckcontent");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugIsNull() {
            addCriterion("normalUseDrug is null");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugIsNotNull() {
            addCriterion("normalUseDrug is not null");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugEqualTo(String value) {
            addCriterion("normalUseDrug =", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugNotEqualTo(String value) {
            addCriterion("normalUseDrug <>", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugGreaterThan(String value) {
            addCriterion("normalUseDrug >", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugGreaterThanOrEqualTo(String value) {
            addCriterion("normalUseDrug >=", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugLessThan(String value) {
            addCriterion("normalUseDrug <", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugLessThanOrEqualTo(String value) {
            addCriterion("normalUseDrug <=", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugLike(String value) {
            addCriterion("normalUseDrug like", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugNotLike(String value) {
            addCriterion("normalUseDrug not like", value, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugIn(List<String> values) {
            addCriterion("normalUseDrug in", values, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugNotIn(List<String> values) {
            addCriterion("normalUseDrug not in", values, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugBetween(String value1, String value2) {
            addCriterion("normalUseDrug between", value1, value2, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andNormalusedrugNotBetween(String value1, String value2) {
            addCriterion("normalUseDrug not between", value1, value2, "normalusedrug");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNull() {
            addCriterion("diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNotNull() {
            addCriterion("diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisEqualTo(String value) {
            addCriterion("diagnosis =", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotEqualTo(String value) {
            addCriterion("diagnosis <>", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThan(String value) {
            addCriterion("diagnosis >", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis >=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThan(String value) {
            addCriterion("diagnosis <", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("diagnosis <=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLike(String value) {
            addCriterion("diagnosis like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotLike(String value) {
            addCriterion("diagnosis not like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIn(List<String> values) {
            addCriterion("diagnosis in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotIn(List<String> values) {
            addCriterion("diagnosis not in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisBetween(String value1, String value2) {
            addCriterion("diagnosis between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotBetween(String value1, String value2) {
            addCriterion("diagnosis not between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionIsNull() {
            addCriterion("treatmentCarePrescription is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionIsNotNull() {
            addCriterion("treatmentCarePrescription is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionEqualTo(String value) {
            addCriterion("treatmentCarePrescription =", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionNotEqualTo(String value) {
            addCriterion("treatmentCarePrescription <>", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionGreaterThan(String value) {
            addCriterion("treatmentCarePrescription >", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("treatmentCarePrescription >=", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionLessThan(String value) {
            addCriterion("treatmentCarePrescription <", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionLessThanOrEqualTo(String value) {
            addCriterion("treatmentCarePrescription <=", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionLike(String value) {
            addCriterion("treatmentCarePrescription like", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionNotLike(String value) {
            addCriterion("treatmentCarePrescription not like", value, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionIn(List<String> values) {
            addCriterion("treatmentCarePrescription in", values, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionNotIn(List<String> values) {
            addCriterion("treatmentCarePrescription not in", values, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionBetween(String value1, String value2) {
            addCriterion("treatmentCarePrescription between", value1, value2, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTreatmentcareprescriptionNotBetween(String value1, String value2) {
            addCriterion("treatmentCarePrescription not between", value1, value2, "treatmentcareprescription");
            return (Criteria) this;
        }

        public Criteria andTabooltemsIsNull() {
            addCriterion("tabooltems is null");
            return (Criteria) this;
        }

        public Criteria andTabooltemsIsNotNull() {
            addCriterion("tabooltems is not null");
            return (Criteria) this;
        }

        public Criteria andTabooltemsEqualTo(String value) {
            addCriterion("tabooltems =", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsNotEqualTo(String value) {
            addCriterion("tabooltems <>", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsGreaterThan(String value) {
            addCriterion("tabooltems >", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsGreaterThanOrEqualTo(String value) {
            addCriterion("tabooltems >=", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsLessThan(String value) {
            addCriterion("tabooltems <", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsLessThanOrEqualTo(String value) {
            addCriterion("tabooltems <=", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsLike(String value) {
            addCriterion("tabooltems like", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsNotLike(String value) {
            addCriterion("tabooltems not like", value, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsIn(List<String> values) {
            addCriterion("tabooltems in", values, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsNotIn(List<String> values) {
            addCriterion("tabooltems not in", values, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsBetween(String value1, String value2) {
            addCriterion("tabooltems between", value1, value2, "tabooltems");
            return (Criteria) this;
        }

        public Criteria andTabooltemsNotBetween(String value1, String value2) {
            addCriterion("tabooltems not between", value1, value2, "tabooltems");
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

        public Criteria andMedicalrecord1IsNull() {
            addCriterion("medicalRecord1 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1IsNotNull() {
            addCriterion("medicalRecord1 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1EqualTo(String value) {
            addCriterion("medicalRecord1 =", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1NotEqualTo(String value) {
            addCriterion("medicalRecord1 <>", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1GreaterThan(String value) {
            addCriterion("medicalRecord1 >", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord1 >=", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1LessThan(String value) {
            addCriterion("medicalRecord1 <", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord1 <=", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1Like(String value) {
            addCriterion("medicalRecord1 like", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1NotLike(String value) {
            addCriterion("medicalRecord1 not like", value, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1In(List<String> values) {
            addCriterion("medicalRecord1 in", values, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1NotIn(List<String> values) {
            addCriterion("medicalRecord1 not in", values, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1Between(String value1, String value2) {
            addCriterion("medicalRecord1 between", value1, value2, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord1NotBetween(String value1, String value2) {
            addCriterion("medicalRecord1 not between", value1, value2, "medicalrecord1");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2IsNull() {
            addCriterion("medicalRecord2 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2IsNotNull() {
            addCriterion("medicalRecord2 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2EqualTo(String value) {
            addCriterion("medicalRecord2 =", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2NotEqualTo(String value) {
            addCriterion("medicalRecord2 <>", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2GreaterThan(String value) {
            addCriterion("medicalRecord2 >", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord2 >=", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2LessThan(String value) {
            addCriterion("medicalRecord2 <", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord2 <=", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2Like(String value) {
            addCriterion("medicalRecord2 like", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2NotLike(String value) {
            addCriterion("medicalRecord2 not like", value, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2In(List<String> values) {
            addCriterion("medicalRecord2 in", values, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2NotIn(List<String> values) {
            addCriterion("medicalRecord2 not in", values, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2Between(String value1, String value2) {
            addCriterion("medicalRecord2 between", value1, value2, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord2NotBetween(String value1, String value2) {
            addCriterion("medicalRecord2 not between", value1, value2, "medicalrecord2");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3IsNull() {
            addCriterion("medicalRecord3 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3IsNotNull() {
            addCriterion("medicalRecord3 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3EqualTo(String value) {
            addCriterion("medicalRecord3 =", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3NotEqualTo(String value) {
            addCriterion("medicalRecord3 <>", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3GreaterThan(String value) {
            addCriterion("medicalRecord3 >", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord3 >=", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3LessThan(String value) {
            addCriterion("medicalRecord3 <", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord3 <=", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3Like(String value) {
            addCriterion("medicalRecord3 like", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3NotLike(String value) {
            addCriterion("medicalRecord3 not like", value, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3In(List<String> values) {
            addCriterion("medicalRecord3 in", values, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3NotIn(List<String> values) {
            addCriterion("medicalRecord3 not in", values, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3Between(String value1, String value2) {
            addCriterion("medicalRecord3 between", value1, value2, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord3NotBetween(String value1, String value2) {
            addCriterion("medicalRecord3 not between", value1, value2, "medicalrecord3");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4IsNull() {
            addCriterion("medicalRecord4 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4IsNotNull() {
            addCriterion("medicalRecord4 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4EqualTo(String value) {
            addCriterion("medicalRecord4 =", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4NotEqualTo(String value) {
            addCriterion("medicalRecord4 <>", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4GreaterThan(String value) {
            addCriterion("medicalRecord4 >", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord4 >=", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4LessThan(String value) {
            addCriterion("medicalRecord4 <", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord4 <=", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4Like(String value) {
            addCriterion("medicalRecord4 like", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4NotLike(String value) {
            addCriterion("medicalRecord4 not like", value, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4In(List<String> values) {
            addCriterion("medicalRecord4 in", values, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4NotIn(List<String> values) {
            addCriterion("medicalRecord4 not in", values, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4Between(String value1, String value2) {
            addCriterion("medicalRecord4 between", value1, value2, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord4NotBetween(String value1, String value2) {
            addCriterion("medicalRecord4 not between", value1, value2, "medicalrecord4");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5IsNull() {
            addCriterion("medicalRecord5 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5IsNotNull() {
            addCriterion("medicalRecord5 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5EqualTo(String value) {
            addCriterion("medicalRecord5 =", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5NotEqualTo(String value) {
            addCriterion("medicalRecord5 <>", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5GreaterThan(String value) {
            addCriterion("medicalRecord5 >", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord5 >=", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5LessThan(String value) {
            addCriterion("medicalRecord5 <", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord5 <=", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5Like(String value) {
            addCriterion("medicalRecord5 like", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5NotLike(String value) {
            addCriterion("medicalRecord5 not like", value, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5In(List<String> values) {
            addCriterion("medicalRecord5 in", values, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5NotIn(List<String> values) {
            addCriterion("medicalRecord5 not in", values, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5Between(String value1, String value2) {
            addCriterion("medicalRecord5 between", value1, value2, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord5NotBetween(String value1, String value2) {
            addCriterion("medicalRecord5 not between", value1, value2, "medicalrecord5");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6IsNull() {
            addCriterion("medicalRecord6 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6IsNotNull() {
            addCriterion("medicalRecord6 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6EqualTo(String value) {
            addCriterion("medicalRecord6 =", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6NotEqualTo(String value) {
            addCriterion("medicalRecord6 <>", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6GreaterThan(String value) {
            addCriterion("medicalRecord6 >", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord6 >=", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6LessThan(String value) {
            addCriterion("medicalRecord6 <", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord6 <=", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6Like(String value) {
            addCriterion("medicalRecord6 like", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6NotLike(String value) {
            addCriterion("medicalRecord6 not like", value, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6In(List<String> values) {
            addCriterion("medicalRecord6 in", values, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6NotIn(List<String> values) {
            addCriterion("medicalRecord6 not in", values, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6Between(String value1, String value2) {
            addCriterion("medicalRecord6 between", value1, value2, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord6NotBetween(String value1, String value2) {
            addCriterion("medicalRecord6 not between", value1, value2, "medicalrecord6");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7IsNull() {
            addCriterion("medicalRecord7 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7IsNotNull() {
            addCriterion("medicalRecord7 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7EqualTo(String value) {
            addCriterion("medicalRecord7 =", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7NotEqualTo(String value) {
            addCriterion("medicalRecord7 <>", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7GreaterThan(String value) {
            addCriterion("medicalRecord7 >", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord7 >=", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7LessThan(String value) {
            addCriterion("medicalRecord7 <", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord7 <=", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7Like(String value) {
            addCriterion("medicalRecord7 like", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7NotLike(String value) {
            addCriterion("medicalRecord7 not like", value, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7In(List<String> values) {
            addCriterion("medicalRecord7 in", values, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7NotIn(List<String> values) {
            addCriterion("medicalRecord7 not in", values, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7Between(String value1, String value2) {
            addCriterion("medicalRecord7 between", value1, value2, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord7NotBetween(String value1, String value2) {
            addCriterion("medicalRecord7 not between", value1, value2, "medicalrecord7");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8IsNull() {
            addCriterion("medicalRecord8 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8IsNotNull() {
            addCriterion("medicalRecord8 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8EqualTo(String value) {
            addCriterion("medicalRecord8 =", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8NotEqualTo(String value) {
            addCriterion("medicalRecord8 <>", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8GreaterThan(String value) {
            addCriterion("medicalRecord8 >", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord8 >=", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8LessThan(String value) {
            addCriterion("medicalRecord8 <", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord8 <=", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8Like(String value) {
            addCriterion("medicalRecord8 like", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8NotLike(String value) {
            addCriterion("medicalRecord8 not like", value, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8In(List<String> values) {
            addCriterion("medicalRecord8 in", values, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8NotIn(List<String> values) {
            addCriterion("medicalRecord8 not in", values, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8Between(String value1, String value2) {
            addCriterion("medicalRecord8 between", value1, value2, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord8NotBetween(String value1, String value2) {
            addCriterion("medicalRecord8 not between", value1, value2, "medicalrecord8");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9IsNull() {
            addCriterion("medicalRecord9 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9IsNotNull() {
            addCriterion("medicalRecord9 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9EqualTo(String value) {
            addCriterion("medicalRecord9 =", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9NotEqualTo(String value) {
            addCriterion("medicalRecord9 <>", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9GreaterThan(String value) {
            addCriterion("medicalRecord9 >", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord9 >=", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9LessThan(String value) {
            addCriterion("medicalRecord9 <", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord9 <=", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9Like(String value) {
            addCriterion("medicalRecord9 like", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9NotLike(String value) {
            addCriterion("medicalRecord9 not like", value, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9In(List<String> values) {
            addCriterion("medicalRecord9 in", values, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9NotIn(List<String> values) {
            addCriterion("medicalRecord9 not in", values, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9Between(String value1, String value2) {
            addCriterion("medicalRecord9 between", value1, value2, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord9NotBetween(String value1, String value2) {
            addCriterion("medicalRecord9 not between", value1, value2, "medicalrecord9");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10IsNull() {
            addCriterion("medicalRecord10 is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10IsNotNull() {
            addCriterion("medicalRecord10 is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10EqualTo(String value) {
            addCriterion("medicalRecord10 =", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10NotEqualTo(String value) {
            addCriterion("medicalRecord10 <>", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10GreaterThan(String value) {
            addCriterion("medicalRecord10 >", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10GreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecord10 >=", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10LessThan(String value) {
            addCriterion("medicalRecord10 <", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10LessThanOrEqualTo(String value) {
            addCriterion("medicalRecord10 <=", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10Like(String value) {
            addCriterion("medicalRecord10 like", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10NotLike(String value) {
            addCriterion("medicalRecord10 not like", value, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10In(List<String> values) {
            addCriterion("medicalRecord10 in", values, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10NotIn(List<String> values) {
            addCriterion("medicalRecord10 not in", values, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10Between(String value1, String value2) {
            addCriterion("medicalRecord10 between", value1, value2, "medicalrecord10");
            return (Criteria) this;
        }

        public Criteria andMedicalrecord10NotBetween(String value1, String value2) {
            addCriterion("medicalRecord10 not between", value1, value2, "medicalrecord10");
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