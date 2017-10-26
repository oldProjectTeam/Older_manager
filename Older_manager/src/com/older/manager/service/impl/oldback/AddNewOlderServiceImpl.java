package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.OldmanExample;
import com.older.manager.bean.OldmanExample.Criteria;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.utils.ReadExcel;

/**
 * 新增老人的实现
 * @author 疯癫
 *
 */

@Service
public class AddNewOlderServiceImpl implements AddNewOlderService{
	
	@Autowired
	private OldmanMapper oldmanMapper;
 
	
	
	 /**
	  * 增加老人
	  */
	@Override
	public void addNewOlder(Oldman oldman) {
		
		oldmanMapper.insertSelective(oldman);
	}

	
	/**
	 * 删除老人
	 */
	@Override
	public void deleteOlder(Integer id) {
		oldmanMapper.deleteByPrimaryKey(id);
		
	}
	
     /**
      * 更新老人
      */
	@Override
	public void updateOlder(Oldman oldman) {
		oldmanMapper.updateByPrimaryKeySelective(oldman);
		
	}
	
   /**
    * 查看老人
    */

	@SuppressWarnings("unchecked")
	@Override
	public Oldman selectOlder(Integer id) {
		return  oldmanMapper.selectByPrimaryKey(id);
	}

    /**
     * 查看所有老人
     */
	@Override
	public List<Oldman> selectAllOlder() {
		
		return oldmanMapper.selectByExample(null);
	}

    /**
     * 模糊查看所有老人
     */
	@Override
	public List<Oldman> selectAllOlderWith(String str) {
		List<Oldman> list=null;
		OldmanExample example;
		if (str.isEmpty()==false){
			 example=new OldmanExample();
			 Criteria criteria1=example.createCriteria();
			 criteria1.andNameLike("%"+str+"%");
			 list=oldmanMapper.selectByExample(example);
			 if (list.size()==0) {
				 example=new OldmanExample();
				 Criteria criteria2=example.createCriteria();
				 criteria2.andSexLike("%"+str+"%");
				 list=oldmanMapper.selectByExample(example);
				 
				 if (list.size()==0) {
					 example=new OldmanExample();
					 Criteria criteria3=example.createCriteria();
					 criteria3.andPhoneLike("%"+str+"%");
					 list=oldmanMapper.selectByExample(example);
					 if (list.size()==0) {
						 example=new OldmanExample();
						 Criteria criteria4=example.createCriteria();
						 criteria4.andIdcarLike("%"+str+"%");
						 list=oldmanMapper.selectByExample(example);
					}
				}
			}
			
		}else {
			list=oldmanMapper.selectByExample(null);
		}
		
		return list;
	}

	/**
	 * 批量导入客户
	 */
	@Override
	public boolean batchImport(String name, MultipartFile file) {
		boolean b = false;
		// 创建处理EXCEL
		ReadExcel readExcel = new ReadExcel();
		// 解析excel，获取客户信息集合。
		List<Oldman> oldmans = readExcel.getExcelInfo(name, file);
		if (oldmans != null) {
			b = true;
		}
		// 迭代添加客户信息（注：实际上这里也可以直接将List集合作为参数，在Mybatis的相应映射文件中使用foreach标签进行批量添加。）
		for (Oldman oldman : oldmans) {
			oldmanMapper.insertSelective(oldman);
		}
		return b;
	}

	
	
}
