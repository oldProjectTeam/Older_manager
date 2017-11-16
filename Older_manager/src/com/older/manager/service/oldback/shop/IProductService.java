package com.older.manager.service.oldback.shop;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hslf.record.ExVideoContainer;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.Products;

public interface IProductService {

	 
	/**
	 * 添加产品
	 * @param products
	 */
	void  insertProducts(Products products);
	 
	
	/**
	 * 分页查询所有产品
	 * @param product
	 * @return
	 * @throws Exception
	 */
	Map<String, Object>selectByCondition(Products product)throws Exception;
	
	/**
	 * 根据Id查询产品信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Products findProduct(Integer id)throws Exception;
	
	/**
	 * 根据id删除产品
	 * @param id
	 * @throws Exception
	 */
	public void deleteProduct(Integer id,HttpServletRequest request)throws Exception;
	
	/**
	 * 批量删除产品
	 * @param ids：Id集合
	 * @throws Exception
	 */
	public void batchDeleteProduct(List<Integer>ids,HttpServletRequest request)throws Exception;
	
	/**
	 * 有选择的更新产品信息
	 * @param products
	 */
	public void updateProduct(Products products,HttpServletRequest request)throws Exception;
	
	/**
	 * 根据Id删除图片
	 * @param id
	 * @param imgName
	 * @throws Exception
	 */
	public void deleteImg(Integer id,String imgName,HttpServletRequest request)throws Exception;


	/**
	 * 修改产品状态和审核状态
	 * @param product
	 */
	public void updateStateAndAuditstatus(Products product);


	Products findProductById(Integer id) throws Exception;
	
	 

}
