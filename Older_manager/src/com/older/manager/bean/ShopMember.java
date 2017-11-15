package com.older.manager.bean;

import java.util.Date;


public class ShopMember {
	private Integer id;

	private Integer usersId;

	private Integer integralId;

	private String level;

	private Date jointime;

	private Date changetime;

	private Users users;

	private Integral integral;

	private Shippingaddress shippingaddress;

	private Integer productsViewsCount;

	private Integer OrdersCount;

	public Integer getProductsViewsCount() {
		return productsViewsCount;
	}

	public void setProductsViewsCount(Integer productsViewsCount) {
		this.productsViewsCount = productsViewsCount;
	}

	public Integer getOrdersCount() {
		return OrdersCount;
	}

	public void setOrdersCount(Integer ordersCount) {
		OrdersCount = ordersCount;
	}

	public Shippingaddress getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(Shippingaddress shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integral getIntegral() {
		return integral;
	}

	public void setIntegral(Integral integral) {
		this.integral = integral;
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

	public Integer getIntegralId() {
		return integralId;
	}

	public void setIntegralId(Integer integralId) {
		this.integralId = integralId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level == null ? null : level.trim();
	}

	public Date getJointime() {
		return jointime;
	}

	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}

	public Date getChangetime() {
		return changetime;
	}

	public void setChangetime(Date changetime) {
		this.changetime = changetime;
	}

	@Override
	public String toString() {
		return "ShopMember [id=" + id + ", usersId=" + usersId
				+ ", integralId=" + integralId + ", level=" + level
				+ ", jointime=" + jointime + ", changetime=" + changetime
				+ ", users=" + users + ", integral=" + integral
				+ ", shippingaddress=" + shippingaddress
				+ ", productsViewsCount=" + productsViewsCount
				+ ", OrdersCount=" + OrdersCount + "]";
	}

}