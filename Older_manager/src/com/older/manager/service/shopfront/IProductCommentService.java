package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.ProductComment;

public interface IProductCommentService {
	List<ProductComment> queryProductCommentByUserId(Integer userId);

	public void  addProductComment(ProductComment productComment);
}
