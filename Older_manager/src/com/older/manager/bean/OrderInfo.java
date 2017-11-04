package com.older.manager.bean;

import java.math.BigInteger;
import java.util.List;

public class OrderInfo {

	private String name;
	private String type;
	private List<BigInteger> data;
	private List<MarkPoint> markPoint;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<BigInteger> getData() {
		return data;
	}

	public void setData(List<BigInteger> datas) {
		this.data = datas;
	}

	public List<MarkPoint> getMarkPoint() {
		return markPoint;
	}

	public void setMarkPoint(List<MarkPoint> markPoint) {
		this.markPoint = markPoint;
	}

	@Override
	public String toString() {
		return "OrderInfo [name=" + name + ", type=" + type + ", data=" + data
				+ ", markPoint=" + markPoint + "]";
	}

	public OrderInfo(String name, String type, List<BigInteger> data,
			List<MarkPoint> markPoint) {
		super();
		this.name = name;
		this.type = type;
		this.data = data;
		this.markPoint = markPoint;
	}

	public OrderInfo() {
		super();
	}
}
