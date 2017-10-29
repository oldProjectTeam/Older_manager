package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Video;

/**
 * @author 修改：杨明 修改时间：2017/10/27 再次编写：杨明 编写时间：2017/10/29 编写内容：添加方法
 */
public interface VideoService {

	/**
	 * @Title: findById
	 * @Description: 根据id查询视频
	 * @param: @param id
	 * @param: @return
	 * @return: Video
	 * @throws
	 */
	public Video findById(int id);

	/**
	 * @Title: insertVideo
	 * @Description: 插入视频
	 * @param: @param video
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int insertVideo(Video video);

	/**
	 * @Title: deleteById
	 * @Description: 根据id查询视频
	 * @param: @param id
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int deleteById(int id);

	/**
	 * @Title: updateVideo
	 * @Description: 更新视频信息
	 * @param: @param video
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public int updateVideo(Video video);

	/**
	 * @Title: findAll
	 * @Description: 查询所有视频信息
	 * @param: @return
	 * @return: List<Video>
	 * @throws
	 */
	public List<Video> findAll();
	
	
	/**
	 * @Title:   findAllByCount
	 * @Description:  通过观看量查询视频信息
	 * @param:    @param vcount
	 * @param:    @return   
	 * @return:   List<Video>   
	 * @throws
	 */
	public List<Video> findAllByCount(Integer vcount);
	
	/**
	 * @Title:   findAllVideoByVCount
	 * @Description:  通过播放量来查询视频
	 * @param:    @param vcount
	 * @param:    @return   
	 * @return:   List<Video>   
	 * @throws
	 */
	public List<Video> findAllVideoByVCount(Integer vcount);

	/**
	 * @Title: findAllVideoByNameAndVCount
	 * @Description: 通过视频名字和播放量来查询视频
	 * @param: @param title
	 * @param: @param vcount
	 * @param: @return
	 * @return: List<Video>
	 * @throws
	 */
	public List<Video> findAllVideoByNameAndVCount(String title, Integer vcount);

	/**
	 * @Title: findAllVideoByCreatorsAndVCount
	 * @Description: 通过视频发布者和播放量来查询视频
	 * @param: @param creators
	 * @param: @param vcount
	 * @param: @return
	 * @return: List<Video>
	 * @throws
	 */
	public List<Video> findAllVideoByCreatorsAndVCount(String creators,
			Integer vcount);

	/**
	 * @Title: findAllVideoByCreatorsAndNameAndVCount
	 * @Description: 通过视频名和发布者和播放量来进行查询视频
	 * @param: @param title
	 * @param: @param creators
	 * @param: @param vcount
	 * @param: @return
	 * @return: List<Video>
	 * @throws
	 */
	public List<Video> findAllVideoByCreatorsAndNameAndVCount(String title,
			String creators, Integer vcount);

}
