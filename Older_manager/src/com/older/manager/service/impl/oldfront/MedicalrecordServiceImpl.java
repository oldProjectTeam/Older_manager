package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Medicalrecord;
import com.older.manager.bean.MedicalrecordExample;
import com.older.manager.mapper.MedicalrecordMapper;
import com.older.manager.service.oldfront.IMedicalrecordService;

@Service
public class MedicalrecordServiceImpl implements IMedicalrecordService {

	@Autowired
	MedicalrecordMapper medicalrecordMapper;
	@Override
	public List<Medicalrecord> findAll(Medicalrecord medicalrecord)
			throws Exception {
		MedicalrecordExample example=new MedicalrecordExample();
		MedicalrecordExample.Criteria criteria=example.createCriteria();
		criteria.andOldmanIdEqualTo(medicalrecord.getOldmanId());
		if(medicalrecord!=null){
			if(medicalrecord.getClinicaltime1()!=null&&medicalrecord.getClinicaltime2()!=null){
				criteria.andClinicaltimeBetween(medicalrecord.getClinicaltime1(), medicalrecord.getClinicaltime2());
			}
		}
		return medicalrecordMapper.selectByExample(example);
	}

	@Override
	public void insertMedicalrecord(Medicalrecord medicalrecord)
			throws Exception {
		// TODO Auto-generated method stub
		medicalrecordMapper.insertSelective(medicalrecord);
	}

	@Override
	public void updateMedicalrecord(Medicalrecord medicalrecord)
			throws Exception {
		// TODO Auto-generated method stub
		medicalrecordMapper.updateByPrimaryKeySelective(medicalrecord);
	}

	@Override
	public Medicalrecord findMedicalrecord(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return medicalrecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteMedicalrecord(Integer id) throws Exception {
		// TODO Auto-generated method stub
		medicalrecordMapper.deleteByPrimaryKey(id);
	}

}
