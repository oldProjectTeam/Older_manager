/**
 * 
 */
package com.older.manager.controller.oldfront;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
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
import com.older.manager.bean.BrandWithBLOBs;
import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;
import com.older.manager.service.shopfront.IProductService;
import com.older.manager.service.shopfront.ProductsSearchService;
import com.older.manager.service.shopfront.ShopHomeService;
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

	@Autowired
	ShopHomeService shopHomeService;

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
		model.addAttribute("rearchkey",
				new String(searchKeyWord.getBytes("iso-8859-1"), "utf-8"));
		return "oldfront/home/search";
	}
	
	/**
	 * @Title:   typeIntoSearch
	 * @Description:  通过类型跳转到搜索
	 * @param:    @param typeName
	 * @param:    @param model
	 * @param:    @return
	 * @param:    @throws UnsupportedEncodingException   
	 * @return:   String   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月22日 下午11:28:12
	 */
	@RequestMapping("/typeIntoSearch")
	public String typeIntoSearch(String typeName, Model model)
			throws UnsupportedEncodingException {
		model.addAttribute("typekey",
				new String(typeName.getBytes("iso-8859-1"), "utf-8"));
		return "oldfront/home/search";
	}
	
	/**
	 * @Title:   brandIntoSearch
	 * @Description:  通过品牌跳转到搜索
	 * @param:    @param brandName
	 * @param:    @param model
	 * @param:    @return
	 * @param:    @throws UnsupportedEncodingException   
	 * @return:   String   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月22日 下午11:28:49
	 */
	@RequestMapping("/brandIntoSearch")
	public String brandIntoSearch(String brandName, Model model)
			throws UnsupportedEncodingException {
		model.addAttribute("brandkey",
				new String(brandName.getBytes("iso-8859-1"), "utf-8"));
		return "oldfront/home/search";
	}

	/**
	 * @Title: searchBrand
	 * @Description: 首页点击品牌名称跳转到搜索界面
	 * @param: @param brand
	 * @param: @param model
	 * @param: @return
	 * @param: @throws UnsupportedEncodingException
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月22日 下午4:34:18
	 */
	@RequestMapping("/searchbrand")
	public String searchBrand(String brand, Model model)
			throws UnsupportedEncodingException {
		model.addAttribute("brandkey", new String(brand.getBytes("iso-8859-1"),
				"utf-8"));
		return "oldfront/home/search";
	}

	/**
	 * @Title:   searchType
	 * @Description:  首页点击产品名称跳转到搜索界面
	 * @param:    @param type
	 * @param:    @param model
	 * @param:    @return
	 * @param:    @throws UnsupportedEncodingException   
	 * @return:   String   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月22日 下午4:36:49
	 */
	@RequestMapping("/searchType")
	public String searchType(String type, Model model)
			throws UnsupportedEncodingException {
		model.addAttribute("typekey", new String(type.getBytes("iso-8859-1"),
				"utf-8"));
		return "oldfront/home/search";
	}

	/**
	 * @Title: Test
	 * @Description: 简单查询
	 * @param: @param search 关键词
	 * @param: @param pn 页数
	 * @param: @param pageSize
	 * @param: @return
	 * @param: @throws UnsupportedEncodingException
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月17日 下午9:19:26
	 */
	@RequestMapping("/sampleSearch")
	@ResponseBody
	public Msg sampleSearch(
			String keyword,
			String typename,
			String brandname,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "12", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		
		List<Products> list = new ArrayList<Products>();
		if (keyword!=null && keyword.length()>0) {
			String keywordString = new String(keyword.getBytes("iso-8859-1"), "utf-8");
			if (!keywordString.equals("?")) {
				System.out.println("........empString" + keywordString);
				list = productsSearchService.findAllProductsBySearch(keywordString);
				System.out.println(".........list" + list);
			} else {
				System.out.println("........search" + keyword);
				list = productsSearchService.findAllProductsBySearch(keyword);
				System.out.println(".........list" + list);
			}
		};
		if (typename!=null && typename.length()>0) {
			String typenameString=new String(typename.getBytes("iso-8859-1"), "utf-8");
			if (!typenameString.equals("?")) {
				System.out.println("........empString" + typenameString);
				list = productsSearchService.selecyAllProductsByTypeName(typenameString);
				System.out.println(".........list" + list);
			} else {
				System.out.println("........search" + keyword);
				list = productsSearchService.selecyAllProductsByTypeName(typename);
				System.out.println(".........list" + list);
			}
		};
		
		if (brandname!=null && brandname.length()>0) {
			String brandnameString=new String(brandname.getBytes("iso-8859-1"), "utf-8");
			if (!brandnameString.equals("?")) {
				System.out.println("........empString" + brandnameString);
				list = productsSearchService.selectAllProductsByBrandName(brandnameString);
				System.out.println(".........list" + list);
			} else {
				System.out.println("........search" + keyword);
				list = productsSearchService.selectAllProductsByBrandName(brandname);
				System.out.println(".........list" + list);
			}
		};
		PageInfo<Products> pageInfo = new PageInfo<Products>(list, 6);
		if (list.size() == 0) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: complexSearch
	 * @Description: 复杂查询
	 * @param: @param searchkey 搜索词
	 * @param: @param brandname 品牌名称
	 * @param: @param typename 产品类型名
	 * @param: @param keywordname 产品关键字
	 * @param: @param pricestate 价格排序状态：0为不排序，1为排序
	 * @param: @param salestate 销售量排序状态：0为不排序，1为排序
	 * @param: @param commentstate 评论排序状态：0为不排序，1为排序
	 * @param: @param pn 当前页数
	 * @param: @param pageSize 每页显示条数
	 * @param: @return
	 * @param: @throws UnsupportedEncodingException
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月17日 下午5:29:40
	 */
	@RequestMapping("/complexSearch")
	@ResponseBody
	public Msg complexSearch(
			String searchkey,
			String brandname,
			String typename,
			String keywordname,
			int pricestate,
			int salestate,
			int commentstate,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "12", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		Products products = new Products();
		if (brandname != null && !brandname.equals("")) {
			BrandWithBLOBs brand = new BrandWithBLOBs();
			brand.setName(new String(brandname.getBytes("iso-8859-1"), "utf-8"));
			products.setBrand(brand);
		}
		;
		if (typename != null && !typename.equals("")) {
			ProductType productType = new ProductType();
			productType.setName(new String(typename.getBytes("iso-8859-1"),
					"utf-8"));
			products.setProductType(productType);
		}
		;
		if (keywordname != null && !keywordname.equals("")) {
			ProductKeyword productKeyword = new ProductKeyword();
			productKeyword.setKeyword(new String(keywordname
					.getBytes("iso-8859-1"), "utf-8"));
			products.setProductKeyword(productKeyword);
		}
		;
		if (searchkey != null && !searchkey.equals("")) {
			products.setName(new String(searchkey.getBytes("iso-8859-1"),
					"utf-8"));
		}
		;
		if (pricestate == 1) {
			products.setNowprice(2.0);
		}
		;
		if (salestate == 1) {
			products.setSales(salestate);
		}
		;
		List<Products> list = productsSearchService
				.findAllProductsByComplexSearch(products);
		PageInfo<Products> pageInfo = new PageInfo<Products>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: searchProductsByAllBrand
	 * @Description: 搜索查询所有的商品品牌
	 * @param: @param search
	 * @param: @return
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午10:35:41
	 */
	@RequestMapping("/searchProductsByAllBrand")
	@ResponseBody
	public Msg searchProductsByAllBrand(String search) {
		Products products = new Products();
		if (search != null && !search.equals("")) {
			products.setName(search);
		}
		;
		List<Brand> allBrant = productsSearchService
				.selectAllProductsBrandByComplexSearch(products);
		if (allBrant != null) {
			return Msg.success().add("bran", allBrant);
		} else {
			return Msg.fail().add("msg", "没有相关品牌");
		}
	}

	/**
	 * @Title: searchProductsByAllProductType
	 * @Description: 搜索查询所有的商品种类
	 * @param: @param search
	 * @param: @return
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午10:35:14
	 */
	@RequestMapping("/searchProductsByAllProductType")
	@ResponseBody
	public Msg searchProductsByAllProductType(String search) {
		Products products = new Products();
		if (search != null && !search.equals("")) {
			products.setName(search);
		}
		;
		List<ProductType> allType = productsSearchService
				.selectAllProductsTypeByComplexSearch(products);
		if (allType != null) {
			return Msg.success().add("bran", allType);
		} else {
			return Msg.fail().add("msg", "没有相关品牌");
		}
	}

	/**
	 * @Title: searchHotKeywordProductsByAllProductType
	 * @Description: 查询搜索出来的产品关键词
	 * @param: @param search
	 * @param: @return
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月17日 下午2:36:15
	 */
	@RequestMapping("/searchHotKeywordProductsByAllProductType")
	@ResponseBody
	public Msg searchHotKeywordProductsByAllProductType(String search) {
		Products products = new Products();
		if (search != null && !search.equals("")) {
			products.setName(search);
		}
		;
		List<String> HotkeyWord = productsSearchService
				.selectAllHosProductsKeyWordBySearch(products);
		if (HotkeyWord != null) {
			return Msg.success().add("HotkeyWord", HotkeyWord);
		} else {
			return Msg.fail().add("msg", "没有相关商品关键词");
		}
	}

	/**
	 * @Title: findProductsTypeIncludeBrand
	 * @Description: 查询商品的类型和品牌
	 * @param: @return
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月20日 下午11:53:33
	 */
	@RequestMapping("/findProductsTypeIncludeBrand")
	@ResponseBody
	public Msg findProductsTypeIncludeBrand() {
		List<ProductType> productTypes = shopHomeService
				.findAllProductTypesAndBrand();
		if (productTypes.size() > 0) {
			return Msg.success().add("productTypes", productTypes);
		} else {
			return Msg.fail().add("msg", "查询不到相关数据");
		}
	};

	/**
	 * @Title: findProductsTypeIncludeProducts
	 * @Description: 查询一级商品的类型,二级类型和品牌和销售前6的商品
	 * @param: @return
	 * @return: Msg
	 * @throws
	 * @author: ym
	 * @date: 2017年11月21日 上午10:14:21
	 */
	@RequestMapping("/findProductsTypeIncludeProducts")
	@ResponseBody
	public Msg findProductsTypeIncludeProducts() {
		List<ProductType> productTypes = shopHomeService
				.findAllProductTypeAndProducts();
		if (productTypes.size() > 0) {
			return Msg.success().add("productTypes", productTypes);
		} else {
			return Msg.fail().add("msg", "查询不到相关数据");
		}
	}
	
	/**
	 * @Title:   selectSlidePeoducts
	 * @Description:  查询首页轮播的产品图片
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 * @author:   ym
	 * @date:     2017年11月23日 上午1:19:31
	 */
	@RequestMapping("/selectSlidePeoducts")
	@ResponseBody
	public Msg selectSlidePeoducts() {
		List<Products> products = productsSearchService
				.selectSlidePeoducts();
		if (products.size() > 0) {
			return Msg.success().add("products", products);
		} else {
			return Msg.fail().add("msg", "查询不到相关数据");
		}
	}

}
