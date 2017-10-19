package com.older.manager.bean;

import java.util.Date;

public class Courseenrol {
    private Integer id;

    private Date enroltime;

    private String enrolstate;

    private Integer oldmamId;

    private String coursecompletion;

    private Double grade;

    private String rating;

    private String isnormalclass;

    private String courseenrol1;

    private String courseenrol2;

    private String courseenrol3;

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

    public Integer getOldmamId() {
        return oldmamId;
    }

    public void setOldmamId(Integer oldmamId) {
        this.oldmamId = oldmamId;
    }

    public String getCoursecompletion() {
        return coursecompletion;
    }

    public void setCoursecompletion(String coursecompletion) {
        this.coursecompletion = coursecompletion == null ? null : coursecompletion.trim();
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    public String getIsnormalclass() {
        return isnormalclass;
    }

    public void setIsnormalclass(String isnormalclass) {
        this.isnormalclass = isnormalclass == null ? null : isnormalclass.trim();
    }

    public String getCourseenrol1() {
        return courseenrol1;
    }

    public void setCourseenrol1(String courseenrol1) {
        this.courseenrol1 = courseenrol1 == null ? null : courseenrol1.trim();
    }

    public String getCourseenrol2() {
        return courseenrol2;
    }

    public void setCourseenrol2(String courseenrol2) {
        this.courseenrol2 = courseenrol2 == null ? null : courseenrol2.trim();
    }

    public String getCourseenrol3() {
        return courseenrol3;
    }

    public void setCourseenrol3(String courseenrol3) {
        this.courseenrol3 = courseenrol3 == null ? null : courseenrol3.trim();
    }
}