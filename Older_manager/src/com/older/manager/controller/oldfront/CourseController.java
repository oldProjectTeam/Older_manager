package com.older.manager.controller.oldfront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
