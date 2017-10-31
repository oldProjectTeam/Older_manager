package com.older.manager.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldback.IOldmanaccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class OldmanaccountServiceImplTest {
	@Autowired
	@Qualifier("oldmanaccountServiceImpl")
	IOldmanaccountService oldmanaccountService;
	
	@Test
	public void testSelectOldManNotAccount() {
		Oldman oldman1=new Oldman();
		oldman1.setName("老人");
		 List<Oldman>list=oldmanaccountService.selectOldManNotAccount(oldman1);
		 for(Oldman oldman:list)
			 System.out.println("ID:"+oldman.getId()+" name:"+oldman.getName()+" phone:"+oldman.getPhone());
	}

	@Test
	public void TestBatchInsertAccount()throws Exception{
		List<Oldman>oldmans=new ArrayList<Oldman>();
		Oldman oldman=new Oldman();
		oldman.setId(16);
		oldman.setPhone("18208516063");
		oldmans.add(oldman);
		 
		Oldman oldman1=new Oldman();
		oldman1.setId(17);
		oldman1.setPhone("18208516263");
		oldmans.add(oldman1);
		
		//开始批量插入
		oldmanaccountService.batchInsertAccount(oldmans);
	}
	@Test
	public void TestSelectAccountAndOldmanByCondiction(){
		Oldmanaccount oldmanaccount=new Oldmanaccount();
		/*Oldman oldman=new Oldman();
		oldman.setName("老人");
		oldmanaccount.setOldman(oldman);*/
		oldmanaccount.setAccount("18788620293");
		List<Oldmanaccount>list=oldmanaccountService.selectAccountAndOldmanByCondiction(oldmanaccount);
		for(Oldmanaccount ac:list){
			System.out.println("ID:"+ac.getId()+" account:"+ac.getAccount()
					+" password:"+ac.getPassword()+" 姓名："+ac.getOldman().getName());
		}
	}
}
