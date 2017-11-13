package com.older.manager.mapper;

import com.older.manager.bean.ProductCollect;
import com.older.manager.bean.ProductCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCollectMapper {
    int countByExample(ProductCollectExample example);

    int deleteByExample(ProductCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCollect record);

    int insertSelective(ProductCollect record);

    List<ProductCollect> selectByExample(ProductCollectExample example);

    ProductCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCollect record, @Param("example") ProductCollectExample example);

    int updateByExample(@Param("record") ProductCollect record, @Param("example") ProductCollectExample example);

    int updateByPrimaryKeySelective(ProductCollect record);

    int updateByPrimaryKey(ProductCollect record);
}