package com.older.manager.service.oldfront;

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
	/**
	 * 批量删除
	 * @param ids
	 */
    public void deleteBatch(List<Integer> ids);
    
    /**
     * @Title:   findOldManPhone
     * @Description:  查询所有老人的电话信息
     * @param:    @return   
     * @return:   List<Oldman>   
     * @throws
     */
    public List<Oldman> findOldManPhone();
    
    /**
     * @Title:   findAllOldmansByName
     * @Description:  通过名字查询所有有关的老人
     * @param:    @param name
     * @param:    @return   
     * @return:   List<Oldman>   
     * @throws
     */
    public List<Oldman> findAllOldmansByName(String name);
    
    /**
     * @Title:   findOldManIdByCardId
     * @Description:  通过身份证号查找老人
     * @param:    @param carid
     * @param:    @return   
     * @return:   int   
     * @throws
     */
    public int findOldManIdByCardId(String carid);

}
