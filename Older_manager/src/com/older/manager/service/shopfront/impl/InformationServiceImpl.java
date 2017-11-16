package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ShopMember;
import com.older.manager.bean.ShopMemberExample;
import com.older.manager.bean.ShopMemberExample.Criteria;
import com.older.manager.bean.Users;
import com.older.manager.mapper.ShopMemberMapper;
import com.older.manager.mapper.UsersMapper;
import com.older.manager.service.shopfront.InformationService;

@Service
/**
 * 个人信息
 * @author 疯癫
 *
 */
public class InformationServiceImpl implements InformationService {
	@Autowired
	private ShopMemberMapper shopMemberMapper;
	@Autowired
	private UsersMapper usersMapper;
	

	@Override
	public ShopMember selectShopMemberById(Integer usersid) {
		return  shopMemberMapper.selectByPrimaryKeyWithUid(usersid);
	}



	@Override
	public void updateInformationByUid(Users users) {
		usersMapper.updateByPrimaryKeySelective(users);
		
	}





}
