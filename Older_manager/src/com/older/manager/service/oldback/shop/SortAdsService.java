package com.older.manager.service.oldback.shop;

import java.util.List;

import com.older.manager.bean.Sortads;

/**
 * 广告分类管理
 * @author 疯癫
 *
 */
public interface SortAdsService {
    /**
     * 增加
     */
	public void  addSortAds(Sortads sortads);
	/**
	 * 删除
	 */
	public void  deleteSortAds(Integer id);
	/**
	 * 修改
	 */
	public void  updateSortAds(Sortads sortads);
	/**
	 * 通过id来查一条
	 * @param id
	 * @return
	 */
	public Sortads selecctSortAdsById(Integer id);
	/**
	 * 模糊查询
	 * @param sortads
	 * @return
	 */
	public List<Sortads> selectAllSortAds(String str1,String str2);
	
	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);
}
