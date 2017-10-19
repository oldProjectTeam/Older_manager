package com.older.manager.bean;

import java.util.Date;

public class Takeactivity {
    private Integer id;

    private Integer activityId;

    private Date taketime;

    private String ispresent;

    private String remak;

    private Integer oldmanId;

    private String takeactivity1;

    private String takeactivity2;

    private String takeactivity3;

    private String takeactivity4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getTaketime() {
        return taketime;
    }

    public void setTaketime(Date taketime) {
        this.taketime = taketime;
    }

    public String getIspresent() {
        return ispresent;
    }

    public void setIspresent(String ispresent) {
        this.ispresent = ispresent == null ? null : ispresent.trim();
    }

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remak) {
        this.remak = remak == null ? null : remak.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getTakeactivity1() {
        return takeactivity1;
    }

    public void setTakeactivity1(String takeactivity1) {
        this.takeactivity1 = takeactivity1 == null ? null : takeactivity1.trim();
    }

    public String getTakeactivity2() {
        return takeactivity2;
    }

    public void setTakeactivity2(String takeactivity2) {
        this.takeactivity2 = takeactivity2 == null ? null : takeactivity2.trim();
    }

    public String getTakeactivity3() {
        return takeactivity3;
    }

    public void setTakeactivity3(String takeactivity3) {
        this.takeactivity3 = takeactivity3 == null ? null : takeactivity3.trim();
    }

    public String getTakeactivity4() {
        return takeactivity4;
    }

    public void setTakeactivity4(String takeactivity4) {
        this.takeactivity4 = takeactivity4 == null ? null : takeactivity4.trim();
    }
}