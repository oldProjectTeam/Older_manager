package com.older.manager.controller.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Video;
import com.older.manager.service.oldback.VideoService;

@Controller
@RequestMapping("/video")
public class VideoController {

	@Autowired
	@Qualifier("videoServiceImpl")
	private VideoService videoService;	
	
	/**
	 * @Title:   findById
	 * @Description:  通过id查询
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Video   
	 * @throws
	 */
	@RequestMapping("/findById")
	@ResponseBody
	public Video findById(int id){
		return videoService.findById(id);
	}
	
	/**
	 * @Title:        insertVideo
	 * @Description:  插入
	 * @param:        @param video
	 * @param:        @return   
	 * @return:       int   
	 * @throws
	 */
	@RequestMapping("/insertVideo")
	@ResponseBody
	public int insertVideo(Video video){
		return videoService.insertVideo(video);
	}
	
	/**
	 * @Title:        deleteById
	 * @Description:  通过id删除
	 * @param:        @param id   
	 * @return:       void   
	 * @throws
	 */
	@RequestMapping("/deleteById")
	@ResponseBody
	public int deleteById(int id){
		return videoService.deleteById(id);
	}
	
	/**
	 * @Title:        updateVideo
	 * @Description:  修改
	 * @param:        @param video
	 * @param:        @return   
	 * @return:       int   
	 * @throws
	 */
	@RequestMapping("/updateVideo")
	@ResponseBody
	public int updateVideo(Video video){
		return videoService.updateVideo(video);
	}
	/**
	 * @Title:        findAll
	 * @Description:  查询全部
	 * @param:        @return   
	 * @return:       List<Video>   
	 * @throws
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Video> findAll(){
		return videoService.findAll();
	}
//	@RequestMapping("/getVideoPage")
//	@ResponseBody
//	public Msg getVideoPage(
//			@RequestParam(value="pn",defaultValue="1",required=true)Integer pn,
//			@RequestParam(value="pageSize",defaultValue="10",required=false)Integer pageSize){
//		PageHelper
//	}
}
