package com.older.manager.test.shop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.BrandWithBLOBs;
import com.older.manager.service.oldback.shop.IBrandService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BrandServiceImplTest {

	@Autowired
	IBrandService brandService;
	@Test
	public void testInsertBrand() {
		BrandWithBLOBs brand=new BrandWithBLOBs();
		for(int i=0;i<30;i++){
			brand.setName("玉兰油OLAY"+i);
			brand.setSort(1);
			brand.setState(1);
			brand.setRegion("法国");
			brand.setDescription("测试数据"+i);
			brandService.insertBrand(brand);
		}
	}

	@Test
	public void testUpdateBrand() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBrand() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatchDeleteBrand() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindBrandById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllBrand() {
		BrandWithBLOBs brand1=new BrandWithBLOBs();
		brand1.setName("玉兰油");
		List<BrandWithBLOBs>list=brandService.findAllBrand(brand1);
		System.out.println();
		for(BrandWithBLOBs brand:list)
			System.out.println("id--->"+brand.getId()+"name--->"+brand.getName()+"region---->"+brand.getRegion());
		
	}

}
