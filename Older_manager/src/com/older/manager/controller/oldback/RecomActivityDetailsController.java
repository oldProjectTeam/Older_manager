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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Recomactivity;
import com.older.manager.bean.Recomactivitydetails;
import com.older.manager.service.oldback.RecomActivityDetailsService;
import com.older.manager.service.oldback.RecomActivityService;
import com.older.manager.utils.Msg;

/**
 * @author ym
 * 
 */
@RequestMapping("/RecomActivityDetails")
@Controller
public class RecomActivityDetailsController {

	@Autowired
	RecomActivityDetailsService recomActivityDetailsService;

	@Autowired
	RecomActivityService recomActivityService;

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
	 * @Title: addRecomActivity
	 * @Description: 添加活动详细数据
	 * @param: @param recomactivitydetails
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/addRecomActivitydetails/{oldMenId}")
	@ResponseBody
	public Msg addRecomActivityDetails(Recomactivity recomactivity,
			@PathVariable("oldMenId") String oldMenId) {
		if (recomactivity != null && oldMenId != null) {
			recomactivity.setRecomtime(new Date());
			recomactivity.setState("未推荐");
			System.out.println("........." + recomactivity.toString() + ">>>>"
					+ oldMenId);
			int state1 = recomActivityService.addRecomactivity(recomactivity);
			if (state1 != 0) {
				Recomactivitydetails recomactivitydetails = new Recomactivitydetails();
				recomactivitydetails.setOldmanId(Integer.valueOf(oldMenId));
				recomactivitydetails.setRecomactivityId(recomactivity.getId());
				recomactivitydetails.setRecomtime(new Date());

				int state = recomActivityDetailsService
						.addRecomActivityDetails(recomactivitydetails);
				if (state != 0) {
					return Msg.success().add("msg", "保存成功！");
				} else {
					return Msg.fail().add("msg", "保存失败！");
				}
			} else {
				return Msg.fail().add("msg", "保存失败！");
			}
		} else {
			return Msg.fail().add("msg", "插入数据不完整插入失败！");
		}
	}

	/**
	 * @Title: findAllRecomActivityDetailsByPage
	 * @Description: 查询所有的活动详细表
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllRecomActivityDetailsByPage")
	@ResponseBody
	public Msg findAllRecomActivityDetailsByPage(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 5);
		List<Recomactivitydetails> list = recomActivityDetailsService
				.findAllRecomactivitydetails();
		PageInfo pageInfo = new PageInfo(list, 5);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: deleteRecomActivityDetailsById
	 * @Description: 通过id删除推荐活动详细
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("deleteRecomActivityDetailsById")
	@ResponseBody
	public Msg deleteRecomActivityDetailsById(String id) {
		int state = recomActivityDetailsService
				.deleteRecomactivitydetailsById(Integer.valueOf(id));
		if (state == 0) {
			return Msg.fail().add("msg", "删除失败");
		} else {
			return Msg.success().add("msg", "删除成功");
		}
	}

	/**
	 * @Title: deleteRecomActivityDetailsByIdListId
	 * @Description: 批量删除推荐活动详细
	 * @param: @param listId
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("deleteRecomActivityDetailsByIdListId")
	@ResponseBody
	public Msg deleteRecomActivityDetailsByIdListId(String listId) {
		System.out.println("listId" + listId);
		String[] idlist = listId.split("-");
		String msg = "";
		for (int i = 0; i < idlist.length; i++) {
			int state = recomActivityDetailsService
					.deleteRecomactivitydetailsById(Integer.valueOf(idlist[i]));
			if (state != 0) {
				msg = msg + idlist[i] + ",";
			}
		}
		return Msg.success().add("msg", "id为：" + msg + "删除成功");
	}

	/**
	 * @Title:   findAllRecomActivityDetailsBySearch
	 * @Description:  通过搜索查询所有的推荐活动详情数据
	 * @param:    @param oldManName
	 * @param:    @param activityName
	 * @param:    @param result
	 * @param:    @param pn
	 * @param:    @param pageSize
	 * @param:    @return
	 * @param:    @throws UnsupportedEncodingException   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("/findAllRecomActivityDetailsBySearch")
	@ResponseBody
	public Msg findAllRecomActivityDetailsBySearch(
			String oldManName,
			String activityName,
			String result,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<Recomactivitydetails> list = null;
		list = recomActivityDetailsService.findAllRecomactivitydetailsBySearch(
				new String(oldManName.getBytes("iso-8859-1"), "utf-8"),
				new String(activityName.getBytes("iso-8859-1"), "utf-8"),
				new String(result.getBytes("iso-8859-1"), "utf-8"));
		PageInfo<Recomactivitydetails> pageInfo = new PageInfo<Recomactivitydetails>(
				list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到相关数据");
		} else {
			return Msg.success().add("pageInfo", pageInfo);
		}

	}
}
