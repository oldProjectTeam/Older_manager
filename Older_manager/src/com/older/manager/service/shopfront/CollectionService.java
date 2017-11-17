package com.older.manager.service.shopfront;

import java.util.Collection;
import java.util.List;

import com.older.manager.bean.Products;
import com.older.manager.bean.ShoppingCart;

public interface CollectionService {
	//查询产品信息
	List<Products> queryProducts();
	//模糊查询产品信息
	List<Products> dimQuery(Products products);
	
}
