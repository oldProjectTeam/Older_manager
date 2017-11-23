/**
 * 
 */
package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductType;
import com.older.manager.mapper.ProductTypeMapper;
import com.older.manager.service.shopfront.ShopHomeService;

/**
 * @author ym
 * @date 2017年11月20日 下午8:41:09
 */
@Service
public class ShopHomeServiceImpl implements ShopHomeService {

	@Autowired
	ProductTypeMapper productTypeMapper;

	/**
	 * @Title: findAllProductTypesAndBrand
	 * @Description: 查询商品的一级标题和二级标题和相应的品牌
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<ProductType> findAllProductTypesAndBrand() {
		return productTypeMapper.selectAllProductType();
	}

	/**
	 * @Title: findAllProductTypeAndProducts
	 * @Description: 查询所有的产品类型和商品
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<ProductType> findAllProductTypeAndProducts() {
		return productTypeMapper.selectAllProductTypeAndProducts();
	}

}
