package com.older.manager.service.oldback;

import java.util.List;
import java.util.Map;

import com.older.manager.bean.Oldman;

public interface IOldManCountService {

	/**
	 * 查询所有的老人数据,按照年龄，用来显示饼状图
	 * 
	 * @return
	 */
	Map<String, Object> getAll();

	/**
	 * 查询所有的老人数据,按照地区，用来显示饼状图
	 * 
	 * @return
	 */
	Map<String, Object> getOldManAll();

}
