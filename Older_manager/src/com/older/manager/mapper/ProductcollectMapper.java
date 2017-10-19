package com.older.manager.mapper;

import com.older.manager.bean.Productcollect;
import com.older.manager.bean.ProductcollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcollectMapper {
    int countByExample(ProductcollectExample example);

    int deleteByExample(ProductcollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productcollect record);

    int insertSelective(Productcollect record);

    List<Productcollect> selectByExample(ProductcollectExample example);

    Productcollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productcollect record, @Param("example") ProductcollectExample example);

    int updateByExample(@Param("record") Productcollect record, @Param("example") ProductcollectExample example);

    int updateByPrimaryKeySelective(Productcollect record);

    int updateByPrimaryKey(Productcollect record);
}