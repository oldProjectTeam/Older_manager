package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.SystemLog;
import com.older.manager.bean.SystemLogExample;
import com.older.manager.bean.SystemLogExample.Criteria;
import com.older.manager.mapper.SystemLogMapper;
import com.older.manager.service.oldback.ISystemLogService;

@Service
public class SystemLogServiceImpl implements ISystemLogService {

	@Autowired
	private SystemLogMapper systemLogMapper;

	/**
	 * 系统日志
	 */
	@Override
	public List<SystemLog> getAllSystemLogList(String str) {
		List<SystemLog> systemLogs = null;
		if (str.equals("")) {
			systemLogs = systemLogMapper.selectByExample(null);
		} else {
			SystemLogExample example = new SystemLogExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(str);
			systemLogs = systemLogMapper.selectByExample(example);
		}
		return systemLogs;
	}

}
