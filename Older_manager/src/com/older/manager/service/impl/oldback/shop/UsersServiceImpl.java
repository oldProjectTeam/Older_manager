/**
 * 
 */
package com.older.manager.service.impl.oldback.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Users;
import com.older.manager.mapper.UsersMapper;
import com.older.manager.service.oldback.shop.UsersService;

/**
 * @author ym
 * 
 */
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersMapper usersMapper;

	/**
	 * @Title: addUsers
	 * @Description: 添加商城用户
	 * @param: @param users
	 * @param: @return
	 * @throws
	 */
	@Override
	public int addUsers(Users users) {
		return usersMapper.insertSelective(users);
	}

	/**
	 * @Title: deleteUsersById
	 * @Description: 根据id删除用户
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public int deleteUsersById(Integer id) {
		return usersMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title: modifyUsers
	 * @Description: 修改商城用户
	 * @param: @param users
	 * @param: @return
	 * @throws
	 */
	@Override
	public int modifyUsers(Users users) {
		return usersMapper.updateByPrimaryKeySelective(users);
	}

	/**
	 * @Title: findUsersById
	 * @Description: 根据id查找商城用户
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Users findUsersById(Integer id) {
		return usersMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title: findAllUsers
	 * @Description: 查找所有的用户
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Users> findAllUsers() {
		return usersMapper.selectByExample(null);
	}

}
