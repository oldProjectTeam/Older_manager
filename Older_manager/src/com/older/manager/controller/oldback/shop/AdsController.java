package com.older.manager.controller.oldback.shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Adslist;
import com.older.manager.bean.Sortads;
import com.older.manager.service.oldback.shop.AdsListService;
import com.older.manager.service.oldback.shop.SortAdsService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/ad")
/**
 * 广告
 * @author 疯癫
 *
 */
public class AdsController {
   @Autowired
   private AdsListService adsListService;
   @Autowired
   private SortAdsService sortAdsService;
   
   /**
    * 查询总数
    * @return
    */
   @RequestMapping("/selectadslisttotal")
   @ResponseBody
   public Msg selectAdListTotal(){
	   int total=adsListService.selectTotal();
	  return Msg.success().add("total", total);
   }
   /**
    * 通过分类的id来查总数及分类名
    * @param id
    * @return
    */
	@RequestMapping("/selectadslisttotalwith")
	
	public String selectAdsListTotalWith(Model model){
		
		List<String> list=new ArrayList<String>();
		Map<Integer, String> map=new HashMap<Integer, String>();
		List<Sortads> sortads= sortAdsService.selectAllSortAds("", "");
		 int total=adsListService.selectTotal();
		for (Sortads sortads2 : sortads) {
			//list.add(sortads2.getSortname()+"("+ adsListService.selectTotalWith(sortads2.getId())+")");
			map.put(sortads2.getId(), sortads2.getSortname()+"("+ adsListService.selectTotalWith(sortads2.getId())+")");
		}
		//model.addAttribute("list", list);
		model.addAttribute("total", total);
		model.addAttribute("map", map);
		return "oldback/oldbackshopping/advertising";
	}
	
	
	/**
	 * 带条件查询全部
	 * @param pn
	 * @param sortadsid
	 * @param to
	 * @param str
	 * @return
	 */
	@RequestMapping("/selectalladslist")
	@ResponseBody
	public Msg selectAllAdsList(@RequestParam(value="pn",defaultValue="1")Integer pn,
			@RequestParam(value="str",defaultValue="")String str,
			@RequestParam(value="ta",defaultValue="5")Integer ta,@RequestParam Integer id){
		PageHelper.startPage(pn,ta);
		List<Adslist> all=adsListService.selectAllAds("", id);
		PageInfo pageInfo=new PageInfo(all,ta);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
}
