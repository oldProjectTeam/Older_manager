package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Notice;
import com.older.manager.bean.NoticeExample;
import com.older.manager.mapper.NoticeMapper;
import com.older.manager.service.oldfront.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeMapper noticeMapper;
	@Override
	public List<Notice> findAll(Notice notice) throws Exception {
		NoticeExample example=new NoticeExample();
		NoticeExample.Criteria criteria=example.createCriteria();
	    if(notice!=null){
	    	if(notice.getTime1()!=null&&notice.getTime2()!=null){
	    		criteria.andTimeBetween(notice.getTime1(), notice.getTime2());
	    	}
	    }
		return noticeMapper.selectByExample(example);
	}

	@Override
	public Notice findNotice(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer getCount() throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.countByExample(null);
	}

}
