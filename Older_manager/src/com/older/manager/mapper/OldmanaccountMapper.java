package com.older.manager.mapper;

import com.older.manager.bean.Oldmanaccount;
import com.older.manager.bean.OldmanaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldmanaccountMapper {
    int countByExample(OldmanaccountExample example);

    int deleteByExample(OldmanaccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oldmanaccount record);

    int insertSelective(Oldmanaccount record);

    List<Oldmanaccount> selectByExample(OldmanaccountExample example);

    Oldmanaccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Oldmanaccount record, @Param("example") OldmanaccountExample example);

    int updateByExample(@Param("record") Oldmanaccount record, @Param("example") OldmanaccountExample example);

    int updateByPrimaryKeySelective(Oldmanaccount record);

    int updateByPrimaryKey(Oldmanaccount record);
}