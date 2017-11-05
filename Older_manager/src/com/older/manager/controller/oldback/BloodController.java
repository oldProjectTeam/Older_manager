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
import com.older.manager.bean.Bloodtransfusion;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.BloodService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/blood")
public class BloodController {
	   @Autowired
       private BloodService bloodService;
	   @InitBinder
		public void initBinder(WebDataBinder binder) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateFormat.setLenient(false);
			binder.registerCustomEditor(Date.class, new CustomDateEditor(
					dateFormat, true));
		}; // true:允许输入空值，false:不能为空值
		
		/**
		 * 模糊查询所有的
		 * @param pn
		 * @param oldmanname
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/selectallblood")
		@ResponseBody
		public Msg selectAllBlood(@RequestParam(value="pn",defaultValue="1") Integer pn,
				@RequestParam String oldmanname)throws Exception{
			Oldman oldman=new Oldman();
			oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
			Bloodtransfusion bloodtransfusion=new Bloodtransfusion();
			bloodtransfusion.setOldman(oldman);
			PageHelper.startPage(pn,5);
			List<Bloodtransfusion> all=bloodService.selectfAllBlood(bloodtransfusion);
			PageInfo pageInfo=new PageInfo(all,5);
			return Msg.success().add("pageInfo", pageInfo);
			
		}
		/**
		 * 删除
		 * @param id
		 * @return
		 */
		@RequestMapping("/deletebloodbyid/{id}")
		@ResponseBody
		public  Msg deleteBloodById(@PathVariable("id")Integer id){
			bloodService.deleteBlood(id);
			return Msg.success();
		}
	  	
		/**
	     * 批量删除
	     * @param ids
	     * @return
	     */
	    @RequestMapping(value="/deleteallblood/{ids}",method=RequestMethod.DELETE)
	    @ResponseBody
		public Msg deleteEmp(@PathVariable("ids")String ids){
			if(ids.contains("-")){
				List<Integer> del_ids=new ArrayList<Integer>();
				String[] str_ids=ids.split("-");
				
				for (String string : str_ids) {
					del_ids.add(Integer.parseInt(string));
				}
				bloodService.deleteBatch(del_ids);
			}else {
				Integer id=Integer.parseInt(ids);
				bloodService.deleteBlood(id);
			}
			
			return Msg.success();
		}
	    /**
	     * 新增
	     * @param bloodtransfusion
	     * @return
	     */
	 @RequestMapping("/addblood")  
	 @ResponseBody
	public Msg addBlood(Bloodtransfusion bloodtransfusion){
		bloodService.addBlood(bloodtransfusion);
		return Msg.success();
	}    
	  /**
	   * 通过id来查一条
	   * @param id
	   * @return
	   */
	 @RequestMapping("/selectbloodbyid/{id}")
	 @ResponseBody
	public Msg selectBloodById(@PathVariable("id")Integer id){
		 Bloodtransfusion blood=bloodService.selectBloodById(id);
		return Msg.success().add("blood", blood);
	} 
	 /**
	  * 更新
	  * @param bloodtransfusion
	  * @return
	  */
	@RequestMapping("/updateblood/{id}") 
	@ResponseBody
	public Msg updateBlood(Bloodtransfusion bloodtransfusion){
		bloodService.updateBlood(bloodtransfusion);
		return Msg.success();
	} 
	 
	 
	 
}
