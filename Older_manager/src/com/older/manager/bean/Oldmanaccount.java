package com.older.manager.bean;

import java.util.Date;

public class Oldmanaccount {
    private Integer id;

    private Integer oldmanId;

    private String password;

    private String account;

    private String loginip;

    private Date logintime;

    private Date integral;

    private Integer logincount;

    private String oldmanaccount1;

    private String oldmanaccount2;

    private String oldmanaccount3;

    private String oldmanaccount4;

    private String usertype;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getIntegral() {
        return integral;
    }

    public void setIntegral(Date integral) {
        this.integral = integral;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public String getOldmanaccount1() {
        return oldmanaccount1;
    }

    public void setOldmanaccount1(String oldmanaccount1) {
        this.oldmanaccount1 = oldmanaccount1 == null ? null : oldmanaccount1.trim();
    }

    public String getOldmanaccount2() {
        return oldmanaccount2;
    }

    public void setOldmanaccount2(String oldmanaccount2) {
        this.oldmanaccount2 = oldmanaccount2 == null ? null : oldmanaccount2.trim();
    }

    public String getOldmanaccount3() {
        return oldmanaccount3;
    }

    public void setOldmanaccount3(String oldmanaccount3) {
        this.oldmanaccount3 = oldmanaccount3 == null ? null : oldmanaccount3.trim();
    }

    public String getOldmanaccount4() {
        return oldmanaccount4;
    }

    public void setOldmanaccount4(String oldmanaccount4) {
        this.oldmanaccount4 = oldmanaccount4 == null ? null : oldmanaccount4.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }
}