package com.older.manager.mapper;

import com.older.manager.bean.Healthinfo;
import com.older.manager.bean.HealthinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthinfoMapper {
    int countByExample(HealthinfoExample example);

    int deleteByExample(HealthinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Healthinfo record);

    int insertSelective(Healthinfo record);

    List<Healthinfo> selectByExample(HealthinfoExample example);

    Healthinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Healthinfo record, @Param("example") HealthinfoExample example);

    int updateByExample(@Param("record") Healthinfo record, @Param("example") HealthinfoExample example);

    int updateByPrimaryKeySelective(Healthinfo record);

    int updateByPrimaryKey(Healthinfo record);
}