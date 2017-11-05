package com.older.manager.service.impl.oldback;

import java.util.List;

import org.apache.logging.log4j.core.config.plugins.ResolverUtil.NameEndsWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Assess;
import com.older.manager.bean.AssessExample;
import com.older.manager.bean.AssessExample.Criteria;
import com.older.manager.mapper.AssessMapper;
import com.older.manager.service.oldback.HealthAssessService;
@Service
/**
 * 健康评估
 * @author 疯癫
 *
 */
public class HealthAssessServiceImpl implements HealthAssessService{
	@Autowired
    private AssessMapper assessMapper;
	
	/**
	 * 增加
	 */
	@Override
	public void addHealthAssess(Assess assess) {
		assessMapper.insertSelective(assess);
		
	}
    /**
     * 删除
     */
	@Override
	public void deleteHealthAssess(Integer id) {
		    assessMapper.deleteByPrimaryKey(id);
	}
    /**
     * 改
     */
	@Override
	public void updateHealthAssess(Assess assess) {
            assessMapper.updateByPrimaryKeySelective(assess);		
	}
    /**
     * 通过id查一条数据
     */
	@Override
	public Assess selectHealthAssess(Integer id) {
		return assessMapper.selectByPrimaryKeyWithOlder(id);
	}
     /**
      * 模糊查询所有的
      */
	@Override
	public List<Assess> selectAllHealthAssess(Assess assess) {
		return assessMapper.selectByExampleWithOlder(assess);
	}

	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {
	   AssessExample example=new AssessExample();
	   Criteria criteria=example.createCriteria();
	   criteria.andIdIn(ids);
	   assessMapper.deleteByExample(example);
		
	}
}
