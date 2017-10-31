package com.older.manager.service.oldback;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Takeactivity;
/**
 * 参加活动的记录
 * @author 疯癫
 *
 */
public interface CustomerActivityService {

	/**
	 * 新增参加活动记录
	 * @param takeactivity
	 */
	public void addTakeactivity(Takeactivity takeactivity);
	
	
	/**
	 * 删除
	 * @param id
	 */
	public void  deleteTakeactivity(Integer id);
	

	/**
	 * 更新活动记录
	 * @param takeactivity
	 */
	public void updateTakeactivity(Takeactivity takeactivity);

    /**
     * 查看参加活动记录
     * @param id
     * @return
     */
    public Takeactivity selectTakeactivityById(Integer id);
    
  
   /**
    * 查看所有的活动记录 
    * @return
    */
    public List<Takeactivity> selectAllTakeactivitys();
    /**
     * 模糊查询所有
     * @param str
     * @return
     */
    public List<Takeactivity> selectAllTakeactivitysWith(Takeactivity takeactivity);


	public void deleteBatch(List<Integer> del_ids);
}
