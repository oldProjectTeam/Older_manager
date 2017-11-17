/**
 * 
 */
package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Users;
import com.older.manager.bean.UsersExample;
import com.older.manager.mapper.UsersMapper;
import com.older.manager.service.shopfront.ShopLoginService;
import com.older.manager.utils.MD5;

/**
 * @author ym
 * @date 2017年11月16日 下午1:59:21
 */
@Service
public class ShopLoginServiceImpl implements ShopLoginService {

	@Autowired
	private UsersMapper usersMapper;

	/**
	 * @Title: authenticat
	 * @Description: 用户登录
	 * @param: @param useracconut 账户
	 * @param: @param password 密码
	 * @param: @return
	 * @param: @throws Exception
	 * @throws
	 */
	@Override
	public Users authenticat(String useracconut, String password)
			throws Exception {
		UsersExample example = new UsersExample();
		example.createCriteria().andAccountLike(useracconut);
		List<Users> users = usersMapper.selectByExample(example);
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

	/**
	 * @Title: findSysUserByUserCode
	 * @Description:
	 * @param: @param useracconut 账户
	 * @param: @return
	 * @param: @throws Exception
	 * @throws
	 */
	@Override
	public Users findSysUserByUserCode(String useracconut) throws Exception {
		UsersExample example = new UsersExample();
		example.createCriteria().andAccountLike(useracconut);
		List<Users> users = usersMapper.selectByExample(example);
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
