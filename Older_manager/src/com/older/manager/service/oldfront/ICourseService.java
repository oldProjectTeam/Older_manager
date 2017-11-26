package com.older.manager.service.oldfront;

import java.util.Date;
import java.util.List;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.Courses;

public interface ICourseService {

	/**
	 * 课程报名
	 * 
	 * @param courseId
	 * @param oldManId
	 * @return
	 */
	boolean JoinCourseWithOldMan(Integer courseId, Integer oldManId);

	/**
	 * 查询所有的课程
	 * 
	 * @return
	 */
	List<Courses> queryAllCourse();

	/**
	 * 根据关键字查询课程
	 * 
	 * @param key
	 * @return
	 */
	List<Courses> queryCourseByKeyWord(String key);

	/**
	 * 查询我的课程
	 * 
	 * @param oldManId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<Courseenrol> queryCourseByOldManAndStartTimeAndEndTime(
			Integer oldManId, Date startTime, Date endTime);

	/**
	 * 查询当前老人的课程报名
	 * 
	 * @param oldManId
	 * @return
	 */
	List<Courseenrol> queryCourseByOldMan(Integer oldManId);

}
