package com.older.manager.bean;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Healthinfo {
	
	
    private Integer id;

    private String symptoms;
    @DecimalMax(value="42.00",message="体温输入的值不符合")
    @DecimalMin(value="35.00",message="体温输入的值不符合")
    private Double bodytemperature;
  
    private Integer pulsefrequency;
   
    private Integer breathingrate;
    @NotNull
  
    private Double leftbloodpressure;
    @NotNull
   
    private Double rightbloodpressure;
    @NotNull
    @DecimalMax(value="300.00",message="身高输入的值不符合")
    @DecimalMin(value="100.00",message="身高输入的值不符合")
    private Double height;
    @NotNull
    @DecimalMax(value="500.00",message="体重输入的值不符合")
    private Double bodyweight;
   
    private Double waistcircumference;
   
    private Double bmi;
   
    private Double armcirumferenceratio;

    private String healthassessment;

    private String selfevaluation;

    private String cognitivefunction;

    private String emotionalstate;

    private String eationhabits;

    private String exercisefrequency;
    @Max(value=300,message="每次锻炼时间输入的值不符合")
    private Integer exercisetime;
    
    private Double stickexercisetime;

    private String exerciseway;

    private String smokingstatus;
    @Max(value=150,message="开始吸烟年龄输入值不符合")
    @Min(value=2,message="开始吸烟年龄输入值不符合")
    private Integer beginsmokingage;
   
    private Integer daysmokingamount;
    @Max(value=150,message="戒烟年龄输入值不符合")
    @Min(value=2,message="戒烟年龄输入值不符合")
    private Integer quitsmokingage;

    private String drinkingfrequency;
    
    private Double dailydrinking;
    @Min(value=2,message="开始喝酒输入值不符合")
    @Max(value=150,message="开始喝酒输入值不符合")
    private Integer startdrinkingage;

    private String isquitdrinking;

    private String oral;

    private String dentition;

    private String pharyngeal;

    private String lefteyesight;

    private String righteyesight;

    private String correctlefteyesight;

    private String correctrighteyesight;

    private String hearing;

    private String sportsability;

    private String skin;

    private String sclera;

    private String lymphnode;

    private String barrelchest;

    private String breathsounds;

    private String rale;
    @Max(value=1000,message="输入的值不符合")
    private Integer heartrate;

    private String heartregularity;

    private String noise;

    private String tenderness;

    private String bagpiece;

    private String splenomegaly;
    private Integer oldmanId;

    private String numone;

    private String numtwo;

    private String numthree;
    
    private Oldman oldman;
    
    

    @Override
	public String toString() {
		return "Healthinfo [id=" + id + ", symptoms=" + symptoms
				+ ", bodytemperature=" + bodytemperature + ", pulsefrequency="
				+ pulsefrequency + ", breathingrate=" + breathingrate
				+ ", leftbloodpressure=" + leftbloodpressure
				+ ", rightbloodpressure=" + rightbloodpressure + ", height="
				+ height + ", bodyweight=" + bodyweight
				+ ", waistcircumference=" + waistcircumference + ", bmi=" + bmi
				+ ", armcirumferenceratio=" + armcirumferenceratio
				+ ", healthassessment=" + healthassessment
				+ ", selfevaluation=" + selfevaluation + ", cognitivefunction="
				+ cognitivefunction + ", emotionalstate=" + emotionalstate
				+ ", eationhabits=" + eationhabits + ", exercisefrequency="
				+ exercisefrequency + ", exercisetime=" + exercisetime
				+ ", stickexercisetime=" + stickexercisetime + ", exerciseway="
				+ exerciseway + ", smokingstatus=" + smokingstatus
				+ ", beginsmokingage=" + beginsmokingage
				+ ", daysmokingamount=" + daysmokingamount
				+ ", quitsmokingage=" + quitsmokingage + ", drinkingfrequency="
				+ drinkingfrequency + ", dailydrinking=" + dailydrinking
				+ ", startdrinkingage=" + startdrinkingage
				+ ", isquitdrinking=" + isquitdrinking + ", oral=" + oral
				+ ", dentition=" + dentition + ", pharyngeal=" + pharyngeal
				+ ", lefteyesight=" + lefteyesight + ", righteyesight="
				+ righteyesight + ", correctlefteyesight="
				+ correctlefteyesight + ", correctrighteyesight="
				+ correctrighteyesight + ", hearing=" + hearing
				+ ", sportsability=" + sportsability + ", skin=" + skin
				+ ", sclera=" + sclera + ", lymphnode=" + lymphnode
				+ ", barrelchest=" + barrelchest + ", breathsounds="
				+ breathsounds + ", rale=" + rale + ", heartrate=" + heartrate
				+ ", heartregularity=" + heartregularity + ", noise=" + noise
				+ ", tenderness=" + tenderness + ", bagpiece=" + bagpiece
				+ ", splenomegaly=" + splenomegaly + ", oldmanId=" + oldmanId
				+ ", numone=" + numone + ", numtwo=" + numtwo + ", numthree="
				+ numthree + ", oldman=" + oldman + "]";
	}

	public Oldman getOldman() {
		return oldman;
	}

	public void setOldman(Oldman oldman) {
		this.oldman = oldman;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms == null ? null : symptoms.trim();
    }

    public Double getBodytemperature() {
        return bodytemperature;
    }

    public void setBodytemperature(Double bodytemperature) {
        this.bodytemperature = bodytemperature;
    }

    public Integer getPulsefrequency() {
        return pulsefrequency;
    }

    public void setPulsefrequency(Integer pulsefrequency) {
        this.pulsefrequency = pulsefrequency;
    }

    public Integer getBreathingrate() {
        return breathingrate;
    }

    public void setBreathingrate(Integer breathingrate) {
        this.breathingrate = breathingrate;
    }

    public Double getLeftbloodpressure() {
        return leftbloodpressure;
    }

    public void setLeftbloodpressure(Double leftbloodpressure) {
        this.leftbloodpressure = leftbloodpressure;
    }

    public Double getRightbloodpressure() {
        return rightbloodpressure;
    }

    public void setRightbloodpressure(Double rightbloodpressure) {
        this.rightbloodpressure = rightbloodpressure;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(Double bodyweight) {
        this.bodyweight = bodyweight;
    }

    public Double getWaistcircumference() {
        return waistcircumference;
    }

    public void setWaistcircumference(Double waistcircumference) {
        this.waistcircumference = waistcircumference;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public Double getArmcirumferenceratio() {
        return armcirumferenceratio;
    }

    public void setArmcirumferenceratio(Double armcirumferenceratio) {
        this.armcirumferenceratio = armcirumferenceratio;
    }

    public String getHealthassessment() {
        return healthassessment;
    }

    public void setHealthassessment(String healthassessment) {
        this.healthassessment = healthassessment == null ? null : healthassessment.trim();
    }

    public String getSelfevaluation() {
        return selfevaluation;
    }

    public void setSelfevaluation(String selfevaluation) {
        this.selfevaluation = selfevaluation == null ? null : selfevaluation.trim();
    }

    public String getCognitivefunction() {
        return cognitivefunction;
    }

    public void setCognitivefunction(String cognitivefunction) {
        this.cognitivefunction = cognitivefunction == null ? null : cognitivefunction.trim();
    }

    public String getEmotionalstate() {
        return emotionalstate;
    }

    public void setEmotionalstate(String emotionalstate) {
        this.emotionalstate = emotionalstate == null ? null : emotionalstate.trim();
    }

    public String getEationhabits() {
        return eationhabits;
    }

    public void setEationhabits(String eationhabits) {
        this.eationhabits = eationhabits == null ? null : eationhabits.trim();
    }

    public String getExercisefrequency() {
        return exercisefrequency;
    }

    public void setExercisefrequency(String exercisefrequency) {
        this.exercisefrequency = exercisefrequency == null ? null : exercisefrequency.trim();
    }

    public Integer getExercisetime() {
        return exercisetime;
    }

    public void setExercisetime(Integer exercisetime) {
        this.exercisetime = exercisetime;
    }

    public Double getStickexercisetime() {
        return stickexercisetime;
    }

    public void setStickexercisetime(Double stickexercisetime) {
        this.stickexercisetime = stickexercisetime;
    }

    public String getExerciseway() {
        return exerciseway;
    }

    public void setExerciseway(String exerciseway) {
        this.exerciseway = exerciseway == null ? null : exerciseway.trim();
    }

    public String getSmokingstatus() {
        return smokingstatus;
    }

    public void setSmokingstatus(String smokingstatus) {
        this.smokingstatus = smokingstatus == null ? null : smokingstatus.trim();
    }

    public Integer getBeginsmokingage() {
        return beginsmokingage;
    }

    public void setBeginsmokingage(Integer beginsmokingage) {
        this.beginsmokingage = beginsmokingage;
    }

    public Integer getDaysmokingamount() {
        return daysmokingamount;
    }

    public void setDaysmokingamount(Integer daysmokingamount) {
        this.daysmokingamount = daysmokingamount;
    }

    public Integer getQuitsmokingage() {
        return quitsmokingage;
    }

    public void setQuitsmokingage(Integer quitsmokingage) {
        this.quitsmokingage = quitsmokingage;
    }

    public String getDrinkingfrequency() {
        return drinkingfrequency;
    }

    public void setDrinkingfrequency(String drinkingfrequency) {
        this.drinkingfrequency = drinkingfrequency == null ? null : drinkingfrequency.trim();
    }

    public Double getDailydrinking() {
        return dailydrinking;
    }

    public void setDailydrinking(Double dailydrinking) {
        this.dailydrinking = dailydrinking;
    }

    public Integer getStartdrinkingage() {
        return startdrinkingage;
    }

    public void setStartdrinkingage(Integer startdrinkingage) {
        this.startdrinkingage = startdrinkingage;
    }

    public String getIsquitdrinking() {
        return isquitdrinking;
    }

    public void setIsquitdrinking(String isquitdrinking) {
        this.isquitdrinking = isquitdrinking == null ? null : isquitdrinking.trim();
    }

    public String getOral() {
        return oral;
    }

    public void setOral(String oral) {
        this.oral = oral == null ? null : oral.trim();
    }

    public String getDentition() {
        return dentition;
    }

    public void setDentition(String dentition) {
        this.dentition = dentition == null ? null : dentition.trim();
    }

    public String getPharyngeal() {
        return pharyngeal;
    }

    public void setPharyngeal(String pharyngeal) {
        this.pharyngeal = pharyngeal == null ? null : pharyngeal.trim();
    }

    public String getLefteyesight() {
        return lefteyesight;
    }

    public void setLefteyesight(String lefteyesight) {
        this.lefteyesight = lefteyesight == null ? null : lefteyesight.trim();
    }

    public String getRighteyesight() {
        return righteyesight;
    }

    public void setRighteyesight(String righteyesight) {
        this.righteyesight = righteyesight == null ? null : righteyesight.trim();
    }

    public String getCorrectlefteyesight() {
        return correctlefteyesight;
    }

    public void setCorrectlefteyesight(String correctlefteyesight) {
        this.correctlefteyesight = correctlefteyesight == null ? null : correctlefteyesight.trim();
    }

    public String getCorrectrighteyesight() {
        return correctrighteyesight;
    }

    public void setCorrectrighteyesight(String correctrighteyesight) {
        this.correctrighteyesight = correctrighteyesight == null ? null : correctrighteyesight.trim();
    }

    public String getHearing() {
        return hearing;
    }

    public void setHearing(String hearing) {
        this.hearing = hearing == null ? null : hearing.trim();
    }

    public String getSportsability() {
        return sportsability;
    }

    public void setSportsability(String sportsability) {
        this.sportsability = sportsability == null ? null : sportsability.trim();
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin == null ? null : skin.trim();
    }

    public String getSclera() {
        return sclera;
    }

    public void setSclera(String sclera) {
        this.sclera = sclera == null ? null : sclera.trim();
    }

    public String getLymphnode() {
        return lymphnode;
    }

    public void setLymphnode(String lymphnode) {
        this.lymphnode = lymphnode == null ? null : lymphnode.trim();
    }

    public String getBarrelchest() {
        return barrelchest;
    }

    public void setBarrelchest(String barrelchest) {
        this.barrelchest = barrelchest == null ? null : barrelchest.trim();
    }

    public String getBreathsounds() {
        return breathsounds;
    }

    public void setBreathsounds(String breathsounds) {
        this.breathsounds = breathsounds == null ? null : breathsounds.trim();
    }

    public String getRale() {
        return rale;
    }

    public void setRale(String rale) {
        this.rale = rale == null ? null : rale.trim();
    }

    public Integer getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(Integer heartrate) {
        this.heartrate = heartrate;
    }

    public String getHeartregularity() {
        return heartregularity;
    }

    public void setHeartregularity(String heartregularity) {
        this.heartregularity = heartregularity == null ? null : heartregularity.trim();
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise == null ? null : noise.trim();
    }

    public String getTenderness() {
        return tenderness;
    }

    public void setTenderness(String tenderness) {
        this.tenderness = tenderness == null ? null : tenderness.trim();
    }

    public String getBagpiece() {
        return bagpiece;
    }

    public void setBagpiece(String bagpiece) {
        this.bagpiece = bagpiece == null ? null : bagpiece.trim();
    }

    public String getSplenomegaly() {
        return splenomegaly;
    }

    public void setSplenomegaly(String splenomegaly) {
        this.splenomegaly = splenomegaly == null ? null : splenomegaly.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getNumone() {
        return numone;
    }

    public void setNumone(String numone) {
        this.numone = numone == null ? null : numone.trim();
    }

    public String getNumtwo() {
        return numtwo;
    }

    public void setNumtwo(String numtwo) {
        this.numtwo = numtwo == null ? null : numtwo.trim();
    }

    public String getNumthree() {
        return numthree;
    }

    public void setNumthree(String numthree) {
        this.numthree = numthree == null ? null : numthree.trim();
    }
}