package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Takedrugdetails;
import com.older.manager.bean.TakedrugdetailsExample;
import com.older.manager.bean.TakedrugdetailsExample.Criteria;
import com.older.manager.mapper.TakedrugdetailsMapper;
import com.older.manager.service.oldfront.ITakeDrugService;
@Service
public class TakeDrugServiceImpl implements ITakeDrugService{
	@Autowired
    private TakedrugdetailsMapper takedrugdetailsMapper;
	@Override
	public void addTakeDrug(Takedrugdetails takedrugdetails) {
		// TODO 自动生成的方法存根
		takedrugdetailsMapper.insertSelective(takedrugdetails);
	}

	@Override
	public void deleteTakeDrug(Integer id) {
		// TODO 自动生成的方法存根
		takedrugdetailsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateTakeDrug(Takedrugdetails takedrugdetails) {
		// TODO 自动生成的方法存根
		takedrugdetailsMapper.updateByPrimaryKeySelective(takedrugdetails);
	}

	@Override
	public Takedrugdetails selectTakeDrugById(Integer id) {
		// TODO 自动生成的方法存根
		return takedrugdetailsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Takedrugdetails> selectAllTakeDrug(
			Takedrugdetails takedrugdetails) {
		TakedrugdetailsExample example=new TakedrugdetailsExample();
		Criteria criteria=example.createCriteria();
		criteria.andOldmanIdEqualTo(takedrugdetails.getOldmanId());
		if (takedrugdetails.getStarttakingdate()!=null&&takedrugdetails.getEndtakingdate()!=null) {
			criteria.andStarttakingdateBetween(takedrugdetails.getStarttakingdate(),takedrugdetails.getEndtakingdate());
			criteria.andEndtakingdateBetween(takedrugdetails.getStarttakingdate(),takedrugdetails.getEndtakingdate());
		}
		
		return takedrugdetailsMapper.selectByExample(example);
	}

	
}
