package com.older.manager.mapper;

import com.older.manager.bean.Usehealthproductdetails;
import com.older.manager.bean.UsehealthproductdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsehealthproductdetailsMapper {
    int countByExample(UsehealthproductdetailsExample example);

    int deleteByExample(UsehealthproductdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usehealthproductdetails record);

    int insertSelective(Usehealthproductdetails record);

    List<Usehealthproductdetails> selectByExample(UsehealthproductdetailsExample example);

    Usehealthproductdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usehealthproductdetails record, @Param("example") UsehealthproductdetailsExample example);

    int updateByExample(@Param("record") Usehealthproductdetails record, @Param("example") UsehealthproductdetailsExample example);

    int updateByPrimaryKeySelective(Usehealthproductdetails record);

    int updateByPrimaryKey(Usehealthproductdetails record);
}