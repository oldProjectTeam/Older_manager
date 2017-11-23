package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Bloodtransfusion;
 

public interface IBloodtransfusionService {


	/**
	 * 根据老人id查询所有输血记录
	 * @param bloodtransfusion
	 * @return
	 * @throws Exception
	 */
	public List<Bloodtransfusion>findAll(Bloodtransfusion bloodtransfusion)throws Exception;
	
	/**
	 * 添加输血信息
	 * @param bloodtransfusion
	 * @throws Exception
	 */
	public void insertBloodtransfusion(Bloodtransfusion bloodtransfusion)throws Exception;
	
	/**
	 * 修改输血信息
	 * @param  bloodtransfusion
	 * @throws Exception
	 */
	public void updateBloodtransfusion(Bloodtransfusion bloodtransfusion)throws Exception;
	
	/**
	 * 根据id获取输血信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Bloodtransfusion findBloodtransfusion(Integer id)throws Exception;
	
	/**
	 * 删除输血信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteBloodtransfusion(Integer id)throws Exception;
}
