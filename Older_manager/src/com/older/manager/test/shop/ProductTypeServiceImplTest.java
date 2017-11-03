package com.older.manager.test.shop;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import com.older.manager.bean.ProductType;
import com.older.manager.service.oldback.shop.IProductTypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ProductTypeServiceImplTest {

	@Autowired
	IProductTypeService productTypeService;
	
	@Test
	public void testInsertProductType() {
		ProductType productType=new ProductType();
		productType.setCreatetime(new Date());
		productType.setName("康复护理");
		productType.setSort(1);
		productType.setState(1);
		productType.setParentid(1);
		productType.setRemark("康复护理产品分类，涵括多个产品小分类");
		productTypeService.insertProductType(productType);
		
	}

	@Test
	public void testUpdateProductType() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindProductTypeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllProductType() {
		System.out.println(productTypeService.findAllProductType(null));
	}

}
