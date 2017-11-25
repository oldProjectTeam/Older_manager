package com.older.manager.mapper;

import com.older.manager.bean.Special;
import com.older.manager.bean.SpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialMapper {
	int countByExample(SpecialExample example);

	int deleteByExample(SpecialExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Special record);

	int insertSelective(Special record);

	List<Special> selectByExample(SpecialExample example);

	Special selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Special record,
			@Param("example") SpecialExample example);

	int updateByExample(@Param("record") Special record,
			@Param("example") SpecialExample example);

	int updateByPrimaryKeySelective(Special record);

	int updateByPrimaryKey(Special record);

	/**
	 * @Title: selectSpecialByOldmanId
	 * @Description: 根据老人id查询特长表
	 * @param @param id
	 * @param @return
	 * @return Special
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午10:42:11
	 */
	Special selectSpecialByOldmanId(Integer id);
}