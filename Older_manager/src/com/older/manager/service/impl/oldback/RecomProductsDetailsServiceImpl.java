/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.RecomProducts;
import com.older.manager.bean.RecomProductsDetails;
import com.older.manager.bean.RecomProductsDetailsExample;
import com.older.manager.mapper.RecomProductsDetailsMapper;
import com.older.manager.service.oldback.RecomProductsDetailsService;

/**
 * @author ym
 *
 */
@Service
public class RecomProductsDetailsServiceImpl implements RecomProductsDetailsService{

	@Autowired
	RecomProductsDetailsMapper recomProductsDetailsMapper;
	
	/**
	 * @Title:   addRecomProductsDetails
	 * @Description:  添加推荐商品详细表
	 * @param:    @param recomProductsDetails
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int addRecomProductsDetails(RecomProductsDetails recomProductsDetails) {
		return recomProductsDetailsMapper.insertSelective(recomProductsDetails);
	}

	/**
	 * @Title:   deleteRecomProductsDetailsById
	 * @Description:  通过id删除推荐商品详细表
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int deleteRecomProductsDetailsById(int id) {
		return recomProductsDetailsMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title:   modifyRecomProductsDetails
	 * @Description:  修改推荐商品详细表
	 * @param:    @param recomProductsDetails
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int modifyRecomProductsDetails(
			RecomProductsDetails recomProductsDetails) {
		return recomProductsDetailsMapper.updateByPrimaryKeySelective(recomProductsDetails);
	}

	/**
	 * @Title:   findRecomProductsDetailsById
	 * @Description:  通过id查询推荐商品详细表
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public RecomProductsDetails findRecomProductsDetailsById(int id) {
		return recomProductsDetailsMapper.selectDetailRecomProductsDetailsById(id);
	}

	/**
	 * @Title:   findAllRecomProductsDetails
	 * @Description:  查找所有的推荐商品详细表
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<RecomProductsDetails> findAllRecomProductsDetails() {
		return recomProductsDetailsMapper.selectAllDetailRecomProductsDetails();
	}

	/**
	 * @Title:   findAllRecomProductsDetailsBySearch
	 * @Description:  通过搜索来查询所有的推荐商品详细表
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<RecomProductsDetails> findAllRecomProductsDetailsBySearch(String recomPeople,String oldManName,String result) {
		
		RecomProductsDetails recomProductsDetails=new RecomProductsDetails();
		Oldman oldman=new Oldman();
		oldman.setName(oldManName);
		RecomProducts recomProducts=new RecomProducts();
		recomProducts.setRecompeople(recomPeople);
		if (result.equals("请选择")) {
			recomProductsDetails.setResult(null);
		}else {
			recomProductsDetails.setResult(result);
		}
		recomProductsDetails.setOldman(oldman);
		recomProductsDetails.setRecomProducts(recomProducts);
		return recomProductsDetailsMapper.selectByRecomProductsDetails(recomProductsDetails);

		
	}

}
