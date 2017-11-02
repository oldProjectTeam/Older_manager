package com.older.manager.mapper;

import com.older.manager.bean.Medicalrecord;
import com.older.manager.bean.MedicalrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalrecordMapper {
    int countByExample(MedicalrecordExample example);

    int deleteByExample(MedicalrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    List<Medicalrecord> selectByExample(MedicalrecordExample example);

    Medicalrecord selectByPrimaryKey(Integer id);

    
    //自己修改的查询还带模糊查询
    List<Medicalrecord> selectByExampleWithOlder(Medicalrecord medicalrecord);
    Medicalrecord selectByPrimaryKeyWithOlder(Integer id);
    
    
    
    int updateByExampleSelective(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByExample(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByPrimaryKeySelective(Medicalrecord record);

    int updateByPrimaryKey(Medicalrecord record);
}