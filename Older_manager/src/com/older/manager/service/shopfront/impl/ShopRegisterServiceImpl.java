package com.older.manager.service.shopfront.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Users;
import com.older.manager.bean.UsersExample;
import com.older.manager.bean.UsersExample.Criteria;
import com.older.manager.mapper.UsersMapper;
import com.older.manager.service.shopfront.IShopRegisterService;
import com.older.manager.utils.CodeUtils;
import com.older.manager.utils.MD5;
import com.older.manager.utils.MessageUtils;

@Service
public class ShopRegisterServiceImpl implements IShopRegisterService {

	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Map<String, Object> registerOfEmail(Users users) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 查询邮箱是否被注册
		List<Users> users2 = this.queryUsersByEmail(users.getEmail());
		if (users2.size() == 0) {
			// 对用户输入的密码进行加密,然后放到数据库中
			String pwd = new MD5().getMD5ofStr(users.getPassword());
			users.setPassword(pwd);
			usersMapper.insertSelective(users);
			map.put("flag", true);
		} else {
			map.put("error", "此邮箱已经被注册了");
			map.put("flag", false);
		}
		return map;
	}

	/**
	 * 通过邮箱查询用户
	 * 
	 * @param getemail
	 * @return
	 */
	private List<Users> queryUsersByEmail(String email) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		return usersMapper.selectByExample(example);
	}

	@Override
	public Map<String, Object> registerOfPhone(Users users) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Users> users2 = this.queryUsersByPhone(users.getPhone());
		// 查询手机号是否被注册
		if (users2.size() == 0) {
			// 对用户输入的密码进行加密,然后放到数据库中
			String pwd = new MD5().getMD5ofStr(users.getPassword());
			users.setPassword(pwd);
			usersMapper.insertSelective(users);
			map.put("flag", true);
		} else {
			map.put("error", "此手机号已经被注册了");
			map.put("flag", false);
		}
		return map;
	}

	/**
	 * 通过手机号查询用户
	 * 
	 * @param phone
	 * @return
	 */
	private List<Users> queryUsersByPhone(String phone) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone);
		return usersMapper.selectByExample(example);
	}

	/**
	 * 获取验证码
	 */
	@Override
	public Map<String, Object> getCode(String phone) {
		String msg = "验证码:" + CodeUtils.getCode();
		return MessageUtils.sendMessage(phone, msg);
	}

}
