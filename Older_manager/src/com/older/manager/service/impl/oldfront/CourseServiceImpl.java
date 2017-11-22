package com.older.manager.service.impl.oldfront;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Courseenrol;
import com.older.manager.bean.CourseenrolExample;
import com.older.manager.bean.CourseenrolExample.Criteria;
import com.older.manager.mapper.CourseenrolMapper;
import com.older.manager.service.oldfront.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	private CourseenrolMapper courseenrolMapper;

	@Override
	public boolean JoinCourseWithOldMan(Integer courseId, Integer oldManId) {
		boolean flag = false;
		List<Courseenrol> list = this.queryCourseEnrolByCourseIdAndOldManId(
				courseId, oldManId);
		if (list.size() == 0) {
			Courseenrol courseenrol = new Courseenrol();
			courseenrol.setCourseId(courseId);
			courseenrol.setOldmamId(oldManId);
			courseenrol.setEnroltime(new Date());
			courseenrol.setEnrolstate("报名成功");
			courseenrolMapper.insertSelective(courseenrol);
			flag = true;
		}
		return flag;
	}

	/**
	 * 查询是否已经报名
	 * 
	 * @param courseId
	 * @param oldManId
	 * @return
	 */
	private List<Courseenrol> queryCourseEnrolByCourseIdAndOldManId(
			Integer courseId, Integer oldManId) {
		CourseenrolExample example = new CourseenrolExample();
		Criteria criteria = example.createCriteria();
		criteria.andCourseIdEqualTo(courseId);
		criteria.andOldmamIdEqualTo(oldManId);
		return courseenrolMapper.selectByExample(example);
	}

}
