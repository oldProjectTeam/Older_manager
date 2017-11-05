package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Trauma;
import com.older.manager.bean.TraumaExample;
import com.older.manager.bean.TraumaExample.Criteria;
import com.older.manager.mapper.TraumaMapper;
import com.older.manager.service.oldback.TraumaService;
/**
 * 外伤列表
 * @author 疯癫
 *
 */
@Service
public class TraumaServiceImpl implements TraumaService{
    @Autowired
    private TraumaMapper traumaMapper;
	 /**
	  * 增加
	  */
	@Override
	public void addTrauma(Trauma trauma) {
          traumaMapper.insertSelective(trauma);  
	}
    /**
     * 删除
     */
	@Override
	public void deleteTrauma(Integer id) {
          traumaMapper.deleteByPrimaryKey(id);
	}
    /**
     * 修改
     */
	@Override
	public void updateTrauma(Trauma trauma) {
		traumaMapper.updateByPrimaryKeySelective(trauma);
		
	}

	@Override
	public Trauma selectTrauma(Integer id) {
		return traumaMapper.selectByPrimaryKeyWithOlder(id);
	}

	@Override
	public List<Trauma> selectTrauma(Trauma trauma) {
		return traumaMapper.selectByExampleWithOlder(trauma);
	}
    /**
     * 批量删除
     */
	@Override
	public void deleteBatch(List<Integer> ids) {
		TraumaExample example=new TraumaExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		traumaMapper.deleteByExample(example);
		
	}

}
