package com.older.manager.controller.oldback;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.SystemLog;
import com.older.manager.service.oldback.ISystemLogService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("log")
public class SystemLogController {

	@Autowired
	private ISystemLogService systemLogService;

	@RequestMapping("/list")
	@ResponseBody
	public Msg systemLogList(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "str", defaultValue = "") String str) {
		PageHelper.startPage(pn, 10);
		List<SystemLog> logList = null;
		try {
			logList = systemLogService.getAllSystemLogList(new String(str
					.getBytes("iso-8859-1"), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		PageInfo<SystemLog> pageInfo = new PageInfo<SystemLog>(logList, 6);
		return Msg.success().add("pageInfo", pageInfo);
	}

}
