package com.older.manager.test.shop;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.Products;
import com.older.manager.service.oldback.shop.IProductKeywordService;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.utils.UUIDTools;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ProductServiceImplTest {

	@Autowired
	IProductService productService;
	@Autowired
	IProductKeywordService productKeywordService;
	@Test
	public void testSelectProducts() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCondition() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertProducts() {
		Products products=new Products();
		products.setName("vivo智能手机");
		products.setOrprice(50.0);
		products.setNowprice(45.00);
		products.setRegion("浙江省");
		products.setDescription("测试数据，产品详细描述");
		products.setSales(100);
		products.setSynopsis("测试数据，简要描述");
		products.setInventory(1000);
		products.setImagetitle("步步高时尚品牌手机");
		
		ProductKeyword productKeyword=new ProductKeyword();
		productKeyword.setKeyword("智能手机 vivo 步步高 智能");
		 
		
		productService.insertProducts(products);
		//int id=productService.insertProducts(products);
		System.out.println("id---------------"+products.getId());
		
		productKeyword.setProductId(products.getId());
		productKeywordService.insertProductKeyword(productKeyword);
	}

	@Test
	public void testDeleteProducts() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByNumber() {
		fail("Not yet implemented");
	}

}
