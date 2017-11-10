package com.older.manager.mapper;

import com.older.manager.bean.Visitplan;
import com.older.manager.bean.VisitplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitplanMapper {
    int countByExample(VisitplanExample example);

    int deleteByExample(VisitplanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Visitplan record);

    int insertSelective(Visitplan record);

    List<Visitplan> selectByExample(VisitplanExample example);
    
    /**
     * @Title:   selectByExample2
     * @Description:  
     * @param:    @param example
     * @param:    @return   
     * @return:   List<Visitplan>   包含老人详细信息的集合
     * @throws
     */
    List<Visitplan> selectByExample2(VisitplanExample example);

    Visitplan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Visitplan record, @Param("example") VisitplanExample example);

    int updateByExample(@Param("record") Visitplan record, @Param("example") VisitplanExample example);

    int updateByPrimaryKeySelective(Visitplan record);

    int updateByPrimaryKey(Visitplan record);
}