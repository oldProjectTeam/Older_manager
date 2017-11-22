package com.older.manager.service.oldfront;

public interface ICourseService {

	/**
	 * 课程报名
	 * @param courseId
	 * @param oldManId
	 * @return
	 */
	boolean JoinCourseWithOldMan(Integer courseId, Integer oldManId);

}
