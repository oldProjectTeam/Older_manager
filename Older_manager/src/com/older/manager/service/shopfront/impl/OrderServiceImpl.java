package com.older.manager.service.shopfront.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Orders;
import com.older.manager.bean.OrdersExample;
import com.older.manager.mapper.OrdersMapper;
import com.older.manager.service.shopfront.IOrderService;


@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	OrdersMapper ordersMapper;
	 
	 

	@Override
	public Orders findOrders(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return ordersMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateOrder(Orders order) throws Exception {

		ordersMapper.updateByPrimaryKeySelective(order);
	}

	@Override
	public Integer insertOrder(Orders order) throws Exception {
		// TODO Auto-generated method stub
		//自动生成时间
		order.setCreattime(new Date());
		return ordersMapper.insertSelective(order);
	}

	@Override
	public Orders findOrderByNo(String orderNo) throws Exception {
		OrdersExample example=new OrdersExample();
		OrdersExample.Criteria criteria=example.createCriteria();
		criteria.andOrderNoEqualTo(orderNo);
		return ordersMapper.selectByExample(example).get(0);
	}

}
