package com.older.manager.mapper;

import com.older.manager.bean.Surgery;
import com.older.manager.bean.SurgeryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurgeryMapper {
    int countByExample(SurgeryExample example);

    int deleteByExample(SurgeryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Surgery record);

    int insertSelective(Surgery record);

    List<Surgery> selectByExample(SurgeryExample example);

    Surgery selectByPrimaryKey(Integer id);
    //模糊查询
    List<Surgery> selectByExampleWithOlder(Surgery surgery);

    Surgery selectByPrimaryKeyWithOlder(Integer id);
    
    
    
    int updateByExampleSelective(@Param("record") Surgery record, @Param("example") SurgeryExample example);

    int updateByExample(@Param("record") Surgery record, @Param("example") SurgeryExample example);

    int updateByPrimaryKeySelective(Surgery record);

    int updateByPrimaryKey(Surgery record);
}