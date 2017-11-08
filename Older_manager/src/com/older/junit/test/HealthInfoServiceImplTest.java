package com.older.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Healthinfo;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.HealthInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HealthInfoServiceImplTest {
	@Autowired
	@Qualifier("healthInfoServiceImpl")
	private HealthInfoService healthInfoService;
	/**
	 * 测试增加
	 * @throws Exception
	 */
	@Test
	public void addHealthInfo()throws Exception{
		for (int i = 0; i <5; i++) {
			Healthinfo healthinfo=new Healthinfo();
			healthinfo.setLeftbloodpressure(500.00);
			healthinfo.setRightbloodpressure(500.00);
			healthinfo.setHeight(500.00);
			healthinfo.setBodyweight(500.00);
			healthinfo.setOldmanId(30+i);
			healthInfoService.addHealthInfo(healthinfo);
		}
	
	}
	/**
	 * 测试通过id来查
	 * @throws Exception
	 */
	@Test
	public void selectbyid()throws Exception{
		System.out.println("************"+healthInfoService.selectHealthInfoById(1));
	}
	/**
	 * 模糊查询
	 * @throws Exception
	 */
    @Test
	public void selectall()throws Exception{
    	Healthinfo healthinfo=new Healthinfo();
    	Oldman oldman=new Oldman();
    	oldman.setName("老人看看");
    	healthinfo.setOldman(oldman);
		System.out.println("**************"+healthInfoService.selectHealthInfo(healthinfo).size());
	}
	
}
