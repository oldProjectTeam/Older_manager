package com.older.manager.mapper;

import com.older.manager.bean.Integral;
import com.older.manager.bean.IntegralExample;
import com.older.manager.bean.Oldman;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
    int countByExample(IntegralExample example);

    int deleteByExample(IntegralExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Integral record);

    int insertSelective(Integral record);

    List<Integral> selectByExample(IntegralExample example);

    /**
     * 根据条件查询所有积分信息和关联的老人信息
     * @param integral
     * @return
     */
    public List<Integral>selectIntegralAndOldmanByCondition(Integral integral);
    
    /**
     * 查询所有不在积分表的老人信息
     * @param oldman
     * @return
     */
    public List<Oldman>selectOldManNotIntegral(Oldman oldman);
    
    Integral selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByExample(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}