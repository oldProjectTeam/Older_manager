package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShopMember;
import com.older.manager.bean.Users;

/**
 * 个人信息
 * @author 疯癫
 *
 */
public interface InformationService {

	/**
	 * 通过用户id来查数据
	 * @param usersid
	 * @return
	 */
	public  ShopMember selectShopMemberById(Integer usersid);
	
	/**
	 * 修改个人信息
	 * @param shopMember
	 */
	public void updateInformationByUid(Users users);
	
	/**
	 * 通过用户id来查默认地址
	 * @param userid
	 */
	public Shippingaddress selectAddressByUseridWithState(Integer userid);

	
}
