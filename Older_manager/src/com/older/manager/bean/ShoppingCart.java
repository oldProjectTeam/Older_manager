package com.older.manager.bean;

import java.util.Date;

public class ShoppingCart {
    private Integer id;

    private Integer usersId;

    private Integer produtsId;

    private Integer number;

    //关联产品信息
    private Products product;
    
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

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
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

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", usersId=" + usersId
				+ ", produtsId=" + produtsId + ", number=" + number
				+ ", product=" + product + ", baseprice=" + baseprice
				+ ", time=" + time + ", shoppingcart1=" + shoppingcart1
				+ ", shoppingcart2=" + shoppingcart2 + ", shoppingcart3="
				+ shoppingcart3 + "]";
	}
}