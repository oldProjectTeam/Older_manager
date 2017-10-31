package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.ActiveUser;
import com.older.manager.bean.Menu;
import com.older.manager.bean.Permission;
import com.older.manager.bean.User;

/**
 * 
 * 认证授权服务接口
 */
public interface SysService {

	// 根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public ActiveUser authenticat(String userCode, String password)
			throws Exception;

	// 根据用户账号查询用户信息
	public User findSysUserByUserCode(String userCode) throws Exception;

	// 根据用户id查询权限范围的菜单
	public List<Permission> findMenuListByUserId(int userid) throws Exception;

	// 根据用户id查询权限范围的url
	public List<Permission> findPermissionListByUserId(int userid)
			throws Exception;

	// 通过菜单查询子菜单
	public List<Menu> findMenuByPermissionId(int id);

	public ActiveUser getUserInfo(Integer id) throws Exception;
}
