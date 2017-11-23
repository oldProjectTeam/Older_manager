package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Bloodtransfusion;
import com.older.manager.bean.BloodtransfusionExample;
import com.older.manager.mapper.BloodtransfusionMapper;
import com.older.manager.service.oldfront.IBloodtransfusionService;

@Service
public class BloodtransfusionServiceImpl implements IBloodtransfusionService {

	@Autowired
	BloodtransfusionMapper bloodtransfusionMapper;
	@Override
	public List<Bloodtransfusion> findAll(Bloodtransfusion bloodtransfusion)
			throws Exception {
		BloodtransfusionExample example=new BloodtransfusionExample();
		BloodtransfusionExample.Criteria criteria=example.createCriteria();
		criteria.andOldmanIdEqualTo(bloodtransfusion.getOldmanId());
		if(bloodtransfusion!=null){
			if(bloodtransfusion.getOccurrencetime1()!=null&&bloodtransfusion.getOccurrencetime2()!=null){
				criteria.andOccurrencetimeBetween(bloodtransfusion.getOccurrencetime1(), bloodtransfusion.getOccurrencetime2());
			}
		}
		return bloodtransfusionMapper.selectByExample(example);
	}

	@Override
	public void insertBloodtransfusion(Bloodtransfusion bloodtransfusion)
			throws Exception {
		bloodtransfusionMapper.insertSelective(bloodtransfusion);

	}

	@Override
	public void updateBloodtransfusion(Bloodtransfusion bloodtransfusion)
			throws Exception {
		bloodtransfusionMapper.updateByPrimaryKeySelective(bloodtransfusion);

	}

	@Override
	public Bloodtransfusion findBloodtransfusion(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return bloodtransfusionMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteBloodtransfusion(Integer id) throws Exception {
		bloodtransfusionMapper.deleteByPrimaryKey(id);
	}

}
