package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Surgery;
import com.older.manager.bean.SurgeryExample;
import com.older.manager.mapper.SurgeryMapper;
import com.older.manager.service.oldfront.ISurgeryService;

@Service
public class SurgeryServiceImpl implements ISurgeryService {

	@Autowired
	SurgeryMapper surgeryMapper;
	@Override
	public List<Surgery> findAll(Surgery surgery) throws Exception {
		SurgeryExample example=new SurgeryExample();
		SurgeryExample.Criteria criteria=example.createCriteria();
		criteria.andOldmanIdEqualTo(surgery.getOldmanId());
		if(surgery!=null){
			if(surgery.getSurgerytime1()!=null&&surgery.getSurgerytime2()!=null){
				criteria.andSurgerytimeBetween(surgery.getSurgerytime1(), surgery.getSurgerytime2());
			}
		}
		return surgeryMapper.selectByExample(example);
	}

	@Override
	public void insertSurgery(Surgery Surgery) throws Exception {

		surgeryMapper.insertSelective(Surgery);
	}

	@Override
	public void updateSurgery(Surgery surgery) throws Exception {
		// TODO Auto-generated method stub
		surgeryMapper.updateByPrimaryKeySelective(surgery);
	}

	@Override
	public Surgery findSurgery(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return surgeryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteSurgery(Integer id) throws Exception {
		// TODO Auto-generated method stub
		surgeryMapper.deleteByPrimaryKey(id);
	}

}
