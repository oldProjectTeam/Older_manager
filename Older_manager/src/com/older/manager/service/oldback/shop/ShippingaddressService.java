/**
 * 
 */
package com.older.manager.service.oldback.shop;

import java.util.List;

import com.older.manager.bean.Shippingaddress;

/**
 * @author ym
 *
 */
public interface ShippingaddressService {

	/**
	 * @Title:   addShippingAddress
	 * @Description:  添加快递地址
	 * @param:    @param shippingaddress
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int addShippingAddress(Shippingaddress shippingaddress );
	
	/**
	 * @Title:   deleteShippingAddressById
	 * @Description: 根据id删除购物地址
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int deleteShippingAddressById(Integer id);
	
	/**
	 * @Title:   modifyShippingAddress
	 * @Description:  修改地址
	 * @param:    @param s
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int modifyShippingAddress(Shippingaddress shippingaddress);
	
	/**
	 * @Title:   findShippingaddressById
	 * @Description:  根据id查找购物地址
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Shippingaddress   
	 * @throws
	 */
	public Shippingaddress findShippingaddressById(Integer id);
	
	/**
	 * @Title:   findShippingaddressByUserId
	 * @Description:  根据用户id查询当前使用的购物地址
	 * @param:    @param userid
	 * @param:    @return   
	 * @return:   Shippingaddress   
	 * @throws
	 */
	public Shippingaddress findShippingaddressByUserId(Integer userid);
	
	/**
	 * @Title:   findAllShippingaddresses
	 * @Description:  查询所有的购物地址
	 * @param:    @return   
	 * @return:   List<Shippingaddress>   
	 * @throws
	 */
	public List<Shippingaddress> findAllShippingaddresses();
	
	/**
	 * @Title:   findAllShippingaddressesByUserId
	 * @Description:  根据用户id查询所有的购物地址
	 * @param:    @param userid
	 * @param:    @return   
	 * @return:   List<Shippingaddress>   
	 * @throws
	 */
	public List<Shippingaddress> findAllShippingaddressesByUserId(Integer userid);
}
