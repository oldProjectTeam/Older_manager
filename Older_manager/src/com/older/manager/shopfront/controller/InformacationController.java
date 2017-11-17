package com.older.manager.shopfront.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Integral;
import com.older.manager.bean.IntegralExample;
import com.older.manager.bean.IntegralExample.Criteria;
import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShopMember;
import com.older.manager.bean.Users;
import com.older.manager.mapper.IntegralMapper;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.service.shopfront.InformationService;
import com.older.manager.utils.Msg;

@Controller
/**
 * 个人信息
 * @author 疯癫
 *
 */
@RequestMapping("/info")
public class InformacationController {
	@Autowired
	  private InformationService informationService;
	  
	    @Autowired
		private IntegralMapper integralMapper;
	    @Autowired
		private AddNewOlderService addNewOlderService;
	  /**
	   * 通过id来差一条数据
	   * @param id
	   * @return
	   */
	  @RequestMapping("/selectinformation/{usersid}")
	  @ResponseBody
	  public Msg selectInformationById(@PathVariable("usersid")Integer usersid){
		  
		  ShopMember shop=informationService.selectShopMemberById(usersid);
		  Shippingaddress shippingaddress=informationService.selectAddressByUseridWithState(usersid);
		  if (shippingaddress!=null) {
			  shop.getShippingaddress().setLocation(shippingaddress.getLocation());
			  shop.getShippingaddress().setDetailaddress(shippingaddress.getDetailaddress());
		}

		  return Msg.success().add("shop", shop);
	  }
	  
	  /**
	   * 修改个人信息
	   * @param shopMember
	   * @param userid
	   * @return
	   */
	  @RequestMapping("/updateinformation/{userid}")
	  @ResponseBody
	  public Msg updateInformantion(Users users,@PathVariable("userid")Integer userid){
		  users.setId(userid);
		  informationService.updateInformationByUid(users);
		  //关联老人
		  int oldmanId = addNewOlderService.findOldManIdByCardId(users.getIdcard());
		  System.out.println(oldmanId+"************************************");
		  if (oldmanId!=0) {
			   Integral integral=new Integral();
			   integral.setOldmanId(oldmanId);
			  IntegralExample example=new IntegralExample();
			  Criteria criteria=example.createCriteria();
			  criteria.andUsersIdEqualTo(userid);
			  integralMapper.updateByExampleSelective(integral, example);
		}

		  
		  
		  return Msg.success();
	  }
	  


  
}
