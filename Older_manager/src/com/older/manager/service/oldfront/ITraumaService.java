package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Trauma;

 

public interface ITraumaService {

	/**
	 * 查询所有老人外伤信息
	 * @param oldmanId
	 * @return
	 * @throws Exception
	 */
	public List<Trauma>findAll(Trauma trauma)throws Exception;
	
	/**
	 * 添加外伤信息
	 * @param disease
	 * @throws Exception
	 */
	public void insertTrauma(Trauma trauma)throws Exception;
	
	/**
	 * 修改外伤信息
	 * @param disease
	 * @throws Exception
	 */
	public void updateTrauma(Trauma trauma)throws Exception;
	
	/**
	 * 根据id获取外伤信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Trauma findTrauma(Integer id)throws Exception;
	
	/**
	 * 删除外伤信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteTrauma(Integer id)throws Exception;
}
