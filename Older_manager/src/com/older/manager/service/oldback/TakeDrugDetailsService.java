package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Takedrugdetails;

/**
 * 服用药物明细
 * @author 疯癫
 *
 */
public interface TakeDrugDetailsService {
	/**
	 * 增加药物明细
	 * @param takedrugdetails
	 */
	public void addTakeDrugDetails(Takedrugdetails takedrugdetails);
	/**
	 * 删除药物明细
	 * @param id
	 */
    public void  deleteTakeDrugDetails(Integer id);
    /**
     * 修改药物明细
     * @param takedrugdetails
     */
    public void  updateTakeDrugDetails(Takedrugdetails takedrugdetails);
    /**
     * 通过id查一条数据
     * @param id
     */
    public Takedrugdetails   selectTakeDrugDetailsById(Integer id);
    
    /**
     * 模糊查询全部
     * @return
     */
    public List<Takedrugdetails>  selectAllTakeDrugDetails(Takedrugdetails takedrugdetails);
    /**
	 * 批量删除
	 * @param ids
	 */
    public void deleteBatch(List<Integer> ids);
}
