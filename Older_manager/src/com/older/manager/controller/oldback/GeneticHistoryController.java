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
import com.older.manager.bean.Genetichistory;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.GeneticHistoryService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/history")
public class GeneticHistoryController {
	@Autowired
	private GeneticHistoryService geneticHistoryService;
	
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
	 * @param diseasename
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectallgenetichistory")
	@ResponseBody
	public Msg selectAllGeneticHistory(@RequestParam(value="pn",defaultValue="1") Integer pn,
    		@RequestParam String oldmanname,@RequestParam String diseasename)throws Exception{
		    Genetichistory genetichistory=new Genetichistory();
		    genetichistory.setDiseasename(new String(diseasename.getBytes("iso-8859-1"), "utf-8"));
		    Oldman oldman=new Oldman();
		    oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
		    genetichistory.setOldman(oldman);
		    PageHelper.startPage(pn,5);
		    List<Genetichistory> all=geneticHistoryService.selectAllGeneticHistory(genetichistory);
		    PageInfo pageInfo=new PageInfo(all,5);
		    return Msg.success().add("pageInfo", pageInfo);
	}
	/**
	 * 通过id来删除一条
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletgenetichistory/{id}")
	@ResponseBody
	public Msg deleteGeneticHistory(@PathVariable("id")Integer id){
		geneticHistoryService.deleteGeneticHistory(id);
		return Msg.success();
	}
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deleteallgenetichistory/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			geneticHistoryService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			geneticHistoryService.deleteGeneticHistory(id);
		}
		
		return Msg.success();
	}
    /**
     * 增加
     * @param genetichistory
     * @return
     */
    @RequestMapping("/addgenetichistory")
    @ResponseBody
    public Msg addGeneticHistory( Genetichistory genetichistory){
    	 geneticHistoryService.addGeneticHistory(genetichistory);
    	 return Msg.success();
    }
    /**
     * 通过id查一条
     * @param id
     * @return
     */
    @RequestMapping("/selectgenetichistory/{id}")
    @ResponseBody
    public Msg selectGeneticHistory(@PathVariable("id")Integer id){
    	  Genetichistory history= geneticHistoryService.selectGeneticHistoryById(id);
    	  return Msg.success().add("history", history);
    }
    /**
     * 修改
     * @return
     */
    @RequestMapping("/updategenetichistory/{id}")
    @ResponseBody
    public Msg updateGeneticHistory(Genetichistory genetichistory){
    	geneticHistoryService.updateGeneticHistory(genetichistory);
    	return Msg.success();
    }
    
}
