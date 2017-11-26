package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Takeactivity;

public interface IActivityService {

	/**
	 * 参加活动
	 * 
	 * @param activityId
	 * @param oldManId
	 * @return
	 */
	boolean joinActivityWithOldMan(Integer activityId, Integer oldManId);

	/**
	 * @Title: findAllTakeactivitiesBySearch
	 * @Description: 通过搜索查询参加活动记录
	 * @param @param takeactivity
	 * @param @return
	 * @return List<Takeactivity>
	 * @throws
	 * @author ym
	 * @date 2017年11月26日 上午11:14:44
	 */
	List<Takeactivity> findAllTakeactivitiesBySearch(Takeactivity takeactivity);
}
