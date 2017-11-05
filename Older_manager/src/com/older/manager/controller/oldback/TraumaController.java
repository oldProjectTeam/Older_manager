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
import com.older.manager.bean.Trauma;
import com.older.manager.service.oldback.TraumaService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/trauma")
public class TraumaController {
	@Autowired
	private TraumaService traumaService;
	
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
		 * @param traumaname
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/selectalltrauma")
		@ResponseBody
		public Msg selectAllTrauma(@RequestParam(value="pn",defaultValue="1") Integer pn,
				@RequestParam String oldmanname,@RequestParam String traumaname)throws Exception{
			       Trauma trauma=new Trauma();
			       Oldman oldman=new Oldman();
			       trauma.setTraumaname(new String(traumaname.getBytes("iso-8859-1"), "utf-8"));
			       oldman.setName(new String(oldmanname.getBytes("iso-8859-1"), "utf-8"));
			       trauma.setOldman(oldman);
			       PageHelper.startPage(pn,5);
			       List<Trauma> all=traumaService.selectTrauma(trauma);
			       PageInfo pageInfo=new PageInfo(all,5);
			
			       return Msg.success().add("pageInfo", pageInfo);
		}
		/**
		 * 通过id来删除
		 * @param id
		 * @return
		 */
	    @RequestMapping(value="/deletetrauma/{id}",method=RequestMethod.DELETE)
	    @ResponseBody
		public Msg deleteTrauma(@PathVariable("id") Integer id){
	    	traumaService.deleteTrauma(id);
			return Msg.success();
		}
		
	    /**
		 * 批量删除
		 * 
		 * @param ids
		 * @return
		 */
		@RequestMapping(value = "/deletealltrauma/{ids}", method = RequestMethod.DELETE)
		@ResponseBody
		public Msg deleteEmp(@PathVariable("ids") String ids) {
			if (ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<Integer>();
				String[] str_ids = ids.split("-");

				for (String string : str_ids) {
					del_ids.add(Integer.parseInt(string));
				}
				traumaService.deleteBatch(del_ids);
			} else {
				Integer id = Integer.parseInt(ids);
				traumaService.deleteTrauma(id);
			}

			return Msg.success();
		} 	
		/**
		 * 增加外伤信息
		 * @param trauma
		 * @return
		 */
		@RequestMapping("/addtrauma")
		@ResponseBody
		public Msg addTrauma(Trauma trauma){
			traumaService.addTrauma(trauma);
			return Msg.success();
		}
	 /**
	  * 通过id来查	
	  * @param id
	  * @return
	  */
	@RequestMapping("/selecttraumabyid/{id}")	
	@ResponseBody
	public Msg  selectTraumaById(@PathVariable("id")Integer id){
		Trauma trauma=traumaService.selectTrauma(id);
		return Msg.success().add("trauma", trauma);
	}
	/**
	 * 修改
	 * @param trauma
	 * @return
	 */
	@RequestMapping("/updatetrauma/{id}")
	@ResponseBody
	public  Msg updateTrauma(Trauma trauma){
		traumaService.updateTrauma(trauma);
		return Msg.success();
	}
	
		
}
