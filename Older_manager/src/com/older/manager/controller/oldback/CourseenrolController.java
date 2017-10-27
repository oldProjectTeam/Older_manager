package com.older.manager.controller.oldback;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Flags.Flag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.Courses;
import com.older.manager.bean.Oldman;
 
import com.older.manager.service.oldback.ICourseenrolService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/courseenrol")
public class CourseenrolController {

	@Autowired
	@Qualifier("courseenrolServiceImpl")
	private ICourseenrolService courseenrolService;
	
	/**
	 * 分页查询所有课程报名信息
	 * @param pn
	 * @return
	 */
	@RequestMapping("/queryAllCourseenrol")
	public ModelAndView queryAllCourseenrol(@RequestParam(value="pn",defaultValue="1")Integer pn){
		PageHelper.startPage(pn, 5);
		List<Courseenrol>courseenrols=courseenrolService.queryAllCourseenrolByExample(null);
		PageInfo pageInfo=new PageInfo(courseenrols,5);
		ModelAndView modelAndView=new ModelAndView("/oldback/educationManage/courseEnrol");
		modelAndView.addObject("pageInfo", pageInfo);
		return modelAndView;
	}
	
	/**
	 * 根据课程报名主键查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryCourseenrolById")
	@ResponseBody
	public Msg queryCourseenrolById(@RequestParam(value="id")Integer id){
		Courseenrol courseenrol=courseenrolService.queryCourseenrolById(id);
		return Msg.success().add("courseenrol", courseenrol);
	}
	
	/**
	 * 根据条件（课程报名ID、课程名称、老人姓名）分页查询所有课程报名信息
	 * @param pn
	 * @param courseenrol
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@SuppressWarnings("finally")
	@RequestMapping("searchCourseenrol")
	public ModelAndView searchCourseenrols(@RequestParam(value="pn",defaultValue="1")Integer pn,Courseenrol courseenrol) throws Exception{
		List<Courseenrol>list=new ArrayList<Courseenrol>();
		ModelAndView modelAndView=new ModelAndView("/oldback/educationManage/courseEnrol");
		if(courseenrol==null || courseenrol.getCourses()==null||courseenrol.getOldman()==null){
			courseenrol=new Courseenrol();
			Courses courses=new Courses();
			Oldman oldman=new Oldman();
			courseenrol.setCourses(courses);
			courseenrol.setOldman(oldman);
		}
		if(courseenrol.getCourses().getTitle()!=null){
			String title=courseenrol.getCourses().getTitle();
			courseenrol.getCourses().setTitle(new String(title.getBytes("ISO-8859-1"),"utf-8"));
		}
		if(courseenrol.getOldman().getName()!=null){
			String name=courseenrol.getOldman().getName();
			courseenrol.getOldman().setName(new String(name.getBytes("ISO-8859-1"),"utf-8"));
		}
			PageHelper.startPage(pn, 5);
			list=courseenrolService.selectCourseenrolCourseOldManByCondition(courseenrol);
			PageInfo pageInfo=new PageInfo(list,5);
			modelAndView.addObject("pageInfo", pageInfo);
		 
		return modelAndView;
	}
	/**
	 * 根据课程报名ID有选择更新
	 * @param courseenrol
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/updateCourseenrol")
	@ResponseBody
	public Msg updateCourseenrol(Courseenrol courseenrol){
		boolean flag=false;
		 
		try {
			courseenrolService.updateCourseerolByPrimaryKey(courseenrol);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/deleteCourseenrol/{ids}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteCourseenrol(@PathVariable("ids") String ids){
		boolean flag=false;	
		try {
			if(ids.contains("-")){
				List<Integer>del_ids=new ArrayList<Integer>();
				String str[]=ids.split("-");
				for(String s:str){
					del_ids.add(Integer.parseInt(s));
				}
				courseenrolService.deleteBatch(del_ids);
			}else{
				Integer id=Integer.parseInt(ids);
				courseenrolService.deleteCourseerolByPrimaryKey(id);
			}
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
}
