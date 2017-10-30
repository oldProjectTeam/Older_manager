package com.older.junit.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.service.oldback.IOldManCountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OldManServiceImplTest {

	@Autowired
	private IOldManCountService oldManCountService;

	/**
	 * 老人饼状图数据的测试
	 */
	@Test
	public void testGetAll() {
		Map<String, Object> map = oldManCountService.getAll();
		List<String> legend = (List<String>) map.get("legend");
		for (String string : legend) {
			System.out.println("老人的年龄阶段------>" + string);
		}
		System.out
				.println("#####################################################");
		List<Map> serisData = (List<Map>) map.get("serisData");
		for (int i = 0; i < serisData.size(); i++) {
			System.out.println("年龄阶段----->" + serisData.get(i).get("name"));
			System.out.println("这个年龄阶段对应的人数------->"
					+ serisData.get(i).get("value"));
		}
	}

}
