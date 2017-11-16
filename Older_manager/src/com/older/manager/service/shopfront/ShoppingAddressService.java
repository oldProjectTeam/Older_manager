package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Shippingaddress;

/**
 * 收货地址
 * @author 疯癫
 *
 */
public interface ShoppingAddressService {
    /**
     * 增加收货地址
     * @param shippingaddress
     */
	public void addShoppingAddress(Shippingaddress shippingaddress);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteShoppingAddress(Integer id);
	/**
	 * 更新
	 * @param shippingaddress
	 */
	public void updateShoppingAddress(Shippingaddress shippingaddress);
	/**
	 * 更新状态
	 * @param shippingaddress
	 */
	public void updateState(Shippingaddress shippingaddress);
	/**
	 * 查一条数据
	 * @param id
	 * @return
	 */
	public Shippingaddress selectShoppingAddress(Integer id); 
	/**
	 * 查所有的
	 * @return
	 */
	public List<Shippingaddress> selectAllShoppingAddress(Shippingaddress shippingaddress);
}
