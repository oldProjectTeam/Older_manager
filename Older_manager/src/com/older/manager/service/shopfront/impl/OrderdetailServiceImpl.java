package com.older.manager.service.shopfront.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.bean.OrdersExample;
import com.older.manager.bean.OrdersExample.Criteria;
import com.older.manager.mapper.OrderdetailMapper;
import com.older.manager.mapper.OrdersMapper;
import com.older.manager.service.shopfront.IOrderdetailService;

@Service
public class OrderdetailServiceImpl implements IOrderdetailService {

	@Autowired
	private OrderdetailMapper orderdetailMapper;
	@Autowired
	private OrdersMapper ordersMapper;

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

	@Override
	public void updatestate(Orders orders) {
		// TODO 自动生成的方法存根
		ordersMapper.updateByPrimaryKeySelective(orders);
	}

	@Override
	public void updateStateTWO(Orders orders) {
		OrdersExample example = new OrdersExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(orders.getId());
		ordersMapper.updateByExampleSelective(orders, example);

	}

	@Override
	public void deleteOrderDetail(Integer id) {
		// TODO 自动生成的方法存根
		orderdetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateOrder(Orders orders) {
		// TODO 自动生成的方法存根
		ordersMapper.updateByPrimaryKeySelective(orders);
	}

	@Override
	public List<Orderdetail> selectAllOrderDetailByOrderId(Integer id) {
		// TODO 自动生成的方法存根
		return orderdetailMapper.selectByExampleWithOthreByOrderid(id);
	}

	@Override
	public void updateOrderDetailStati(Orderdetail orderdetail) {
		// TODO 自动生成的方法存根
		orderdetailMapper.updateByPrimaryKeySelective(orderdetail);
	}

	@Override
	public List<Integer> queryOrderInfoByUserId(Integer usersid) {
		OrdersExample example = new OrdersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(usersid);
		List<Orders> list = ordersMapper.selectByExample(example);
		List<Integer> orderInfo = new ArrayList<Integer>();
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		for (Orders orders : list) {
			if (orders.getState().equals("待付款")) {
				count1 = count1 + 1;
			} else if (orders.getState().equals("待发货")) {
				count2 = count2 + 1;
			} else if (orders.getState().equals("待收货")) {
				count3 = count3 + 1;
			} else if (orders.getState().equals("待评价")) {
				count4 = count4 + 1;
			}
		}
		orderInfo.add(count1);
		orderInfo.add(count2);
		orderInfo.add(count3);
		orderInfo.add(count4);
		return orderInfo;
	}

}
