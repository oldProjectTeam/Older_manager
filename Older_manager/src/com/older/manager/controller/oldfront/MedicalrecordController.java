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
 
import com.older.manager.bean.Medicalrecord;
import com.older.manager.service.oldfront.IMedicalrecordService;
import com.older.manager.utils.Msg;

/**
 * 就诊处理类
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/medicalrecord")
public class MedicalrecordController {

	@Autowired
	IMedicalrecordService medicalrecordService;
	

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
	 * 根据老人id分页查询老人所有就诊信息
	 * @param medicalrecord
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(Medicalrecord medicalrecord,@RequestParam(value="pn",defaultValue="1")Integer pn)throws Exception{
		if(!Pattern.matches("[\\d]+",medicalrecord.getOldmanId()+"")){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 5);
		List<Medicalrecord>diseases=medicalrecordService.findAll(medicalrecord);
		PageInfo pageInfo=new PageInfo(diseases,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 添加就诊信息 
	 * @param Medicalrecord
	 * @param result
	 * @return
	 */
	@RequestMapping("/insertMedicalrecord")
	@ResponseBody
	public Msg insertMedicalrecord(@Valid Medicalrecord medicalrecord,BindingResult result){
		if(result.hasErrors()){
			return Msg.fail();
		}
		try {
			medicalrecordService.insertMedicalrecord(medicalrecord);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	 /**
	  * 根据id查询就诊记录
	  * @param id
	  * @return
	  */
	@RequestMapping("/findMedicalrecord/{id}")
	@ResponseBody
	public Msg findMedicalrecord(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+", id+"")){
			 return Msg.fail();
		 }
		 Medicalrecord medicalrecord=null;
		try {
			medicalrecord=medicalrecordService.findMedicalrecord(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success().add("medicalrecord", medicalrecord);
	}
	
 
	/**
	 * 更新就诊信息
	 * @param medicalrecord
	 * @return
	 */
	@RequestMapping("/updateMedicalrecord")
	@ResponseBody
	public Msg updateMedicalrecord(Medicalrecord medicalrecord){
		 if(!Pattern.matches("[\\d]+", medicalrecord.getId()+"")){
			 return Msg.fail();
		 }
		try {
			medicalrecordService.updateMedicalrecord(medicalrecord);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	 /**
	  * 根据id删除遗传信息
	  * @param id
	  * @return
	  */
	@RequestMapping(value="/deleteMedicalrecord/{id}")
	@ResponseBody
	public Msg deleteMedicalrecord(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+",id+"")){
			 return Msg.fail();
		 }
		try {
			medicalrecordService.deleteMedicalrecord(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
}
