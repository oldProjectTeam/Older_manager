package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Genetichistory;
import com.older.manager.service.oldback.GeneticHistoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class GeneticHistoryServiceImplTest {
	   @Autowired
	   @Qualifier("geneticHistoryServiceImpl")
       private GeneticHistoryService geneticHistoryService;
	   
	   /**
	    * 测试增加
	    * @throws Exception
	    */
	   @Test
	   public void addGeneticHistory()throws Exception{
		   for (int i = 0; i <5; i++) {
			   Genetichistory genetichistory=new Genetichistory();
			   genetichistory.setDiseasename("先天性腿短"+i);
			   genetichistory.setInfectiontime(new Date());
			   genetichistory.setPlace("花溪人民医院"+i);
			   genetichistory.setRemark("无"+i);
			   genetichistory.setOldmanId(30+i);
			   geneticHistoryService.addGeneticHistory(genetichistory);
			   
		}
		  
	   }
          /**
           * 通过id查一条数据	   
           * @throws Exception
           */
	   @Test
	   public void selectByid()throws Exception{
		   System.out.println("*****************"+geneticHistoryService.selectGeneticHistoryById(1));
	   }
	   /**
	    * 模糊查询所有的
	    * @throws Exception
	    */
	   @Test
	   public void selectAll()throws Exception{
		   Genetichistory genetichistory=new Genetichistory();
		   genetichistory.setDiseasename("腿短");
		   System.out.println("****************"+geneticHistoryService.selectAllGeneticHistory(genetichistory).size());
	   }
	   
	   
}
