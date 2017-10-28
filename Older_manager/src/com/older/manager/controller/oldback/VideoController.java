package com.older.manager.controller.oldback;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Video;
import com.older.manager.service.oldback.VideoService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

/**
 * @author 修改：杨明 修改时间：2017/10/27
 */
@Controller
@RequestMapping("/video")
public class VideoController {

	@Autowired
	private VideoService videoService;

	/**
	 * @Title: initBinder
	 * @Description: 解决上传时间转换问题
	 * @param: @param binder
	 * @return: void
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * @Title: findById
	 * @Description: 通过id查询
	 * @param: @param id
	 * @param: @return
	 * @return: Video
	 * @throws
	 */
	@RequestMapping("/findById")
	@ResponseBody
	public Video findById(int id) {
		return videoService.findById(id);
	}

	/**
	 * @Title: insertVideo
	 * @Description: 插入视频文件
	 * @param: @param file
	 * @param: @param request
	 * @param: @return
	 * @param: @throws IllegalStateException
	 * @param: @throws IOException
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/insertVideo")
	@ResponseBody
	public Msg insertVideo(MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {

		String VideoUrl = SaveFile.saveVideo(file, request);
		System.out.println(VideoUrl);
		if (VideoUrl != null) {
			return Msg.success().add("path", VideoUrl);
		} else {
			return Msg.fail().add("msg", "失败！");
		}
	}

	/**
	 * @Title:   addVideo
	 * @Description:  添加视频信息
	 * @param:    @param video
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("/addVideo")
	@ResponseBody
	public Msg addVideo(Video video) {
		int state = 0;
		System.out.println(video);
		if (video != null) {
			state = videoService.insertVideo(video);
		}
		if (state != 0) {
			return Msg.success().add("msg", "成功！");
		} else {
			return Msg.fail().add("msg", "fail");
		}
	}

	/**
	 * @Title: deleteById
	 * @Description: 通过id删除
	 * @param: @param id
	 * @return: void
	 * @throws
	 */
	@RequestMapping("/deleteById")
	@ResponseBody
	public int deleteById(int id) {
		return videoService.deleteById(id);
	}

	/**
	 * @Title: updateVideo
	 * @Description: 修改
	 * @param: @param video
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	@RequestMapping("/updateVideo")
	@ResponseBody
	public int updateVideo(Video video) {
		return videoService.updateVideo(video);
	}

	/**
	 * @Title: findAll
	 * @Description: 查询全部
	 * @param: @return
	 * @return: List<Video>
	 * @throws
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Video> findAll() {
		return videoService.findAll();
	}

	/**
	 * @Title: intoVideoManager
	 * @Description: 跳转到视频管理界面
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	@RequestMapping("/intoVideoManager")
	public String intoVideoManager() {
		return "oldback/educationManage/videoManager";
	}

	/**
	 * @Title: intoAddVideo
	 * @Description:跳转到视频管理界面
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	@RequestMapping("/intoAddVideo")
	public String intoAddVideo() {
		return "oldback/educationManage/addvideo";
	}

}
