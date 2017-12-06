package com.older.manager.mapper;

import com.older.manager.bean.Orders;
import com.older.manager.bean.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
  /**
     * @Title:   selectProductsCountByUsersId
     * @Description:  通过用户id查询所有的订单总数
     * @param:    @param userId
     * @param:    @return   
     * @return:   int   
     * @throws
     */
    int selectProductsCountByUsersId(Integer userId);
    
    /**
     * 根据订单编号查询订单信息和收货地址信息
     * @param orderNo
     * @return
     */
    Orders selectWithAddressByOrderNo(String orderNo);
    
    /**
     * 根据id查询订单信息和订单详细信息和产品信息
     * @param id
     * @return
     */
    Orders selectOrderWithDetailById(Integer id);

    /**
     * 通过用户id查询用户所有未确定收货订单
     * @param order
     * @return
     */
	List<Orders> orderListByState(Orders order);
}