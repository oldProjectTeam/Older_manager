package com.older.manager.service.shopfront.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Orderdetail;
import com.older.manager.bean.ProductComment;
import com.older.manager.bean.ProductCommentExample;
import com.older.manager.bean.ProductCommentExample.Criteria;
import com.older.manager.mapper.OrderdetailMapper;
import com.older.manager.mapper.ProductCommentMapper;
import com.older.manager.service.shopfront.IProductCommentService;

@Service
public class ProductCommentServiceImpl implements IProductCommentService {
	@Autowired
	private ProductCommentMapper productCommentMapper;

	@Autowired
	private OrderdetailMapper orderdetailMapper;

	@Override
	public List<ProductComment> queryProductCommentByUserId(Integer userId) {
		ProductCommentExample example = new ProductCommentExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsersIdEqualTo(userId);
		List<ProductComment> list = new ArrayList<ProductComment>();
		List<ProductComment> lComments = productCommentMapper
				.selectByExample(example);
		for (ProductComment productComment : lComments) {
			Orderdetail orderdetail = this.queryOrderDetailById(productComment
					.getOrdersdetailId());
			productComment.setOrderdetail(orderdetail);
			list.add(productComment);
		}
		return list;
	}

	/**
	 * 查询订单详情
	 * 
	 * @param ordersdetailId
	 * @return
	 */
	private Orderdetail queryOrderDetailById(Integer ordersdetailId) {
		return orderdetailMapper.selectByPrimaryKey(ordersdetailId);
	}

	@Override
	public void addProductComment(ProductComment productComment) {
		// TODO 自动生成的方法存根
		productCommentMapper.insertSelective(productComment);
	}
	

	@Override
	public Map<String, Integer> countComment(Integer pid) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		for (int i = 0; i < 5; i++) {
			ProductCommentExample example=new ProductCommentExample();
			Criteria criteria=example.createCriteria();
			criteria.andGradeEqualTo(i+1);
			criteria.andProductidEqualTo(pid);
			map.put(""+(i+1), productCommentMapper.countByExample(example));
			
		 }
		
		return map;
	}
	@Override
	public List<ProductComment> selectAllProductComment(Integer pid) {
		
		return productCommentMapper.selectByExampleWithUserid(pid);
	}
	
	
	
	
	
	
	
}
