package com.older.manager.service.oldback;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.older.manager.bean.Integral;
import com.older.manager.bean.Oldman;

public interface IIntegralService {

	/**
	 * 根据条件查询所有积分记录和关联的老人信息
	 * @param integral
	 * @return
	 */
	public List<Integral> queryAllIntegral(Integral integral);
	
	/**
	 * 根据Id删除积分记录
	 * @param id
	 */
	public void deleteIntegral(Integer id);
	
	/**
	 * 批量删除积分记录
	 * @param ids：id集合
	 */
	public void batchDeleteIntegral(List<Integer>ids);
	
	/**
	 * 查询所有不在积分表的老人信息
	 */
	public List<Oldman>selectOldManNotIntegral(Oldman oldman);
	
	/**
	 * 批量插入老人积分信息
	 * @param ids
	 */
	public void batchInsertIntegral(List<Integer>ids);
	
	/**
	 * @Title:   addIntegral
	 * @Description:  添加
	 * @param:    @param integral   
	 * @return:   void   
	 * @throws
	 */
	public int addIntegral(Integral integral);
	
	
}
