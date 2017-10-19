package com.older.manager.bean;

import java.util.Date;

public class Trauma {
    private Integer id;

    private String traumaname;

    private Date occurrencetime;

    private String hospitalname;

    private String remark;

    private Integer oldmanId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraumaname() {
        return traumaname;
    }

    public void setTraumaname(String traumaname) {
        this.traumaname = traumaname == null ? null : traumaname.trim();
    }

    public Date getOccurrencetime() {
        return occurrencetime;
    }

    public void setOccurrencetime(Date occurrencetime) {
        this.occurrencetime = occurrencetime;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
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
}