package com.older.manager.bean;

public class MarkPoint {

	private String name;
	private int value;
	private int xAxis;
	private int yAxis;
	private int symbolSize;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}

	public int getSymbolSize() {
		return symbolSize;
	}

	public void setSymbolSize(int symbolSize) {
		this.symbolSize = symbolSize;
	}

	@Override
	public String toString() {
		return "MarkPoint [name=" + name + ", value=" + value + ", xAxis="
				+ xAxis + ", yAxis=" + yAxis + ", symbolSize=" + symbolSize
				+ "]";
	}

	public MarkPoint() {
		super();
	}

	public MarkPoint(String name, int value, int xAxis, int yAxis,
			int symbolSize) {
		super();
		this.name = name;
		this.value = value;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.symbolSize = symbolSize;
	}
}
