package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Surgery;
import com.older.manager.bean.SurgeryExample;
import com.older.manager.bean.SurgeryExample.Criteria;
import com.older.manager.mapper.SurgeryMapper;
import com.older.manager.service.oldback.SurgeryService;
@Service
/**
 * 手术列表
 * @author 疯癫
 *
 */
public class SurgeryServiceImpl implements SurgeryService{
	@Autowired
	private SurgeryMapper surgeryMapper;
    /**
     * 增加
     */
	@Override
	public void addSurgery(Surgery surgery) {
		surgeryMapper.insertSelective(surgery);
		
	}
     /**
      * 删除
      */
	@Override
	public void deleteSurgery(Integer id) {
		surgeryMapper.deleteByPrimaryKey(id);
		
	}
     /**
      * 修改
      */
	@Override
	public void updateSurgery(Surgery surgerys) {
       surgeryMapper.updateByPrimaryKeySelective(surgerys);		
	}
     /**
      * 通过id查一条
      */
	@Override
	public Surgery selectSurgeryById(Integer id) {
		return surgeryMapper.selectByPrimaryKeyWithOlder(id);
	}
     /**
      * 模糊查所有的
      */
	@Override
	public List<Surgery> selectAllSurgery(Surgery surgery) {
		return surgeryMapper.selectByExampleWithOlder(surgery);
	}
	/**
	 * 批量删除
	 */
	@Override
	public void deleteBatch(List<Integer> ids) {
		SurgeryExample example=new SurgeryExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		surgeryMapper.deleteByExample(example);
		
	}

}
