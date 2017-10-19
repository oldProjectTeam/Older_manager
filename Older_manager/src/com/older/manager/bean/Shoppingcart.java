package com.older.manager.bean;

import java.util.Date;

public class Shoppingcart {
    private Integer id;

    private Integer oldmanaccountId;

    private Integer produtsId;

    private Integer number;

    private Double baseprice;

    private Date time;

    private String shoppingcart1;

    private String shoppingcart2;

    private String shoppingcart3;

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

    public Integer getProdutsId() {
        return produtsId;
    }

    public void setProdutsId(Integer produtsId) {
        this.produtsId = produtsId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(Double baseprice) {
        this.baseprice = baseprice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getShoppingcart1() {
        return shoppingcart1;
    }

    public void setShoppingcart1(String shoppingcart1) {
        this.shoppingcart1 = shoppingcart1 == null ? null : shoppingcart1.trim();
    }

    public String getShoppingcart2() {
        return shoppingcart2;
    }

    public void setShoppingcart2(String shoppingcart2) {
        this.shoppingcart2 = shoppingcart2 == null ? null : shoppingcart2.trim();
    }

    public String getShoppingcart3() {
        return shoppingcart3;
    }

    public void setShoppingcart3(String shoppingcart3) {
        this.shoppingcart3 = shoppingcart3 == null ? null : shoppingcart3.trim();
    }
}