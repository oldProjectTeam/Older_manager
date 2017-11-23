package com.older.manager.controller.oldfront;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
 
import com.older.manager.bean.Bloodtransfusion;
import com.older.manager.service.oldfront.IBloodtransfusionService;
import com.older.manager.utils.Msg;

/**
 * 输血请求处理类
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/bloodtransfusion")
public class BloodtransfusionController {

	@Autowired
	IBloodtransfusionService bloodtransfusionService;
	
	/**
	 * @Title:   initBinder
	 * @Description:  解决上传时间转换问题
	 * @param:    @param binder   
	 * @return:   void   
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
	 * 根据老人id分页查询所有输血信息
	 * @param bloodtransfusion
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(Bloodtransfusion bloodtransfusion,@RequestParam(value="pn",defaultValue="1")Integer pn)throws Exception{
		if(!Pattern.matches("[\\d]+",bloodtransfusion.getOldmanId()+"")){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 5);
		List<Bloodtransfusion>diseases=bloodtransfusionService.findAll(bloodtransfusion);
		PageInfo pageInfo=new PageInfo(diseases,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
 /**
  * 添加输血记录
  * @param bloodtransfusion
  * @param result
  * @return
  */
	@RequestMapping("/insertBloodtransfusion")
	@ResponseBody
	public Msg insertBloodtransfusion(@Valid Bloodtransfusion bloodtransfusion,BindingResult result){
		if(result.hasErrors()){
			return Msg.fail();
		}
		try {
			bloodtransfusionService.insertBloodtransfusion(bloodtransfusion);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
 
	/**
	 * 根据id获取输血详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/findBloodtransfusion/{id}")
	@ResponseBody
	public Msg findBloodtransfusion(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+", id+"")){
			 return Msg.fail();
		 }
		 Bloodtransfusion bloodtransfusion=null;
		try {
			bloodtransfusion=bloodtransfusionService.findBloodtransfusion(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success().add("bloodtransfusion", bloodtransfusion);
	}
	
	 /**
	  * 更新输血信息
	  * @param bloodtransfusion
	  * @return
	  */
	@RequestMapping("/updateBloodtransfusion")
	@ResponseBody
	public Msg updateBloodtransfusion(Bloodtransfusion bloodtransfusion){
		 if(!Pattern.matches("[\\d]+", bloodtransfusion.getId()+"")){
			 return Msg.fail();
		 }
		try {
			bloodtransfusionService.updateBloodtransfusion(bloodtransfusion);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	 
	@RequestMapping(value="/deleteBloodtransfusion/{id}")
	@ResponseBody
	public Msg deleteBloodtransfusion(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+",id+"")){
			 return Msg.fail();
		 }
		try {
			bloodtransfusionService.deleteBloodtransfusion(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
}
