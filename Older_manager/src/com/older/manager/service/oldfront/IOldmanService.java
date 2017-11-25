package com.older.manager.service.oldfront;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;

public interface IOldmanService {

	/**
	 * 更新老人数据
	 * 
	 * @param oldman
	 * @throws Exception
	 */
	public void notifyOlder(Oldman oldman) throws Exception;

	/**
	 * 获取老人信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Oldman getOldman(Integer id) throws Exception;

	/**
	 * @Title: modifyOldman
	 * @Description: 返回int的老人数据更新方法
	 * @param @param oldman
	 * @param @return
	 * @return int
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午1:18:10
	 */
	public int modifyOldman(Oldman oldman);

	/**
	 * @Title: findDetailOldmanById
	 * @Description: 查询包括爱好特长的老人的详细信息
	 * @param @param id
	 * @param @return
	 * @return Oldman
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午10:30:45
	 */
	public Oldman findDetailOldmanById(Integer id);

	/**
	 * @Title: findOldmanaccountByOldmanId
	 * @Description: 通过老人id查询老人的账户信息
	 * @param @param oldmanId
	 * @param @return
	 * @return Oldmanaccount
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 下午7:46:01
	 */
	public Oldmanaccount findOldmanaccountByOldmanId(Integer oldmanId);

	/**
	 * @Title: modifyOldmanAccount
	 * @Description: 更新老人账户信息
	 * @param @param oldmanaccount
	 * @param @return
	 * @return int
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 下午7:57:05
	 */
	public int modifyOldmanAccount(Oldmanaccount oldmanaccount);
}
