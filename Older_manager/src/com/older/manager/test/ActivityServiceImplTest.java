package com.older.manager.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Activity;
import com.older.manager.mapper.ActivityMapper;
import com.older.manager.service.oldback.IActivityService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ActivityServiceImplTest {

	@Autowired
	@Qualifier("activityServiceImpl")
	IActivityService activityService;
	
	@Autowired
	ActivityMapper activityMapper;

	
	@Test
	public void testInsertActivity() {
		 
		Activity activity=new Activity();
		for(int i=1;i<100;i++){
			activity.setTitle("九寨沟"+i+"日游");
			activity.setPlace("九寨沟");
			activity.setReleasepeople("孝和集团");
			activity.setActivitytime(new Date());
			activity.setReleasetime(new Date());
			activity.setState("未进行");
			activity.setContent("活动内容：三亚"+i+"日游");
			 activityMapper.insertSelective(activity);
		}
	}

	@Test
	public void testQueryAllActivityByCondiction() {
		 Activity activity=new Activity();
		 //activity.setTitle("一");
		 
		 activity.setActivitytime(new Date());
		List<Activity>list= activityService.queryAllActivityByCondiction(activity);
		for(Activity a:list){
			System.out.println("Id--->"+a.getId()+" title------>"+a.getTitle()+" activitytime------>"+a.getActivitytime());
		}
		 
	}

}
