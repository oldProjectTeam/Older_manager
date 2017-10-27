package com.older.manager.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.Courses;
import com.older.manager.bean.Oldman;
import com.older.manager.mapper.CourseenrolMapper;
import com.older.manager.service.oldback.ICourseenrolService;
 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class CourseenrolServiceImplTest {

	@Autowired
	@Qualifier("courseenrolServiceImpl")
	 ICourseenrolService courseenrolService;
	@Autowired
	@Qualifier("courseenrolMapper")
	CourseenrolMapper courseenrolMapper;
	@Test
	public void testQueryAllCourseenrolByExample() {
		 
		 System.out.println(courseenrolService.queryAllCourseenrolByExample(null));
	}

	@Test
	public void  queryCourseenrolById(){
		//System.out.println(courseenrolService.queryCourseenrolById(4));
		Courseenrol courseenrol=new Courseenrol();
	//	courseenrol.setId(1);
		Courses courses=new Courses();
	//	courses.setTitle("哈");
		Oldman oldman=new Oldman();
		courseenrol.setCourses(courses);
		courseenrol.setOldman(oldman);
		for(Courseenrol c:courseenrolMapper.selectCourseenrolCourseOldManByCondition(courseenrol))
			System.out.println("id-->"+c.getId()+" 课程名称--->"+c.getCourses().getTitle()+" 老人-->"+c.getOldman().getName());
	}
}
