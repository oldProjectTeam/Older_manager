package com.older.manager.service.shopfront;

import java.util.List;

import com.older.manager.bean.Pedetails;
import com.older.manager.bean.Peinfo;

public interface IPeInfoService {
	//查询体检信息
	List<Peinfo> queryPeinfos(int userId);
	//根据id查询
	Peinfo queryByID(Integer id);
	//根据id删除信息
	void deleteByID(int id);
	//增加数据
	int insertPeinfo(Peinfo peinfo);
	//模糊查询信息
	List<Peinfo> selectPeinfoByHospital(Peinfo peinfo);
	//修改信息
	Integer updatePeinfos(Peinfo peinfo);

}
