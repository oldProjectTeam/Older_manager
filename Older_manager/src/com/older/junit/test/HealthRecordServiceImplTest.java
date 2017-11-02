package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Medicalrecord;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.HealthRecordService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HealthRecordServiceImplTest {
    @Autowired
    @Qualifier("healthRecordServiceImpl")
	private  HealthRecordService healthRecordService;
    
    /**
     * 测试增加就诊记录 测试成功
     * @throws Exception
     */
    
    @Test
    public void testaddhealthrecord()throws Exception{
    	for (int i = 0; i <10; i++) {
    	   Medicalrecord medicalrecord=new Medicalrecord();
     	   medicalrecord.setHospital("花溪人民医院"+i);
     	   medicalrecord.setDepartment("脑外科"+i);
     	   medicalrecord.setDoctor("罗医生"+i);
     	   medicalrecord.setClinicaltime(new Date());
     	   medicalrecord.setOldmanId(1);
     	   healthRecordService.addHealthRecord(medicalrecord);
			
		}
    	 System.out.println("插入完成了************");  
    }
    
	/**
	 * 测试删除数据 测试成功
	 * @throws Exception
	 */
    @Test
    public void testdeletehealthrecord()throws Exception{
    	healthRecordService.deleteHealthRecord(10);
    }
    
    /**
     * 测试修改
     * @throws Exception
     */
    @Test
   public void testupdatehealthrecord()throws Exception{
    	Medicalrecord medicalrecord=new Medicalrecord();
  	     medicalrecord.setHospital("花溪人民修改医院");
  	     medicalrecord.setId(1);
  	     healthRecordService.updateHealthRecord(medicalrecord);
   } 
    
    /**
     * 测试通过id查询  测试成功
     * @throws Exception
     */
    @Test
    public void  testselecthealthrecodbyid()throws Exception{
    	 System.out.println(healthRecordService.selectHealthRecordById(1));
    }
    /**
     * 模糊查询所有的
     * @throws Exception
     */
    @Test
    public void  testselecthallealthrecord()throws Exception{
    	Medicalrecord medicalrecord=new Medicalrecord();
    	medicalrecord.setDoctor("lzy");
    	
    	/*Oldman oldman=new Oldman();
    	oldman.setName("lzy");
    	medicalrecord.setOldman(oldman);*/
    	System.out.println(healthRecordService.selectAllHealthRecord(medicalrecord).size()+"**********************************************************");
    	
    }
    
    
}
