package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;

public interface IOrderdetailService {

	/**
	 * 有选择的添加订单详细信息
	 * 
	 * @param orderdetail
	 * @throws Exception
	 */
	public void insertOrderDetail(Orderdetail orderdetail) throws Exception;

	/**
	 * 根据用户查一条数据
	 * 
	 * @param id
	 * @return
	 */
	public Orderdetail selectOrderDetailByid(Integer id);

	/**
	 * 查询所有的
	 * 
	 * @param orderdetail
	 * @return
	 */
	public List<Orderdetail> selectAllOrderDetail(Orderdetail orderdetail);

	/**
	 * 通过订单的id来查所有的
	 * 
	 * @param id
	 * @return
	 */
	public List<Orderdetail> selectAllOrderDetailByOrderId(Integer id);

	/**
	 * 修改状态
	 * 
	 * @param orders
	 */
	public void updatestate(Orders orders);

	/**
	 * 
	 * @param orders
	 */
	public void updateStateTWO(Orders orders);

	/**
	 * 
	 * @param id
	 */
	public void deleteOrderDetail(Integer id);

	/**
	 * 标记被删除状态
	 * 
	 * @param orders
	 */
	public void updateOrder(Orders orders);

	/***
	 * 标记被评论过的
	 * 
	 * @param orderdetail
	 */
	public void updateOrderDetailStati(Orderdetail orderdetail);

	/**
	 * 查询个人中心里面的订单信息
	 * 
	 * @param usersid
	 * @return
	 */
	public List<Integer> queryOrderInfoByUserId(Integer usersid);
}
