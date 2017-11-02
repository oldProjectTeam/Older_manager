package com.older.manager.mapper;

import com.older.manager.bean.Brand;
import com.older.manager.bean.BrandExample;
import com.older.manager.bean.BrandWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandWithBLOBs record);

    int insertSelective(BrandWithBLOBs record);

    List<BrandWithBLOBs> selectByExampleWithBLOBs(BrandExample example);

    List<Brand> selectByExample(BrandExample example);

    BrandWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandWithBLOBs record, @Param("example") BrandExample example);

    int updateByExampleWithBLOBs(@Param("record") BrandWithBLOBs record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(BrandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BrandWithBLOBs record);

    int updateByPrimaryKey(Brand record);
}