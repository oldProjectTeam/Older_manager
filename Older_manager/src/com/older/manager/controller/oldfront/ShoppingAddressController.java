package com.older.manager.controller.oldfront;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Shippingaddress;
import com.older.manager.service.shopfront.ShoppingAddressService;
import com.older.manager.utils.Msg;
@Controller
/**
 * 收货地址
 * @author 疯癫
 *
 */
@RequestMapping("/address")
public class ShoppingAddressController {
	@Autowired
    private ShoppingAddressService shoppingAddressService;
	
	
	/***
	 * 查询所有的地址，然后跳到地址页面去
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectallshoppingaddress/{id}")
	public String selectAllShoppingAddress(@PathVariable("id")Integer id,Model model){
		Shippingaddress shippingaddress=new Shippingaddress();
		shippingaddress.setUserId(id);
		List<Shippingaddress> address=shoppingAddressService.selectAllShoppingAddress(shippingaddress);
		model.addAttribute("address", address);
		return "oldfront/person/address";
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
 	@RequestMapping("/deleteshoppingaddressbyid/{id}&{userid}")
	public String deleteShoppingAddressById(@PathVariable("id")Integer id,@PathVariable("userid")Integer userid){
 		shoppingAddressService.deleteShoppingAddress(id);
 		return "redirect:/address/selectallshoppingaddress/"+userid;
 	}
 	/**
 	 * 增加
 	 * @param shippingaddres
 	 * @return
 	 */
	@RequestMapping("/addshoppingaddress/{userid}")
	public String addShoppingAddress(Shippingaddress shippingaddress,@PathVariable("userid")Integer userid){
		shippingaddress.setUserId(userid);
		shippingaddress.setState(0);
		shoppingAddressService.addShoppingAddress(shippingaddress);
		return "redirect:/address/selectallshoppingaddress/"+userid;
	}
	/**
	 * 更改默认地址
	 * @param id
	 * @param userid
	 * @return
	 */
	@RequestMapping("/updatestate/{id}&{userid}")
	@ResponseBody
	public Msg updatestate(@PathVariable("id")Integer id,@PathVariable("userid")Integer userid){
		Shippingaddress shippingaddress=new Shippingaddress();
		shippingaddress.setUserId(userid);
		shippingaddress.setState(0);
		shoppingAddressService.updateState(shippingaddress);
		shippingaddress.setState(1);
		shippingaddress.setId(id);
		shoppingAddressService.updateShoppingAddress(shippingaddress);
		return Msg.success();
	}
	/**
	 * 通过id查一条数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectshoppingaddressbyid/{id}")
	@ResponseBody
	public Msg selectShoppingAddressById(@PathVariable("id")Integer id){
		Shippingaddress address=shoppingAddressService.selectShoppingAddress(id);
		return Msg.success().add("address", address);
	}
	/**
	 * 更新地址
	 * @param shippingaddress
	 * @return
	 */
	@RequestMapping("/updateaddress/{id}")
	@ResponseBody
	public Msg updateAddress(Shippingaddress shippingaddress){
		shoppingAddressService.updateShoppingAddress(shippingaddress);
		return Msg.success();
	}
	/**
	 * 跳转
	 * @param userid
	 * @return
	 */
	@RequestMapping("/skipAddress/{userid}")
	public String skipAddress(@PathVariable("userid")Integer userid){
		System.out.println("**********************************************************");
		return "redirect:/address/selectallshoppingaddress/"+userid;
	}
	
	@RequestMapping("/index")
	public String index(){
		return "oldfront/person/index";
	}
	
}
