package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Disease;

public interface IDiseaseService {

	/**
	 * 查询所有老人疾病信息
	 * @param oldmanId
	 * @return
	 * @throws Exception
	 */
	public List<Disease>findAll(Disease disease)throws Exception;
	
	/**
	 * 添加疾病信息
	 * @param disease
	 * @throws Exception
	 */
	public void insertDisease(Disease disease)throws Exception;
	
	/**
	 * 修改疾病信息
	 * @param disease
	 * @throws Exception
	 */
	public void updateDiseae(Disease disease)throws Exception;
	
	/**
	 * 根据id获取疾病信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Disease findDisease(Integer id)throws Exception;
	
	/**
	 * 删除疾病信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteDisease(Integer id)throws Exception;
}
