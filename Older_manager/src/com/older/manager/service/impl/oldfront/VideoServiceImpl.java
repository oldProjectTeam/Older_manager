package com.older.manager.service.impl.oldfront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Video;
import com.older.manager.mapper.VideoMapper;
import com.older.manager.service.oldfront.IVideoService;

@Service
public class VideoServiceImpl implements IVideoService {

	@Autowired
	private VideoMapper videoMapper;

	@Override
	public boolean updateVideoNum(Video video) {
		boolean flag = false;
		video.setVcount(video.getVcount() + 1);
		videoMapper.updateByPrimaryKey(video);
		flag = true;
		return flag;
	}

}
