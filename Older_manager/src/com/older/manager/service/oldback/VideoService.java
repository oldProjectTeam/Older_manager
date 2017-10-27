package com.older.manager.service.oldback;


import java.util.List;

import com.older.manager.bean.Video;

public interface VideoService {

//	通过id查询
	     //返回类型                           //传入类型
	public Video findById(int id);
	
//  插入
	public int insertVideo(Video video);
	
//	通过id删除
	public int deleteById(int id);
	
//	修改
	public int updateVideo(Video video);
	
//	查询全部
	public List<Video> findAll();
}
