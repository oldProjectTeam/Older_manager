package com.older.manager.bean;

import java.util.Date;

public class Peinfo {
    private Integer id;

    private String hospital;

    private Date petime;

    private Date nexttime;

    private String remark;

    private String photo;

    private Integer oldmanId;

    private String peinfo1;

    private String peinfo2;

    private String peinfo3;

    private String peinfo4;

    private String peinfo5;

    private String peinfo6;

    private String peinfo7;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    public Date getPetime() {
        return petime;
    }

    public void setPetime(Date petime) {
        this.petime = petime;
    }

    public Date getNexttime() {
        return nexttime;
    }

    public void setNexttime(Date nexttime) {
        this.nexttime = nexttime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getPeinfo1() {
        return peinfo1;
    }

    public void setPeinfo1(String peinfo1) {
        this.peinfo1 = peinfo1 == null ? null : peinfo1.trim();
    }

    public String getPeinfo2() {
        return peinfo2;
    }

    public void setPeinfo2(String peinfo2) {
        this.peinfo2 = peinfo2 == null ? null : peinfo2.trim();
    }

    public String getPeinfo3() {
        return peinfo3;
    }

    public void setPeinfo3(String peinfo3) {
        this.peinfo3 = peinfo3 == null ? null : peinfo3.trim();
    }

    public String getPeinfo4() {
        return peinfo4;
    }

    public void setPeinfo4(String peinfo4) {
        this.peinfo4 = peinfo4 == null ? null : peinfo4.trim();
    }

    public String getPeinfo5() {
        return peinfo5;
    }

    public void setPeinfo5(String peinfo5) {
        this.peinfo5 = peinfo5 == null ? null : peinfo5.trim();
    }

    public String getPeinfo6() {
        return peinfo6;
    }

    public void setPeinfo6(String peinfo6) {
        this.peinfo6 = peinfo6 == null ? null : peinfo6.trim();
    }

    public String getPeinfo7() {
        return peinfo7;
    }

    public void setPeinfo7(String peinfo7) {
        this.peinfo7 = peinfo7 == null ? null : peinfo7.trim();
    }
}