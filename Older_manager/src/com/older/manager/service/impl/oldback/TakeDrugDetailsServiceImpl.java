package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.older.manager.bean.Takedrugdetails;
import com.older.manager.bean.TakedrugdetailsExample;
import com.older.manager.bean.TakedrugdetailsExample.Criteria;
import com.older.manager.mapper.TakedrugdetailsMapper;
import com.older.manager.service.oldback.TakeDrugDetailsService;
/**
 * 药物明细
 * @author 疯癫
 *
 */
@Service
public class TakeDrugDetailsServiceImpl implements TakeDrugDetailsService{
	
	  @Autowired
	  private TakedrugdetailsMapper takedrugdetailsMapper;
   /**
    * 增加药物明细
    */
	@Override
	public void addTakeDrugDetails(Takedrugdetails takedrugdetails) {
      
        takedrugdetailsMapper.insertSelective(takedrugdetails);	
	}
    /**
     * 删除药物明细
     */
	@Override
	public void deleteTakeDrugDetails(Integer id) {
		takedrugdetailsMapper.deleteByPrimaryKey(id);
		
	}
   /**
    * 修改药物明细
    */
	@Override
	public void updateTakeDrugDetails(Takedrugdetails takedrugdetails) {
		takedrugdetailsMapper.updateByPrimaryKeySelective(takedrugdetails);
		
	}
      /**
       * 通过id查
       */
	@Override
	public Takedrugdetails selectTakeDrugDetailsById(Integer id) {
		
		return takedrugdetailsMapper.selectByPrimaryKeyWithOlder(id);
	}
  
	/**
	 * 模糊查询全部
	 */
	@Override
	public List<Takedrugdetails> selectAllTakeDrugDetails(Takedrugdetails takedrugdetails) {
		
		return takedrugdetailsMapper.selectByExampleWithOlder(takedrugdetails);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {
		TakedrugdetailsExample example=new TakedrugdetailsExample();
		Criteria criteria=example.createCriteria();
			criteria.andIdIn(ids);	
		takedrugdetailsMapper.deleteByExample(example);
	}


}
