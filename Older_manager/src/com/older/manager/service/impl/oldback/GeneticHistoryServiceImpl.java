package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Genetichistory;
import com.older.manager.bean.GenetichistoryExample;
import com.older.manager.bean.GenetichistoryExample.Criteria;
import com.older.manager.mapper.GenetichistoryMapper;
import com.older.manager.service.oldback.GeneticHistoryService;
@Service
/**
 * 遗传病
 * @author 疯癫
 *
 */
public class GeneticHistoryServiceImpl implements GeneticHistoryService{
	@Autowired
    private GenetichistoryMapper genetichistoryMapper;
	/**
	 * 增加
	 */
	@Override
	public void addGeneticHistory(Genetichistory genetichistory) {
            genetichistoryMapper.insertSelective(genetichistory);		
	}
    /**
     * 删除
     */
	@Override
	public void deleteGeneticHistory(Integer id) {
            genetichistoryMapper.deleteByPrimaryKey(id);		
	}
    /**
     * 修改
     */
	@Override
	public void updateGeneticHistory(Genetichistory genetichistory) {
            genetichistoryMapper.updateByPrimaryKeySelective(genetichistory);		
	}
     /**
      * 通过id来查一条
      */
	@Override
	public Genetichistory selectGeneticHistoryById(Integer id) {
		return genetichistoryMapper.selectByPrimaryKeyWithOlder(id);
	}
    /**
     * 模糊查询所有的
     */
	@Override
	public List<Genetichistory> selectAllGeneticHistory(
			Genetichistory genetichistory) {
		return genetichistoryMapper.selectByExampleWithOlder(genetichistory);
	}
    /**
     * 批量删除
     */
	@Override
	public void deleteBatch(List<Integer> ids) {
              GenetichistoryExample example=new GenetichistoryExample();
              Criteria criteria=example.createCriteria();
              criteria.andIdIn(ids);
              genetichistoryMapper.deleteByExample(example);
	}

}
