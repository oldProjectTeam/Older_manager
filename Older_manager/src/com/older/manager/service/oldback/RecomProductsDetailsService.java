/**
 * 
 */
package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.RecomProductsDetails;

/**
 * @author ym
 * 
 */
public interface RecomProductsDetailsService {

	/**
	 * @Title: addRecomProductsDetails
	 * @Description: 添加推荐商品详细表
	 * @param: @param recomProductsDetails
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int addRecomProductsDetails(RecomProductsDetails recomProductsDetails);

	/**
	 * @Title: deleteRecomProductsDetailsById
	 * @Description: 通过id删除推荐商品详细表
	 * @param: @param id
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int deleteRecomProductsDetailsById(int id);

	/**
	 * @Title: modifyRecomProductsDetails
	 * @Description: 修改推荐商品详细表
	 * @param: @param recomProductsDetails
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int modifyRecomProductsDetails(
			RecomProductsDetails recomProductsDetails);

	/**
	 * @Title: findRecomProductsDetailsById
	 * @Description: 通过id查询推荐商品详细表
	 * @param: @param id
	 * @param: @return
	 * @return: RecomProductsDetails
	 * @throws
	 */
	public RecomProductsDetails findRecomProductsDetailsById(int id);

	/**
	 * @Title: findAllRecomProductsDetails
	 * @Description: 查询所有的推荐商品详细表
	 * @param: @return
	 * @return: List<RecomProductsDetails>
	 * @throws
	 */
	public List<RecomProductsDetails> findAllRecomProductsDetails();

	/**
	 * @Title: findAllRecomProductsDetailsBySearch
	 * @Description: 通过搜索来查询所有的推荐产品详细表
	 * @param: @return
	 * @return: List<RecomProductsDetails>
	 * @throws
	 */
	public List<RecomProductsDetails> findAllRecomProductsDetailsBySearch(String recomPeople,String oldManName,String result);

}
