package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Trauma;
import com.older.manager.bean.TraumaExample;
import com.older.manager.mapper.TraumaMapper;
import com.older.manager.service.oldfront.ITraumaService;

@Service
public class TraumaSeviceImpl implements ITraumaService {

	@Autowired
	TraumaMapper traumaMapper;
	@Override
	public List<Trauma> findAll(Trauma trauma) throws Exception {
		 TraumaExample example=new TraumaExample();
		 TraumaExample.Criteria criteria=example.createCriteria();
		 criteria.andOldmanIdEqualTo(trauma.getOldmanId());
		 if(trauma!=null){
			 if(trauma.getOccurrencetime1()!=null&&trauma.getOccurrencetime2()!=null){
				 criteria.andOccurrencetimeBetween(trauma.getOccurrencetime1(), trauma.getOccurrencetime2());
			 }
		 }
		return traumaMapper.selectByExample(example);
	}

	@Override
	public void insertTrauma(Trauma trauma) throws Exception {
		// TODO Auto-generated method stub
		traumaMapper.insertSelective(trauma);
	}

	@Override
	public void updateTrauma(Trauma trauma) throws Exception {
		// TODO Auto-generated method stub
		traumaMapper.updateByPrimaryKeySelective(trauma);
	}

	@Override
	public Trauma findTrauma(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return traumaMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteTrauma(Integer id) throws Exception {
		// TODO Auto-generated method stub
		traumaMapper.deleteByPrimaryKey(id);
	}

}
