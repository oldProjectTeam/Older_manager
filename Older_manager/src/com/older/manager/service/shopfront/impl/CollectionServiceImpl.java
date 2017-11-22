package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductCollect;
import com.older.manager.bean.ProductCollectExample;
import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.bean.ProductsExample.Criteria;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.mapper.ProductCollectMapper;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.mapper.ShoppingCartMapper;
import com.older.manager.service.shopfront.CollectionService;

@Service
public class CollectionServiceImpl implements CollectionService {
	@Autowired
	private ProductsMapper productsMapper;
	@Autowired
	private ShoppingCartMapper shoppingcartMapper;
	@Autowired
	private ProductCollectMapper productCollectMapper;

	@Override
	public List<Products> dimQuery(Products products) {

		return productsMapper.dimQueryProducts(products);
	}

	@Override
	public List<ProductCollect> queryProductCollects(Integer userid) {

		return productCollectMapper.queryProductCollects(userid);
	}

	@Override
	public void insertProductsCollect(ProductCollect productCollect) {
		productCollectMapper.insertSelective(productCollect);
	}

	@Override
	public void deleteProductsCollect(Integer id) {
		productCollectMapper.deleteByPrimaryKey(id);
	}

	@Override
	public ProductCollect queryCollectByProductId(Integer id,Integer userId) {
		ProductCollectExample example = new ProductCollectExample();
		com.older.manager.bean.ProductCollectExample.Criteria criteria = example
				.createCriteria();
		criteria.andProductsIdEqualTo(id);
		criteria.andUsersIdEqualTo(userId);
		List<ProductCollect> list = productCollectMapper
				.selectByExample(example);
		if (list.size() > 0 && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
}
