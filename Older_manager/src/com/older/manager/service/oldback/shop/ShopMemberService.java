/**
 * 
 */
package com.older.manager.service.oldback.shop;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.older.manager.bean.ShopMember;

/**
 * @author ym
 * 
 */
public interface ShopMemberService {

	/**
	 * @Title: addShopMember
	 * @Description: 添加电商会员表
	 * @param: @param shopMember
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int addShopMember(ShopMember shopMember);

	/**
	 * @Title: deleteShopMemberById
	 * @Description: 根据id删除电商会员表
	 * @param: @param id
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int deleteShopMemberById(Integer id);

	/**
	 * @Title: modifyShopMember
	 * @Description: 修改电商会员表
	 * @param: @param shopMember
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int modifyShopMember(ShopMember shopMember);

	/**
	 * @Title: findShopMemberById
	 * @Description: 根据id查询一个电商会员表
	 * @param: @param id
	 * @param: @return
	 * @return: ShopMember
	 * @throws
	 */
	public ShopMember findShopMemberById(Integer id);

	/**
	 * @Title: findAllShopMembers
	 * @Description: 查询所有的电商会员表
	 * @param: @return
	 * @return: List<ShopMember>
	 * @throws
	 */
	public List<ShopMember> findAllShopMembers();
	
	/**
	 * @Title:   findAllShopMembersBySearch
	 * @Description:  通过时间查找用户
	 * @param:    @param usesrDate
	 * @param:    @param joindate
	 * @param:    @return   
	 * @return:   List<ShopMember>   
	 * @throws
	 */
	public List<ShopMember> findAllShopMembersBySearch(String usesrDate,Date joindate);
	
	/**
	 * @Title:   findAllShopMembersGradeDistribution
	 * @Description:  查询会员的等级分布
	 * @param:    @return   
	 * @return:   Map<String,Integer>   
	 * @throws
	 */
	public Map<String, Integer> findAllShopMembersGradeDistribution();
	
	/**
	 * @Title:   findAllShopMembersByLevel
	 * @Description:  通过会员等级来查询所有的会员
	 * @param:    @param code
	 * @param:    @return   
	 * @return:   List<ShopMember>   
	 * @throws
	 */
	public List<ShopMember> findAllShopMembersByLevel(int code);
	

}
