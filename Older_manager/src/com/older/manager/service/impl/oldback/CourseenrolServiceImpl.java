package com.older.manager.service.impl.oldback;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.CourseenrolExample;
import com.older.manager.mapper.CourseenrolMapper;
import com.older.manager.service.oldback.ICourseenrolService;
 

@Service
public class CourseenrolServiceImpl implements ICourseenrolService {

	@Autowired
	CourseenrolMapper courseenrolMapper;
	@Override
	public List<Courseenrol> queryAllCourseenrolByExample(
			CourseenrolExample example) {
		return courseenrolMapper.selectByExampleAndCourseOldMan(example);
	}
	@Override
	public Courseenrol queryCourseenrolById(Integer id) {
		Courseenrol courseenrol=new Courseenrol();
		courseenrol.setId(id);
		courseenrol=courseenrolMapper.selectCourseenrolCourseOldManByCondition(courseenrol).get(0);
		if(courseenrol!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			courseenrol.setTimeStr(sdf.format(courseenrol.getEnroltime()));
			return courseenrol;
		}
		return null;
	}
	@Override
	public List<Courseenrol> selectCourseenrolCourseOldManByCondition(
			Courseenrol courseenrol) {
		
		return courseenrolMapper.selectCourseenrolCourseOldManByCondition(courseenrol);
	}
	@Override
	public void updateCourseerolByPrimaryKey(Courseenrol courseenrol) {
		// TODO Auto-generated method stub
		courseenrolMapper.updateByPrimaryKeySelective(courseenrol);
	}
	@Override
	public void deleteCourseerolByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		courseenrolMapper.deleteByPrimaryKey(id);
	}
	@Override
	public void deleteBatch(List<Integer> del_ids) {
		// TODO Auto-generated method stub
		CourseenrolExample example=new CourseenrolExample();
		CourseenrolExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(del_ids);
		courseenrolMapper.deleteByExample(example);
	}
	@Override
	public Courseenrol selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return courseenrolMapper.selectByPrimaryKey(id);
	}

}
