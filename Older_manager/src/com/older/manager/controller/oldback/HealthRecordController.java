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
import com.older.manager.bean.Medicalrecord;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.HealthRecordService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/health")
public class HealthRecordController {

	@Autowired
	private HealthRecordService healthRecordService;
	
	
	 @InitBinder  
		public void initBinder(WebDataBinder binder) {  
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
			dateFormat.setLenient(false);  
			binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
			}; //true:允许输入空值，false:不能为空值  

	/**
	 * 模糊查询所有
	 * @param pn
	 * @param hospital1
	 * @param oldmanname
	 * @param doctor1
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectallhealthrecord")
	@ResponseBody
	public Msg selectAllHealthRecord(@RequestParam(value="pn",defaultValue="1") Integer pn,
			@RequestParam String hospital1,@RequestParam String oldmanname,@RequestParam String doctor1)throws Exception{
		    PageHelper.startPage(pn, 5);
           	Medicalrecord medicalrecord=new Medicalrecord();	
		    medicalrecord.setHospital(new String(hospital1.getBytes("iso-8859-1"), "utf-8"));
		    medicalrecord.setDoctor( new String(doctor1.getBytes("iso-8859-1"), "utf-8"));
		    Oldman oldman=new Oldman();
		    oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
		    medicalrecord.setOldman(oldman);
		     List<Medicalrecord> all=healthRecordService.selectAllHealthRecord(medicalrecord);
			 PageInfo pageInfo=new PageInfo(all,5);
			return Msg.success().add("pageInfo", pageInfo);
		
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deletehealthrecord/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteHealthRecord(@PathVariable("id") Integer id){
		healthRecordService.deleteHealthRecord(id);
		return Msg.success();
		
	}
	
	
	/**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping(value="/deleteallhealthrecord/{ids}",method=RequestMethod.DELETE)
    @ResponseBody
	public Msg deleteEmp(@PathVariable("ids")String ids){
		if(ids.contains("-")){
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			healthRecordService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			healthRecordService.deleteHealthRecord(id);
		}
		
		return Msg.success();
	} 	
	@RequestMapping("/addhealthrecord")
	@ResponseBody
	public Msg addHealthRecord(Medicalrecord medicalrecord){
		
		healthRecordService.addHealthRecord(medicalrecord);
		return Msg.success();
	}
	
	/**
	 * 修改
	 * @param medicalrecord
	 * @return
	 */
	@RequestMapping(value="/updatehealthrecord/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Msg updateHealthRecord(Medicalrecord medicalrecord){
		healthRecordService.updateHealthRecord(medicalrecord);
		return Msg.success();
		
	}
	/**
	 * 通过id查找一条数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/selecthealthrecord/{id}")
	@ResponseBody
	public Msg selectHealthRecord(@PathVariable("id") Integer id){
		
		Medicalrecord medicalrecord=healthRecordService.selectHealthRecordById(id);
		
		return Msg.success().add("medicalrecord", medicalrecord);
		
	}
	
	
}
