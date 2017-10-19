package com.older.manager.mapper;

import com.older.manager.bean.Familyhistory;
import com.older.manager.bean.FamilyhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyhistoryMapper {
    int countByExample(FamilyhistoryExample example);

    int deleteByExample(FamilyhistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Familyhistory record);

    int insertSelective(Familyhistory record);

    List<Familyhistory> selectByExample(FamilyhistoryExample example);

    Familyhistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Familyhistory record, @Param("example") FamilyhistoryExample example);

    int updateByExample(@Param("record") Familyhistory record, @Param("example") FamilyhistoryExample example);

    int updateByPrimaryKeySelective(Familyhistory record);

    int updateByPrimaryKey(Familyhistory record);
}