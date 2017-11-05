package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Disease;

/**
 * 疾病列表
 * @author 疯癫
 *
 */
public interface DiseaseService {
    /**
     * 增加疾病列表
     * @param disease
     */
	public void addDisease(Disease disease);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteDisease(Integer id);
	/**
	 * 修改
	 * @param disease
	 */
	public  void updateDisease(Disease disease);
	/**
	 * 通过id查一条
	 * @param id
	 * @return
	 */
	public  Disease selectDisease(Integer id);
	
	/***
	 * 模糊查询
	 * @param disease
	 * @return
	 */
	public List<Disease> selectAllDiseases(Disease disease);
	
	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);
}
