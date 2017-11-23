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
	
	List<Products> selectProductsTypeHeads();
	/**
	 * @Title:   selectProductsByProductTypeParentId
	 * @Description:  通过商品类型的parentId来查询前6个销量好的商品
	 * @param:    @param parentId
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月21日 上午9:52:25
	 */
	List<Products> selectProductsByProductTypeParentId(Integer parentId);
	
	/**
	 * @Title:   selectAllProductsBykeyWords
	 * @Description:  模糊查询
	 * @param:    @param keyword
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月22日 上午2:08:25
	 */
	List<Products> selectAllProductsBykeyWords(String keyword);
	
	/**
	 * @Title:   selectAllProductsByBrandName
	 * @Description:  根据品牌名查询商品
	 * @param:    @param brandname
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月22日 下午10:42:49
	 */
	List<Products> selectAllProductsByBrandName(String brandname);
	
	/**
	 * @Title:   selectAllProductsByTypename
	 * @Description:  根据类型名称查询商品
	 * @param:    @param typename
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月22日 下午10:52:41
	 */
	List<Products> selectAllProductsByTypename(String typename);
	
}