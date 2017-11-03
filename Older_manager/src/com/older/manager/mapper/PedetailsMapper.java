package com.older.manager.mapper;

import com.older.manager.bean.Pedetails;
import com.older.manager.bean.PedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PedetailsMapper {
    int countByExample(PedetailsExample example);

    int deleteByExample(PedetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pedetails record);

    int insertSelective(Pedetails record);

    List<Pedetails> selectByExample(PedetailsExample example);

    Pedetails selectByPrimaryKey(Integer id);
    
    
    
    //模糊查询
    List<Pedetails> selectByExampleWithOldAndPe(Pedetails pedetails);
    Pedetails selectByPrimaryKeyWithOldAndPe(Integer id);
    

    int updateByExampleSelective(@Param("record") Pedetails record, @Param("example") PedetailsExample example);

    int updateByExample(@Param("record") Pedetails record, @Param("example") PedetailsExample example);

    int updateByPrimaryKeySelective(Pedetails record);

    int updateByPrimaryKey(Pedetails record);
}