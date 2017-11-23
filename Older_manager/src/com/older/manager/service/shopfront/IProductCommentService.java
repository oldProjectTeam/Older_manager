package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.ProductComment;

public interface IProductCommentService {
	List<ProductComment> queryProductComments();

	public void  addProductComment(ProductComment productComment);
}
