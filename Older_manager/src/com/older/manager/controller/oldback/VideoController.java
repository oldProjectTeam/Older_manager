package com.older.manager.controller.oldback;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Video;
import com.older.manager.service.oldback.VideoService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

/**
 * @author 修改：杨明 修改时间：2017/10/27 * 再次编写：杨明 编写时间：2017/10/29 编写内容：添加视频管理界面需要的接口
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
	 * @Title: findVideoById
	 * @Description: 通过id查询
	 * @param: @param id
	 * @param: @return
	 * @return: Video
	 * @throws
	 */
	@RequestMapping("/findVideoById")
	public String findVideoById(int id, String way, Model model) {
		model.addAttribute("video", videoService.findById(id));
		if (Integer.valueOf(way) == 0) {
			return "oldback/educationManage/videoview";
		} else {
			return "oldback/educationManage/updatevideo";
		}

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
	 * @Title: addVideo
	 * @Description: 添加视频信息
	 * @param: @param video
	 * @param: @return
	 * @return: Msg
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
	 * @Title: deleteVideoById
	 * @Description: 通过id删除
	 * @param: @param id
	 * @return: void
	 * @throws
	 */
	@RequestMapping("/deleteVideoById")
	@ResponseBody
	public Msg deleteVideoById(int id) {
		int state = videoService.deleteById(id);
		if (state != 0) {
			return Msg.success().add("msg", "删除成功");
		} else {
			return Msg.fail().add("msg", "删除失败");
		}
	}

	/**
	 * @Title: delectVideoByListId
	 * @Description: 批量删除视频
	 * @param: @param listId
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/delectVideoByListId")
	@ResponseBody
	public Msg delectVideoByListId(String listId) {
		System.out.println("listId" + listId);
		String[] idlist = listId.split("-");
		String msg = "";
		for (int i = 0; i < idlist.length; i++) {
			int states = videoService.deleteById(Integer.valueOf(idlist[i]));
			if (states != 0) {
				msg = msg + idlist[i] + ",";
			}
		}
		return Msg.success().add("msg", "id为：" + msg + "删除成功");

	}

	/**
	 * @Title: updateVideo
	 * @Description: 修改视频信息
	 * @param: @param video
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/updateVideo")
	@ResponseBody
	public Msg updateVideo(Video video) {
		int state = videoService.updateVideo(video);
		if (state != 0) {
			return Msg.success().add("msg", "视频更改成功！");
		} else {
			return Msg.fail().add("msg", "视频更改失败！");
		}
	}

	/**
	 * @Title: findAllByPage
	 * @Description: 分页查询全部视频信息
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllByPage")
	@ResponseBody
	public Msg findAllByPage(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<Video> list = videoService.findAll();
		PageInfo<Video> pageInfo = new PageInfo<Video>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: findAllVideoBySearch
	 * @Description: 通过搜索信息搜索视频
	 * @param: @param title
	 * @param: @param creator
	 * @param: @param vcount
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @param: @throws UnsupportedEncodingException
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/findAllVideoBySearch")
	@ResponseBody
	public Msg findAllVideoBySearch(
			String title,
			String creator,
			String vcount,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<Video> list = null;
		if ((title != null && !title.equals(""))
				&& (vcount != null && !vcount.equals(""))&&(creator==null||creator.equals(""))) {
			System.out.println("...............进入4");
			list = videoService.findAllVideoByNameAndVCount(
					new String(title.getBytes("iso-8859-1"), "utf-8"),
					Integer.valueOf(vcount));
		} else if ((creator != null && !creator.equals(""))
				&& (vcount != null && !vcount.equals(""))&&(title==null||title.equals(""))) {
			System.out.println("...............进入3");
			list = videoService.findAllVideoByCreatorsAndVCount(new String(
					creator.getBytes("iso-8859-1"), "utf-8"), Integer
					.valueOf(vcount));
		} else if ((creator != null && !creator.equals(""))
				&& (vcount != null && !vcount.equals(""))
				&& (title != null && !title.equals(""))) {
			System.out.println("...............进入2");
			list = videoService.findAllVideoByCreatorsAndNameAndVCount(
					new String(title.getBytes("iso-8859-1"), "utf-8"),
					new String(creator.getBytes("iso-8859-1"), "utf-8"),
					Integer.valueOf(vcount));
		} else {
			System.out.println("...............进入1");
			list = videoService.findAllByCount(Integer.valueOf(vcount));
		}
		;

		PageInfo<Video> pageInfo = new PageInfo<Video>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到相关数据");
		} else {
			return Msg.success().add("pageInfo", pageInfo);
		}

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
	 * @Description:跳转到视频添加界面
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	@RequestMapping("/intoAddVideo")
	public String intoAddVideo() {
		return "oldback/educationManage/addvideo";
	}

}
