package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
import java.util.List;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Pedetails;
import com.older.manager.bean.PedetailsExample;
import com.older.manager.bean.PedetailsExample.Criteria;
import com.older.manager.bean.Peinfo;
import com.older.manager.mapper.PedetailsMapper;
import com.older.manager.mapper.PeinfoMapper;
import com.older.manager.service.oldback.PeService;
/**
 * 体检记录
 * @author 疯癫
 *
 */
@Service
public class PeServiceImpl implements PeService{
    @Autowired
	private  PedetailsMapper pedetailsMapper;
	@Autowired
    private  PeinfoMapper  peinfoMapper;
    /**
     * 新增体检记录
     */
	@Override
	public void addPe(Pedetails pedetails) {
		
		pedetailsMapper.insertSelective(pedetails);
	}
    
	/**
	 * 删除体检记录
	 */
	@Override
	public void deletePe(Integer id) {
		Pedetails pedetails=pedetailsMapper.selectByPrimaryKey(id);
		pedetailsMapper.deleteByPrimaryKey(id);
		peinfoMapper.deleteByPrimaryKey(pedetails.getPeinfoId());
	}
    /**
     * 修改
     */
	@Override
	public void updatePe(Pedetails pedetails) {
		pedetailsMapper.updateByPrimaryKeySelective(pedetails);
		
	}
     /**
      * 查一条
      */
	@Override
	public Pedetails selectPeById(Integer id) {
		
		return pedetailsMapper.selectByPrimaryKeyWithOldAndPe(id);
	}

	/**
	 * 查全部
	 */
	@Override
	public List<Pedetails> selectAllPe(Pedetails pedetails) {
		
		return pedetailsMapper.selectByExampleWithOldAndPe(pedetails);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {
		
		   List<Integer> peinfoid= new ArrayList<Integer>();
		   for (Integer integer : ids) {
			    Pedetails pedetails=pedetailsMapper.selectByPrimaryKey(integer);
			    peinfoid.add(pedetails.getPeinfoId());
    		}
		   PedetailsExample example=new PedetailsExample();
		   Criteria criteria=example.createCriteria();
		   criteria.andIdIn(ids);
		   pedetailsMapper.deleteByExample(example);
		   
		   for (Integer integer : peinfoid) {
			   peinfoMapper.deleteByPrimaryKey(integer);
		}
		   
	}
      /**
       * 增加体检信息
       */
	@Override
	public void addPeInfo(Peinfo peinfo) {
		peinfoMapper.insertSelective(peinfo);
		
	}
    /**
     * 修改体检信息
     */
	@Override
	public void updatePeInfo(Peinfo peinfo) {
		peinfoMapper.updateByPrimaryKeySelective(peinfo);
		
	}
}
