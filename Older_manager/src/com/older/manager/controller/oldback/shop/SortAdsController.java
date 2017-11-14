package com.older.manager.controller.oldback.shop;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Sortads;
import com.older.manager.service.oldback.shop.SortAdsService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/sortad")
/**
 * 广告图片分类
 * @author 疯癫
 *
 */
public class SortAdsController {
	@Autowired
    public SortAdsService sortAdsService;
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}; //true:允许输入空值，false:不能为空值  
	/**
	 * 模糊查询所有的
	 * @param pn
	 * @param str1
	 * @param str2
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/selectallsortads")
	@ResponseBody
	public Msg selectAllSortAds(@RequestParam(value="pn",defaultValue="1")Integer pn,
			@RequestParam(value="str1",defaultValue="")String str1,@RequestParam(value="str2",defaultValue="")String str2,
			@RequestParam(value="ta",defaultValue="5")Integer ta) throws UnsupportedEncodingException{
		PageHelper.startPage(pn,ta);
		List<Sortads> all=sortAdsService.selectAllSortAds(new String(str1.getBytes("iso-8859-1"), "utf-8"),
				new String(str2.getBytes("iso-8859-1"), "utf-8"));
		PageInfo pageInfo=new PageInfo(all,ta);
		return Msg.success().add("pageInfo", pageInfo);
	}
	/**
	 * 点击删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deletesortadbyid/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteSortAdById(@PathVariable("id")Integer id){
		sortAdsService.deleteSortAds(id);
		return Msg.success().add("msg", "删除成功");
	}
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deleteallsortads/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			sortAdsService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			sortAdsService.deleteSortAds(id);
		}
		
		return Msg.success();
	}
	/**
	 * 添加
	 * @param sortads
	 * @return
	 */
    @RequestMapping("/addsortads")
    @ResponseBody
    public Msg addSortAds(Sortads sortads){
    	sortads.setSortnum(0);
    	sortads.setSortjointime(new Date());
    	sortAdsService.addSortAds(sortads);
    	return Msg.success();
    }
    /**
     * 通过id来查一条
     * @param id
     * @return
     */
   @RequestMapping("/selectsortadbyid/{id}") 
   @ResponseBody
   public Msg selectSortAdsById(@PathVariable("id")Integer id){
	   
	  Sortads sortads=  sortAdsService.selecctSortAdsById(id);
	   return Msg.success().add("sortads", sortads);
   } 
    /**
     * 修改
     * @param sortads
     * @return
     */
    @RequestMapping("/updatesortads/{id}")
    @ResponseBody
   public Msg updateSortAds(Sortads sortads){
	   sortAdsService.updateSortAds(sortads);
	   return Msg.success();
   } 
    
    /**
     * 显示与隐藏
     * @param sortads
     * @param id
     * @return
     */
    @RequestMapping("/updatesortadswithstop/{id}")
    @ResponseBody
   public Msg updateSortAdsWithStop(Sortads sortads,@PathVariable("id")Integer id){
    	 Sortads sortads1=  sortAdsService.selecctSortAdsById(id);
    	  if(sortads1.getSortstate().equals("显示")){
    		  sortads.setSortstate("隐藏");
    	  }else{
    		  sortads.setSortstate("显示");
    	  }
    	  sortads.setId(sortads1.getId());
	   sortAdsService.updateSortAds(sortads);
	   return Msg.success();
   } 
    /**
     * 跳转
     * @return
     */
    @RequestMapping("/skipadslist/{id}&{pn}") 
    public String skipAdslist(@PathVariable("id")Integer id,@PathVariable("pn")Integer pn){
		return "/oldback/oldbackshopping/Ads_list";
    }
    
}
