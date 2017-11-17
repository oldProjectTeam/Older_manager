package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Products;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.shopfront.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private ProductsMapper productsMapper;
	@Override
	public List<Products> salesSorting(Products products) {
		
		return productsMapper.salesOrPriceQuery(products);
	}

}
