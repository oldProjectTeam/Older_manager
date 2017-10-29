package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Video;
import com.older.manager.bean.VideoExample;
import com.older.manager.mapper.VideoMapper;
import com.older.manager.service.oldback.VideoService;

/**
 * @author 修改：杨明 修改时间：2017/10/27 再次编写：杨明 编写时间：2017/10/29 编写内容：添加方法
 */
@Service
public class VideoServiceImpl implements VideoService {
	
	private VideoExample example;
	
	@Autowired
	@Qualifier("videoMapper")
	private VideoMapper videoMapper;

	/**
	 * @Title: findById
	 * @Description: 通过id查询视频
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Video findById(int id) {
		// TODO Auto-generated method stub
		return videoMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title: insertVideo
	 * @Description: 插入视频
	 * @param: @param video
	 * @param: @return
	 * @throws
	 */
	@Override
	public int insertVideo(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.insertSelective(video);
	}

	/**
	 * @Title: deleteById
	 * @Description: 通过id删除
	 * @param: @param id
	 * @throws
	 */
	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return videoMapper.deleteByPrimaryKey(id);
	}

	/**
	 * @Title: updateVideo
	 * @Description: 修改视频
	 * @param: @param video
	 * @param: @return
	 * @throws
	 */
	@Override
	public int updateVideo(Video video) {
		// TODO Auto-generated method stub
		return videoMapper.updateByPrimaryKeySelective(video);
	}

	
	/**
	 * @Title:   findAll
	 * @Description:  查询所有的视频
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Video> findAll() {
		return videoMapper.selectByExample(null);
	}

	/**
	 * @Title:   findAllVideoByVCount
	 * @Description:  通过播放量来查询视频
	 * @param:    @param vcount
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Video> findAllVideoByVCount(Integer vcount) {
		// TODO Auto-generated method stub
		example=new VideoExample();
		example.createCriteria().andVcountGreaterThan(vcount);
		return videoMapper.selectByExample(example);
	}
	
	
	/**
	 * @Title:   findAllVideoByNameAndVCount
	 * @Description:  通过视频名和播放量来查询视频
	 * @param:    @param title
	 * @param:    @param vcount
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Video> findAllVideoByNameAndVCount(String title, Integer vcount) {
		// TODO Auto-generated method stub
		example=new VideoExample();
		example.createCriteria().andTitleLike("%"+title+"%").andVcountGreaterThan(vcount);
		return videoMapper.selectByExample(example);
	}

	/**
	 * @Title:   findAllVideoByCreatorsAndVCount
	 * @Description:  通过视频发布者和播放量来查询视频
	 * @param:    @param creators
	 * @param:    @param vcount
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Video> findAllVideoByCreatorsAndVCount(String creators,
			Integer vcount) {
		example=new VideoExample();
		example.createCriteria().andCreatorsLike("%"+creators+"%").andVcountGreaterThan(vcount);
		return videoMapper.selectByExample(example);
		
	}

	/**
	 * @Title:   findAllVideoByCreatorsAndNameAndVCount
	 * @Description:  通过视频名和发布者和播放量来查询视频
	 * @param:    @param title
	 * @param:    @param creators
	 * @param:    @param vcount
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Video> findAllVideoByCreatorsAndNameAndVCount(String title,
			String creators, Integer vcount) {
		example=new VideoExample();
		example.createCriteria().andTitleLike("%"+title+"%").andCreatorsLike("%"+creators+"%").andVcountGreaterThan(vcount);
		return videoMapper.selectByExample(example);
	}

	/**
	 * @Title:   findAllByCount
	 * @Description:  通过观看量查看
	 * @param:    @param vcount
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public List<Video> findAllByCount(Integer vcount) {
		// TODO Auto-generated method stub
		example=new VideoExample();
		example.createCriteria().andVcountGreaterThan(vcount);
		return videoMapper.selectByExample(example);
	}

	

}
