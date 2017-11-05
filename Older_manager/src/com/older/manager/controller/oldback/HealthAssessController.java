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
import com.older.manager.bean.Assess;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.HealthAssessService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/access")
public class HealthAssessController {
	@Autowired
	private HealthAssessService healthAssessService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值
	/**
	 * 跳转到健康评估页面
	 * @return
	 */
    @RequestMapping("/skiphealthaccess")
	public String skipHealthAccess(){
		return "oldback/healthManage/healthAccess";
	}
    
    /**
     * 模糊查询所有的
     * @param pn
     * @param oldmanname
     * @param health
     * @return
     * @throws Exception
     */
    @RequestMapping("/selectallhealthassess")
    @ResponseBody
    public Msg selectAllHealthAssess(@RequestParam(value="pn",defaultValue="1") Integer pn,
    		@RequestParam String oldmanname,@RequestParam String healthname) throws Exception{
    	  Assess assess=new Assess();
    	  Oldman oldman=new Oldman();
    	  oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
    	  assess.setOldman(oldman);
    	  if (!new String(healthname.getBytes("iso-8859-1"), "utf-8").equals("请选择")) {
			assess.setHealth(new String(healthname.getBytes("iso-8859-1"), "utf-8"));
		}
    	PageHelper.startPage(pn, 5);
    	List<Assess> all=healthAssessService.selectAllHealthAssess(assess);
    	PageInfo pageInfo=new PageInfo(all,5);
		return Msg.success().add("pageInfo", pageInfo);
    	
    }
    /**
     * 删除
     * @param id
     * @return
     */
   @RequestMapping("/deletehealthassess/{id}") 
   @ResponseBody
   public Msg deleteHealthAssess(@PathVariable("id")Integer id){
	     healthAssessService.deleteHealthAssess(id);
	return Msg.success();
   } 
    
   /**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/deleteallhealthassess/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");

			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			healthAssessService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			  healthAssessService.deleteHealthAssess(id);
		}

		return Msg.success();
	} 
	/**
	 * 新增健康评估
	 * @param assess
	 * @return
	 */
	@RequestMapping("/addhealthassess")
	@ResponseBody
	public Msg addHealthAssess(Assess assess){
        healthAssessService.addHealthAssess(assess);		
		return Msg.success();
		
	}
	/**
	 * 通过id查一条
	 * @param id
	 * @return
	 */
	@RequestMapping("/selecthealthassessbyid/{id}")
	@ResponseBody
	public Msg selectHealthAssessById(@PathVariable("id")Integer id){
		Assess assess=healthAssessService.selectHealthAssess(id);
		return Msg.success().add("assess", assess);	
	}
	/**
	 * 修改
	 * @param assess
	 * @return
	 */
	@RequestMapping("/updatehealthassess/{id}")
	@ResponseBody
	public Msg updateHealthAssess(Assess assess){
		healthAssessService.updateHealthAssess(assess);
		return Msg.success();
		
	}
	
    
}
