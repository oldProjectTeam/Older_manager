package com.older.manager.service.impl.oldback;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ActiveUser;
import com.older.manager.bean.ChildMenu;
import com.older.manager.bean.Menu;
import com.older.manager.bean.Orders;
import com.older.manager.bean.OrdersExample;
import com.older.manager.bean.Permission;
import com.older.manager.bean.Role;
import com.older.manager.bean.ShopIndexInfo;
import com.older.manager.bean.SystemLog;
import com.older.manager.bean.SystemLogExample;
import com.older.manager.bean.SystemLogExample.Criteria;
import com.older.manager.bean.User;
import com.older.manager.bean.UserExample;
import com.older.manager.bean.Users;
import com.older.manager.exception.UserException;
import com.older.manager.mapper.MenuMapper;
import com.older.manager.mapper.OrdersMapper;
import com.older.manager.mapper.RoleMapper;
import com.older.manager.mapper.SystemLogMapper;
import com.older.manager.mapper.UserMapper;
import com.older.manager.mapper.UserPermissionMapper;
import com.older.manager.mapper.UsersMapper;
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

	@Autowired
	private SystemLogMapper systemLogMapper;

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public ActiveUser authenticat(String userCode, String password, Integer type)
			throws Exception {
		/**
		 * 认证过程： 根据用户身份（账号）查询数据库，如果查询不到用户不存在 对输入的密码 和数据库密码 进行比对，如果一致，认证通过
		 */
		// 根据用户账号查询数据库
		User user = this.findSysUserByUserCode(userCode, type);

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
			// System.out.println("父菜单----------------------------------------");
			System.out.println(menus.get(i).getName());
			// System.out.println("子菜单--------------------------------------");
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

		if (type == 0) {
			// 登录到商城
			// 记录商城首页的信息
			ShopIndexInfo shopIndexInfo = new ShopIndexInfo();
			shopIndexInfo.setLoginIP(this.getIp());
			shopIndexInfo.setLoginTime(new SimpleDateFormat()
					.format(new Date()));
			BigInteger shopUsers = this.getAllShopUser();
			// 查询出所有的商城用户数
			shopIndexInfo.setShopUsers(shopUsers);
			// 查询出分销记录

			// 查询出商城订单
			BigInteger shopOrders = this.getAllOrders();
			shopIndexInfo.setShopOrders(shopOrders);

			// 查询出所有的交易记录
			BigInteger tradeRecord = this.getAllTradeRecord();
			shopIndexInfo.setTradeRecord(tradeRecord);

			activeUser.setShopIndexInfo(shopIndexInfo);
		}

		// 登录成功之后,将日志记录到数据库
		// 先去查询数据库,看是否存在这条日志
		SystemLog systemLog = null;
		systemLog = this.queryLogByUserName(userCode);
		if (systemLog != null) {
			// 更新这一条数据
			String ip = this.getIp();
			systemLog.setIp(ip);
			systemLog.setLogintime(new SimpleDateFormat().format(new Date()));
			systemLog.setLogincount(systemLog.getLogincount() + 1);
			systemLog.setLogindescription("正常登录");
			systemLog.setLogintype("PC端登录");
			this.updateLog(systemLog);
		} else {
			// 新增这一条日志
			systemLog = new SystemLog();
			systemLog.setUsername(userCode);
			systemLog.setCompanyname("孝和集团");
			// 查询用户对应的角色
			String rolename = this.getRoleName(user.getId());
			systemLog.setRolename(rolename);
			String ip = this.getIp();
			systemLog.setIp(ip);
			systemLog.setLogintime(new SimpleDateFormat().format(new Date()));
			systemLog.setLogincount(1);
			systemLog.setLogindescription("正常登录");
			systemLog.setLogintype("PC端登录");
			this.insertLog(systemLog);
		}
		return activeUser;
	}

	private BigInteger getAllTradeRecord() {
		OrdersExample example = new OrdersExample();
		com.older.manager.bean.OrdersExample.Criteria criteria = example
				.createCriteria();
		criteria.andStateEqualTo("交易成功");
		List<Orders> list = ordersMapper.selectByExample(example);
		BigInteger sum = BigInteger.valueOf(0);
		if (list != null) {
			for (Orders orders : list) {
				sum = BigInteger.valueOf(Math.round(orders.getCost())).add(sum);
			}
			return sum;
		}
		return BigInteger.valueOf(0);
	}

	private BigInteger getAllOrders() {
		List<Orders> list = ordersMapper.selectByExample(null);
		if (list != null) {
			return BigInteger.valueOf(list.size());
		}
		return BigInteger.valueOf(0);
	}

	private BigInteger getAllShopUser() {
		List<Users> list = usersMapper.selectByExample(null);
		if (list != null) {
			return BigInteger.valueOf(list.size());
		}
		return BigInteger.valueOf(0);
	}

	/**
	 * 通过ID查询到角色名称
	 * 
	 * @param id
	 * @return
	 */
	private String getRoleName(Integer id) {
		Role role = roleMapper.getRoleName(id);
		return role.getName();
	}

	/**
	 * 新增一条日志
	 * 
	 * @param systemLog
	 */
	private void insertLog(SystemLog systemLog) {
		systemLogMapper.insertSelective(systemLog);
	}

	/**
	 * 获取当前的IP地址
	 * 
	 * @return
	 */
	private String getIp() {
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return addr.getHostAddress();
	}

	/**
	 * 更新日志
	 * 
	 * @param systemLog
	 */
	private void updateLog(SystemLog systemLog) {
		systemLogMapper.updateByPrimaryKeySelective(systemLog);
	}

	/**
	 * 通过用户名查询日志
	 * 
	 * @return
	 */
	private SystemLog queryLogByUserName(String userCode) {
		SystemLogExample example = new SystemLogExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userCode);
		List<SystemLog> list = systemLogMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	// 根据用户账号查询用户信息
	public User findSysUserByUserCode(String userCode, Integer type)
			throws Exception {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsercodeEqualTo(userCode);
		criteria.andTypeEqualTo(type);

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
