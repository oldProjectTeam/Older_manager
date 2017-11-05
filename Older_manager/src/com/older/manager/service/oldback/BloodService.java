package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Bloodtransfusion;

/**
 * 输液列表
 * @author 疯癫
 *
 */
public interface BloodService {
     /**
      * 增加输液列表
      * @param bloodtransfusion
      */
	public void addBlood(Bloodtransfusion bloodtransfusion);
	/**
	 * 通过id删除
	 * @param id
	 */
	public void deleteBlood(Integer id);
	/**
	 * 修改
	 * @param bloodtransfusion
	 */
	public void updateBlood(Bloodtransfusion bloodtransfusion);
	/**
	 * 通过id来查询
	 * @param id
	 */
	public Bloodtransfusion selectBloodById(Integer id);
	/**
	 * 模糊查询
	 * @param bloodtransfusion
	 * @return
	 */
	public List<Bloodtransfusion> selectfAllBlood(Bloodtransfusion bloodtransfusion);
	
	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);
}
