/**
 * 
 */
package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.RecomProducts;

/**
 * @author ym
 * 
 */
public interface RecomProductsService {

	/**
	 * @Title: addRecomProducts
	 * @Description: 添加推荐商品
	 * @param: @param recomProducts
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int addRecomProducts(RecomProducts recomProducts);

	/**
	 * @Title: deleteRecomProductsById
	 * @Description: 通过id删除推荐商品
	 * @param: @param id
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int deleteRecomProductsById(int id);

	/**
	 * @Title: modifyRecomProducts
	 * @Description: 修改推荐商品
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int modifyRecomProducts(RecomProducts recomProducts);

	/**
	 * @Title: findRecomProductsByid
	 * @Description: 通过id查询推荐产品
	 * @param: @param id
	 * @param: @return
	 * @return: RecomProducts
	 * @throws
	 */
	public RecomProducts findRecomProductsByid(int id);
	
	/**
	 * @Title:   findAllRecomProducts
	 * @Description:  查询所有的推荐产品
	 * @param:    @return   
	 * @return:   List<RecomProducts>   
	 * @throws
	 */
	public List<RecomProducts> findAllRecomProducts();

}
