package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Products;

public interface SearchService {
	//销售或价格查询
	List<Products> salesSorting(Products products);
}
