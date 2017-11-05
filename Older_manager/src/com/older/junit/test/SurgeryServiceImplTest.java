package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Surgery;
import com.older.manager.service.oldback.SurgeryService;
/**
 * 测试手术列表
 * @author 疯癫
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SurgeryServiceImplTest {
	   @Autowired
	   @Qualifier("surgeryServiceImpl")
       private SurgeryService surgeryService;
	   
	   /**
	    * 测试增加
	    * @throws Exception
	    */
	   @Test
	   public void addSurgery()throws Exception{
		   for (int i = 0; i < 5; i++) {
			   Surgery surgery=new Surgery();
			   surgery.setSurgeryname("切除囊尾炎"+i);
			   surgery.setSurgerytime(new Date());
			   surgery.setHospitalname("花溪人民医院"+i);
			   surgery.setRemark("大出血不治而亡"+i);
			   surgery.setOldmanId(30+i);
			   surgeryService.addSurgery(surgery);
			
		}
		   
		   
	   }
	   /**
	    * 测试通过id查一条
	    * @throws Exception
	    */
	  @Test 
	  public void selectByid()throws Exception{
		  System.out.println("************"+surgeryService.selectSurgeryById(1));
	  } 
	   /**
	    * 模糊查询所有的
	    * @throws Exception
	    */
	  @Test 
	  public void  selectAll()throws Exception{
		  Surgery surgery=new Surgery();
		  surgery.setSurgeryname("切除囊尾炎");
		  Oldman oldman=new Oldman();
		  oldman.setName("老人看看");
		  surgery.setOldman(oldman);
		  System.out.println(surgeryService.selectAllSurgery(surgery).size()+"************************");
	  } 
	   
	   
	   
	   
	   
	   
	   
}
