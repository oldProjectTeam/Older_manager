package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Assess;
import com.older.manager.bean.AssessExample;
import com.older.manager.bean.AssessExample.Criteria;
import com.older.manager.mapper.AssessMapper;
import com.older.manager.service.oldfront.IAssessService;

@Service
public class AssessServiceImpl implements IAssessService {

	@Autowired
	private AssessMapper assessMapper;

	@Override
	public List<Assess> queryAssessByOldManId(Integer oldManId) {
		AssessExample example = new AssessExample();
		Criteria criteria = example.createCriteria();
		criteria.andOldmanIdEqualTo(oldManId);
		return assessMapper.selectByExample(example);
	}

}
