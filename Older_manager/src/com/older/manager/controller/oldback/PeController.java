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
import com.older.manager.bean.Pedetails;
import com.older.manager.bean.Peinfo;
import com.older.manager.service.oldback.PeService;
import com.older.manager.utils.Msg;


@Controller
@RequestMapping("/pe")
/**
 * 体检记录
 * @author 疯癫
 *
 */
public class PeController {
	  @Autowired
      private PeService peService;
	  
	  
       //时间转换器
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
	   * @param hospitalname
	   * @return
	   * @throws Exception
	   */
	  @RequestMapping("/selectallpe")
	  @ResponseBody
	  public Msg selectAllPe(@RequestParam(value="pn",defaultValue="1") Integer pn,
		@RequestParam String oldmanname,@RequestParam String hospitalname) throws Exception{
		  
		  Pedetails pedetails=new Pedetails();
		  Oldman oldman=new Oldman();
		  Peinfo peinfo=new Peinfo();
		  oldman.setName(new String(oldmanname.getBytes("ISO-8859-1"), "utf-8"));
		  peinfo.setHospital(new String(hospitalname.getBytes("ISO-8859-1"), "utf-8"));
		  pedetails.setOldman(oldman);
		  pedetails.setPeinfo(peinfo);
		  PageHelper.startPage(pn, 5);  
		  List<Pedetails> all=peService.selectAllPe(pedetails);
		  PageInfo pageInfo=new PageInfo(all,5);
		  
		  
		    return Msg.success().add("pageInfo", pageInfo);
		  
		  
	  }
	  
	  /**
	   * 点击删除
	   * @param id
	   * @return
	   */
	 @RequestMapping(value="/deletepe/{id}",method=RequestMethod.DELETE) 
	 @ResponseBody
	public Msg deletePe(@PathVariable("id") Integer id){
		 peService.deletePe(id);
		return Msg.success();
		
	}  
	 /**
	     * 批量删除
	     * @param ids
	     * @return
	     */
	    @RequestMapping(value="/deleteallpe/{ids}",method=RequestMethod.DELETE)
	    @ResponseBody
		public Msg deleteEmp(@PathVariable("ids")String ids){
			if(ids.contains("-")){
				List<Integer> del_ids=new ArrayList<Integer>();
				String[] str_ids=ids.split("-");
				
				for (String string : str_ids) {
					del_ids.add(Integer.parseInt(string));
				}
				peService.deleteBatch(del_ids);
			}else {
				Integer id=Integer.parseInt(ids);
				 peService.deletePe(id);
			}
			
			return Msg.success();
		}   
	 
	    
	    /**
	     * 新增
	     * @param pedetails
	     * @return
	     */
	@RequestMapping("/addpe") 
	@ResponseBody
	public Msg addPe(Pedetails pedetails){
		Peinfo peinfo=new Peinfo();
		peinfo.setHospital(pedetails.getPeinfo().getHospital());
		peinfo.setPetime(pedetails.getPeinfo().getPetime());
		peinfo.setNexttime(pedetails.getPeinfo().getNexttime());
		peinfo.setRemark(pedetails.getPeinfo().getRemark());
		peinfo.setOldmanId(pedetails.getOldman().getId());
	    peService.addPeInfo(peinfo);
		
	    pedetails.setPeinfoId(peinfo.getId());
		peService.addPe(pedetails);
		
		return Msg.success();
	} 
	/**
	 * 通过id查一条
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectpebyid/{id}")
	@ResponseBody
	public Msg selectPeById(@PathVariable("id") Integer id){
		Pedetails pedetails=peService.selectPeById(id);
		
		return Msg.success().add("pedetails", pedetails);
		
	}    
	/**
	 * 修改
	 * @param pedetails
	 * @return
	 */
	@RequestMapping(value="/updatepe/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Msg updatePe(Pedetails pedetails,@PathVariable("id") Integer id){
		Pedetails p=peService.selectPeById(id);
		peService.updatePe(pedetails);
		
		Peinfo peinfo=new Peinfo();
		peinfo.setHospital(pedetails.getPeinfo().getHospital());
		peinfo.setPetime(pedetails.getPeinfo().getPetime());
		peinfo.setNexttime(pedetails.getPeinfo().getNexttime());
		peinfo.setRemark(pedetails.getPeinfo().getRemark());
		peinfo.setId(p.getPeinfoId());
		peService.updatePeInfo(peinfo);
		return Msg.success();
	}
	  
}
