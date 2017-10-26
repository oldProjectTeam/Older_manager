package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Oldman;
import com.older.manager.service.AddNewOlderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AddNewOlderImplTest {
	@Autowired
	@Qualifier("addNewOlderServiceImpl")
	private AddNewOlderService addNewOlderService;
	
	
	/**
	 * 添加老人    测试成功
	 * @throws Exception
	 */
	@Test
	public void insert()throws Exception{
		Oldman oldman=new Oldman();
		oldman.setName("张三");
		oldman.setSex("男");
		oldman.setPhone("18788620293");
		oldman.setNation("汉");
		oldman.setBirthday(new Date());
		oldman.setAge(20);
		oldman.setAddress("看看了");
		oldman.setPhoto("sdf");
		oldman.setService("sdf");
		oldman.setUrgencycontactphone("18788620293");
		oldman.setServicestatu("chaoyan");
		oldman.setUrgencycontact("sdfdsf");
		
		addNewOlderService.addNewOlder(oldman);
		
	}
	
	/**
	 * 通过id 查找老人  测试成功
	 * @throws Exception
	 */
	@Test
	public void selectById()throws Exception{
		
		System.out.println(addNewOlderService.selectOlder(1)+"****************************************************");
		
	}
	/**
	 * 通过id来删除  测试成功
	 * @throws Exception
	 */
	@Test
	public void deleteById()throws Exception{
		addNewOlderService.deleteOlder(3);
		
	}
	/**
	 * 更新老人的信息 测试成功
	 * @throws Exception
	 */
	@Test
	public void  updateById()throws Exception{
		
		Oldman oldman=new Oldman();
		oldman.setId(1);
		oldman.setSex("nv");
		addNewOlderService.updateOlder(oldman);
		
	}
	

}
