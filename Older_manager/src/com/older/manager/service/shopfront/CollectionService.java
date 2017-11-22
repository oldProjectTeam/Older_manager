package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.ProductCollect;
import com.older.manager.bean.Products;

public interface CollectionService {
	// 查询产品信息
	List<ProductCollect> queryProductCollects(Integer userId);

	// 模糊查询产品信息
	List<Products> dimQuery(Products products);

	// 添加收藏
	void insertProductsCollect(ProductCollect productCollect);

	// 根据id删除收藏
	void deleteProductsCollect(Integer id);

	/**
	 * 通过商品id查询收藏记录
	 * @param id
	 * @return
	 */
	ProductCollect queryCollectByProductId(Integer id,Integer userId);
}
