package com.older.manager.service.impl.oldback;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Activity;
import com.older.manager.bean.ActivityExample;
import com.older.manager.mapper.ActivityMapper;
import com.older.manager.service.oldback.IActivityService;

@Service
public class ActivityServiceImpl implements IActivityService {

	@Autowired
	ActivityMapper activityMapper;
	@Override
	public void insertActivity(Activity activity) {
		// TODO Auto-generated method stub
		activityMapper.insertSelective(activity);
	}

	@Override
	public List<Activity> queryAllActivityByCondiction(Activity activity) {
		// TODO Auto-generated method stub
		
		return activityMapper.selectByCondiction(activity);
	}

	@Override
	public void deleteActivityById(Integer id) {
		// TODO Auto-generated method stub
		activityMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeleteActivity(List<Integer> ids) {
		// TODO Auto-generated method stub
		ActivityExample example=new ActivityExample();
		ActivityExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		activityMapper.deleteByExample(example);
	}

	@Override
	public Activity findActivityById(Integer id) {
		// TODO Auto-generated method stub
		Activity activity=activityMapper.selectByPrimaryKey(id);
		if(activity!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			activity.setActivitytimeStr(sdf.format(activity.getActivitytime()));
			activity.setReleasetimeStr(sdf.format(activity.getReleasetime()));
		} 
		return activity;
	}

	@Override
	public void updateActivity(Activity activity) {
		// TODO Auto-generated method stub
		activityMapper.updateByPrimaryKeySelective(activity);
	}

	/**
	 * @Title:   findAllActivitiesByNoReleaseregion
	 * @Description:  查询所有没有举行的活动
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Activity> findAllActivitiesByNoReleaseregion() {
		ActivityExample example=new ActivityExample();
		example.createCriteria().andStateLike("%未进行%");
		return activityMapper.selectByExample(example);
	}

}
