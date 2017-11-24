package com.older.manager.service.oldfront;

import java.util.List;

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

}
