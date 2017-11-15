package com.older.manager.shopfront.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.service.shopfront.IOrderService;
import com.older.manager.service.shopfront.IOrderdetailService;
import com.older.manager.utils.UUIDTools;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class OrderServiceImplTest {

	@Autowired
	 IOrderService orderService;
	@Test
	public void testFindOrders() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertOrder() throws Exception {
		  Orders orders=new Orders();
		  orders.setCost(100.0);
		  orders.setFormulaway("中通");
		  orders.setFreight(50.0);
		  orders.setBody("测试数据");
		  orders.setNum(1);
		  orders.setUserId(2);
		  orders.setSubject("测试数据");
		  orders.setState("待付款");
		  orders.setShippingaddressId(2);
		  orders.setPaytype("支付宝即时到账");
		  orders.setOrderNo(UUIDTools.getNumber());
		  orderService.insertOrder(orders);
		 
		  System.out.println("------------------->"+orders.getId());
	}

}
