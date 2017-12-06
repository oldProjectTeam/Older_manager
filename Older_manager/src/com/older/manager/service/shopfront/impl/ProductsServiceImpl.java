package com.older.manager.service.shopfront.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsViews;
import com.older.manager.bean.ProductsViewsExample;
import com.older.manager.bean.ProductsViewsExample.Criteria;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.mapper.ProductsViewsMapper;
import com.older.manager.service.shopfront.IProductsService;

@Service
public class ProductsServiceImpl implements IProductsService {
	@Autowired
	ProductsMapper productsMapper;

	@Autowired
	private ProductsViewsMapper productsViewsMapper;

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
	 * @Title: findAllProductsTypeDetial
	 * @Description: 查找产品的类型详细分布
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Products> findAllProductsTypeDetial() {
		return productsMapper.selectProductsTypeHeads();
	}

	@Override
	public void addFoot(Integer id, Integer id2) {
		List<ProductsViews> p = this.queryProductsViewsById(id, id2);
		if (p.size() == 0) {
			ProductsViews record = new ProductsViews();
			record.setProductsId(id2);
			record.setUsersId(id);
			record.setViewtime(new Date());
			productsViewsMapper.insertSelective(record);
		}
	}

	private List<ProductsViews> queryProductsViewsById(Integer id, Integer id2) {
		ProductsViewsExample example = new ProductsViewsExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsersIdEqualTo(id);
		criteria.andProductsIdEqualTo(id2);
		return productsViewsMapper.selectByExample(example);
	}
}
