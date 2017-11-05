package com.older.manager.bean;

public class Assess {
    private Integer id;

    private String doctor;

    private String health;

    private String healthdataassessment;

    private String suggest;

    private Integer oldmanId;

    private String num1;

    private String num2;

    private String num3;

    private String num4;

    private String num5;

    private String num6;

    private String num7;
    
    private Oldman oldman;
    
    
    

    @Override
	public String toString() {
		return "Assess [id=" + id + ", doctor=" + doctor + ", health=" + health
				+ ", healthdataassessment=" + healthdataassessment
				+ ", suggest=" + suggest + ", oldmanId=" + oldmanId + ", num1="
				+ num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4
				+ ", num5=" + num5 + ", num6=" + num6 + ", num7=" + num7
				+ ", oldman=" + oldman + "]";
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

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor == null ? null : doctor.trim();
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }

    public String getHealthdataassessment() {
        return healthdataassessment;
    }

    public void setHealthdataassessment(String healthdataassessment) {
        this.healthdataassessment = healthdataassessment == null ? null : healthdataassessment.trim();
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1 == null ? null : num1.trim();
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2 == null ? null : num2.trim();
    }

    public String getNum3() {
        return num3;
    }

    public void setNum3(String num3) {
        this.num3 = num3 == null ? null : num3.trim();
    }

    public String getNum4() {
        return num4;
    }

    public void setNum4(String num4) {
        this.num4 = num4 == null ? null : num4.trim();
    }

    public String getNum5() {
        return num5;
    }

    public void setNum5(String num5) {
        this.num5 = num5 == null ? null : num5.trim();
    }

    public String getNum6() {
        return num6;
    }

    public void setNum6(String num6) {
        this.num6 = num6 == null ? null : num6.trim();
    }

    public String getNum7() {
        return num7;
    }

    public void setNum7(String num7) {
        this.num7 = num7 == null ? null : num7.trim();
    }
}