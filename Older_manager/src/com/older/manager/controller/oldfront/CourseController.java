package com.older.manager.controller.oldfront;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Courses;
import com.older.manager.service.oldfront.ICourseService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("course")
public class CourseController {

	@Autowired
	private ICourseService courseService;

	/**
	 * 课程报名
	 * 
	 * @param courseId
	 *            课程id
	 * @param oldManId
	 *            老人id
	 * @return
	 */
	@RequestMapping("/JoinCourseWithOldMan")
	@ResponseBody
	public Msg JoinCourseWithOldMan(@RequestParam("courseId") Integer courseId,
			@RequestParam("oldManId") Integer oldManId) {
		boolean flag = courseService.JoinCourseWithOldMan(courseId, oldManId);
		if (flag) {
			return Msg.success();
		} else {
			return Msg.fail();
		}
	}

	@RequestMapping("/course_list")
	public String course() {
		return "oldfront/older/course_list";
	}

	@RequestMapping("/queryAllCourse")
	@ResponseBody
	public Msg queryAllCourse(@RequestParam("pn") Integer pn) {
		PageHelper.startPage(pn, 10);
		List<Courses> list = courseService.queryAllCourse();
		PageInfo<Courses> pageInfo = new PageInfo<Courses>(list, 6);
		if (list.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}

	@RequestMapping("/queryCourseByKeyWord")
	@ResponseBody
	public Msg queryCourseByKeyWord(@RequestParam("pn") Integer pn, String key) {
		PageHelper.startPage(pn, 12);
		try {
			key = new String(key.getBytes("ISO-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		List<Courses> list = courseService.queryCourseByKeyWord(key);
		PageInfo<Courses> pageInfo = new PageInfo<Courses>(list, 6);
		if (list.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}
}
