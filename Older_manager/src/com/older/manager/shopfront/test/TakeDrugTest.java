package com.older.manager.shopfront.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Takedrugdetails;
import com.older.manager.service.oldfront.ITakeDrugService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TakeDrugTest {

	@Autowired
	@Qualifier("takeDrugServiceImpl")
	private ITakeDrugService takeDrugService;
	
	
	@Test
	public void selectAllDrugTake()throws Exception{
		Takedrugdetails takedrugdetails=new Takedrugdetails();
		takedrugdetails.setOldmanId(4);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse("2017-11-01");
		Date g = sdf.parse("2017-11-23");
		takedrugdetails.setStarttakingdate(d);
		takedrugdetails.setEndtakingdate(g);
		
	    System.out.println(takedrugdetails.getStarttakingdate()+"时间---------------》");
		System.out.println("-------------->"+takeDrugService.selectAllTakeDrug(takedrugdetails).size());
	}
}
