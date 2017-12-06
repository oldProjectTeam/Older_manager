package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductComment;
import com.older.manager.bean.ProductsViews;
import com.older.manager.mapper.ProductsViewsMapper;
import com.older.manager.service.shopfront.IProductCommentService;
import com.older.manager.service.shopfront.IProductsViewsService;

@Service
public class ProductsViewsServiceImpl implements IProductsViewsService {
	@Autowired
	private ProductsViewsMapper productsViewsMapper;

	@Override
	public List<ProductsViews> queryProductsViews(Integer id) {
		return productsViewsMapper.selectProductsViews(id);
	}

	@Override
	public int deleteProductsViews(int id) {
		return productsViewsMapper.deleteByPrimaryKey(id);
	}

}
