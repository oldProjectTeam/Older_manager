package com.older.manager.service.impl.oldback;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Giftexchange;
import com.older.manager.bean.GiftexchangeExample;
import com.older.manager.mapper.GiftexchangeMapper;
import com.older.manager.service.oldback.IGiftexchangeService;
import com.older.manager.utils.UUIDTools;

@Service
public class GiftexchangServiceImpl implements IGiftexchangeService {

	@Autowired
	GiftexchangeMapper giftexchangeMapper;
	@Override
	public List<Giftexchange> selectGiftExchangeAndOldmanByCondition(
			Giftexchange giftexchange) {
		return giftexchangeMapper.selectGiftExchangeAndOldmanByCondition(giftexchange);
	}
	@Override
	public void insertGiftexchange(Giftexchange giftexchange) {
		// TODO Auto-generated method stub
		/**
		 * 自动设置兑换单号
		 */
		giftexchange.setExchangeno(UUIDTools.getUUId());
		
		/**
		 * 自动设置兑换时间
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			giftexchange.setExchangetime(sdf.parse(sdf.format(new Date())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		giftexchangeMapper.insertSelective(giftexchange);
	}
	@Override
	public void updateGiftexchange(Giftexchange giftexchange) {
		// TODO Auto-generated method stub
		giftexchangeMapper.updateByPrimaryKeySelective(giftexchange);
	}
	@Override
	public Giftexchange findGiftexchangeById(Integer id) {
		// TODO Auto-generated method stub
		return giftexchangeMapper.selectByPrimaryKey(id);
	}
	@Override
	public void deleteGiftexchange(Integer id) {
		// TODO Auto-generated method stub
		giftexchangeMapper.deleteByPrimaryKey(id);
	}
	@Override
	public void batchDeleteGiftexchange(List<Integer> ids) {
		// TODO Auto-generated method stub
		GiftexchangeExample example=new GiftexchangeExample();
		GiftexchangeExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		giftexchangeMapper.deleteByExample(example);
	}

}
