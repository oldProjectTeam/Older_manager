package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShippingaddressExample;
import com.older.manager.mapper.ShippingaddressMapper;
import com.older.manager.service.shopfront.IShippingaddressService;

@Service
public class ShippingaddressServiceImpl implements IShippingaddressService {

	@Autowired
	private ShippingaddressMapper shippingaddressMapper;
	@Override
	public List<Shippingaddress> findAllAddress(Integer userId) throws Exception {
		// TODO Auto-generated method stub
		ShippingaddressExample example=new ShippingaddressExample();
		ShippingaddressExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return shippingaddressMapper.selectByExample(example);
	}

}
