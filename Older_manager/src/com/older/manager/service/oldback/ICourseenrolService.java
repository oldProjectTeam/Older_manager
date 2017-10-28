package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.CourseenrolExample;

public interface ICourseenrolService {
	
	/**
	 * 查询所有课程信息带老人信息和课程信息
	 * @param example
	 * @return
	 */
	public List<Courseenrol> queryAllCourseenrolByExample(CourseenrolExample example);

	/**
	 * 通过ID查询报名信息和课程信息和老人信息
	 * @param id
	 * @return
	 */
	public Courseenrol queryCourseenrolById(Integer id);
	
	/**
	 * 根据ID查询报名信息
	 * @param id
	 * @return
	 */
	public Courseenrol selectByPrimaryKey(Integer id);
	/**
	 * 根据条件查询所有课程报名和课程与老人信息
	 * @param courseenrol
	 * @return
	 */
	public List<Courseenrol>selectCourseenrolCourseOldManByCondition(Courseenrol courseenrol);

	public void updateCourseerolByPrimaryKey(Courseenrol courseenrol);

	public void deleteCourseerolByPrimaryKey(Integer id);

	public void deleteBatch(List<Integer> del_ids);

	 
	
}
