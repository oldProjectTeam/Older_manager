package com.older.manager.bean;

import java.util.Date;

public class Oplog {
    private Integer id;

    private Integer staffId;

    private String loginip;

    private Date logintime;

    private Integer logincount;

    private String opmsg;

    private String optype;

    private String oplog1;

    private String oplog2;

    private String oplog3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
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

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public String getOpmsg() {
        return opmsg;
    }

    public void setOpmsg(String opmsg) {
        this.opmsg = opmsg == null ? null : opmsg.trim();
    }

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype == null ? null : optype.trim();
    }

    public String getOplog1() {
        return oplog1;
    }

    public void setOplog1(String oplog1) {
        this.oplog1 = oplog1 == null ? null : oplog1.trim();
    }

    public String getOplog2() {
        return oplog2;
    }

    public void setOplog2(String oplog2) {
        this.oplog2 = oplog2 == null ? null : oplog2.trim();
    }

    public String getOplog3() {
        return oplog3;
    }

    public void setOplog3(String oplog3) {
        this.oplog3 = oplog3 == null ? null : oplog3.trim();
    }
}