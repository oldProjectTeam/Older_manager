package com.older.manager.controller.oldback;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Relatives;
import com.older.manager.service.oldback.OldRelativesService;
import com.older.manager.utils.Msg;


@Controller
@RequestMapping("/rel")
public class OldRelativesControl {
    @Autowired
	private OldRelativesService oldRelativesService; 
    

    
    
    
    /**
     * 通过老人的id查询所有
     * @param pn
     * @return
     */
    @RequestMapping("/selectAllRelatives")
    @ResponseBody
   public Msg  selectAllRelatives(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam Integer id){
    	PageHelper.startPage(pn, 5);
    	List<Relatives> list=oldRelativesService.selectOlderRelativesByOlderId(id);
    	PageInfo pageInfo=new PageInfo(list,5);
	   return Msg.success().add("pageInfo", pageInfo);

   }
    
    /**
     * 跳转到所有关系页
     * @return
     */
    @RequestMapping("/skipallrelatives/{id}")
    public String skipAllRelatives(@PathVariable("id")Integer id){
		return "oldback/oldManInfoMange/relativeInfo";

    }
    
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value="/deleterelativesbyid/{id}",method=RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteRelativesById(@PathVariable("id") Integer id){
    	
    	oldRelativesService.deleteOlderRelative(id);
   
    	return Msg.success();
    }
    
      /**
       * 批量删除
       * @param ids
       * @return
       */
      @RequestMapping(value="/deleterelativesall/{ids}",method=RequestMethod.DELETE)
      @ResponseBody
  	public Msg deleteEmp(@PathVariable("ids")String ids){
  		if(ids.contains("-")){
  			List<Integer> del_ids=new ArrayList<Integer>();
  			String[] str_ids=ids.split("-");
  			
  			for (String string : str_ids) {
  				del_ids.add(Integer.parseInt(string));
  			}
  			oldRelativesService.deleteBatch(del_ids);
  		}else {
  			Integer id=Integer.parseInt(ids);
  			oldRelativesService.deleteOlderRelative(id);
  		}
  		
  		return Msg.success();
  	}
    
    
    
    /**
     * 添加
     * @param relatives
     * @return
     */
    @RequestMapping(value="/addrelatives/{oldid}",method=RequestMethod.POST)
    @ResponseBody
    public Msg addRelatives(@Valid Relatives relatives, @PathVariable("oldid")Integer oldid){
    	relatives.setOldmanId(oldid);
    	oldRelativesService.addOlderRelative(relatives);
		return Msg.success();
    }
    
    /**
     * 修改老人关系
     * @return
     */
    @RequestMapping(value="/updaterelatives/{id}",method=RequestMethod.POST)
    @ResponseBody
    public Msg updateRelatives(Relatives relatives){
    	oldRelativesService.updateOlderRelative(relatives);
		return Msg.success();
    	
    }
    
    /**
     * 通过id 查一条数据
     * @param id
     * @return
     */
    @RequestMapping("/selectrelativesbyid/{id}")
    @ResponseBody
    public Msg selectRelativesById(@PathVariable("id")Integer id){
    	  Relatives relatives= oldRelativesService.selectOlderRelative(id);    	  
		return Msg.success().add("relatives", relatives);
    	
    }
}
