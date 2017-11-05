/**
 * 
 */
package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Recomactivity;

/**
 * @author ym
 *
 */
public interface RecomActivityService {

	/**
	 * @Title:   findRecomactivityById
	 * @Description:  通过id查询推荐活动表
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Recomactivity   
	 * @throws
	 */
	public Recomactivity findRecomactivityById(int id);
	
	/**
	 * @Title:   findRecomactivityIncludeActivityById
	 * @Description:  接收包含活动的推荐活动
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Recomactivity   
	 * @throws
	 */
	public Recomactivity findRecomactivityIncludeActivityById(int id);
	
	/**
	 * @Title:   findAllRecomactivities
	 * @Description:  查询所有的推荐表
	 * @param:    @return   
	 * @return:   List<Recomactivity>   
	 * @throws
	 */
	public List<Recomactivity> findAllRecomactivities();
	
	/**
	 * @Title:   findAllRecomactivitiesBySearch
	 * @Description:  通过搜索查找活动推荐
	 * @param:    @param oldManName
	 * @param:    @param type
	 * @param:    @return   
	 * @return:   List<Recomactivity>   
	 * @throws
	 */
	public List<Recomactivity> findAllRecomactivitiesBySearch(String oldManName,String type);
	
	/**
	 * @Title:   addRecomactivity
	 * @Description:  添加活动推荐表
	 * @param:    @param recomactivity
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int addRecomactivity(Recomactivity recomactivity);
	
	/**
	 * @Title:   modifyRecomactivity
	 * @Description:  修改推荐活动
	 * @param:    @param recomactivity
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int modifyRecomactivity(Recomactivity recomactivity);
	
	/**
	 * @Title:   deleteRecomactivityById
	 * @Description:  通过id删除活动表
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int deleteRecomactivityById(int id);
	
	
	
}
