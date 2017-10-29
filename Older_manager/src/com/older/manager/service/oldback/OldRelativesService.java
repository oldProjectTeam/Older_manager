package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Relatives;



public interface OldRelativesService {

	
	/**
	 * 新增老人关系
	 * @param relatives
	 */
	public void addOlderRelative(Relatives relatives);
	
	/**
	 * 删除老人关系
	 * @param id
	 */
	public void  deleteOlderRelative(Integer id);
	
	/**
	 * 更新老人关系
	 * @param relatives
	 */
	public void  updateOlderRelative(Relatives relatives);
	
	/**
	 * 查看老人老人关系
	 * @param id
	 * @return
	 */
    public Relatives selectOlderRelative(Integer id);
    
    /**
     * 通过老人的id来查看这个老人所有的亲属关系
     * @param id
     * @return
     */
    public List<Relatives> selectOlderRelativesByOlderId(Integer id);
    /**
     * 查询所有老人关系
     * @return
     */
    public  List<Relatives> selectAllOlderRelative(); 
	/**
	 * 批量删除
	 * @param ids
	 */
    public void deleteBatch(List<Integer> ids);
}
