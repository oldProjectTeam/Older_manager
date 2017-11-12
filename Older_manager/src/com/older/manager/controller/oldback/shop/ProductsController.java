package com.older.manager.controller.oldback.shop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	 /**
	  * 根据条件分页查询所有产品信息
	  * @param product
	  * @return
	  * @throws Exception
	  */
		@RequestMapping("/getAllproduct")
		@ResponseBody
		public Map<String,Object> getAllproduct(Products product,Integer id) throws Exception{
			if(product!=null){
				if(product.getName()!=null&&!"".equals(product.getName())){
					product.setName(new String(product.getName().getBytes("ISO-8859-1"),"UTF-8"));
				}
			}
				 
			Map<String,Object> map = IProductService.selectByCondition(product);
			
			return map;
		}
   
		/**
		 * 单删、批量删除产品信息
		 * @param ids
		 * @param request
		 * @return
		 */
		@SuppressWarnings("finally")
		@RequestMapping("/deleteProduct")
		@ResponseBody
		public Msg deleteProduct(String ids,HttpServletRequest request){
			boolean flag = false;
			try {
				if (ids.contains("-")) {
					List<Integer> del_ids = new ArrayList<Integer>();
					String str[] = ids.split("-");
					for (String s : str) {
						del_ids.add(Integer.parseInt(s));
					}		
					IProductService.batchDeleteProduct(del_ids, request);
				} else {
					Integer id = Integer.parseInt(ids);
					IProductService.deleteProduct(id,request);
				}
				flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (flag) {
					return Msg.success();
				} else {
					return Msg.fail();
				}
			}
		}
		
		/**
		 * 根据id查询产品信息
		 * @param id
		 * @return
		 */
		@SuppressWarnings("finally")
		@RequestMapping("/findProduct/{id}")
		@ResponseBody
		public Msg findProduct(@PathVariable("id") Integer id){
			boolean flag = false;
			Products products=null;
			try {
				products=IProductService.findProduct(id);
				flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (flag) {
					return Msg.success().add("products", products);
				} else {
					return Msg.fail();
				}
			}
		}
		
		/**
		 * 商品详细
		 * @param id
		 * @param modal
		 * @return
		 * @throws Exception
		 */
		@SuppressWarnings("finally")
		@RequestMapping("/productDetail")
		public ModelAndView productDetail(Integer id,ModelAndView modal) throws Exception{
			 Products product=IProductService.findProduct(id);
			 modal.addObject("product",product);
			 modal.setViewName("/oldback/oldbackshopping/product_Detail");
			 return modal;
		}
	 
		/**
		 * 更新产品信息
		 * @param product
		 * @param result
		 * @param request
		 * @return
		 */
		@SuppressWarnings("finally")
		@RequestMapping("/updateProduct")
		@ResponseBody
		public Msg updateProduct(@Valid Products product,BindingResult result,HttpServletRequest request){
			boolean flag=false;
			//校验数据是否不符合规则
			if(result.hasErrors()){
				List<FieldError>list=result.getFieldErrors();
				Map<String, Object>map=new HashMap<String, Object>();
				for(FieldError fieldError:list){
					map.put(fieldError.getField(), fieldError.getDefaultMessage());
				}
				return Msg.fail().add("error", map);
			}
			try {
				IProductService.updateProduct(product, request);
				System.out.println("product------>"+product);
				//判断是否应该更新关键词
				if(product.getProductKeyword()!=null){
					productKeywordService.updateProductKeyword(product.getProductKeyword());
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

		 
		@RequestMapping("/product_edit")
		public ModelAndView product_edit(Integer id,ModelAndView modal) throws Exception{
			 Products product=IProductService.findProduct(id);
			 modal.addObject("product",product);
			 modal.setViewName("/oldback/oldbackshopping/product_edit");
			 return modal;
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
	public Msg insertProduct(@Valid Products product,BindingResult result)throws Exception{
		boolean flag=false;
		//校验数据是否不符合规则
		if(result.hasErrors()){
			List<FieldError>list=result.getFieldErrors();
			Map<String, Object>map=new HashMap<String, Object>();
			for(FieldError fieldError:list){
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("error", map);
		}
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
	
	/**
	 * 修改产品状态（使用状态、审核状态）
	 * @param product
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/updateState")
	@ResponseBody
	public Msg updateStateAndAuditstatus(Products product){
		boolean flag = false;
		try {
		    IProductService.updateStateAndAuditstatus(product);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		}
	}
}
