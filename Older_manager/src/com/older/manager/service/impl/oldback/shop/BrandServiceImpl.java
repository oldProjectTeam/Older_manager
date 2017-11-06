package com.older.manager.service.impl.oldback.shop;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.BrandExample;
import com.older.manager.bean.BrandWithBLOBs;
import com.older.manager.mapper.BrandMapper;
import com.older.manager.service.oldback.shop.IBrandService;
import com.older.manager.utils.UUIDTools;

@Service
public class BrandServiceImpl implements IBrandService {

	@Autowired
	BrandMapper brandMapper;
	
	@Override
	public void insertBrand(BrandWithBLOBs brand) {
		//自动设置编号
		brand.setBrandid(UUIDTools.getUUId());
		//自动设置为当前系统时间
		brand.setAddtime(new Date());
		brandMapper.insertSelective(brand);
	}

	@Override
	public void updateBrand(BrandWithBLOBs brand) {
		brandMapper.updateByPrimaryKeySelective(brand);
	}

	@Override
	public void deleteBrand(Integer id) {
		brandMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeleteBrand(List<Integer> ids) {
		BrandExample example=new BrandExample();
		BrandExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(ids);
		brandMapper.deleteByExample(example);
	}

	@Override
	public BrandWithBLOBs findBrandById(Integer id) {
		return brandMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<BrandWithBLOBs> findAllBrand(BrandWithBLOBs brand) {
		BrandExample example=new BrandExample();
		BrandExample.Criteria criteria=example.createCriteria();
		if(brand!=null){
			if(brand.getName()!=null&&!"".equals(brand.getName())){
				criteria.andNameLike("%"+brand.getName()+"%");
			}
			if(brand.getAddtime()!=null&&brand.getAddtime1()!=null){
				criteria.andAddtimeBetween(brand.getAddtime(), brand.getAddtime1());
			}
			if(brand.getRegion()!=null){
				if(brand.getRegion().equals("国内")){
					criteria.andRegionEqualTo("中国");
				}else{
					criteria.andRegionNotEqualTo("中国");
				}
			}
		}
		return brandMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void updateState(BrandWithBLOBs brand) {
			if(brand.getState()==1){
				brand.setState(0);
			}else{
				brand.setState(1);
			}
			brandMapper.updateByPrimaryKeySelective(brand);
	}

}
