package com.older.manager.bean;

import java.util.Date;

public class Recomactivitydetails {
    private Integer id;

    private Integer recomactivityId;

    private Date recomtime;

    private Integer number;

    private String result;

    private Integer oldmanId;

    private String recomactivitydetails1;

    private String recomactivitydetails2;

    private String recomactivitydetails3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecomactivityId() {
        return recomactivityId;
    }

    public void setRecomactivityId(Integer recomactivityId) {
        this.recomactivityId = recomactivityId;
    }

    public Date getRecomtime() {
        return recomtime;
    }

    public void setRecomtime(Date recomtime) {
        this.recomtime = recomtime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getRecomactivitydetails1() {
        return recomactivitydetails1;
    }

    public void setRecomactivitydetails1(String recomactivitydetails1) {
        this.recomactivitydetails1 = recomactivitydetails1 == null ? null : recomactivitydetails1.trim();
    }

    public String getRecomactivitydetails2() {
        return recomactivitydetails2;
    }

    public void setRecomactivitydetails2(String recomactivitydetails2) {
        this.recomactivitydetails2 = recomactivitydetails2 == null ? null : recomactivitydetails2.trim();
    }

    public String getRecomactivitydetails3() {
        return recomactivitydetails3;
    }

    public void setRecomactivitydetails3(String recomactivitydetails3) {
        this.recomactivitydetails3 = recomactivitydetails3 == null ? null : recomactivitydetails3.trim();
    }
}