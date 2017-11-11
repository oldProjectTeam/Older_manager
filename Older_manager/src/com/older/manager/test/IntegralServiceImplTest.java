package com.older.manager.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Integral;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.IIntegralService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class IntegralServiceImplTest {

	@Autowired
	@Qualifier("integralServiceImpl")
	IIntegralService integralService;

	@Test
	public void testQueryAllIntegral() {

		Integral integral = new Integral();

		integral.setChangetime(new Date(2017 - 10 - 1));

		/*
		 * Oldman oldman=new Oldman(); oldman.setName("张");
		 * integral.setOldman(oldman);
		 */
		List<Integral> integrals = integralService.queryAllIntegral(integral);
		for (Integral i : integrals) {
			System.out.println("id:" + i.getId() + " 姓名："
					+ i.getOldman().getName() + " 当前积分："
					+ i.getCurrentintegral());
		}
	}

	@Test
	public void TestselectOldManNotIntegral() {

		List<Oldman> list = integralService.selectOldManNotIntegral(null);
		for (Oldman o : list)
			System.out.println("ID:" + o.getId() + " name:" + o.getName());
	}

	@Test
	public void testDeleteIntegral() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatchDeleteIntegral() {
		fail("Not yet implemented");
	}

}
