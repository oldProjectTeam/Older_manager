package com.older.manager.bean;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ProductKeyword {
    private Integer id;

    private Integer productId;

    private Date changetime;

    private Integer number;

    private String param1;

    private String param2;

    private Double param3;

    private Integer param4;

    @NotEmpty(message="关键词不能为空！")
    @Length(min=1,max=200,message="关键词字数超出限制！")
    private String keyword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }

    public Double getParam3() {
        return param3;
    }

    public void setParam3(Double param3) {
        this.param3 = param3;
    }

    public Integer getParam4() {
        return param4;
    }

    public void setParam4(Integer param4) {
        this.param4 = param4;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}