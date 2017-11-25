package com.older.manager.service.impl.oldfront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Hobby;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.bean.Special;
import com.older.manager.mapper.HobbyMapper;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.mapper.OldmanaccountMapper;
import com.older.manager.mapper.SpecialMapper;
import com.older.manager.service.oldfront.IOldmanService;
import com.older.manager.utils.MD5;

@Service
public class OldmanServiceImpl implements IOldmanService {

	@Autowired
	OldmanMapper oldmanMapper;

	@Autowired
	HobbyMapper hobbyMapper;

	@Autowired
	SpecialMapper specialMapper;

	@Autowired
	OldmanaccountMapper oldmanaccountMapper;

	@Override
	public void notifyOlder(Oldman oldman) throws Exception {
		oldmanMapper.updateByPrimaryKeySelective(oldman);
	}

	@Override
	public Oldman getOldman(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return oldmanMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Description: 更新老人信息
	 * @param @param oldman
	 * @param @return
	 * @return
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午12:57:52
	 */
	@Override
	public int modifyOldman(Oldman oldman) {
		Hobby hobby = hobbyMapper.selecthobbyByOldamnId(oldman.getId());
		Special special = specialMapper.selectSpecialByOldmanId(oldman.getId());
		if (hobby == null) {
			hobby = new Hobby();
			hobby.setOldmanId(oldman.getId());
			hobby.setProjectname(oldman.getHobbyString());
			hobbyMapper.insertSelective(hobby);
		} else {
			if (oldman.getHobbyString() != null
					&& !oldman.getHobbyString().equals("")) {
				hobby.setProjectname(oldman.getHobbyString());
				hobbyMapper.updateByPrimaryKeySelective(hobby);
			}
		}
		;

		if (special == null) {
			special = new Special();
			special.setOldmanId(oldman.getId());
			special.setProjectname(oldman.getSpecialString());
			specialMapper.insertSelective(special);
		} else {
			if (oldman.getSpecialString() != null
					&& !oldman.getSpecialString().equals("")) {
				special.setProjectname(oldman.getSpecialString());
				specialMapper.updateByPrimaryKeySelective(special);
			}
		}
		return oldmanMapper.updateByPrimaryKeySelective(oldman);
	}

	/**
	 * @Title: OldmanServiceImpl.java
	 * @Description: 查询包括爱好特长的老人的详细信息
	 * @param @param id
	 * @param @return
	 * @return
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午10:31:41
	 */
	@Override
	public Oldman findDetailOldmanById(Integer id) {
		return oldmanMapper.selectOldmanById(id);
	}

	/**
	 * @Title: OldmanServiceImpl.java
	 * @Description: 通过老人id查询老人的账户信息
	 * @param @param oldmanId
	 * @param @return
	 * @return
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 下午7:47:22
	 */
	@Override
	public Oldmanaccount findOldmanaccountByOldmanId(Integer oldmanId) {
		return oldmanaccountMapper.selectOldmanAccountByOldmanId(oldmanId);
	}

	/**
	 * @Title: OldmanServiceImpl.java
	 * @Description: 更新老人账户信息
	 * @param @param oldmanaccount
	 * @param @return
	 * @return
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 下午7:57:49
	 */
	@Override
	public int modifyOldmanAccount(Oldmanaccount oldmanaccount) {
		String MD5_password = new MD5()
				.getMD5ofStr(oldmanaccount.getPassword());
		oldmanaccount.setPassword(MD5_password);
		return oldmanaccountMapper.updateByPrimaryKeySelective(oldmanaccount);
	}
}
