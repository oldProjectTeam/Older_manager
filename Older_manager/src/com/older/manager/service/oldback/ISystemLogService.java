package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.SystemLog;

public interface ISystemLogService {

	/**
	 * 系统日志
	 * @return
	 */
	List<SystemLog> getAllSystemLogList(String str);

}
