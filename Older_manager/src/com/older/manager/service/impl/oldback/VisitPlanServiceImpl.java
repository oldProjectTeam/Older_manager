package com.older.manager.service.impl.oldback;

import java.util.ArrayList;
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
}
