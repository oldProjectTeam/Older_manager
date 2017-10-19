package com.older.manager.mapper;

import com.older.manager.bean.Genetichistory;
import com.older.manager.bean.GenetichistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenetichistoryMapper {
    int countByExample(GenetichistoryExample example);

    int deleteByExample(GenetichistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Genetichistory record);

    int insertSelective(Genetichistory record);

    List<Genetichistory> selectByExample(GenetichistoryExample example);

    Genetichistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Genetichistory record, @Param("example") GenetichistoryExample example);

    int updateByExample(@Param("record") Genetichistory record, @Param("example") GenetichistoryExample example);

    int updateByPrimaryKeySelective(Genetichistory record);

    int updateByPrimaryKey(Genetichistory record);
}