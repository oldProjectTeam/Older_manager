package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldman;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.service.oldback.IOldManCountService;

@Service
public class OldManServiceImpl implements IOldManCountService {

	@Autowired
	private OldmanMapper oldmanMapper;

	/**
	 * 老人饼状图显示数据,按年龄阶段
	 */
	@Override
	public Map<String, Object> getAll() {
		List<Oldman> list = oldmanMapper.selectByExample(null);
		Map<String, Object> map = new HashMap<String, Object>();
		// 不同年龄阶段
		List<String> legend = new ArrayList<String>();
		legend.add("年龄60-69");
		legend.add("年龄70-79");
		legend.add("年龄80-89");
		legend.add("年龄90-99");
		legend.add("100以上");
		map.put("legend", legend);
		// 用来记录不同年龄阶段的老人的人数
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		for (Oldman oldman : list) {
			int age = oldman.getAge();
			if (age > 59 && age < 70) {
				count1++;
			} else if (age > 69 && age < 80) {
				count2++;
			} else if (age > 79 && age < 90) {
				count3++;
			} else if (age > 89 && age < 100) {
				count4++;
			} else if (age > 99) {
				count5++;
			}
		}
		// 将查询出来不同年龄阶段的人数放到集合中
		List<Integer> size = new ArrayList<Integer>();
		size.add(count1);
		size.add(count2);
		size.add(count3);
		size.add(count4);
		size.add(count5);
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

	/**
	 * 老人数据统计，按照地区
	 */
	@Override
	public Map<String, Object> getOldManAll() {
		List<Oldman> list = oldmanMapper.selectByExample(null);
		Map<String, Object> map = new HashMap<String, Object>();
		// 不同年龄阶段
		List<String> legend = new ArrayList<String>();
		for (Oldman oldman : list) {
			if (!legend.contains(oldman.getService())) {
				legend.add(oldman.getService());
			}
		}
		map.put("legend", legend);
		// 用来记录人数
		int count = 0;
		List<Integer> size = new ArrayList<Integer>();
		for (int i = 0; i < legend.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				String legendService = legend.get(i);
				String regionService = list.get(j).getService();
				if (legendService.equals(regionService)) {
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
