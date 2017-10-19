package com.older.manager.mapper;

import com.older.manager.bean.Userroles;
import com.older.manager.bean.UserrolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrolesMapper {
    int countByExample(UserrolesExample example);

    int deleteByExample(UserrolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userroles record);

    int insertSelective(Userroles record);

    List<Userroles> selectByExample(UserrolesExample example);

    Userroles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userroles record, @Param("example") UserrolesExample example);

    int updateByExample(@Param("record") Userroles record, @Param("example") UserrolesExample example);

    int updateByPrimaryKeySelective(Userroles record);

    int updateByPrimaryKey(Userroles record);
}