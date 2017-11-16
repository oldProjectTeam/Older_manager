package com.older.manager.shopfront.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.Products;
import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.service.shopfront.IShippingaddressService;
import com.older.manager.service.shopfront.IShoppingCartService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.Msg;

/**
 * 购物车处理控制器
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/cart")
public class ShoppingCartController {
	
	@Autowired
	IShoppingCartService shoppingCartService;
	
	@Autowired
	IShippingaddressService shippingaddressService;
	@Autowired
	IProductService productService;
	/**
	 * 添加或修改购物车
	 * @param cart:必须参数：userId、produtsId、number
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/addCart")
	@ResponseBody
	public Msg addShoppingCart(ShoppingCart cart){
		boolean flag=false;
		try {
			//判断该用户是否已经将此产品添加到购物车
			List<ShoppingCart>list=shoppingCartService.findShoppingCart(cart);
			Integer number=cart.getNumber()==null?0:cart.getNumber();
			if(list!=null&&list.size()>0){
				ShoppingCart sCart=list.get(0);
				Double price=sCart.getBaseprice()/sCart.getNumber();
				sCart.setNumber(sCart.getNumber()+number);
				sCart.setBaseprice(price*sCart.getNumber());
				//更新添加时间
				sCart.setTime(new Date());
				shoppingCartService.updateShoppingCart(sCart);
			}else{
				cart.setNumber(number);
				shoppingCartService.insertShoppingCart(cart);
			}
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
	 * 更改商品数量
	 * @param cart:必传参数：id、number
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/updateNumber")
	@ResponseBody
	public Msg updateNumber(ShoppingCart cart){
		boolean flag=false;
		try {
				ShoppingCart sCart=shoppingCartService.findShopingCartById(cart.getId());
				//计算出该商品单价
				Double price=sCart.getBaseprice()/sCart.getNumber();
				cart.setBaseprice(price*cart.getNumber());
				//更新添加时间
				cart.setTime(new Date());
				shoppingCartService.updateShoppingCart(cart);
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
	 * 查询该用户所有购物车信息
	 * @param userId
	 * @param modal
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findAllByUserId")
	public ModelAndView findAll(Integer userId,ModelAndView modal)throws Exception{
		List<ShoppingCart>carts=shoppingCartService.findAllCarts(userId);
		//默认自动显示产品第一张图片
		if(carts!=null){
			Products product=null;
			for(ShoppingCart cart:carts){
				product=cart.getProduct();
				if(product.getImages().contains(",")){
					String img[]=product.getImages().split(",");
					product.setImages(img[0]);
				}
			}
		}
		modal.addObject("carts", carts);
		modal.setViewName("/oldfront/home/shopcart");
		return modal;
	}
	
	/**
	 * 删除购物车记录（单删、批量删除）
	 * @param ids：集合（id格式例如：id1-id2-id3）
	 * @param request
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping(value = "/deleteCart/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteCourseenrol(@PathVariable("ids") String ids,
			HttpServletRequest request) {
		boolean flag = false;
		try {
			if (ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<Integer>();
				String str[] = ids.split("-");
				for (String s : str) {
					del_ids.add(Integer.parseInt(s));
				}		
				shoppingCartService.batchDelCart(del_ids);
			} else {
				Integer id = Integer.parseInt(ids);
				shoppingCartService.deleteShoppingCart(id);
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

	
}
