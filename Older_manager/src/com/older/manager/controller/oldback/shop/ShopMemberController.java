/**
 * 
 */
package com.older.manager.controller.oldback.shop;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Integral;
import com.older.manager.bean.ShopMember;
import com.older.manager.bean.User;
import com.older.manager.bean.Users;
import com.older.manager.bean.Visitplan;
import com.older.manager.service.impl.oldback.IntegralServiceImpl;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.service.oldback.IIntegralService;
import com.older.manager.service.oldback.shop.ShopMemberService;
import com.older.manager.service.oldback.shop.UsersService;
import com.older.manager.utils.Msg;

/**
 * @author ym
 * 
 */
@Controller
@RequestMapping("/ShopMember")
public class ShopMemberController {

	@Autowired
	ShopMemberService shopMemberService;

	@Autowired
	UsersService usersService;

	@Autowired
	AddNewOlderService addNewOlderService;

	@Autowired
	IIntegralService iIntegralService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * @Title: findAllShopMemberByPage
	 * @Description: 分页查询所有的电商会员
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllShopMemberByPage")
	@ResponseBody
	public Msg findAllShopMemberByPage(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<ShopMember> list = shopMemberService.findAllShopMembers();
		PageInfo<ShopMember> pageInfo = new PageInfo<ShopMember>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到数据");
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * @Title: deleteShopMemberById
	 * @Description: 通过id删除商城会员
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/deleteShopMemberById")
	@ResponseBody
	public Msg deleteShopMemberById(String id) {
		if (id != null && !id.equals("")) {
			int state = shopMemberService.deleteShopMemberById(Integer
					.valueOf(id));
			if (state != 0) {
				return Msg.success().add("msg", "删除成功！");
			} else {
				return Msg.fail().add("msg", "删除成功！");
			}
		} else {
			return Msg.fail().add("msg", "输入数据出错,删除成功！");
		}
	}

	/**
	 * @Title: delectSmsByListId
	 * @Description: 批量删除商城会员
	 * @param: @param listId
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/delectSmsByListId")
	@ResponseBody
	public Msg delectShopMemberByListId(String listId) {
		System.out.println("listId" + listId);
		String[] idlist = listId.split("-");
		String msg = "";
		for (int i = 0; i < idlist.length; i++) {
			int states = shopMemberService.deleteShopMemberById(Integer
					.valueOf(idlist[i]));
			if (states != 0) {
				msg = msg + idlist[i] + ",";
			}
		}
		return Msg.success().add("msg", "id为：" + msg + "删除成功");

	}

	/**
	 * @Title: addShopMember
	 * @Description: 添加商城会员
	 * @param: @param shopMember
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/addShopMember")
	@ResponseBody
	public Msg addShopMember(@Valid Users users, BindingResult result) {
		ShopMember shopMember = new ShopMember();
		if (users != null) {
			List<Map<String, Object>> errorList = new ArrayList<Map<String, Object>>();
			if (result.hasErrors()) {
				for (FieldError fieldError : result.getFieldErrors()) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("fieldName", fieldError.getField());
					map.put("errorMessage", fieldError.getDefaultMessage());
					errorList.add(map);
					System.out.println("出错的字段名为:------------->"
							+ fieldError.getField());
					System.out.println("出错信息为:---------------->"
							+ fieldError.getDefaultMessage());
				}
				return Msg.fail().add("msg", "添加失败");
			} else {
				int usersId = usersService.addUsers(users);
				int oldmanId = addNewOlderService.findOldManIdByCardId(users
						.getIdcard());
				if (usersId != 0 && oldmanId != 0) {

					// 添加积分表
					Integral integral = new Integral();
					integral.setUsersId(users.getId());
					integral.setOldmanId(oldmanId);
					integral.setCurrentintegral(0);
					integral.setChangetime(new Date());
					integral.setBeforechangeintegral(new Date());
					int integralId = iIntegralService.addIntegral(integral);

					if (integralId != 0) {
						shopMember.setUsersId(users.getId());
						shopMember.setJointime(new Date());
						shopMember.setLevel("普通会员");
						shopMember.setChangetime(new Date());
						shopMember.setIntegralId(integral.getId());

						int shopMemberId = shopMemberService
								.addShopMember(shopMember);
						if (shopMemberId != 0) {
							return Msg.success().add("msg", "添加成功");
						} else {
							return Msg.fail().add("msg", "添加失败！");
						}
					} else {
						return Msg.fail().add("msg", "添加失败！");
					}

				}
			}

		} else {
			return Msg.fail().add("msg", "添加失败！");
		}
		return Msg.fail().add("msg", "添加失败！");

	};

	/**
	 * @Title: modifyShopMember
	 * @Description: 修改会员
	 * @param: @param users
	 * @param: @param result
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/modifyShopMember")
	@ResponseBody
	public Msg modifyShopMember(@Valid Users users, BindingResult result) {
		if (users != null) {
			List<Map<String, Object>> errorList = new ArrayList<Map<String, Object>>();
			if (result.hasErrors()) {
				for (FieldError fieldError : result.getFieldErrors()) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("fieldName", fieldError.getField());
					map.put("errorMessage", fieldError.getDefaultMessage());
					errorList.add(map);
					System.out.println("出错的字段名为:------------->"
							+ fieldError.getField());
					System.out.println("出错信息为:---------------->"
							+ fieldError.getDefaultMessage());
				}
				return Msg.fail().add("msg", "修改失败");
			} else {
				int usersId = usersService.modifyUsers(users);
				if (usersId != 0) {
					return Msg.success().add("msg", "用户修改成功！");
				} else {
					return Msg.fail().add("msg", "用户修改失败！");
				}
			}

		} else {
			return Msg.fail().add("msg", "用户修改失败！");
		}
	}

	
	/**
	 * @Title:   modifyShopMemberState
	 * @Description:  修改会员状态
	 * @param:    @param id
	 * @param:    @param result
	 * @param:    @return   
	 * @return:   Msg   
	 * @throws
	 */
	@RequestMapping("/modifyShopMemberState")
	@ResponseBody
	public Msg modifyShopMemberState(String id,String code) {
		if ((id != null && !id.equals(""))&& (code != null && !code.equals(""))) {
			Users users = usersService.findUsersById(Integer.valueOf(id));
			System.out.println(users.toString());
			if (Integer.valueOf(code)==1) {
				users.setColumn5("1");
			}else {
				users.setColumn5("0");
			}
			System.out.println(users.toString());
			int usersId = usersService.modifyUsers(users);
			if (usersId != 0) {
				return Msg.success().add("msg", "用户修改成功！");
			} else {
				return Msg.fail().add("msg", "用户修改失败！");
			}
		} else {
			return Msg.fail().add("msg", "用户修改失败！");
		}
	}

	/**
	 * @Title: findUsesById
	 * @Description: 通过id查询电商用户
	 * @param: @param id
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findUserByid")
	@ResponseBody
	public Msg findUsesById(String id) {
		if (id != null && !id.equals("")) {
			Users users = usersService.findUsersById(Integer.valueOf(id));
			if (users != null) {
				return Msg.success().add("user", users);
			} else {
				return Msg.fail().add("msg", "没有相关数据");
			}
		} else {
			return Msg.fail().add("msg", "参数错误！");
		}

	}

	/**
	 * @Title: searchShopMember
	 * @Description: 搜索查询所有的会员表
	 * @param: @param userDetail
	 * @param: @param startTime
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @param: @throws NumberFormatException
	 * @param: @throws UnsupportedEncodingException
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/searchShopMember")
	@ResponseBody
	public Msg searchShopMember(
			String userDetail,
			Date startTime,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws NumberFormatException, UnsupportedEncodingException {
		System.out.println("userDetail" + userDetail + ".." + startTime);
		if (pn > 0) {
			PageHelper.startPage(pn, pageSize);
			List<ShopMember> list = shopMemberService
					.findAllShopMembersBySearch(
							new String(userDetail.getBytes("iso-8859-1"),
									"utf-8"), startTime);
			PageInfo<ShopMember> pageInfo = new PageInfo<ShopMember>(list, 6);
			if (list == null) {
				return Msg.fail().add("msg", "没有查询到数据");
			}
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail().add("msg", "没有查询到数据");
		}
	};

	/**
	 * @Title: findAllShopMembersGradeDistribution
	 * @Description: 查询所有的会员等级分布数据
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllShopMembersGradeDistribution")
	@ResponseBody
	public Msg findAllShopMembersGradeDistribution() {
		Map<String, Integer> levelMap = new HashMap<String, Integer>();
		levelMap = shopMemberService.findAllShopMembersGradeDistribution();
		if (levelMap != null) {
			return Msg.success().add("levelMap", levelMap);
		} else {
			return Msg.fail().add("msg", "抱歉，查询不到会员分布数据!");
		}
	}

	/**
	 * @Title: findAllShopMembersByLevel
	 * @Description: 通过会员等级来查询所有的会员
	 * @param: @param code
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @param: @throws NumberFormatException
	 * @param: @throws UnsupportedEncodingException
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping("/findAllShopMembersByLevel")
	@ResponseBody
	public Msg findAllShopMembersByLevel(
			String code,
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize)
			throws NumberFormatException, UnsupportedEncodingException {
		if (pn > 0) {

			if (code != null && !code.equals("")) {
				PageHelper.startPage(pn, pageSize);
				List<ShopMember> list = shopMemberService
						.findAllShopMembersByLevel(Integer.valueOf(code));
				PageInfo<ShopMember> pageInfo = new PageInfo<ShopMember>(list,
						6);
				if (list == null) {
					return Msg.fail().add("msg", "没有查询到数据");
				}
				return Msg.success().add("pageInfo", pageInfo);
			} else {
				return Msg.fail().add("msg", "参数错误");
			}

		} else {
			return Msg.fail().add("msg", "没有查询到数据");
		}
	}

}
