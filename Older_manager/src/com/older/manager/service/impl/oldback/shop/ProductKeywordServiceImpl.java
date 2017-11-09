package com.older.manager.service.impl.oldback.shop;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductKeyword;
import com.older.manager.mapper.ProductKeywordMapper;
import com.older.manager.service.oldback.shop.IProductKeywordService;

@Service
public class ProductKeywordServiceImpl implements IProductKeywordService {

	@Autowired
	private ProductKeywordMapper productKeywordMapper;
	@Override
	public void insertProductKeyword(ProductKeyword productKeyword) {
		 
			  if(productKeyword.getKeyword()!=null&&!"".equals(productKeyword.getKeyword())){
				  if(productKeyword.getKeyword().contains(" ")){
					  String[] keyword=productKeyword.getKeyword().split(" ");
					  int num=0;
					  for(String s:keyword){
						  if(" ".equals(s)||"  ".equals(s)){
							  continue;
						  }else{
							  num++;
						  }
					  }
					  productKeyword.setNumber(num);
				  }else{
					  productKeyword.setNumber(1);
				  }
				  productKeyword.setChangetime(new Date());
				  if(productKeyword.getProductId()!=null){
					  productKeyword.setProductId(productKeyword.getProductId());
					  productKeywordMapper.insertSelective(productKeyword);
				  }  
			  }
	}

}
