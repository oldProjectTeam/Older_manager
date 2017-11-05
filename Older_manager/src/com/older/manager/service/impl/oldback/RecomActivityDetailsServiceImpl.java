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
		/*List<Recomactivitydetails> allList = new ArrayList<Recomactivitydetails>();
		List<Recomactivitydetails> list = recomactivitydetailsMapper
				.selectByExample(null);
		System.out.println(list.size()+";;;;;;;;;;;;;;;;;;");
		for (Recomactivitydetails recomactivitydetails : list) {
			Oldman oldman = oldmanMapper
					.selectBaseInfoById(recomactivitydetails.getOldmanId());
			Recomactivity recomactivity = recomactivityMapper
					.selectByPrimaryKey(recomactivitydetails
							.getRecomactivityId());
			Activity activity = activityMapper.selectByPrimaryKey(recomactivity
					.getActivityId());
			recomactivitydetails.setActivity(activity);
			recomactivitydetails.setOldman(oldman);
			recomactivitydetails.setRecomactivity(recomactivity);
			allList.add(recomactivitydetails);

		}*/
		return recomactivitydetailsMapper.selectAllBaseRecomActivitydetails();
	}

	/**
	 * @Title:   findAllRecomactivitydetailsBySearch
	 * @Description:  TODO
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Recomactivitydetails> findAllRecomactivitydetailsBySearch() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
