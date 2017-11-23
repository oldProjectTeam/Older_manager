package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Changesale;
import com.older.manager.bean.ChangesaleExample;
import com.older.manager.bean.ChangesaleExample.Criteria;
import com.older.manager.mapper.ChangesaleMapper;
import com.older.manager.service.shopfront.ChangeService;

@Service
public class ChangeServiceImpl implements ChangeService{
	   @Autowired
       private ChangesaleMapper  changesaleMapper;
	
	
	@Override
	public List<Changesale> selectAll(Integer userid) {
        ChangesaleExample example=new ChangesaleExample();
        Criteria criteria=example.createCriteria();
        criteria.andUsidEqualTo(userid);

		return changesaleMapper.selectByExample(example);
	}




	@Override
	public void deleteChange(Integer id) {
		// TODO 自动生成的方法存根
		changesaleMapper.deleteByPrimaryKey(id);
	}


	@Override
	public void addChange(Changesale changesale) {
		// TODO 自动生成的方法存根
		changesaleMapper.insertSelective(changesale);
	}


	@Override
	public void updateState(Changesale changesale) {
		// TODO 自动生成的方法存根
		changesaleMapper.updateByPrimaryKeySelective(changesale);
	}

}
