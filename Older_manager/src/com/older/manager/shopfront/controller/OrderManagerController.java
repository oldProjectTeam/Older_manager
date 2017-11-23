package com.older.manager.shopfront.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.bean.ProductComment;
import com.older.manager.bean.Products;
import com.older.manager.service.shopfront.IOrderdetailService;
import com.older.manager.service.shopfront.IProductCommentService;
import com.older.manager.service.shopfront.IProductService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

@Controller
/**
 * 订单管理
 * @author 疯癫
 *
 */
@RequestMapping("/order")
public class OrderManagerController {
	@Autowired
	private IOrderdetailService orderdetailService;
	@Autowired
	private IProductService productService;
	
	@Autowired
	private IProductCommentService productCommentService;
	
    /**
     * 跳到订单管理
     * @return
     */
	@RequestMapping("/skiporder")
	public String skipOrder(){
		return "oldfront/person/order";
	}
	/**
	 * 跳到售后
	 * @return
	 */
	@RequestMapping("/skipchange")
	public String skipChange(){
		return "oldfront/person/change";
	}
	
	/**
	 * 查询所有的订单
	 * @param userid
	 * @param state
	 * @param orderno
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/selectallorder/{userid}")
	public String selectAllOrder(@PathVariable Integer userid,Model model) 
			throws UnsupportedEncodingException{
		 Orderdetail orderdetail=new Orderdetail();
		 Orders orders=new Orders();
		 orders.setUserId(userid);
		 orderdetail.setOrders(orders);
		List<Orderdetail> order=orderdetailService.selectAllOrderDetail(orderdetail);
		Map<String, List<Orderdetail>> map=new HashMap<String, List<Orderdetail>>();
		Map<String, Date> map2=new HashMap<String, Date>();
		Map<String, List<String>> map3=new HashMap<String, List<String>>();
		for (Orderdetail orderdetail2 : order) {
			
			if(orderdetail2.getOrders().getState().equals("申请退货")){
				
			}else{ 
			List<Orderdetail> all=new ArrayList<Orderdetail>();
			Date date = null;
			double count=0;
			double count1=0;
			String sta="";
			String pid = "";
			String state = "";
			int orid=0;
			List<String> list=new ArrayList<String>();
			 for (Orderdetail orderdetail3 : order) {
				if (orderdetail3.getOrders().getOrderNo().equals(orderdetail2.getOrders().getOrderNo())) {
			          String str[]=orderdetail3.getProducts().getImages().split(",");
					  orderdetail3.getProducts().setImages(str[0]);
					all.add(orderdetail3);
					date=orderdetail3.getOrders().getCreattime();
					if (orderdetail3.getOrders().getCost()!=null) {
						count+=orderdetail3.getOrders().getCost();
					}
					
					if (orderdetail3.getOrders().getFreight()!=null) {
						count1+=orderdetail3.getOrders().getFreight();
					}
					
					sta=orderdetail3.getOrders().getState();
					pid=orderdetail3.getOrders().getId()+"";
					state=orderdetail3.getOrders().getOrders2();
					orid=orderdetail3.getId();
				}
				 
			}
			 list.add(count+"");
			 list.add(count1+"");
			 list.add(sta);
			 list.add(pid);
			 list.add(state);
			 list.add(orid+"");
			 map.put(orderdetail2.getOrders().getOrderNo(), all);
			 map2.put(orderdetail2.getOrders().getOrderNo(), date);
			 map3.put(orderdetail2.getOrders().getOrderNo(), list);
			 }
		}   
		
		model.addAttribute("map", map);
		model.addAttribute("map2", map2);
		model.addAttribute("map3", map3);
		return "oldfront/person/order";
	}

	
	
	/***
	 * 修改状态
	 * @param str  
	 * @return  
	 * @throws UnsupportedEncodingException
	 */
	
	@RequestMapping("/updatestate/{id}&{n}")
	@ResponseBody
	public Msg updateState(@PathVariable Integer id,@PathVariable Integer n) throws UnsupportedEncodingException{
		Orders orders=new Orders();
		
		
		if (n==0) {
			orders.setState("待发货");
		}else if(n==1){
			orders.setState("待收货");
			
		}else if(n==2){
			orders.setState("待评价");
		}else if (n==3) {
			orders.setState("已评价");
		}
		
	    		
		orders.setId(id);
		orderdetailService.updateOrder(orders);
		
		return Msg.success();
		
	}
	
	
    /***
     * 查看物流
     * @return
     */
	@RequestMapping("/logistics")
	public String billlist() {
		return "oldfront/person/logistics";
	}
	
	
	/**
	 * 订单明细
	 * @return
	 */
	@RequestMapping("/orderinfo")
	public String orderinfo() {
		return "oldfront/person/orderinfo";
	}
	
	 /**
     * 消息 钱的去向
     * @return
     */
	@RequestMapping("/record")
	public String record() {
		return "oldfront/person/record";
	}
	
	
	  /**
     *  个人中心的申请退款
     * @return
     */
	@RequestMapping("/refund")
	public String refund() {
		return "oldfront/person/refund";
	}
	/**
	 * 查商品信息
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/selectproductbyid/{id}&{orid}")
	public String selectProductById(@PathVariable Integer id, @PathVariable Integer orid,Model model,HttpServletRequest request) throws Exception{
		 Products products= productService.findProductById(id);
		 String str[]=products.getImages().split(",");
		 products.setImages(str[0]);
		 request.setAttribute("orid", orid);
		 model.addAttribute("pro", products);
		 return "oldfront/person/commentlist";
	}
	/**
	 * 增加评论
	 * @param productComment
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	
	
	
	
	
	
	@RequestMapping("/addproductscomment")
	@ResponseBody
	public Msg addProdctsComment(ProductComment productComment,MultipartFile file,
			HttpServletRequest request) throws IllegalStateException, IOException{
		
		String imgUrl = null;
		if (file != null) {
			imgUrl = SaveFile.saveImg(file, request);
			productComment.setImageurl(imgUrl);
		}else{
			productComment.setImageurl("");
			
		}
		
		productComment.setCreatetime(new Date());
		productCommentService.addProductComment(productComment);
		
		Orderdetail orderdetail=orderdetailService.selectOrderDetailByid(productComment.getOrdersdetailId());
		Orders orders=new Orders();
		orders.setState("已评价");
		orders.setId(orderdetail.getOrderId());
		orderdetailService.updatestate(orders);
		
	
		return Msg.success();
	}
	
	/**
	 * 标记被删除状态
	 * @param id
	 * @return
	 */
    @RequestMapping("/deleteorder/{id}")
    @ResponseBody
	public  Msg updateOrder(@PathVariable Integer id){
		 Orders orders=new Orders();
		 orders.setOrders1("0");
		 orders.setId(id);
    	orderdetailService.updateOrder(orders);
		return Msg.success();
	}	
	/**
	 * 标记已经延长收货
	 * @param id
	 * @return
	 */
    @RequestMapping("/updatetake/{id}")
    @ResponseBody
	public Msg updateTake(@PathVariable Integer id){
		
    	 Orders orders=new Orders();
		 orders.setOrders2("1");
		 orders.setId(id);
    	orderdetailService.updateOrder(orders);
		return Msg.success();
	}
	
	
	
	
	
}
