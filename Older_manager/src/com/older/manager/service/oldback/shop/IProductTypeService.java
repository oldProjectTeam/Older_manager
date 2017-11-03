package com.older.manager.service.oldback.shop;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.older.manager.bean.ProductType;
import com.older.manager.bean.ProductTypeExample;


public interface IProductTypeService {

	/**
	 * 显示全部产品分类信息
	 * @return
	 */
	public  List<ProductType> findAllProductType(ProductTypeExample example);
	
	/**
	 * 有选择的插入产品分类信息
	 * @param productType
	 */
	public void insertProductType(ProductType productType);
	
	/**
	 * 有选择的更新产品分类信息
	 * @param productType
	 */
	public void updateProductType(ProductType productType);
	
	/**
	 * 根据主键查询产品分类信息
	 * @param id
	 * @return 
	 */
	public ProductType findProductTypeById(Integer id);
	
	/**
	 * 修改类型信息时，校验类型名称是否合法
	 * @param id
	 * @param name
	 * @return
	 */
	public Boolean update_checkName(Integer id,String name);
	
	/**
	 * 新增子类型信息时，校验类型名称是否冲突
	 * @param name
	 * @return
	 */
	public  Boolean add_checkName(String name);
	
	/**
	 * 根据id设置该类型为禁止或者为启用状态
	 * @param id
	 */
	public void banProductType(Integer id);
	
	/**
	 * 删除类型信息
	 * @param id
	 */
	public void deleteProductType(Integer id);
}
