package com.older.manager.service.shopfront.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Products;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.shopfront.IProductsService;

@Service
public class ProductsServiceImpl implements IProductsService {
	@Autowired
	ProductsMapper productsMapper;

	/**
	 * @Title: findById
	 * @Description: 通过ID查找产品全部信息
	 * @param: @param id
	 * @param: @return
	 * @param: @throws Exception
	 * @throws
	 */
	@Override
	public Products findById(Integer id) {
		// TODO Auto-generated method stub
		// 通过id查询产品全部信息
		Products products = productsMapper.selectWithTypeBrandByKey(id);
		if (products != null) {
			if (products.getImages().contains(",")) {
				String s[] = products.getImages().split(",");
				List<String> list = new ArrayList<String>();
				for (int i = 0; i < s.length; i++) {
					list.add(s[i]);
				}
				products.setImgList(list);
			}
		}
		return products;
	}

	/**
	 * @Title:   findAllProductsTypeDetial
	 * @Description:  查找产品的类型详细分布
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Products> findAllProductsTypeDetial() {
		return productsMapper.selectProductsTypeHeads();
	}
}
