package com.older.manager.service.shopfront;

import org.aspectj.weaver.ast.And;

import com.older.manager.bean.Questionandanswer;
import com.older.manager.bean.Users;

/**
 * 安全设置
 * @author 疯癫
 *
 */
public interface SafetyService {
    /**
     * 通过id查
     * @param id
     * @return
     */
	public Users selectUserByid(Integer id);
	/**
	 * 更新密码
	 * @param users
	 */
	public void updateUser(Users users);
	/**
	 * 增加问题
	 * @param questionandanswer
	 */
	public void addQuestion(Questionandanswer questionandanswer);
	
	/**
	 * 查看存不存
	 * @return
	 */
	public boolean selectQuestion(Integer userid);
	/**
	 * 更新
	 * @param questionandanswer
	 */
	public void updateQuestion(Questionandanswer questionandanswer);
}
