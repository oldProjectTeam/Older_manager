package com.older.manager.service.impl.oldfront;

import java.net.InetAddress;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.bean.OldmanaccountExample;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.mapper.OldmanaccountMapper;
import com.older.manager.service.oldfront.IOldmanaccountService;
import com.older.manager.utils.MD5;

@Service
public class OldaccountServiceImpl implements IOldmanaccountService {

	@Autowired
	OldmanaccountMapper oldmanaccountMapper;
	@Autowired
	OldmanMapper oldmanMapper;
	@Override
	public Oldmanaccount olderLogin(String account,String password) throws Exception {
		OldmanaccountExample example=new OldmanaccountExample();
		OldmanaccountExample.Criteria criteria =example.createCriteria();
		criteria.andAccountEqualTo(account);
		List<Oldmanaccount>list=oldmanaccountMapper.selectByExample(example);
		if(list.size()<1){
			return null;
		}
		Oldmanaccount oldman=list.get(0);
		if(oldman!=null){
		     password= new MD5 ().getMD5ofStr(password);
			if(password.equals(oldman.getPassword())){
				Oldman oldman2=oldmanMapper.selectByPrimaryKey(oldman.getOldmanId());
				oldman.setOldman(oldman2);
				
				//更新用户登录信息
				oldman.setLogintime(new Date());
				String loginIp=InetAddress.getLocalHost().toString();
				loginIp=loginIp.substring(loginIp.indexOf("/")+1);
				oldman.setLoginip(loginIp);
				Integer count=oldman.getLogincount()==null?0:oldman.getLogincount();
				oldman.setLogincount(count+1);
				oldmanaccountMapper.updateByPrimaryKeySelective(oldman);
				
				return oldman;
			}
		}
		return null;
	}
	@Override
	public void updateAccount(Oldmanaccount account) throws Exception {

		oldmanaccountMapper.updateByPrimaryKeySelective(account);
	}
	@Override
	public Oldmanaccount getOldmanaccount(Integer id) throws Exception {
		return oldmanaccountMapper.selectByPrimaryKey(id);
	}
}
