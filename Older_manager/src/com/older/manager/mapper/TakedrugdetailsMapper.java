package com.older.manager.mapper;

import com.older.manager.bean.Takedrugdetails;
import com.older.manager.bean.TakedrugdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakedrugdetailsMapper {
    int countByExample(TakedrugdetailsExample example);

    int deleteByExample(TakedrugdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Takedrugdetails record);

    int insertSelective(Takedrugdetails record);

    List<Takedrugdetails> selectByExample(TakedrugdetailsExample example);

    Takedrugdetails selectByPrimaryKey(Integer id);
    
    
    //修改够的模糊查询
    List<Takedrugdetails> selectByExampleWithOlder(Takedrugdetails takedrugdetails);

    Takedrugdetails selectByPrimaryKeyWithOlder(Integer id);
    
    

    int updateByExampleSelective(@Param("record") Takedrugdetails record, @Param("example") TakedrugdetailsExample example);

    int updateByExample(@Param("record") Takedrugdetails record, @Param("example") TakedrugdetailsExample example);

    int updateByPrimaryKeySelective(Takedrugdetails record);

    int updateByPrimaryKey(Takedrugdetails record);
}