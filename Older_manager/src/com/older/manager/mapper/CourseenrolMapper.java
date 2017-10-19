package com.older.manager.mapper;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.CourseenrolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseenrolMapper {
    int countByExample(CourseenrolExample example);

    int deleteByExample(CourseenrolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Courseenrol record);

    int insertSelective(Courseenrol record);

    List<Courseenrol> selectByExample(CourseenrolExample example);

    Courseenrol selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Courseenrol record, @Param("example") CourseenrolExample example);

    int updateByExample(@Param("record") Courseenrol record, @Param("example") CourseenrolExample example);

    int updateByPrimaryKeySelective(Courseenrol record);

    int updateByPrimaryKey(Courseenrol record);
}