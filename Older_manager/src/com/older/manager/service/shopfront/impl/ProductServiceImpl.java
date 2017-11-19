package com.older.manager.service.shopfront.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Products;
import com.older.manager.bean.ProductsExample;
import com.older.manager.mapper.ProductKeywordMapper;
import com.older.manager.mapper.ProductsMapper;
import com.older.manager.service.shopfront.IProductService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.UUIDTools;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductsMapper productsMapper;

	@Autowired
	private ProductKeywordMapper productKeywordMapper;

	@Override
	public void insertProducts(Products products) {

		products.setAddtime(new Date());
		products.setAuditstatus(0);// 默认为待审核
		products.setState(0);// 默认为停用
		// 判断是否需要自动加上产品编号
		if (products.getNumber() == null || "".equals(products.getNumber())) {
			products.setNumber(UUIDTools.getNumber());
		}
		if (products.getImages() != null && !"".equals(products.getImages())) {
			products.setImages(products.getImages().substring(1,
					products.getImages().length()));
		}
		productsMapper.insertSelective(products);
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
		Products product = productsMapper.selectWithTypeBrandByKey(id);
		// 分割图片路径，方便前台循环展示
		if (product.getImages() != null && !"".equals(product.getImages())) {
			List<String> imgList = new ArrayList<String>();
			String img = product.getImages();
			if (img.contains(",")) {
				String i[] = img.split(",");
				for (String image : i) {
					if ("".equals(image))
						continue;
					imgList.add(image.trim());
				}
			} else {
				imgList.add(img.trim());
			}
			product.setImgList(imgList);
		}
		return product;
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
				FileUtil.deleteFile(product.getImages().trim(), request);
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

		// 删除对应图片
		for (Integer id : ids) {
			product = productsMapper.selectByPrimaryKey(id);
			if (product.getImages() != null) {
				if (product.getImages().contains(",")) {
					String image[] = product.getImages().trim().split(",");
					for (String fileName : image) {
						FileUtil.deleteFile(fileName, request);
					}
				} else {
					FileUtil.deleteFile(product.getImages().trim(), request);
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
				products.setImages(product.getImages() + products.getImages());
			} else {
				products.setImages(products.getImages().substring(1,
						products.getImages().length()));
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
					StringBuffer newImg = new StringBuffer();
					String image[] = product.getImages().trim().split(",");
					for (String fileName : image) {
						if (fileName.equals(imgName)) {
							FileUtil.deleteFile(fileName, request);
							break;
						}
						newImg.append(fileName).append(",");
					}
					String s = newImg.toString().substring(0,
							newImg.lastIndexOf(","));
					product.setImages(s);
				} else {
					if (product.getImages().equals(imgName.trim())) {
						FileUtil.deleteFile(imgName.trim(), request);
						product.setImages("");
					}
				}
			}
			productsMapper.updateByPrimaryKeySelective(product);
		}
	}

	@Override
	public void updateStateAndAuditstatus(Products product) {
		productsMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public Products findProductById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return productsMapper.selectByPrimaryKey(id);
	}
}
