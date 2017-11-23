package com.older.manager.service.shopfront.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Products;
import com.older.manager.service.shopfront.ProductsSearchService;

/**
 * @author ym
 * @date 2017年11月15日 下午6:58:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ProductsSearchServiceImplTest {

	@Autowired
	ProductsSearchService productsSearchService;

	@Test
	public void findAllProductsBySearchTest() {
		System.out.println(productsSearchService
				.findAllProductsBySearch("肠胃消化"));
	}

	@Test
	public void findAllProductsByComplexSearchTest() {
		Products products = new Products();
		products.setName("vivo");
		//products.setSales(0);
		products.setNowprice(1.0);
		System.out.println("......."
				+ productsSearchService
						.findAllProductsByComplexSearch(products));
	}
	
	@Test
	public void selectAllProductsBrandByComplexSearchTest(){
		Products products=new Products();
		products.setName("vi");
		System.out.println("....."+productsSearchService.selectAllProductsBrandByComplexSearch(products));
	}

	
	@Test
	public void selectAllProductsTypeByComplexSearch(){
		Products products=new Products();
		products.setName("vi");
		System.out.println("....."+productsSearchService.selectAllProductsTypeByComplexSearch(products));
	}
}
