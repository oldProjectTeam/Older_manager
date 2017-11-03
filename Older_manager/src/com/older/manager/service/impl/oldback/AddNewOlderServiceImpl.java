package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.OldmanExample;
import com.older.manager.bean.OldmanExample.Criteria;
import com.older.manager.bean.RelativesExample;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.mapper.RelativesMapper;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.utils.ReadExcel;

/**
 * 新增老人的实现
 * 
 * @author 疯癫
 * 
 */

@Service
public class AddNewOlderServiceImpl implements AddNewOlderService {

	@Autowired
	private OldmanMapper oldmanMapper;

	@Autowired
	private RelativesMapper relativesMapper;

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

		RelativesExample example = new RelativesExample();
		com.older.manager.bean.RelativesExample.Criteria criteria = example
				.createCriteria();
		criteria.andOldmanIdEqualTo(id);
		relativesMapper.deleteByExample(example);

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

	@Override
	public Oldman selectOlder(Integer id) {
		return oldmanMapper.selectByPrimaryKey(id);
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
		OldmanExample example = new OldmanExample();
		Criteria criteria = example.createCriteria();

		if (str.equals("")) {

			return oldmanMapper.selectByExample(null);
		} else {

			String namezz = "^[\\u4e00-\\u9fa5]{1,}$";
			String idcarzz = "^(5[0-9]*$)";
			String phonezz = "^(1[358][0-9]*$)";
			;

			/*
			 * StringTokenizer token = new StringTokenizer(str, "+");
			 * List<String> list2 = new ArrayList<String>();
			 */
			String s[] = str.split("-");

			/*
			 * while (token.hasMoreTokens()) { list2.add(token.nextToken());//
			 * 将分割开的子字符串放入数组中 }
			 */

			for (String string : s) {
				if ((string.equals("男") || string.equals("女"))
						&& string.length() == 1) {

					criteria.andSexLike(("%" + string + "%"));

					continue;
				}
				if (string.matches(namezz)
						&& !(string.equals("男") && string.equals("女"))) {
					criteria.andNameLike(("%" + string + "%"));

					continue;
				}

				if (string.matches(idcarzz)) {
					criteria.andIdcarLike(("%" + string + "%"));
					continue;
				}

				if (string.matches(phonezz)) {
					criteria.andPhoneLike(("%" + string + "%"));
					continue;
				}

			}

			return oldmanMapper.selectByExample(example);

		}

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
			// 迭代添加客户信息（注：实际上这里也可以直接将List集合作为参数，在Mybatis的相应映射文件中使用foreach标签进行批量添加。）
			for (Oldman oldman : oldmans) {
				oldmanMapper.insertSelective(oldman);
			}
		} else {
			b = false;
		}
		return b;
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void deleteBatch(List<Integer> ids) {

		for (Integer integer : ids) {
			RelativesExample example = new RelativesExample();
			com.older.manager.bean.RelativesExample.Criteria criteria = example
					.createCriteria();
			criteria.andOldmanIdEqualTo(integer);
			relativesMapper.deleteByExample(example);
		}

		OldmanExample example = new OldmanExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		oldmanMapper.deleteByExample(example);

	}

	/**
	 * @Title: findOldManPhone
	 * @Description: TODO
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Oldman> findOldManPhone() {
		// TODO Auto-generated method stub
		return oldmanMapper.selectAllPhone();
	}

}
