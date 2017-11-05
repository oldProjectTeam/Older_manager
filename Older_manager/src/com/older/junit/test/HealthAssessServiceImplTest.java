package com.older.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Assess;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.HealthAssessService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
/**
 * 健康评估
 * @author 疯癫
 *
 */
public class HealthAssessServiceImplTest {
    @Autowired
    @Qualifier("healthAssessServiceImpl")
	private HealthAssessService healthAssessService;
    
    /**
     * 测试增加
     * @throws Exception
     */
    @Test
    public void  addHealthAssess()throws Exception{
    	
    	for (int i = 0; i < 5; i++) {
    		Assess assess=new Assess();
        	assess.setDoctor("罗医生"+i);
        	assess.setHealth("亚健康"+i);
        	assess.setHealthdataassessment("健康"+i);
        	assess.setSuggest("多锻炼身体"+i);
        	assess.setOldmanId(30+i);
        	healthAssessService.addHealthAssess(assess);
		}
       
    }
    
    /**
     * 测试删除
     * @throws Exception
     */
  @Test 
  public void  deleteHealthAssess()throws Exception{
	  healthAssessService.deleteHealthAssess(5);
  }  
   /**
    * 测试修改 
    * @throws Exception
    */
  @Test
  public void  updateHealthAssess()throws Exception{
	  Assess assess=new Assess();
  	  assess.setDoctor("罗医生修改后的");
  	  assess.setId(2);
  	  healthAssessService.updateHealthAssess(assess);
  } 
  /**
   * 通过id来查
   * @throws Exception
   */
   @Test 
  public void  selectByid()throws Exception{
	 System.out.println(healthAssessService.selectHealthAssess(1));
  }  
  
  /**
   * 模糊查询 
   * @throws Exception
   */
   @Test
 public void  selectall()throws Exception{
	 
	   Assess assess=new Assess();
	   Oldman oldman=new Oldman();
	   oldman.setName("老人看看");
	   assess.setOldman(oldman);
	 System.out.println("*********************"+healthAssessService.selectAllHealthAssess(assess).size());
 }  
   
}
