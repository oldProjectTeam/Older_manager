package com.older.manager.mapper;

import com.older.manager.bean.Disease;
import com.older.manager.bean.DiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiseaseMapper {
    int countByExample(DiseaseExample example);

    int deleteByExample(DiseaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    int insertSelective(Disease record);

    List<Disease> selectByExample(DiseaseExample example);

    Disease selectByPrimaryKey(Integer id);
    
    //模糊查询
    List<Disease> selectByExampleWithOlder(Disease disease);

    Disease selectByPrimaryKeyWithOlder(Integer id);
    
    

    int updateByExampleSelective(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByExample(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}