/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Recomactivity;
import com.older.manager.mapper.RecomactivityMapper;
import com.older.manager.service.oldback.RecomActivityService;

/**
 * @author ym
 *
 */
@Service
public class RecomActivityServiceImpl implements RecomActivityService {

	@Autowired
	RecomactivityMapper recomactivityMapper;
	
	/**
	 * @Title:   findRecomactivityById
	 * @Description:  通过id查询推荐表
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public Recomactivity findRecomactivityById(int id) {
		// TODO Auto-generated method stub
		return recomactivityMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title:   findAllRecomactivities
	 * @Description:  查询所有的推荐表
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Recomactivity> findAllRecomactivities() {
		// TODO Auto-generated method stub
		return recomactivityMapper.selectByExample(null);
	}

	/**
	 * @Title:   findAllRecomactivitiesBySearch
	 * @Description:  通过搜索查询所有的推荐表
	 * @param:    @param oldManName
	 * @param:    @param type
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Recomactivity> findAllRecomactivitiesBySearch(
			String oldManName, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @Title:   addRecomactivity
	 * @Description:  添加推荐表
	 * @param:    @param recomactivity
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int addRecomactivity(Recomactivity recomactivity) {
		// TODO Auto-generated method stub
		return recomactivityMapper.insertSelective(recomactivity);
	}

	/**
	 * @Title:   modifyRecomactivity
	 * @Description:  修改推荐表
	 * @param:    @param recomactivity
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int modifyRecomactivity(Recomactivity recomactivity) {
		// TODO Auto-generated method stub
		return recomactivityMapper.updateByPrimaryKeySelective(recomactivity);
	}

	/**
	 * @Title:   deleteRecomactivityById
	 * @Description:  通过id删除推荐表
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int deleteRecomactivityById(int id) {
		// TODO Auto-generated method stub
		return recomactivityMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title:   findRecomactivityIncludeActivityById
	 * @Description:  通过id查询包含活动的活动推荐内容
	 * @param:    @param id
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public Recomactivity findRecomactivityIncludeActivityById(int id) {
		return recomactivityMapper.SelectBaseRecommActivityById(id);
	}

}
