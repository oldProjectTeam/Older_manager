package com.older.manager.shopfront.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Change;
import com.older.manager.service.shopfront.ChangeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ChangeTest {
     @Autowired
     @Qualifier("changeServiceImpl")
	 private ChangeService changeService;
     
     
     /**
      * 测试增加
      * @throws Exception
      */
     @Test
     public void testadd()throws Exception{
    	 for (int i = 0; i < 10; i++) {
    		 Change change=new Change();
        	 change.setUsid(220);
        	 change.setChno("20171120113"+i);
        	 change.setChtime(new Date());
        	 change.setChphoto("upload/img/2017/11/c15706ff.jpg");
        	 change.setChbrieft("华为手机荣耀8青春版"+i);
        	 change.setChname("华为手机"+i);
        	 change.setChmoeny(8000.0);
        	 change.setChaftermoney(8000.0);
        	 change.setChstate(0);
        	 change.setProductid(3);
			changeService.addChange(change);
		}
    	 
    	 
     }
	
}
