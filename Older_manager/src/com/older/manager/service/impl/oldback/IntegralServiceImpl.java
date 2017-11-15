package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Integral;
import com.older.manager.bean.IntegralExample;
import com.older.manager.bean.Oldman;
import com.older.manager.mapper.IntegralMapper;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.service.oldback.IIntegralService;

@Service
public class IntegralServiceImpl implements IIntegralService {
	@Autowired
    AddNewOlderService addNewOlderService;
	@Autowired
	IntegralMapper integralMapper;
	@Override
	public List<Integral> queryAllIntegral(Integral integral) {
		// TODO Auto-generated method stub
		return integralMapper.selectIntegralAndOldmanByCondition(integral);
	}

	@Override
	public void deleteIntegral(Integer id) {
		// TODO Auto-generated method stub
		integralMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeleteIntegral(List<Integer> ids) {
		// TODO Auto-generated method stub
		IntegralExample example=new IntegralExample();
		IntegralExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		integralMapper.deleteByExample(example);
	}

	@Override
	public List<Oldman> selectOldManNotIntegral(Oldman oldman) {
		return integralMapper.selectOldManNotIntegral(oldman);
	}

	@Override
	public void batchInsertIntegral(List<Integer> ids) {
		 Oldman oldman=null;
		 Integral integral=null;
		 for(Integer id:ids){
			 oldman=addNewOlderService.selectOlder(id);
			 integral=new Integral();
			 integral.setOldmanId(oldman.getId());
			 integral.setCurrentintegral(0);
			 integralMapper.insertSelective(integral); 
		 }
	}

	/**
	 * @Title:   addIntegral
	 * @Description:  添加单个积分表
	 * @param:    @param integral     
	 * @throws
	 */
	@Override
	public int addIntegral(Integral integral) {
		return integralMapper.insertSelective(integral);
	}

	
}
