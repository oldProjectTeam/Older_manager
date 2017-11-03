package com.older.manager.controller.oldback.shop;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.ProductType;
import com.older.manager.service.oldback.shop.IProductTypeService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/productType")
public class ProductTypeController {

	@Autowired
	IProductTypeService productTypeService;
	
	/**
	 * 查询所有分类信息
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/findAllProductType")
	@ResponseBody
	public Msg findAllProductType(){
		boolean flag=false;
		List<ProductType>list=new ArrayList<ProductType>();
		try {
			list=productTypeService.findAllProductType(null);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success().add("productTypes", list);
			}else{
				return Msg.fail();
			}
		}
	}
	
	/**
	 * 有选择的插入产品分类信息
	 * @param productType
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/insertProductType")
	@ResponseBody
	public Msg insertProductType(@Valid ProductType productType,BindingResult result){
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
			 productTypeService.insertProductType(productType);
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
	 * 有选择的更新产品分类信息
	 * @param productType
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/updateProductType")
	@ResponseBody
	public Msg updateProductType(@Valid  ProductType productType,BindingResult result){
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
			 productTypeService.updateProductType(productType);
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
	 * 查询单个类型信息
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/product-category-add")
	public ModelAndView findProductType(Integer id,ModelAndView model){
		model.setViewName("/oldback/oldbackshopping/product-category-add");
		try {
			ProductType productType=productTypeService.findProductTypeById(id);
			model.addObject("productType", productType);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return model;
	}
	
	/**
	 * 修改类型信息时，校验类型名称
	 * @param id
	 * @param name
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/update_checkName")
	@ResponseBody
	public Msg update_checkName(Integer id,String name) throws Exception{
		boolean flag=false;
		if(name==null||"".equals(name))return Msg.fail();
		name=new String(name.getBytes("ISO-8859-1"),"utf-8");
		try {
			flag=productTypeService.update_checkName(id, name);
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
	 * 新增类型时，校验类型名称是否可用
	 * @param name
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/add_checkName")
	@ResponseBody
	public Msg add_checkName(String name) throws Exception{
		boolean flag=false;
		if(name==null||"".equals(name))return Msg.fail();
		name=new String(name.getBytes("ISO-8859-1"),"utf-8");
		try {
			flag=productTypeService.add_checkName(name);
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
	 * 禁止或启用产品类型信息
	 * @param id
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/banProductType")
	@ResponseBody
	public Msg banProductType(Integer id){
		boolean flag=false;
		if(id==null||"".equals(id))	return Msg.fail();
		try {
			productTypeService.banProductType(id);
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
	 * 删除产品类型信息
	 * @param id
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/deleteProductType")
	@ResponseBody
	public Msg deleteProductType(Integer id){
		boolean flag=false;
		if(id==null||"".equals(id))	return Msg.fail();
		try {
			productTypeService.deleteProductType(id);
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
