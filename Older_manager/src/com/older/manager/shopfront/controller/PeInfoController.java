package com.older.manager.shopfront.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Pedetails;
import com.older.manager.bean.Peinfo;
import com.older.manager.service.shopfront.IPeInfoService;
import com.older.manager.service.shopfront.IPedatilsService;
import com.older.manager.utils.Msg;

@RequestMapping("/peinfo")
@Controller
public class PeInfoController {
	@Autowired
	private IPeInfoService peInfoService;
	@Autowired
	private IPedatilsService pedatilsService;
	
	/**
	 * @Title:   initBinder
	 * @Description:  解决上传时间转换问题
	 * @param:    @param binder   
	 * @return:   void   
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	
	//查询体检信息
	@RequestMapping("/select")
	@ResponseBody
	public Msg queryPeinfoAndDetails(@RequestParam(value="pn",
	defaultValue="1")Integer pn,Integer userId){
		if (userId!=null) {
			PageHelper.startPage(pn,10);
			List<Peinfo> peinfos=peInfoService.queryPeinfos(userId);
			PageInfo pageInfo=new PageInfo(peinfos,3);
			return Msg.success().add("pageInfo", pageInfo);
		}
		
		return Msg.fail().add("errmassge","userId为空");
	}
	
	//根据id删除信息
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public Msg deleteById(@PathVariable(value="id")String id){
		
		if(id!=null){
			int peinforID=Integer.parseInt(id);
			peInfoService.deleteByID(peinforID);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	//增加体检数据
	@RequestMapping("/addpeinfo")
	@ResponseBody
	public Msg addPeInfo(Peinfo peinfo,	Pedetails pedetails){
		if(!Pattern.matches("[\\d]+",peinfo.getOldmanId()+"")){
			return Msg.fail();
		}
		if( peinfo!=null && pedetails!=null){
			 peInfoService.insertPeinfo(peinfo);
			if(peinfo.getId()!=null){
				pedetails.setPeinfoId(peinfo.getId());
				pedatilsService.insertPeDetails(pedetails);
				return Msg.success();
			}
			
		}
		return Msg.fail();
	}
	//根据id查询
	@RequestMapping("/selectbyid")
	@ResponseBody
	public Msg queryById(Integer id){
		if(id!=null){
		 Peinfo peinfo = peInfoService.queryByID(id);
		 return Msg.success().add("peinfo", peinfo);
		}
		return Msg.fail();
	}
	
	//修改体检信息
	@RequestMapping("/update")
	@ResponseBody
	public Msg updatePeInfo(Peinfo peinfo,	Pedetails pedetails){
		if(peinfo!=null && pedetails!=null){
			peInfoService.updatePeinfos(peinfo);
			if(peinfo.getId()!=null){
				pedetails.setPeinfoId(peinfo.getId());
				pedatilsService.updateDetails(pedetails);
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
		return Msg.fail();
	}
	
	//模糊查询
	@RequestMapping("/dimselect")
	@ResponseBody
	public Msg SelectByhospitalAndUserId(@RequestParam(value="pn",defaultValue="1")Integer pn, Peinfo peinfo){
		if(peinfo!=null){
			PageHelper.startPage(pn,10);
		    List<Peinfo> peInfos=peInfoService.selectPeinfoByHospital(peinfo);
			PageInfo pageInfo=new PageInfo(peInfos,3);
			return Msg.success().add("pageInfo", pageInfo);
		}
		
		return Msg.fail().add("err","peinfo为空");
	}
	
}

