package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Visitplan;

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

}
