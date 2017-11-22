package com.older.manager.controller.oldfront;

import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldfront.IOldmanService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("oldman")
public class OldmanController {

	@Autowired
	IOldmanService oldmanService;
	
	/**
	 * 修改信息
	 * @param oldman
	 * @param result
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/notify")
	@ResponseBody
	public Msg notifyOldman(@Valid Oldman oldman,BindingResult result)throws Exception{
		if(result.hasErrors()){
			return Msg.fail();
		}
		oldmanService.notifyOlder(oldman);
		return Msg.success();
	}
}
