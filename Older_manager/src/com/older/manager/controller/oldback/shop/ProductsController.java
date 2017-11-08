package com.older.manager.controller.oldback.shop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.Products;
import com.older.manager.service.oldback.shop.IProductKeywordService;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/shopping")
public class ProductsController {
   @Autowired
	private IProductService IProductService;
	
   @Autowired
   private IProductKeywordService productKeywordService;
   /**
	 * @Title: initBinder
	 * @Description: 解决上传时间转换问题
	 * @param: @param binder
	 * @return: void
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

   
   
   //查询所有产品信息
	@RequestMapping("/products")
	@ResponseBody
	public Msg getProductsInfo(@RequestParam(value="pn",defaultValue="1")Integer pn){
		PageHelper.startPage(pn,10);
		List<Products> products = IProductService.selectProducts();
		PageInfo pageInfo=new PageInfo(products,5);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	//根据条件查询产品
	@RequestMapping("/proCondition")
	@ResponseBody
	public Msg getProductsCondition(@RequestParam(value="pn",defaultValue="1")Integer pn,
			@RequestParam(value="pageSize",defaultValue="10")Integer pageSize,Products  products){
		System.out.println("信息为"+products.toString());
		
		PageHelper.startPage(pn,pageSize);
		List<Products> proInfo=IProductService.selectCondition(products);
		PageInfo pageInfo=new PageInfo(proInfo,5);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	//根据number集合删除
	@RequestMapping(value="/deleteProduct/{numbers}")
	@ResponseBody
	public Msg deletePorducts(@PathVariable("numbers")String numbers){
		if(numbers.contains("-")){
		String[] number=numbers.split("-");
		List<String> productList=new ArrayList<String>();
		for (String proNumbers : number) {
			productList.add(proNumbers);
			}
			IProductService.deleteProducts(productList);
			return Msg.success();
		}else{
			IProductService.deleteByProduct(numbers);
			return Msg.success();
		}
	}
	
	//根据number修改
	@RequestMapping("/updateProduct/{number}")
	@ResponseBody
	public Msg updateProdut(@PathVariable("number")String number,@RequestParam(value="state",defaultValue="1")int state){
		System.out.println("哈哈哈哈或"+number+"-"+state);
		Products products=new Products();
		products.setNumber(number);
		products.setState(state);
		IProductService.updateByNumber(products);
		return Msg.success();
	}
	
	/**
	 * 添加产品
	 * @param product
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/insertProduct")
	@ResponseBody
	public Msg insertProduct(Products product)throws Exception{
		boolean flag=false;
		try {
			IProductService.insertProducts(product);
			
			//判断是否应该添加关键词
			if(product.getProductKeyword()!=null){
				ProductKeyword productKeyword=product.getProductKeyword();
				productKeyword.setProductId(product.getId());
				productKeywordService.insertProductKeyword(productKeyword);
			}
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
}
