package com.older.manager.mapper;

import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsMapper {
	int countByExample(ProductsExample example);

	int deleteByExample(ProductsExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Products record);

	int insertSelective(Products record);

	List<Products> selectByExample(ProductsExample example);

	Products selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Products record,
			@Param("example") ProductsExample example);

	int updateByExample(@Param("record") Products record,
			@Param("example") ProductsExample example);

	int updateByPrimaryKeySelective(Products record);

	int updateByPrimaryKey(Products record);
 
	/**
     * 根据Id联合查询品牌信息、类型信息
     * @param id
     * @return
     */
    public Products selectWithTypeBrandByKey(Integer id);

	/**
	 * 分页查询所有产品信息
	 * 
	 * @param products
	 * @return
	 */
	List<Products> selectByCondition(Products products);
}