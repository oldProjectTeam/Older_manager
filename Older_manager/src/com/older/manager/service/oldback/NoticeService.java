/**
 * 
 */
package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Notice;

/**
 * @author ym
 *
 */
public interface NoticeService {

	/**
	 * @Title:   findNoticeById
	 * @Description:  通过id查询通知
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Notice   
	 * @throws
	 */
	public Notice findNoticeById(int id);
	
	/**
	 * @Title:   findAllNotices
	 * @Description:  查询所有的通知
	 * @param:    @return   
	 * @return:   List<Notice>   
	 * @throws
	 */
	public List<Notice> findAllNotices();
	
	/**
	 * @Title:   findAllNoticesBySearch
	 * @Description:  通过搜索来查询所有的通知
	 * @param:    @param title
	 * @param:    @param releasePeople
	 * @param:    @return   
	 * @return:   List<Notice>   
	 * @throws
	 */
	public List<Notice> findAllNoticesBySearch(String title,String releasePeople);
	
	
	/**
	 * @Title:   AddNotice
	 * @Description:  添加通知
	 * @param:    @param notice
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int AddNotice(Notice notice);
	
	/**
	 * @Title:   updateNotice
	 * @Description:  更改通知
	 * @param:    @param notice
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int updateNotice(Notice notice);
	
	/**
	 * @Title:   delectNoticeById
	 * @Description:  通过id删除通知
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int delectNoticeById(int id);
	
	
	
}
