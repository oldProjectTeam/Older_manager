package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Orderdetail;

public interface IOrderdetailService {

	/**
	 * 有选择的添加订单详细信息
	 * @param orderdetail
	 * @throws Exception
	 */
	public void insertOrderDetail(Orderdetail orderdetail)throws Exception;
	
	/**
	 * 根据用户查一条数据
	 * @param id
	 * @return
	 */
	public Orderdetail selectOrderDetailByid(Integer id);
	/**
	 * 
	 * @param orderdetail
	 * @return
	 */
	public List<Orderdetail> selectAllOrderDetail(Orderdetail orderdetail);

}
