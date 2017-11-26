package com.older.manager.mapper;

import com.older.manager.bean.Takeactivity;
import com.older.manager.bean.TakeactivityExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TakeactivityMapper {
    int countByExample(TakeactivityExample example);

    int deleteByExample(TakeactivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Takeactivity record);

    int insertSelective(Takeactivity record);

    List<Takeactivity> selectByExample(TakeactivityExample example);
    
    List<Takeactivity> selectByExampleWithOldmanAndActivity(Takeactivity takeactivity);
    
    Takeactivity selectByPrimaryKey(Integer id);
    Takeactivity selectByPrimaryKeyWithOldmanAndActivity(Integer id);
    int updateByExampleSelective(@Param("record") Takeactivity record, @Param("example") TakeactivityExample example);

    int updateByExample(@Param("record") Takeactivity record, @Param("example") TakeactivityExample example);

    int updateByPrimaryKeySelective(Takeactivity record);

    int updateByPrimaryKey(Takeactivity record);

    
    /**
     * @Title: selectTakeactivityBysearchActivityTime
     * @Description: 通过时间查询包含老人和活动的参加活动集合数据
     * @param @param takeactivity
     * @param @return   
     * @return List<Takeactivity>  
     * @throws
     * @author ym
     * @date 2017年11月26日 上午11:02:32
     */
    List<Takeactivity> selectTakeactivityBysearchActivityTime(Takeactivity takeactivity);

	
}