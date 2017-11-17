package com.older.manager.mapper;

import com.older.manager.bean.ProductsViews;
import com.older.manager.bean.ProductsViewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsViewsMapper {
	int countByExample(ProductsViewsExample example);

	int deleteByExample(ProductsViewsExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(ProductsViews record);

	int insertSelective(ProductsViews record);

	List<ProductsViews> selectByExample(ProductsViewsExample example);

	ProductsViews selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") ProductsViews record,
			@Param("example") ProductsViewsExample example);

	int updateByExample(@Param("record") ProductsViews record,
			@Param("example") ProductsViewsExample example);

	int updateByPrimaryKeySelective(ProductsViews record);

	int updateByPrimaryKey(ProductsViews record);

	/**
	 * @Title: selectProductsViewsCountByUsersId
	 * @Description: 根据用户id查询所有的产品浏览数
	 * @param: @param userId
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	int selectProductsViewsCountByUsersId(Integer userId);

	/**
	 * 查询浏览记录
	 * 
	 * @return
	 */
	List<ProductsViews> selectProductsViews();
}