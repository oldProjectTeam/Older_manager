package com.older.manager.alipay.config;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.bean.Products;
import com.older.manager.bean.Shippingaddress;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.service.shopfront.IOrderService;
import com.older.manager.service.shopfront.IShippingaddressService;
import com.older.manager.service.shopfront.IShoppingCartService;

/**
 * 确认订单处理类
 * @author lenovo
 *
 */
@Controller
@RequestMapping("confirm")
public class ConfirmOrderController {

	@Autowired
	IShoppingCartService shoppingCartService;
	
	@Autowired
	IOrderService orderService;
	@Autowired
	IShippingaddressService shippingaddressService;
	@Autowired
	IProductService productService;
	
	/**
	 * 购物车结算
	 * @param ids:购物车id集合：传入格式：id1-id2
	 * @param modal
	 * @return
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	@RequestMapping(value="/confirmOrder")
	public ModelAndView confirmOrder(String ids,Integer userId,ModelAndView modal) throws NumberFormatException, Exception{
		//待确认订单信息集合
		List<ShoppingCart>carts=new ArrayList<ShoppingCart>();
		//地址列表
		List<Shippingaddress>addressList=null;
		Double cost=new Double(0);
		ShoppingCart cart=null;
		Products product=null;
		if(ids!=null&&!"".equals(ids)&&ids.contains("-")){
			String str[] = ids.split("-");
			for (String id: str) {
				if(!Pattern.matches("[0-9]+", id))continue;
				 cart=shoppingCartService.selectWithProductById(Integer.parseInt(id));
				 if(cart==null)continue;
				 cost+=cart.getBaseprice();
				 product=cart.getProduct();
				 
				 //判断是否有运费
				 if(product.getParal11()!=null){
					 cost+=product.getParal11();
				 }
				 //默认显示第一张图片
				if(product.getImages().contains(",")){
					String img[]=product.getImages().split(",");
					product.setImages(img[0]);
				}
				carts.add(cart);
			}		
		}else if(Pattern.matches("[0-9]+", ids)){
			 
			cart=shoppingCartService.selectWithProductById(Integer.parseInt(ids));
			 if(cart!=null){
				cost+=cart.getBaseprice();
				 product=cart.getProduct();
				 //判断是否有运费
				 if(product.getParal11()!=null){
					 cost+=product.getParal11();
				 }
				 //默认显示第一张图片
				if(product.getImages().contains(",")){
					String img[]=product.getImages().split(",");
					product.setImages(img[0]);
				}
				carts.add(cart);
			 }
		}
		addressList=shippingaddressService.findAllAddress(userId);
		modal.addObject("carts",carts);
		modal.addObject("cost",cost);
		modal.addObject("addressList",addressList);
		modal.setViewName("/oldfront/home/pay");
		return modal;
	}
	
	/**
	 * 立即购买
	 * @param id:产品ID
	 * @param number:商品数量
	 * @param userId:用户ID
	 * @param modal
	 * @return
	 * @throws NumberFormatException
	 * @throws Exception
	 */
	@RequestMapping(value="/now_buy")
	public ModelAndView now_buy(Integer id,Integer number,Integer userId,ModelAndView modal) throws NumberFormatException, Exception{
		
		//待确认订单信息集合
		List<Products>products=new ArrayList<Products>();
		//地址列表
		List<Shippingaddress>addressList=null;
		Double cost=new Double(0);
		Products product=null;
		if(id!=null){
			     product=productService.findProductById(id);
				 cost=product.getNowprice()*number;
				 //判断是否有运费
				 if(product.getParal11()!=null){
					 cost+=product.getParal11();
				 }
				 //默认显示第一张图片
				if(product.getImages().contains(",")){
					String img[]=product.getImages().split(",");
					product.setImages(img[0]);
				}
				products.add(product);
		}		
		addressList=shippingaddressService.findAllAddress(userId);
		modal.addObject("products",products);
		modal.addObject("cost",cost);
		modal.addObject("number",number);
		modal.addObject("addressList",addressList);
		modal.setViewName("/oldfront/home/nowpay");
		return modal;
	}
	
	@RequestMapping(value="/wait_buy")
	public ModelAndView wait_buy(Integer id,ModelAndView modal) throws NumberFormatException, Exception{
		
		 if(id==null){
			 modal.setViewName("redirect:/shop/order");
			 return modal;
		 }
		 Orders order=orderService.findOrderWithDetailById(id);
		//地址列表
		List<Shippingaddress>addressList=null;
		 
		Products product=null;
		 for(Orderdetail orderdetail:order.getOrderdetails()){
			 product=orderdetail.getProduct();
			 //默认显示第一张图片
				if(product.getImages().contains(",")){
					String img[]=product.getImages().split(",");
					product.setImages(img[0]);
				}
		 }
		addressList=shippingaddressService.findAllAddress(order.getUserId());
		modal.addObject("order",order);
		modal.addObject("addressList",addressList);
		modal.setViewName("/oldfront/home/waitpay");
		return modal;
	}
}
