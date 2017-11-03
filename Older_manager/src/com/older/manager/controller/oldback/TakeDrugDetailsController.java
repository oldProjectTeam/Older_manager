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
import com.older.manager.bean.Takedrugdetails;
import com.older.manager.service.oldback.TakeDrugDetailsService;
import com.older.manager.utils.Msg;
/**
 * 药物明细
 * @author 疯癫
 *
 */
@Controller
@RequestMapping("/drug")
public class TakeDrugDetailsController {
	 @Autowired
     private  TakeDrugDetailsService takeDrugDetailsService;
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
	 * @param drugname
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectalltakedrugdetails")
	@ResponseBody
	public Msg selectAllTakeDrugDetails(@RequestParam(value="pn",defaultValue="1") Integer pn,
			@RequestParam String oldmanname,@RequestParam String drugname) throws Exception{
                    		
		       Takedrugdetails takedrugdetails=new Takedrugdetails();
		       takedrugdetails.setMedicines(new String(drugname.getBytes("iso-8859-1"), "utf-8"));
		       Oldman oldman=new Oldman();
		       oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
		       takedrugdetails.setOldman(oldman);
		   
		    PageHelper.startPage(pn, 5);
		    List<Takedrugdetails> all=takeDrugDetailsService.selectAllTakeDrugDetails(takedrugdetails);
		    PageInfo  pageInfo=new PageInfo(all,5);
			return Msg.success().add("pageInfo", pageInfo);
	}
		/**
		 * 删除
		 * @param id
		 * @return
		 */
	@RequestMapping(value="/deletetakedrugdetails/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public  Msg deleteTakeDrugDetails(@PathVariable Integer id){
		takeDrugDetailsService.deleteTakeDrugDetails(id);
		return Msg.success();
	}
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deletealldrug/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			takeDrugDetailsService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			takeDrugDetailsService.deleteTakeDrugDetails(id);
		}
		
		return Msg.success();
	} 
    /**
     * 新增药物明细
     * @param takedrugdetails
     * @return
     */
    @RequestMapping("/addtakedrugdetails")
    @ResponseBody
   public Msg addTakeDrugDetails(Takedrugdetails takedrugdetails){
    	
    	takeDrugDetailsService.addTakeDrugDetails(takedrugdetails);
    	
     	return Msg.success();
	   
   } 
    /**
     * 通过id查一条数据
     * @param id
     * @return
     */
    @RequestMapping(value="/selecttakedrugdetailsbyid/{id}")
    @ResponseBody
   public  Msg selectTakeDrugDetailsById(@PathVariable("id")Integer id){
	     Takedrugdetails drug= takeDrugDetailsService.selectTakeDrugDetailsById(id);
    	
    	return Msg.success().add("drug", drug);
   } 
    
    /**
     * 修改
     * @param takedrugdetails
     * @return
     */
    @RequestMapping(value="/updatetakedrugdetails/{id}")
    @ResponseBody
    public Msg updateTakeDrugDetails(Takedrugdetails takedrugdetails){
    	takeDrugDetailsService.updateTakeDrugDetails(takedrugdetails);
		return Msg.success();
    	
    }
	
}
