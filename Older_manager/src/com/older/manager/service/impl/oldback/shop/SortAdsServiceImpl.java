package com.older.manager.service.impl.oldback.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Adslist;
import com.older.manager.bean.AdslistExample;
import com.older.manager.bean.Sortads;
import com.older.manager.bean.SortadsExample;
import com.older.manager.bean.SortadsExample.Criteria;
import com.older.manager.mapper.AdslistMapper;
import com.older.manager.mapper.SortadsMapper;
import com.older.manager.service.oldback.shop.SortAdsService;
@Service
/**
 * 广告分类管理
 * @author 疯癫
 *
 */
public class SortAdsServiceImpl implements SortAdsService{
	@Autowired
    private  SortadsMapper sortadsMapper;
	@Autowired
	private AdslistMapper adslistMapper;
	/**
	 * 增加
	 */
	@Override
	public void addSortAds(Sortads sortads) {
		sortadsMapper.insertSelective(sortads);
		
	}
    /**
     * 删除
     */
	@Override
	public void deleteSortAds(Integer id) {
		AdslistExample example1=new AdslistExample();
		com.older.manager.bean.AdslistExample.Criteria criteria1=example1.createCriteria();
		criteria1.andSortadsidEqualTo(id);
		adslistMapper.deleteByExample(example1);
       sortadsMapper.deleteByPrimaryKey(id);		
	}
    /**
     * 修改
     */
	@Override
	public void updateSortAds(Sortads sortads) {
		// TODO 自动生成的方法存根
		sortadsMapper.updateByPrimaryKeySelective(sortads);
	}
    /**
     * 通过id来查一条数据
     */
	@Override
	public Sortads selecctSortAdsById(Integer id) {
		// TODO 自动生成的方法存根
		return sortadsMapper.selectByPrimaryKey(id);
	}
    /**
     * 模糊查询
     */

	
	@Override
	public List<Sortads> selectAllSortAds(String str1, String str2) {
		SortadsExample example = new SortadsExample();
		Criteria criteria = example.createCriteria();

		if ((str1 != null || str1 != "") || (str2 != null || str2 != "")) {

			if (str1 != null || str1 != "") {
				criteria.andSortnameLike("%" + str1 + "%");
			}

			if (str2 != null || str2 != "") {
				criteria.andSortcontentLike("%" + str2 + "%");

			}
			return sortadsMapper.selectByExample(example);

		} else {

			return sortadsMapper.selectByExample(null);

		}
	}
    /**
     * 批量删除
     */
	@Override
	public void deleteBatch(List<Integer> ids) {
		AdslistExample example1=new AdslistExample();
		com.older.manager.bean.AdslistExample.Criteria criteria1=example1.createCriteria();
		criteria1.andSortadsidIn(ids);
		adslistMapper.deleteByExample(example1);
			
		
		SortadsExample example=new SortadsExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		sortadsMapper.deleteByExample(example);
		
	}

}
