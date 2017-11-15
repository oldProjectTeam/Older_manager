/**
 * 
 */
package com.older.manager.test.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Users;
import com.older.manager.service.oldback.shop.UsersService;

/**
 * @author ym
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UsersServiceImplTest {

	@Autowired
	UsersService usersService;

	@Test
	public void addUsersTest() {
		for (int i = 0; i < 205; i++) {
			Users users=new Users();
			if (i%2==0) {
				users.setAccount("老人");
				users.setPassword("123456");
				users.setRealname("刘诗诗");
				users.setNickname("愿得一人心");
				users.setPhone("13007831317");
				users.setSex("女");
				users.setEmail("1414978103@qq.com");
			}else {
				users.setAccount("未知");
				users.setPassword("123456");
				users.setRealname("东方不败");
				users.setNickname("谁懂我的心");
				users.setPhone("17007831318");
				users.setSex("女");
				users.setEmail("1414978520@qq.com");
			}
			usersService.addUsers(users);
		}
		
		
		
		
	}
}
