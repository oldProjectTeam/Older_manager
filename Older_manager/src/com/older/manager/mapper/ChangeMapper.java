package com.older.manager.mapper;

import com.older.manager.bean.Change;
import com.older.manager.bean.ChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangeMapper {
    int countByExample(ChangeExample example);

    int deleteByExample(ChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Change record);

    int insertSelective(Change record);

    List<Change> selectByExample(ChangeExample example);

    Change selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Change record, @Param("example") ChangeExample example);

    int updateByExample(@Param("record") Change record, @Param("example") ChangeExample example);

    int updateByPrimaryKeySelective(Change record);

    int updateByPrimaryKey(Change record);
}