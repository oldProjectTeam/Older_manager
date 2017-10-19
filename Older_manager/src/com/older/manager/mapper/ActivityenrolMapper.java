package com.older.manager.mapper;

import com.older.manager.bean.Activityenrol;
import com.older.manager.bean.ActivityenrolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityenrolMapper {
    int countByExample(ActivityenrolExample example);

    int deleteByExample(ActivityenrolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activityenrol record);

    int insertSelective(Activityenrol record);

    List<Activityenrol> selectByExample(ActivityenrolExample example);

    Activityenrol selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activityenrol record, @Param("example") ActivityenrolExample example);

    int updateByExample(@Param("record") Activityenrol record, @Param("example") ActivityenrolExample example);

    int updateByPrimaryKeySelective(Activityenrol record);

    int updateByPrimaryKey(Activityenrol record);
}