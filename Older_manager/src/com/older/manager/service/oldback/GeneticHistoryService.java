package com.older.manager.service.oldback;


import java.util.List;

import com.older.manager.bean.Genetichistory;

/**
 * 遗传病
 * @author 疯癫
 *
 */
public interface GeneticHistoryService {
	/**
	 * 增加
	 * @param genetichistory
	 */
     public void addGeneticHistory(Genetichistory genetichistory);
     /**
      * 删除
      * @param id
      */
     public void deleteGeneticHistory(Integer id);
     /**
      * 修改
      * @param genetichistory
      */
     public void updateGeneticHistory(Genetichistory genetichistory);
     /**
      * 通过id查一条
      * @param id
      * @return
      */
     public Genetichistory selectGeneticHistoryById(Integer id);
     /**
      * 模糊查询所有的
      * @param genetichistory
      * @return
      */
     public List<Genetichistory> selectAllGeneticHistory(Genetichistory genetichistory);
 	/**
 	 * 批量删除
 	 * 
 	 * @param ids
 	 */
 	public void deleteBatch(List<Integer> ids);
}
