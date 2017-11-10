/**
 * 
 */
package com.older.manager.service.oldback;
import java.util.List;

import com.older.manager.bean.Recomactivitydetails;
/**
 * @author ym
 *
 */
public interface RecomActivityDetailsService {

	
	/**
	 * @Title:   addRecomActivityDetails
	 * @Description:  添加推荐活动明细表
	 * @param:    @param recomactivitydetails
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int addRecomActivityDetails(Recomactivitydetails recomactivitydetails);
	
	/**
	 * @Title:   deleteRecomactivitydetailsById
	 * @Description:  通过id删除推荐表
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int deleteRecomactivitydetailsById(int id);
	
	/**
	 * @Title:   modifyRecomactivitydetails
	 * @Description:  修改推荐活动表
	 * @param:    @param recomactivitydetails
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int modifyRecomactivitydetails(Recomactivitydetails recomactivitydetails);
	
	/**
	 * @Title:   findRecomactivitydetailsById
	 * @Description:  通过id查询推荐表
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Recomactivitydetails   
	 * @throws
	 */
	public Recomactivitydetails findRecomactivitydetailsById(int id);
	
	/**
	 * @Title:   findAllRecomactivitydetails
	 * @Description:  查询所有的推荐详细表
	 * @param:    @return   
	 * @return:   List<Recomactivitydetails>   
	 * @throws
	 */
	public List<Recomactivitydetails> findAllRecomactivitydetails();
	
	/**
	 * @Title:   findAllRecomactivitydetailsBySearch
	 * @Description:  通过搜索查询所有的推荐活动
	 * @param:    @param oldManName
	 * @param:    @param activityName
	 * @param:    @param result
	 * @param:    @return   
	 * @return:   List<Recomactivitydetails>   
	 * @throws
	 */
	public List<Recomactivitydetails> findAllRecomactivitydetailsBySearch(String oldManName,String activityName,String result);
	
	
	
}
