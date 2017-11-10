/**
 * 
 */
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
import com.older.manager.bean.RecomProductsDetails;
import com.older.manager.service.oldback.RecomProductsDetailsService;
import com.older.manager.utils.Msg;

/**
 * @author ym
 * 
 */
@RequestMapping("/RecomProductsDetails")
@Controller
public class RecomProductsDetailsController {

	@Autowired
	RecomProductsDetailsService recomProductsDetailsService;

	/**
	 * @Title: findAllRecomProductsDetailsByPage
	 * @Description: 分页查询所有的推荐商品详细表
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllRecomProductsDetailsByPage")
	@ResponseBody
	public Msg findAllRecomProductsDetailsByPage(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<RecomProductsDetails> list = recomProductsDetailsService
				.findAllRecomProductsDetails();
		PageInfo<RecomProductsDetails> pageInfo = new PageInfo<RecomProductsDetails>(
				list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: deleteRecomProductsDetailsById
	 * @Description: 通过id删除推荐商品详细表
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/deleteRecomProductsDetailsById")
	@ResponseBody
	public Msg deleteRecomProductsDetailsById(String id) {
		int state;
		if (id != null && !id.equals("")) {
			state = recomProductsDetailsService
					.deleteRecomProductsDetailsById(Integer.valueOf(id));
			if (state == 0) {
				return Msg.fail().add("msg", "删除失败!");
			} else {
				return Msg.success().add("msg", "删除成功！");
			}
		} else {
			return Msg.fail().add("msg", "输入指令错误，删除失败!");
		}
	}

	/**
	 * @throws UnsupportedEncodingException
	 * @Title: findAllRecomProductsDetailsBySearch
	 * @Description: 通过搜索来查询所有的推荐商品详细表
	 * @param: @param recomPeople 推荐人
	 * @param: @param oldManName
	 * @param: @param result 推荐状态
	 * @param: @param pn 页数
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllRecomProductsDetailsBySearch")
	@ResponseBody
	public Msg findAllRecomProductsDetailsBySearch(
			String recomPeople,
			String oldManName,
			String result,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<RecomProductsDetails> list = recomProductsDetailsService
				.findAllRecomProductsDetailsBySearch(
						new String(recomPeople.getBytes("iso-8859-1"), "utf-8"),
						new String(oldManName.getBytes("iso-8859-1"), "utf-8"),
						new String(result.getBytes("iso-8859-1"), "utf-8"));
		PageInfo<RecomProductsDetails> pageInfo = new PageInfo<RecomProductsDetails>(
				list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	
	/**
	 * @Title:   deleteRecomProductsDetailsByListId
	 * @Description:  批量删除推荐商品详细表
	 * @param:    @param listId
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping(value = "/deleteRecomProductsDetailsByListId")
	@ResponseBody
	public Msg deleteRecomProductsDetailsByListId(String listId) {
		if (listId!=null&& !listId.equals("")) {
			String[] idlist = listId.split("-");
			String msg = "";
			for (int i = 0; i < idlist.length; i++) {
				int states = recomProductsDetailsService.deleteRecomProductsDetailsById(Integer.valueOf(idlist[i]));
				if (states != 0) {
					msg = msg + idlist[i] + ",";
				}
			}
			return Msg.success().add("msg", "id为：" + msg + "删除成功");
		}else {
			return Msg.fail().add("msg", "删除失败！");
		}

	}
}
