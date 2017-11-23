/**
 * 
 */
package com.older.manager.shopfront.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.service.shopfront.ShopHomeService;

/**
 * @author ym
 * @date 2017年11月20日 下午8:42:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ShopHomeServiceImplTest {

	
	@Autowired
	ShopHomeService shopHomeService;
	
	@Test
	public void findAllProductTypesAndBrand(){
		System.out.println(shopHomeService.findAllProductTypesAndBrand());
	}
	
	@Test
	public void selectAllProductTypeAndProductsTest(){
		System.out.println(shopHomeService.findAllProductTypeAndProducts());
	}
	
	
}
