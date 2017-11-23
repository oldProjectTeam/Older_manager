package com.older.manager.mapper;

import com.older.manager.bean.Brand;
import com.older.manager.bean.BrandExample;
import com.older.manager.bean.BrandWithBLOBs;
import com.older.manager.bean.Products;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandWithBLOBs record);

    int insertSelective(BrandWithBLOBs record);

    List<BrandWithBLOBs> selectByExampleWithBLOBs(BrandExample example);

    List<Brand> selectByExample(BrandExample example);

    BrandWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandWithBLOBs record, @Param("example") BrandExample example);

    int updateByExampleWithBLOBs(@Param("record") BrandWithBLOBs record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(BrandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BrandWithBLOBs record);

    int updateByPrimaryKey(Brand record);
    
    /**
     * @Title:   findAllBrandsByProduct
     * @Description:  通过产品搜索产品品牌
     * @param:    @param products
     * @param:    @return   
     * @return:   List<Brand>   
     * @throws
     * @author:   ym
     * @date:     2017年11月16日 下午8:27:23
     */
    List<Brand> selectAllProductsBrandByComplexSearch(Products products);
    
    /**
     * @Title:   selectAllProductsBrandByPrductsParentId
     * @Description:  通过产品类型id查询所有的品牌
     * @param:    @param productsId
     * @param:    @return   
     * @return:   List<Brand>   
     * @throws
     * @author:   ym
     * @date:     2017年11月20日 下午7:03:15
     */
    List<Brand> selectAllProductsBrandByPrductsParentId(Integer productsId);
    
    /**
     * @Title:   selectBrandByProductsId
     * @Description:  通过产品类型的id查询
     * @param:    @param productsId
     * @param:    @return   
     * @return:   List<Brand>   
     * @throws
     * @author:   ym
     * @date:     2017年11月20日 下午10:47:31
     */
    List<Brand> selectBrandByProductsId(Integer productsId);
}