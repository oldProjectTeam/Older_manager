package com.older.manager.service.shopfront.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Products;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.bean.ShoppingCartExample;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.mapper.ShoppingCartMapper;
import com.older.manager.service.shopfront.IShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements IShoppingCartService {

	@Autowired
	private ShoppingCartMapper shoppingCartMapper;
	@Autowired
	private ProductsMapper productsMapper;
	@Override
	public void insertShoppingCart(ShoppingCart shoppingCart) throws Exception {
		  //自动设置添加时间
		  shoppingCart.setTime(new Date());
		  Products products=productsMapper.selectByPrimaryKey(shoppingCart.getProdutsId());
		  //金额
		  shoppingCart.setBaseprice(products.getNowprice()*shoppingCart.getNumber());
		  shoppingCartMapper.insertSelective(shoppingCart);

	}

	@Override
	public void deleteShoppingCart(Integer id) throws Exception {
		
		shoppingCartMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateShoppingCart(ShoppingCart shoppingCart) throws Exception {
		shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);
		
	}

	@Override
	public List<ShoppingCart> findAllCarts(Integer userId) throws Exception {
		// TODO Auto-generated method stub
		return shoppingCartMapper.selectByUserId(userId);
	}

	@Override
	public void batchDelCart(List<Integer> ids) throws Exception {
		// TODO Auto-generated method stub
		ShoppingCartExample example=new ShoppingCartExample();
		ShoppingCartExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		shoppingCartMapper.deleteByExample(example);
	}

}
