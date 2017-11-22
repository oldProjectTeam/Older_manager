package com.older.manager.controller.oldfront;

import java.security.interfaces.RSAKey;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Disease;
import com.older.manager.service.oldfront.IDiseaseService;
import com.older.manager.utils.Msg;

/**
 * 疾病处理请求类
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/disease")
public class DiseaseController {

	@Autowired
	IDiseaseService diseaseService;
	

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
	 * 分页查询所有疾病信息
	 * @param disease
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(Disease disease,@RequestParam(value="pn",defaultValue="1")Integer pn)throws Exception{
		if(!Pattern.matches("[\\d]+",disease.getOldmanId()+"")){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 5);
		List<Disease>diseases=diseaseService.findAll(disease);
		PageInfo pageInfo=new PageInfo(diseases,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 添加疾病信息
	 * @param disease
	 * @param result
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertDisease")
	@ResponseBody
	public Msg insertDisease(@Valid Disease disease,BindingResult result){
		if(result.hasErrors()){
			return Msg.fail();
		}
		try {
			diseaseService.insertDisease(disease);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	/**
	 * 查询疾病详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/findDisease/{id}")
	@ResponseBody
	public Msg findDisease(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+", id+"")){
			 return Msg.fail();
		 }
		 Disease disease=null;
		try {
			disease=diseaseService.findDisease(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success().add("disease", disease);
	}
	
	/**
	 * 更新疾病信息
	 * @param disease
	 * @return
	 */
	@RequestMapping("/updateDisease")
	@ResponseBody
	public Msg updateDisease(Disease disease){
		 if(!Pattern.matches("[\\d]+", disease.getId()+"")){
			 return Msg.fail();
		 }
		try {
			diseaseService.updateDiseae(disease);;
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	/**
	 * 删除疾病记录
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deleteDisease{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteDisease(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+",id+"")){
			 return Msg.fail();
		 }
		try {
			diseaseService.deleteDisease(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
}
