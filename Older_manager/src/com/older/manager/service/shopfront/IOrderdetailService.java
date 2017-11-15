package com.older.manager.service.shopfront;

import com.older.manager.bean.Orderdetail;

public interface IOrderdetailService {

	/**
	 * 有选择的添加订单详细信息
	 * @param orderdetail
	 * @throws Exception
	 */
	public void insertOrderDetail(Orderdetail orderdetail)throws Exception;
}
