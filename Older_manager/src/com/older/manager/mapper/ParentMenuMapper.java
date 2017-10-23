package com.older.manager.mapper;

import com.older.manager.bean.ParentMenu;
import com.older.manager.bean.ParentMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentMenuMapper {
    int countByExample(ParentMenuExample example);

    int deleteByExample(ParentMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParentMenu record);

    int insertSelective(ParentMenu record);

    List<ParentMenu> selectByExample(ParentMenuExample example);

    ParentMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParentMenu record, @Param("example") ParentMenuExample example);

    int updateByExample(@Param("record") ParentMenu record, @Param("example") ParentMenuExample example);

    int updateByPrimaryKeySelective(ParentMenu record);

    int updateByPrimaryKey(ParentMenu record);
}