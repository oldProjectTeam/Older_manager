/**
 * 
 */
package com.older.manager.service.impl.oldback.shop;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ShopMember;
import com.older.manager.bean.ShopMemberExample;
import com.older.manager.bean.Users;
import com.older.manager.mapper.ShopMemberMapper;
import com.older.manager.service.oldback.shop.ShopMemberService;
import com.older.manager.utils.RegexText;

/**
 * @author ym
 * 
 */
@Service
public class ShopMemberServiceImpl implements ShopMemberService {

	@Autowired
	ShopMemberMapper shopMemberMapper;

	/**
	 * @Title: addShopMember
	 * @Description: 添加电商会员表
	 * @param: @param shopMember
	 * @param: @return int
	 * @throws
	 */
	@Override
	public int addShopMember(ShopMember shopMember) {
		return shopMemberMapper.insertSelective(shopMember);
	}

	/**
	 * @Title: deleteShopMemberById
	 * @Description: 根据id删除电商会员表
	 * @param: @param id
	 * @param: @return int
	 * @throws
	 */
	@Override
	public int deleteShopMemberById(Integer id) {
		return shopMemberMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title: modifyShopMember
	 * @Description: 修改电商会员表
	 * @param: @param shopMember
	 * @param: @return int
	 * @throws
	 */
	@Override
	public int modifyShopMember(ShopMember shopMember) {
		return shopMemberMapper.updateByPrimaryKeySelective(shopMember);
	}

	/**
	 * @Title: findShopMemberById
	 * @Description: 根据id查询一个电商会员表
	 * @param: @param id
	 * @param: @return List<ShopMember>
	 * @throws
	 */
	@Override
	public ShopMember findShopMemberById(Integer id) {
		return shopMemberMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title: findAllShopMembers
	 * @Description: 查询所有的电商会员表数据
	 * @param: @return List<ShopMember>
	 * @throws
	 */
	@Override
	public List<ShopMember> findAllShopMembers() {
		return shopMemberMapper.selectByExample(null);
	}

	/**
	 * @Title: findAllShopMembersBySearch
	 * @Description: 通过搜索查询所有的会员表
	 * @param: @param usesrDate
	 * @param: @param joindate
	 * @param: @return List<ShopMember>
	 * @throws
	 */
	@Override
	public List<ShopMember> findAllShopMembersBySearch(String usesrDate,
			Date joindate) {
		ShopMember shopMember = new ShopMember();
		Users users = new Users();
		if (usesrDate != null && !usesrDate.equals("")) {
			if (RegexText.checkEmaile(usesrDate)) {
				users.setEmail(usesrDate);
			} else if (RegexText.checkphone(usesrDate)) {
				users.setPhone(usesrDate);
			} else if (RegexText.checkChinese(usesrDate)) {
				users.setAccount(usesrDate);
			}
		}
		;
		if (joindate != null && !joindate.equals("")) {
			shopMember.setJointime(joindate);
		}
		;
		shopMember.setUsers(users);

		return shopMemberMapper.selectByShopMember(shopMember);
	}

	/**
	 * @Title: findAllShopMembersGradeDistribution
	 * @Description: 查询会员的等级分布
	 * @param: @return Map<String, Integer>
	 * @throws
	 */
	@Override
	public Map<String, Integer> findAllShopMembersGradeDistribution() {
		Map<String, Integer> shopMembersGradeMap = new HashMap<String, Integer>();

		shopMembersGradeMap.put("all", shopMemberMapper.countByExample(null));

		ShopMemberExample example1 = new ShopMemberExample();
		example1.createCriteria().andLevelLike("普通会员");
		shopMembersGradeMap.put("regular",
				shopMemberMapper.countByExample(example1));

		ShopMemberExample example2 = new ShopMemberExample();
		example2.createCriteria().andLevelLike("铁牌会员");
		shopMembersGradeMap.put("iron",
				shopMemberMapper.countByExample(example2));

		ShopMemberExample example3 = new ShopMemberExample();
		example3.createCriteria().andLevelLike("铜牌会员");
		shopMembersGradeMap.put("copper",
				shopMemberMapper.countByExample(example3));

		ShopMemberExample example4 = new ShopMemberExample();
		example4.createCriteria().andLevelLike("银牌会员");
		shopMembersGradeMap.put("silver",
				shopMemberMapper.countByExample(example4));

		ShopMemberExample example5 = new ShopMemberExample();
		example5.createCriteria().andLevelLike("金牌会员");
		shopMembersGradeMap.put("gold",
				shopMemberMapper.countByExample(example5));

		ShopMemberExample example6 = new ShopMemberExample();
		example6.createCriteria().andLevelLike("钻石会员");
		shopMembersGradeMap.put("diamond",
				shopMemberMapper.countByExample(example6));

		ShopMemberExample example7 = new ShopMemberExample();
		example7.createCriteria().andLevelLike("红钻会员");
		shopMembersGradeMap.put("Reddiamond",
				shopMemberMapper.countByExample(example7));

		ShopMemberExample example8 = new ShopMemberExample();
		example8.createCriteria().andLevelLike("蓝钻会员");
		shopMembersGradeMap.put("bluediamond",
				shopMemberMapper.countByExample(example8));

		ShopMemberExample example9 = new ShopMemberExample();
		example9.createCriteria().andLevelLike("黑钻会员");
		shopMembersGradeMap.put("blankdiamond",
				shopMemberMapper.countByExample(example9));

		return shopMembersGradeMap;
	}

	/**
	 * @Title: findAllShopMembersByLevel
	 * @Description: 根据会员等级来查询所有的电商会员
	 * @param: @param code
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<ShopMember> findAllShopMembersByLevel(int code) {
		ShopMemberExample example = new ShopMemberExample();
		switch (code) {
		case 0:
			example.createCriteria().andLevelLike("普通会员");
			break;
		case 1:
			example.createCriteria().andLevelLike("铁牌会员");
			break;
		case 2:
			example.createCriteria().andLevelLike("铜牌会员");
			break;
		case 3:
			example.createCriteria().andLevelLike("银牌会员");
			break;
		case 4:
			example.createCriteria().andLevelLike("金牌会员");
			break;
		case 5:
			example.createCriteria().andLevelLike("钻石会员");
			break;
		case 6:
			example.createCriteria().andLevelLike("红钻会员");
			break;
		case 7:
			example.createCriteria().andLevelLike("蓝钻会员");
			break;
		case 8:
			example.createCriteria().andLevelLike("黑钻会员");
			break;
		}
		return shopMemberMapper.selectByExample(example);
	}
}
