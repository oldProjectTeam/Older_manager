package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Surgery;

 

public interface ISurgeryService {

	/**
	 * 查询所有手术记录
	 * @param surgery
	 * @return
	 * @throws Exception
	 */
	public List<Surgery>findAll(Surgery surgery)throws Exception;
	
	/**
	 * 添加手术信息
	 * @param disease
	 * @throws Exception
	 */
	public void insertSurgery(Surgery Surgery)throws Exception;
	
	/**
	 * 修改手术信息
	 * @param disease
	 * @throws Exception
	 */
	public void updateSurgery(Surgery surgery)throws Exception;
	
	/**
	 * 根据id获取手术信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Surgery findSurgery(Integer id)throws Exception;
	
	/**
	 * 删除手术信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteSurgery(Integer id)throws Exception;
}
