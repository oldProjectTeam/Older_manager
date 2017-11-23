package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Changesale;
/**
 * 售后退款
 * @author 疯癫
 *
 */
public interface ChangeService {

	/**
	 * 通过用户id来查所有的
	 * @param userid
	 * @return
	 */
	public List<Changesale> selectAll(Integer userid);
	/**
	 * z增加
	 * @param change
	 */
	public void addChange(Changesale changesale);
	
	/**
	 * 删除
	 * @param id
	 */
	public void deleteChange(Integer id);
	
	/**
	 * 标记被删除状态
	 * @param changesale
	 */
	public void updateState(Changesale changesale);
}
