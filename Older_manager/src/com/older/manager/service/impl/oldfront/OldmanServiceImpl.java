package com.older.manager.service.impl.oldfront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldman;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.service.oldfront.IOldmanService;

@Service
public class OldmanServiceImpl implements IOldmanService {

	@Autowired
	OldmanMapper oldmanMapper;
	@Override
	public void notifyOlder(Oldman oldman) throws Exception {
		oldmanMapper.updateByPrimaryKeySelective(oldman);
	}
	@Override
	public Oldman getOldman(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return oldmanMapper.selectByPrimaryKey(id);
	}

}
