package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Healthinfo;
import com.older.manager.bean.HealthinfoExample;
import com.older.manager.bean.HealthinfoExample.Criteria;
import com.older.manager.mapper.HealthinfoMapper;
import com.older.manager.service.oldback.HealthInfoService;

@Service
/**
 * 健康数据
 * @author 疯癫
 *
 */
public class HealthInfoServiceImpl implements HealthInfoService{
	@Autowired
	private HealthinfoMapper healthinfoMapper;
     /**
      * 增加
      */
	@Override
	public void addHealthInfo(Healthinfo healthinfo) {
              	healthinfoMapper.insertSelective(healthinfo);	
	}
    /**
     * 删除
     */
	@Override
	public void deleteHealthInfo(Integer id) {
             healthinfoMapper.deleteByPrimaryKey(id);		
	}
    /**
     * 修改
     */
	@Override
	public void updateHealthInfo(Healthinfo healthinfo) {
             healthinfoMapper.updateByPrimaryKeySelective(healthinfo);		
	}
    /**
     * 通过id来查一条
     */
	@Override
	public Healthinfo selectHealthInfoById(Integer id) {
		return healthinfoMapper.selectByPrimaryKeyWithOlder(id);
	}
    /**
     * 模糊查询所有的
     */
	@Override
	public List<Healthinfo> selectHealthInfo(Healthinfo healthinfo) {
		return healthinfoMapper.selectByExampleWithOlder(healthinfo);
	}
     /**
      * 批量删除
      */
	@Override
	public void deleteBatch(List<Integer> ids) {
        HealthinfoExample example=new HealthinfoExample();
        Criteria criteria=example.createCriteria();
        criteria.andIdIn(ids);
        healthinfoMapper.deleteByExample(example);
	}

}
