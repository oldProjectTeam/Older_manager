package com.older.manager.mapper;

import com.older.manager.bean.Adslist;
import com.older.manager.bean.AdslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdslistMapper {
    int countByExample(AdslistExample example);

    int deleteByExample(AdslistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Adslist record);

    int insertSelective(Adslist record);

    List<Adslist> selectByExample(AdslistExample example);

    Adslist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Adslist record, @Param("example") AdslistExample example);

    int updateByExample(@Param("record") Adslist record, @Param("example") AdslistExample example);

    int updateByPrimaryKeySelective(Adslist record);

    int updateByPrimaryKey(Adslist record);
}