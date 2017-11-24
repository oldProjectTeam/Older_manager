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
 
import com.older.manager.bean.Genetichistory;
import com.older.manager.service.oldfront.IGenetichistoryService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/genetichistory")
public class GenetichistoryController {

	@Autowired
	IGenetichistoryService genetichistoryService;
	
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
	 * 根据老人id分页查询老人所有遗传信息
	 * @param genetichistory
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(Genetichistory genetichistory,@RequestParam(value="pn",defaultValue="1")Integer pn)throws Exception{
		if(!Pattern.matches("[\\d]+",genetichistory.getOldmanId()+"")){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 5);
		List<Genetichistory>diseases=genetichistoryService.findAll(genetichistory);
		PageInfo pageInfo=new PageInfo(diseases,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 添加遗传信息 
	 * @param genetichistory
	 * @param result
	 * @return
	 */
	@RequestMapping("/insertGenetichistory")
	@ResponseBody
	public Msg insertGenetichistory(@Valid Genetichistory genetichistory,BindingResult result){
		if(result.hasErrors()){
			return Msg.fail();
		}
		try {
			genetichistoryService.insertGenetichistory(genetichistory);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	 /**
	  * 根据id查询遗传记录
	  * @param id
	  * @return
	  */
	@RequestMapping("/findGenetichistory/{id}")
	@ResponseBody
	public Msg findGenetichistory(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+", id+"")){
			 return Msg.fail();
		 }
		 Genetichistory genetichistory=null;
		try {
			genetichistory=genetichistoryService.findGenetichistory(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success().add("genetichistory", genetichistory);
	}
	
 
	/**
	 * 更新遗传信息
	 * @param genetichistory
	 * @return
	 */
	@RequestMapping("/updateGenetichistory")
	@ResponseBody
	public Msg updateGenetichistory(Genetichistory genetichistory){
		 if(!Pattern.matches("[\\d]+", genetichistory.getId()+"")){
			 return Msg.fail();
		 }
		try {
			genetichistoryService.updateGenetichistory(genetichistory);
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
	@RequestMapping(value="/deleteGenetichistory/{id}")
	@ResponseBody
	public Msg deleteGenetichistory(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+",id+"")){
			 return Msg.fail();
		 }
		try {
			genetichistoryService.deleteGenetichistory(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
}
