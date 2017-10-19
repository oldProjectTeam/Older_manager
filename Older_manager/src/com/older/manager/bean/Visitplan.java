package com.older.manager.bean;

import java.util.Date;

public class Visitplan {
    private Integer id;

    private Integer oldmanId;

    private Date visiplantime;

    private String plannedvisits;

    private String state;

    private Date remindvistitplantime;

    private String remindpeople;

    private String pendingevent;

    private Date actualtime;

    private String actualplannedvisits;

    private String visitrecord;

    private String images;

    private String video;

    private String recording;

    private Date createtime;

    private String visitplan1;

    private String visitplan2;

    private String visitplan3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public Date getVisiplantime() {
        return visiplantime;
    }

    public void setVisiplantime(Date visiplantime) {
        this.visiplantime = visiplantime;
    }

    public String getPlannedvisits() {
        return plannedvisits;
    }

    public void setPlannedvisits(String plannedvisits) {
        this.plannedvisits = plannedvisits == null ? null : plannedvisits.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getRemindvistitplantime() {
        return remindvistitplantime;
    }

    public void setRemindvistitplantime(Date remindvistitplantime) {
        this.remindvistitplantime = remindvistitplantime;
    }

    public String getRemindpeople() {
        return remindpeople;
    }

    public void setRemindpeople(String remindpeople) {
        this.remindpeople = remindpeople == null ? null : remindpeople.trim();
    }

    public String getPendingevent() {
        return pendingevent;
    }

    public void setPendingevent(String pendingevent) {
        this.pendingevent = pendingevent == null ? null : pendingevent.trim();
    }

    public Date getActualtime() {
        return actualtime;
    }

    public void setActualtime(Date actualtime) {
        this.actualtime = actualtime;
    }

    public String getActualplannedvisits() {
        return actualplannedvisits;
    }

    public void setActualplannedvisits(String actualplannedvisits) {
        this.actualplannedvisits = actualplannedvisits == null ? null : actualplannedvisits.trim();
    }

    public String getVisitrecord() {
        return visitrecord;
    }

    public void setVisitrecord(String visitrecord) {
        this.visitrecord = visitrecord == null ? null : visitrecord.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording == null ? null : recording.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getVisitplan1() {
        return visitplan1;
    }

    public void setVisitplan1(String visitplan1) {
        this.visitplan1 = visitplan1 == null ? null : visitplan1.trim();
    }

    public String getVisitplan2() {
        return visitplan2;
    }

    public void setVisitplan2(String visitplan2) {
        this.visitplan2 = visitplan2 == null ? null : visitplan2.trim();
    }

    public String getVisitplan3() {
        return visitplan3;
    }

    public void setVisitplan3(String visitplan3) {
        this.visitplan3 = visitplan3 == null ? null : visitplan3.trim();
    }
}