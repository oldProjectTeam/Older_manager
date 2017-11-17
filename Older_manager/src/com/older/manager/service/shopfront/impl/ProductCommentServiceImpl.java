package com.older.manager.service.shopfront.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.ProductComment;
import com.older.manager.mapper.ProductCommentMapper;
import com.older.manager.service.shopfront.IProductCommentService;
@Service
public class ProductCommentServiceImpl implements IProductCommentService {
	@Autowired
	private ProductCommentMapper productCommentMapper;
	@Override
	public List<ProductComment> queryProductComments() {
		return productCommentMapper.selectProductsComments();
	}

}
