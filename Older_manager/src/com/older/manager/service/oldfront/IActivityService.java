package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Recomactivitydetails;
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
	
	/**
	 * @Title: findRecomactivitydetailsBySearch
	 * @Description: 通过时间和老人id搜索老人的推荐活动
	 * @param @param recomactivitydetails
	 * @param @return   
	 * @return List<Recomactivitydetails>  
	 * @throws
	 * @author ym
	 * @date 2017年11月27日 下午3:00:23
	 */
	List<Recomactivitydetails> findRecomactivitydetailsBySearch(Recomactivitydetails recomactivitydetails);
	
	/**
	 * @Title: modifyRecomactivitydetails
	 * @Description: 修改推荐活动详情表
	 * @param @param recomactivitydetails
	 * @param @return   
	 * @return int  
	 * @throws
	 * @author ym
	 * @date 2017年11月27日 下午4:30:56
	 */
	int modifyRecomactivitydetails(Recomactivitydetails recomactivitydetails);
}
