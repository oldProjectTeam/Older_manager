package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Shippingaddress;

public interface IShippingaddressService {

	/**
	 * 根据用户id查询该用户所有地址
	 * @return
	 * @throws Exception
	 */
	public List<Shippingaddress>findAllAddress(Integer userId)throws Exception;
}
