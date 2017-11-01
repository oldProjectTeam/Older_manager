package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.SystemLog;

public interface ISystemLogService {

	/**
	 * 系统日志
	 * @return
	 */
	List<SystemLog> getAllSystemLogList(String str);

	/**
	 * 批量删除
	 * @param del_ids
	 */
	void deleteBatch(List<Integer> del_ids);

	/**
	 * 删除单个
	 * @param id
	 */
	void deleteLog(Integer id);

}
