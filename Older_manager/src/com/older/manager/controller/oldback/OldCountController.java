package com.older.manager.controller.oldback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.service.oldback.IOldmanaccountService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/oldmanaccount")
public class OldCountController {

	@Autowired
	@Qualifier("oldmanaccountServiceImpl")
	IOldmanaccountService oldmanaccountService;
	
	@Autowired
	@Qualifier("addNewOlderServiceImpl")
	AddNewOlderService addNewOlderService;
	
	/**
	 * 批量增加老人账户
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/batchAddAcount")
	@ResponseBody
	public Msg batchAddAcount(String ids){
		Oldman oldman=null;
		List<Oldman>oldmans=new ArrayList<Oldman>();
		boolean flag=false;
		try {
			if(ids.contains("-")){
				List<Integer>id_int=new ArrayList<Integer>();
				String str[]=ids.split("-");
				for(String s:str){
					id_int.add(Integer.parseInt(s));
				}
				for(Integer id:id_int){
					oldman=addNewOlderService.selectOlder(id);
					oldmans.add(oldman);
				}
			}else{
				oldman=addNewOlderService.selectOlder(Integer.parseInt(ids));
				oldmans.add(oldman);
			}
			oldmanaccountService.batchInsertAccount(oldmans);
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
	
	/**
	 * 分页查询所有账户信息
	 * @return
	 */
	@RequestMapping("/queryAllAccount")
	public ModelAndView queryAllAccount(@RequestParam(value="pn",defaultValue="1")Integer pn,Oldmanaccount oldmanaccount){
		PageHelper.startPage(pn,5);
		List<Oldmanaccount>acounts=oldmanaccountService.selectAccountAndOldmanByCondiction(oldmanaccount);
		PageInfo pageInfo=new PageInfo(acounts,5);
	 
		ModelAndView model=new ModelAndView("/oldback/oldaccountmanage/accountmanage");
		model.addObject("pageInfo", pageInfo);
		return model;
	}
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/deleteAccount/{ids}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteAccount(@PathVariable("ids")String ids){
		boolean flag = false;
		try {
			if (ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<Integer>();
				String str[] = ids.split("-");
				for (String s : str) {
					del_ids.add(Integer.parseInt(s));
				}		
				oldmanaccountService.batchDeleteAccount(del_ids);
			} else {
				Integer id = Integer.parseInt(ids);
				oldmanaccountService.deleteAccount(id);
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
	 * 密码重置
	 * @param id
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping(value="/psReset/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Msg psReset(@PathVariable("id")Integer id){
		boolean flag=false;
		try {
			oldmanaccountService.passwordResrt(id);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (flag) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		}
	}
	/**
	 * accountmanage.jsp
	 * @return
	 */
	@RequestMapping("/accountmanage")
	public String accountmanage(){
		return "oldback/oldaccountmanage/accountmanage";
	}
	
	/**
	 * accountManageindex.jsp
	 * @return
	 */
	@RequestMapping("/accountManageindex")
	public String accountManageindex(){
		return "oldback/oldaccountmanage/accountManageindex";
	}
	
	/**
	 *giftexchange.jsp
	 * @return
	 */
	@RequestMapping("/giftexchange")
	public String giftexchange(){
		return "oldback/oldaccountmanage/giftexchange";
	}
	
	/**
	 *giftmanage.jsp
	 * @return
	 */
	@RequestMapping("/giftmanage")
	public String giftmanage(){
		return "oldback/oldaccountmanage/giftmanage";
	}
	
	/**
	 *integralexchane.jsp
	 * @return
	 */
	@RequestMapping("/integralexchane")
	public String integralexchane(){
		return "oldback/oldaccountmanage/integralexchane";
	}
	
	/**
	 * 查询所有不在账户表的老人
	 * @param pn
	 * @param oldman
	 * @return
	 */
	@SuppressWarnings({ "finally", "unchecked", "rawtypes" })
	@RequestMapping("/selectOldManNotAccount")
	@ResponseBody
	public Msg selectOldManNotAccount(@RequestParam(value="pn",defaultValue="1")Integer pn,Oldman oldman){
		boolean flag=false;
		PageInfo pageInfo=null;
		try {
			PageHelper.startPage(pn,5);
			List<Oldman>oldmans=oldmanaccountService.selectOldManNotAccount(oldman);
			pageInfo=new PageInfo(oldmans,3);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success().add("pageInfo",pageInfo);
			}else{
				return Msg.fail();
			}
		}
	}
}
