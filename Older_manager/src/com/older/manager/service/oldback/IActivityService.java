package com.older.manager.service.oldback;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.older.manager.bean.Activity;

public interface IActivityService {

	/**
	 * 插入活动信息
	 * @param activity
	 */
	public void insertActivity(Activity activity);
	
	/**
	 * 根据条件查询所有记录
	 * @param activity
	 * @return
	 */
	public List<Activity>queryAllActivityByCondiction(Activity activity);
	
	/**
	 * 根据主键删除活动信息
	 * @param id
	 */
	public void deleteActivityById(Integer id);
	
	/**
	 * 根据多主键批量删除活动信息
	 * @param ids
	 */
	public void batchDeleteActivity(List<Integer> ids);
	
	/**
	 * 根据ID查询活动信息
	 * @param id
	 * @return
	 */
	public Activity findActivityById(Integer id);
	
	/**
	 * 有选择更新活动信息
	 * @param activity
	 */
	public void updateActivity(Activity activity);
}
