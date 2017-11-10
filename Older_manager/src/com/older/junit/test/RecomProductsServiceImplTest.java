/**
 * 
 */
package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.RecomProducts;
import com.older.manager.service.oldback.RecomProductsService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RecomProductsServiceImplTest {

	
	@Autowired
	RecomProductsService recomProductsService;
	
	@Test
	public void addRecomProducts(){
		RecomProducts recomProducts=new RecomProducts();
		recomProducts.setProductsId(4);
		recomProducts.setRecompeople("小刘");
		recomProducts.setState("未推荐");
		recomProducts.setRecomtime(new Date());
		recomProducts.setRecomid("未成功");
		recomProductsService.addRecomProducts(recomProducts);
	}
	
	@Test
	public void findRecomProductsByidTest(){
		System.out.println(recomProductsService.findRecomProductsByid(1));;
	}
}
