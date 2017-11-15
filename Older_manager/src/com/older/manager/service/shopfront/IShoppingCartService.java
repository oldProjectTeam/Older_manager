package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.ShoppingCart;

public interface IShoppingCartService {

	/**
	 * 添加产品至购物车
	 * @param shoppingCart
	 * @throws Exception
	 */
	public void insertShoppingCart(ShoppingCart shoppingCart)throws Exception;
	
	/**
	 * 根据id删除购物车记录
	 * @param id
	 * @throws Exception
	 */
	public void deleteShoppingCart(Integer id)throws Exception;
	
	/**
	 * 更新购物车记录
	 * @param shoppingCart
	 * @throws Exception
	 */
	public void updateShoppingCart(ShoppingCart shoppingCart)throws Exception;
	
	/**
	 * 根据用户id查询该用户所有购物车信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<ShoppingCart>findAllCarts(Integer userId)throws Exception;
	
	/**
	 * 批量删除购物车记录
	 * @param ids
	 * @throws Exception
	 */
	public void  batchDelCart(List<Integer>ids)throws Exception;
	
	/**
	 * 根据用户id和产品id查询购物车信息
	 * @param shoppingCart
	 * @return
	 * @throws Exception
	 */
	public List<ShoppingCart> findShoppingCart(ShoppingCart shoppingCart)throws Exception;
	
	/**
	 * 根据购物车信息ID查询信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ShoppingCart findShopingCartById(Integer id)throws Exception;
	
	/**
	 * 根据id联合查询产品信息
	 * @return
	 * @throws Exception
	 */
	public ShoppingCart selectWithProductById(Integer id)throws Exception;
}
