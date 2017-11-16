package com.older.manager.shopfront.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.service.shopfront.IOrderdetailService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class OrderdetailServiceImplTest {
	
	@Autowired
	@Qualifier("orderdetailServiceImpl")
	private IOrderdetailService iOrderdetailService;
	
	
	@Test
	public void selectById()throws Exception{
		System.out.println("*****************"+iOrderdetailService.selectOrderDetailByUserid(7));
		
	}

}
