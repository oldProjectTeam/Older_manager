package com.older.manager.shopfront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.older.manager.bean.Changesale;
import com.older.manager.service.shopfront.ChangeService;
/**
 * 退款售后
 * @author 疯癫
 *
 */
@Controller
@RequestMapping("/change")
public class ChangeController {
	@Autowired
	private ChangeService changeService;
	
	/**
	 * 查询所有的通过用户id
	 * @param userid
	 * @param model
	 * @return
	 */
    @RequestMapping("/selectallchange/{userid}")
	public String selectAllChange(@PathVariable Integer userid,Model model){
		List<Changesale> changes=changeService.selectAll(userid);
		model.addAttribute("list", changes);
    	return "oldfront/person/change";
	}
    /**
     * 
     * @param id
     * @return
     */
	@RequestMapping("/deletechangebyid/{id}&{userid}")
    public String deleteChangeById(@PathVariable Integer id,@PathVariable Integer userid){
    	//changeService.deleteChange(id);
		//标记为删除状态
    	Changesale changesale=new Changesale();
    	changesale.setChdeletestate("1");
    	changesale.setId(id);
    	changeService.updateState(changesale);
    	return "redirect:/change/selectallchange/"+userid;
    }
	
}
