package com.older.manager.shopfront.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.ShoppingCart;
import com.older.manager.service.shopfront.IShoppingCartService;

 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ShoppingCartServiceImplTest {

	@Autowired
	IShoppingCartService shoppingCartService;
	@Test
	public void testInsertShoppingCart() throws Exception {
		 ShoppingCart cart=new ShoppingCart();
		 cart.setUsersId(2);
		 for(int i=35;i<51;i++){
			 cart.setNumber(i-32);
			  cart.setProdutsId(i);
			  shoppingCartService.insertShoppingCart(cart);
		 }
		
	}

	@Test
	public void testDeleteShoppingCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateShoppingCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllCarts() throws Exception {
		System.out.println( shoppingCartService.findAllCarts(2));
	}

	@Test
	public void testBatchDelCart() {
		fail("Not yet implemented");
	}

}
