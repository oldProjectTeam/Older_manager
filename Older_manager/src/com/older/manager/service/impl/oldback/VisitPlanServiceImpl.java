package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.OldmanExample;
import com.older.manager.bean.Visitplan;
import com.older.manager.bean.VisitplanExample;
import com.older.manager.bean.VisitplanExample.Criteria;
import com.older.manager.mapper.OldmanMapper;
import com.older.manager.mapper.VisitplanMapper;
import com.older.manager.service.oldback.IVisitPlanService;

/**
 * 再次编写：杨明 编写内容：添加查找、修改接口实现
 * 
 */
@Service
public class VisitPlanServiceImpl implements IVisitPlanService {

	@Autowired
	private VisitplanMapper visitplanMapper;

	@Autowired
	private OldmanMapper oldmanMapper;

	@Override
	public List<Visitplan> selectAllOldBackPlan(String str) {
		List<Visitplan> temList = new ArrayList<Visitplan>();
		List<Visitplan> list = null;
		if (str.equals("")) {
			list = visitplanMapper.selectByExample(null);
			for (Visitplan visitplan : list) {
				Oldman oldman = oldmanMapper.selectByPrimaryKey(visitplan
						.getOldmanId());
				visitplan.setOldman(oldman);
				temList.add(visitplan);
			}
			return temList;
		}
		VisitplanExample example = new VisitplanExample();
		Criteria criteria = example.createCriteria();
		List<Integer> oldManIds = new ArrayList<Integer>();

		OldmanExample oldmanExample = new OldmanExample();
		OldmanExample.Criteria oldManCriteria = oldmanExample.createCriteria();
		List<Oldman> oldmans = null;
		if (str.contains("-")) {
			String s[] = str.split("-");

			oldManCriteria.andNameLike(s[0]);
			oldManCriteria.andIdcarLike(s[1]);

		} else {
			String reg = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
			if (str.matches(reg)) {
				oldManCriteria.andIdcarLike(str);
			} else {
				oldManCriteria.andNameLike(str);
			}
		}
		oldmans = oldmanMapper.selectByExample(oldmanExample);
		if (oldmans != null) {
			for (Oldman oldman : oldmans) {
				oldManIds.add(oldman.getId());
			}
		}
		criteria.andOldmanIdIn(oldManIds);
		list = visitplanMapper.selectByExample(example);
		for (Visitplan visitplan : list) {
			Oldman oldman = oldmanMapper.selectByPrimaryKey(visitplan
					.getOldmanId());
			visitplan.setOldman(oldman);
			temList.add(visitplan);
		}
		return temList;
	}

	@Override
	public void deleteBatch(List<Integer> del_ids) {
		VisitplanExample example = new VisitplanExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(del_ids);
		visitplanMapper.deleteByExample(example);
	}

	@Override
	public void deletePlan(Integer id) {
		visitplanMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Visitplan selectVisitPlanById(Integer id) {
		return visitplanMapper.selectByPrimaryKey(id);
	}

	@Override
	public void addVisitPlan(Visitplan visitplan) {
		visitplanMapper.insertSelective(visitplan);
	}

	/**
	 * @Title: findAllVisitplansBySearch
	 * @Description: 通过搜索查找所有的回访计划表
	 * @param: @param visitPeaplo
	 * @param: @param days
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Visitplan> findAllVisitplansBySearch(String visitPeaplo,
			String days) {
		VisitplanExample example = new VisitplanExample();
		if (visitPeaplo != null && !visitPeaplo.equals("")
				&& (days == null || days.equals(""))) {
			example.createCriteria().andRemindpeopleLike(
					"%" + visitPeaplo + "%");
			return visitplanMapper.selectByExample2(example);
		} else if (visitPeaplo == null || visitPeaplo.equals("")
				&& (days != null && !days.equals(""))) {
			int dateLeng = Integer.valueOf(days) * 60 * 60 * 24000;
			long datemix = System.currentTimeMillis() - dateLeng;
			System.out.println(new Date(datemix) + "........");
			example.createCriteria().andVisiplantimeLessThan(new Date(datemix));
			return visitplanMapper.selectByExample2(example);
		} else if ((visitPeaplo != null && !visitPeaplo.equals(""))
				&& (days != null && !days.equals(""))) {
			int dateLeng = Integer.valueOf(days) * 60 * 60 * 24000;
			long datemix = System.currentTimeMillis() - dateLeng;
			System.out.println(new Date(datemix) + "........");
			example.createCriteria().andVisiplantimeLessThan(new Date(datemix))
					.andRemindpeopleLike("%" + visitPeaplo + "%");
			return visitplanMapper.selectByExample2(example);
		}
		return null;
	}

	/**
	 * @Title: findAllVisitplans
	 * @Description: 查询所有的回访计划表
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Visitplan> findAllVisitplans() {
		return visitplanMapper.selectByExample2(null);
	}

	/**
	 * @Title:   modifyVisitPlan
	 * @Description:  修改回访计划
	 * @param:    @param visitplan
	 * @param:    @return     
	 * @throws
	 */
	@Override
	public int modifyVisitPlan(Visitplan visitplan) {
		return visitplanMapper.updateByPrimaryKeySelective(visitplan);
	}
}
