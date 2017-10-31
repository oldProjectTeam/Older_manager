package com.older.manager.mapper;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.bean.OldmanaccountExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OldmanaccountMapper {
    int countByExample(OldmanaccountExample example);

    int deleteByExample(OldmanaccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oldmanaccount record);

    int insertSelective(Oldmanaccount record);
    
    /**
     * 查询所有账户信息和关联的老人信息
     * @param oldmanaccount
     * @return
     */
   List<Oldmanaccount> selectAccountAndOldmanByCondiction(Oldmanaccount oldmanaccount);

    List<Oldmanaccount> selectByExample(OldmanaccountExample example);

    Oldmanaccount selectByPrimaryKey(Integer id);
    
    /**
     * 查询不在账户表的所有老人信息
     * @param oldman
     * @return
     */
    List<Oldman> selectOldManNotAccount(Oldman oldman);

    int updateByExampleSelective(@Param("record") Oldmanaccount record, @Param("example") OldmanaccountExample example);

    int updateByExample(@Param("record") Oldmanaccount record, @Param("example") OldmanaccountExample example);

    int updateByPrimaryKeySelective(Oldmanaccount record);

    int updateByPrimaryKey(Oldmanaccount record);
}