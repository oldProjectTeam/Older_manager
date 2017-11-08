package com.older.manager.service.oldback.shop;

import java.util.List;

import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.Products;

public interface IProductService {

	//查询products信息
	List<Products> selectProducts();
	//根据条件查询
	List<Products> selectCondition(Products products);
	//添加商品
	void  insertProducts(Products products);
	//根据number的集合删除
	void deleteProducts(List<String> numbers);
	//根据number删除
	void deleteByProduct(String number);
	//根据number修改
	void updateByNumber(Products product);
	
}
