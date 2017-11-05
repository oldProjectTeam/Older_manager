package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Trauma;
import com.older.manager.service.oldback.TraumaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TraumaServiceImplTest {
	@Autowired
	@Qualifier("traumaServiceImpl")
	private TraumaService traumaService;
	
	
	
	
	/**
	 * 测试增加
	 * @throws Exception
	 */
	@Test
	public void testaddtrauma()throws Exception{
		for (int i = 0; i <5; i++) {
			Trauma trauma=new Trauma();
			trauma.setTraumaname("腿摔伤"+i);
			trauma.setOccurrencetime(new Date());
			trauma.setHospitalname("花溪人民医院"+i);
			trauma.setRemark("没有大碍"+i);
			trauma.setOldmanId(30+i);
			traumaService.addTrauma(trauma);
			
		}
		
	}
	/**
	 * 同过id来查一条
	 * @throws Exception
	 */
	@Test
	public  void testselectbyid()throws Exception{
		System.out.println("*********************"+traumaService.selectTrauma(1));
	}
	/**
	 * 模糊查询所有的
	 * @throws Exception
	 */
	@Test
    public void  testselectall()throws Exception{
    	Trauma trauma=new Trauma();
		trauma.setTraumaname("腿摔伤");
    	Oldman oldman=new Oldman();
    	oldman.setName("老人看看");
    	trauma.setOldman(oldman);
    	System.out.println(traumaService.selectTrauma(trauma).size()+"*******************************");
    	
    	
    }
	
	
}
