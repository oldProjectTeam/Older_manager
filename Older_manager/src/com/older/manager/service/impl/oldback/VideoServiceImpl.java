package com.older.manager.service.impl.oldback;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Video;
import com.older.manager.mapper.VideoMapper;
import com.older.manager.service.oldback.VideoService;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	@Qualifier("videoMapper")
	private VideoMapper videoMapper;

	/**
	 * @Title:   findById
	 * @Description:  通过id查询
	 * @param:    @param id
	 * @param:    @return   
	 * @throws
	 */
	@Override
	public Video findById(int id) {
		// TODO Auto-generated method stub
		return videoMapper.selectByPrimaryKey(id);
	}
	/**
	 * @Title:   insertVideo
	 * @Description:  插入
	 * @param:    @param video
	 * @param:    @return   
	 * @throws
	 */
	@Override
	public int insertVideo(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.insertSelective(video);
	}
	/**
	 * @Title:   deleteById
	 * @Description:  通过id删除
	 * @param:    @param id   
	 * @throws
	 */
	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return videoMapper.deleteByPrimaryKey(id);
	}
	/**
	 * @Title:        updateVideo
	 * @Description:  修改
	 * @param:        @param video
	 * @param:        @return   
	 * @throws
	 */
	@Override
	public int updateVideo(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.updateByPrimaryKeySelective(video);
	}
	/**
	 * @Title:        findAll
	 * @Description:  查询全部
	 * @param:        @return   
	 * @throws
	 */
	@Override
	public List<Video> findAll() {
		// TODO Auto-generated method stub
		return videoMapper.selectByExample(null);
	}

	

	
}
