package com.older.manager.mapper;

import com.older.manager.bean.Bloodtransfusion;
import com.older.manager.bean.BloodtransfusionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodtransfusionMapper {
    int countByExample(BloodtransfusionExample example);

    int deleteByExample(BloodtransfusionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bloodtransfusion record);

    int insertSelective(Bloodtransfusion record);

    List<Bloodtransfusion> selectByExample(BloodtransfusionExample example);

    Bloodtransfusion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bloodtransfusion record, @Param("example") BloodtransfusionExample example);

    int updateByExample(@Param("record") Bloodtransfusion record, @Param("example") BloodtransfusionExample example);

    int updateByPrimaryKeySelective(Bloodtransfusion record);

    int updateByPrimaryKey(Bloodtransfusion record);
}