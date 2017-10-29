/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Courses;
import com.older.manager.bean.CoursesExample;
import com.older.manager.mapper.CoursesMapper;
import com.older.manager.service.oldback.CourseService;

/**
 * @author ym
 * 修改：杨明 修改时间：2017/10/29 修改内容：添加注解
 * 
 */
@Service()
public class CoursesServiceImpl implements CourseService {

	@Autowired
	private CoursesMapper coursesMapper;

	/**
	 * @Title: findCourses
	 * @Description: 根据id查询课程
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Courses findCoursesById(int id) {
		// TODO Auto-generated method stub

		return coursesMapper.selectByPrimaryKey(id);

	}

	/**
	 * @Title: findCoursesByName
	 * @Description: 根据名字查询课程列表
	 * @param: @param CoursesName
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Courses> findCoursesByName(String CoursesName) {
		// TODO Auto-generated method stub
		// return coursesMapper.selectByExample(CoursesName);
		CoursesExample example = new CoursesExample();

		example.createCriteria().andTitleLike("%"+CoursesName+"%");
		return coursesMapper.selectByExample(example);
	}

	/**
	 * @Title: finAllCoursesByTeacher
	 * @Description: 根据老师名称来查询课程
	 * @param: @param teacherName
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Courses> finAllCoursesByTeacher(String teacherName) {
		// TODO Auto-generated method stub
		CoursesExample example=new CoursesExample();
		example.createCriteria().andTeacherLike("%"+teacherName+"%");
		return coursesMapper.selectByExample(example);
	}

	/**
	 * @Title: deleteCoursesById
	 * @Description: 通过id来查询课程
	 * @param: @param id
	 * @throws
	 */
	@Override
	public int deleteCoursesById(int id) {
		// TODO Auto-generated method stub
		return coursesMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title: modifyCourses
	 * @Description: 修改课程
	 * @param: @param courses
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	@Override
	public int modifyCourses(Courses courses) {
		// TODO Auto-generated method stub
		return coursesMapper.updateByPrimaryKeySelective(courses);
	}

	/**
	 * @Title: addCourse
	 * @Description: 添加课程
	 * @param: @param courses
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	@Override
	public int addCourse(Courses courses) {
		// TODO Auto-generated method stub
		System.out.println(coursesMapper);
		return coursesMapper.insertSelective(courses);

	}

	/**
	 * @Title: findAllCoursesByLimitCount
	 * @Description: TODO
	 * @param: @param view
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Courses> findAllCoursesByLimitCount(int view) {
		// TODO Auto-generated method stub

		CoursesExample example = new CoursesExample();

		example.createCriteria().andLimitnumberBetween(0, view);
		return coursesMapper.selectByExample(example);
	}

	/**
	 * 查询所有的课程
	 * @Title:   findAll
	 * @Description:  TODO
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Courses> findAll() {
		return coursesMapper.selectByExample(null);
	}
	
	
	/**
	 * @Title:   findAllCourseByCoursesOrTeacher
	 * @Description:  根据课程或老师查询
	 * @param:    @param CourseName
	 * @param:    @param teacher
	 * @param:    @return     
	 * @throws
	 */
	public List<Courses> findAllCourseByCoursesOrTeacher(String CourseName,String teacher){
		CoursesExample example=new CoursesExample();
		if (CourseName!=null&&!CourseName.equals("")) {
			example.createCriteria().andTitleLike("%"+CourseName+"%");
		}else if (teacher!=null&&!teacher.equals("")) {
			example.createCriteria().andTeacherLike("%"+teacher+"%");
		}
		return coursesMapper.selectByExample(example);
	}

	
	/**
	 * @Title:   findAllCourseAndCoursesOrTeacher
	 * @Description:  根据课程和老师查询
	 * @param:    @param CourseName
	 * @param:    @param teacher
	 * @param:    @return   
	 * @return:   List<Courses>   
	 * @throws
	 */
	public List<Courses> findAllCourseByCoursesAndTeacher(String CourseName,String teacher){
		CoursesExample example=new CoursesExample();
		example.createCriteria().andTeacherLike("%"+teacher+"%");
		example.createCriteria().andTitleLike("%"+CourseName+"%");
		
		return coursesMapper.selectByExample(example);
	}

	
}
