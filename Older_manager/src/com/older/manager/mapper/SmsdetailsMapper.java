package com.older.manager.mapper;

import com.older.manager.bean.Smsdetails;
import com.older.manager.bean.SmsdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsdetailsMapper {
    int countByExample(SmsdetailsExample example);

    int deleteByExample(SmsdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Smsdetails record);

    int insertSelective(Smsdetails record);

    List<Smsdetails> selectByExample(SmsdetailsExample example);

    Smsdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Smsdetails record, @Param("example") SmsdetailsExample example);

    int updateByExample(@Param("record") Smsdetails record, @Param("example") SmsdetailsExample example);

    int updateByPrimaryKeySelective(Smsdetails record);

    int updateByPrimaryKey(Smsdetails record);
}