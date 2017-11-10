package com.older.manager.mapper;

import com.older.manager.bean.RecomProducts;
import com.older.manager.bean.RecomProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecomProductsMapper {
    int countByExample(RecomProductsExample example);

    int deleteByExample(RecomProductsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecomProducts record);

    int insertSelective(RecomProducts record);
    
    RecomProducts selectBaseDataById(int id);
    
    List<RecomProducts> selectByExample(RecomProductsExample example);

    RecomProducts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecomProducts record, @Param("example") RecomProductsExample example);

    int updateByExample(@Param("record") RecomProducts record, @Param("example") RecomProductsExample example);

    int updateByPrimaryKeySelective(RecomProducts record);

    int updateByPrimaryKey(RecomProducts record);
}