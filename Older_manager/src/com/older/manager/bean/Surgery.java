package com.older.manager.bean;

import java.util.Date;

public class Surgery {
    private Integer id;

    private String surgeryname;

    private Date surgerytime;

    private String hospitalname;

    private String remark;

    private Integer oldmanId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurgeryname() {
        return surgeryname;
    }

    public void setSurgeryname(String surgeryname) {
        this.surgeryname = surgeryname == null ? null : surgeryname.trim();
    }

    public Date getSurgerytime() {
        return surgerytime;
    }

    public void setSurgerytime(Date surgerytime) {
        this.surgerytime = surgerytime;
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