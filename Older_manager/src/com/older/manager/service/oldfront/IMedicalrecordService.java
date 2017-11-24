package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Medicalrecord;



public interface IMedicalrecordService {

	/**
	 * 查询所有老人就诊信息
	 * @param oldmanId：必须参数
	 * @return
	 * @throws Exception
	 */
	public List<Medicalrecord>findAll(Medicalrecord medicalrecord)throws Exception;
	
	/**
	 * 添加就诊信息
	 * @param medicalrecord
	 * @throws Exception
	 */
	public void insertMedicalrecord(Medicalrecord medicalrecord)throws Exception;
	
	/**
	 * 修改就诊信息
	 * @param medicalrecord
	 * @throws Exception
	 */
	public void updateMedicalrecord(Medicalrecord medicalrecord)throws Exception;
	
	/**
	 * 根据id获取就诊信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Medicalrecord findMedicalrecord(Integer id)throws Exception;
	
	/**
	 * 删除就诊信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteMedicalrecord(Integer id)throws Exception;
}
