package com.older.manager.service.impl.oldfront;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Activity;
import com.older.manager.bean.ActivityExample;
import com.older.manager.bean.Courses;
import com.older.manager.bean.Video;
import com.older.manager.mapper.ActivityMapper;
import com.older.manager.mapper.CoursesMapper;
import com.older.manager.mapper.VideoMapper;
import com.older.manager.service.oldfront.IOlderOfficialService;

@Service
public class OlderOfficialServiceImpl implements IOlderOfficialService {

	@Autowired
	private ActivityMapper activityMapper;

	@Autowired
	private CoursesMapper coursesMapper;

	@Autowired
	private VideoMapper videoMapper;

	@Override
	public Map<String, Object> info() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Activity> activities = activityMapper.selectByExample(null);
		List<Courses> courses = coursesMapper.selectByExample(null);
		map.put("activities", activities);
		map.put("courses", courses);
		return map;
	}

	@Override
	public Activity queryActivityById(Integer id) {
		return activityMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Activity> queryRandomActivity() {
		List<Activity> activities = activityMapper.selectByExample(null);
		List<Integer> randomIds = new ArrayList<Integer>();
		List<Activity> randomActivies = new ArrayList<Activity>();
		if (activities.size() > 0) {
			for (Activity activity : activities) {
				randomIds.add(activity.getId());
			}
		}
		for (int i = 0; i < 6; i++) {
			int randomId = (int) (Math.random() * activities.size());
			randomActivies.add(activities.get(randomId));
		}
		return randomActivies;
	}

	@Override
	public List<Courses> courseInfo() {
		return coursesMapper.selectByExample(null);
	}

	@Override
	public List<Video> videoInfo() {
		return videoMapper.selectByExample(null);
	}

	@Override
	public Video queryVideoById(Integer id) {
		return videoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Video> videoLive() {
		List<Video> videos = videoMapper.selectByExample(null);
		List<Integer> randomIds = new ArrayList<Integer>();
		List<Video> randomVideos = new ArrayList<Video>();
		if (videos.size() > 0) {
			for (Video video : videos) {
				randomIds.add(video.getId());
			}
		}
		for (int i = 0; i < 10; i++) {
			int randomId = (int) (Math.random() * videos.size());
			randomVideos.add(videos.get(randomId));
		}
		return randomVideos;
	}

	@Override
	public Courses queryCourseById(Integer id) {
		return coursesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Courses> queryRandomCourse() {
		List<Courses> courses = coursesMapper.selectByExample(null);
		List<Integer> randomIds = new ArrayList<Integer>();
		List<Courses> randomCourses = new ArrayList<Courses>();
		if (courses.size() > 0) {
			for (Courses courses2 : courses) {
				randomIds.add(courses2.getId());
			}
		}
		for (int i = 0; i < 6; i++) {
			int randomId = (int) (Math.random() * courses.size());
			randomCourses.add(courses.get(randomId));
		}
		return randomCourses;
	}

	@Override
	public List<Activity> infoActivity() {
		return activityMapper.selectByExample(null);
	}

}
