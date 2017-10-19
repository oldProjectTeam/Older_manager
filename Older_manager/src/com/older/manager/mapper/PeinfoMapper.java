package com.older.manager.mapper;

import com.older.manager.bean.Peinfo;
import com.older.manager.bean.PeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeinfoMapper {
    int countByExample(PeinfoExample example);

    int deleteByExample(PeinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Peinfo record);

    int insertSelective(Peinfo record);

    List<Peinfo> selectByExample(PeinfoExample example);

    Peinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Peinfo record, @Param("example") PeinfoExample example);

    int updateByExample(@Param("record") Peinfo record, @Param("example") PeinfoExample example);

    int updateByPrimaryKeySelective(Peinfo record);

    int updateByPrimaryKey(Peinfo record);
}