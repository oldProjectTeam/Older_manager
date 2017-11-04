package com.older.manager.controller.oldback.shop;

 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.BrandWithBLOBs;
import com.older.manager.service.oldback.shop.IBrandService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	IBrandService brandService;
	
	/**
	 * 分页查询所有品牌信息
	 * @param pageNum
	 * @param pageSize
	 * @param brand
	 * @return
	 */
	@RequestMapping("/findAllBrand")
	@ResponseBody
	public Msg findAllBrand(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,
			@RequestParam(value="pageSize",defaultValue="10")Integer pageSize,BrandWithBLOBs brand){
		PageHelper.startPage(pageNum, pageSize);
		List<BrandWithBLOBs>brands=brandService.findAllBrand(brand);
		PageInfo pageInfo=new PageInfo(brands,5);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 插入品牌信息
	 * @param brand
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/insertBrand")
	@ResponseBody
	public Msg insertBrand( BrandWithBLOBs brand){
		boolean flag=false;
		try {
			brandService.insertBrand(brand);
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
	 * 查询品牌信息
	 * @param brand
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/findBrand")
	@ResponseBody
	public Msg findBrand( Integer id){
		boolean flag=false;
		BrandWithBLOBs brand=null;
		try {
			brand=brandService.findBrandById(id);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success().add("brand", brand);
			}else{
				return Msg.fail();
			}
		}
	}
	
	
	/**
	 * 更新品牌信息
	 * @param brand
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/updateBrand")
	@ResponseBody
	public Msg updateBrand(BrandWithBLOBs brand,HttpServletRequest request){
		boolean flag=false;
		if(brand==null) return Msg.fail();
		try {
			//先删除已有图片
			if(!"".equals(brand.getLogoimage())&&brand.getLogoimage()!=null){
				BrandWithBLOBs b=brandService.findBrandById(brand.getId());
				if(!"".equals(b.getLogoimage())&&b.getLogoimage()!=null){
					FileUtil.deleteFile(b.getLogoimage(), request);
				}
			}
			 brandService.updateBrand(brand);
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
	 * 删除品牌信息（单删除、批量删除）
	 * @param ids：id集合
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/deleteBrand/{ids}")
	@ResponseBody
	public Msg deleteBrand(@PathVariable("ids")String ids){
		boolean flag = false;
		try {
			if (ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<Integer>();
				String str[] = ids.split("-");
				for (String s : str) {
					del_ids.add(Integer.parseInt(s));
				}		
				brandService.batchDeleteBrand(del_ids);
			} else {
				Integer id = Integer.parseInt(ids);
				brandService.deleteBrand(id);
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
}
