package com.older.manager.service.shopfront.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Pedetails;
import com.older.manager.bean.Peinfo;
import com.older.manager.mapper.PedetailsMapper;
import com.older.manager.mapper.PeinfoMapper;
import com.older.manager.service.shopfront.IPeInfoService;

@Service
public class PeInfoServiceImpl implements IPeInfoService {
	@Autowired
	private PeinfoMapper peinfoMapper;
	@Autowired
	private PedetailsMapper pedetailsMapper;
	
	@Override
	public List<Peinfo> queryPeinfos(int userId) {
		if(userId>0){
		  return peinfoMapper.selectPeinfoAndDetails(userId);
	
		}
		
		return null;
	}

	@Override
	public void deleteByID(int id) {
		if(id>0){
			peinfoMapper.deleteByPrimaryKey(id);
		}
	}


	@Override
	public List<Peinfo> selectPeinfoByHospital(Peinfo peinfo) {
		if(peinfo!=null){
		  try {
			String hospital=new String(peinfo.getHospital().getBytes("ISO-8859-1"),"UTF-8");
			peinfo.setHospital(hospital);
			
			return peinfoMapper.selectByHospitalAnduserId(peinfo);
		  } catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		}
		return null;
	}

	@Override
	public Integer updatePeinfos(Peinfo peinfo) {
		if(peinfo!=null){
			return peinfoMapper.updateByPrimaryKeySelective(peinfo);
		}
		return null;
	}

	@Override
	public int insertPeinfo(Peinfo peinfo) {
		if(peinfo!=null){
			return  peinfoMapper.insertSelective(peinfo);
		}
		return 0;
	}

	@Override
	public Peinfo queryByID(Integer id) {
		if(id!=null){
		  return peinfoMapper.selectByPeInfoId(id);
		}
		return null;
	}

}
