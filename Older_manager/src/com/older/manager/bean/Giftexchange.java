package com.older.manager.bean;

import java.util.Date;

public class Giftexchange {
    private Integer id;

    private Integer oldmanaccountId;

    private Integer giftmanagementId;

    private Date exchangetime;

    private Integer staffId;

    private String exchangeno;

    private Integer exchangenum;

    private Integer exchangeintegral;

    private String giftexchange1;

    private String giftexchange2;

    private String giftexchange3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOldmanaccountId() {
        return oldmanaccountId;
    }

    public void setOldmanaccountId(Integer oldmanaccountId) {
        this.oldmanaccountId = oldmanaccountId;
    }

    public Integer getGiftmanagementId() {
        return giftmanagementId;
    }

    public void setGiftmanagementId(Integer giftmanagementId) {
        this.giftmanagementId = giftmanagementId;
    }

    public Date getExchangetime() {
        return exchangetime;
    }

    public void setExchangetime(Date exchangetime) {
        this.exchangetime = exchangetime;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getExchangeno() {
        return exchangeno;
    }

    public void setExchangeno(String exchangeno) {
        this.exchangeno = exchangeno == null ? null : exchangeno.trim();
    }

    public Integer getExchangenum() {
        return exchangenum;
    }

    public void setExchangenum(Integer exchangenum) {
        this.exchangenum = exchangenum;
    }

    public Integer getExchangeintegral() {
        return exchangeintegral;
    }

    public void setExchangeintegral(Integer exchangeintegral) {
        this.exchangeintegral = exchangeintegral;
    }

    public String getGiftexchange1() {
        return giftexchange1;
    }

    public void setGiftexchange1(String giftexchange1) {
        this.giftexchange1 = giftexchange1 == null ? null : giftexchange1.trim();
    }

    public String getGiftexchange2() {
        return giftexchange2;
    }

    public void setGiftexchange2(String giftexchange2) {
        this.giftexchange2 = giftexchange2 == null ? null : giftexchange2.trim();
    }

    public String getGiftexchange3() {
        return giftexchange3;
    }

    public void setGiftexchange3(String giftexchange3) {
        this.giftexchange3 = giftexchange3 == null ? null : giftexchange3.trim();
    }
}