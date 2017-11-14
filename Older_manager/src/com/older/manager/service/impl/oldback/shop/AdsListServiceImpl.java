package com.older.manager.service.impl.oldback.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Adslist;
import com.older.manager.bean.AdslistExample;
import com.older.manager.bean.AdslistExample.Criteria;
import com.older.manager.mapper.AdslistMapper;
import com.older.manager.service.oldback.shop.AdsListService;
/**
 * 广告列表
 * @author 疯癫
 *
 */
@Service
public class AdsListServiceImpl implements AdsListService{
	@Autowired
	private AdslistMapper adslistMapper;

	@Override
	public void addAdsList(Adslist adsList) {
		// TODO 自动生成的方法存根
		adslistMapper.insertSelective(adsList);
	}

	@Override
	public void deleteAdsList(Integer id) {
		// TODO 自动生成的方法存根
		adslistMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateAdsList(Adslist adsList) {
		// TODO 自动生成的方法存根
		adslistMapper.updateByPrimaryKeySelective(adsList);
	}

	@Override
	public Adslist selectAdsListById(Integer id) {
		// TODO 自动生成的方法存根
		return adslistMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Adslist> selectAllAds(String str,Integer id) {
		if (id==null||id==0) {
			return adslistMapper.selectByExample(null);
		}
		if (str==null||str=="") {
			AdslistExample example=new AdslistExample();
			Criteria criteria=example.createCriteria();
			criteria.andSortadsidEqualTo(id);
			return adslistMapper.selectByExample(example);
		}else{
		AdslistExample example=new AdslistExample();
		Criteria criteria=example.createCriteria();
		criteria.andSortadsidEqualTo(id);
		criteria.andSortnameLike("%"+str+"%");
		return adslistMapper.selectByExample(example);
	}


	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		// TODO 自动生成的方法存根
		AdslistExample example=new AdslistExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		adslistMapper.deleteByExample(example);
	}

	@Override
	public int selectTotal() {
		
		return adslistMapper.countByExample(null);
	}

	@Override
	public int selectTotalWith(int id) {
		AdslistExample example=new AdslistExample();
		Criteria criteria=example.createCriteria();
		criteria.andSortadsidEqualTo(id);
		return adslistMapper.countByExample(example);
	}
}
