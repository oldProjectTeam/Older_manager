package com.older.manager.controller.oldback;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Activity;
import com.older.manager.service.oldback.IActivityService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;
import com.older.manager.utils.TableData;

@Controller
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	@Qualifier("activityServiceImpl")
	IActivityService activityService;

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
	 * 发布活动信息
	 * 
	 * @param activity
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/insertActivity")
	@ResponseBody
	public Msg insertActivity(Activity activity, MultipartFile file,
			HttpServletRequest request) {
		System.out.println(activity.toString());
		System.out.println(file.getOriginalFilename());
		boolean flag = false;
		try {
			String imgUrl = null;
			if (file != null) {
				imgUrl = FileUtil.saveFile(file, request);
			}
			activity.setActivity1(imgUrl);
			activity.setReleasetime(new Date());
			activityService.insertActivity(activity);
			flag = true;
		} catch (Exception e) {
		} finally {
			if (flag) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		}
	}

	/**
	 * 跳转到发布活动界面
	 * 
	 * @return
	 */
	@RequestMapping("/sendactivity")
	public String addActivityUi() {
		return "/oldback/officemanage/sendactivity";
	}

	/**
	 * 模糊查询所有活动信息
	 * 
	 * @param pn
	 * @param activity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("queryActivity")
	public ModelAndView queryAllActivity(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Activity activity) throws Exception {
		ModelAndView modelAndView = new ModelAndView(
				"/oldback/officemanage/activitymanager");

		// 设置中文编码格式
		if (activity != null) {
			if (activity.getTitle() != null)
				activity.setTitle(new String(activity.getTitle().getBytes(
						"ISO-8859-1"), "utf-8"));
			if (activity.getPlace() != null)
				activity.setPlace(new String(activity.getPlace().getBytes(
						"ISO-8859-1"), "utf-8"));
		}
		PageHelper.startPage(pn, 5);
		List<Activity> list = activityService
				.queryAllActivityByCondiction(activity);
		PageInfo pageInfo = new PageInfo(list, 5);
		modelAndView.addObject("pageInfo", pageInfo);
		return modelAndView;
	}

	/**
	 * 删除活动信息
	 * 
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/deleteActivity/{ids}")
	@ResponseBody
	public Msg deleteActivity(@PathVariable("ids") String ids) {
		boolean flag = false;
		try {
			if (ids.contains("-")) {
				List<Integer> ids_str = new ArrayList<Integer>();
				String str[] = ids.split("-");
				for (String id : str) {
					ids_str.add(Integer.parseInt(id));
				}
				activityService.batchDeleteActivity(ids_str);
			} else {
				activityService.deleteActivityById(Integer.parseInt(ids));
			}
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		}
	}

	@SuppressWarnings("finally")
	@RequestMapping("/findActivityById")
	@ResponseBody
	public Msg findActivityById(Integer id) {
		boolean flag = false;
		Activity activity = null;
		try {
			activity = activityService.findActivityById(id);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				return Msg.success().add("activity", activity);
			} else {
				return Msg.fail();
			}
		}

	}

	@SuppressWarnings("finally")
	@RequestMapping("/updateActivity")
	@ResponseBody
	public Msg updateActivity(Activity activity) {
		boolean flag = false;
		try {
			activityService.updateActivity(activity);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				return Msg.success();
			} else {
				return Msg.fail();
			}
		}

	}

	/**
	 * 查全部活动然给参加活动页面
	 * 
	 * @return
	 */
	@RequestMapping("/selectallativityskiptakeactivity")
	@ResponseBody
	public Msg selectAllAtivitySkipTakeActivity() {
		List<Activity> activities = activityService
				.queryAllActivityByCondiction(null);
		return Msg.success().add("activities", activities);

	}

	/**
	 * @Title: findAllActivitiesByState
	 * @Description: 查询所有没有举行的活动
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllActivitiesByState")
	@ResponseBody
	public Msg findAllActivitiesByState() {
		List<Activity> activities = activityService
				.findAllActivitiesByNoReleaseregion();
		if (activities != null) {
			return Msg.success().add("activities", activities);
		} else {
			return Msg.fail().add("msg", "查询不到相关的数据！");
		}
	}

	@RequestMapping("/test")
	@ResponseBody
	public TableData<Activity> test(@RequestParam("page") Integer page,
			@RequestParam("limit") Integer limit) {
		TableData<Activity> tableData = new TableData<Activity>();
		PageHelper.startPage(page, limit);
		List<Activity> activities = activityService
				.findAllActivitiesByNoReleaseregion();
		PageInfo<Activity> pageInfo = new PageInfo<Activity>(activities);
		tableData.setCode(0);
		tableData.setCount(activities.size());
		tableData.setData(pageInfo.getList());
		tableData.setMsg("查询成功");
		return tableData;
	}
}
