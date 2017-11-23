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
import com.older.manager.bean.Trauma;
import com.older.manager.service.oldfront.ITraumaService;
import com.older.manager.utils.Msg;

/**
 * 外伤请求处理类
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/trauma")
public class TraumaController {

	@Autowired
	ITraumaService traumaService;
	

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
	  * 根据老人id分页查询所有外伤信息
	  * @param trauma
	  * @param pn
	  * @return
	  * @throws Exception
	  */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(Trauma trauma,@RequestParam(value="pn",defaultValue="1")Integer pn)throws Exception{
		if(!Pattern.matches("[\\d]+",trauma.getOldmanId()+"")){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 5);
		List<Trauma>traumas=traumaService.findAll(trauma);
		PageInfo pageInfo=new PageInfo(traumas,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	 /**
	  * 添加外伤信息
	  * @param trauma
	  * @param result
	  * @return
	  */
	@RequestMapping("/insertTrauma")
	@ResponseBody
	public Msg insertTrauma(@Valid Trauma trauma,BindingResult result){
		if(result.hasErrors()){
			return Msg.fail();
		}
		try {
			traumaService.insertTrauma(trauma);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	 /**
	  * 获取外伤信息详细
	  * @param id
	  * @return
	  */
	@RequestMapping("/findTrauma/{id}")
	@ResponseBody
	public Msg findTrauma(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+", id+"")){
			 return Msg.fail();
		 }
		 Trauma trauma=null;
		try {
			trauma=traumaService.findTrauma(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success().add("trauma", trauma);
	}
 
	/**
	 * 更新外伤信息
	 * @param trauma
	 * @return
	 */
	@RequestMapping("/updateTrauma")
	@ResponseBody
	public Msg updateTrauma(Trauma trauma){
		 if(!Pattern.matches("[\\d]+", trauma.getId()+"")){
			 return Msg.fail();
		 }
		try {
			traumaService.updateTrauma(trauma);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	 /**
	  * 删除外伤信息
	  * @param id
	  * @return
	  */
	@RequestMapping(value="/deleteTrauma/{id}")
	@ResponseBody
	public Msg deleteTrauma(@PathVariable("id")Integer id){
		 if(!Pattern.matches("[\\d]+",id+"")){
			 return Msg.fail();
		 }
		try {
			traumaService.deleteTrauma(id);
		} catch (Exception e) {
			 return Msg.fail();
		}
		return Msg.success();
	}
}
