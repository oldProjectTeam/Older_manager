package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Genetichistory;
import com.older.manager.bean.GenetichistoryExample;
import com.older.manager.mapper.GenetichistoryMapper;
import com.older.manager.service.oldfront.IGenetichistoryService;

@Service
public class GenetichistoryServiceImpl implements IGenetichistoryService {

	@Autowired
	GenetichistoryMapper genetichistoryMapper;
	@Override
	public List<Genetichistory> findAll(Genetichistory genetichistory)
			throws Exception {
		 GenetichistoryExample example=new GenetichistoryExample();
		 GenetichistoryExample.Criteria criteria=example.createCriteria();
		 criteria.andOldmanIdEqualTo(genetichistory.getOldmanId());
		 if(genetichistory!=null){
			 if(genetichistory.getInfectiontime1()!=null&&genetichistory.getInfectiontime2()!=null){
				 criteria.andInfectiontimeBetween(genetichistory.getInfectiontime1(), genetichistory.getInfectiontime2());
			 }
		 }
		return genetichistoryMapper.selectByExample(example);
	}

	@Override
	public void insertGenetichistory(Genetichistory genetichistory)
			throws Exception {
		genetichistoryMapper.insertSelective(genetichistory);
	}

	@Override
	public void updateGenetichistory(Genetichistory genetichistory)
			throws Exception {
		genetichistoryMapper.updateByPrimaryKeySelective(genetichistory);

	}

	@Override
	public Genetichistory findGenetichistory(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return genetichistoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteGenetichistory(Integer id) throws Exception {

		genetichistoryMapper.deleteByPrimaryKey(id);
	}

}
