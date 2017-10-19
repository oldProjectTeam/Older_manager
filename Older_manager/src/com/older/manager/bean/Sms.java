package com.older.manager.bean;

import java.util.Date;

public class Sms {
    private Integer id;

    private String sender;

    private Date sendtime;

    private String content;

    private Integer number;

    private String sms1;

    private String sms2;

    private String sms3;

    private String sms4;

    private String sms5;

    private String sms6;

    private String sms7;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSms1() {
        return sms1;
    }

    public void setSms1(String sms1) {
        this.sms1 = sms1 == null ? null : sms1.trim();
    }

    public String getSms2() {
        return sms2;
    }

    public void setSms2(String sms2) {
        this.sms2 = sms2 == null ? null : sms2.trim();
    }

    public String getSms3() {
        return sms3;
    }

    public void setSms3(String sms3) {
        this.sms3 = sms3 == null ? null : sms3.trim();
    }

    public String getSms4() {
        return sms4;
    }

    public void setSms4(String sms4) {
        this.sms4 = sms4 == null ? null : sms4.trim();
    }

    public String getSms5() {
        return sms5;
    }

    public void setSms5(String sms5) {
        this.sms5 = sms5 == null ? null : sms5.trim();
    }

    public String getSms6() {
        return sms6;
    }

    public void setSms6(String sms6) {
        this.sms6 = sms6 == null ? null : sms6.trim();
    }

    public String getSms7() {
        return sms7;
    }

    public void setSms7(String sms7) {
        this.sms7 = sms7 == null ? null : sms7.trim();
    }
}