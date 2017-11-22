package com.older.manager.controller.oldfront;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldfront.IOldmanaccountService;
import com.older.manager.utils.MD5;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/oldmanaccount")
public class OldmanAccountController {

	@Autowired
	IOldmanaccountService oldmanaccountService;
	
	@RequestMapping("/olderLogin")
	public ModelAndView oldManLogin(String account,String password,ModelAndView model,
			HttpServletRequest request)throws Exception{
		String msg="";
		model.setViewName("/oldfront/older/person/login");
		//清空提示信息
		request.removeAttribute("msg");
		if(!Pattern.matches("1[34578]\\d{9}",account)){
			msg="用户名不合法！";
			request.setAttribute("msg", msg);
		}else if(!Pattern.matches("[a-zA-Z\\.\\d]{6,30}",password)){
			msg="密码不符合规范";
			request.setAttribute("msg", msg);
		}else{
			Oldmanaccount older=oldmanaccountService.olderLogin(account, password);
			if(older!=null){
				model.setViewName("/oldfront/older/person/older");
				request.getSession().setAttribute("older", older);
			}else{
				msg="用户名或密码错误！";
				request.setAttribute("msg", msg);
			}
		}
		return model;
	}
	
	@RequestMapping("/person")
	public String person(){
		return "oldfront/older/person/older";
	}
	
	/**
	 * 修改密码
	 * @param older：id、password
	 * @param newPassword:新密码
	 * @param confirmPassword：确认密码
	 * @param code :验证码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/notifyPassword")
	@ResponseBody
	public Msg notifyPassword(Oldmanaccount older,String newPassword,
			String confirmPassword,String code,HttpServletRequest request) throws Exception{
		if("".equals(code)){
			return Msg.fail().add("error", "验证码不能为空!");
		}
		//获取验证码
		String validateCode=(String) request.getSession().getAttribute("validateCode");
		if(!validateCode.equals(code)){
			return Msg.fail().add("error", "验证码不正确!");
		}
		if(!Pattern.matches("[\\d]+", older.getId()+"")){
			return Msg.fail().add("error", "获取不到老人!");
		}
		if(!Pattern.matches("[a-zA-Z\\.\\d]{6,30}",older.getPassword()+"")||
				!Pattern.matches("[a-zA-Z\\.\\d]{6,30}",newPassword+"")||
				!Pattern.matches("[a-zA-Z\\.\\d]{6,30}",confirmPassword+"")
				){
			return Msg.fail().add("error", "密码不符合规范!");
		}
		if(!newPassword.equals(confirmPassword)){
			return Msg.fail().add("error", "两次输入密码不一致!");
		}
		
		 
		Oldmanaccount oldmanaccount=oldmanaccountService.getOldmanaccount(older.getId());
		older.setPassword(new MD5().getMD5ofStr(older.getPassword()));
		if(!older.getPassword().equals(oldmanaccount.getPassword())){
			return Msg.fail().add("error", "原始密码不正确！");
		}
		//加密
		older.setPassword(new MD5().getMD5ofStr(newPassword));
		oldmanaccountService.updateAccount(older);
		return Msg.success();
	}
	/**
	 * 退出系统
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loginOut")
	public ModelAndView loginOut(ModelAndView model,HttpServletRequest request)throws Exception{
		model.setViewName("/oldfront/older/person/login");
		request.getSession().removeAttribute("older");
		return model;
	}
}
