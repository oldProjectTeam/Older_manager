package com.older.manager.shopfront.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Changesale;
import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.Orders;
import com.older.manager.bean.ProductComment;
import com.older.manager.bean.Products;
import com.older.manager.service.shopfront.ChangeService;
import com.older.manager.service.shopfront.IOrderService;
import com.older.manager.service.shopfront.IOrderdetailService;
import com.older.manager.service.shopfront.IProductCommentService;
import com.older.manager.service.shopfront.IProductService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;
import com.oss.gy.bean.OSSJSON;
import com.oss.gy.utils.OSSFileUtils;

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
	private IProductCommentService productCommentService;

	@Autowired
	private ChangeService changeService;

	@Autowired
	private IOrderService orderService;

	/**
	 * 跳到订单管理
	 * 
	 * @return
	 */
	@RequestMapping("/skiporder")
	public String skipOrder() {
		return "oldfront/person/order";
	}

	/**
	 * 跳到售后
	 * 
	 * @return
	 */
	@RequestMapping("/skipchange")
	public String skipChange() {
		return "oldfront/person/change";
	}

	/**
	 * 物流详情
	 * 
	 * @param orders
	 * @param model
	 * @return
	 */
	@RequestMapping("/logistic/{id}")
	public String logistics(@PathVariable("id") Integer id, Model model) {
		Orders orders = null;
		try {
			orders = orderService.findOrders(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("orders", orders);
		return "oldfront/person/logistics";
	}

	/**
	 * 查询所有的订单
	 * 
	 * @param userid
	 * @param state
	 * @param orderno
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/selectallorder/{userid}")
	public String selectAllOrder(@PathVariable Integer userid, Model model)
			throws UnsupportedEncodingException {
		Orderdetail orderdetail = new Orderdetail();
		Orders orders = new Orders();
		orders.setUserId(userid);
		orderdetail.setOrders(orders);
		List<Orderdetail> order = orderdetailService
				.selectAllOrderDetail(orderdetail);
		Map<String, List<Orderdetail>> map = new HashMap<String, List<Orderdetail>>();
		Map<String, Date> map2 = new HashMap<String, Date>();
		Map<String, List<String>> map3 = new HashMap<String, List<String>>();
		for (Orderdetail orderdetail2 : order) {

			if (orderdetail2.getOrders().getState().equals("申请退货")) {

			} else {
				List<Orderdetail> all = new ArrayList<Orderdetail>();
				Date date = null;
				double count = 0;
				double count1 = 0;
				String sta = "";
				String pid = "";
				String state = "";
				int orid = 0;
				List<String> list = new ArrayList<String>();
				for (Orderdetail orderdetail3 : order) {
					if (orderdetail3.getOrders().getOrderNo()
							.equals(orderdetail2.getOrders().getOrderNo())) {
						String str[] = orderdetail3.getProducts().getImages()
								.split(",");
						orderdetail3.getProducts().setImages(str[0]);
						all.add(orderdetail3);
						date = orderdetail3.getOrders().getCreattime();
						if (orderdetail3.getOrders().getCost() != null) {
							count = orderdetail3.getOrders().getCost();
						}

						if (orderdetail3.getOrders().getFreight() != null) {
							count1 = orderdetail3.getOrders().getFreight();
						}

						sta = orderdetail3.getOrders().getState();
						pid = orderdetail3.getOrders().getId() + "";
						state = orderdetail3.getOrders().getOrders2();
						orid = orderdetail3.getId();
					}

				}
				list.add(count + "");
				list.add(count1 + "");
				list.add(sta);
				list.add(pid);
				list.add(state);
				list.add(orid + "");
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
	 * 
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	@RequestMapping("/updatestate/{id}&{n}")
	@ResponseBody
	public Msg updateState(@PathVariable Integer id, @PathVariable Integer n)
			throws UnsupportedEncodingException {
		Orders orders = new Orders();

		if (n == 0) {
			orders.setState("待发货");
		} else if (n == 1) {
			orders.setState("待收货");

		} else if (n == 2) {
			orders.setState("待评价");
		} else if (n == 3) {
			orders.setState("已评价");
		}

		orders.setId(id);
		orderdetailService.updateOrder(orders);

		return Msg.success();

	}

 /**
	 * 订单明细
	 * @return
	 */
	@RequestMapping("/orderinfo/{id}")
	
	public String orderinfo(@PathVariable("id")Integer id,Model model) {
			if(Pattern.matches("[\\d]+", id+"")){
				Orders order=orderService.findOrderWithDetailById(id);
				List<Orderdetail>orderdetails=order.getOrderdetails();
				for(Orderdetail orderdetail:orderdetails){
					Products products=orderdetail.getProduct();
					if(products.getImages().contains(",")){
						String s[]=products.getImages().split(",");
						products.setImages(s[0]);
					}
				}
				model.addAttribute("order", order);
			}  
			return "oldfront/person/orderinfo";
	}

	/**
	 * 根据用户id 查询用户所有未确定收货订单
	 * @param userId
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/orderListByState")
	@ResponseBody
	public Msg orderListByState(Orders order,
			@RequestParam(value="pn",defaultValue="1")Integer pn) throws Exception{
		PageHelper.startPage(pn,2);
		order.setState("待收货");
		List<Orders> orders=orderService.orderListByState(order);
	 
		for(Orders orders2:orders){
			List<Products>products=orders2.getProducts();
			for(Products product:products){
				if(product.getImages().contains(",")){
					String s[]=product.getImages().split(",");
					product.setImages(s[0]);
				}
			}
			//orders2.setProduct(product);
		}
		PageInfo pageInfo=new PageInfo(orders,3);
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 消息 钱的去向
	 * 
	 * @return
	 */
	@RequestMapping("/record")
	public String record() {
		return "oldfront/person/record";
	}

	/**
	 * 查商品信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectproductbyid/{ordersid}")
	public String selectProductById(@PathVariable Integer ordersid, Model model)
			throws Exception {
		List<Orderdetail> list = orderdetailService
				.selectAllOrderDetailByOrderId(ordersid);
		for (Orderdetail orderdetail : list) {
			String str[] = orderdetail.getProducts().getImages().split(",");
			orderdetail.getProducts().setImages(str[0]);
		}
		model.addAttribute("list", list);
		return "oldfront/person/commentlist";
	}

	/**
	 * 增加评论
	 * 
	 * @param productComment
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */

	@RequestMapping("/addproductscomment/{orderid}")
	@ResponseBody
	public Msg addProdctsComment(ProductComment productComment,
			MultipartFile file, HttpServletRequest request,
			@PathVariable Integer orderid) throws IllegalStateException,
			IOException {
		CommonsMultipartFile commonsMultipartFile = (CommonsMultipartFile) file;
		DiskFileItem fi = (DiskFileItem) commonsMultipartFile.getFileItem();
		File imgFile = fi.getStoreLocation();
		if (imgFile.exists()) {
			// 按照日期在oss里面创建文件夹
			OSSFileUtils.createFolder();
			// 上传要修改的图片
			OSSJSON ossjson = OSSFileUtils.upload(OSSFileUtils.folderName()
					.substring(0, OSSFileUtils.folderName().length() - 1)
					+ "/"
					+ file.getOriginalFilename(), imgFile.getAbsolutePath());
			if (ossjson.getCode() == 0) {
				productComment.setImageurl(ossjson.getData().getAccess_url());
			}
		}
		Orders orders = new Orders();
		List<Orderdetail> list = orderdetailService
				.selectAllOrderDetailByOrderId(orderid);
		for (Orderdetail orderdetail : list) {
			String str[] = orderdetail.getProducts().getImages().split(",");
			orderdetail.getProducts().setImages(str[0]);

			productComment.setUsersId(orderdetail.getOrders().getUserId());
			productComment.setOrdersdetailId(orderdetail.getId());
			productComment.setCreatetime(new Date());
			productComment.setProductid(orderdetail.getProducctsId());//
			productCommentService.addProductComment(productComment);
			orders.setId(orderdetail.getOrderId());
		}

		orders.setState("已评价");
		orderdetailService.updatestate(orders);
		return Msg.success();
	}

	/**
	 * 标记被删除状态
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteorder/{id}")
	@ResponseBody
	public Msg updateOrder(@PathVariable Integer id) {
		Orders orders = new Orders();
		orders.setOrders1("0");
		orders.setId(id);
		orderdetailService.updateOrder(orders);
		return Msg.success();
	}

	/**
	 * 标记已经延长收货
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/updatetake/{id}")
	@ResponseBody
	public Msg updateTake(@PathVariable Integer id) {

		Orders orders = new Orders();
		orders.setOrders2("1");
		orders.setId(id);
		orderdetailService.updateOrder(orders);
		return Msg.success();
	}

	/**
	 * 通过订单id来查 跳到申请退款
	 * 
	 * @param no
	 * @return
	 */
	@RequestMapping("/selectorderdetailbyorderno/{id}")
	public String selectOrderDetailByOrderno(@PathVariable Integer id,
			Model model) {
		List<Orderdetail> list = orderdetailService
				.selectAllOrderDetailByOrderId(id);
		for (Orderdetail orderdetail : list) {
			String str[] = orderdetail.getProducts().getImages().split(",");
			orderdetail.getProducts().setImages(str[0]);
		}

		model.addAttribute("list", list);

		return "oldfront/person/refund";
	}

	/**
	 * 保存申请退款
	 * 
	 * @param changesale
	 * @return
	 */
	@RequestMapping("/addordercomment")
	@ResponseBody
	public Msg addOrderComment(Changesale changesale,
			@RequestParam("file") MultipartFile file, HttpServletRequest request)
			throws Exception {
		if (!file.isEmpty()) {
			CommonsMultipartFile commonsMultipartFile = (CommonsMultipartFile) file;
			DiskFileItem fi = (DiskFileItem) commonsMultipartFile.getFileItem();
			File imgFile = fi.getStoreLocation();
			if (imgFile.exists()) {
				// 按照日期在oss里面创建文件夹
				OSSFileUtils.createFolder();
				// 上传要修改的图片
				OSSJSON ossjson = OSSFileUtils.upload(OSSFileUtils.folderName()
						.substring(0, OSSFileUtils.folderName().length() - 1)
						+ "/" + file.getOriginalFilename(), imgFile
						.getAbsolutePath());
				if (ossjson.getCode() == 0) {
					changesale.setChimages(ossjson.getData().getAccess_url());
				}
			}
		} else {
			changesale.setChimages("没有图片");

		}
		String str[] = changesale.getChno().split(",");
		List<Orderdetail> list = orderdetailService
				.selectAllOrderDetailByOrderId(Integer.parseInt(str[0]));

		// 标记被删除状态
		Orders orders = new Orders();
		orders.setOrders1("0");
		orders.setId(Integer.parseInt(str[0]));
		orderdetailService.updateOrder(orders);
		int i = 0;
		for (Orderdetail orderdetail : list) {
			changesale.setProductid(orderdetail.getProducctsId());
			changesale.setUsid(orderdetail.getOrders().getUserId());
			if (changeService.countChangesale(changesale) > 0) {
				System.out.println("------------------->"
						+ changeService.countChangesale(changesale));
				return Msg.fail();

			} else {

				String str1[] = orderdetail.getProducts().getImages()
						.split(",");
				orderdetail.getProducts().setImages(str1[0]);
				changesale.setChno(orderdetail.getOrders().getOrderNo() + i);
				i++;
				changesale.setChtime(new Date());
				changesale.setChphoto(orderdetail.getProducts().getImages());
				changesale.setChbrieft(orderdetail.getProducts().getSynopsis());
				changesale.setChname(orderdetail.getProducctname());
				changesale.setChmoeny(orderdetail.getBaseprice()
						* orderdetail.getNumber());
				changesale.setChaftermoney(orderdetail.getBaseprice()
						* orderdetail.getNumber());

				changeService.addChange(changesale);

			}
		}

		return Msg.success();
	}

	/**
	 * 查询个人中心里面的订单信息
	 * 
	 * @param usersid
	 * @return
	 */
	@RequestMapping("/queryOrderInfoByUserId")
	@ResponseBody
	public Msg queryOrderInfoByUserId(@RequestParam("usersid") Integer usersid) {
		List<Integer> list = orderdetailService.queryOrderInfoByUserId(usersid);
		if (list.size() > 0) {
			return Msg.success().add("orderInfo", list);
		} else {
			return Msg.fail();
		}
	}
}
