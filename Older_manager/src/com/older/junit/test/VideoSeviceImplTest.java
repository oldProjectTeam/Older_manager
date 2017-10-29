package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Video;
import com.older.manager.service.oldback.VideoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class VideoSeviceImplTest {

	@Autowired
	VideoService videoService ;
	
	@Test
	public void findByIdTest(){
		System.out.println(videoService.findById(2).toString());
		
	}
	
	@Test
	public void insertVideoTest(){
		for (int i = 0; i < 20; i++) {
			Video video = new Video();
			video.setTitle("测试"+i);
			video.setLenght("258");
			video.setPath("哈哈哈哈哈哈哈");
			video.setVcount(1);
			video.setCreatetime(new Date());
			videoService.insertVideo(video);
		}
		
	}
	
	@Test
	public void updateVideoTest(){
		Video video = new Video();
		video.setId(2);
		
		video.setTitle("S7");
		video.setLenght("250");
		video.setPath("鸟巢");
		videoService.updateVideo(video);
	}
	
	@Test
	public void deleteByIdTest(){
		videoService.deleteById(2);
	}
	
	@Test
	public void findAllVideoByVCount(){
		System.out.println("测试。。。。。"+videoService.findAllVideoByVCount(1));
	}
	
	@Test
	public void findAllVideoByCreatorsAndVCountTest(){
		System.out.println("测试。。。。。"+videoService.findAllVideoByCreatorsAndVCount("哈", 1));
	}
	
	@Test
	public void findAllVideoByNameAndVCountTest(){
		System.out.println("测试。。。。。"+videoService.findAllVideoByNameAndVCount("测", 1));
	}
	
	
	@Test
	public void findAllVideoByCreatorsAndNameAndVCountTest(){
		System.out.println("测试。。。。。"+videoService.findAllVideoByCreatorsAndNameAndVCount("测","哈", 1));
	}
}
