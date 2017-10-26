package com.older.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class HealthinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthinfoExample() {
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

        public Criteria andSymptomsIsNull() {
            addCriterion("symptoms is null");
            return (Criteria) this;
        }

        public Criteria andSymptomsIsNotNull() {
            addCriterion("symptoms is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomsEqualTo(String value) {
            addCriterion("symptoms =", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsNotEqualTo(String value) {
            addCriterion("symptoms <>", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsGreaterThan(String value) {
            addCriterion("symptoms >", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsGreaterThanOrEqualTo(String value) {
            addCriterion("symptoms >=", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsLessThan(String value) {
            addCriterion("symptoms <", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsLessThanOrEqualTo(String value) {
            addCriterion("symptoms <=", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsLike(String value) {
            addCriterion("symptoms like", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsNotLike(String value) {
            addCriterion("symptoms not like", value, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsIn(List<String> values) {
            addCriterion("symptoms in", values, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsNotIn(List<String> values) {
            addCriterion("symptoms not in", values, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsBetween(String value1, String value2) {
            addCriterion("symptoms between", value1, value2, "symptoms");
            return (Criteria) this;
        }

        public Criteria andSymptomsNotBetween(String value1, String value2) {
            addCriterion("symptoms not between", value1, value2, "symptoms");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureIsNull() {
            addCriterion("bodyTemperature is null");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureIsNotNull() {
            addCriterion("bodyTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureEqualTo(Double value) {
            addCriterion("bodyTemperature =", value, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureNotEqualTo(Double value) {
            addCriterion("bodyTemperature <>", value, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureGreaterThan(Double value) {
            addCriterion("bodyTemperature >", value, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("bodyTemperature >=", value, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureLessThan(Double value) {
            addCriterion("bodyTemperature <", value, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureLessThanOrEqualTo(Double value) {
            addCriterion("bodyTemperature <=", value, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureIn(List<Double> values) {
            addCriterion("bodyTemperature in", values, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureNotIn(List<Double> values) {
            addCriterion("bodyTemperature not in", values, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureBetween(Double value1, Double value2) {
            addCriterion("bodyTemperature between", value1, value2, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andBodytemperatureNotBetween(Double value1, Double value2) {
            addCriterion("bodyTemperature not between", value1, value2, "bodytemperature");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyIsNull() {
            addCriterion("pulseFrequency is null");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyIsNotNull() {
            addCriterion("pulseFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyEqualTo(Integer value) {
            addCriterion("pulseFrequency =", value, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyNotEqualTo(Integer value) {
            addCriterion("pulseFrequency <>", value, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyGreaterThan(Integer value) {
            addCriterion("pulseFrequency >", value, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pulseFrequency >=", value, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyLessThan(Integer value) {
            addCriterion("pulseFrequency <", value, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("pulseFrequency <=", value, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyIn(List<Integer> values) {
            addCriterion("pulseFrequency in", values, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyNotIn(List<Integer> values) {
            addCriterion("pulseFrequency not in", values, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyBetween(Integer value1, Integer value2) {
            addCriterion("pulseFrequency between", value1, value2, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andPulsefrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("pulseFrequency not between", value1, value2, "pulsefrequency");
            return (Criteria) this;
        }

        public Criteria andBreathingrateIsNull() {
            addCriterion("breathingRate is null");
            return (Criteria) this;
        }

        public Criteria andBreathingrateIsNotNull() {
            addCriterion("breathingRate is not null");
            return (Criteria) this;
        }

        public Criteria andBreathingrateEqualTo(Integer value) {
            addCriterion("breathingRate =", value, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateNotEqualTo(Integer value) {
            addCriterion("breathingRate <>", value, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateGreaterThan(Integer value) {
            addCriterion("breathingRate >", value, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("breathingRate >=", value, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateLessThan(Integer value) {
            addCriterion("breathingRate <", value, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateLessThanOrEqualTo(Integer value) {
            addCriterion("breathingRate <=", value, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateIn(List<Integer> values) {
            addCriterion("breathingRate in", values, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateNotIn(List<Integer> values) {
            addCriterion("breathingRate not in", values, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateBetween(Integer value1, Integer value2) {
            addCriterion("breathingRate between", value1, value2, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andBreathingrateNotBetween(Integer value1, Integer value2) {
            addCriterion("breathingRate not between", value1, value2, "breathingrate");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureIsNull() {
            addCriterion("LeftBloodPressure is null");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureIsNotNull() {
            addCriterion("LeftBloodPressure is not null");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureEqualTo(Double value) {
            addCriterion("LeftBloodPressure =", value, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureNotEqualTo(Double value) {
            addCriterion("LeftBloodPressure <>", value, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureGreaterThan(Double value) {
            addCriterion("LeftBloodPressure >", value, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureGreaterThanOrEqualTo(Double value) {
            addCriterion("LeftBloodPressure >=", value, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureLessThan(Double value) {
            addCriterion("LeftBloodPressure <", value, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureLessThanOrEqualTo(Double value) {
            addCriterion("LeftBloodPressure <=", value, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureIn(List<Double> values) {
            addCriterion("LeftBloodPressure in", values, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureNotIn(List<Double> values) {
            addCriterion("LeftBloodPressure not in", values, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureBetween(Double value1, Double value2) {
            addCriterion("LeftBloodPressure between", value1, value2, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andLeftbloodpressureNotBetween(Double value1, Double value2) {
            addCriterion("LeftBloodPressure not between", value1, value2, "leftbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureIsNull() {
            addCriterion("RightBloodPressure is null");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureIsNotNull() {
            addCriterion("RightBloodPressure is not null");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureEqualTo(Double value) {
            addCriterion("RightBloodPressure =", value, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureNotEqualTo(Double value) {
            addCriterion("RightBloodPressure <>", value, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureGreaterThan(Double value) {
            addCriterion("RightBloodPressure >", value, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureGreaterThanOrEqualTo(Double value) {
            addCriterion("RightBloodPressure >=", value, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureLessThan(Double value) {
            addCriterion("RightBloodPressure <", value, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureLessThanOrEqualTo(Double value) {
            addCriterion("RightBloodPressure <=", value, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureIn(List<Double> values) {
            addCriterion("RightBloodPressure in", values, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureNotIn(List<Double> values) {
            addCriterion("RightBloodPressure not in", values, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureBetween(Double value1, Double value2) {
            addCriterion("RightBloodPressure between", value1, value2, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andRightbloodpressureNotBetween(Double value1, Double value2) {
            addCriterion("RightBloodPressure not between", value1, value2, "rightbloodpressure");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBodyweightIsNull() {
            addCriterion("bodyWeight is null");
            return (Criteria) this;
        }

        public Criteria andBodyweightIsNotNull() {
            addCriterion("bodyWeight is not null");
            return (Criteria) this;
        }

        public Criteria andBodyweightEqualTo(Double value) {
            addCriterion("bodyWeight =", value, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightNotEqualTo(Double value) {
            addCriterion("bodyWeight <>", value, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightGreaterThan(Double value) {
            addCriterion("bodyWeight >", value, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightGreaterThanOrEqualTo(Double value) {
            addCriterion("bodyWeight >=", value, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightLessThan(Double value) {
            addCriterion("bodyWeight <", value, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightLessThanOrEqualTo(Double value) {
            addCriterion("bodyWeight <=", value, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightIn(List<Double> values) {
            addCriterion("bodyWeight in", values, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightNotIn(List<Double> values) {
            addCriterion("bodyWeight not in", values, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightBetween(Double value1, Double value2) {
            addCriterion("bodyWeight between", value1, value2, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andBodyweightNotBetween(Double value1, Double value2) {
            addCriterion("bodyWeight not between", value1, value2, "bodyweight");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceIsNull() {
            addCriterion("waistCircumference is null");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceIsNotNull() {
            addCriterion("waistCircumference is not null");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceEqualTo(Double value) {
            addCriterion("waistCircumference =", value, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceNotEqualTo(Double value) {
            addCriterion("waistCircumference <>", value, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceGreaterThan(Double value) {
            addCriterion("waistCircumference >", value, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceGreaterThanOrEqualTo(Double value) {
            addCriterion("waistCircumference >=", value, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceLessThan(Double value) {
            addCriterion("waistCircumference <", value, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceLessThanOrEqualTo(Double value) {
            addCriterion("waistCircumference <=", value, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceIn(List<Double> values) {
            addCriterion("waistCircumference in", values, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceNotIn(List<Double> values) {
            addCriterion("waistCircumference not in", values, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceBetween(Double value1, Double value2) {
            addCriterion("waistCircumference between", value1, value2, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andWaistcircumferenceNotBetween(Double value1, Double value2) {
            addCriterion("waistCircumference not between", value1, value2, "waistcircumference");
            return (Criteria) this;
        }

        public Criteria andBmiIsNull() {
            addCriterion("bmi is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("bmi is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(Double value) {
            addCriterion("bmi =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(Double value) {
            addCriterion("bmi <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(Double value) {
            addCriterion("bmi >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(Double value) {
            addCriterion("bmi >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(Double value) {
            addCriterion("bmi <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(Double value) {
            addCriterion("bmi <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<Double> values) {
            addCriterion("bmi in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<Double> values) {
            addCriterion("bmi not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(Double value1, Double value2) {
            addCriterion("bmi between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(Double value1, Double value2) {
            addCriterion("bmi not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioIsNull() {
            addCriterion("armCirumferenceRatio is null");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioIsNotNull() {
            addCriterion("armCirumferenceRatio is not null");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioEqualTo(Double value) {
            addCriterion("armCirumferenceRatio =", value, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioNotEqualTo(Double value) {
            addCriterion("armCirumferenceRatio <>", value, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioGreaterThan(Double value) {
            addCriterion("armCirumferenceRatio >", value, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioGreaterThanOrEqualTo(Double value) {
            addCriterion("armCirumferenceRatio >=", value, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioLessThan(Double value) {
            addCriterion("armCirumferenceRatio <", value, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioLessThanOrEqualTo(Double value) {
            addCriterion("armCirumferenceRatio <=", value, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioIn(List<Double> values) {
            addCriterion("armCirumferenceRatio in", values, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioNotIn(List<Double> values) {
            addCriterion("armCirumferenceRatio not in", values, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioBetween(Double value1, Double value2) {
            addCriterion("armCirumferenceRatio between", value1, value2, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andArmcirumferenceratioNotBetween(Double value1, Double value2) {
            addCriterion("armCirumferenceRatio not between", value1, value2, "armcirumferenceratio");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentIsNull() {
            addCriterion("healthAssessment is null");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentIsNotNull() {
            addCriterion("healthAssessment is not null");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentEqualTo(String value) {
            addCriterion("healthAssessment =", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentNotEqualTo(String value) {
            addCriterion("healthAssessment <>", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentGreaterThan(String value) {
            addCriterion("healthAssessment >", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentGreaterThanOrEqualTo(String value) {
            addCriterion("healthAssessment >=", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentLessThan(String value) {
            addCriterion("healthAssessment <", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentLessThanOrEqualTo(String value) {
            addCriterion("healthAssessment <=", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentLike(String value) {
            addCriterion("healthAssessment like", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentNotLike(String value) {
            addCriterion("healthAssessment not like", value, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentIn(List<String> values) {
            addCriterion("healthAssessment in", values, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentNotIn(List<String> values) {
            addCriterion("healthAssessment not in", values, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentBetween(String value1, String value2) {
            addCriterion("healthAssessment between", value1, value2, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andHealthassessmentNotBetween(String value1, String value2) {
            addCriterion("healthAssessment not between", value1, value2, "healthassessment");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationIsNull() {
            addCriterion("selfEvaluation is null");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationIsNotNull() {
            addCriterion("selfEvaluation is not null");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationEqualTo(String value) {
            addCriterion("selfEvaluation =", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationNotEqualTo(String value) {
            addCriterion("selfEvaluation <>", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationGreaterThan(String value) {
            addCriterion("selfEvaluation >", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationGreaterThanOrEqualTo(String value) {
            addCriterion("selfEvaluation >=", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationLessThan(String value) {
            addCriterion("selfEvaluation <", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationLessThanOrEqualTo(String value) {
            addCriterion("selfEvaluation <=", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationLike(String value) {
            addCriterion("selfEvaluation like", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationNotLike(String value) {
            addCriterion("selfEvaluation not like", value, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationIn(List<String> values) {
            addCriterion("selfEvaluation in", values, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationNotIn(List<String> values) {
            addCriterion("selfEvaluation not in", values, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationBetween(String value1, String value2) {
            addCriterion("selfEvaluation between", value1, value2, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andSelfevaluationNotBetween(String value1, String value2) {
            addCriterion("selfEvaluation not between", value1, value2, "selfevaluation");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionIsNull() {
            addCriterion("cognitiveFunction is null");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionIsNotNull() {
            addCriterion("cognitiveFunction is not null");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionEqualTo(String value) {
            addCriterion("cognitiveFunction =", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionNotEqualTo(String value) {
            addCriterion("cognitiveFunction <>", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionGreaterThan(String value) {
            addCriterion("cognitiveFunction >", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionGreaterThanOrEqualTo(String value) {
            addCriterion("cognitiveFunction >=", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionLessThan(String value) {
            addCriterion("cognitiveFunction <", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionLessThanOrEqualTo(String value) {
            addCriterion("cognitiveFunction <=", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionLike(String value) {
            addCriterion("cognitiveFunction like", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionNotLike(String value) {
            addCriterion("cognitiveFunction not like", value, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionIn(List<String> values) {
            addCriterion("cognitiveFunction in", values, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionNotIn(List<String> values) {
            addCriterion("cognitiveFunction not in", values, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionBetween(String value1, String value2) {
            addCriterion("cognitiveFunction between", value1, value2, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andCognitivefunctionNotBetween(String value1, String value2) {
            addCriterion("cognitiveFunction not between", value1, value2, "cognitivefunction");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateIsNull() {
            addCriterion("emotionalState is null");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateIsNotNull() {
            addCriterion("emotionalState is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateEqualTo(String value) {
            addCriterion("emotionalState =", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateNotEqualTo(String value) {
            addCriterion("emotionalState <>", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateGreaterThan(String value) {
            addCriterion("emotionalState >", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateGreaterThanOrEqualTo(String value) {
            addCriterion("emotionalState >=", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateLessThan(String value) {
            addCriterion("emotionalState <", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateLessThanOrEqualTo(String value) {
            addCriterion("emotionalState <=", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateLike(String value) {
            addCriterion("emotionalState like", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateNotLike(String value) {
            addCriterion("emotionalState not like", value, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateIn(List<String> values) {
            addCriterion("emotionalState in", values, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateNotIn(List<String> values) {
            addCriterion("emotionalState not in", values, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateBetween(String value1, String value2) {
            addCriterion("emotionalState between", value1, value2, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEmotionalstateNotBetween(String value1, String value2) {
            addCriterion("emotionalState not between", value1, value2, "emotionalstate");
            return (Criteria) this;
        }

        public Criteria andEationhabitsIsNull() {
            addCriterion("eationHabits is null");
            return (Criteria) this;
        }

        public Criteria andEationhabitsIsNotNull() {
            addCriterion("eationHabits is not null");
            return (Criteria) this;
        }

        public Criteria andEationhabitsEqualTo(String value) {
            addCriterion("eationHabits =", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsNotEqualTo(String value) {
            addCriterion("eationHabits <>", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsGreaterThan(String value) {
            addCriterion("eationHabits >", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsGreaterThanOrEqualTo(String value) {
            addCriterion("eationHabits >=", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsLessThan(String value) {
            addCriterion("eationHabits <", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsLessThanOrEqualTo(String value) {
            addCriterion("eationHabits <=", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsLike(String value) {
            addCriterion("eationHabits like", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsNotLike(String value) {
            addCriterion("eationHabits not like", value, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsIn(List<String> values) {
            addCriterion("eationHabits in", values, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsNotIn(List<String> values) {
            addCriterion("eationHabits not in", values, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsBetween(String value1, String value2) {
            addCriterion("eationHabits between", value1, value2, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andEationhabitsNotBetween(String value1, String value2) {
            addCriterion("eationHabits not between", value1, value2, "eationhabits");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyIsNull() {
            addCriterion("exerciseFrequency is null");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyIsNotNull() {
            addCriterion("exerciseFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyEqualTo(String value) {
            addCriterion("exerciseFrequency =", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyNotEqualTo(String value) {
            addCriterion("exerciseFrequency <>", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyGreaterThan(String value) {
            addCriterion("exerciseFrequency >", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("exerciseFrequency >=", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyLessThan(String value) {
            addCriterion("exerciseFrequency <", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyLessThanOrEqualTo(String value) {
            addCriterion("exerciseFrequency <=", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyLike(String value) {
            addCriterion("exerciseFrequency like", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyNotLike(String value) {
            addCriterion("exerciseFrequency not like", value, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyIn(List<String> values) {
            addCriterion("exerciseFrequency in", values, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyNotIn(List<String> values) {
            addCriterion("exerciseFrequency not in", values, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyBetween(String value1, String value2) {
            addCriterion("exerciseFrequency between", value1, value2, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisefrequencyNotBetween(String value1, String value2) {
            addCriterion("exerciseFrequency not between", value1, value2, "exercisefrequency");
            return (Criteria) this;
        }

        public Criteria andExercisetimeIsNull() {
            addCriterion("exerciseTime is null");
            return (Criteria) this;
        }

        public Criteria andExercisetimeIsNotNull() {
            addCriterion("exerciseTime is not null");
            return (Criteria) this;
        }

        public Criteria andExercisetimeEqualTo(Integer value) {
            addCriterion("exerciseTime =", value, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeNotEqualTo(Integer value) {
            addCriterion("exerciseTime <>", value, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeGreaterThan(Integer value) {
            addCriterion("exerciseTime >", value, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exerciseTime >=", value, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeLessThan(Integer value) {
            addCriterion("exerciseTime <", value, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeLessThanOrEqualTo(Integer value) {
            addCriterion("exerciseTime <=", value, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeIn(List<Integer> values) {
            addCriterion("exerciseTime in", values, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeNotIn(List<Integer> values) {
            addCriterion("exerciseTime not in", values, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeBetween(Integer value1, Integer value2) {
            addCriterion("exerciseTime between", value1, value2, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("exerciseTime not between", value1, value2, "exercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeIsNull() {
            addCriterion("stickExerciseTime is null");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeIsNotNull() {
            addCriterion("stickExerciseTime is not null");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeEqualTo(Double value) {
            addCriterion("stickExerciseTime =", value, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeNotEqualTo(Double value) {
            addCriterion("stickExerciseTime <>", value, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeGreaterThan(Double value) {
            addCriterion("stickExerciseTime >", value, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeGreaterThanOrEqualTo(Double value) {
            addCriterion("stickExerciseTime >=", value, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeLessThan(Double value) {
            addCriterion("stickExerciseTime <", value, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeLessThanOrEqualTo(Double value) {
            addCriterion("stickExerciseTime <=", value, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeIn(List<Double> values) {
            addCriterion("stickExerciseTime in", values, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeNotIn(List<Double> values) {
            addCriterion("stickExerciseTime not in", values, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeBetween(Double value1, Double value2) {
            addCriterion("stickExerciseTime between", value1, value2, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andStickexercisetimeNotBetween(Double value1, Double value2) {
            addCriterion("stickExerciseTime not between", value1, value2, "stickexercisetime");
            return (Criteria) this;
        }

        public Criteria andExercisewayIsNull() {
            addCriterion("exerciseWay is null");
            return (Criteria) this;
        }

        public Criteria andExercisewayIsNotNull() {
            addCriterion("exerciseWay is not null");
            return (Criteria) this;
        }

        public Criteria andExercisewayEqualTo(String value) {
            addCriterion("exerciseWay =", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayNotEqualTo(String value) {
            addCriterion("exerciseWay <>", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayGreaterThan(String value) {
            addCriterion("exerciseWay >", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayGreaterThanOrEqualTo(String value) {
            addCriterion("exerciseWay >=", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayLessThan(String value) {
            addCriterion("exerciseWay <", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayLessThanOrEqualTo(String value) {
            addCriterion("exerciseWay <=", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayLike(String value) {
            addCriterion("exerciseWay like", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayNotLike(String value) {
            addCriterion("exerciseWay not like", value, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayIn(List<String> values) {
            addCriterion("exerciseWay in", values, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayNotIn(List<String> values) {
            addCriterion("exerciseWay not in", values, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayBetween(String value1, String value2) {
            addCriterion("exerciseWay between", value1, value2, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andExercisewayNotBetween(String value1, String value2) {
            addCriterion("exerciseWay not between", value1, value2, "exerciseway");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusIsNull() {
            addCriterion("smokingStatus is null");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusIsNotNull() {
            addCriterion("smokingStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusEqualTo(String value) {
            addCriterion("smokingStatus =", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusNotEqualTo(String value) {
            addCriterion("smokingStatus <>", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusGreaterThan(String value) {
            addCriterion("smokingStatus >", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusGreaterThanOrEqualTo(String value) {
            addCriterion("smokingStatus >=", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusLessThan(String value) {
            addCriterion("smokingStatus <", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusLessThanOrEqualTo(String value) {
            addCriterion("smokingStatus <=", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusLike(String value) {
            addCriterion("smokingStatus like", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusNotLike(String value) {
            addCriterion("smokingStatus not like", value, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusIn(List<String> values) {
            addCriterion("smokingStatus in", values, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusNotIn(List<String> values) {
            addCriterion("smokingStatus not in", values, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusBetween(String value1, String value2) {
            addCriterion("smokingStatus between", value1, value2, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andSmokingstatusNotBetween(String value1, String value2) {
            addCriterion("smokingStatus not between", value1, value2, "smokingstatus");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageIsNull() {
            addCriterion("beginSmokingAge is null");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageIsNotNull() {
            addCriterion("beginSmokingAge is not null");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageEqualTo(Integer value) {
            addCriterion("beginSmokingAge =", value, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageNotEqualTo(Integer value) {
            addCriterion("beginSmokingAge <>", value, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageGreaterThan(Integer value) {
            addCriterion("beginSmokingAge >", value, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginSmokingAge >=", value, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageLessThan(Integer value) {
            addCriterion("beginSmokingAge <", value, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageLessThanOrEqualTo(Integer value) {
            addCriterion("beginSmokingAge <=", value, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageIn(List<Integer> values) {
            addCriterion("beginSmokingAge in", values, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageNotIn(List<Integer> values) {
            addCriterion("beginSmokingAge not in", values, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageBetween(Integer value1, Integer value2) {
            addCriterion("beginSmokingAge between", value1, value2, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andBeginsmokingageNotBetween(Integer value1, Integer value2) {
            addCriterion("beginSmokingAge not between", value1, value2, "beginsmokingage");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountIsNull() {
            addCriterion("daySmokingAmount is null");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountIsNotNull() {
            addCriterion("daySmokingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountEqualTo(Integer value) {
            addCriterion("daySmokingAmount =", value, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountNotEqualTo(Integer value) {
            addCriterion("daySmokingAmount <>", value, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountGreaterThan(Integer value) {
            addCriterion("daySmokingAmount >", value, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("daySmokingAmount >=", value, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountLessThan(Integer value) {
            addCriterion("daySmokingAmount <", value, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountLessThanOrEqualTo(Integer value) {
            addCriterion("daySmokingAmount <=", value, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountIn(List<Integer> values) {
            addCriterion("daySmokingAmount in", values, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountNotIn(List<Integer> values) {
            addCriterion("daySmokingAmount not in", values, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountBetween(Integer value1, Integer value2) {
            addCriterion("daySmokingAmount between", value1, value2, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andDaysmokingamountNotBetween(Integer value1, Integer value2) {
            addCriterion("daySmokingAmount not between", value1, value2, "daysmokingamount");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageIsNull() {
            addCriterion("quitSmokingAge is null");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageIsNotNull() {
            addCriterion("quitSmokingAge is not null");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageEqualTo(Integer value) {
            addCriterion("quitSmokingAge =", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageNotEqualTo(Integer value) {
            addCriterion("quitSmokingAge <>", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageGreaterThan(Integer value) {
            addCriterion("quitSmokingAge >", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageGreaterThanOrEqualTo(Integer value) {
            addCriterion("quitSmokingAge >=", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageLessThan(Integer value) {
            addCriterion("quitSmokingAge <", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageLessThanOrEqualTo(Integer value) {
            addCriterion("quitSmokingAge <=", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageIn(List<Integer> values) {
            addCriterion("quitSmokingAge in", values, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageNotIn(List<Integer> values) {
            addCriterion("quitSmokingAge not in", values, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageBetween(Integer value1, Integer value2) {
            addCriterion("quitSmokingAge between", value1, value2, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageNotBetween(Integer value1, Integer value2) {
            addCriterion("quitSmokingAge not between", value1, value2, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyIsNull() {
            addCriterion("drinkingFrequency is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyIsNotNull() {
            addCriterion("drinkingFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyEqualTo(String value) {
            addCriterion("drinkingFrequency =", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyNotEqualTo(String value) {
            addCriterion("drinkingFrequency <>", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyGreaterThan(String value) {
            addCriterion("drinkingFrequency >", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("drinkingFrequency >=", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyLessThan(String value) {
            addCriterion("drinkingFrequency <", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyLessThanOrEqualTo(String value) {
            addCriterion("drinkingFrequency <=", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyLike(String value) {
            addCriterion("drinkingFrequency like", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyNotLike(String value) {
            addCriterion("drinkingFrequency not like", value, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyIn(List<String> values) {
            addCriterion("drinkingFrequency in", values, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyNotIn(List<String> values) {
            addCriterion("drinkingFrequency not in", values, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyBetween(String value1, String value2) {
            addCriterion("drinkingFrequency between", value1, value2, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDrinkingfrequencyNotBetween(String value1, String value2) {
            addCriterion("drinkingFrequency not between", value1, value2, "drinkingfrequency");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingIsNull() {
            addCriterion("dailyDrinking is null");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingIsNotNull() {
            addCriterion("dailyDrinking is not null");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingEqualTo(Double value) {
            addCriterion("dailyDrinking =", value, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingNotEqualTo(Double value) {
            addCriterion("dailyDrinking <>", value, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingGreaterThan(Double value) {
            addCriterion("dailyDrinking >", value, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingGreaterThanOrEqualTo(Double value) {
            addCriterion("dailyDrinking >=", value, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingLessThan(Double value) {
            addCriterion("dailyDrinking <", value, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingLessThanOrEqualTo(Double value) {
            addCriterion("dailyDrinking <=", value, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingIn(List<Double> values) {
            addCriterion("dailyDrinking in", values, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingNotIn(List<Double> values) {
            addCriterion("dailyDrinking not in", values, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingBetween(Double value1, Double value2) {
            addCriterion("dailyDrinking between", value1, value2, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andDailydrinkingNotBetween(Double value1, Double value2) {
            addCriterion("dailyDrinking not between", value1, value2, "dailydrinking");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageIsNull() {
            addCriterion("startDrinkingAge is null");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageIsNotNull() {
            addCriterion("startDrinkingAge is not null");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageEqualTo(Integer value) {
            addCriterion("startDrinkingAge =", value, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageNotEqualTo(Integer value) {
            addCriterion("startDrinkingAge <>", value, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageGreaterThan(Integer value) {
            addCriterion("startDrinkingAge >", value, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageGreaterThanOrEqualTo(Integer value) {
            addCriterion("startDrinkingAge >=", value, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageLessThan(Integer value) {
            addCriterion("startDrinkingAge <", value, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageLessThanOrEqualTo(Integer value) {
            addCriterion("startDrinkingAge <=", value, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageIn(List<Integer> values) {
            addCriterion("startDrinkingAge in", values, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageNotIn(List<Integer> values) {
            addCriterion("startDrinkingAge not in", values, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageBetween(Integer value1, Integer value2) {
            addCriterion("startDrinkingAge between", value1, value2, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andStartdrinkingageNotBetween(Integer value1, Integer value2) {
            addCriterion("startDrinkingAge not between", value1, value2, "startdrinkingage");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingIsNull() {
            addCriterion("isQuitDrinking is null");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingIsNotNull() {
            addCriterion("isQuitDrinking is not null");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingEqualTo(String value) {
            addCriterion("isQuitDrinking =", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingNotEqualTo(String value) {
            addCriterion("isQuitDrinking <>", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingGreaterThan(String value) {
            addCriterion("isQuitDrinking >", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingGreaterThanOrEqualTo(String value) {
            addCriterion("isQuitDrinking >=", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingLessThan(String value) {
            addCriterion("isQuitDrinking <", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingLessThanOrEqualTo(String value) {
            addCriterion("isQuitDrinking <=", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingLike(String value) {
            addCriterion("isQuitDrinking like", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingNotLike(String value) {
            addCriterion("isQuitDrinking not like", value, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingIn(List<String> values) {
            addCriterion("isQuitDrinking in", values, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingNotIn(List<String> values) {
            addCriterion("isQuitDrinking not in", values, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingBetween(String value1, String value2) {
            addCriterion("isQuitDrinking between", value1, value2, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andIsquitdrinkingNotBetween(String value1, String value2) {
            addCriterion("isQuitDrinking not between", value1, value2, "isquitdrinking");
            return (Criteria) this;
        }

        public Criteria andOralIsNull() {
            addCriterion("oral is null");
            return (Criteria) this;
        }

        public Criteria andOralIsNotNull() {
            addCriterion("oral is not null");
            return (Criteria) this;
        }

        public Criteria andOralEqualTo(String value) {
            addCriterion("oral =", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralNotEqualTo(String value) {
            addCriterion("oral <>", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralGreaterThan(String value) {
            addCriterion("oral >", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralGreaterThanOrEqualTo(String value) {
            addCriterion("oral >=", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralLessThan(String value) {
            addCriterion("oral <", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralLessThanOrEqualTo(String value) {
            addCriterion("oral <=", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralLike(String value) {
            addCriterion("oral like", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralNotLike(String value) {
            addCriterion("oral not like", value, "oral");
            return (Criteria) this;
        }

        public Criteria andOralIn(List<String> values) {
            addCriterion("oral in", values, "oral");
            return (Criteria) this;
        }

        public Criteria andOralNotIn(List<String> values) {
            addCriterion("oral not in", values, "oral");
            return (Criteria) this;
        }

        public Criteria andOralBetween(String value1, String value2) {
            addCriterion("oral between", value1, value2, "oral");
            return (Criteria) this;
        }

        public Criteria andOralNotBetween(String value1, String value2) {
            addCriterion("oral not between", value1, value2, "oral");
            return (Criteria) this;
        }

        public Criteria andDentitionIsNull() {
            addCriterion("dentition is null");
            return (Criteria) this;
        }

        public Criteria andDentitionIsNotNull() {
            addCriterion("dentition is not null");
            return (Criteria) this;
        }

        public Criteria andDentitionEqualTo(String value) {
            addCriterion("dentition =", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionNotEqualTo(String value) {
            addCriterion("dentition <>", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionGreaterThan(String value) {
            addCriterion("dentition >", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionGreaterThanOrEqualTo(String value) {
            addCriterion("dentition >=", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionLessThan(String value) {
            addCriterion("dentition <", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionLessThanOrEqualTo(String value) {
            addCriterion("dentition <=", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionLike(String value) {
            addCriterion("dentition like", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionNotLike(String value) {
            addCriterion("dentition not like", value, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionIn(List<String> values) {
            addCriterion("dentition in", values, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionNotIn(List<String> values) {
            addCriterion("dentition not in", values, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionBetween(String value1, String value2) {
            addCriterion("dentition between", value1, value2, "dentition");
            return (Criteria) this;
        }

        public Criteria andDentitionNotBetween(String value1, String value2) {
            addCriterion("dentition not between", value1, value2, "dentition");
            return (Criteria) this;
        }

        public Criteria andPharyngealIsNull() {
            addCriterion("pharyngeal is null");
            return (Criteria) this;
        }

        public Criteria andPharyngealIsNotNull() {
            addCriterion("pharyngeal is not null");
            return (Criteria) this;
        }

        public Criteria andPharyngealEqualTo(String value) {
            addCriterion("pharyngeal =", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealNotEqualTo(String value) {
            addCriterion("pharyngeal <>", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealGreaterThan(String value) {
            addCriterion("pharyngeal >", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealGreaterThanOrEqualTo(String value) {
            addCriterion("pharyngeal >=", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealLessThan(String value) {
            addCriterion("pharyngeal <", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealLessThanOrEqualTo(String value) {
            addCriterion("pharyngeal <=", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealLike(String value) {
            addCriterion("pharyngeal like", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealNotLike(String value) {
            addCriterion("pharyngeal not like", value, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealIn(List<String> values) {
            addCriterion("pharyngeal in", values, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealNotIn(List<String> values) {
            addCriterion("pharyngeal not in", values, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealBetween(String value1, String value2) {
            addCriterion("pharyngeal between", value1, value2, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andPharyngealNotBetween(String value1, String value2) {
            addCriterion("pharyngeal not between", value1, value2, "pharyngeal");
            return (Criteria) this;
        }

        public Criteria andLefteyesightIsNull() {
            addCriterion("leftEyesight is null");
            return (Criteria) this;
        }

        public Criteria andLefteyesightIsNotNull() {
            addCriterion("leftEyesight is not null");
            return (Criteria) this;
        }

        public Criteria andLefteyesightEqualTo(String value) {
            addCriterion("leftEyesight =", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightNotEqualTo(String value) {
            addCriterion("leftEyesight <>", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightGreaterThan(String value) {
            addCriterion("leftEyesight >", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightGreaterThanOrEqualTo(String value) {
            addCriterion("leftEyesight >=", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightLessThan(String value) {
            addCriterion("leftEyesight <", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightLessThanOrEqualTo(String value) {
            addCriterion("leftEyesight <=", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightLike(String value) {
            addCriterion("leftEyesight like", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightNotLike(String value) {
            addCriterion("leftEyesight not like", value, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightIn(List<String> values) {
            addCriterion("leftEyesight in", values, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightNotIn(List<String> values) {
            addCriterion("leftEyesight not in", values, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightBetween(String value1, String value2) {
            addCriterion("leftEyesight between", value1, value2, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andLefteyesightNotBetween(String value1, String value2) {
            addCriterion("leftEyesight not between", value1, value2, "lefteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightIsNull() {
            addCriterion("rightEyesight is null");
            return (Criteria) this;
        }

        public Criteria andRighteyesightIsNotNull() {
            addCriterion("rightEyesight is not null");
            return (Criteria) this;
        }

        public Criteria andRighteyesightEqualTo(String value) {
            addCriterion("rightEyesight =", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightNotEqualTo(String value) {
            addCriterion("rightEyesight <>", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightGreaterThan(String value) {
            addCriterion("rightEyesight >", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightGreaterThanOrEqualTo(String value) {
            addCriterion("rightEyesight >=", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightLessThan(String value) {
            addCriterion("rightEyesight <", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightLessThanOrEqualTo(String value) {
            addCriterion("rightEyesight <=", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightLike(String value) {
            addCriterion("rightEyesight like", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightNotLike(String value) {
            addCriterion("rightEyesight not like", value, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightIn(List<String> values) {
            addCriterion("rightEyesight in", values, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightNotIn(List<String> values) {
            addCriterion("rightEyesight not in", values, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightBetween(String value1, String value2) {
            addCriterion("rightEyesight between", value1, value2, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andRighteyesightNotBetween(String value1, String value2) {
            addCriterion("rightEyesight not between", value1, value2, "righteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightIsNull() {
            addCriterion("correctLeftEyesight is null");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightIsNotNull() {
            addCriterion("correctLeftEyesight is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightEqualTo(String value) {
            addCriterion("correctLeftEyesight =", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightNotEqualTo(String value) {
            addCriterion("correctLeftEyesight <>", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightGreaterThan(String value) {
            addCriterion("correctLeftEyesight >", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightGreaterThanOrEqualTo(String value) {
            addCriterion("correctLeftEyesight >=", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightLessThan(String value) {
            addCriterion("correctLeftEyesight <", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightLessThanOrEqualTo(String value) {
            addCriterion("correctLeftEyesight <=", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightLike(String value) {
            addCriterion("correctLeftEyesight like", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightNotLike(String value) {
            addCriterion("correctLeftEyesight not like", value, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightIn(List<String> values) {
            addCriterion("correctLeftEyesight in", values, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightNotIn(List<String> values) {
            addCriterion("correctLeftEyesight not in", values, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightBetween(String value1, String value2) {
            addCriterion("correctLeftEyesight between", value1, value2, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectlefteyesightNotBetween(String value1, String value2) {
            addCriterion("correctLeftEyesight not between", value1, value2, "correctlefteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightIsNull() {
            addCriterion("correctRightEyesight is null");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightIsNotNull() {
            addCriterion("correctRightEyesight is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightEqualTo(String value) {
            addCriterion("correctRightEyesight =", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightNotEqualTo(String value) {
            addCriterion("correctRightEyesight <>", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightGreaterThan(String value) {
            addCriterion("correctRightEyesight >", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightGreaterThanOrEqualTo(String value) {
            addCriterion("correctRightEyesight >=", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightLessThan(String value) {
            addCriterion("correctRightEyesight <", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightLessThanOrEqualTo(String value) {
            addCriterion("correctRightEyesight <=", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightLike(String value) {
            addCriterion("correctRightEyesight like", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightNotLike(String value) {
            addCriterion("correctRightEyesight not like", value, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightIn(List<String> values) {
            addCriterion("correctRightEyesight in", values, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightNotIn(List<String> values) {
            addCriterion("correctRightEyesight not in", values, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightBetween(String value1, String value2) {
            addCriterion("correctRightEyesight between", value1, value2, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andCorrectrighteyesightNotBetween(String value1, String value2) {
            addCriterion("correctRightEyesight not between", value1, value2, "correctrighteyesight");
            return (Criteria) this;
        }

        public Criteria andHearingIsNull() {
            addCriterion("hearing is null");
            return (Criteria) this;
        }

        public Criteria andHearingIsNotNull() {
            addCriterion("hearing is not null");
            return (Criteria) this;
        }

        public Criteria andHearingEqualTo(String value) {
            addCriterion("hearing =", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotEqualTo(String value) {
            addCriterion("hearing <>", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingGreaterThan(String value) {
            addCriterion("hearing >", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingGreaterThanOrEqualTo(String value) {
            addCriterion("hearing >=", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingLessThan(String value) {
            addCriterion("hearing <", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingLessThanOrEqualTo(String value) {
            addCriterion("hearing <=", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingLike(String value) {
            addCriterion("hearing like", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotLike(String value) {
            addCriterion("hearing not like", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingIn(List<String> values) {
            addCriterion("hearing in", values, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotIn(List<String> values) {
            addCriterion("hearing not in", values, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingBetween(String value1, String value2) {
            addCriterion("hearing between", value1, value2, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotBetween(String value1, String value2) {
            addCriterion("hearing not between", value1, value2, "hearing");
            return (Criteria) this;
        }

        public Criteria andSportsabilityIsNull() {
            addCriterion("sportsAbility is null");
            return (Criteria) this;
        }

        public Criteria andSportsabilityIsNotNull() {
            addCriterion("sportsAbility is not null");
            return (Criteria) this;
        }

        public Criteria andSportsabilityEqualTo(String value) {
            addCriterion("sportsAbility =", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityNotEqualTo(String value) {
            addCriterion("sportsAbility <>", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityGreaterThan(String value) {
            addCriterion("sportsAbility >", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityGreaterThanOrEqualTo(String value) {
            addCriterion("sportsAbility >=", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityLessThan(String value) {
            addCriterion("sportsAbility <", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityLessThanOrEqualTo(String value) {
            addCriterion("sportsAbility <=", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityLike(String value) {
            addCriterion("sportsAbility like", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityNotLike(String value) {
            addCriterion("sportsAbility not like", value, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityIn(List<String> values) {
            addCriterion("sportsAbility in", values, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityNotIn(List<String> values) {
            addCriterion("sportsAbility not in", values, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityBetween(String value1, String value2) {
            addCriterion("sportsAbility between", value1, value2, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSportsabilityNotBetween(String value1, String value2) {
            addCriterion("sportsAbility not between", value1, value2, "sportsability");
            return (Criteria) this;
        }

        public Criteria andSkinIsNull() {
            addCriterion("skin is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("skin is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("skin =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("skin <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("skin >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("skin >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("skin <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("skin <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("skin like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("skin not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("skin in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("skin not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("skin between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("skin not between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andScleraIsNull() {
            addCriterion("sclera is null");
            return (Criteria) this;
        }

        public Criteria andScleraIsNotNull() {
            addCriterion("sclera is not null");
            return (Criteria) this;
        }

        public Criteria andScleraEqualTo(String value) {
            addCriterion("sclera =", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraNotEqualTo(String value) {
            addCriterion("sclera <>", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraGreaterThan(String value) {
            addCriterion("sclera >", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraGreaterThanOrEqualTo(String value) {
            addCriterion("sclera >=", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraLessThan(String value) {
            addCriterion("sclera <", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraLessThanOrEqualTo(String value) {
            addCriterion("sclera <=", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraLike(String value) {
            addCriterion("sclera like", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraNotLike(String value) {
            addCriterion("sclera not like", value, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraIn(List<String> values) {
            addCriterion("sclera in", values, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraNotIn(List<String> values) {
            addCriterion("sclera not in", values, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraBetween(String value1, String value2) {
            addCriterion("sclera between", value1, value2, "sclera");
            return (Criteria) this;
        }

        public Criteria andScleraNotBetween(String value1, String value2) {
            addCriterion("sclera not between", value1, value2, "sclera");
            return (Criteria) this;
        }

        public Criteria andLymphnodeIsNull() {
            addCriterion("lymphNode is null");
            return (Criteria) this;
        }

        public Criteria andLymphnodeIsNotNull() {
            addCriterion("lymphNode is not null");
            return (Criteria) this;
        }

        public Criteria andLymphnodeEqualTo(String value) {
            addCriterion("lymphNode =", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeNotEqualTo(String value) {
            addCriterion("lymphNode <>", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeGreaterThan(String value) {
            addCriterion("lymphNode >", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeGreaterThanOrEqualTo(String value) {
            addCriterion("lymphNode >=", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeLessThan(String value) {
            addCriterion("lymphNode <", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeLessThanOrEqualTo(String value) {
            addCriterion("lymphNode <=", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeLike(String value) {
            addCriterion("lymphNode like", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeNotLike(String value) {
            addCriterion("lymphNode not like", value, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeIn(List<String> values) {
            addCriterion("lymphNode in", values, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeNotIn(List<String> values) {
            addCriterion("lymphNode not in", values, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeBetween(String value1, String value2) {
            addCriterion("lymphNode between", value1, value2, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andLymphnodeNotBetween(String value1, String value2) {
            addCriterion("lymphNode not between", value1, value2, "lymphnode");
            return (Criteria) this;
        }

        public Criteria andBarrelchestIsNull() {
            addCriterion("barrelChest is null");
            return (Criteria) this;
        }

        public Criteria andBarrelchestIsNotNull() {
            addCriterion("barrelChest is not null");
            return (Criteria) this;
        }

        public Criteria andBarrelchestEqualTo(String value) {
            addCriterion("barrelChest =", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestNotEqualTo(String value) {
            addCriterion("barrelChest <>", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestGreaterThan(String value) {
            addCriterion("barrelChest >", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestGreaterThanOrEqualTo(String value) {
            addCriterion("barrelChest >=", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestLessThan(String value) {
            addCriterion("barrelChest <", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestLessThanOrEqualTo(String value) {
            addCriterion("barrelChest <=", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestLike(String value) {
            addCriterion("barrelChest like", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestNotLike(String value) {
            addCriterion("barrelChest not like", value, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestIn(List<String> values) {
            addCriterion("barrelChest in", values, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestNotIn(List<String> values) {
            addCriterion("barrelChest not in", values, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestBetween(String value1, String value2) {
            addCriterion("barrelChest between", value1, value2, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBarrelchestNotBetween(String value1, String value2) {
            addCriterion("barrelChest not between", value1, value2, "barrelchest");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsIsNull() {
            addCriterion("breathSounds is null");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsIsNotNull() {
            addCriterion("breathSounds is not null");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsEqualTo(String value) {
            addCriterion("breathSounds =", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsNotEqualTo(String value) {
            addCriterion("breathSounds <>", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsGreaterThan(String value) {
            addCriterion("breathSounds >", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsGreaterThanOrEqualTo(String value) {
            addCriterion("breathSounds >=", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsLessThan(String value) {
            addCriterion("breathSounds <", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsLessThanOrEqualTo(String value) {
            addCriterion("breathSounds <=", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsLike(String value) {
            addCriterion("breathSounds like", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsNotLike(String value) {
            addCriterion("breathSounds not like", value, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsIn(List<String> values) {
            addCriterion("breathSounds in", values, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsNotIn(List<String> values) {
            addCriterion("breathSounds not in", values, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsBetween(String value1, String value2) {
            addCriterion("breathSounds between", value1, value2, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andBreathsoundsNotBetween(String value1, String value2) {
            addCriterion("breathSounds not between", value1, value2, "breathsounds");
            return (Criteria) this;
        }

        public Criteria andRaleIsNull() {
            addCriterion("rale is null");
            return (Criteria) this;
        }

        public Criteria andRaleIsNotNull() {
            addCriterion("rale is not null");
            return (Criteria) this;
        }

        public Criteria andRaleEqualTo(String value) {
            addCriterion("rale =", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleNotEqualTo(String value) {
            addCriterion("rale <>", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleGreaterThan(String value) {
            addCriterion("rale >", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleGreaterThanOrEqualTo(String value) {
            addCriterion("rale >=", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleLessThan(String value) {
            addCriterion("rale <", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleLessThanOrEqualTo(String value) {
            addCriterion("rale <=", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleLike(String value) {
            addCriterion("rale like", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleNotLike(String value) {
            addCriterion("rale not like", value, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleIn(List<String> values) {
            addCriterion("rale in", values, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleNotIn(List<String> values) {
            addCriterion("rale not in", values, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleBetween(String value1, String value2) {
            addCriterion("rale between", value1, value2, "rale");
            return (Criteria) this;
        }

        public Criteria andRaleNotBetween(String value1, String value2) {
            addCriterion("rale not between", value1, value2, "rale");
            return (Criteria) this;
        }

        public Criteria andHeartrateIsNull() {
            addCriterion("heartRate is null");
            return (Criteria) this;
        }

        public Criteria andHeartrateIsNotNull() {
            addCriterion("heartRate is not null");
            return (Criteria) this;
        }

        public Criteria andHeartrateEqualTo(Integer value) {
            addCriterion("heartRate =", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotEqualTo(Integer value) {
            addCriterion("heartRate <>", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateGreaterThan(Integer value) {
            addCriterion("heartRate >", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("heartRate >=", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateLessThan(Integer value) {
            addCriterion("heartRate <", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateLessThanOrEqualTo(Integer value) {
            addCriterion("heartRate <=", value, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateIn(List<Integer> values) {
            addCriterion("heartRate in", values, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotIn(List<Integer> values) {
            addCriterion("heartRate not in", values, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateBetween(Integer value1, Integer value2) {
            addCriterion("heartRate between", value1, value2, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartrateNotBetween(Integer value1, Integer value2) {
            addCriterion("heartRate not between", value1, value2, "heartrate");
            return (Criteria) this;
        }

        public Criteria andHeartregularityIsNull() {
            addCriterion("heartRegularity is null");
            return (Criteria) this;
        }

        public Criteria andHeartregularityIsNotNull() {
            addCriterion("heartRegularity is not null");
            return (Criteria) this;
        }

        public Criteria andHeartregularityEqualTo(String value) {
            addCriterion("heartRegularity =", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityNotEqualTo(String value) {
            addCriterion("heartRegularity <>", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityGreaterThan(String value) {
            addCriterion("heartRegularity >", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityGreaterThanOrEqualTo(String value) {
            addCriterion("heartRegularity >=", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityLessThan(String value) {
            addCriterion("heartRegularity <", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityLessThanOrEqualTo(String value) {
            addCriterion("heartRegularity <=", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityLike(String value) {
            addCriterion("heartRegularity like", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityNotLike(String value) {
            addCriterion("heartRegularity not like", value, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityIn(List<String> values) {
            addCriterion("heartRegularity in", values, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityNotIn(List<String> values) {
            addCriterion("heartRegularity not in", values, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityBetween(String value1, String value2) {
            addCriterion("heartRegularity between", value1, value2, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andHeartregularityNotBetween(String value1, String value2) {
            addCriterion("heartRegularity not between", value1, value2, "heartregularity");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNull() {
            addCriterion("noise is null");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNotNull() {
            addCriterion("noise is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseEqualTo(String value) {
            addCriterion("noise =", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotEqualTo(String value) {
            addCriterion("noise <>", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThan(String value) {
            addCriterion("noise >", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThanOrEqualTo(String value) {
            addCriterion("noise >=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThan(String value) {
            addCriterion("noise <", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThanOrEqualTo(String value) {
            addCriterion("noise <=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLike(String value) {
            addCriterion("noise like", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotLike(String value) {
            addCriterion("noise not like", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseIn(List<String> values) {
            addCriterion("noise in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotIn(List<String> values) {
            addCriterion("noise not in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseBetween(String value1, String value2) {
            addCriterion("noise between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotBetween(String value1, String value2) {
            addCriterion("noise not between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andTendernessIsNull() {
            addCriterion("tenderness is null");
            return (Criteria) this;
        }

        public Criteria andTendernessIsNotNull() {
            addCriterion("tenderness is not null");
            return (Criteria) this;
        }

        public Criteria andTendernessEqualTo(String value) {
            addCriterion("tenderness =", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessNotEqualTo(String value) {
            addCriterion("tenderness <>", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessGreaterThan(String value) {
            addCriterion("tenderness >", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessGreaterThanOrEqualTo(String value) {
            addCriterion("tenderness >=", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessLessThan(String value) {
            addCriterion("tenderness <", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessLessThanOrEqualTo(String value) {
            addCriterion("tenderness <=", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessLike(String value) {
            addCriterion("tenderness like", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessNotLike(String value) {
            addCriterion("tenderness not like", value, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessIn(List<String> values) {
            addCriterion("tenderness in", values, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessNotIn(List<String> values) {
            addCriterion("tenderness not in", values, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessBetween(String value1, String value2) {
            addCriterion("tenderness between", value1, value2, "tenderness");
            return (Criteria) this;
        }

        public Criteria andTendernessNotBetween(String value1, String value2) {
            addCriterion("tenderness not between", value1, value2, "tenderness");
            return (Criteria) this;
        }

        public Criteria andBagpieceIsNull() {
            addCriterion("bagPiece is null");
            return (Criteria) this;
        }

        public Criteria andBagpieceIsNotNull() {
            addCriterion("bagPiece is not null");
            return (Criteria) this;
        }

        public Criteria andBagpieceEqualTo(String value) {
            addCriterion("bagPiece =", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceNotEqualTo(String value) {
            addCriterion("bagPiece <>", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceGreaterThan(String value) {
            addCriterion("bagPiece >", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceGreaterThanOrEqualTo(String value) {
            addCriterion("bagPiece >=", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceLessThan(String value) {
            addCriterion("bagPiece <", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceLessThanOrEqualTo(String value) {
            addCriterion("bagPiece <=", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceLike(String value) {
            addCriterion("bagPiece like", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceNotLike(String value) {
            addCriterion("bagPiece not like", value, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceIn(List<String> values) {
            addCriterion("bagPiece in", values, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceNotIn(List<String> values) {
            addCriterion("bagPiece not in", values, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceBetween(String value1, String value2) {
            addCriterion("bagPiece between", value1, value2, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andBagpieceNotBetween(String value1, String value2) {
            addCriterion("bagPiece not between", value1, value2, "bagpiece");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyIsNull() {
            addCriterion("splenomegaly is null");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyIsNotNull() {
            addCriterion("splenomegaly is not null");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyEqualTo(String value) {
            addCriterion("splenomegaly =", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyNotEqualTo(String value) {
            addCriterion("splenomegaly <>", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyGreaterThan(String value) {
            addCriterion("splenomegaly >", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyGreaterThanOrEqualTo(String value) {
            addCriterion("splenomegaly >=", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyLessThan(String value) {
            addCriterion("splenomegaly <", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyLessThanOrEqualTo(String value) {
            addCriterion("splenomegaly <=", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyLike(String value) {
            addCriterion("splenomegaly like", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyNotLike(String value) {
            addCriterion("splenomegaly not like", value, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyIn(List<String> values) {
            addCriterion("splenomegaly in", values, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyNotIn(List<String> values) {
            addCriterion("splenomegaly not in", values, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyBetween(String value1, String value2) {
            addCriterion("splenomegaly between", value1, value2, "splenomegaly");
            return (Criteria) this;
        }

        public Criteria andSplenomegalyNotBetween(String value1, String value2) {
            addCriterion("splenomegaly not between", value1, value2, "splenomegaly");
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