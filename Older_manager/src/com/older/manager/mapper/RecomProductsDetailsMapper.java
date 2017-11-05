package com.older.manager.mapper;

import com.older.manager.bean.RecomProductsDetails;
import com.older.manager.bean.RecomProductsDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecomProductsDetailsMapper {
    int countByExample(RecomProductsDetailsExample example);

    int deleteByExample(RecomProductsDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecomProductsDetails record);

    int insertSelective(RecomProductsDetails record);

    List<RecomProductsDetails> selectByExample(RecomProductsDetailsExample example);

    RecomProductsDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecomProductsDetails record, @Param("example") RecomProductsDetailsExample example);

    int updateByExample(@Param("record") RecomProductsDetails record, @Param("example") RecomProductsDetailsExample example);

    int updateByPrimaryKeySelective(RecomProductsDetails record);

    int updateByPrimaryKey(RecomProductsDetails record);
}