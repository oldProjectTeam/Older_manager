package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Activity;
import com.older.manager.bean.Oldman;
import com.older.manager.mapper.ActivityMapper;
import com.older.manager.service.oldback.IActivityCountService;

@Service
public class ActivityCountServiceImpl implements IActivityCountService {

	@Autowired
	private ActivityMapper activityMapper;

	/**
	 * 活动统计
	 */
	@Override
	public Map<String, Object> getAll() {
		List<Activity> list = activityMapper.selectByExample(null);
		Map<String, Object> map = new HashMap<String, Object>();
		// 不同年龄阶段
		List<String> legend = new ArrayList<String>();
		for (Activity activity : list) {
			if (!legend.contains(activity.getPlace())) {
				legend.add(activity.getPlace());
			}
		}
		map.put("legend", legend);
		// 用来记录人数
		int count = 0;
		List<Integer> size = new ArrayList<Integer>();
		for (int i = 0; i < legend.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				String legendPlace = legend.get(i);
				String regionPlace = list.get(j).getPlace();
				if (legendPlace.equals(regionPlace)) {
					count++;
				}
			}
			// 将查询出来不同地区的人数放到集合中
			size.add(count);
			count = 0;
		}
		List<Map> serisData = new ArrayList<Map>();
		for (int i = 0; i < legend.size(); i++) {
			Map<String, Object> map2 = new HashMap<String, Object>();
			map2.put("value", size.get(i));
			map2.put("name", legend.get(i));
			serisData.add(map2);
		}
		map.put("serisData", serisData);
		return map;
	}

}
