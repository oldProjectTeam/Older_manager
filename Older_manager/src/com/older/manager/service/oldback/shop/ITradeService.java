package com.older.manager.service.oldback.shop;

import java.util.List;

import com.older.manager.bean.Orders;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;

public interface ITradeService {

	/**
	 * 查询出所有的产品类型
	 * @return
	 */
	List<ProductType> queryAllTypeOfProductType();

	/**
	 * 查询出所有的商品出来
	 * @return
	 */
	List<Products> queryAllProducts();

	/**
	 * 查询出所有的订单
	 * @return
	 */
	List<Orders> queryAllOrders();

	/**
	 * 通过产品类型id查询出所对应的产品id
	 * @param id
	 * @return
	 */
	List<Integer> queryAllProductIdsOfProductTypeId(Integer id);

	/**
	 * 根据产品id查询出订单id
	 * @param productIds
	 * @return
	 */
	List<Integer> queryOrdersIdOfProductIds(List<Integer> productIds);

	/**
	 * 查询出所有的订单
	 * @return
	 */
	List<Orders> queryAllOrderWithJson();

}
