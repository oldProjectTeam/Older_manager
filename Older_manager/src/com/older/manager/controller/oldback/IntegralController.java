package com.older.manager.controller.oldback;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Integral;
import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.IIntegralService;
import com.older.manager.utils.Msg;

@RequestMapping("/integral")
@Controller
public class IntegralController {

	@Autowired
	@Qualifier("integralServiceImpl")
	IIntegralService integralService;
	
	
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
	 * 分页显示所有老人积分信息
	 * @param pn
	 * @param integral
	 * @return
	 */
	@RequestMapping("/integralexchane")
	public ModelAndView queryAllIntegral(@RequestParam(value="pn",defaultValue="1")Integer pn,Integral integral){
		PageHelper.startPage(pn,5);
		List<Integral>integrals=integralService.queryAllIntegral(integral);
		PageInfo pageInfo=new PageInfo(integrals,5);
		ModelAndView modal=new ModelAndView("/oldback/oldaccountmanage/integralexchane");
		modal.addObject("pageInfo", pageInfo);
		return modal;
	}
	
	/**
	 * 删除老人积分管理（单删除、批量删除）
	 * @param ids：id集合
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping(value="/deleteIntegral/{ids}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteIntegral(@PathVariable("ids")String ids){
		boolean flag = false;
		try {
			if (ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<Integer>();
				String str[] = ids.split("-");
				for (String s : str) {
					del_ids.add(Integer.parseInt(s));
				}		
				integralService.batchDeleteIntegral(del_ids);
			} else {
				Integer id = Integer.parseInt(ids);
				integralService.deleteIntegral(id);
			}
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		}
	}
	/**
	 * 查询所有不在积分表的老人信息
	 * @param pn
	 * @param oldman
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/selectOldManNotIntegral")
	@ResponseBody
	public Msg selectOldManNotIntegral(@RequestParam(value="pn",defaultValue="1")Integer pn,Oldman oldman){
		boolean flag=false;
		PageInfo pageInfo=null;
		try {
			PageHelper.startPage(pn,5);
			List<Oldman>oldmans=integralService.selectOldManNotIntegral(oldman);
			pageInfo=new PageInfo(oldmans,3);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success().add("pageInfo", pageInfo);
			}else{
				return Msg.fail();
			}
		}
		
	}
	
	@SuppressWarnings("finally")
	@RequestMapping("/batchAddIntegral")
	@ResponseBody
	public Msg batchAddIntegral(String ids){
		boolean flag=false;
		try {
			List<Integer>id_str=new ArrayList<Integer>();
			String str[]=ids.split("-");
			for(String s:str)
				id_str.add(Integer.parseInt(s));
			integralService.batchInsertIntegral(id_str);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
}
