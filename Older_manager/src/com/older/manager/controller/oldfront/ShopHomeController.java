/**
 * 
 */
package com.older.manager.controller.oldfront;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Brand;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.service.shopfront.ProductsSearchService;
import com.older.manager.utils.Msg;

/**
 * @author ym
 * 
 */
@Controller
@RequestMapping("/home")
public class ShopHomeController {

	@Autowired
	IProductService productService;

	@Autowired
	ProductsSearchService productsSearchService;

	/**
	 * @Title: search
	 * @Description: 电商主页搜索跳转到搜索界面
	 * @param: @param searchKeyWord
	 * @param: @param model
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @param: @throws UnsupportedEncodingException
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午4:05:09
	 */
	@RequestMapping("/search")
	public String search(String searchKeyWord, Model model)
			throws UnsupportedEncodingException {
		model.addAttribute("rearchkey", searchKeyWord);
		return "oldfront/home/search";
	}


	@RequestMapping("/test")
	@ResponseBody
	public Msg Test(
			String search,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "12", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<Products> list = productsSearchService
				.findAllProductsBySearch(new String(search
						.getBytes("iso-8859-1"), "utf-8"));
		PageInfo<Products> pageInfo = new PageInfo<Products>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	
	/**
	 * @Title:   searchProductsByAllBrand
	 * @Description:  搜索查询所有的商品品牌
	 * @param:    @param search
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月16日 下午10:35:41
	 */
	@RequestMapping("/searchProductsByAllBrand")
	@ResponseBody
	public Msg searchProductsByAllBrand(String search){
		Products products=new Products();
		if (search!=null && !search.equals("")) {
			products.setName(search);
		};
		List<Brand> allBrant=
				productsSearchService.selectAllProductsBrandByComplexSearch(products);
		if (allBrant!=null) {
			return Msg.success().add("bran", allBrant);
		}else {
			return Msg.fail().add("msg", "没有相关品牌");
		}
	}
	
	/**
	 * @Title:   searchProductsByAllProductType
	 * @Description:  搜索查询所有的商品种类
	 * @param:    @param search
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月16日 下午10:35:14
	 */
	@RequestMapping("/searchProductsByAllProductType")
	@ResponseBody
	public Msg searchProductsByAllProductType(String search){
		Products products=new Products();
		if (search!=null && !search.equals("")) {
			products.setName(search);
		};
		List<ProductType> allType=
				productsSearchService.selectAllProductsTypeByComplexSearch(products);
		if (allType!=null) {
			return Msg.success().add("bran", allType);
		}else {
			return Msg.fail().add("msg", "没有相关品牌");
		}
	}

}
