/**
 * 
 */
package com.older.manager.service.oldback.shop;

import java.util.List;

import com.older.manager.bean.ProductsViews;

/**
 * @author ym
 * 
 */
public interface ProductsViewsService {

	/**
	 * @Title: addProductsViews
	 * @Description: 添加一个商品浏览表
	 * @param: @param productsViews
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int addProductsViews(ProductsViews productsViews);

	/**
	 * @Title: deleteProductsViewsById
	 * @Description: 根据id删除商品浏览表
	 * @param: @param id
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int deleteProductsViewsById(Integer id);

	/**
	 * @Title: modifyProductsViews
	 * @Description: 修改商品浏览表
	 * @param: @param productsViews
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int modifyProductsViews(ProductsViews productsViews);

	/**
	 * @Title: findProductsViewsById
	 * @Description: 根据id查询一个产品浏览表
	 * @param: @param id
	 * @param: @return
	 * @return: ProductsViews
	 * @throws
	 */
	public ProductsViews findProductsViewsById(Integer id);

	/**
	 * @Title: findAllProductsViews
	 * @Description: 查询所有的产品浏览表
	 * @param: @return
	 * @return: List<ProductsViews>
	 * @throws
	 */
	public List<ProductsViews> findAllProductsViews();
	
	/**
	 * @Title:   findAllCountByUsersId
	 * @Description:  通过会员id查询商品浏览量
	 * @param:    @param userId
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int findAllCountByUsersId(Integer userId);

}
