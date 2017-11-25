package com.older.manager.mapper;

import com.older.manager.bean.Questionandanswer;
import com.older.manager.bean.QuestionandanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionandanswerMapper {
    int countByExample(QuestionandanswerExample example);

    int deleteByExample(QuestionandanswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Questionandanswer record);

    int insertSelective(Questionandanswer record);

    List<Questionandanswer> selectByExample(QuestionandanswerExample example);

    Questionandanswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Questionandanswer record, @Param("example") QuestionandanswerExample example);

    int updateByExample(@Param("record") Questionandanswer record, @Param("example") QuestionandanswerExample example);

    int updateByPrimaryKeySelective(Questionandanswer record);

    int updateByPrimaryKey(Questionandanswer record);
}