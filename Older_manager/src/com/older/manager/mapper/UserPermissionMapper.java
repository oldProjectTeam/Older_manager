package com.older.manager.mapper;

import java.util.List;

import com.older.manager.bean.Menu;
import com.older.manager.bean.Permission;

/**
 * 权限mapper
 * 
 * @author Administrator
 * 
 */
public interface UserPermissionMapper {
	// 根据用户id查询菜单
	public List<Permission> findMenuListByUserId(int userid) throws Exception;

	// 根据用户id查询权限url
	public List<Permission> findPermissionListByUserId(int userid)
			throws Exception;

	// 通过菜单查询子菜单
	public List<Menu> findMenuByPermissionId(int id);
}
