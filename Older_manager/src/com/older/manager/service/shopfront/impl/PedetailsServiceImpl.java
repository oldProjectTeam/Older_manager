package com.older.manager.service.shopfront.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Pedetails;
import com.older.manager.mapper.PedetailsMapper;
import com.older.manager.service.shopfront.IPedatilsService;
@Service
public class PedetailsServiceImpl implements IPedatilsService {
	@Autowired
	private PedetailsMapper pedetailsMapper;
	
	
	@Override
	public void insertPeDetails(Pedetails pedetails) {
		if(pedetails!=null){
			pedetailsMapper.insertSelective(pedetails);
		}
	}

	@Override
	public void updateDetails(Pedetails pedetails) {
		if (pedetails!=null) {
			pedetailsMapper.updateByPeinfoID(pedetails);
		}
	}

}
