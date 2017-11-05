/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.RecomProducts;
import com.older.manager.mapper.RecomProductsMapper;
import com.older.manager.service.oldback.RecomProductsService;

/**
 * @author ym
 *
 */
@Service
public class RecomProductsServiceImpl implements RecomProductsService {
	
	@Autowired
	RecomProductsMapper recomProductsMapper;
	

	/**
	 * @Title:   addRecomProducts
	 * @Description:  添加推荐商品
	 * @param:    @param recomProducts
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int addRecomProducts(RecomProducts recomProducts) {
		return recomProductsMapper.insertSelective(recomProducts);
	}

	/**
	 * @Title:   deleteRecomProductsById
	 * @Description:  根据id删除推荐商品
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int deleteRecomProductsById(int id) {
		return recomProductsMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title:   modifyRecomProducts
	 * @Description:  修改推荐产品
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int modifyRecomProducts(RecomProducts recomProducts) {
		return recomProductsMapper.updateByPrimaryKeySelective(recomProducts);
	}

	
	/**
	 * @Title:   findRecomProductsByid
	 * @Description:  通过id查询推荐商品
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public RecomProducts findRecomProductsByid(int id) {
		return recomProductsMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title:   findAllRecomProducts
	 * @Description:  查询所有的推荐产品
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<RecomProducts> findAllRecomProducts() {
		return recomProductsMapper.selectByExample(null);
	}

}
