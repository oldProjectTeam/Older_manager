package com.older.manager.controller.oldfront;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Sms;
import com.older.manager.service.impl.oldfront.SmsServiceImpl;
import com.older.manager.service.oldfront.ISmsService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/sms")
public class SmsController {

	@Autowired 
	ISmsService service;
	
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
	 * 查询该账户所有短信
	 * @param pn
	 * @param sms
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public Msg findAll(@RequestParam(value="pn",defaultValue="1")Integer pn,Sms sms) throws Exception{
		
		if(!Pattern.matches("(^1[0-9]{10}$)", sms.getReceiverphone())){
			return Msg.fail();
		}
		PageHelper.startPage(pn, 4);
		List<Sms>list=service.findAll(sms);
		PageInfo pageInfo=new PageInfo(list,3);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 删除短信记录
	 * @param ids
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/delSms/{id}")
	@ResponseBody
	public Msg deleteSms(@PathVariable("id")String id) {
		try {
			 if(Pattern.matches("[\\d]+", id)){
				service.deleteSms(Integer.parseInt(id));
			}
		} catch (Exception e) {
			e.printStackTrace();
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	/**
	 * 清空短信记录表
	 * @param account
	 * @return
	 */
	@RequestMapping("/batchDelSms/{account}")
	@ResponseBody
	public Msg batchDelSms(@PathVariable("account")String account) {
		try {
			 if(!Pattern.matches("(^1[0-9]{10}$)", account)){
				 return Msg.fail();
			}else{
				service.batchDelSms(account);
			}
		} catch (Exception e) {
			e.printStackTrace();
			 return Msg.fail();
		}
		return Msg.success();
	}
	
	
	
	/**
	 * 获取短信信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findSms/{id}")
	@ResponseBody
	public Msg findSms(@PathVariable("id")Integer id) throws Exception{
		if(!Pattern.matches("[\\d]+", id+"")){
			return Msg.fail();	 
		}
		Sms sms=service.findSms(id);
		return Msg.success().add("sms", sms);
	}
	
	/**
	 * 获得该账户下短信总数
	 * @param account
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCount/{account}")
	@ResponseBody
	public Msg getCount(@PathVariable("account")String account)throws Exception{
		if(!Pattern.matches("(^1[0-9]{10}$)",account)){
			return Msg.fail();
		}
		Integer count=service.getCount(account);
		return Msg.success().add("count", count);
	}
	
}
