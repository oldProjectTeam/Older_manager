/**
 * 
 */
package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Brand;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;

/**
 * @author ym
 * @date 2017年11月15日 下午5:28:23
 */
public interface ProductsSearchService {

	
	/**
	 * @Title:   findAllProductsBySearch
	 * @Description:  通过关键词搜索商品
	 * @param:    @param searchKeyWord
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月15日 下午5:14:50
	 */
	public List<Products> findAllProductsBySearch(String searchKeyWord);
	
	/**
	 * @Title:   findAllProductsByComplexSearch
	 * @Description:  复杂的搜索商品方法
	 * @param:    @param products
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月15日 下午8:26:40
	 */
	public List<Products> findAllProductsByComplexSearch(Products products);
	
	/**
	 * @Title:   selectAllProductsBrandByComplexSearch
	 * @Description:  通过产品搜索产品品牌
	 * @param:    @param products
	 * @param:    @return   
	 * @return:   List<Brand>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月16日 下午8:36:09
	 */
	public List<Brand> selectAllProductsBrandByComplexSearch(Products products);
	
	/**
	 * @Title:   selectAllProductsTypeByComplexSearch
	 * @Description:  通过搜索查询所有的商品类型
	 * @param:    @param productType
	 * @param:    @return   
	 * @return:   List<ProductType>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月16日 下午8:36:57
	 */
	public List<ProductType> selectAllProductsTypeByComplexSearch(Products products);
}
