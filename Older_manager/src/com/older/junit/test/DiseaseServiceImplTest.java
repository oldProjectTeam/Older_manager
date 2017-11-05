package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Disease;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.DiseaseService;

/**
 * 疾病列表
 * @author 疯癫
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DiseaseServiceImplTest {
	@Autowired
	@Qualifier("diseaseServiceImpl")
    private DiseaseService diseaseService;
	
	
	/**
	 * 测试增加
	 * @throws Exception
	 */
	@Test
	public void addDisease()throws Exception{
		for (int i = 0; i < 5; i++) {
			 Disease disease=new Disease();
			 disease.setDiseasename("天花"+i);
			 disease.setConfirmedtime(new Date());
			 disease.setPlace("花溪人民医院"+i);
			 disease.setNowstate("保守治疗中"+i);
			 disease.setRemark("无法治愈，只有等死"+i);
			 disease.setOldmanId(30+i);
			 diseaseService.addDisease(disease);
		}
		
	}
	/**
	 * 测试查一条
	 * @throws Exception
	 */
	@Test
	public  void  selectbyid()throws Exception{

		 System.out.println(diseaseService.selectDisease(1));
	}
	/**
	 * 模糊查询
	 * @throws Exception
	 */
	@Test
	public  void  selectall()throws Exception{
		Disease disease=new Disease();
		//disease.setDiseasename("天花");
		Oldman oldman=new Oldman();
		oldman.setName("老人看看");
		disease.setOldman(oldman);

		 System.out.println("*************************"+diseaseService.selectAllDiseases(disease).size());
	}
	
}
