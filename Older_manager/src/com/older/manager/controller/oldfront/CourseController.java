package com.older.manager.controller.oldfront;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.Courses;
import com.older.manager.service.oldfront.ICourseService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("course")
public class CourseController {

	@Autowired
	private ICourseService courseService;

	/**
	 * @Title: initBinder
	 * @Description: 解决上传时间转换问题
	 * @param: @param binder
	 * @return: void
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

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
	public String course(Model model) {
		PageHelper.startPage(1, 6);
		List<Courses> courses = courseService.queryAllCourse();
		PageInfo<Courses> pageInfo = new PageInfo<Courses>(courses, 6);
		model.addAttribute("pageInfo", pageInfo);
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

	/**
	 * 查询课程
	 * 
	 * @param pn
	 *            页数
	 * @param oldManId
	 *            老人id
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @return
	 */
	@RequestMapping("/queryCourseByOldManAndStartTimeAndEndTime")
	@ResponseBody
	public Msg queryCourseByOldManAndStartTimeAndEndTime(
			@RequestParam("pn") Integer pn,
			@RequestParam("oldManId") Integer oldManId,
			@RequestParam("startTime") Date startTime,
			@RequestParam("endTime") Date endTime) {
		PageHelper.startPage(pn, 12);
		List<Courseenrol> list = courseService
				.queryCourseByOldManAndStartTimeAndEndTime(oldManId, startTime,
						endTime);
		PageInfo<Courseenrol> pageInfo = new PageInfo<Courseenrol>(list, 6);
		if (list != null && list.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}

	/**
	 * 查询当前老人的报名课程
	 * 
	 * @param pn
	 * @param oldManId
	 * @return
	 */
	@RequestMapping("/queryCourseByOldMan")
	@ResponseBody
	public Msg queryCourseByOldMan(@RequestParam("pn") Integer pn,
			@RequestParam("oldManId") Integer oldManId) {
		PageHelper.startPage(pn, 12);
		List<Courseenrol> list = courseService.queryCourseByOldMan(oldManId);
		PageInfo<Courseenrol> pageInfo = new PageInfo<Courseenrol>(list, 6);
		if (list.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}
}
