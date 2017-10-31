package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.bean.OldmanaccountExample;
import com.older.manager.mapper.OldmanaccountMapper;
import com.older.manager.service.oldback.IOldmanaccountService;

@Service
public class OldmanaccountServiceImpl implements IOldmanaccountService {

	@Autowired
	OldmanaccountMapper oldmanaccountMapper;
	
 
	@Override
	public List<Oldman> selectOldManNotAccount(Oldman oldman) {
		// TODO Auto-generated method stub
		return oldmanaccountMapper.selectOldManNotAccount(oldman);
	}


	@Override
	public void batchInsertAccount(List<Oldman> oldmans) {
		// TODO Auto-generated method stub
		Oldmanaccount account=new Oldmanaccount();
		
		for(Oldman o:oldmans){
			account.setAccount(o.getPhone());
			account.setOldmanId(o.getId());
			account.setPassword("123456");
			oldmanaccountMapper.insertSelective(account);
		}
	}


	@Override
	public List<Oldmanaccount> selectAccountAndOldmanByCondiction(
			Oldmanaccount oldmanaccount) {
		 
		return oldmanaccountMapper.selectAccountAndOldmanByCondiction(oldmanaccount);
	}


	@Override
	public void deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		oldmanaccountMapper.deleteByPrimaryKey(id);
	}


	@Override
	public void batchDeleteAccount(List<Integer> ids) {
		// TODO Auto-generated method stub
		OldmanaccountExample example=new OldmanaccountExample();
		OldmanaccountExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		oldmanaccountMapper.deleteByExample(example);
	}


	@Override
	public void passwordResrt(Integer id) {
		// TODO Auto-generated method stub
		Oldmanaccount oldmanaccount=new Oldmanaccount();
		oldmanaccount.setId(id);
		oldmanaccount.setPassword("123456");
		oldmanaccountMapper.updateByPrimaryKeySelective(oldmanaccount);
	}

}
