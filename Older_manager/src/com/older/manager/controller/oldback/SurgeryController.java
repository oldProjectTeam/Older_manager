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
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Surgery;
import com.older.manager.service.oldback.SurgeryService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/surgery")
public class SurgeryController {
	@Autowired
	private SurgeryService surgeryService;
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}; //true:允许输入空值，false:不能为空值  
	/**
	 * 模糊查询所有的
	 * @param pn
	 * @param oldmanname
	 * @param surgeryname
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectallsurgery")
	@ResponseBody
	public Msg selectAllSurgery(@RequestParam(value="pn",defaultValue="1") Integer pn,
    		@RequestParam String oldmanname,@RequestParam String surgeryname)throws Exception{
		     Surgery surgery=new Surgery();
		     surgery.setSurgeryname(new String(surgeryname.getBytes("iso-8859-1"), "utf-8"));
		     Oldman oldman=new Oldman();
		     oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
		     surgery.setOldman(oldman);
		     PageHelper.startPage(pn,5);
		     List<Surgery> all=surgeryService.selectAllSurgery(surgery);
		     PageInfo pageInfo=new PageInfo(all,5);
		     return Msg.success().add("pageInfo", pageInfo);
	}
	/**
	 * 通过id删除一条
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deletesurgerybyid/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteSurgeryById(@PathVariable("id") Integer id){
		surgeryService.deleteSurgery(id);
		return Msg.success();
	}	
	
	

	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deleteallsurgery/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			surgeryService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			surgeryService.deleteSurgery(id);
		}
		
		return Msg.success();
	} 	
	
    /**
     * 增加
     * @param surgery
     * @return
     */
    @RequestMapping("/addsurgery")
    @ResponseBody
    public Msg addSurgry(Surgery surgery){
    	surgeryService.addSurgery(surgery);
    return Msg.success();	
    }
    /**
     * 通过id查一条数据
     * @param id
     * @return
     */
    @RequestMapping("/selectsurgerybyid/{id}")
    @ResponseBody
    public Msg selectSurgeryById(@PathVariable("id")Integer id){
    	Surgery surgery=surgeryService.selectSurgeryById(id);
    	return Msg.success().add("surgery", surgery);
    }
    /**
     * 修改
     * @param surgery
     * @return
     */
    @RequestMapping("/updatesurgery/{id}")
    @ResponseBody
    public Msg updateSurgery(Surgery surgery){
    	surgeryService.updateSurgery(surgery);
    	return Msg.success();
    }
    
}
