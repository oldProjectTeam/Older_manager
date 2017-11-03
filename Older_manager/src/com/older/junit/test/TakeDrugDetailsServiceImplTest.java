package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Takedrugdetails;
import com.older.manager.service.oldback.TakeDrugDetailsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TakeDrugDetailsServiceImplTest {
     @Autowired
     @Qualifier("takeDrugDetailsServiceImpl")
	 private  TakeDrugDetailsService takeDrugDetailsService;
     
     
     
     /**
      * 测试增加数据  测试成功
      * @throws Exception
      */
     @Test
     public void  addTakeDrugDetails()throws Exception{
    	 for (int i = 0; i < 5; i++) {
    		 Takedrugdetails  takedrugdetails=new Takedrugdetails();
  	       takedrugdetails.setMedicines("砒霜"+i);
  	       takedrugdetails.setStarttakingdate(new Date());
  	       takedrugdetails.setEndtakingdate(new Date());
  	       takedrugdetails.setDosage("500ml"+i);
  	       takedrugdetails.setMethoduse("口服加外贴"+i);
  	       takedrugdetails.setRole("一秒取人性命"+i);
  	       takedrugdetails.setOldmanId(30+i);
			takeDrugDetailsService.addTakeDrugDetails(takedrugdetails);
		}
    	 
    	    
     }
     /**
      * 测试删除 测试成功
      * @throws Exception
      */
     @Test
     public void   deleteTakeDrugDetails()throws Exception{
    	 takeDrugDetailsService.deleteTakeDrugDetails(1);
     } 
     /**
      * 测试修改  测试成功
      * @throws Exception
      */
     @Test
     public  void   updateTakeDrugDetails()throws Exception{
    	 Takedrugdetails  takedrugdetails=new Takedrugdetails();
    	 takedrugdetails.setRole("5秒尸体变硬");
    	 takedrugdetails.setId(2);
    	 takeDrugDetailsService.updateTakeDrugDetails(takedrugdetails);
     } 
     /**
      * 模糊查询全部 测试成功
      * @throws Exception
      */
	 @Test
     public void selectTakeDrugDetails()throws Exception{
		 Takedrugdetails takedrugdetails=new Takedrugdetails();
		 takedrugdetails.setMedicines("砒霜");
		 
		 
    	 System.out.println("**********"+takeDrugDetailsService.selectAllTakeDrugDetails(takedrugdetails).size());
     }
     /**
      * 测试查一条数据 测试成功
      * @throws Exception
      */
     @Test
	public void  selectTakeDrugDetailsById()throws Exception{
		System.out.println(takeDrugDetailsService.selectTakeDrugDetailsById(2));
	} 
	 
}
