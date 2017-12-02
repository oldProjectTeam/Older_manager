package com.older.manager.service.oldfront;

import com.older.manager.bean.Video;

public interface IVideoService {

	/**
	 * 更新播放量
	 * 
	 * @param video
	 * @return
	 */
	boolean updateVideoNum(Video video);

}
