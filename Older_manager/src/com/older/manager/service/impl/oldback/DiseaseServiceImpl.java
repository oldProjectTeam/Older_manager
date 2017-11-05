package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Disease;
import com.older.manager.bean.DiseaseExample;
import com.older.manager.bean.DiseaseExample.Criteria;
import com.older.manager.mapper.DiseaseMapper;
import com.older.manager.service.oldback.DiseaseService;
@Service
/**
 * 疾病列表
 * @author 疯癫
 *
 */
public class DiseaseServiceImpl implements DiseaseService{
	@Autowired
	private DiseaseMapper diseaseMapper;
   /**
    * 增加
    */
	@Override
	public void addDisease(Disease disease) {
		diseaseMapper.insertSelective(disease);
		
	}
    /**
     * 删除
     */
	@Override
	public void deleteDisease(Integer id) {
		diseaseMapper.deleteByPrimaryKey(id);
		
	}
     /**
      * 修改
      */
	@Override
	public void updateDisease(Disease disease) {
		diseaseMapper.updateByPrimaryKeySelective(disease);
		
	}
    /**
     * 通过id查一条
     */
	@Override
	public Disease selectDisease(Integer id) {
		return diseaseMapper.selectByPrimaryKeyWithOlder(id);
	}
    /**
     * 模糊查询所有
     */
	@Override
	public List<Disease> selectAllDiseases(Disease disease) {
		return diseaseMapper.selectByExampleWithOlder(disease);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {
		DiseaseExample example=new DiseaseExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		diseaseMapper.deleteByExample(example);
	
	}
}
