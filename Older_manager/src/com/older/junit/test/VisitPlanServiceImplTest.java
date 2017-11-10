/**
 * 
 */
package com.older.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.service.oldback.IVisitPlanService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class VisitPlanServiceImplTest {

	@Autowired
	IVisitPlanService iVisitPlanService;
	
	@Test
	public void findAllVisitplansBySearchTest(){
		System.out.println(iVisitPlanService.findAllVisitplansBySearch("", "10"));
	}
}
