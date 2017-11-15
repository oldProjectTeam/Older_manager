/**
 * 
 */
package com.older.manager.service.impl.oldback.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShippingaddressExample;
import com.older.manager.mapper.ShippingaddressMapper;
import com.older.manager.service.oldback.shop.ShippingaddressService;

/**
 * @author ym
 * 
 */
@Service
public class ShippingaddressServiceImpl2 implements ShippingaddressService {

	@Autowired
	ShippingaddressMapper shippingaddressMapper;

	/**
	 * @Title: addShippingAddress
	 * @Description: 添加快递地址
	 * @param: @param shippingaddress
	 * @param: @return
	 * @throws
	 */
	@Override
	public int addShippingAddress(Shippingaddress shippingaddress) {
		return shippingaddressMapper.insertSelective(shippingaddress);
	}

	/**
	 * @Title: deleteShippingAddressById
	 * @Description: 根据id删除购物地址
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public int deleteShippingAddressById(Integer id) {
		return shippingaddressMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title: modifyShippingAddress
	 * @Description: 修改购物地址
	 * @param: @param shippingaddress
	 * @param: @return
	 * @throws
	 */
	@Override
	public int modifyShippingAddress(Shippingaddress shippingaddress) {
		return shippingaddressMapper
				.updateByPrimaryKeySelective(shippingaddress);
	}

	/**
	 * @Title: findShippingaddressById
	 * @Description: 根据id查找购物地址
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Shippingaddress findShippingaddressById(Integer id) {
		return shippingaddressMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title: findShippingaddressByUserId
	 * @Description: 根据用户id查找地址
	 * @param: @param userid
	 * @param: @return
	 * @throws
	 */
	@Override
	public Shippingaddress findShippingaddressByUserId(Integer userid) {
		return shippingaddressMapper.selectByUserId(userid);
	}

	/**
	 * @Title: findAllShippingaddresses
	 * @Description: 查找所有的购物地址
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Shippingaddress> findAllShippingaddresses() {
		return shippingaddressMapper.selectByExample(null);
	}

	/**
	 * @Title: findAllShippingaddressesByUserId
	 * @Description: 根据用户id查询所有的购物地址
	 * @param: @param userid
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Shippingaddress> findAllShippingaddressesByUserId(Integer userid) {
		ShippingaddressExample example = new ShippingaddressExample();
		example.createCriteria().andUserIdEqualTo(userid);
		return shippingaddressMapper.selectByExample(example);
	}

}
