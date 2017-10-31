package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ActiveUser;
import com.older.manager.bean.ChildMenu;
import com.older.manager.bean.Menu;
import com.older.manager.bean.Permission;
import com.older.manager.bean.User;
import com.older.manager.bean.UserExample;
import com.older.manager.exception.UserException;
import com.older.manager.mapper.MenuMapper;
import com.older.manager.mapper.UserMapper;
import com.older.manager.mapper.UserPermissionMapper;
import com.older.manager.service.oldback.SysService;
import com.older.manager.utils.MD5;

/**
 * 认证和授权的服务接口
 */
@Service
public class SysServiceImpl implements SysService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserPermissionMapper userPermissionMapper;

	@Override
	public ActiveUser authenticat(String userCode, String password)
			throws Exception {
		/**
		 * 认证过程： 根据用户身份（账号）查询数据库，如果查询不到用户不存在 对输入的密码 和数据库密码 进行比对，如果一致，认证通过
		 */
		// 根据用户账号查询数据库
		User user = this.findSysUserByUserCode(userCode);

		if (user == null) {
			// 抛出异常
			throw new UserException("用户账号不存在");
		}

		// 数据库密码 (md5密码 )
		String password_db = user.getPassword();

		// 对输入的密码 和数据库密码 进行比对，如果一致，认证通过
		// 对页面输入的密码 进行md5加密
		String password_input_md5 = new MD5().getMD5ofStr(password);
		if (!password_input_md5.equalsIgnoreCase(password_db)) {
			// 抛出异常
			throw new UserException("用户名或密码错误");
		}

		// 根据用户id查询菜单
		List<Permission> menus = this.findMenuListByUserId(user.getId());

		// 根据用户id查询权限url
		List<Permission> permissions = this.findPermissionListByUserId(user
				.getId());

		List<ChildMenu> childMenus = new ArrayList<ChildMenu>();
		for (int i = 0; i < menus.size(); i++) {
			int id = menus.get(i).getId();
			List<Menu> list = this.findMenuByPermissionId(id);
			ChildMenu childMenu = new ChildMenu();
			childMenu.setMenuName(menus.get(i).getName());
			childMenu.setMenuUrl(menus.get(i).getUrl());
			childMenu.setMenuImg(menus.get(i).getImg());
			childMenu.setMenus(list);
			childMenus.add(childMenu);
		}
		// 放入权限范围的菜单和url

		for (int i = 0; i < menus.size(); i++) {
			System.out.println("父菜单----------------------------------------");
			System.out.println(menus.get(i).getName());
			System.out.println("子菜单--------------------------------------");
			for (int j = 0; j < childMenus.get(i).getMenus().size(); j++) {
				System.out.println(childMenus.get(i).getMenus().get(j)
						.getName());
			}
		}

		// 认证通过，返回用户身份信息
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(user.getId());
		activeUser.setUsercode(userCode);
		activeUser.setUsername(user.getUsername());// 用户名称
		activeUser.setMenus(menus);
		activeUser.setPermissions(permissions);
		activeUser.setListMenus(childMenus);

		return activeUser;
	}

	// 根据用户账号查询用户信息
	public User findSysUserByUserCode(String userCode) throws Exception {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsercodeEqualTo(userCode);

		List<User> list = userMapper.selectByExample(userExample);

		if (list != null && list.size() == 1) {
			return list.get(0);
		}

		return null;
	}

	@Override
	public List<Permission> findMenuListByUserId(int userid) throws Exception {

		return userPermissionMapper.findMenuListByUserId(userid);
	}

	@Override
	public List<Permission> findPermissionListByUserId(int userid)
			throws Exception {

		return userPermissionMapper.findPermissionListByUserId(userid);
	}

	@Override
	public List<Menu> findMenuByPermissionId(int id) {
		return userPermissionMapper.findMenuByPermissionId(id);
	}

	/**
	 * 返回用户信息,json形式
	 */
	@Override
	public ActiveUser getUserInfo(Integer userid) throws Exception {
		// 根据用户id查询菜单
		List<Permission> menus = this.findMenuListByUserId(userid);

		// 根据用户id查询权限url
		List<Permission> permissions = this.findPermissionListByUserId(userid);

		List<ChildMenu> childMenus = new ArrayList<ChildMenu>();
		for (int i = 0; i < menus.size(); i++) {
			int id = menus.get(i).getId();
			List<Menu> list = this.findMenuByPermissionId(id);
			ChildMenu childMenu = new ChildMenu();
			childMenu.setMenuName(menus.get(i).getName());
			childMenu.setMenus(list);
			childMenus.add(childMenu);
		}
		// 放入权限范围的菜单和url
		ActiveUser activeUser = new ActiveUser();
		activeUser.setMenus(menus);
		activeUser.setPermissions(permissions);
		activeUser.setListMenus(childMenus);

		for (int i = 0; i < menus.size(); i++) {
			System.out.println("父菜单----------------------------------------");
			System.out.println(menus.get(i).getName());
			System.out.println("子菜单--------------------------------------");
			for (int j = 0; j < childMenus.get(i).getMenus().size(); j++) {
				System.out.println(childMenus.get(i).getMenus().get(j)
						.getName());
			}
		}
		return activeUser;
	}

}
