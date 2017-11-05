package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Assess;
/**
 * 健康评估
 * @author 疯癫
 *
 */
public interface HealthAssessService {

/**
 * 增加	
 * @param assess
 */
public void addHealthAssess(Assess assess);	
/**
 * 删除	
 * @param id
 */
public void  deleteHealthAssess(Integer id);

/**
 * 改
 * @param assess
 */
public  void updateHealthAssess(Assess assess);
/**
 * 通过id查找
 * @param id
 * @return
 */
public Assess selectHealthAssess(Integer id);
/**
 * 模糊查询所有的
 * @param assess
 * @return
 */
public List<Assess> selectAllHealthAssess(Assess assess);
/**
	 * 批量删除
	 * @param ids
	 */
   public void deleteBatch(List<Integer> ids);
}
