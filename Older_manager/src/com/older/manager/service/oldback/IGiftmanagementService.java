package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Giftmanagement;

public interface IGiftmanagementService {
	
	/**
	 * 查询所有礼品信息
	 * @param giftmanagement：查询参数
	 * @return
	 */
	public List<Giftmanagement>queryAllGift(Giftmanagement giftmanagement);
	
	/**
	 * 有选择的插入礼品信息
	 * @param giftmanagement
	 */
	public void insertGift(Giftmanagement giftmanagement);
	
	/**
	 * 有选择的更新礼品信息
	 * @param giftmanagement
	 */
	public void updateGift(Giftmanagement giftmanagement);

	/**
	 * 根据主键查询礼品信息
	 * @param id：主键
	 * @return
	 */
	public Giftmanagement findGiftmanagementById(Integer id);
	
	/**
	 * 根据主键删除礼品信息
	 * @param id：主键
	 */
	public void deleteGift(Integer id);
	
	/**
	 * 批量删除礼品信息
	 * @param ids：id集合
	 */
	public void batchDeleteGift(List<Integer>ids);
	
}
