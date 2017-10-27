package com.older.manager.test;

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
		Video video = new Video();
		video.setTitle("S7");
		video.setLenght("258");
		video.setPath("鸟巢");
		video.setCreatetime(new Date());
		videoService.insertVideo(video);
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
}
