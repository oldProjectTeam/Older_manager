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

import com.older.manager.bean.RecomProductsDetails;
import com.older.manager.service.oldback.RecomProductsDetailsService;

/**
 * @author ym
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RecomProductsDetailsServiceImplTest {

	@Autowired
	RecomProductsDetailsService recomProductsDetailsService;
	
	
	@Test
	public void addRecomProductsDetailsTest(){
		
		for (int i = 0; i < 20; i++) {
			RecomProductsDetails recomProductsDetails=new RecomProductsDetails();
			recomProductsDetails.setOldmanId(16);
			recomProductsDetails.setRecomtime(new Date());
			recomProductsDetails.setRecomproductsId(1);
			if (i%2==0) {
				recomProductsDetails.setResult("已推荐");
			}else {
				recomProductsDetails.setResult("未推荐");
			}
			recomProductsDetailsService.addRecomProductsDetails(recomProductsDetails);
		}
	
	};
	
	@Test
	public void findRecomProductsByidTest(){
		System.out.println(recomProductsDetailsService.findRecomProductsDetailsById(2));
	}
	
	@Test
	public void selectAllDetailRecomProductsDetailsTest(){
		System.out.println(recomProductsDetailsService.findAllRecomProductsDetailsBySearch("小刘", "", "未推荐"));
	}
}
