package com.older.junit.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Relatives;
import com.older.manager.service.oldback.OldRelativesService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OldRelativesTest {

	@Autowired
	@Qualifier("oldRelativesServiceImpl")
	private  OldRelativesService oldRelativesService;
	
	
	/**
	 * 测试老人关系插入
	 * 测试成功
	 * @throws Exception
	 */
	@Test
	public void insertrelatives()throws Exception{
		Relatives relatives=new Relatives();
		relatives.setName("张三");
		relatives.setSex("男");
		relatives.setPhone("18788620239");
		relatives.setRelation("父子");
		relatives.setIslive("是");
		relatives.setAddress("贵阳");
		relatives.setOldmanId(58);
		oldRelativesService.addOlderRelative(relatives);
		
	}
	
	/**
	 * 测试删除    测试成功
	 * @throws Exception
	 */
	@Test
	public void  deleterelatives()throws Exception{		
		oldRelativesService.deleteOlderRelative(1);
	}
	/**
	 * 测试修改 测试成功
	 * @throws Exception
	 */
	@Test
	public void  updaterelatives()throws Exception{
		Relatives relatives=new Relatives();
		relatives.setAddress("贵州贵阳");
		relatives.setId(2);
		oldRelativesService.updateOlderRelative(relatives);
	}
	/**
	 * 测试查询 测试成功
	 * @throws Exception
	 */
	@Test
	public void  selectrelativesbyid()throws Exception{

		System.out.println(oldRelativesService.selectOlderRelative(2)+"******************");
	}
	/**
	 * 查询所有 测试成功
	 * @throws Exception
	 */
	@Test
	public void  selectall() throws Exception{
		List<Relatives> list=oldRelativesService.selectAllOlderRelative();
		
			System.out.println(list+"*************************************");
		
	}
	/**
	 * 测试通过老人的id来查看所有与老人有关系的人  测试成功
	 * @throws Exception
	 */ 
	@Test
	public void selectallbyoldid()throws Exception{
		
	 List<Relatives>list=oldRelativesService.selectOlderRelativesByOlderId(58);
		System.out.println(list+"*****************************");
	}
	
	@Test
	public void selectAllOlderRelativeIncludeOldManNameTest(){
		System.out.println(oldRelativesService.selectAllOlderRelativeIncludeOldManName());
	}
	
}
