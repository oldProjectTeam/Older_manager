package com.older.manager.shopfront.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectallshoppingaddress/{id}")
	public String selectAllShoppingAddress(@PathVariable("id") Integer id,
			Model model) {
		Shippingaddress shippingaddress = new Shippingaddress();
		shippingaddress.setUserId(id);
		List<Shippingaddress> address = shoppingAddressService
				.selectAllShoppingAddress(shippingaddress);
		model.addAttribute("address", address);
		return "oldfront/person/address";
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteshoppingaddressbyid/{id}&{userid}")
	public String deleteShoppingAddressById(@PathVariable("id") Integer id,
			@PathVariable("userid") Integer userid) {
		shoppingAddressService.deleteShoppingAddress(id);
		return "redirect:/address/selectallshoppingaddress/" + userid;
	}

	/**
	 * 增加
	 * 
	 * @param shippingaddres
	 * @return
	 */
	@RequestMapping("/addshoppingaddress/{userid}")
	public String addShoppingAddress(Shippingaddress shippingaddress,
			@PathVariable("userid") Integer userid) {
		shippingaddress.setUserId(userid);
		shippingaddress.setState(0);
		shoppingAddressService.addShoppingAddress(shippingaddress);
		return "redirect:/address/selectallshoppingaddress/" + userid;
	}

	/**
	 * 更改默认地址
	 * 
	 * @param id
	 * @param userid
	 * @return
	 */
	@RequestMapping("/updatestate/{id}&{userid}")
	@ResponseBody
	public Msg updatestate(@PathVariable("id") Integer id,
			@PathVariable("userid") Integer userid) {
		Shippingaddress shippingaddress = new Shippingaddress();
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
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectshoppingaddressbyid/{id}")
	@ResponseBody
	public Msg selectShoppingAddressById(@PathVariable("id") Integer id) {
		Shippingaddress address = shoppingAddressService
				.selectShoppingAddress(id);
		return Msg.success().add("address", address);
	}

	/**
	 * 更新地址
	 * 
	 * @param shippingaddress
	 * @return
	 */
	@RequestMapping("/updateaddress/{id}")
	@ResponseBody
	public Msg updateAddress(Shippingaddress shippingaddress) {
		shoppingAddressService.updateShoppingAddress(shippingaddress);
		return Msg.success();
	}

	/**
	 * 跳转
	 * 
	 * @param userid
	 * @return
	 */
	@RequestMapping("/skipAddress/{userid}")
	public String skipAddress(@PathVariable("userid") Integer userid) {
		System.out
				.println("**********************************************************");
		return "redirect:/address/selectallshoppingaddress/" + userid;
	}

	@RequestMapping("/index")
	public String index() {
		return "oldfront/person/index";
	}

	/**
	 * 新增地址
	 * 
	 * @param address
	 *            :必需参数（detailaddress、name、phone、userId、 province1、city1、area1 ）
	 * @return
	 */
	@RequestMapping("/insertAddress")
	@ResponseBody
	public Msg addAddress(@Valid Shippingaddress address, BindingResult result) {
		// 数据校验
		if (result.hasErrors()) {
			List<FieldError> list = result.getFieldErrors();
			Map<String, Object> map = new HashMap<String, Object>();
			for (FieldError fieldError : list) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("error", map);
		}
		StringBuffer location = new StringBuffer();
		location.append(address.getProvince1()).append("-")
				.append(address.getCity1()).append("-")
				.append(address.getArea1());
		address.setState(0);
		address.setLocation(location.toString());
		shoppingAddressService.addShoppingAddress(address);
		return Msg.success();
	}

	/**
	 * 通过id获取地址，地址自动分割
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/getAddress/{id}")
	@ResponseBody
	public Msg findAddressById(@PathVariable("id") Integer id) {
		if (Pattern.matches("[0-9]+", id.toString())) {
			Shippingaddress address = shoppingAddressService
					.selectShoppingAddress(id);
			address.setState(0);
			String s[] = address.getLocation().split("-");
			address.setProvince1(s[0]);
			address.setCity1(s[1]);
			address.setArea1(s[2]);
			return Msg.success().add("address", address);
		} else {
			return Msg.fail();
		}

	}

	/**
	 * 更新地址信息
	 * 
	 * @param address
	 *            address:必需参数（地址id
	 * @return
	 */
	@RequestMapping("/updateaddress1")
	@ResponseBody
	public Msg updateAddress1(@Valid Shippingaddress address, String province2,
			String city2, String area2, BindingResult result) {
		// 数据校验
		if (result.hasErrors()) {
			List<FieldError> list = result.getFieldErrors();
			Map<String, Object> map = new HashMap<String, Object>();
			for (FieldError fieldError : list) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("error", map);
		}
		// 拼接所属地区
		StringBuffer location = new StringBuffer();
		location.append(province2).append("-").append(city2).append("-")
				.append(area2);
		address.setLocation(location.toString());
		shoppingAddressService.updateShoppingAddress(address);
		return Msg.success();
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteAddress/{id}")
	@ResponseBody
	public Msg deleteAddress(@PathVariable("id") Integer id) {
		try {
			shoppingAddressService.deleteShoppingAddress(id);
		} catch (Exception e) {
			return Msg.fail();
		}
		return Msg.success();
	}

}
