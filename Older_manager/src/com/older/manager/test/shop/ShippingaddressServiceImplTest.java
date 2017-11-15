/**
 * 
 */
package com.older.manager.test.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.service.oldback.shop.ShippingaddressService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ShippingaddressServiceImplTest {

	
	@Autowired
	ShippingaddressService shippingaddressService;
	
	@Test
	public void findShippingaddressByUserIdTest(){
		System.out.println(shippingaddressService.findShippingaddressByUserId(1));;
	};
	
	@Test
	public void findAllShippingaddressesByUserIdTest(){
		System.out.println(shippingaddressService.findAllShippingaddressesByUserId(1));;
	};
	
	@Test
	public void addShippingAddressTest(){
		for (int i = 0; i < 10; i++) {
			Shippingaddress shippingaddress=new Shippingaddress();
			shippingaddress.setUserId(1);
			shippingaddress.setState(0);
			shippingaddress.setLocation("贵州省贵阳市花溪区");
			shippingaddress.setDetailaddress("贵州大学南校区职工5楼");
			shippingaddress.setName("小路"+i);
			shippingaddress.setPhone("13007831317");
			
			shippingaddressService.addShippingAddress(shippingaddress);
		}
	}
	
	
}
