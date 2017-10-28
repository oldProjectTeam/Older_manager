package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.User;
import com.older.manager.bean.UserExample;
import com.older.manager.bean.UserExample.Criteria;
import com.older.manager.mapper.UserMapper;
import com.older.manager.service.oldback.ISystemUserService;

@Service
public class SystemUserServiceImpl implements ISystemUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User loginForSystemUser(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		List<User> list = userMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

}
