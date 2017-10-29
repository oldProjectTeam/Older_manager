package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






import com.older.manager.bean.Relatives;
import com.older.manager.bean.RelativesExample;
import com.older.manager.bean.RelativesExample.Criteria;
import com.older.manager.mapper.RelativesMapper;
import com.older.manager.service.oldback.OldRelativesService;


@Service
public class OldRelativesServiceImpl implements OldRelativesService{

	
	 @Autowired
	 private RelativesMapper  relativesMapper;
	
	
	/**
	 * 增加老人关系
	 */
	@Override
	public void addOlderRelative(Relatives relatives) {
		relativesMapper.insertSelective(relatives);
		
	}
      /**
       * 删除老人关系
       */
	@Override
	public void deleteOlderRelative(Integer id) {
		relativesMapper.deleteByPrimaryKey(id);
		
	}
       /**
        * 修改老人关系
        */
	@Override
	public void updateOlderRelative(Relatives relatives) {
		relativesMapper.updateByPrimaryKeySelective(relatives);
		
	}
       /**
        * 通过id查询老人关系
        */
	@Override
	public Relatives selectOlderRelative(Integer id) {
		
		return relativesMapper.selectByPrimaryKey(id);
	}
	
	
	
	
        /**
         * 查询全部老人关系
         */
	@Override
	public List<Relatives> selectAllOlderRelative() {
		
		return relativesMapper.selectByExample(null);
	}
	
	
	/**
	 * 通过老人的id来查看所有的与老人有关系的人
	 */
		@Override
		public List<Relatives> selectOlderRelativesByOlderId(Integer id) {
			RelativesExample example=new RelativesExample();
			Criteria criteria=example.createCriteria();
			criteria.andOldmanIdEqualTo(id);
			List<Relatives> list=relativesMapper.selectByExample(example);
			return list;
      }
		
		/**
		 * 批量删除
		 * @param ids
		 */
		public void deleteBatch(List<Integer> ids) {
			RelativesExample example=new RelativesExample();
			Criteria criteria=example.createCriteria();
			criteria.andIdIn(ids);
			relativesMapper.deleteByExample(example);
			
		}
}
