package com.older.manager.shopfront.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Products;
import com.older.manager.service.shopfront.SearchService;
import com.older.manager.utils.Msg;

@Controller
public class SearchController {
	@Autowired
	private SearchService searchService; 
	
	//根据销量排序查询
	@RequestMapping("/salesOrPrices/{prod}")
	@ResponseBody
	public Msg salesOrPricesSorting(@RequestParam(value="pn",defaultValue="1")Integer pn,@PathVariable("prod")String prod){
		String prods=null;
		try {
			prods = new String(prod.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(prods!=null){
			Products products=new Products();
			String[] prodinfo=prods.split("-");
			
			if("销量".equals(prodinfo[0])){
				products.setSales(1);
				products.setImagetitle(prodinfo[1]);
			}else if("价格".equals(prodinfo[0])){
				products.setNowprice(1.0);
				products.setImagetitle(prodinfo[1]);
			}
			PageHelper.startPage(pn,15);
			List<Products> info= searchService.salesSorting(products);
			PageInfo pageInfo=new PageInfo(info,5);
			return Msg.success().add("pageInfo", pageInfo);
		}else{
			return Msg.fail();
		}
	}
	
}
