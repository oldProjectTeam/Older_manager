package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Activity;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Takeactivity;
import com.older.manager.service.oldback.CustomerActivityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerActivityServiceImplTest {
    @Autowired
    @Qualifier("customerActivityServiceImpl")
	private CustomerActivityService customerActivityService;
    
    /**
     * 测试增加   测试成功
     * @throws Exception
     */
    @Test
    public void testAddTakeactivity()throws Exception{
    	
    	
    	
    	
    	for (int i = 0; i < 50; i++) {
    		Takeactivity takeactivity=new Takeactivity();
        	takeactivity.setTaketime(new Date());
        	takeactivity.setIspresent("是");
        	takeactivity.setRemak("无"+i);
        	takeactivity.setOldmanId(1);
        	takeactivity.setActivityId(7);
        	customerActivityService.addTakeactivity(takeactivity);
			
		}
    	
    }
    /**
     * 测试删除 测试成功
     * @throws Exception
     */
    @Test
    public void testdeleteTakeactivity()throws Exception{
    	customerActivityService.deleteTakeactivity(1);
    }
    /**
     * 测试修改 测试成功
     * @throws Exception
     */
    @Test
    public void testupdateTakeactivity()throws Exception{
    	Takeactivity takeactivity=new Takeactivity();
    	takeactivity.setRemak("有");
    	takeactivity.setId(2);
    	customerActivityService.updateTakeactivity(takeactivity);
    }
    /**
     * 测试通过id查找  测试成功
     * @throws Exception
     */
    @Test
    public void testselectTakeactivityById()throws Exception{
    	
    	System.out.println(customerActivityService.selectTakeactivityById(2));
    }
    /**
     * 测试通过查询全部  成功
     * @throws Exception
     */
    @Test
    public void testselectAllTakeactivitys()throws Exception{
    	
    	System.out.println(customerActivityService.selectAllTakeactivitys());
    }
    /**
     * 模糊查询 测试成功
     * @throws Exception
     */
    @Test
    public void testselectAllTakeactivityswith()throws Exception{
    	Takeactivity takeactivity=new Takeactivity();
		//takeactivity.setIspresent("是");
		/*Activity activity=new Activity();
		
		
		activity.setType("休闲");
    	*/
    	Oldman oldman=new Oldman();
    	oldman.setName("lzy");
		
		takeactivity.setOldman(oldman);
    	
    	System.out.println(customerActivityService.selectAllTakeactivitysWith(takeactivity)+"***************************");
    }
}
