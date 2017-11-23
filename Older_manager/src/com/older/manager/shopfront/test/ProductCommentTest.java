package com.older.manager.shopfront.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.ProductComment;
import com.older.manager.service.shopfront.IProductCommentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
/**
 * 评论
 * @author 疯癫
 *
 */
public class ProductCommentTest {

	@Autowired
	@Qualifier("productCommentServiceImpl")
	private IProductCommentService productCommentService;
	
	
	/**
	 * 增加
	 * @throws Exception
	 */
	@Test
	public void add()throws Exception{
		ProductComment productComment=new ProductComment();
		
		productComment.setUsersId(220);
		productComment.setOrdersdetailId(8);
		productComment.setContent("试试一下子");
		productComment.setCreatetime(new Date());
		productComment.setGrade(5);
		productComment.setImageurl("假装有的");
		productCommentService.addProductComment(productComment);
		
	}
}
