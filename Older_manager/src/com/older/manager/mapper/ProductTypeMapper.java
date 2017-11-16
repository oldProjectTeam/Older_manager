package com.older.manager.mapper;

import com.older.manager.bean.ProductType;
import com.older.manager.bean.ProductTypeExample;
import com.older.manager.bean.Products;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductTypeMapper {
	int countByExample(ProductTypeExample example);

	int deleteByExample(ProductTypeExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(ProductType record);

	int insertSelective(ProductType record);

	List<ProductType> selectByExampleWithBLOBs(ProductTypeExample example);

	List<ProductType> selectByExample(ProductTypeExample example);

	ProductType selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") ProductType record,
			@Param("example") ProductTypeExample example);

	int updateByExampleWithBLOBs(@Param("record") ProductType record,
			@Param("example") ProductTypeExample example);

	int updateByExample(@Param("record") ProductType record,
			@Param("example") ProductTypeExample example);

	int updateByPrimaryKeySelective(ProductType record);

	int updateByPrimaryKeyWithBLOBs(ProductType record);

	int updateByPrimaryKey(ProductType record);

	/**
	 * @Title: selectAllProductsTypeByComplexSearch
	 * @Description: 通过搜索查询所有的商品类型
	 * @param: @param products
	 * @param: @return
	 * @return: List<ProductType>
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午8:32:11
	 */
	List<ProductType> selectAllProductsTypeByComplexSearch(Products products);
}