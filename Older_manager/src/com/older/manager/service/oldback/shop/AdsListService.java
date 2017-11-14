package com.older.manager.service.oldback.shop;

import java.util.List;

import com.older.manager.bean.Adslist;

/**
 * 广告列表
 * @author 疯癫
 *
 */
public interface AdsListService {
    /**
     * 增加 
     * @param adsList
     */
	public void addAdsList(Adslist adslist);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteAdsList(Integer id);
	/**
	 * 修改
	 * @param adsList
	 */
	public void updateAdsList(Adslist adslist);
	/**
	 * 通过id来
	 * @param id
	 * @return
	 */
	public Adslist selectAdsListById(Integer id);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Adslist> selectAllAds(String str,Integer id);
	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);
	/**
	 * 查总数
	 * @return
	 */
	public int selectTotal();
	/***
	 * 条件查询总数
	 * @param id
	 * @return
	 */
	public int selectTotalWith(int id);
}