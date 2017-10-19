package com.older.manager.mapper;

import com.older.manager.bean.Recomactivity;
import com.older.manager.bean.RecomactivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecomactivityMapper {
    int countByExample(RecomactivityExample example);

    int deleteByExample(RecomactivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recomactivity record);

    int insertSelective(Recomactivity record);

    List<Recomactivity> selectByExample(RecomactivityExample example);

    Recomactivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recomactivity record, @Param("example") RecomactivityExample example);

    int updateByExample(@Param("record") Recomactivity record, @Param("example") RecomactivityExample example);

    int updateByPrimaryKeySelective(Recomactivity record);

    int updateByPrimaryKey(Recomactivity record);
}