package com.older.manager.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 用户身份信息，存入session 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * 
 */
public class ActiveUser implements java.io.Serializable {
	private int userid;// 用户id（主键）
	private String usercode;// 用户账号
	private String username;// 用户名称

	private ShopIndexInfo shopIndexInfo;// 记录商城首页的信息

	public ShopIndexInfo getShopIndexInfo() {
		return shopIndexInfo;
	}

	public void setShopIndexInfo(ShopIndexInfo shopIndexInfo) {
		this.shopIndexInfo = shopIndexInfo;
	}

	private List<Permission> menus;// 菜单
	private List<Permission> permissions;// 权限
	private List<ChildMenu> listMenus;// 子菜单

	public List<ChildMenu> getListMenus() {
		return listMenus;
	}

	public void setListMenus(List<ChildMenu> listMenus) {
		this.listMenus = listMenus;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public List<Permission> getMenus() {
		return menus;
	}

	public void setMenus(List<Permission> menus) {
		this.menus = menus;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
