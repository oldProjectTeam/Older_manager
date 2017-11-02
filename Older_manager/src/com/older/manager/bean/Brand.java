package com.older.manager.bean;

import java.util.Date;

public class Brand {
    private Integer id;

    private String brandid;

    private String name;

    private Integer sort;

    private String region;

    private Date addtime;

    private String state;

    private String brand1;

    private String brand2;

    private Integer brand3;

    private Double brand4;

    private String brand5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandid() {
        return brandid;
    }

    public void setBrandid(String brandid) {
        this.brandid = brandid == null ? null : brandid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBrand1() {
        return brand1;
    }

    public void setBrand1(String brand1) {
        this.brand1 = brand1 == null ? null : brand1.trim();
    }

    public String getBrand2() {
        return brand2;
    }

    public void setBrand2(String brand2) {
        this.brand2 = brand2 == null ? null : brand2.trim();
    }

    public Integer getBrand3() {
        return brand3;
    }

    public void setBrand3(Integer brand3) {
        this.brand3 = brand3;
    }

    public Double getBrand4() {
        return brand4;
    }

    public void setBrand4(Double brand4) {
        this.brand4 = brand4;
    }

    public String getBrand5() {
        return brand5;
    }

    public void setBrand5(String brand5) {
        this.brand5 = brand5 == null ? null : brand5.trim();
    }
}