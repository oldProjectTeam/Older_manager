package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Notice;

public interface NoticeService {

	/**
	 * 查询所有公告
	 * @param notice
	 * @return
	 * @throws Exception
	 */
	public List<Notice>findAll(Notice notice)throws Exception;
	
	/**
	 * 获得公告
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Notice findNotice(Integer id)throws Exception;
	
	/**
	 * 获得公告总数
	 * @return
	 * @throws Exception
	 */
	public Integer getCount()throws Exception;
	
}
