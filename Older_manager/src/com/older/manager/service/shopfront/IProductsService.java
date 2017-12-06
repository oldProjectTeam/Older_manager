package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Products;

public interface IProductsService {
	
	public Products findById(Integer id);
	
	/**
	 * @Title:   findAllProductsTypeDetial
	 * @Description:  查找产品的类型详细分布
	 * @param:    @return   
	 * @return:   List<Products>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月20日 上午1:13:09
	 */
	public List<Products> findAllProductsTypeDetial();

	/**
	 * 添加足迹
	 * @param id
	 * @param id2
	 */
	public void addFoot(Integer id, Integer id2);
}
