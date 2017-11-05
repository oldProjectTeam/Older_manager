package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Surgery;

/**
 * 手术列表
 * @author 疯癫
 *
 */
public interface SurgeryService {
    /**
     * 增加手术列表
     * @param surgery
     */
	public  void  addSurgery(Surgery surgery);
	/**
	 * 删除
	 * @param id
	 */
	public void  deleteSurgery(Integer id);
	/**
	 * 修改
	 * @param surgerys
	 */
	public void  updateSurgery(Surgery surgerys);
	/**
	 * 查一条
	 * @param id
	 * @return
	 */
	public Surgery  selectSurgeryById(Integer id);
	/**
	 * 模糊查所有的
	 * @param surgery
	 * @return
	 */
	public List<Surgery> selectAllSurgery(Surgery surgery);
	   /**
		 * 批量删除
		 * @param ids
		 */
	    public void deleteBatch(List<Integer> ids);
	
}
