package com.older.manager.bean;

import java.util.Date;

public class ProductCollect {
    private Integer id;

    private Integer usersId;

    private Integer productsId;

    private Date time;
    
    private Users users;
    
    private Products products;
    
    

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

	private String productcollect1;

    private String productcollect2;

    private String productcollect3;

    private String productcollect4;

    private String productcollect5;

    private String productcollect6;

    private String productcollect7;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getProductcollect1() {
        return productcollect1;
    }

    public void setProductcollect1(String productcollect1) {
        this.productcollect1 = productcollect1 == null ? null : productcollect1.trim();
    }

    public String getProductcollect2() {
        return productcollect2;
    }

    public void setProductcollect2(String productcollect2) {
        this.productcollect2 = productcollect2 == null ? null : productcollect2.trim();
    }

    public String getProductcollect3() {
        return productcollect3;
    }

    public void setProductcollect3(String productcollect3) {
        this.productcollect3 = productcollect3 == null ? null : productcollect3.trim();
    }

    public String getProductcollect4() {
        return productcollect4;
    }

    public void setProductcollect4(String productcollect4) {
        this.productcollect4 = productcollect4 == null ? null : productcollect4.trim();
    }

    public String getProductcollect5() {
        return productcollect5;
    }

    public void setProductcollect5(String productcollect5) {
        this.productcollect5 = productcollect5 == null ? null : productcollect5.trim();
    }

    public String getProductcollect6() {
        return productcollect6;
    }

    public void setProductcollect6(String productcollect6) {
        this.productcollect6 = productcollect6 == null ? null : productcollect6.trim();
    }

    public String getProductcollect7() {
        return productcollect7;
    }

    public void setProductcollect7(String productcollect7) {
        this.productcollect7 = productcollect7 == null ? null : productcollect7.trim();
    }

	@Override
	public String toString() {
		return "ProductCollect [id=" + id + ", usersId=" + usersId
				+ ", productsId=" + productsId + ", time=" + time + ", users="
				+ users + ", products=" + products + ", productcollect1="
				+ productcollect1 + ", productcollect2=" + productcollect2
				+ ", productcollect3=" + productcollect3 + ", productcollect4="
				+ productcollect4 + ", productcollect5=" + productcollect5
				+ ", productcollect6=" + productcollect6 + ", productcollect7="
				+ productcollect7 + "]";
	}
    
    
}