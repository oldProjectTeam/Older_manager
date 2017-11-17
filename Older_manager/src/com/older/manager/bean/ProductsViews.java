package com.older.manager.bean;

import java.util.Date;

public class ProductsViews {
    private Integer id;

    private Integer usersId;

    private Integer productsId;

    private Date viewtime;

    private String buystate;
    
    private Users users;
    
    private Products products;

    private String param1;

    private String param2;

    private String param3;

    private String param4;
    
    

    public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

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

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Date getViewtime() {
        return viewtime;
    }

    public void setViewtime(Date viewtime) {
        this.viewtime = viewtime;
    }

    public String getBuystate() {
        return buystate;
    }

    public void setBuystate(String buystate) {
        this.buystate = buystate == null ? null : buystate.trim();
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

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3 == null ? null : param3.trim();
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4 == null ? null : param4.trim();
    }

	@Override
	public String toString() {
		return "ProductsViews [id=" + id + ", usersId=" + usersId
				+ ", productsId=" + productsId + ", viewtime=" + viewtime
				+ ", buystate=" + buystate + ", users=" + users + ", products="
				+ products + ", param1=" + param1 + ", param2=" + param2
				+ ", param3=" + param3 + ", param4=" + param4 + "]";
	}
    
    
}