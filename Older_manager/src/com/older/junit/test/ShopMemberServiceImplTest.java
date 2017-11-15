/**
 * 
 */
package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.ShopMember;
import com.older.manager.service.oldback.shop.ShopMemberService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ShopMemberServiceImplTest {
	
	@Autowired
	ShopMemberService shopMemberService;
	
	@Test
	public void addShopMemberTest(){
		for (int i = 0; i < 20; i++) {
			ShopMember shopMember=new ShopMember();
			shopMember.setUsersId(i+11);
			
			shopMember.setChangetime(new Date());
			shopMember.setJointime(new Date());
			if (i%2==0) {
				shopMember.setLevel("蓝钻会员");
				shopMember.setIntegralId(20);
			}else {
				shopMember.setLevel("铜牌会员");
				shopMember.setIntegralId(19);
			}
			
			
			shopMemberService.addShopMember(shopMember);
		}
	}
	
	@Test
	public void findShopMemberByIdTest(){
		System.out.println(shopMemberService.findShopMemberById(4));;
	}
	
	@Test
	public void deleteShopMemberByIdTest(){
		System.out.println(shopMemberService.deleteShopMemberById(1));
	}
	
	@Test
	public void findAllShopMembersGradeDistributionTest(){
		System.out.println(shopMemberService.findAllShopMembersGradeDistribution());
	}
	

}
