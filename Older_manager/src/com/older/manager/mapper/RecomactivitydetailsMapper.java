package com.older.manager.mapper;

import com.older.manager.bean.Recomactivitydetails;
import com.older.manager.bean.RecomactivitydetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecomactivitydetailsMapper {
    int countByExample(RecomactivitydetailsExample example);

    int deleteByExample(RecomactivitydetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recomactivitydetails record);

    int insertSelective(Recomactivitydetails record);

    List<Recomactivitydetails> selectByExample(RecomactivitydetailsExample example);

    Recomactivitydetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recomactivitydetails record, @Param("example") RecomactivitydetailsExample example);

    int updateByExample(@Param("record") Recomactivitydetails record, @Param("example") RecomactivitydetailsExample example);

    int updateByPrimaryKeySelective(Recomactivitydetails record);

    int updateByPrimaryKey(Recomactivitydetails record);
    
    Recomactivitydetails selectBaseRecomActivitydetails(Integer id);
    
    List<Recomactivitydetails> selectAllBaseRecomActivitydetails();
}