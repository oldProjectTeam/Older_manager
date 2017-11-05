package com.older.junit.test;

import java.util.Date;

import org.apache.logging.log4j.core.config.plugins.ResolverUtil.NameEndsWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Bloodtransfusion;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.BloodService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
/**
 * 输血
 * @author 疯癫
 *
 */
public class BloodServiceImplTest {
	@Autowired
	@Qualifier("bloodServiceImpl")
    private BloodService bloodService;
	
	/**
	 * 测试增加
	 * @throws Exception
	 */
	@Test
	public void testaddBlood()throws Exception{
		for (int i = 0; i < 5; i++) {
			Bloodtransfusion bloodtransfusion=new Bloodtransfusion();
			bloodtransfusion.setBloodtransfusionwhy("缺血性贫血"+i);
			bloodtransfusion.setOccurrencetime(new Date());
			bloodtransfusion.setBloodtransfusionamount(500.00);
			bloodtransfusion.setRemark("没有备注"+i);
			bloodtransfusion.setOldmanId(30+i);
			bloodService.addBlood(bloodtransfusion);
			
		}
		
	}
	/**
	 * 测试通过id来查一条
	 * @throws Exception
	 */
	@Test
	public  void  selectBlood()throws Exception{
		System.out.println("***************"+bloodService.selectBloodById(1));
	}
	
	/**
	 * 测试模糊查询
	 * @throws Exception
	 */
	@Test
	public void selectAllBlood()throws Exception{
		Oldman oldman=new Oldman();
		oldman.setName("老人看看");
		Bloodtransfusion bloodtransfusion=new Bloodtransfusion();
		bloodtransfusion.setOldman(oldman);
		System.out.println("*******************"+bloodService.selectfAllBlood(bloodtransfusion).size());
	}
	
}
