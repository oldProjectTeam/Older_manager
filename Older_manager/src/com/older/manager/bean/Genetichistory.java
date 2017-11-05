package com.older.manager.bean;

import java.util.Date;

public class Genetichistory {
    private Integer id;

    private String diseasename;

    private Date infectiontime;

    private String place;

    private String remark;

    private Integer oldmanId;

    private String genetichistory1;

    private String genetichistory2;

    private String genetichistory3;

    private String genetichistory4;

    private String genetichistory5;

    private String genetichistory6;

    private String genetichistory7;

    private String genetichistory8;

    private String genetichistory9;

    private String genetichistory10;
    private Oldman oldman;
    

    @Override
	public String toString() {
		return "Genetichistory [id=" + id + ", diseasename=" + diseasename
				+ ", infectiontime=" + infectiontime + ", place=" + place
				+ ", remark=" + remark + ", oldmanId=" + oldmanId
				+ ", genetichistory1=" + genetichistory1 + ", genetichistory2="
				+ genetichistory2 + ", genetichistory3=" + genetichistory3
				+ ", genetichistory4=" + genetichistory4 + ", genetichistory5="
				+ genetichistory5 + ", genetichistory6=" + genetichistory6
				+ ", genetichistory7=" + genetichistory7 + ", genetichistory8="
				+ genetichistory8 + ", genetichistory9=" + genetichistory9
				+ ", genetichistory10=" + genetichistory10 + ", oldman="
				+ oldman + "]";
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

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename == null ? null : diseasename.trim();
    }

    public Date getInfectiontime() {
        return infectiontime;
    }

    public void setInfectiontime(Date infectiontime) {
        this.infectiontime = infectiontime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getGenetichistory1() {
        return genetichistory1;
    }

    public void setGenetichistory1(String genetichistory1) {
        this.genetichistory1 = genetichistory1 == null ? null : genetichistory1.trim();
    }

    public String getGenetichistory2() {
        return genetichistory2;
    }

    public void setGenetichistory2(String genetichistory2) {
        this.genetichistory2 = genetichistory2 == null ? null : genetichistory2.trim();
    }

    public String getGenetichistory3() {
        return genetichistory3;
    }

    public void setGenetichistory3(String genetichistory3) {
        this.genetichistory3 = genetichistory3 == null ? null : genetichistory3.trim();
    }

    public String getGenetichistory4() {
        return genetichistory4;
    }

    public void setGenetichistory4(String genetichistory4) {
        this.genetichistory4 = genetichistory4 == null ? null : genetichistory4.trim();
    }

    public String getGenetichistory5() {
        return genetichistory5;
    }

    public void setGenetichistory5(String genetichistory5) {
        this.genetichistory5 = genetichistory5 == null ? null : genetichistory5.trim();
    }

    public String getGenetichistory6() {
        return genetichistory6;
    }

    public void setGenetichistory6(String genetichistory6) {
        this.genetichistory6 = genetichistory6 == null ? null : genetichistory6.trim();
    }

    public String getGenetichistory7() {
        return genetichistory7;
    }

    public void setGenetichistory7(String genetichistory7) {
        this.genetichistory7 = genetichistory7 == null ? null : genetichistory7.trim();
    }

    public String getGenetichistory8() {
        return genetichistory8;
    }

    public void setGenetichistory8(String genetichistory8) {
        this.genetichistory8 = genetichistory8 == null ? null : genetichistory8.trim();
    }

    public String getGenetichistory9() {
        return genetichistory9;
    }

    public void setGenetichistory9(String genetichistory9) {
        this.genetichistory9 = genetichistory9 == null ? null : genetichistory9.trim();
    }

    public String getGenetichistory10() {
        return genetichistory10;
    }

    public void setGenetichistory10(String genetichistory10) {
        this.genetichistory10 = genetichistory10 == null ? null : genetichistory10.trim();
    }
}