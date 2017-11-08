package com.older.manager.service.impl.oldback.shop;

import java.util.Date;
import java.util.List;

import org.apache.log4j.TTCCLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import com.older.manager.bean.ActivityenrolExample.Criteria;
import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.mapper.ProductKeywordMapper;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.utils.UUIDTools;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductsMapper productsMapper;
	 
	@Override
	public List<Products> selectProducts() {
		
		return productsMapper.selectByExample(null);
	}

	@Override
	public List<Products> selectCondition(Products products) {
		
		return productsMapper.selectCondition(products);
	}

	@Override
 
	public void insertProducts(Products products) {
		 
		products.setAddtime(new Date());
		products.setAuditstatus(0);//默认为待审核
		products.setState(0);//默认为停用
		//判断是否需要自动加上产品编号
		if(products.getNumber()==null||"".equals(products.getNumber())){
			products.setNumber(UUIDTools.getNumber());
		}
		productsMapper.insertSelective(products);
	}

	@Override
	public void deleteProducts(List<String> numbers) {
		ProductsExample example=new ProductsExample();
		 com.older.manager.bean.ProductsExample.Criteria 
		 create = example.createCriteria();
		 create.andNumberIn(numbers);
		productsMapper.deleteByExample(example);
		
	}

	@Override
	public void deleteByProduct(String number) {
		ProductsExample example=new ProductsExample();
		com.older.manager.bean.ProductsExample.Criteria 
		criteria = example.createCriteria();
		criteria.andNumberEqualTo(number);
		productsMapper.deleteByExample(example);
	}

	@Override
	public void updateByNumber(Products product) {
		productsMapper.updateByNumber(product);
	}
	

}
