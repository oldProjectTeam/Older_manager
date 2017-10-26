package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldmanaccount;
import com.older.manager.bean.OldmanaccountExample;
import com.older.manager.bean.OldmanaccountExample.Criteria;
import com.older.manager.mapper.OldmanaccountMapper;
import com.older.manager.service.oldback.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	@Qualifier("oldmanaccountMapper")
	private OldmanaccountMapper oldmanaccountMapper;

	/**
	 * 老人登录
	 */
	@Override
	public Oldmanaccount loginForOldman(Oldmanaccount oldmanaccount) {
		OldmanaccountExample example = new OldmanaccountExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(oldmanaccount.getAccount());
		criteria.andPasswordEqualTo(oldmanaccount.getPassword());
		List<Oldmanaccount> list = oldmanaccountMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
