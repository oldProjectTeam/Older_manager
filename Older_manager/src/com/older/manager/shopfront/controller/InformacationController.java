package com.older.manager.shopfront.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.ShopMember;
import com.older.manager.bean.Users;
import com.older.manager.service.shopfront.InformationService;
import com.older.manager.utils.Msg;

@Controller
/**
 * 个人信息 调用明哥接口
 * @author 疯癫
 *
 */
@RequestMapping("/info")
public class InformacationController {
  @Autowired
  private InformationService informationService;

  /**
   * 通过id来差一条数据
   * @param id
   * @return
   */
  @RequestMapping("/selectinformation/{usersid}")
  @ResponseBody
  public Msg selectInformationById(@PathVariable("usersid")Integer usersid){
	  
	  ShopMember shop=informationService.selectShopMemberById(usersid);
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
	  return Msg.success();
  }
  
}
