package com.older.manager.bean;

import java.util.Date;

public class Disease {
    private Integer id;

    private String diseasename;

    private Date confirmedtime;

    private String place;

    private String nowstate;

    private String remark;

    private Integer oldmanId;

    private Date recordtime;

    private String numone;

    private String numtwo;

    private String numthree;
    private Oldman oldman;
    
    

    @Override
	public String toString() {
		return "Disease [id=" + id + ", diseasename=" + diseasename
				+ ", confirmedtime=" + confirmedtime + ", place=" + place
				+ ", nowstate=" + nowstate + ", remark=" + remark
				+ ", oldmanId=" + oldmanId + ", recordtime=" + recordtime
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

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename == null ? null : diseasename.trim();
    }

    public Date getConfirmedtime() {
        return confirmedtime;
    }

    public void setConfirmedtime(Date confirmedtime) {
        this.confirmedtime = confirmedtime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getNowstate() {
        return nowstate;
    }

    public void setNowstate(String nowstate) {
        this.nowstate = nowstate == null ? null : nowstate.trim();
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

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
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