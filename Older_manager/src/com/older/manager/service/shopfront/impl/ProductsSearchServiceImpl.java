/**
 * 
 */
package com.older.manager.service.shopfront.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Brand;
import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.mapper.BrandMapper;
import com.older.manager.mapper.ProductKeywordMapper;
import com.older.manager.mapper.ProductTypeMapper;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.shopfront.ProductsSearchService;

/**
 * @author ym
 * @date 2017年11月15日 下午6:32:39
 */
@Service
public class ProductsSearchServiceImpl implements ProductsSearchService {

	@Autowired
	ProductsMapper productsMapper;

	@Autowired
	BrandMapper brandMapper;

	@Autowired
	ProductTypeMapper productTypeMapper;
	
	@Autowired
	private ProductKeywordMapper productKeywordMapper;

	/**
	 * @Title: findAllProductsBySearch
	 * @Description: 通过简单搜索查询所有的产品
	 * @param: @param searchKeyWord 关键字
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Products> findAllProductsBySearch(String searchKeyWord) {
		ProductsExample example = new ProductsExample();
		if (searchKeyWord == null) {
			example.createCriteria().andStateEqualTo(1);
			example.setOrderByClause("id desc");
		} else {
			example.createCriteria().andStateEqualTo(1)
					.andNameLike("%" + searchKeyWord + "%");
			example.setOrderByClause("id desc");
		}

		return productsMapper.selectByExample(example);
	}

	/**
	 * @Title: findAllProductsByComplexSearch
	 * @Description: 复杂的搜索查询方法
	 * @param: @param products 封装好的产品
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Products> findAllProductsByComplexSearch(Products products) {
		return productsMapper.selectAllProductsByComplexSearch(products);
	}

	/**
	 * @Title: selectAllProductsBrandByComplexSearch
	 * @Description: 通过搜索查询所有的商品类型
	 * @param: @param products 封装好的产品
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Brand> selectAllProductsBrandByComplexSearch(Products products) {
		return brandMapper.selectAllProductsBrandByComplexSearch(products);
	}

	/**
	 * @Title: selectAllProductsTypeByComplexSearch
	 * @Description: 通过搜索查询所有的商品类型
	 * @param: @param products 封装好的产品
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<ProductType> selectAllProductsTypeByComplexSearch(
			Products products) {
		return productTypeMapper.selectAllProductsTypeByComplexSearch(products);
	}

	/**
	 * @Title: selectAllHosProductsKeyWordBySearch
	 * @Description: 通过搜索查找热搜产品关键词
	 * @param: @param products
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<String> selectAllHosProductsKeyWordBySearch(Products products) {
		String keywords = "";
		String emp[] = null;
		ArrayList<String> hotsword = new ArrayList<String>();
		List<ProductKeyword> productKeywords = productKeywordMapper
				.selectAllHotProductsKeyWordsByComplexSearch(products);
		if (productKeywords.size() > 0) {
			for (int i = 0; i < productKeywords.size(); i++) {
				keywords = keywords + " " + productKeywords.get(i).getKeyword();
			}
			;
			emp = keywords.split(" ");
			for (int i = 0; i < emp.length; i++) {
				hotsword.add(emp[i]);
			}
			;
			ArrayList<String> newArray = new ArrayList<String>();
			Iterator<String> it = hotsword.iterator();
			while (it.hasNext()) {
				String s = (String) it.next();
				if (!newArray.contains(s)) {
					newArray.add(s);
				}
			}
			;
			return newArray;
		} else {
			return null;
		}
	}
}
