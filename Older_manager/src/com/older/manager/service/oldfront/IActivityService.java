package com.older.manager.service.oldfront;

public interface IActivityService {

	/**
	 * 参加活动
	 * @param activityId
	 * @param oldManId
	 * @return
	 */
	boolean joinActivityWithOldMan(Integer activityId, Integer oldManId);

}
