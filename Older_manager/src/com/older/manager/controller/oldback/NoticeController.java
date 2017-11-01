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
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Notice;
import com.older.manager.service.oldback.NoticeService;
import com.older.manager.utils.Msg;

/**
 * @author ym
 *
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {

	
	@Autowired
	NoticeService noticeService;
	
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
	}; 
	
	/**
	 * @Title:   findNoticeByid
	 * @Description:  通过id查询通知
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("/findNoticeByid")
	@ResponseBody
	public Msg findNoticeByid(String id){
		if (id!=null&&!id.equals("")) {
			
			return Msg.success().add("notice", noticeService.findNoticeById(Integer.valueOf(id)));
		}else {
			return Msg.fail().add("msg", "查找失败！");
		}
		
	}
	
	/**
	 * @Title:   findAllNoticeByPage
	 * @Description:  分页查询所有的通知
	 * @param:    @param pn
	 * @param:    @param pageSize
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("findAllNoticeByPage")
	@ResponseBody
	public Msg findAllNoticeByPage(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<Notice> list = noticeService.findAllNotices();
		PageInfo<Notice> pageInfo = new PageInfo<Notice>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	
	/**
	 * @Title:   findAllNoticeBySearch
	 * @Description:  通过搜索查询相关数据
	 * @param:    @param title
	 * @param:    @param releasepeople
	 * @param:    @param pn
	 * @param:    @param pageSize
	 * @param:    @return
	 * @param:    @throws UnsupportedEncodingException   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("findAllNoticeBySearch")
	@ResponseBody
	public Msg findAllNoticeBySearch(
			String title,
			String releasepeople,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<Notice> list = noticeService.findAllNoticesBySearch(new String(title.getBytes("iso-8859-1"),"utf-8"), new String(releasepeople.getBytes("iso-8859-1"),"utf-8"));
		PageInfo<Notice> pageInfo = new PageInfo<Notice>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * @Title:   updateNotice
	 * @Description: 更改通知
	 * @param:    @param notice
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("updateNotice")
	@ResponseBody
	public Msg updateNotice(Notice notice){
		System.out.println(notice.toString());
		int state=noticeService.updateNotice(notice);
		if (state!=0) {
			return Msg.success().add("msg", "修改成功");
		}else {
			return Msg.fail().add("msg", "修改失败！");
		}
	}
	
	
	/**
	 * @Title:   deleteNoticeById
	 * @Description:  通过id删除通知
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("deleteNoticeById")
	@ResponseBody
	public Msg deleteNoticeById(String id){
		int state=noticeService.delectNoticeById(Integer.valueOf(id));
		if (state!=0) {
			return Msg.success().add("msg", "删除成功");
		}else {
			return Msg.fail().add("msg", "删除失败！");
		}
	}
	
	/**
	 * @Title:   addNotice
	 * @Description:  添加通知
	 * @param:    @param notice
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("addNotice")
	@ResponseBody
	public Msg addNotice(Notice notice){
		if (notice!=null) {
			int state=noticeService.AddNotice(notice);
			if (state!=0) {
				return Msg.success().add("msg", "添加通知成功");
			}else {
				return Msg.fail().add("msg", "添加通知失败！");
			}
		}else {
			return Msg.fail().add("msg", "通知信息没有填写完整！无法添加！");
		}
		
	}
	
	/**
	 * @Title:   delectNoticeByListId
	 * @Description:  批量删除通知
	 * @param:    @param listId
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("delectNoticeByListId")
	@ResponseBody
	public Msg delectNoticeByListId(String listId) {
		System.out.println("listId" + listId);
		String[] idlist = listId.split("-");
		String msg = "";
		for (int i = 0; i < idlist.length; i++) {
			int states = noticeService.delectNoticeById(Integer.valueOf(idlist[i]));
			if (states != 0) {
				msg = msg + idlist[i] + ",";
			}
		}
		return Msg.success().add("msg", "id为：" + msg + "的公告删除成功");

	}
	
	
	
}
