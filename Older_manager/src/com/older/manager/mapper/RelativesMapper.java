package com.older.manager.mapper;

import com.older.manager.bean.Relatives;
import com.older.manager.bean.RelativesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelativesMapper {
    int countByExample(RelativesExample example);

    int deleteByExample(RelativesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Relatives record);

    int insertSelective(Relatives record);

    List<Relatives> selectByExample(RelativesExample example);

    Relatives selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Relatives record, @Param("example") RelativesExample example);

    int updateByExample(@Param("record") Relatives record, @Param("example") RelativesExample example);

    int updateByPrimaryKeySelective(Relatives record);

    int updateByPrimaryKey(Relatives record);
}