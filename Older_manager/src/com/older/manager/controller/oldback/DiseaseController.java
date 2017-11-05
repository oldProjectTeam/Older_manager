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
import com.older.manager.bean.Disease;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.DiseaseService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/disease")
/**
 * 疾病列表
 * @author 疯癫
 *
 */
public class DiseaseController {
	@Autowired
	private DiseaseService diseaseService;
	
    /**
     * 跳到疾病列表
     * @return
     */
	@RequestMapping("/skipdisease")
	private String skipDisease(){
		return "oldback/healthManage/Disease";
	}
	/**
	 * 跳到手术列表
	 * @return
	 */
	@RequestMapping("/skipsurgery")
	private String skipSurgery(){
		return "oldback/healthManage/surgery";
	}
	/**
	 * 跳到外伤
	 * @return
	 */
	@RequestMapping("/skiptrauma")
	private String skipTrauma(){
		return "oldback/healthManage/trauma";
	}
	/**
	 * 跳到输液列表
	 * @return
	 */
	@RequestMapping("/skipbloodtransfusion")
	private String skipBloodTransfusion(){
		return "oldback/healthManage/bloodTransfusion";
	}
	/**
	 * 跳到家族史列表
	 * @return
	 */
	@RequestMapping("/skipfamilyhistory")
	private String skipFamilyHistory(){
		return "oldback/healthManage/familyHistory";
	}
	
	/**
	 * 跳到家族史列表
	 * @return
	 */
	@RequestMapping("/skipgenetichistory")
	private String skipGeneticHistory(){
		return "oldback/healthManage/geneticHistory";
	}
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}; //true:允许输入空值，false:不能为空值  
	/**
	 * 模糊查询
	 * @param pn
	 * @param oldmanname
	 * @param diseasename
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectalldisease")
	@ResponseBody
	public Msg selectAllDisease(@RequestParam(value="pn",defaultValue="1") Integer pn,
    		@RequestParam String oldmanname,@RequestParam String diseasename)throws Exception{
		     Disease disease=new Disease();
		     disease.setDiseasename(new String(diseasename.getBytes("iso-8859-1"), "utf-8"));
		     Oldman oldman=new Oldman();
		     oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
		     disease.setOldman(oldman);
		     PageHelper.startPage(pn,5);
		     List<Disease> all=diseaseService.selectAllDiseases(disease);
		     PageInfo pageInfo=new PageInfo(all,5);
		      return Msg.success().add("pageInfo", pageInfo);
	}	
	/**
	 * 删除通过id
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deletedisease/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteDisease(@PathVariable("id")Integer id){
		diseaseService.deleteDisease(id);
		return Msg.success();
	}
	
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deletealldisease/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			diseaseService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			diseaseService.deleteDisease(id);
		}
		
		return Msg.success();
	} 
	/**
	 * 增加
	 * @param disease
	 * @return
	 */
	@RequestMapping("/adddisease")
	@ResponseBody
	public Msg addDisease(Disease disease){
		 diseaseService.addDisease(disease);
		return Msg.success();
	}
	
	/**
	 * 通过id查一条
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectdiseasebyid/{id}")
	@ResponseBody
	public Msg selectDiseaseById(@PathVariable("id")Integer id){
		Disease disease=diseaseService.selectDisease(id);
		return Msg.success().add("disease", disease);
	}
	/**
	 * 修改
	 * @param disease
	 * @return
	 */
	@RequestMapping("/updatedisease/{id}")
	@ResponseBody
	public Msg updateDisease(Disease disease){
		diseaseService.updateDisease(disease);
		return Msg.success();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
