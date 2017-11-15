package com.older.manager.mapper;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.OldmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldmanMapper {
    int countByExample(OldmanExample example);

    int deleteByExample(OldmanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oldman record);

    int insertSelective(Oldman record);

    List<Oldman> selectByExample(OldmanExample example);

    Oldman selectByPrimaryKey(Integer id);
    
    Oldman selectBaseInfoById(int id);

    int updateByExampleSelective(@Param("record") Oldman record, @Param("example") OldmanExample example);

    int updateByExample(@Param("record") Oldman record, @Param("example") OldmanExample example);

    int updateByPrimaryKeySelective(Oldman record);

    int updateByPrimaryKey(Oldman record);
    
    List<Oldman> selectAllPhone();
    
    /**
     * @Title:   findOldmanId
     * @Description:  根据身份证返回id
     * @param:    @param idcar
     * @param:    @return   
     * @return:   int   
     * @throws
     */
    int findOldmanId(String idcar);
}