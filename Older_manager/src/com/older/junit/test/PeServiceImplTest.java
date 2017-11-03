package com.older.junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Pedetails;
import com.older.manager.bean.Peinfo;
import com.older.manager.service.oldback.PeService;
/**
 * 体检测试
 * @author 疯癫
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PeServiceImplTest {
	@Autowired
	@Qualifier("peServiceImpl")
	private  PeService peService;
	
	
	
	/**
	 * 测试添加 测试成功
	 * @throws Exception
	 */
	@Test
	public  void  addPe()throws Exception{
		for (int i = 0; i < 5; i++) {
			Pedetails pedetails=new Pedetails();
			pedetails.setPeproject("肺活量");
			pedetails.setPevalue("3200");
			pedetails.setPeresult("正常");
			pedetails.setResultanalysis("缺乏锻炼");
			pedetails.setPeinfoId(2);
			peService.addPe(pedetails);
			
			
		}
		
	}
	
	/**
	 * 测试删除 测试成功
	 * @throws Exception
	 */
	@Test
	public  void  deletePe()throws Exception{
	
	peService.deletePe(1);
	
	
	}
	/**
	 * 测试修改 测试成功
	 * @throws Exception
	 */
	@Test
	public void  updatePe()throws Exception{
		Pedetails pedetails=new Pedetails();
		pedetails.setPeproject("肺活量测试");
		pedetails.setId(2);
		peService.updatePe(pedetails);
	}
	
	/**查一条 测试成功
	 * 
	 * @throws Exception
	 */
	@Test
	public void  selectByid()throws Exception{
		
		System.out.println("************"+peService.selectPeById(2));
		
	}
	
	/**
	 * 测试模糊查询 测试成功
	 * @throws Exception
	 */
	@Test
	public  void  selectAll()throws Exception{
		
		Pedetails pedetails=new Pedetails();
		Peinfo peinfo=new Peinfo();
		peinfo.setHospital("花溪");
		pedetails.setPeinfo(peinfo);
		
		System.out.println("************"+peService.selectAllPe(pedetails).size());
	}

}
