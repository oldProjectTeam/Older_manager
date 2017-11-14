package com.older.manager.service.impl.oldfront;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		
		return null;
	}

}
