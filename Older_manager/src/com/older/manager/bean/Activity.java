package com.older.manager.bean;

import java.util.Date;

public class Activity {
    private Integer id;

    private String title;

    private Date releasetime;

    private Date activitytime;

    private String place;

    private String releasepeople;

    private String type;

    private String state;

    private String remake;

    private String releaseregion;

    private Double activityoperatingbudget;

    private Date applytime;

    private String applypeople;

    private String approvalstate;

    private String approvalpeople;

    private String approvalresult;

    private String approvalreason;

    private Date approvaltime;

    private String activity1;

    private String activity2;

    private String activity3;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getActivitytime() {
        return activitytime;
    }

    public void setActivitytime(Date activitytime) {
        this.activitytime = activitytime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getReleasepeople() {
        return releasepeople;
    }

    public void setReleasepeople(String releasepeople) {
        this.releasepeople = releasepeople == null ? null : releasepeople.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public String getReleaseregion() {
        return releaseregion;
    }

    public void setReleaseregion(String releaseregion) {
        this.releaseregion = releaseregion == null ? null : releaseregion.trim();
    }

    public Double getActivityoperatingbudget() {
        return activityoperatingbudget;
    }

    public void setActivityoperatingbudget(Double activityoperatingbudget) {
        this.activityoperatingbudget = activityoperatingbudget;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getApplypeople() {
        return applypeople;
    }

    public void setApplypeople(String applypeople) {
        this.applypeople = applypeople == null ? null : applypeople.trim();
    }

    public String getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(String approvalstate) {
        this.approvalstate = approvalstate == null ? null : approvalstate.trim();
    }

    public String getApprovalpeople() {
        return approvalpeople;
    }

    public void setApprovalpeople(String approvalpeople) {
        this.approvalpeople = approvalpeople == null ? null : approvalpeople.trim();
    }

    public String getApprovalresult() {
        return approvalresult;
    }

    public void setApprovalresult(String approvalresult) {
        this.approvalresult = approvalresult == null ? null : approvalresult.trim();
    }

    public String getApprovalreason() {
        return approvalreason;
    }

    public void setApprovalreason(String approvalreason) {
        this.approvalreason = approvalreason == null ? null : approvalreason.trim();
    }

    public Date getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(Date approvaltime) {
        this.approvaltime = approvaltime;
    }

    public String getActivity1() {
        return activity1;
    }

    public void setActivity1(String activity1) {
        this.activity1 = activity1 == null ? null : activity1.trim();
    }

    public String getActivity2() {
        return activity2;
    }

    public void setActivity2(String activity2) {
        this.activity2 = activity2 == null ? null : activity2.trim();
    }

    public String getActivity3() {
        return activity3;
    }

    public void setActivity3(String activity3) {
        this.activity3 = activity3 == null ? null : activity3.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}