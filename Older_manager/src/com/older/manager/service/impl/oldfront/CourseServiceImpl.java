package com.older.manager.service.impl.oldfront;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.CourseenrolExample;
import com.older.manager.bean.CourseenrolExample.Criteria;
import com.older.manager.bean.Courses;
import com.older.manager.bean.CoursesExample;
import com.older.manager.mapper.CourseenrolMapper;
import com.older.manager.mapper.CoursesMapper;
import com.older.manager.service.oldfront.ICourseService;
import com.older.manager.utils.DateUtils;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	private CourseenrolMapper courseenrolMapper;

	@Autowired
	private CoursesMapper coursesMapper;

	@Override
	public boolean JoinCourseWithOldMan(Integer courseId, Integer oldManId) {
		boolean flag = false;
		List<Courseenrol> list = this.queryCourseEnrolByCourseIdAndOldManId(
				courseId, oldManId);
		if (list.size() == 0) {
			Courseenrol courseenrol = new Courseenrol();
			courseenrol.setCourseId(courseId);
			courseenrol.setOldmamId(oldManId);
			courseenrol.setEnroltime(new Date());
			courseenrol.setEnrolstate("报名成功");
			courseenrolMapper.insertSelective(courseenrol);
			flag = true;
		}
		return flag;
	}

	/**
	 * 查询是否已经报名
	 * 
	 * @param courseId
	 * @param oldManId
	 * @return
	 */
	private List<Courseenrol> queryCourseEnrolByCourseIdAndOldManId(
			Integer courseId, Integer oldManId) {
		CourseenrolExample example = new CourseenrolExample();
		Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);
		criteria.andOldmamIdEqualTo(oldManId);
		return courseenrolMapper.selectByExample(example);
	}

	@Override
	public List<Courses> queryAllCourse() {
		return coursesMapper.selectByExample(null);
	}

	@Override
	public List<Courses> queryCourseByKeyWord(String key) {
		CoursesExample example = new CoursesExample();
		com.older.manager.bean.CoursesExample.Criteria criteria = example
				.createCriteria();
		criteria.andTitleLike("%" + key + "%");
		return coursesMapper.selectByExample(example);
	}

	@Override
	public List<Courseenrol> queryCourseByOldManAndStartTimeAndEndTime(
			Integer oldManId, Date startTime, Date endTime) {
		CourseenrolExample example = new CourseenrolExample();
		Criteria criteria = example.createCriteria();
		if (!"".equals(startTime) || !"".equals(endTime)) {
			Courses courses = this.queryCourseByStartTimeAndEndTime(startTime,
					endTime);
			if (courses != null) {
				criteria.andCourseIdEqualTo(courses.getId());
				criteria.andOldmamIdEqualTo(oldManId);
				List<Courseenrol> list = courseenrolMapper
						.selectByExample(example);
				List<Courseenrol> courseenrols = new ArrayList<Courseenrol>();
				for (Courseenrol courseenrol : list) {
					courseenrol.setCourses(courses);
					courseenrols.add(courseenrol);
				}
				return courseenrols;
			}
		}
		return null;
	}

	/**
	 * 通过课程开始时间和结束时间查询课程
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	private Courses queryCourseByStartTimeAndEndTime(Date start, Date end) {
		CoursesExample example = new CoursesExample();
		com.older.manager.bean.CoursesExample.Criteria criteria = example
				.createCriteria();
		criteria.andStarttimeEqualTo(start);
		criteria.andEndtimeEqualTo(end);
		List<Courses> list = coursesMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<Courseenrol> queryCourseByOldMan(Integer oldManId) {
		CourseenrolExample example = new CourseenrolExample();
		Criteria criteria = example.createCriteria();
		criteria.andOldmamIdEqualTo(oldManId);
		List<Courseenrol> list = courseenrolMapper.selectByExample(example);
		List<Courseenrol> courseenrols = new ArrayList<Courseenrol>();
		for (Courseenrol courseenrol : list) {
			Courses courses = coursesMapper.selectByPrimaryKey(courseenrol
					.getCourseId());
			courseenrol.setCourses(courses);
			courseenrols.add(courseenrol);
		}
		return courseenrols;
	}
}
