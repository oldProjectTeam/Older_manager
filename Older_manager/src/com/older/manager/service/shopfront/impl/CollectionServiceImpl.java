package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.bean.ProductsExample.Criteria;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.mapper.ShoppingCartMapper;
import com.older.manager.service.shopfront.CollectionService;

@Service
public class CollectionServiceImpl implements CollectionService {

	@Autowired
	private ProductsMapper productsMapper;
	@Autowired
	private ShoppingCartMapper shoppingcartMapper;

	@Override
	public List<Products> queryProducts() {

		return productsMapper.selectProducts();
	}

	@Override
	public List<Products> dimQuery(Products products) {

		return productsMapper.dimQueryProducts(products);
	}
}
