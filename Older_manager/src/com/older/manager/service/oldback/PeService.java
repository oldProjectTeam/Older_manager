package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Pedetails;
import com.older.manager.bean.Peinfo;

/**
 * 体检记录
 * @author 疯癫
 *
 */
public interface PeService {
	/**
	 * 增加体检信息
	 * @param pedetails
	 */
	public void addPe(Pedetails pedetails);
	
	/**
	 * 增加体检信息表
	 * @param peinfo
	 */
	public  void  addPeInfo(Peinfo peinfo);
	
	/**
	 * 删除体检信息
	 * @param id
	 */
	public void deletePe(Integer id);
	
	/**
	 * 修改体检信息
	 * @param pedetails
	 */
	public void  updatePe(Pedetails pedetails);
	/**
	 * 修改体检信息
	 * @param peinfo
	 */
	public void  updatePeInfo(Peinfo peinfo);
	/**
	 * t通过id来查
	 * @param id
	 */
	public Pedetails  selectPeById(Integer id);
    /**
     * 模糊查询
     * @param pedetails
     * @return
     */
	public List<Pedetails> selectAllPe(Pedetails pedetails);
	
	   /**
		 * 批量删除
		 * @param ids
		 */
	    public void deleteBatch(List<Integer> ids);
	    
}
