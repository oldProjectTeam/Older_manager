package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Giftexchange;

public interface IGiftexchangeService {

	/**
     * 模糊查询所有礼品兑换记录，关联老人账户表，老人信息表、礼品信息表
     * @param giftexchange
     * @return
     */
	public List<Giftexchange>selectGiftExchangeAndOldmanByCondition(Giftexchange giftexchange);

	/**
	 * 有选择的插入礼品兑换信息
	 * @param giftexchange
	 */
	public void insertGiftexchange(Giftexchange giftexchange);
	
	/**
	 * 有选择的修改礼品兑换信息
	 * @param giftexchange
	 */
	public void updateGiftexchange(Giftexchange giftexchange);
	
	/**
	 * 根据id查询礼品记录信息
	 * @param id
	 * @return
	 */
	public Giftexchange findGiftexchangeById(Integer id);

	/**
	 * 根据id删除礼品兑换信息
	 * @param id
	 */
	public void deleteGiftexchange(Integer id);
	
	/**
	 * 根据id集合批量删除礼品兑换信息
	 * @param ids：id集合
	 */
	public void batchDeleteGiftexchange(List<Integer>ids);
}
