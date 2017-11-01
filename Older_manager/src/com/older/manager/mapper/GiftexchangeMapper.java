package com.older.manager.mapper;

import com.older.manager.bean.Giftexchange;
import com.older.manager.bean.GiftexchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftexchangeMapper {
    int countByExample(GiftexchangeExample example);

    int deleteByExample(GiftexchangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Giftexchange record);

    int insertSelective(Giftexchange record);

    List<Giftexchange> selectByExample(GiftexchangeExample example);

    /**
     * 模糊查询所有礼品兑换记录，关联老人账户表，老人信息表、礼品信息表
     * @param giftexchange
     * @return
     */
    List<Giftexchange>selectGiftExchangeAndOldmanByCondition(Giftexchange giftexchange);
    
    Giftexchange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Giftexchange record, @Param("example") GiftexchangeExample example);

    int updateByExample(@Param("record") Giftexchange record, @Param("example") GiftexchangeExample example);

    int updateByPrimaryKeySelective(Giftexchange record);

    int updateByPrimaryKey(Giftexchange record);
}