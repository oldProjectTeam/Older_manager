package com.older.manager.mapper;

import com.older.manager.bean.Changesale;
import com.older.manager.bean.ChangesaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangesaleMapper {
    int countByExample(ChangesaleExample example);

    int deleteByExample(ChangesaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Changesale record);

    int insertSelective(Changesale record);

    List<Changesale> selectByExample(ChangesaleExample example);

    Changesale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Changesale record, @Param("example") ChangesaleExample example);

    int updateByExample(@Param("record") Changesale record, @Param("example") ChangesaleExample example);

    int updateByPrimaryKeySelective(Changesale record);

    int updateByPrimaryKey(Changesale record);
}