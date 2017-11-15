package com.older.manager.mapper;

import com.older.manager.bean.ShopMember;
import com.older.manager.bean.ShopMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMemberMapper {
    int countByExample(ShopMemberExample example);

    int deleteByExample(ShopMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopMember record);

    int insertSelective(ShopMember record);

    List<ShopMember> selectByExample(ShopMemberExample example);

    ShopMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopMember record, @Param("example") ShopMemberExample example);

    int updateByExample(@Param("record") ShopMember record, @Param("example") ShopMemberExample example);

    int updateByPrimaryKeySelective(ShopMember record);

    int updateByPrimaryKey(ShopMember record);
    
    List<ShopMember> selectByShopMember(ShopMember shopMember);
}