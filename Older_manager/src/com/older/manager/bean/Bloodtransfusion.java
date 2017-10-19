package com.older.manager.bean;

import java.util.Date;

public class Bloodtransfusion {
    private Integer id;

    private String bloodtransfusionwhy;

    private Date occurrencetime;

    private Double bloodtransfusionamount;

    private String remark;

    private Integer oldmanId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBloodtransfusionwhy() {
        return bloodtransfusionwhy;
    }

    public void setBloodtransfusionwhy(String bloodtransfusionwhy) {
        this.bloodtransfusionwhy = bloodtransfusionwhy == null ? null : bloodtransfusionwhy.trim();
    }

    public Date getOccurrencetime() {
        return occurrencetime;
    }

    public void setOccurrencetime(Date occurrencetime) {
        this.occurrencetime = occurrencetime;
    }

    public Double getBloodtransfusionamount() {
        return bloodtransfusionamount;
    }

    public void setBloodtransfusionamount(Double bloodtransfusionamount) {
        this.bloodtransfusionamount = bloodtransfusionamount;
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