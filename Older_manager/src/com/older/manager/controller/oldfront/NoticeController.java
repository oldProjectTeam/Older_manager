package com.older.manager.controller.oldfront;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Notice;
import com.older.manager.service.oldfront.NoticeService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
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
 * 查询所有公告	
 * @param pn
 * @param notice
 * @return
 * @throws Exception
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
@RequestMapping("/findAll")
@ResponseBody
public Msg findAll(@RequestParam(value="pn",defaultValue="1")Integer pn,Notice notice) 
		throws Exception{
		PageHelper.startPage(pn, 4);
		List<Notice>list=noticeService.findAll(notice);
		PageInfo pageInfo=new PageInfo(list,3);
		return Msg.success().add("pageInfo", pageInfo);
	}

/**
 * 获取公告信息
 * @param id
 * @return
 * @throws Exception
 */
@RequestMapping("/findNotice/{id}")
@ResponseBody
public Msg findNotice(@PathVariable("id")Integer id) throws Exception{
	if(!Pattern.matches("[\\d]+", id+"")){
		return Msg.fail();	 
	}
	 Notice notice=noticeService.findNotice(id);
	return Msg.success().add("notice", notice);
}

/**
 * 获得公告总数
 * @param account
 * @return
 * @throws Exception
 */
@RequestMapping("/getCount")
@ResponseBody
public Msg getCount()throws Exception{
	Integer count=noticeService.getCount();
	return Msg.success().add("count", count);
}

}


