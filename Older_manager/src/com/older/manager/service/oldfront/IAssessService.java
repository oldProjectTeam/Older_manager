package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Assess;

public interface IAssessService {

	/**
	 * 查询评估
	 * @param oldManId
	 * @return
	 */
	List<Assess> queryAssessByOldManId(Integer oldManId);

}
