package com.older.manager.controller.oldback;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Healthinfo;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.HealthInfoService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/healthinfo")
public class HealthInfoController {
	@Autowired
	private HealthInfoService healthInfoService;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值
	/**
	 * 模糊查询所有的
	 * @param pn
	 * @param oldmanname
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectallhealthinfo/{pn}")
	@ResponseBody
	public Msg selectAllHealthInfo(@RequestParam(value="pn",defaultValue="1") Integer pn,
			@RequestParam(value="oldmanname",defaultValue="") String oldmanname)throws Exception{
		    Healthinfo healthinfo=new Healthinfo();
		    Oldman oldman=new Oldman();
		    oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
		    healthinfo.setOldman(oldman);
		    
		    PageHelper.startPage(pn,5);
		    List<Healthinfo> all=healthInfoService.selectHealthInfo(healthinfo);
		    PageInfo  pageInfo=new PageInfo(all,5);
		    return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 通过id来删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletehealthinfo/{id}")
	@ResponseBody
	public Msg deleteHealthInfo(@PathVariable("id")Integer id){
		healthInfoService.deleteHealthInfo(id);
		return Msg.success();
	}

	
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deleteallhealthinfo/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			healthInfoService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			healthInfoService.deleteHealthInfo(id);
		}
		
		return Msg.success();
	} 
    /**
     * 跳到增加页面
     * @return
     */
   @RequestMapping("/skipaddhealthinfo/{pn}")	
   public String  skipAddHealthInfo(@PathVariable("pn")Integer pn){
	   return "oldback/healthManage/addhealthInfo";
   }
   
   /**
    * 增加
    * @param healthinfo
    * @return
    */
	@RequestMapping("/addhealthinfo")
	@ResponseBody
	public Msg  addHealthInfo(@Valid Healthinfo healthinfo,BindingResult result){
		List<Map<String, Object>> errorList = new ArrayList<Map<String, Object>>();
		if (result.hasErrors()) {
			for (FieldError fieldError : result.getFieldErrors()) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("fieldName", fieldError.getField());
				map.put("errorMessage", fieldError.getDefaultMessage());
				errorList.add(map);
				System.out.println("出错的字段名为:------------->"
						+ fieldError.getField());
				System.out.println("出错信息为:---------------->"
						+ fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorlist", errorList);
		}else{
			healthInfoService.addHealthInfo(healthinfo);
			return Msg.success();
			
		}
		
	} 
	  /**
	   * 查
	   * @param id
	   * @param model
	   * @return
	   */
	  @RequestMapping("/selecthealthinfobyid/{id}&{pn}")
	  public String selectHealthInfoByid(@PathVariable("id")Integer id, Model model,@PathVariable("pn")Integer pn){
		  Healthinfo healthinfo=healthInfoService.selectHealthInfoById(id);
		  model.addAttribute("healthinfo", healthinfo);
		  return "oldback/healthManage/updatehealthinfo";
	  } 
	  
	  /**
	   * 查
	   * @param id
	   * @param model
	   * @return
	   */
	  @RequestMapping("/selecthealthinfobyidtwo/{id}&{pn}")
	  public String selectHealthInfoByidtwo(@PathVariable("id")Integer id, Model model,@PathVariable("pn")Integer pn){
		  Healthinfo healthinfo=healthInfoService.selectHealthInfoById(id);
		  model.addAttribute("healthinfo", healthinfo);
		  return "oldback/healthManage/selecthealthinfo";
	  } 
	  /**
	   * 修改
	   * @param id
	   * @param healthinfo
	   * @return
	   */
	  @RequestMapping("/updatehealthinfo/{id}")
	  @ResponseBody
	  public Msg updateHealthinfo(@Valid Healthinfo healthinfo,BindingResult result){
		  List<Map<String, Object>> errorList = new ArrayList<Map<String, Object>>();
			if (result.hasErrors()) {
				for (FieldError fieldError : result.getFieldErrors()) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("fieldName", fieldError.getField());
					map.put("errorMessage", fieldError.getDefaultMessage());
					errorList.add(map);
					System.out.println("出错的字段名为:------------->"
							+ fieldError.getField());
					System.out.println("出错信息为:---------------->"
							+ fieldError.getDefaultMessage());
				}
				return Msg.fail().add("errorlist", errorList);
			}else {
				 healthInfoService.updateHealthInfo(healthinfo);
				  return Msg.success();
			}
		 
	  }
}
