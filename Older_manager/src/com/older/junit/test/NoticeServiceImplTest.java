/**
 * 
 */
package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Notice;
import com.older.manager.service.oldback.NoticeService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NoticeServiceImplTest {

	@Autowired
	NoticeService noticeService;
	
	@Test
	public void AddNoticeTest(){
		for (int i = 0; i < 10; i++) {
			Notice notice=new Notice();
			notice.setTitle("聚餐"+i);
			notice.setContent("今天晚上7点聚贤楼聚餐");
			notice.setType("传达通知");
			notice.setReleasepeople("办公室");
			notice.setTime(new Date());
			noticeService.AddNotice(notice);
		}
	}
	
	@Test
	public void findAllNoticesTest(){
		System.out.println(noticeService.findAllNotices());
	}
	
	@Test
	public void findNoticeByIdTest(){
		System.out.println(noticeService.findNoticeById(2));
	}
	
	@Test
	public void updateNoticeTest(){
		Notice notice=new Notice();
		notice.setId(1);
		notice.setReleasepeople("总管");
		System.out.println(noticeService.updateNotice(notice));
	}
}
