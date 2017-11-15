package com.older.manager.shopfront.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.older.manager.alipay.config.AlipayConfig;
import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.bean.Products;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.service.shopfront.IOrderService;
import com.older.manager.service.shopfront.IOrderdetailService;
import com.older.manager.service.shopfront.IShoppingCartService;
import com.older.manager.utils.UUIDTools;

@Controller
@RequestMapping("/order")
public class OrderController {

	
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	private IShoppingCartService shoppingCartService;
	
	@Autowired
	private IOrderdetailService orderdetailService;
	
	Logger logger = Logger.getLogger(OrderController.class);//日志对象
	
	/**
	 * 订单提交处理方法
	 * @param order
	 * @param ids
	 * @param result
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@SuppressWarnings("null")
	@RequestMapping("/orderPay")
	public void createOrder(@Valid Orders order,String ids,BindingResult result,
			HttpServletRequest request,HttpServletResponse response) throws Exception{
		//如果订单信息校验失败，重新返回订单确认页面
		if(result.hasErrors()){
			request.getRequestDispatcher("cart/confirmOrder.action?userId="+order.getUserId()+"&ids="+ids)
			.forward(request, response);
			request.setAttribute("error","提交订单失败，订单信息不合法！");
			return ;
		}
		//中文乱码处理
		if(order!=null){
			 if(order.getFormulaway()!=null&&!"".equals(order.getFormulaway())){
				  if(order.getFormulaway().equals("1")){
					  order.setFormulaway("圆通");
				  }else if(order.getFormulaway().equals("2")){
					  order.setFormulaway("申通");
				  }else if(order.getFormulaway().equals("3")){
					  order.setFormulaway("韵达");
				  }else if(order.getFormulaway().equals("4")){
					  order.setFormulaway("中通");
				  }else{
					  order.setFormulaway("顺丰");
				  }
			 }
			 if(order.getPaytype()!=null&&!"".equals(order.getPaytype())){
				  if(order.getPaytype().equals("1")){
					  order.setPaytype("支付宝即时到账");
				  }
			 }
			 if(order.getBody()!=null&&!"".equals(order.getBody())){
				 order.setBody(new String(order.getBody().getBytes("ISO-8859-1"),"UTF-8"));
			 }
		 }
		
		//订单属性
		String orderNo=UUIDTools.getNumber();//生成订单编号
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dateString=sdf.format(new Date());//当前日期
		String subject1=dateString+"订单号："+orderNo;//组合成订单名称
		order.setSubject(subject1);
		Integer num=0;//商品数量
		Double cost=new Double(0);//总金额
		order.setState("代付款");//设置订单状态
		order.setShipper("孝和购物商城");//供货商家
		Double freight=new Double(0);//运费
		
		
		
		//订单详细集合
		List<Orderdetail>Orderdetails=new ArrayList<Orderdetail>();
		
		ShoppingCart cart=null;//购物车信息
		Products product=null;//商品信息
		Orderdetail orderdetail=null;//订单详细信息
		List<Integer>cart_del_ids=new ArrayList<Integer>();//删除的购物车信息id集合
		if(ids.contains("-")){
			String str[] = ids.split("-");
			for (String id: str) {
				cart_del_ids.add(Integer.parseInt(id));
				 cart=shoppingCartService.selectWithProductById(Integer.parseInt(id));
				 product=cart.getProduct();
				 //订单属性
				 cost+=cart.getBaseprice();//计算总金额
				 num++;//记录商品种数
				 
				 //订单详细属性
				 orderdetail=new Orderdetail();//订单详细对象实例化
				 orderdetail.setNumber(cart.getNumber());//此商品数量
				 orderdetail.setBaseprice(cart.getBaseprice());//此商品共计金额
				 orderdetail.setProducctname(product.getName());//商品名称
				 orderdetail.setDetialNumber(UUIDTools.getNumber());//自动生成订单详细编号
				 orderdetail.setProducctsId(product.getId());//产品ID
				 
				 //判断是否有运费
				 if(product.getParal11()!=null){
					 cost+=product.getParal11();
					 freight+=product.getParal11();//记录总运费
				 }
				 Orderdetails.add(orderdetail);//将订单详细加入到订单详细集合中
			}		
		}else{
			cart_del_ids.add(Integer.parseInt(ids));
			cart=shoppingCartService.selectWithProductById(Integer.parseInt(ids));
			 product=cart.getProduct();
			 //订单属性
			 cost+=cart.getBaseprice();//计算总金额
			 num++;//记录商品种数
			 
			 //订单详细属性
			 orderdetail=new Orderdetail();
			 orderdetail.setNumber(cart.getNumber());//此商品数量
			 orderdetail.setBaseprice(cart.getBaseprice());//此商品共计金额
			 orderdetail.setProducctname(product.getName());//商品名称
			 orderdetail.setDetialNumber(UUIDTools.getNumber());//自动生成订单详细编号
			 orderdetail.setProducctsId(product.getId());//产品ID
			 
			 //判断是否有运费
			 if(product.getParal11()!=null){
				 cost+=product.getParal11();
				 freight+=product.getParal11();//记录总运费
			 }
			 Orderdetails.add(orderdetail);//将订单详细加入到订单详细集合中
		}
		
		//设置订单属性
		order.setCost(cost);//设置该笔订单总金额
		order.setFreight(freight);//设置该笔订单总运费
		order.setNum(num);//设置该笔订单商品总个数
		order.setOrderNo(orderNo);//设置订单编号
		
		 orderService.insertOrder(order);//添加订单
		 shoppingCartService.batchDelCart(cart_del_ids);//删除对应购物车记录
		 for(Orderdetail od:Orderdetails){
			 od.setOrderId(order.getId());//关联订单id
			 orderdetailService.insertOrderDetail(od);//生成订单详细
		 }
		 
		 //**********************支付宝接口开始*****************
		//获得初始化的AlipayClicent
			AlipayClient alipayClient=new DefaultAlipayClient(AlipayConfig.gatewayUrl,
					AlipayConfig.app_id, AlipayConfig.merchant_private_key,"json",AlipayConfig.charset,
					AlipayConfig.alipay_public_key,AlipayConfig.sign_type);
			//设置请求参数
			AlipayTradePagePayRequest alipayRequest=new AlipayTradePagePayRequest();
			alipayRequest.setReturnUrl(AlipayConfig.return_url);
			alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
			
			/**
			 * 支付宝接口所需参数
			 */
			String out_trade_no=orderNo;//必需
			String total_amount=order.getCost().toString();//必需
			String subject=order.getSubject();//必需
			String body=order.getBody();//可选
			
			alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
	                + "\"total_amount\":\""+ total_amount +"\"," 
	                + "\"subject\":\""+ subject +"\"," 
	                + "\"body\":\""+ body +"\"," 
	                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
			//开始请求
			String result1=alipayClient.pageExecute(alipayRequest).getBody();
			response.setContentType("text/html;charset="+AlipayConfig.charset);
			response.getWriter().write(result1);
			 
			response.getWriter().flush();
			response.getWriter().close();
		
	}
	
	/**
	 * 支付宝异步通知请求方法
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/notifyUrl")
	public String notifyUrl(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		AlipayConfig.logResult("进入异步通知页面");
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		boolean signVerified = false;
		signVerified = AlipaySignature.rsaCheckV1(params,
					AlipayConfig.alipay_public_key, AlipayConfig.charset,
					AlipayConfig.sign_type);
		if (signVerified) {
				
				AlipayConfig.logResult("签证成功！");//记录日志
				
				// 订单号
				String out_trade_no = new String(request.getParameter(
						"out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

				// 支付宝交易号
				String trade_no = new String(request.getParameter("trade_no")
						.getBytes("ISO-8859-1"), "UTF-8");

				// 付款金额
				String total_amount = new String(request.getParameter(
						"total_amount").getBytes("ISO-8859-1"), "UTF-8");

				 
				logger.info("notify----订单处理：系统订单号" + out_trade_no + "支付宝交易号：" + trade_no);
				 
				//根据返回来的订单编号查询是否有该订单信息
				Orders order = orderService.findOrderByNo(out_trade_no);

				if (order == null) {
						signVerified=false;
						logger.error("notify----系统订单："+ out_trade_no + "不存在。");
						response.getWriter().write("failure");
						return "/oldfront/home/notifyUrl";
				}else{
					 
						if(!total_amount.equals(order.getCost().toString())){
							signVerified=false;
							AlipayConfig.logResult("notify---订单金额：数据库金额 "+ order.getCost().toString()+ "与total_amount "+total_amount+"不一致");
							request.setAttribute("reason", "签证失败");
							logger.error("notify---订单金额：数据库金额 "+ order.getCost().toString()+ "与total_amount "+total_amount+"不一致");
							response.getWriter().write("failure");
							return "/oldfront/home/notifyUrl";
						}
						
						if(order.getState().equals("支付成功")){
							AlipayConfig.logResult("notify---系统订单："+ out_trade_no + "无需重复处理。");
							logger.info("notify---系统订单："+ out_trade_no + "无需重复处理。");
						}else{
							order.setState("支付成功");//修改当前订单为已支付
							order.setTransactionid(trade_no);//设置支付宝交易号
							order.setCreattime(new Date());//下单时间
							 orderService.updateOrder(order);
							AlipayConfig.logResult("notify----系统订单："+ out_trade_no + "成功支付。");
							logger.info("notify----系统订单："+ out_trade_no + "成功支付。");
						}
						response.getWriter().write("success");
						return "/oldfront/home/notifyUrl";
				}
			}else{
				AlipayConfig.logResult("签证失败!");
				response.getWriter().write("failure");
				return "/oldfront/home/notifyUrl";
			}
	}
	
	/**
	 * 支付成功返回处理方法
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/returnUrl")
	public String returnUrl(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		boolean signVerified = false;
		signVerified = AlipaySignature.rsaCheckV1(params,
				AlipayConfig.alipay_public_key, AlipayConfig.charset,
				AlipayConfig.sign_type);
		if (signVerified) {
			// 订单号
			String out_trade_no = new String(request.getParameter(
					"out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 支付宝交易号
			String trade_no = new String(request.getParameter("trade_no")
					.getBytes("ISO-8859-1"), "UTF-8");

			// 付款金额
			String total_amount = new String(request.getParameter(
					"total_amount").getBytes("ISO-8859-1"), "UTF-8");

			request.setAttribute("out_trade_no", out_trade_no);
			request.setAttribute("trade_no", trade_no);
			request.setAttribute("total_amount", total_amount);

			logger.info("return---订单处理：系统订单号" + out_trade_no + " 支付宝交易号：" + trade_no);
			
			Orders order = orderService.findOrderByNo(out_trade_no);

			if (order == null) {
					signVerified=false;
					request.setAttribute("reason", "商户订单不存在");
					logger.error("return---系统订单："+ out_trade_no + "不存在。");
					return "/oldfront/home/failure";
			}else{
					if(!total_amount.equals(order.getCost().toString())){
						signVerified=false;
						request.setAttribute("reason", "付款金额不对");
						logger.error("return---订单金额：数据库金额 "+ order.getCost().toString()+ "与total_amount "+total_amount+"不一致");
						return "/oldfront/home/failure";
					} 
					if(order.getState().equals("支付成功")){
						logger.info("return---系统订单："+ out_trade_no + "无需重复处理。");
					}else{
						order.setState("支付成功");//修改当前订单为已支付
						order.setTransactionid(trade_no);
						order.setCreattime(new Date());
						 orderService.updateOrder(order);
						logger.info("return----系统订单："+ out_trade_no + "成功支付。");
					}	  
					return "/shop/success";
			}
			
		}else{
			return "/oldfront/home/failure";
		}
	}
}
