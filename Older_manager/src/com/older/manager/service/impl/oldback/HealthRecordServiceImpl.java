package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Medicalrecord;
import com.older.manager.bean.MedicalrecordExample;


import com.older.manager.bean.MedicalrecordExample.Criteria;
import com.older.manager.mapper.MedicalrecordMapper;
import com.older.manager.service.oldback.HealthRecordService;
/**
 * 就诊治疗
 * @author 疯癫
 *
 */
@Service
public class HealthRecordServiceImpl implements HealthRecordService{
    @Autowired
	private MedicalrecordMapper medicalrecordMapper;
    
    
    /**
     * 增加就诊记录
     */
	@Override
	public void addHealthRecord(Medicalrecord medicalrecord) {
		medicalrecordMapper.insertSelective(medicalrecord);
		
	}
     
	/**
	 * 删除就诊记录
	 */
	@Override
	public void deleteHealthRecord(Integer id) {
		
		medicalrecordMapper.deleteByPrimaryKey(id);
	}
     /**
      * 修改就诊记录
      */
	@Override
	public void updateHealthRecord(Medicalrecord medicalrecord) {
		medicalrecordMapper.updateByPrimaryKeySelective(medicalrecord);
		
	}
    /**
     * 通过id查找一条数据
     */
	@Override
	public Medicalrecord selectHealthRecordById(Integer id) {
		
		return medicalrecordMapper.selectByPrimaryKeyWithOlder(id);
	}

	
	/**
	 * 模糊查询全部
	 */
	@Override
	public List<Medicalrecord> selectAllHealthRecord(Medicalrecord medicalrecord) {
		
		return medicalrecordMapper.selectByExampleWithOlder(medicalrecord);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {
		

			MedicalrecordExample example=new MedicalrecordExample();
		    Criteria  criteria=example.createCriteria();
			criteria.andIdIn(ids);
			medicalrecordMapper.deleteByExample(example);


		
	}
}
