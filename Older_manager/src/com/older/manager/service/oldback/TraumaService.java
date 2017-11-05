package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Trauma;

/**
 * 外伤列表
 * @author 疯癫
 *
 */
public interface TraumaService {
    /**
     * 增加
     * @param trauma
     */
	public void addTrauma(Trauma trauma);
	/**
	 * 删除
	 * @param id
	 */
	public void  deleteTrauma(Integer id);
	/**
	 * 修改
	 * @param trauma
	 */
	public void  updateTrauma(Trauma trauma);
	/**
	 * 通过id来查
	 * @param id
	 * @return
	 */
	public Trauma selectTrauma(Integer id);
	/**
	 * 模糊查询所有的
	 * @param trauma
	 * @return
	 */
	public List<Trauma> selectTrauma(Trauma trauma);

	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids);
}
