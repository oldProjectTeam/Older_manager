/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Notice;
import com.older.manager.bean.NoticeExample;
import com.older.manager.mapper.NoticeMapper;
import com.older.manager.service.oldback.NoticeService;

/**
 * @author ym
 * 
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeMapper noticeMapper;

	/**
	 * @Title: findNoticeById
	 * @Description: 通过id查询通知
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Notice findNoticeById(int id) {
		// TODO Auto-generated method stub
		return noticeMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title: findAllNotices
	 * @Description: 查询所有的通知
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Notice> findAllNotices() {
		// TODO Auto-generated method stub
		return noticeMapper.selectByExample(null);
	}

	/**
	 * @Title: findAllNoticesBySearch
	 * @Description: 通过搜索信息查询所有的通知
	 * @param: @param title
	 * @param: @param releasePeople
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Notice> findAllNoticesBySearch(String title,
			String releasePeople) {
		// TODO Auto-generated method stub
		NoticeExample example = new NoticeExample();
		if (title != null && !title.equals("")
				&& (releasePeople == null || releasePeople.equals(""))) {
			System.out.println("。。。。。。。。。。进入1");
			example.createCriteria().andTitleLike("%" + title + "%");
			return noticeMapper.selectByExample(example);
		} else if ((title == null || title.equals(""))
				&& !releasePeople.equals("") && releasePeople != null) {
			example.createCriteria().andReleasepeopleLike(
					"%" + releasePeople + "%");
			return noticeMapper.selectByExample(example);
		} else if (title != null && !title.equals("") && releasePeople != null
				&& !releasePeople.equals("")) {
			example.createCriteria().andTitleLike("%" + title + "%")
					.andReleasepeopleLike("%" + releasePeople + "%");
			return noticeMapper.selectByExample(example);
		} else {
			return null;
		}

	}

	/**
	 * @Title: AddNotice
	 * @Description: 增加一个通知
	 * @param: @param notice
	 * @param: @return
	 * @throws
	 */
	@Override
	public int AddNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.insertSelective(notice);
	}

	/**
	 * @Title: updateNotice
	 * @Description: 更新通知
	 * @param: @param notice
	 * @param: @return
	 * @throws
	 */
	@Override
	public int updateNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.updateByPrimaryKeySelective(notice);
	}

	/**
	 * @Title: delectNoticeById
	 * @Description: 通过id删除通知
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public int delectNoticeById(int id) {
		// TODO Auto-generated method stub
		return noticeMapper.deleteByPrimaryKey(id);
	}

}
