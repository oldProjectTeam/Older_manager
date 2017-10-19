package com.older.manager.bean;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private Date time;

    private String releasepeople;

    private String type;

    private String content;

    private String notice1;

    private String notice2;

    private String notice3;

    private String notice4;

    private String notice5;

    private String notice6;

    private String notice7;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getNotice1() {
        return notice1;
    }

    public void setNotice1(String notice1) {
        this.notice1 = notice1 == null ? null : notice1.trim();
    }

    public String getNotice2() {
        return notice2;
    }

    public void setNotice2(String notice2) {
        this.notice2 = notice2 == null ? null : notice2.trim();
    }

    public String getNotice3() {
        return notice3;
    }

    public void setNotice3(String notice3) {
        this.notice3 = notice3 == null ? null : notice3.trim();
    }

    public String getNotice4() {
        return notice4;
    }

    public void setNotice4(String notice4) {
        this.notice4 = notice4 == null ? null : notice4.trim();
    }

    public String getNotice5() {
        return notice5;
    }

    public void setNotice5(String notice5) {
        this.notice5 = notice5 == null ? null : notice5.trim();
    }

    public String getNotice6() {
        return notice6;
    }

    public void setNotice6(String notice6) {
        this.notice6 = notice6 == null ? null : notice6.trim();
    }

    public String getNotice7() {
        return notice7;
    }

    public void setNotice7(String notice7) {
        this.notice7 = notice7 == null ? null : notice7.trim();
    }
}