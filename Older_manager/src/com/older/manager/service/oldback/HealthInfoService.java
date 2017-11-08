package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Healthinfo;

/**
 * 健康数据
 * @author 疯癫
 *
 */
public interface HealthInfoService {
    /**
     * 新增
     * @param healthinfo
     */
	public void addHealthInfo(Healthinfo healthinfo);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteHealthInfo(Integer id);
	/**
	 * 修改
	 * @param healthinfo
	 */
	public void updateHealthInfo(Healthinfo healthinfo);
	/**
	 * 通过id来查
	 * @param id
	 * @return
	 */
	public Healthinfo selectHealthInfoById(Integer id);
	/**
	 * 模糊查询
	 * @param healthinfo
	 * @return
	 */
	public List<Healthinfo> selectHealthInfo(Healthinfo healthinfo);
	/**
	 * 批量删除
	 * @param ids
	 */
    public void deleteBatch(List<Integer> ids);
}
