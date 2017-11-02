package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Medicalrecord;

/**
 * 就诊记录
 * @author 疯癫
 *
 */
public interface HealthRecordService {
    /**
     * 增加就诊记录
     * @param medicalrecord
     */
	public void addHealthRecord(Medicalrecord medicalrecord);
	/**
	 * 删除就诊记录
	 * @param id
	 */
	public  void deleteHealthRecord(Integer id);
	/**
	 * 修改就诊记录
	 * @param medicalrecord
	 */
	public  void updateHealthRecord(Medicalrecord medicalrecord);
	/**
	 * 通过id来查
	 * @param id
	 * @return
	 */
	public Medicalrecord selectHealthRecordById(Integer id);
	/**
	 * 查询全部
	 * @return
	 */
    public List<Medicalrecord> selectAllHealthRecord(Medicalrecord medicalrecord);
    
	/**
	 * 批量删除
	 * @param ids
	 */
    public void deleteBatch(List<Integer> ids);
	
}
