package com.older.manager.bean;

import java.math.BigInteger;
import java.util.Date;

/**
 * 商城首页的显示信息
 * 
 * @author Administrator
 * 
 */
public class ShopIndexInfo {

	private String loginTime;// 登录时间
	private String loginIP;// 登录的IP地址
	private BigInteger shopUsers;// 商城用户数
	private BigInteger saleRecord;// 分销记录
	private BigInteger shopOrders;// 商城订单
	private BigInteger tradeRecord;// 交易记录

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public BigInteger getShopUsers() {
		return shopUsers;
	}

	public void setShopUsers(BigInteger shopUsers) {
		this.shopUsers = shopUsers;
	}

	public BigInteger getSaleRecord() {
		return saleRecord;
	}

	public void setSaleRecord(BigInteger saleRecord) {
		this.saleRecord = saleRecord;
	}

	public BigInteger getShopOrders() {
		return shopOrders;
	}

	public void setShopOrders(BigInteger shopOrders) {
		this.shopOrders = shopOrders;
	}

	public BigInteger getTradeRecord() {
		return tradeRecord;
	}

	public void setTradeRecord(BigInteger tradeRecord) {
		this.tradeRecord = tradeRecord;
	}

	@Override
	public String toString() {
		return "ShopIndexInfo [loginTime=" + loginTime + ", loginIP=" + loginIP
				+ ", shopUsers=" + shopUsers + ", saleRecord=" + saleRecord
				+ ", shopOrders=" + shopOrders + ", tradeRecord=" + tradeRecord
				+ "]";
	}
}
