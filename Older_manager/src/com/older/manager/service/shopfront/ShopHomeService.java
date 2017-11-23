/**
 * 
 */
package com.older.manager.service.shopfront;

import java.util.List;



import com.older.manager.bean.ProductType;

/**
 * @author ym
 * @date 2017年11月20日 下午8:37:00
 */
public interface ShopHomeService {


	/**
	 * @Title:   findAllProductTypesAndBrand
	 * @Description:  查询所有的产品类型和品牌
	 * @param:    @return   
	 * @return:   List<ProductType>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月20日 下午8:40:21
	 */
	public List<ProductType> findAllProductTypesAndBrand();
	
	/**
	 * @Title:   findAllProductTypeAndProducts
	 * @Description:  查询所有的产品类型和商品
	 * @param:    @return   
	 * @return:   List<ProductType>   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月21日 上午9:01:48
	 */
	public List<ProductType> findAllProductTypeAndProducts();
	
	
}
