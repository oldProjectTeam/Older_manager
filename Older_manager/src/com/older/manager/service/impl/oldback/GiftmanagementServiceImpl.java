package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Giftmanagement;
import com.older.manager.bean.GiftmanagementExample;
import com.older.manager.mapper.GiftmanagementMapper;
import com.older.manager.service.oldback.IGiftmanagementService;
import com.older.manager.utils.UUIDTools;

@Service
public class GiftmanagementServiceImpl implements IGiftmanagementService {

	@Autowired
	GiftmanagementMapper giftmanagementMapper;
	@Override
	public List<Giftmanagement> queryAllGift(Giftmanagement giftmanagement) {
		// TODO Auto-generated method stub
		 
		return giftmanagementMapper.selectByCondiction(giftmanagement);
	}

	@Override
	public void insertGift(Giftmanagement giftmanagement) {
		// TODO Auto-generated method stub
		giftmanagement.setGiftnumber(UUIDTools.getUUId());
		giftmanagement.setLowernumber(0);
		giftmanagementMapper.insertSelective(giftmanagement);
	}

	@Override
	public void updateGift(Giftmanagement giftmanagement) {
		// TODO Auto-generated method stub
		giftmanagementMapper.updateByPrimaryKeySelective(giftmanagement);
	}

	@Override
	public Giftmanagement findGiftmanagementById(Integer id) {
		// TODO Auto-generated method stub
		return giftmanagementMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteGift(Integer id) {
		giftmanagementMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeleteGift(List<Integer> ids) {
		// TODO Auto-generated method stub
		GiftmanagementExample example=new GiftmanagementExample();
		GiftmanagementExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		giftmanagementMapper.deleteByExample(example);
	}

}
