package com.older.manager.service.impl.oldfront;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Activity;
import com.older.manager.bean.ActivityExample;
import com.older.manager.bean.Courses;
import com.older.manager.mapper.ActivityMapper;
import com.older.manager.mapper.CoursesMapper;
import com.older.manager.service.oldfront.IOlderOfficialService;

@Service
public class OlderOfficialServiceImpl implements IOlderOfficialService {

	@Autowired
	private ActivityMapper activityMapper;

	@Autowired
	private CoursesMapper coursesMapper;

	@Override
	public Map<String, Object> info() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Activity> activities = activityMapper.selectByExample(null);
		List<Courses> courses = coursesMapper.selectByExample(null);
		map.put("activities", activities);
		map.put("courses", courses);
		return map;
	}

}
