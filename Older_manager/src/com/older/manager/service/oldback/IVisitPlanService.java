package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Visitplan;

/**
 * 再次编写：杨明 编写内容：添加查询接口,修改接口
 *
 */
public interface IVisitPlanService {

	/**
	 * 查询回访记录
	 * @param str
	 * @return
	 */
	List<Visitplan> selectAllOldBackPlan(String str);

	/**
	 * 批量删除
	 * @param del_ids
	 */
	void deleteBatch(List<Integer> del_ids);

	/**
	 * 删除单个
	 * @param id
	 */
	void deletePlan(Integer id);

	/**
	 * 通过ID查询回访计划
	 * @param id
	 * @return
	 */
	Visitplan selectVisitPlanById(Integer id);

	/**
	 * 新增回访计划
	 * @param visitplan
	 */
	void addVisitPlan(Visitplan visitplan);
	
	/**
	 * @Title:   findAllVisitplansBySearch
	 * @Description:  通过搜索查询所有的回访计划
	 * @param:    @param visitPeaplo
	 * @param:    @param days
	 * @param:    @return   
	 * @return:   List<Visitplan>   
	 * @throws
	 */
	List<Visitplan> findAllVisitplansBySearch(String visitPeaplo,String days);

	
	/**
	 * @Title:   findAllVisitplans
	 * @Description:  查询所有的回访计划表
	 * @param:    @return   
	 * @return:   List<Visitplan>   
	 * @throws
	 */
	List<Visitplan> findAllVisitplans();
	
	/**
	 * @Title:   modifyVisitPlan
	 * @Description:  修改回访计划
	 * @param:    @param visitplan
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int modifyVisitPlan(Visitplan visitplan);
}
