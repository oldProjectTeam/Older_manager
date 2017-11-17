package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.ProductsViews;

public interface IProductsViewsService {
	//查询浏览信息
	List<ProductsViews> queryProductsViews();
	//删除浏览记录
	int deleteProductsViews(int id);
}
