package com.older.manager.service.impl.oldback.shop;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductType;
import com.older.manager.bean.ProductTypeExample;
import com.older.manager.bean.ProductTypeExample.Criteria;
import com.older.manager.mapper.ProductTypeMapper;
import com.older.manager.service.oldback.shop.IProductTypeService;

@Service
public class ProductTypeServiceImpl implements IProductTypeService {

	@Autowired
	ProductTypeMapper productTypeMapper;
	 

	@Override
	public void insertProductType(ProductType productType) {
		//状态默认为启用
		productType.setState(1);
		//生成时间为当前系统时间
		productType.setCreatetime(new Date());
		productTypeMapper.insertSelective(productType);
	}

	@Override
	public void updateProductType(ProductType productType) {
		// TODO Auto-generated method stub
		productTypeMapper.updateByPrimaryKeySelective(productType);
	}

	@Override
	public ProductType findProductTypeById(Integer id) {
		// TODO Auto-generated method stub
		return productTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ProductType> findAllProductType(ProductTypeExample example) {
		// TODO Auto-generated method stub
		return productTypeMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public Boolean update_checkName(Integer id, String name) {
		ProductType productType=productTypeMapper.selectByPrimaryKey(id);
		ProductTypeExample example=new ProductTypeExample();
		ProductTypeExample.Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(name);
		List<ProductType>list=productTypeMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			if(list.size()<2&&list.get(0).getName().equals(productType.getName())){
				return true;
			}else{
				return false;
			}
		}
		return true;
	}

	@Override
	public Boolean add_checkName(String name) {
		ProductTypeExample example=new ProductTypeExample();
		ProductTypeExample.Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(name);
		List<ProductType>list=productTypeMapper.selectByExample(example);
		if(list!=null&&list.size()>0)return false;
		return true;
	}

	@Override
	public void banProductType(Integer id) {
		// TODO Auto-generated method stub
		ProductType productType=productTypeMapper.selectByPrimaryKey(id);
		ProductType update=new ProductType();
		update.setId(id);
		if(productType.getState()==0){
			update.setState(1);
		}else{
			update.setState(0);
		}
		productTypeMapper.updateByPrimaryKeySelective(update);
	}

	@Override
	public void deleteProductType(Integer id) {
		// TODO Auto-generated method stub
		productTypeMapper.deleteByPrimaryKey(id);
	}

}
