/**
 * 
 */
package com.older.manager.service.oldback;


import java.util.List;

import com.older.manager.bean.Courses;

/**
 * 处理课程的服务接口
 * @author ym
 *
 */
public interface CourseService {
	
	
	/**
	 * @Title:   findCourses
	 * @Description:  根据id查询课程
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Courses   
	 * @throws
	 */
	public Courses findCoursesById(int id);
	
	
	/**
	 * @Title:   findCoursesByName
	 * @Description:  根据课程名查询
	 * @param:    @param CoursesName
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> findCoursesByName(String CoursesName);
	
	
	/**
	 * @Title:   finAllCoursesByTeacher
	 * @Description:  根据老师的名字来查询课程
	 * @param:    @param teacherName
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> finAllCoursesByTeacher(String teacherName);
	
	/**
	 * @Title:   deleteCoursesById
	 * @Description:  根据id删除课程
	 * @param:    @param id   
	 * @return:   void   
	 * @throws
	 */
	public int deleteCoursesById(int id);
	
	
	/**
	 * @Title:   modifyCourses
	 * @Description:  修改课程
	 * @param:    @param courses
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int modifyCourses(Courses courses);

	
	/**
	 * @Title:   addCourse
	 * @Description:  添加课程
	 * @param:    @param courses
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int addCourse(Courses courses);
	
	/**
	 * @Title:   findAllCoursesByLimitCount
	 * @Description:  根据每页显示的页数来显示数据，主要用于第一次加载页面
	 * @param:    @param view
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> findAllCoursesByLimitCount(int view);


	/**
	 * @Title:   findAll
	 * @Description:  查询所有的课程数据
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> findAll();

	
	/**
	 * @Title:   findAllCourseByCoursesOrTeacher
	 * @Description:  根据课程名字或者老师查询课程
	 * @param:    @param CourseName
	 * @param:    @param teacher
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> findAllCourseByCoursesOrTeacher(String CourseName,String teacher);
	
	
	/**
	 * @Title:   findAllCourseByCoursesAndTeacher
	 * @Description:  根据课程名字和老师查询课程
	 * @param:    @param CourseName
	 * @param:    @param teacher
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> findAllCourseByCoursesAndTeacher(String CourseName,String teacher);
}
