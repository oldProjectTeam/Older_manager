/**
 * 
 */
package com.older.manager.service.oldback.shop;

import java.util.List;

import com.older.manager.bean.Users;

/**
 * @author ym
 * 
 */
public interface UsersService {

	/**
	 * @Title: addUsers
	 * @Description: 添加商城用户
	 * @param: @param users
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int addUsers(Users users);

	/**
	 * @Title: deleteUsersById
	 * @Description: 删除商城用户
	 * @param: @param id
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int deleteUsersById(Integer id);

	/**
	 * @Title: modifyUsers
	 * @Description: 修改商城用户
	 * @param: @param users
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int modifyUsers(Users users);

	/**
	 * @Title: findUsersById
	 * @Description: 查找商城用户
	 * @param: @param id
	 * @param: @return
	 * @return: Users
	 * @throws
	 */
	public Users findUsersById(Integer id);

	/**
	 * @Title: findAllUsers
	 * @Description: 查找所有的商城用户
	 * @param: @return
	 * @return: List<Users>
	 * @throws
	 */
	public List<Users> findAllUsers();

}
