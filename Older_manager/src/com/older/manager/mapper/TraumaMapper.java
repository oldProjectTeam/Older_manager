package com.older.manager.mapper;

import com.older.manager.bean.Trauma;
import com.older.manager.bean.TraumaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraumaMapper {
    int countByExample(TraumaExample example);

    int deleteByExample(TraumaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trauma record);

    int insertSelective(Trauma record);

    List<Trauma> selectByExample(TraumaExample example);

    Trauma selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trauma record, @Param("example") TraumaExample example);

    int updateByExample(@Param("record") Trauma record, @Param("example") TraumaExample example);

    int updateByPrimaryKeySelective(Trauma record);

    int updateByPrimaryKey(Trauma record);
}