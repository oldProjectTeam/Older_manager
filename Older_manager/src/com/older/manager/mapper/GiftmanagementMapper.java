package com.older.manager.mapper;

import com.older.manager.bean.Giftmanagement;
import com.older.manager.bean.GiftmanagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftmanagementMapper {
    int countByExample(GiftmanagementExample example);

    int deleteByExample(GiftmanagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Giftmanagement record);

    int insertSelective(Giftmanagement record);
    
    /**
     * 根据条件查询所有礼品信息
     * @param giftmanagement
     * @return
     */
    public List<Giftmanagement>selectByCondiction(Giftmanagement giftmanagement);

    List<Giftmanagement> selectByExample(GiftmanagementExample example);

    Giftmanagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Giftmanagement record, @Param("example") GiftmanagementExample example);

    int updateByExample(@Param("record") Giftmanagement record, @Param("example") GiftmanagementExample example);

    int updateByPrimaryKeySelective(Giftmanagement record);

    int updateByPrimaryKey(Giftmanagement record);
}