package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Takeactivity;
import com.older.manager.bean.TakeactivityExample;
import com.older.manager.bean.TakeactivityExample.Criteria;
import com.older.manager.mapper.TakeactivityMapper;
import com.older.manager.service.oldback.CustomerActivityService;



/**
 * 参加活动的记录
 * @author 疯癫
 *
 */
@Service
public class CustomerActivityServiceImpl implements CustomerActivityService{
	@Autowired
	private TakeactivityMapper takeactivityMapper;
	
     /**
      * 增加活动的记录
      */
	@Override
	public void addTakeactivity(Takeactivity takeactivity) {
		takeactivityMapper.insertSelective(takeactivity);
		
	}
    /**
     * 删除
     */
	@Override
	public void deleteTakeactivity(Integer id) {
		takeactivityMapper.deleteByPrimaryKey(id);
		
	}
    /**
     * 更新
     */
	@Override
	public void updateTakeactivity(Takeactivity takeactivity) {
		takeactivityMapper.updateByPrimaryKeySelective(takeactivity);
		
	}
     /**
      * 通过id查询
      */
	@Override
	public Takeactivity selectTakeactivityById(Integer id) {
		
		return takeactivityMapper.selectByPrimaryKeyWithOldmanAndActivity(id);
	}
    /**
     * 查询全部
     */
	@Override
	public List<Takeactivity> selectAllTakeactivitys() {
		
		return takeactivityMapper.selectByExampleWithOldmanAndActivity(null);
	}
	/**
	 * 模糊查询全部
	 */
	@Override
	public List<Takeactivity> selectAllTakeactivitysWith(Takeactivity takeactivity) {

			 
			
		return takeactivityMapper.selectByExampleWithOldmanAndActivity(takeactivity);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {
		

			TakeactivityExample example=new TakeactivityExample();
		    Criteria  criteria=example.createCriteria();
			criteria.andIdIn(ids);
			takeactivityMapper.deleteByExample(example);


		
	}
}
