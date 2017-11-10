/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Activity;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Recomactivity;
import com.older.manager.bean.Recomactivitydetails;
import com.older.manager.mapper.ActivityMapper;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.mapper.RecomactivityMapper;
import com.older.manager.mapper.RecomactivitydetailsMapper;
import com.older.manager.service.oldback.RecomActivityDetailsService;

/**
 * @author ym
 * 
 */
@Service
public class RecomActivityDetailsServiceImpl implements
		RecomActivityDetailsService {

	@Autowired
	RecomactivitydetailsMapper recomactivitydetailsMapper;

	@Autowired
	OldmanMapper oldmanMapper;

	@Autowired
	RecomactivityMapper recomactivityMapper;

	@Autowired
	ActivityMapper activityMapper;

	/**
	 * @Title: addRecomActivityDetails
	 * @Description: 添加活动推荐详细表
	 * @param: @param recomactivitydetails
	 * @param: @return
	 * @throws
	 */
	@Override
	public int addRecomActivityDetails(Recomactivitydetails recomactivitydetails) {
		return recomactivitydetailsMapper.insertSelective(recomactivitydetails);
	}

	/**
	 * @Title: deleteRecomactivitydetailsById
	 * @Description: 通过id删除活动详细表
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public int deleteRecomactivitydetailsById(int id) {
		return recomactivitydetailsMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title: modifyRecomactivitydetails
	 * @Description: 修改活动详细表
	 * @param: @param recomactivitydetails
	 * @param: @return
	 * @throws
	 */
	@Override
	public int modifyRecomactivitydetails(
			Recomactivitydetails recomactivitydetails) {
		return recomactivitydetailsMapper
				.updateByPrimaryKeySelective(recomactivitydetails);
	}

	/**
	 * @Title: findRecomactivitydetailsById
	 * @Description: 通过id查询活动详细表
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Recomactivitydetails findRecomactivitydetailsById(int id) {
		return recomactivitydetailsMapper.selectBaseRecomActivitydetails(id);
	}

	/**
	 * @Title: findAllRecomactivitydetails
	 * @Description: 查询所有的活动详细表
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Recomactivitydetails> findAllRecomactivitydetails() {
		return recomactivitydetailsMapper.selectAllBaseRecomActivitydetails();
	}

	/**
	 * @Title: findAllRecomactivitydetailsBySearch
	 * @Description: 通过搜索查询所有的推荐活动详细表
	 * @param: @param oldManName
	 * @param: @param activityName
	 * @param: @param result
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Recomactivitydetails> findAllRecomactivitydetailsBySearch(
			String oldManName, String activityName, String result) {
		Recomactivitydetails recomactivitydetails = new Recomactivitydetails();
		Activity activity = new Activity();
		activity.setTitle(activityName);
		Recomactivity recomactivity = new Recomactivity();
		recomactivity.setActivity(activity);
		if (result.equals("请选择")) {
			//recomactivitydetails.setResult(null);
			recomactivity.setState(null);
			recomactivitydetails.setRecomactivity(null);
		} else {
			recomactivity.setState(result);
			//recomactivitydetails.setResult(result);
			recomactivitydetails.setRecomactivity(recomactivity);
		}
		;
		Oldman oldman = new Oldman();
		oldman.setName(oldManName);
		recomactivitydetails.setOldman(oldman);

		return recomactivitydetailsMapper
				.selectByRecomactivitydetails(recomactivitydetails);
	}

}
