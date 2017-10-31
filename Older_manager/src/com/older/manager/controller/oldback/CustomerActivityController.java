package com.older.manager.controller.oldback;

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
import com.older.manager.bean.Activity;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Takeactivity;
import com.older.manager.service.oldback.CustomerActivityService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/take")
public class CustomerActivityController {
	

	@Autowired
    private CustomerActivityService customerActivityService;	
	
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}; //true:允许输入空值，false:不能为空值  

	/**
	 * 查询所有的
	 * @param pn
	 * @return
	 */
	@RequestMapping("/selectallcustomeractivity")
	@ResponseBody
	public Msg selectAllCustomerActivity(@RequestParam(value="pn",defaultValue="1") Integer pn){
	    PageHelper.startPage(pn, 5);
		List<Takeactivity> all=customerActivityService.selectAllTakeactivitys();
		PageInfo pageInfo=new PageInfo(all,5);
		return Msg.success().add("pageInfo", pageInfo);
		
	}
	/**
	 * 查询所有的
	 * @param pn
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/selectallcustomeractivitywith")
	@ResponseBody
	public Msg selectAllCustomerActivityWith(@RequestParam(value="pn",defaultValue="1") Integer pn,
			@RequestParam String name1,@RequestParam String type1,@RequestParam String title1	) throws Exception{
		
		if (new String(type1.getBytes("iso-8859-1"), "utf-8").equals("请选择")) {
			type1="";
		}
		Takeactivity takeactivity=new Takeactivity();
		Oldman oldman=new Oldman();
		Activity activity=new Activity();
		oldman.setName( new String(name1.getBytes("iso-8859-1"), "utf-8"));
		activity.setTitle( new String(title1.getBytes("iso-8859-1"), "utf-8"));
		activity.setType( new String(type1.getBytes("iso-8859-1"), "utf-8"));
		takeactivity.setOldman(oldman);
		takeactivity.setActivity(activity);
	    PageHelper.startPage(pn, 5);
		List<Takeactivity> all=customerActivityService.selectAllTakeactivitysWith(takeactivity);
		PageInfo pageInfo=new PageInfo(all,5);
		return Msg.success().add("pageInfo", pageInfo);
		
	}
	
	/**
	 * 跳转
	 * @return
	 */
	@RequestMapping("/skipcustomeractivity")
	public String  skipCustomerActivity(){

		return "oldback/oldCustomerActivity/CustomerActivity";
		
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteTakeActivity/{id}")
	@ResponseBody
	public Msg deletetakeactivity(@PathVariable Integer id){
		customerActivityService.deleteTakeactivity(id);
		return Msg.success();
		
	}
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deleteallolder/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			customerActivityService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			customerActivityService.deleteTakeactivity(id);
		}
		
		return Msg.success();
	} 
    
    /**
     * 增加活动记录
     * @param takeactivity
     * @return
     */
    @RequestMapping("/addtackactivity")
    @ResponseBody
    public Msg addTackActivity(Takeactivity takeactivity){
    	
    	customerActivityService.addTakeactivity(takeactivity);
		return Msg.success();
    	
    }
    
    /**
     * 通过id查找一条
     * @param id
     * @return
     */
	@RequestMapping("/selecttackactivity/{id}")
	@ResponseBody
    public Msg  selectTackActivity(@PathVariable("id") Integer id){
		Takeactivity takeactivity=customerActivityService.selectTakeactivityById(id);
		return Msg.success().add("takeactivity", takeactivity);
    	
    }
    /**
     * 编辑
     * @param takeactivity
     * @return
     */
    @RequestMapping(value="/updatetackactivity/{id}",method=RequestMethod.POST)
    @ResponseBody
	public Msg updateTackActivity(Takeactivity takeactivity){
    	
    	customerActivityService.updateTakeactivity(takeactivity);
		return Msg.success();
	}
	
	
}
