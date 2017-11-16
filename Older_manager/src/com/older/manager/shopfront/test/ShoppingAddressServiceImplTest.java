package com.older.manager.shopfront.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.service.shopfront.ShoppingAddressService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
/**
 * 收货地址
 * @author 疯癫
 *
 */




public class ShoppingAddressServiceImplTest {
	@Autowired
	@Qualifier("shoppingAddressServiceImpl")
  private  ShoppingAddressService shoppingAddressService;
	
	
	@Test
	public void testAdd()throws Exception{
		for (int i = 0; i < 10; i++) {
			Shippingaddress shippingaddress=new Shippingaddress();
			shippingaddress.setLocation("贵州省"+i);
			shippingaddress.setDetailaddress("花溪贵州大学"+i);
			shippingaddress.setName("罗先生"+i);
			shippingaddress.setPhone("18788620293"+i);
			shippingaddress.setPostcode("563400");
			shippingaddress.setState(1);
			shippingaddress.setUserId(1+i);
			shoppingAddressService.addShoppingAddress(shippingaddress);
			
		}
		
	}
	@Test
	public void selectByid()throws Exception{
		System.out.println("**************"+shoppingAddressService.selectShoppingAddress(21));
		
	}
	@Test
	public  void  selectall()throws Exception{
		Shippingaddress shippingaddress=new Shippingaddress();
		shippingaddress.setUserId(2);
		System.out.println("***********"+shoppingAddressService.selectAllShoppingAddress(shippingaddress).size());
		
	}
	
}
