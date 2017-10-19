package com.older.manager.bean;

import java.util.Date;

public class Courses {
    private Integer id;

    private String title;

    private String teachingway;

    private String teacher;

    private String content;

    private Integer limitnumber;

    private Date bytime;

    private Date starttime;

    private Date endtime;

    private String photo;

    private String path;

    private String courses1;

    private String courses2;

    private String courses3;

    private String courses4;

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

    public String getTeachingway() {
        return teachingway;
    }

    public void setTeachingway(String teachingway) {
        this.teachingway = teachingway == null ? null : teachingway.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLimitnumber() {
        return limitnumber;
    }

    public void setLimitnumber(Integer limitnumber) {
        this.limitnumber = limitnumber;
    }

    public Date getBytime() {
        return bytime;
    }

    public void setBytime(Date bytime) {
        this.bytime = bytime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getCourses1() {
        return courses1;
    }

    public void setCourses1(String courses1) {
        this.courses1 = courses1 == null ? null : courses1.trim();
    }

    public String getCourses2() {
        return courses2;
    }

    public void setCourses2(String courses2) {
        this.courses2 = courses2 == null ? null : courses2.trim();
    }

    public String getCourses3() {
        return courses3;
    }

    public void setCourses3(String courses3) {
        this.courses3 = courses3 == null ? null : courses3.trim();
    }

    public String getCourses4() {
        return courses4;
    }

    public void setCourses4(String courses4) {
        this.courses4 = courses4 == null ? null : courses4.trim();
    }
}