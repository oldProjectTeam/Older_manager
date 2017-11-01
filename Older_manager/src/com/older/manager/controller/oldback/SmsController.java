/**
 * 
 */
package com.older.manager.controller.oldback;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Sms;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.service.oldback.SmsService;
import com.older.manager.utils.Msg;

/**
 * @author ym
 * 
 */
@Controller
@RequestMapping("/Sms")
public class SmsController {

	@Autowired
	SmsService smsService;
	
	@Autowired 
	AddNewOlderService addNewOlderService;

	/**
	 * @Title: initBinder
	 * @Description: 解决上传时间转换问题
	 * @param: @param binder
	 * @return: void
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
	 * @Title: addSms
	 * @Description: 添加短信
	 * @param: @param sms
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/addSms")
	@ResponseBody
	public Msg addSms(Sms sms) {
		int state = smsService.addSms(sms);
		if (state == 0) {
			return Msg.fail().add("msg", "发送短信失败");
		} else {
			return Msg.success().add("msg", "发送失败");
		}
	}

	/**
	 * @Title: deleteMSmsById
	 * @Description: 通过id删除短信
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/deleteSmsById")
	@ResponseBody
	public Msg deleteSmsById(String id) {
		int state = smsService.deleteSmsById(Integer.valueOf(id));
		if (state == 0) {
			return Msg.fail().add("msg", "删除短信失败");
		} else {
			return Msg.success().add("msg", "删除成功");
		}
	}

	/**
	 * @Title: delectSmsByListId
	 * @Description: 批量删除短信
	 * @param: @param listId
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/delectSmsByListId")
	@ResponseBody
	public Msg delectSmsByListId(String listId) {
		System.out.println("listId" + listId);
		String[] idlist = listId.split("-");
		String msg = "";
		for (int i = 0; i < idlist.length; i++) {
			int states = smsService.deleteSmsById(Integer.valueOf(idlist[i]));
			if (states != 0) {
				msg = msg + idlist[i] + ",";
			}
		}
		return Msg.success().add("msg", "id为：" + msg + "删除成功");

	}

	/**
	 * @Title: findSmsById
	 * @Description: 通过id查询短信
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("findSmsById")
	@ResponseBody
	public Msg findSmsById(String id) {
		Sms sms = smsService.findSmsById(Integer.valueOf(id));
		if (sms != null) {
			return Msg.success().add("Sms", sms);
		} else {
			return Msg.fail().add("msg", "查找数据失败!");
		}

	}

	/**
	 * @Title: findAllSmsByPage
	 * @Description: 通过分页查询所有的短信
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllSmsByPage")
	@ResponseBody
	public Msg findAllSmsByPage(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<Sms> list = smsService.findAllSms();
		PageInfo<Sms> pageInfo = new PageInfo<Sms>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: findAllSmsBySearch
	 * @Description: 通过搜索查询所有短信
	 * @param: @param sender
	 * @param: @param receiverphone
	 * @param: @param receivername
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @param: @throws UnsupportedEncodingException
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/findAllSmsBySearch")
	@ResponseBody
	public Msg findAllSmsBySearch(
			String sender,
			String receiverphone,
			String receivername,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<Sms> list = null;
		list = smsService.findAllSmsBySearch(
				new String(sender.getBytes("iso-8859-1"), "utf-8"), new String(
						receiverphone.getBytes("iso-8859-1"), "utf-8"),
				new String(receivername.getBytes("iso-8859-1"), "utf-8"));
		PageInfo<Sms> pageInfo = new PageInfo<Sms>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到相关数据");
		} else {
			return Msg.success().add("pageInfo", pageInfo);
		}
	}
	
	/**
	 * @Title:   intoSendSms
	 * @Description:  跳转到发送短信
	 * @param:    @param phone
	 * @param:    @param model
	 * @param:    @return   
	 * @return:   String   
	 * @throws
	 */
	@RequestMapping(value = "/intoSendSms")
	public String intoSendSms(String phone,Model model){
		model.addAttribute("phone", phone);
		return "oldback/officemanage/sendsms";
	}
	

}
