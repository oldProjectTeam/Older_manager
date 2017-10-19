package com.older.junit.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {

	@Autowired
	@Qualifier("userServiceImpl")
	private IUserService userService;

	/**
	 * 老人登录测试
	 */
	@Test
	public void testLoginForOldman() {
		Oldmanaccount oldmanaccount = new Oldmanaccount();
		oldmanaccount.setAccount("15508516280");
		oldmanaccount.setPassword("123456");
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("oldManInfo------->"
				+ userService.loginForOldman(oldmanaccount).toString());
	}

}
