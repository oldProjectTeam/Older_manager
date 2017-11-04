package com.older.manager.utils;

import java.util.ArrayList;
import java.util.List;

public class EchartData<T> {
	public List<String> legend = new ArrayList<String>();// 数据分组
	public List<String> category = new ArrayList<String>();// 横坐标
	public List<Series> series = new ArrayList<Series>();// 纵坐标
	public List<T> serie = new ArrayList<T>();

	public EchartData(List<String> legendList, List<String> categoryList,
			List<Series> seriesList) {
		super();
		this.legend = legendList;
		this.category = categoryList;
		this.series = seriesList;
	}

	public List<T> getSerie() {
		return serie;
	}

	public void setSerie(List<T> serie) {
		this.serie = serie;
	}
	
}
