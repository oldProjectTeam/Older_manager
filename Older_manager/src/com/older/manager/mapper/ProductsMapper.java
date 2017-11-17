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
	
	/**
	 * @Title:   selectAllProductsByComplexSearch
	 * @Description:  通过搜索查询所有的商品
	 * @param:    @param products
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月15日 下午8:16:49
	 */
	List<Products> selectAllProductsByComplexSearch(Products products);
	
	//查询产品信息
	List<Products> selectProducts();
	//模糊查询产品信息
	List<Products> dimQueryProducts(Products products );
	//根据销售排序
	List<Products> salesOrPriceQuery(Products products);
}