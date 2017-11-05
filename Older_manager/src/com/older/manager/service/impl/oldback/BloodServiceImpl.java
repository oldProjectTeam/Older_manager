package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Bloodtransfusion;
import com.older.manager.bean.BloodtransfusionExample;
import com.older.manager.bean.BloodtransfusionExample.Criteria;
import com.older.manager.mapper.BloodtransfusionMapper;
import com.older.manager.service.oldback.BloodService;
@Service
/**
 * 输液列表
 * @author 疯癫
 *
 */
public class BloodServiceImpl implements BloodService{
    @Autowired
    private BloodtransfusionMapper bloodtransfusionMapper;
    /**
     * 增加
     */
	@Override
	public void addBlood(Bloodtransfusion bloodtransfusion) {
           bloodtransfusionMapper.insertSelective(bloodtransfusion);		
	}
    /**
     * 删除
     */
	@Override
	public void deleteBlood(Integer id) {
		bloodtransfusionMapper.deleteByPrimaryKey(id);
		
	}
     /**
      * 修改
      */
	@Override
	public void updateBlood(Bloodtransfusion bloodtransfusion) {
		bloodtransfusionMapper.updateByPrimaryKeySelective(bloodtransfusion);
		
	}
    /**
     * 通过id来查一条数据
     */
	@Override
	public Bloodtransfusion selectBloodById(Integer id) {
		return bloodtransfusionMapper.selectByPrimaryKeyWithOlder(id);
	}
    /**
     * 模糊查询所有的
     */
	@Override
	public List<Bloodtransfusion> selectfAllBlood(
			Bloodtransfusion bloodtransfusion) {
		return bloodtransfusionMapper.selectByExampleWithOlder(bloodtransfusion);
	}
     /**
      * 批量删除
      */
	@Override
	public void deleteBatch(List<Integer> ids) {
		BloodtransfusionExample example=new BloodtransfusionExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		bloodtransfusionMapper.deleteByExample(example);
		
	}

}
