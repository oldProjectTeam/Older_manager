package com.older.manager.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;












import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.sym.Name;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Oldman;
import com.older.manager.service.AddNewOlderService;
import com.older.manager.utils.Msg;

/**
 * 新增老人
 * @author 疯癫
 *
 */
@Controller
@RequestMapping("/old")
public class AddNewOlderControl {
	
    @Autowired
	private AddNewOlderService addNewOlderService;
    
    
    @InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}; //true:允许输入空值，false:不能为空值  

    
    /**
     * 增加老人
     * @param oldman
     * @return
     */
    @RequestMapping("/addnewolder")
    public String addNewOlder(Oldman oldman){
    	oldman.setPhoto("照片");
       addNewOlderService.addNewOlder(oldman);
    	return "oldManInfoMange/selectallolderwith"; 
    }
    /**
     * 跳转到插入老人页面
     * @return
     */
    @RequestMapping("/insertnewolder")
    public String insertnewolder(){
    	return "oldManInfoMange/addOldManInfo";
    }
    
    
    
    
    /**
     * 删除老人
     * @param id
     * @return
     */
    @RequestMapping(value="/deleteolder/{id}",method=RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteOlder(@PathVariable("id") Integer id){
    	
    	addNewOlderService.deleteOlder(id);
   
    	return Msg.success();
    }
    
    
    
    /**
     * 更新老人
     * @param oldman
     * @return
     */
    @RequestMapping("/upateolder")
    public String updateOlder(Oldman oldman){
    	
    	addNewOlderService.updateOlder(oldman);
    	return "oldManInfoMange/addnewolder";
    }
    
    /**
     * 通过id查看一个老人
     * @param id
     * @return
     */
    @RequestMapping(value="/selectolder/{id}")
    public String selectOlder(@PathVariable("id") Integer id,Model model){
    	
    	Oldman oldman=addNewOlderService.selectOlder(id);
    	model.addAttribute("oldman", oldman);
    	return "oldManInfoMange/oldManInfoView";
    }
     /**
      * 查询所有老人
      * @param pn
      * @param model
      * @return
      */
    @RequestMapping("/selectallolder/{pn}")
    public String  selectAllOlder(@PathVariable Integer pn,Model model){
    	 PageHelper.startPage(pn, 5);
    	 List<Oldman> allolder=addNewOlderService.selectAllOlder();
    	 PageInfo pageInfo=new PageInfo(allolder,5);
    	 model.addAttribute("pageInfo",pageInfo);
    	 return "oldManInfoMange/addnewolder";
    }
    /**
     * 模糊查询所有老人
     * @param pn
     * @param model
     * @param str
     * @return
     */      //@RequestParam(value="str",defaultValue="")
    //@RequestMapping("/selectallolderwith/{pn}&{str}")
    public String selectAllOlderWith(@PathVariable Integer pn,Model model,  String str){
    	 PageHelper.startPage(pn, 5);
    	 List<Oldman> allolder=addNewOlderService.selectAllOlderWith(str);
    	 PageInfo pageInfo=new PageInfo(allolder,5);
    	 model.addAttribute("pageInfo",pageInfo);
    	return "oldManInfoMange/selectallolderwith";
    }
    /**
     * 模糊查询返回json数据
     * @param pn
     * @param str
     * @return
     */
    
    @RequestMapping("/selectallolderwith")
    @ResponseBody
    public Msg  selectAllOlderWithJson(@RequestParam(value="pn",defaultValue="1") Integer pn, 
    		@RequestParam(value="str",defaultValue="") String str){
    	PageHelper.startPage(pn, 5);
    	List<Oldman> allolder=addNewOlderService.selectAllOlderWith(str);
    	PageInfo pageInfo=new PageInfo(allolder,5);
    	return Msg.success().add("pageInfo", pageInfo);
    	
    }
    /**
     * 跳转老人列表
     * @return
     */
   @RequestMapping("skipolderinfo") 
   public String skipolderinfo (){
	return "oldManInfoMange/selectallolderwith";
	   
	   
   }
   

   /**
	 * 老人批量导入
	 * 
	 * @param oldman
	 * @return
	 */
	@RequestMapping(value = "/addOldManBatch", method = RequestMethod.POST)
	public String addOldManBatch(@RequestParam("file") MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,Model model) {
		// 判断文件是否为空
		if (file == null)
			return null;
		// 获取文件名
		String name = file.getOriginalFilename();
		// 进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）
		long size = file.getSize();
		if (name == null || ("").equals(name) && size == 0)
			return null;
		// 批量导入。参数：文件名，文件。
		boolean b = addNewOlderService.batchImport(name, file);
		String msg = "";
		if (b) {
			msg= "批量导入EXCEL成功";
		} else {
			msg= "批量导入EXCEL失败";
		}
		model.addAttribute("msg", msg);
		return "oldManInfoMange/batchImport";
	}
   /**
    * 跳转到批量导入
    * @return
    */
    @RequestMapping("/batchImport")
    public String batchImport(){
    	return "oldManInfoMange/batchImport";
    }
    
}
