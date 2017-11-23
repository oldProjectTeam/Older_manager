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
import com.older.manager.bean.Disease;
import com.older.manager.bean.Surgery;
import com.older.manager.service.oldfront.ISurgeryService;
import com.older.manager.utils.Msg;

/**
 * 手术信息处理类
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/surgery")
public class SurgeryController {

	@Autowired
	ISurgeryService surgeryService;
	
	
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
	 * 分页查询所有手术信息
	 * @param surgery
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(Surgery surgery,@RequestParam(value="pn",defaultValue="1")Integer pn)throws Exception{
		if(!Pattern.matches("[\\d]+",surgery.getOldmanId()+"")){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 5);
		List<Surgery>surgerys=surgeryService.findAll(surgery);
		PageInfo pageInfo=new PageInfo(surgerys,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 添加手术信息
	 * @param surgery
	 * @param result
	 * @return
	 */
	@RequestMapping("/insertSurgery")
	@ResponseBody
	public Msg insertSurgery(@Valid Surgery surgery,BindingResult result){
		if(result.hasErrors()){
			return Msg.fail();
		}
		try {
			surgeryService.insertSurgery(surgery);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	/**
	 * 查询手术详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/findSurgery/{id}")
	@ResponseBody
	public Msg findSurgery(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+", id+"")){
			 return Msg.fail();
		 }
		 Surgery surgery=null;
		try {
			surgery=surgeryService.findSurgery(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success().add("surgery", surgery);
	}
	
	/**
	 * 更新手术信息
	 * @param disease
	 * @return
	 */
	@RequestMapping("/updateSurgery")
	@ResponseBody
	public Msg updateDisease(Surgery surgery){
		 if(!Pattern.matches("[\\d]+", surgery.getId()+"")){
			 return Msg.fail();
		 }
		try {
			surgeryService.updateSurgery(surgery);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	/**
	 * 删除手术记录
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deleteSurgery/{id}")
	@ResponseBody
	public Msg deleteDisease(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+",id+"")){
			 return Msg.fail();
		 }
		try {
			surgeryService.deleteSurgery(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
}
