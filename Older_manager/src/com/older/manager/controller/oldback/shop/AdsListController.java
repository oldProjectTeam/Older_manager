package com.older.manager.controller.oldback.shop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.core.config.plugins.ResolverUtil.NameEndsWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Adslist;
import com.older.manager.bean.Sortads;
import com.older.manager.service.oldback.shop.AdsListService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

@Controller
@RequestMapping("/adslist")
public class AdsListController {

	@Autowired
	private AdsListService adsListService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * 查询所有的
	 * 
	 * @param pn
	 * @param str
	 * @param ta
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectalladslist")
	@ResponseBody
	public Msg selectAllAdsList(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "str", defaultValue = "") String str,
			@RequestParam(value = "ta", defaultValue = "5") Integer ta,
			@RequestParam Integer id) throws Exception {
		PageHelper.startPage(pn, ta);
		List<Adslist> all = adsListService.selectAllAds(
				new String(str.getBytes("iso-8859-1"), "utf-8"), id);
		PageInfo pageInfo = new PageInfo(all, ta);
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 删除单个
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteadslistbyid/{id}")
	@ResponseBody
	public Msg deleteAdsListById(@PathVariable("id") Integer id) {
		adsListService.deleteAdsList(id);
		return Msg.success();
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/deletealladslist/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");

			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			adsListService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			adsListService.deleteAdsList(id);
		}

		return Msg.success();
	}

	/**
	 * 显示与隐藏
	 * 
	 * @param sortads
	 * @param id
	 * @return
	 */
	@RequestMapping("/updatesortadswithstop/{id}")
	@ResponseBody
	public Msg updateSortAdsWithStop(Adslist adslist,
			@PathVariable("id") Integer id) {
		Adslist adslist1 = adsListService.selectAdsListById(id);
		if (adslist1.getSortstate().equals("显示")) {
			adslist.setSortstate("隐藏");
		} else {
			adslist.setSortstate("显示");
		}
		adslist.setId(adslist1.getId());
		adsListService.updateAdsList(adslist);
		return Msg.success();
	}

	/**
	 * 增加
	 * 
	 * @param adslist
	 * @return
	 */
	@RequestMapping("/addadslist/{sortadsid}")
	@ResponseBody
	public Msg addAdsList(Adslist adslist,
			@PathVariable("sortadsid") Integer sortadsid, MultipartFile file,
			HttpServletRequest request) throws Exception {
		String imgUrl = null;
		if (file != null) {
			imgUrl = SaveFile.saveImg(file, request);
			System.out.println("***********************" + imgUrl);
		}
		adslist.setSortphoto(imgUrl);
		adslist.setSortjointime(new Date());
		adslist.setSortadsid(sortadsid);
		adsListService.addAdsList(adslist);
		return Msg.success();
	}

	/**
	 * 通过id来查一条数据
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectadslistbyid/{id}")
	@ResponseBody
	public Msg selectAdslistById(@PathVariable("id") Integer id) {
		Adslist adslist = adsListService.selectAdsListById(id);
		return Msg.success().add("adslist", adslist);
	}

	/**
	 * 修改
	 * 
	 * @param adslist
	 * @param file
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateadslist/{id}")
	@ResponseBody
	public Msg updateAdsList(Adslist adslist, MultipartFile file,
			HttpServletRequest request, @PathVariable("id") Integer id)
			throws Exception {
		String imgUrl = null;
		// 判断是否上传图片
		if (file != null
				&& (file.getOriginalFilename() != null && !file
						.getOriginalFilename().equals(""))) {
			String OriginalFilename = adsListService.selectAdsListById(id)
					.getSortphoto();
			// 判断原来的数据是否存在图片
			if (OriginalFilename != null && !OriginalFilename.equals("")) {

				// 更新前的数据存在图片，执行删除操作
				boolean flag = SaveFile.delete(OriginalFilename, request);

				// 判断是否删除成功
				if (flag) {

					// 删除成功
					imgUrl = SaveFile.saveImg(file, request);
					if (imgUrl != "" && imgUrl != null) {
						adslist.setSortphoto(imgUrl);
						adsListService.updateAdsList(adslist);
						return Msg.success();
					}
				} else {

					// 删除失败，不执行插入操作
					adsListService.updateAdsList(adslist);
					return Msg.success();
				}
			} else {

				// 更新前的数据不存在图片，直接进行插入操作
				imgUrl = SaveFile.saveImg(file, request);
				if (imgUrl != "" && imgUrl != null) {
					adslist.setSortphoto(imgUrl);
					adsListService.updateAdsList(adslist);
					return Msg.success();
				}
			}

		}

		// 没有上传图片直接进行插入操作
		adsListService.updateAdsList(adslist);
		return Msg.success();

	}

	/***
	 * 排序数
	 * 
	 * @param adslist
	 * @return
	 */
	@RequestMapping("/updatesortnum/{id}&{num}")
	@ResponseBody
	public Msg updatesortnum(Adslist adslist, @PathVariable("id") Integer id,
			@PathVariable("num") Integer num) {
		adslist.setSort(num);
		adsListService.updateAdsList(adslist);
		return Msg.success();
	}
}
