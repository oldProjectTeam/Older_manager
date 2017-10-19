package com.older.manager.bean;

import java.util.Date;

public class Activityenrol {
    private Integer id;

    private Date enroltime;

    private String enrolstate;

    private Integer oldmanId;

    private Integer activityId;

    private String activityenrol1;

    private String activityenrol2;

    private String activityenrol3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEnroltime() {
        return enroltime;
    }

    public void setEnroltime(Date enroltime) {
        this.enroltime = enroltime;
    }

    public String getEnrolstate() {
        return enrolstate;
    }

    public void setEnrolstate(String enrolstate) {
        this.enrolstate = enrolstate == null ? null : enrolstate.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityenrol1() {
        return activityenrol1;
    }

    public void setActivityenrol1(String activityenrol1) {
        this.activityenrol1 = activityenrol1 == null ? null : activityenrol1.trim();
    }

    public String getActivityenrol2() {
        return activityenrol2;
    }

    public void setActivityenrol2(String activityenrol2) {
        this.activityenrol2 = activityenrol2 == null ? null : activityenrol2.trim();
    }

    public String getActivityenrol3() {
        return activityenrol3;
    }

    public void setActivityenrol3(String activityenrol3) {
        this.activityenrol3 = activityenrol3 == null ? null : activityenrol3.trim();
    }
}