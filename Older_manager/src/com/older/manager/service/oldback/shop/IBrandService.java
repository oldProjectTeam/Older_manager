package com.older.manager.service.oldback.shop;

import java.util.List;

 
import com.older.manager.bean.BrandWithBLOBs;

public interface IBrandService {
	/**
	 * 添加品牌信息
	 * @param brand
	 */
	public void insertBrand(BrandWithBLOBs brand);
	/**
	 * 修改品牌信息
	 * @param brand
	 */
	public void updateBrand(BrandWithBLOBs brand);
	/**
	 * 删除品牌
	 * @param id
	 */
	public void deleteBrand(Integer id);
	/**
	 * 批量删除品牌信息
	 * @param ids
	 */
	public void batchDeleteBrand(List<Integer>ids);
	/**
	 * 根据ID查询品牌信息
	 * @param id
	 * @return
	 */
	public BrandWithBLOBs findBrandById(Integer id);
	
	/**
	 * 查询所有品牌信息
	 * @param brand
	 * @return
	 */
	public List<BrandWithBLOBs>findAllBrand(BrandWithBLOBs brand);
	
	/**
	 * 修改状态
	 * @param id：ID
	 * @param state:0;1
	 */
	public void updateState(BrandWithBLOBs brand);
	 
}
