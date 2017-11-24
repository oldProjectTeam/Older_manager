package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Genetichistory;

 

public interface IGenetichistoryService {

	/**
	 * 根据老人id查询老人所有遗传信息
	 * @param oldmanId
	 * @return
	 * @throws Exception
	 */
	public List<Genetichistory>findAll(Genetichistory genetichistory)throws Exception;
	
	/**
	 * 添加遗传信息
	 * @param genetichistory
	 * @throws Exception
	 */
	public void insertGenetichistory(Genetichistory genetichistory)throws Exception;
	
	/**
	 * 修改遗传信息
	 * @param genetichistory
	 * @throws Exception
	 */
	public void updateGenetichistory(Genetichistory genetichistory)throws Exception;
	
	/**
	 * 根据id获取遗传信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Genetichistory findGenetichistory(Integer id)throws Exception;
	
	/**
	 * 删除遗传信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteGenetichistory(Integer id)throws Exception;
}
