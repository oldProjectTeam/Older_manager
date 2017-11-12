package com.older.manager.mapper;

import com.older.manager.bean.Sortads;
import com.older.manager.bean.SortadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SortadsMapper {
    int countByExample(SortadsExample example);

    int deleteByExample(SortadsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sortads record);

    int insertSelective(Sortads record);

    List<Sortads> selectByExample(SortadsExample example);

    Sortads selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sortads record, @Param("example") SortadsExample example);

    int updateByExample(@Param("record") Sortads record, @Param("example") SortadsExample example);

    int updateByPrimaryKeySelective(Sortads record);

    int updateByPrimaryKey(Sortads record);
}