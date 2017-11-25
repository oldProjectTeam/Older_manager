package com.older.manager.shopfront.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.service.shopfront.IOrderdetailService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class OrderdetailServiceImplTest {
	
	@Autowired
	@Qualifier("orderdetailServiceImpl")
	private IOrderdetailService iOrderdetailService;
	
	
	@Test
	public void selectById()throws Exception{
		System.out.println("*****************"+iOrderdetailService.selectOrderDetailByid(1));
		
	}

	
	
	@Test
	public void selectall()throws Exception{
		Orderdetail orderdetail=new Orderdetail();
	     Orders orders=new Orders();
	  /*   orders.setUserId(220);
	     orders.setState("待付款");*/
	     //orders.setOrderNo("2017112273139");
	     orders.setId(8);
	     orderdetail.setOrders(orders);
	     
	     
	     
		System.out.println("*****************"+iOrderdetailService.selectAllOrderDetailByOrderId(8).size());
		
		
	}
	@Test
	public void testupdate()throws Exception{
		Orders orders=new Orders();
		orders.setState("已评价");
		orders.setId(2);
		orders.setFreight(100.0);
		iOrderdetailService.updatestate(orders);
		
	}
	
	

}
