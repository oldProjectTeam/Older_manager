package com.older.manager.mapper;

import com.older.manager.bean.Shoppingcart;
import com.older.manager.bean.ShoppingcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcartMapper {
    int countByExample(ShoppingcartExample example);

    int deleteByExample(ShoppingcartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    List<Shoppingcart> selectByExample(ShoppingcartExample example);

    Shoppingcart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shoppingcart record, @Param("example") ShoppingcartExample example);

    int updateByExample(@Param("record") Shoppingcart record, @Param("example") ShoppingcartExample example);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);
}