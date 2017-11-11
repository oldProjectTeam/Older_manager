package com.older.manager.service.impl.oldback.shop;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.TTCCLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import com.older.manager.bean.ActivityenrolExample.Criteria;
import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.mapper.ProductKeywordMapper;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.oldback.shop.IProductService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.UUIDTools;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductsMapper productsMapper;

	@Override
	public List<Products> selectProducts() {

		return productsMapper.selectByExample(null);
	}

	@Override
	public List<Products> selectCondition(Products products) {

		return productsMapper.selectCondition(products);
	}

	@Override
	public void insertProducts(Products products) {

		products.setAddtime(new Date());
		products.setAuditstatus(0);// 默认为待审核
		products.setState(0);// 默认为停用
		// 判断是否需要自动加上产品编号
		if (products.getNumber() == null || "".equals(products.getNumber())) {
			products.setNumber(UUIDTools.getNumber());
		}
		productsMapper.insertSelective(products);
	}

	@Override
	public void deleteProducts(List<String> numbers) {
		ProductsExample example = new ProductsExample();
		com.older.manager.bean.ProductsExample.Criteria create = example
				.createCriteria();
		create.andNumberIn(numbers);
		productsMapper.deleteByExample(example);

	}

	@Override
	public void deleteByProduct(String number) {
		ProductsExample example = new ProductsExample();
		com.older.manager.bean.ProductsExample.Criteria criteria = example
				.createCriteria();
		criteria.andNumberEqualTo(number);
		productsMapper.deleteByExample(example);
	}

	@Override
	public void updateByNumber(Products product) {
		productsMapper.updateByNumber(product);
	}

	@Override
	public Map<String, Object> selectByCondition(Products product)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (product.getLimit() != null) {
			Integer page = product.getPage();
			product.setPage(product.getLimit() * (page - 1));
		}
		map.put("data", productsMapper.selectByCondition(product));
		map.put("count", productsMapper.countByExample(null));
		map.put("code", 0);
		map.put("msg", "处理成功");
		return map;
	}

	@Override
	public Products findProduct(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return productsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteProduct(Integer id, HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		Products product = productsMapper.selectByPrimaryKey(id);
		if (product.getImages() != null) {
			if (product.getImages().contains(",")) {
				String image[] = product.getImages().trim().split(",");
				for (String fileName : image) {
					FileUtil.deleteFile(fileName, request);
				}
			} else {
				FileUtil.deleteFile(product.getImages(), request);
			}
		}
		productsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDeleteProduct(List<Integer> ids, HttpServletRequest request)
			throws Exception {
		ProductsExample example = new ProductsExample();
		ProductsExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		Products product = null;
		
		// 删除对应图片图片
		for (Integer id : ids) {
			product = productsMapper.selectByPrimaryKey(id);
			if (product.getImages() != null) {
				if (product.getImages().contains(",")) {
					String image[] = product.getImages().trim().split(",");
					for (String fileName : image) {
						FileUtil.deleteFile(fileName, request);
					}
				} else {
					String fileName = product.getImages().replaceAll(",", "");// 防止格式错误，多逗号
					FileUtil.deleteFile(fileName, request);
				}
			}
		}
		productsMapper.deleteByExample(example);
	}

	@Override
	public void updateProduct(Products products, HttpServletRequest request)
			throws Exception {

		// 调整图片序列格式
		if (products.getImages() != null) {
			Products product = productsMapper.selectByPrimaryKey(products
					.getId());
			if (product.getImages() != null && !"".equals(product.getImages())) {
				products.setImages(product.getImages() + ","
						+ products.getImages());
			}
		}
		productsMapper.updateByPrimaryKeySelective(products);
	}

	@Override
	public void deleteImg(Integer id, String imgName, HttpServletRequest request)
			throws Exception {
		if (imgName != null && !"".equals(imgName)) {
			Products product = productsMapper.selectByPrimaryKey(id);
			if (product.getImages() != null) {
				
				if (product.getImages().contains(",")) {
					StringBuffer newImg=new StringBuffer();
					String image[] = product.getImages().trim().split(",");
					for (String fileName : image) {
						if (fileName.equals(imgName)) {
							FileUtil.deleteFile(fileName, request);
							break;
						}
						newImg.append(fileName).append(",");
					}
					String s=newImg.toString().substring(0,newImg.lastIndexOf(","));
					product.setImages(s);
					//更新图片序列信息
					productsMapper.updateByPrimaryKeySelective(product);
				} else {
					String fileName = product.getImages().replaceAll(",", "");// 防止格式错误，多逗号
					if (fileName.equals(imgName))
						FileUtil.deleteFile(fileName, request);
				}
			}

		}
	}
}
