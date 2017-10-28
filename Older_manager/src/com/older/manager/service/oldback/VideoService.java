package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Video;

/**
 * @author 修改：杨明 修改时间：2017/10/27
 */
public interface VideoService {

	/**
	 * @Title:   findById
	 * @Description:  根据id查询视频
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Video   
	 * @throws
	 */
	public Video findById(int id);

	/**
	 * @Title:   insertVideo
	 * @Description:  插入视频
	 * @param:    @param video
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int insertVideo(Video video);

	/**
	 * @Title:   deleteById
	 * @Description:  根据id查询视频
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int deleteById(int id);

	/**
	 * @Title:   updateVideo
	 * @Description:  更新视频信息
	 * @param:    @param video
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int updateVideo(Video video);

	/**
	 * @Title:   findAll
	 * @Description:  查询所有视频信息
	 * @param:    @return   
	 * @return:   List<Video>   
	 * @throws
	 */
	public List<Video> findAll();
}
