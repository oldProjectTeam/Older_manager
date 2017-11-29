package com.older.manager.service.shopfront;

import java.util.List;
import java.util.Map;

import com.older.manager.bean.ProductComment;
/**
 * 评论 添加了方法
 * @author 疯癫
 *
 */
public interface IProductCommentService {
	List<ProductComment> queryProductCommentByUserId(Integer userId);

	 /**
     * 添加
     * @param productComment
     */
	public void  addProductComment(ProductComment productComment);
	/**
	 * 根据积分查条数
	 * @param grade
	 * @return
	 */
	public Map<String, Integer> countComment(Integer pid);
	/**
	 * 根据商品id来查全部
	 * @param productComment
	 * @return
	 */
	public List<ProductComment> selectAllProductComment(Integer pid);
}
