package com.older.manager.bean;

/**
 * 订单所占的比例
 * 
 * @author Administrator
 * 
 */
public class OrderRatio {
	private String orderOfType;// 订单里面商品所属类型
	private String orderRatio;// 所占的比率
	private int orderOfTypeNum;// 这个类型下面的订单数

	public String getOrderOfType() {
		return orderOfType;
	}

	public void setOrderOfType(String orderOfType) {
		this.orderOfType = orderOfType;
	}

	public String getOrderRatio() {
		return orderRatio;
	}

	public void setOrderRatio(String orderRatio) {
		this.orderRatio = orderRatio;
	}

	public int getOrderOfTypeNum() {
		return orderOfTypeNum;
	}

	public void setOrderOfTypeNum(int orderOfTypeNum) {
		this.orderOfTypeNum = orderOfTypeNum;
	}

	@Override
	public String toString() {
		return "OrderRatio [orderOfType=" + orderOfType + ", orderRatio="
				+ orderRatio + ", orderOfTypeNum=" + orderOfTypeNum + "]";
	}

	public OrderRatio(String orderOfType, String orderRatio, int orderOfTypeNum) {
		super();
		this.orderOfType = orderOfType;
		this.orderRatio = orderRatio;
		this.orderOfTypeNum = orderOfTypeNum;
	}

	public OrderRatio() {
		super();
	}
}
