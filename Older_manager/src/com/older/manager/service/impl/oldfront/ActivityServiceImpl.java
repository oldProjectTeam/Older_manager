package com.older.manager.service.impl.oldfront;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Activityenrol;
import com.older.manager.bean.ActivityenrolExample;
import com.older.manager.bean.ActivityenrolExample.Criteria;
import com.older.manager.bean.Recomactivitydetails;
import com.older.manager.bean.Takeactivity;
import com.older.manager.mapper.ActivityenrolMapper;
import com.older.manager.mapper.RecomactivitydetailsMapper;
import com.older.manager.mapper.TakeactivityMapper;
import com.older.manager.service.oldfront.IActivityService;

@Service
public class ActivityServiceImpl implements IActivityService {

	@Autowired
	private ActivityenrolMapper activityenrolMapper;

	@Autowired
	private TakeactivityMapper takeactivityMapper;
	
	@Autowired
	private RecomactivitydetailsMapper recomactivitydetailsMapper;

	@Override
	public boolean joinActivityWithOldMan(Integer activityId, Integer oldManId) {
		boolean flag = false;
		List<Activityenrol> list = this.queryActivityByActivityIdAndOldManId(
				activityId, oldManId);
		if (list.size() == 0) {
			Activityenrol activityenrol = new Activityenrol();
			activityenrol.setOldmanId(oldManId);
			activityenrol.setActivityId(activityId);
			activityenrol.setEnroltime(new Date());
			activityenrolMapper.insertSelective(activityenrol);
			flag = true;
		}
		return flag;
	}

	/**
	 * 查询参加活动记录
	 * 
	 * @param activityId
	 * @param oldManId
	 * @return
	 */
	private List<Activityenrol> queryActivityByActivityIdAndOldManId(
			Integer activityId, Integer oldManId) {
		ActivityenrolExample example = new ActivityenrolExample();
		Criteria criteria = example.createCriteria();
		criteria.andActivityIdEqualTo(activityId);
		criteria.andOldmanIdEqualTo(oldManId);
		return activityenrolMapper.selectByExample(example);
	}

	/**
	 * @Title: ActivityServiceImpl.java
	 * @Description: 通过搜索查询参加活动记录
	 * @param @param takeactivity
	 * @param @return
	 * @return
	 * @throws
	 * @author ym
	 * @date 2017年11月26日 上午11:15:40
	 */
	public List<Takeactivity> findAllTakeactivitiesBySearch(
			Takeactivity takeactivity) {
		return takeactivityMapper
				.selectTakeactivityBysearchActivityTime(takeactivity);
	}
	
	/**
	 * @Title: ActivityServiceImpl.java
	 * @Description: 通过时间和老人id搜索老人的推荐活动
	 * @param @param recomactivitydetails
	 * @param @return   
	 * @return   
	 * @throws
	 * @author ym
	 * @date 2017年11月27日 下午3:01:55
	 */
	@Override
	public List<Recomactivitydetails> findRecomactivitydetailsBySearch(
			Recomactivitydetails recomactivitydetails) {
		return recomactivitydetailsMapper.selectRecomActivityDetailBySearch(recomactivitydetails);
	}

	/**
	 * @Title: ActivityServiceImpl.java
	 * @Description: 修改推荐活动详情表
	 * @param @param recomactivitydetails
	 * @param @return   
	 * @return   
	 * @throws
	 * @author ym
	 * @date 2017年11月27日 下午4:31:50
	 */
	@Override
	public int modifyRecomactivitydetails(
			Recomactivitydetails recomactivitydetails) {
		return recomactivitydetailsMapper.updateByPrimaryKeySelective(recomactivitydetails);
	}
}
