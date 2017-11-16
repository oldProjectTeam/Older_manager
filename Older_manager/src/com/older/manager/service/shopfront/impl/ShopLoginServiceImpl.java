/**
 * 
 */
package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Users;
import com.older.manager.bean.UsersExample;
import com.older.manager.exception.ShopException;
import com.older.manager.exception.UserException;
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
		if (users.size() == 0) {
			throw new ShopException("用户账号不存在");
		} else {
			String password_dbString = users.get(0).getPassword();
			String password_input_md5 = new MD5().getMD5ofStr(password);
			if (!password_input_md5.equals(password_dbString)) {
				throw new ShopException("用户名或密码错误");
			} else {
				return users.get(0);
			}
		}
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
		Users users = usersMapper.selectByExample(example).get(0);
		if (users == null) {
			throw new UserException("用户账号不存在");
		}
		return users;
	}

}
