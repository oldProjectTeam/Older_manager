package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Change;
import com.older.manager.bean.ChangeExample;
import com.older.manager.bean.ChangeExample.Criteria;
import com.older.manager.mapper.ChangeMapper;
import com.older.manager.service.shopfront.ChangeService;

@Service
public class ChangeServiceImpl implements ChangeService{
	   @Autowired
       private ChangeMapper changeMapper;
	
	
	@Override
	public List<Change> selectAll(Integer userid) {
        ChangeExample example=new ChangeExample();
        Criteria criteria=example.createCriteria();
        criteria.andUsidEqualTo(userid);

		return changeMapper.selectByExample(example);
	}


	@Override
	public void addChange(Change change) {
		// TODO 自动生成的方法存根
		changeMapper.insertSelective(change);
	}


	@Override
	public void deleteChange(Integer id) {
		// TODO 自动生成的方法存根
		changeMapper.deleteByPrimaryKey(id);
	}

}
