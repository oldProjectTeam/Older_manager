package com.older.manager.controller.oldback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Giftexchange;
import com.older.manager.service.oldback.IGiftexchangeService;
import com.older.manager.utils.Msg;

/**
 * 礼品兑换处理请求控制器
 * @author lenovo
 *
 */
@Controller
@RequestMapping("giftexchange")
public class GiftexchangeController {
	@Autowired
	IGiftexchangeService giftexchangeService;
	
	/**
	 * 分页查询所有礼品兑换信息
	 * @return
	 */
	@RequestMapping("/findAllGiftexchange")
	public ModelAndView findAllGiftexchange(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Giftexchange giftexchange,ModelAndView modal)throws Exception{
		PageHelper.startPage(pn,5);
		List<Giftexchange>giftexchanges=giftexchangeService.selectGiftExchangeAndOldmanByCondition(giftexchange);
		PageInfo pageInfo=new PageInfo(giftexchanges,5);
		modal.setViewName("/oldback/oldaccountmanage/giftexchange");
		modal.addObject("pageInfo", pageInfo);
		return modal;
	}

	/**
	 * 根据id查询礼品兑换记录
	 * @param id
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/findGiftexchange")
	@ResponseBody
	public Msg findGiftexchange(Integer id){
		boolean flag=false;
		Giftexchange giftexchange=null;
		try {
			giftexchange=giftexchangeService.findGiftexchangeById(id);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (flag) {
				return Msg.success().add("giftexchange", giftexchange);
			}else{
				return Msg.fail();
			}
		}
	}
	
	/**
	 * 更新礼品兑换信息
	 * @param giftexchange
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("updateGiftexchange")
	@ResponseBody
	public Msg updateGiftexchange(Giftexchange giftexchange){
		boolean flag=false;
		 
		try {
			giftexchangeService.updateGiftexchange(giftexchange);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (flag) {
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
	
	/**
	 * 删除礼品兑换信息（单删除、批量删除）
	 * @param ids：id集合
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/deleteGIftexchange/{ids}")
	@ResponseBody
	public Msg deleteGIftexchange(@PathVariable("ids")String ids){
		boolean flag = false;
		try {
			if (ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<Integer>();
				String str[] = ids.split("-");
				for (String s : str) {
					del_ids.add(Integer.parseInt(s));
				}		
				giftexchangeService.batchDeleteGiftexchange(del_ids);
			} else {
				Integer id = Integer.parseInt(ids);
				giftexchangeService.deleteGiftexchange(id);
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
	 * 有选择的添加礼品兑换记录
	 * @param giftexchange
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/insertGiftexchange")
	@ResponseBody
	public Msg insertGiftexchange(Giftexchange giftexchange){
		boolean flag=false;
		try {
			giftexchangeService.insertGiftexchange(giftexchange);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (flag) {
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
}
