package com.older.manager.service.shopfront.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Questionandanswer;
import com.older.manager.bean.QuestionandanswerExample;
import com.older.manager.bean.QuestionandanswerExample.Criteria;
import com.older.manager.bean.Users;
import com.older.manager.mapper.QuestionandanswerMapper;
import com.older.manager.mapper.UsersMapper;
import com.older.manager.service.shopfront.SafetyService;

@Service
public class SafetyServiceImpl implements SafetyService{
	@Autowired
    private UsersMapper usersMapper;
    @Autowired
	private QuestionandanswerMapper questionandanswerMapper;
	@Override
	public Users selectUserByid(Integer id) {
		// TODO 自动生成的方法存根
		return usersMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(Users users) {
		// TODO 自动生成的方法存根
		usersMapper.updateByPrimaryKeySelective(users);
	}

	@Override
	public void addQuestion(Questionandanswer questionandanswer) {
		// TODO 自动生成的方法存根
		questionandanswerMapper.insertSelective(questionandanswer);
	}

	@Override
	public boolean selectQuestion(Integer userid) {
		QuestionandanswerExample example=new QuestionandanswerExample();
		Criteria criteria=example.createCriteria();
		criteria.andUseridEqualTo(userid);
		questionandanswerMapper.countByExample(example);
		return questionandanswerMapper.countByExample(example)==0;
	}

	@Override
	public void updateQuestion(Questionandanswer questionandanswer) {
		QuestionandanswerExample example=new QuestionandanswerExample();
		Criteria criteria=example.createCriteria();
		criteria.andUseridEqualTo(questionandanswer.getUserid());
		questionandanswerMapper.updateByExampleSelective(questionandanswer, example);
	}

}
