package com.older.manager.mapper;

import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.ProductKeywordExample;
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
}