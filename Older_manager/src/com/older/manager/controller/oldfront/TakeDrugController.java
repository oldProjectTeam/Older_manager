package com.older.manager.controller.oldfront;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Takedrugdetails;
import com.older.manager.service.oldfront.ITakeDrugService;
import com.older.manager.utils.Msg;

/**
 * 用药记录
 * @author 疯癫
 *
 */
@Controller
@RequestMapping("/takedrug")
public class TakeDrugController {
    @Autowired
	private ITakeDrugService takeDrugService;
	/**
	 * @Title:   initBinder
	 * @Description:  解决上传时间转换问题
	 * @param:    @param binder   
	 * @return:   void   
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值
    
    /**
     * 查询所有的
     * @param pn
     * @param time1
     * @param time2
     * @return
     * @throws ParseException 
     */
    @RequestMapping("/selectalltakedrug")
    @ResponseBody
    public Msg selectAllTakeDrug(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam Date time1,
    		@RequestParam Date time2,@RequestParam Integer id) throws ParseException{
    	System.out.println("时间1----------------->"+time1);
    	System.out.println("时间2----------------->"+time2);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Takedrugdetails takedrugdetails=new Takedrugdetails();
    	if (time1!=null&&time2!=null) {
    		Date d = sdf.parse(time1.toLocaleString());
    		Date g = sdf.parse(time2.toLocaleString());
    		takedrugdetails.setStarttakingdate(d);
        	takedrugdetails.setEndtakingdate(g);
		}else{
			
			takedrugdetails.setStarttakingdate(null);
        	takedrugdetails.setEndtakingdate(null);
			
		}
		
    	PageHelper.startPage(pn,5);
    	takedrugdetails.setOldmanId(id);
    	List<Takedrugdetails> all=takeDrugService.selectAllTakeDrug(takedrugdetails);
    	PageInfo pageInfo=new PageInfo(all,5);
    	
    	 return Msg.success().add("pageInfo", pageInfo);
    }
    
    

    
    /**
     * 增加
     * @param takedrugdetails
     * @return
     */
    @RequestMapping("/addtakedrug")
    @ResponseBody
    public Msg addTakeDrug(Takedrugdetails takedrugdetails){
    	takeDrugService.addTakeDrug(takedrugdetails);
    	return Msg.success();
    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/deletetakedrug/{id}")
    @ResponseBody
   public Msg deleteTakeDrug(@PathVariable Integer id){
    	takeDrugService.deleteTakeDrug(id);
	    return Msg.success();
   } 
    /**
     * 通过id来查一条数据
     * @param id
     * @return
     */
  @RequestMapping("/selettakedrugbyid/{id}")
  @ResponseBody
  public Msg selectTakeDrugById(@PathVariable Integer id){
	  Takedrugdetails tdd=takeDrugService.selectTakeDrugById(id);
	  return Msg.success().add("tdd", tdd);
  }  
    
  
  /**
   * 更新
   * @param takedrugdetails
   * @return
   */
  @RequestMapping("/updatetakedrug/{id}")
  @ResponseBody
  public Msg updateTakeDrug(Takedrugdetails takedrugdetails,@PathVariable Integer id){
	  takedrugdetails.setId(id);
	  System.out.println("药物------>"+takedrugdetails);
	  takeDrugService.updateTakeDrug(takedrugdetails);
	return Msg.success();
	  
  }
    
}
