/**
 * 
 */
package com.older.manager.controller.oldback;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import com.older.manager.service.oldback.CourseService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;
import com.older.manager.bean.Courses;
/**
 * @author ym
 * 
 */
@Controller
@RequestMapping(value = "/Course")
public class CourseController {

	@Autowired
	@Qualifier("coursesServiceImpl")
	private CourseService courseService;

	/**
	 * @Title:   initBinder
	 * @Description:  解决上传时间转换问题
	 * @param:    @param binder   
	 * @return:   void   
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
	 * @Title: findCoursesById
	 * @Description: 根据id查询
	 * @param: @param id
	 * @param: @return
	 * @return: Courses
	 * @throws
	 */
	@RequestMapping(value = "/findCoursesByid")
	public String findCoursesById(int id, String way, Model model) {
		model.addAttribute("Course", courseService.findCoursesById(id));
		if (Integer.valueOf(way) == 0) {
			return "oldback/educationManage/courseview";
		} else {
			return "oldback/educationManage/updatecourse";
		}

	}

	
	/**
	 * @Title:   modifyCourses
	 * @Description:  修改课程
	 * @param:    @param file
	 * @param:    @param courses
	 * @param:    @param request
	 * @param:    @return
	 * @param:    @throws IllegalStateException
	 * @param:    @throws IOException   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping(value = "/modifyCourses")
	@ResponseBody
	public Msg modifyCourses(MultipartFile file, Courses courses,
			HttpServletRequest request) throws IllegalStateException,
			IOException {

		String ImgUrl =SaveFile.saveImg(file,request);
		if (courses != null) {
			// 添加图片字段
			courses.setPhoto(ImgUrl);
			if (courseService.modifyCourses(courses) != 0) {
				return Msg.success().add("msg", "success");
			} else {
				return Msg.fail().add("msg", "fail");
			}
		}
		return Msg.fail().add("msg", "fail");

	}

	
	/**
	 * @Title:   addCourse
	 * @Description:  添加课程
	 * @param:    @param file
	 * @param:    @param courses
	 * @param:    @param request
	 * @param:    @return
	 * @param:    @throws IllegalStateException
	 * @param:    @throws IOException   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping(value = "/addCourse")
	@ResponseBody
	public Msg addCourse(MultipartFile file, Courses courses,
			HttpServletRequest request) throws IllegalStateException,
			IOException {

		String ImgUrl =SaveFile.saveImg(file,request);
		
		if (courses != null) {
			//添加图片路径字段
			courses.setPhoto(ImgUrl);
			// 写入数据库
			if (courseService.addCourse(courses)!= 0) {
				return Msg.success().add("msg", "success");
			} else {
				return Msg.fail().add("msg", "fail");
			}
		}
		return Msg.fail().add("msg", "fail");

	}

	/**
	 * @Title: delectCourseById
	 * @Description: 根据id删除课程
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/delectCourseById")
	@ResponseBody
	public Msg delectCourseById(@Param("id") String id) {
		int state = courseService.deleteCoursesById(Integer.valueOf(id));
		if (state != 0) {
			return Msg.success().add("msg", "删除成功");
		} else {
			return Msg.fail().add("msg", "删除失败");
		}

	}
	
	
	
	/**
	 * @Title:   delectCourseByListId
	 * @Description:  批量删除课程
	 * @param:    @param listId
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping(value = "/delectCourseByListId")
	@ResponseBody
	public Msg delectCourseByListId(String listId) {
		System.out.println("listId"+listId);
		String[] idlist=listId.split("-");
		String msg="";
		for(int i=0;i<idlist.length;i++){
			int states = courseService.deleteCoursesById(Integer.valueOf(idlist[i]));
			if (states!=0) {
				msg=msg+idlist[i]+",";
			}
		}
		return Msg.success().add("msg", "id为："+msg+"删除成功");

	}
	

	/**
	 * @Title: getPages
	 * @Description: 分页查询所有的课程数据
	 * @param: @param pn 当前页
	 * @param: @param pageSize 每页显示
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/getCoursePage")
	@ResponseBody
	public Msg getPages(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<Courses> list = courseService.findAll();
		PageInfo<Courses> pageInfo = new PageInfo<Courses>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	
	/**
	 * @throws UnsupportedEncodingException
	 * @Title: findAllCoursesByCourseName
	 * @Description: 根据课程名查询课程
	 * @param: @param CoursesName
	 * @param: @return
	 * @return: List<Courses>
	 * @throws
	 */
	@RequestMapping(value = "/findAllCoursesByCourseName")
	@ResponseBody
	public Msg findAllCoursesByCourseNameOrTeacher(
			String CoursesName,
			String teacher,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws UnsupportedEncodingException {
		PageHelper.startPage(pn, pageSize);
		List<Courses> list = null;
		if ((CoursesName != null && !CoursesName.equals(""))
				&& (teacher != null && !teacher.equals(""))) {
			list = courseService.findAllCourseByCoursesAndTeacher(new String(
					CoursesName.getBytes("iso-8859-1"), "utf-8"), new String(
					teacher.getBytes("iso-8859-1"), "utf-8"));
		} else {
			list = courseService.findAllCourseByCoursesOrTeacher(new String(
					CoursesName.getBytes("iso-8859-1"), "utf-8"), new String(
					teacher.getBytes("iso-8859-1"), "utf-8"));
		}

		PageInfo<Courses> pageInfo = new PageInfo<Courses>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到相关数据");
		}
		return Msg.success().add("pageInfo", pageInfo);

	}
	
	@RequestMapping(value = "/coursemanager")
	public String intoCourse(){
		return "oldback/educationManage/coursemanager";
	}
	
	@RequestMapping(value = "/addcourse")
	public String intocoursemanager(){
		return "oldback/educationManage/addcourse";
	}
}
