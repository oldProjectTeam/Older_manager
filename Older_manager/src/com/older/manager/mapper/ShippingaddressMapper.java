package com.older.manager.mapper;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShippingaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingaddressMapper {
    int countByExample(ShippingaddressExample example);

    int deleteByExample(ShippingaddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shippingaddress record);

    int insertSelective(Shippingaddress record);

    List<Shippingaddress> selectByExample(ShippingaddressExample example);

    Shippingaddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shippingaddress record, @Param("example") ShippingaddressExample example);

    int updateByExample(@Param("record") Shippingaddress record, @Param("example") ShippingaddressExample example);

    int updateByPrimaryKeySelective(Shippingaddress record);

    int updateByPrimaryKey(Shippingaddress record);
    
    /**
     * @Title:   selectByUserId
     * @Description:  通过用户id查询当前使用的地址
     * @param:    @param userid
     * @param:    @return   
     * @return:   Shippingaddress   
     * @throws
     */
    Shippingaddress selectByUserId(Integer userid);
    
    
    
    //自己修改的
    List<Shippingaddress> selectByExampleWithUsers(Shippingaddress shippingaddress);
    Shippingaddress selectByPrimaryKeyWithUsers(Integer id);
  
    Shippingaddress selectByPrimaryKeyWithState(Integer id);
}