package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Orderdetail;
import com.older.manager.mapper.OrderdetailMapper;
import com.older.manager.service.shopfront.IOrderdetailService;

@Service
public class OrderdetailServiceImpl implements IOrderdetailService {

	@Autowired
	 private OrderdetailMapper orderdetailMapper;
	@Override
	public void insertOrderDetail(Orderdetail orderdetail) throws Exception {
		// TODO Auto-generated method stub
		orderdetailMapper.insertSelective(orderdetail);
	}
	@Override
	public Orderdetail selectOrderDetailByid(Integer id) {
		// TODO 自动生成的方法存根
		return orderdetailMapper.selectByPrimaryKeyWithOther(id);
	}
	@Override
	public List<Orderdetail> selectAllOrderDetail(Orderdetail orderdetail) {
		// TODO 自动生成的方法存根
		return orderdetailMapper.selectByExampleWithOthre(orderdetail);
	}


}
