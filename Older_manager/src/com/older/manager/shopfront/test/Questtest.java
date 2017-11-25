package com.older.manager.shopfront.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Questionandanswer;
import com.older.manager.service.shopfront.SafetyService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Questtest {
	@Autowired
	@Qualifier("safetyServiceImpl")
	private SafetyService safetyService;
	
	
	@Test
	public void testADD()throws Exception{
			Questionandanswer questionandanswer=new Questionandanswer();
		     questionandanswer.setQuestionone("喜欢的颜色");
		     questionandanswer.setAnswerone("粉色");
		     questionandanswer.setQuestiontwo("你的家在哪里的");
		     questionandanswer.setAnswertwo("小雅");
		     questionandanswer.setUserid(220);
		     safetyService.addQuestion(questionandanswer);
	}       
}
