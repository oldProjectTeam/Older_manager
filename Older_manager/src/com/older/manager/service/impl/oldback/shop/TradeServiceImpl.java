package com.older.manager.service.impl.oldback.shop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.OrderdetailExample;
import com.older.manager.bean.Orders;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.bean.ProductsExample.Criteria;
import com.older.manager.mapper.OrderdetailMapper;
import com.older.manager.mapper.OrdersMapper;
import com.older.manager.mapper.ProductTypeMapper;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.oldback.shop.ITradeService;

@Service
public class TradeServiceImpl implements ITradeService {
	@Autowired
	private ProductTypeMapper productTypeMapper;

	@Autowired
	private ProductsMapper productsMapper;

	@Autowired
	private OrdersMapper ordersMapper;

	@Autowired
	private OrderdetailMapper orderdetailMapper;

	@Override
	public List<ProductType> queryAllTypeOfProductType() {
		return productTypeMapper.selectByExample(null);
	}

	@Override
	public List<Products> queryAllProducts() {
		return productsMapper.selectByExample(null);
	}

	@Override
	public List<Orders> queryAllOrders() {
		return ordersMapper.selectByExample(null);
	}

	@Override
	public List<Integer> queryAllProductIdsOfProductTypeId(Integer id) {
		List<Integer> productIds = new ArrayList<Integer>();
		ProductsExample example = new ProductsExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeIdEqualTo(id);
		List<Products> products = productsMapper.selectByExample(example);
		for (Products products2 : products) {
			productIds.add(products2.getId());
		}
		return productIds;
	}

	@Override
	public List<Integer> queryOrdersIdOfProductIds(List<Integer> productIds) {
		List<Integer> orderIds = new ArrayList<Integer>();
		OrderdetailExample example = new OrderdetailExample();
		com.older.manager.bean.OrderdetailExample.Criteria criteria = example
				.createCriteria();
		if (productIds.size() > 0) {
			criteria.andProducctsIdIn(productIds);
			List<Orderdetail> orderdetails = orderdetailMapper
					.selectByExample(example);
			for (Orderdetail orderdetail : orderdetails) {
				orderIds.add(orderdetail.getId());
			}
		}
		return orderIds;
	}

	@Override
	public List<Orders> queryAllOrderWithJson() {
		return ordersMapper.selectByExample(null);
	}

}
