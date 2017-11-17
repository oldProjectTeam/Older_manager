package com.older.manager.mapper;

import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.ProductKeywordExample;
import com.older.manager.bean.Products;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductKeywordMapper {
    int countByExample(ProductKeywordExample example);

    int deleteByExample(ProductKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductKeyword record);

    int insertSelective(ProductKeyword record);

    List<ProductKeyword> selectByExampleWithBLOBs(ProductKeywordExample example);

    List<ProductKeyword> selectByExample(ProductKeywordExample example);

    ProductKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductKeyword record, @Param("example") ProductKeywordExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductKeyword record, @Param("example") ProductKeywordExample example);

    int updateByExample(@Param("record") ProductKeyword record, @Param("example") ProductKeywordExample example);

    int updateByPrimaryKeySelective(ProductKeyword record);

    int updateByPrimaryKeyWithBLOBs(ProductKeyword record);

    int updateByPrimaryKey(ProductKeyword record);
    
    /**
     * @Title:   selectAllHotProductsKeyWordsByComplexSearch
     * @Description:  通过搜索查找产品销量前五的关键词
     * @param:    @param products
     * @param:    @return   
     * @return:   List<ProductKeyword>   
     * @throws
     * @author:   ym
     * @date:     2017年11月17日 上午11:17:12
     */
    List<ProductKeyword> selectAllHotProductsKeyWordsByComplexSearch(Products products);
}