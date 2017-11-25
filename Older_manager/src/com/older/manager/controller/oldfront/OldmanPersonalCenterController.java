/**
 * 
 */
package com.older.manager.controller.oldfront;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldfront.IOldmanService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

/**
 * @author ym
 * @date 2017年11月23日 上午11:24:52
 */
@Controller
@RequestMapping("/PersonalCenter")
public class OldmanPersonalCenterController {

	@Autowired
	IOldmanService iOldmanService;

	/**
	 * @Title: initBinder
	 * @Description: 解决上传时间转换问题
	 * @param: @param binder
	 * @return: void
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * @Title: intoPersonalInfo
	 * @Description: 跳转到老人个人资料页面
	 * @param: @param oldmanId
	 * @param: @param model
	 * @param: @return
	 * @param: @throws Exception
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月23日 下午2:28:45
	 */
	@RequestMapping("/intoPersonalInfo")
	public String intoPersonalInfo(Integer oldmanId, Model model)
			throws Exception {
		if (oldmanId > 0) {
			Oldman oldman = iOldmanService.findDetailOldmanById(oldmanId);
			model.addAttribute("oldman", oldman);
			return "oldfront/older/person/person_info";
		} else {
			return "oldfront/older/person/person_info";
		}
	}

	/**
	 * @Title: intoAcountManager
	 * @Description: 跳转到老人账户管理
	 * @param: @param oldmanId
	 * @param: @param model
	 * @param: @return
	 * @param: @throws Exception
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月23日 下午2:35:35
	 */
	@RequestMapping("/intoAcountManager")
	public String intoAcountManager(Integer oldmanId, Model model)
			throws Exception {
		if (oldmanId > 0) {
			Oldmanaccount oldmanaccount = iOldmanService.findOldmanaccountByOldmanId(oldmanId);
			model.addAttribute("oldmanaccount", oldmanaccount);
			System.out.println(">>>>>>>>>>>"+oldmanaccount);
			return "oldfront/older/person/user_manager";
		} else {
			return "oldfront/older/person/user_manager";
		}
	}

	/**
	 * @Title: modifyAcountInfo
	 * @Description: 修改老人数据
	 * @param @param oldman
	 * @param @param file
	 * @param @param request
	 * @param @return
	 * @param @throws Exception
	 * @return Msg
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午1:17:43
	 */
	@RequestMapping("/modifyAcountInfo")
	@ResponseBody
	public Msg modifyAcountInfo(MultipartFile file, Oldman oldman,
			HttpServletRequest request) throws Exception {
		String imgurlString = null;
		System.out.println(".........." + oldman.toString());
		System.out.println(".........." + file);
		System.out.println(".........." + file.getOriginalFilename());
		if (oldman != null) {
			if (!file.isEmpty()) {
				if (file.getOriginalFilename() != null&& !file.getOriginalFilename().equals("")) {
					Oldman oldman2 = iOldmanService.getOldman(oldman.getId());
					if (oldman2.getPhoto() != null) {
						SaveFile.delete(oldman2.getPhoto(), request);
						imgurlString = SaveFile.saveImg(file, request);
						oldman.setPhoto(imgurlString);
					} else {
						imgurlString = SaveFile.saveImg(file, request);
						oldman.setPhoto(imgurlString);
					}
					;
				}
			};

			int state = iOldmanService.modifyOldman(oldman);
			if (state != 0) {
				return Msg.success().add("msg", "更新数据成功");
			} else {
				return Msg.fail().add("msg", "更新数数据失败！");
			}
		}
		return Msg.fail().add("msg", "插入数据不完整！");
		
	}
	
	/**
	 * @Title: updateOldmanAcount
	 * @Description: TODO
	 * @param @param oldmanaccount
	 * @param @return   
	 * @return Msg  
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 下午11:50:05
	 */
	@RequestMapping("/updateOldmanAcount")
	@ResponseBody
	public Msg updateOldmanAcount(Oldmanaccount oldmanaccount){
		if (oldmanaccount!=null) {
			int state=iOldmanService.modifyOldmanAccount(oldmanaccount);
			if (state!=0) {
				return Msg.success().add("msg", "修改成功");
			}else {
				return Msg.fail().add("msg", "修改失败！");
			}
		}else {
			return Msg.fail().add("msg", "插入数据有误");
		}
	}
}
