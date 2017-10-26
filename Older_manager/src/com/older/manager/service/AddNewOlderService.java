package com.older.manager.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Oldman;




/**
 * 新增老人
 * @author 疯癫
 *
 */

public interface AddNewOlderService {
 
	/**
	 * 新增老人
	 * @param oldman
	 */
	public void addNewOlder(Oldman oldman);
	
	/**
	 * 删除老人
	 * @param id
	 */
	public void  deleteOlder(Integer id);
	
	/**
	 * 更新老人
	 * @param oldman
	 */
	public void  updateOlder(Oldman oldman);
	
	/**
	 * 查看老人
	 * @param id
	 * @return
	 */
    public Oldman selectOlder(Integer id);
    
    /**
     * 查询所有老人
     * @return
     */
    public  List<Oldman> selectAllOlder(); 
    /**
     * 模糊查询所有老人
     * @param str
     * @return
     */
    public  List<Oldman> selectAllOlderWith(String str);
	/**
	 * 批量导入老人数据
	 * @param name
	 * @param file
	 * @return
	 */
	public boolean batchImport(String name, MultipartFile file);
	
}
