package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Disease;
import com.older.manager.bean.DiseaseExample;
import com.older.manager.mapper.DiseaseMapper;
import com.older.manager.service.oldfront.IDiseaseService;

@Service
public class DiseaseServiceImpl implements IDiseaseService {

	@Autowired
	DiseaseMapper diseaseMapper;
	@Override
	public List<Disease> findAll(Disease disease) throws Exception {
		 DiseaseExample example=new DiseaseExample();
		 DiseaseExample.Criteria criteria=example.createCriteria();
		 criteria.andOldmanIdEqualTo(disease.getOldmanId());
		 if(disease!=null){
			 if(disease.getConfirmedtime1()!=null&&disease.getConfirmedtime2()!=null){
				 criteria.andConfirmedtimeBetween(disease.getConfirmedtime1(),disease.getConfirmedtime2());
			 }
		 }
		
		return diseaseMapper.selectByExample(example);
	}

	@Override
	public void insertDisease(Disease disease) throws Exception {
		 diseaseMapper.insertSelective(disease);
	}

	@Override
	public void updateDiseae(Disease disease) throws Exception {
		 diseaseMapper.updateByPrimaryKeySelective(disease);
	}

	@Override
	public Disease findDisease(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return diseaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteDisease(Integer id) throws Exception {
		 diseaseMapper.deleteByPrimaryKey(id);
	}

}
