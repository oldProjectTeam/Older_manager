package com.older.manager.controller.oldfront;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Activity;
import com.older.manager.bean.Courses;
import com.older.manager.bean.Video;
import com.older.manager.service.oldfront.IOlderOfficialService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("official")
public class OlderOfficialController {

	@Autowired
	private IOlderOfficialService officialService;

	@RequestMapping("/info")
	@ResponseBody
	public Msg info() {
		PageHelper.startPage(1, 6);
		Map<String, Object> map = officialService.info();
		@SuppressWarnings("unchecked")
		PageInfo<Activity> activityPageInfo = new PageInfo<Activity>(
				(List<Activity>) map.get("activities"));
		if (map.size() > 0) {
			return Msg.success().add("activityPageInfo", activityPageInfo);
		}
		return Msg.fail();
	}

	@RequestMapping("/infoActivity/{pn}")
	@ResponseBody
	public Msg infoActivity(@PathVariable("pn") Integer pn) {
		PageHelper.startPage(pn, 6);
		List<Activity> activitys = officialService.infoActivity();
		PageInfo<Activity> pageInfo = new PageInfo<Activity>(activitys, 6);
		if (activitys.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		}
		return Msg.fail();
	}

	@RequestMapping("/activityInfo/{id}")
	public String activityInfo(@PathVariable("id") Integer id, Model model) {
		Activity activity = officialService.queryActivityById(id);
		model.addAttribute("activity", activity);
		return "oldfront/older/activity_info";
	}

	@RequestMapping("/courseInfoId/{id}")
	public String courseInfo(@PathVariable("id") Integer id, Model model) {
		Courses course = officialService.queryCourseById(id);
		model.addAttribute("courses", course);
		return "oldfront/older/course_info";
	}

	/**
	 * 随机查询出6条数据出来
	 * 
	 * @return
	 */
	@RequestMapping("/recommend")
	@ResponseBody
	public Msg recommend() {
		List<Activity> activities = officialService.queryRandomActivity();
		if (activities.size() > 0) {
			return Msg.success().add("activities", activities);
		} else {
			return Msg.fail();
		}
	}

	/**
	 * 随机查询出6条数据出来 课程
	 * 
	 * @return
	 */
	@RequestMapping("/recommendCourse")
	@ResponseBody
	public Msg recommendCourse() {
		List<Courses> courses = officialService.queryRandomCourse();
		if (courses.size() > 0) {
			return Msg.success().add("courses", courses);
		} else {
			return Msg.fail();
		}
	}

	@RequestMapping("/courseInfo/{pn}")
	@ResponseBody
	public Msg courseInfo(@PathVariable("pn") Integer pn) {
		PageHelper.startPage(1, 6);
		List<Courses> courses = officialService.courseInfo();
		PageInfo<Courses> pageInfo = new PageInfo<Courses>(courses);
		if (courses.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}

	@RequestMapping("/videoInfo/{pn}")
	@ResponseBody
	public Msg videoInfo(@PathVariable("pn") Integer pn) {
		PageHelper.startPage(1, 6);
		List<Video> videos = officialService.videoInfo();
		PageInfo<Video> pageInfo = new PageInfo<Video>(videos);
		if (videos.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}

	@RequestMapping("/videoLive/{pn}")
	@ResponseBody
	public Msg videoLive(@PathVariable("pn") Integer pn) {
		PageHelper.startPage(1, 10);
		List<Video> videos = officialService.videoLive();
		PageInfo<Video> pageInfo = new PageInfo<Video>(videos);
		if (videos.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail();
		}
	}

	/**
	 * 根据id查询视频
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/videoItemInfo/{id}")
	public String videoInfo(@PathVariable("id") Integer id, Model model) {
		Video video = officialService.queryVideoById(id);
		model.addAttribute("video", video);
		return "oldfront/older/video";
	}

}
