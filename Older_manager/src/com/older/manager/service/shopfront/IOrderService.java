package com.older.manager.service.shopfront;

import com.older.manager.bean.Orders;

public interface IOrderService {

	/**
	 * 生成订单
	 * @param order
	 * @throws Exception
	 */
	public Integer insertOrder(Orders order)throws Exception;
	
	/**
	 * 根据id查询订单信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Orders findOrders(Integer id)throws Exception;
	
	/**
	 * 根据id有选择的更新订单信息
	 * @param order
	 * @throws Exception
	 */
	public void updateOrder(Orders order)throws Exception;
	
	/**
	 * 通过订单编号查询订单
	 * @param orderNo
	 * @return
	 * @throws Exception
	 */
	public Orders findOrderByNo(String orderNo)throws Exception;

	/**
	 * 通过订单id查询订单信息和订单详细信息和产品信息
	 * @param id
	 * @return
	 */
	public Orders findOrderWithDetailById(Integer id);
}
