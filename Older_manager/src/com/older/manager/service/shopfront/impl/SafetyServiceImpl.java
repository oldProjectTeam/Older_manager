package com.older.manager.service.shopfront.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Users;
import com.older.manager.mapper.UsersMapper;
import com.older.manager.service.shopfront.SafetyService;

@Service
public class SafetyServiceImpl implements SafetyService{
	@Autowired
   private UsersMapper usersMapper;

	@Override
	public Users selectUserByid(Integer id) {
		// TODO 自动生成的方法存根
		return usersMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(Users users) {
		// TODO 自动生成的方法存根
		usersMapper.updateByPrimaryKeySelective(users);
	}

}
