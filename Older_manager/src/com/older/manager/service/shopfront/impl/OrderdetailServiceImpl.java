package com.older.manager.service.shopfront.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Orderdetail;
import com.older.manager.mapper.OrderdetailMapper;
import com.older.manager.service.shopfront.IOrderdetailService;

@Service
public class OrderdetailServiceImpl implements IOrderdetailService {

	@Autowired
	OrderdetailMapper orderdetailMapper;
	@Override
	public void insertOrderDetail(Orderdetail orderdetail) throws Exception {
		// TODO Auto-generated method stub
		orderdetailMapper.insertSelective(orderdetail);
	}

}
