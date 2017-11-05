package com.older.manager.mapper;

import com.older.manager.bean.Assess;
import com.older.manager.bean.AssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessMapper {
    int countByExample(AssessExample example);

    int deleteByExample(AssessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assess record);

    int insertSelective(Assess record);
          
    List<Assess> selectByExample(AssessExample example);

    Assess selectByPrimaryKey(Integer id);
    
    
    //模糊查询
    List<Assess> selectByExampleWithOlder(Assess assess);

    Assess selectByPrimaryKeyWithOlder(Integer id);
    
    

    int updateByExampleSelective(@Param("record") Assess record, @Param("example") AssessExample example);

    int updateByExample(@Param("record") Assess record, @Param("example") AssessExample example);

    int updateByPrimaryKeySelective(Assess record);

    int updateByPrimaryKey(Assess record);
}