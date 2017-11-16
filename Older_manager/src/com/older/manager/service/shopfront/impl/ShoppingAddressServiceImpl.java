package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShippingaddressExample;
import com.older.manager.bean.ShippingaddressExample.Criteria;
import com.older.manager.mapper.ShippingaddressMapper;
import com.older.manager.service.shopfront.ShoppingAddressService;
@Service
/**
 * 收货地址
 * @author 疯癫
 *
 */
public class ShoppingAddressServiceImpl implements ShoppingAddressService{
	@Autowired
	private ShippingaddressMapper shippingaddressMapper;

	@Override
	public void addShoppingAddress(Shippingaddress shippingaddress) {
		// TODO 自动生成的方法存根
		shippingaddressMapper.insertSelective(shippingaddress);
	}

	@Override
	public void deleteShoppingAddress(Integer id) {
		shippingaddressMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateShoppingAddress(Shippingaddress shippingaddress) {
		// TODO 自动生成的方法存根
		shippingaddressMapper.updateByPrimaryKeySelective(shippingaddress);
	}

	@Override
	public Shippingaddress selectShoppingAddress(Integer id) {
		// TODO 自动生成的方法存根
		return shippingaddressMapper.selectByPrimaryKeyWithUsers(id);
	}

	@Override
	public List<Shippingaddress> selectAllShoppingAddress(Shippingaddress shippingaddress) {
		// TODO 自动生成的方法存根
		return shippingaddressMapper.selectByExampleWithUsers(shippingaddress);
	}
    
	@Override
	public void updateState(Shippingaddress shippingaddress) {
		ShippingaddressExample example=new ShippingaddressExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(shippingaddress.getUserId());
		shippingaddressMapper.updateByExampleSelective(shippingaddress, example);
		
	}

}
