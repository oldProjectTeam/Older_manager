package com.older.manager.service.oldfront;

import java.util.List;
import java.util.Map;

import com.older.manager.bean.Activity;
import com.older.manager.bean.Courses;
import com.older.manager.bean.Video;

public interface IOlderOfficialService {

	/**
	 * 官网最新数据
	 * @return
	 */
	Map<String, Object> info();

	/**
	 * 通过id查询活动信息
	 * @param id
	 * @return
	 */
	Activity queryActivityById(Integer id);

	/**
	 * 随机的从数据库中查询6条活动数据
	 * @return
	 */
	List<Activity> queryRandomActivity();

	/**
	 * 获取最新的6条课程数据
	 * @return
	 */
	List<Courses> courseInfo();

	/**
	 * 获取最新的6条视频数据
	 * @return
	 */
	List<Video> videoInfo();

	/**
	 * 根据id查询视频
	 * @param id
	 * @return
	 */
	Video queryVideoById(Integer id);

	/**
	 * 随机获取10条视频
	 * @return
	 */
	List<Video> videoLive();

	/**
	 * 通过id查询课程
	 * @param id
	 * @return
	 */
	Courses queryCourseById(Integer id);

	/**
	 * 随机的从数据库中查询6条课程数据
	 * @return
	 */
	List<Courses> queryRandomCourse();

	/**
	 * 查询活动
	 * @return
	 */
	List<Activity> infoActivity();

}
