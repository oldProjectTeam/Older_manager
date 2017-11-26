package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Takedrugdetails;

/**
 * 用药记录
 * @author 疯癫
 *
 */
public interface ITakeDrugService {
	
   /**
    * 增加用药记录
    * @param takedrugdetails
    */
   public void addTakeDrug(Takedrugdetails takedrugdetails);
	/**
	 * 删除
	 * @param id
	 */
   public void deleteTakeDrug(Integer id);
   /**
    * 修改
    * @param takedrugdetails
    */
   public void updateTakeDrug(Takedrugdetails takedrugdetails);
   /**
    * 通过id来查一条
    * @param id
    * @return
    */
   public Takedrugdetails selectTakeDrugById(Integer id);
   /**
    * 查询所有的
    * @param takedrugdetails
    * @return
 * @throws Exception 
    */
   public List<Takedrugdetails> selectAllTakeDrug(Takedrugdetails takedrugdetails);

}
