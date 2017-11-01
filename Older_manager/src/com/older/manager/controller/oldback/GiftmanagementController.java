package com.older.manager.controller.oldback;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.Path;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter.Magenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Giftmanagement;
import com.older.manager.service.oldback.IGiftmanagementService;
import com.older.manager.utils.FileUtil;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/giftmanagement")
public class GiftmanagementController {

	@Autowired
	IGiftmanagementService giftmanagementService;
	
	/**
	 * 分页查询所有礼品记录
	 * @param pn
	 * @param giftmanagement
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/queryAllGift")
	public ModelAndView queryAllGift(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Giftmanagement giftmanagement) throws Exception{
		
		PageHelper.startPage(pn,5);
		List<Giftmanagement>giftmanagements=giftmanagementService.queryAllGift(giftmanagement);
		PageInfo pageInfo=new PageInfo(giftmanagements,5);
		ModelAndView modal=new ModelAndView("/oldback/oldaccountmanage/giftmanage");
		modal.addObject("pageInfo",pageInfo);
		return modal;
	}
	
	/**
	 * 根据id查询礼品
	 * @param id
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/findGift")
	@ResponseBody
	public Msg findGiftById(Integer id){
		boolean flag=false;
		Giftmanagement giftmanagement=null;
		try {
			giftmanagement=giftmanagementService.findGiftmanagementById(id);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success().add("giftmanagement", giftmanagement);
			}else{
				return Msg.fail();
			}
		}
	}
	
	/**
	 * 删除礼品信息（单删、批量删除）
	 * @param ids：id集合
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/deleteGift/{ids}")
	@ResponseBody
	public Msg deleteGift(@PathVariable("ids")String ids,HttpServletRequest request){
		boolean flag=false;
		try {
			if(ids.contains("-")){
				List<Integer> ids_str=new ArrayList<Integer>();
				String str[]=ids.split("-");
				for(String id:str){
					ids_str.add(Integer.parseInt(id));
				}
				//循环删掉图片
				 String filePath = request.getServletContext().getRealPath(
							"/upload/oldmanback/accountmanage/giftmanage");	
				for(Integer id:ids_str){
					Giftmanagement gm=giftmanagementService.findGiftmanagementById(id);
					   if(gm.getImage()!=null&&!"".equals(gm.getImage())){	  			
							FileUtil.deleteFile(filePath,gm.getImage());
					   }
				}
				giftmanagementService.batchDeleteGift(ids_str);
			 }else{
				 
				 //删除图片
				  Giftmanagement gm=giftmanagementService.findGiftmanagementById(Integer.parseInt(ids));
				   if(gm.getImage()!=null&&!"".equals(gm.getImage())){
					   String filePath = request.getServletContext().getRealPath(
								"//upload//oldmanback//accountmanage/giftmanage");				
						FileUtil.deleteFile(filePath,gm.getImage());
				   }
				giftmanagementService.deleteGift(Integer.parseInt(ids));
			 }
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
	
	/**
	 * 有选择的增加礼品信息
	 * @param giftmanagement
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/insertGift")
	@ResponseBody
	public Msg insertGift(@Valid Giftmanagement giftmanagement,BindingResult result){
		boolean flag=false;
		//校验数据是否不符合规则
		if(result.hasErrors()){
			List<FieldError>list=result.getFieldErrors();
			Map<String, Object>map=new HashMap<String, Object>();
			for(FieldError fieldError:list){
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("error", map);
		}
		try {	
			giftmanagementService.insertGift(giftmanagement);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
	
	/**
	 * 有选择的更新礼品信息
	 * @param giftmanagement
	 * @return
	 */
	@SuppressWarnings("finally")
	@RequestMapping("/updateGift")
	@ResponseBody
	public Msg updateGift(@Valid Giftmanagement giftmanagement,BindingResult result,
			HttpServletRequest request){
		boolean flag=false;
		//校验数据是否不符合规则
		if(result.hasErrors()){
			List<FieldError>list=result.getFieldErrors();
			Map<String, Object>map=new HashMap<String, Object>();
			for(FieldError fieldError:list){
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("error", map);
		}
		try {
			//先判断是否存在图片，有则删除
			if(giftmanagement.getImage()!=null&&!"".equals(giftmanagement.getImage())){
				Giftmanagement gm=giftmanagementService.findGiftmanagementById(giftmanagement.getId());
			   if(gm.getImage()!=null&&!"".equals(gm.getImage())){
				   String filePath = request.getServletContext().getRealPath(
							"//upload//oldmanback//accountmanage/giftmanage");				
					FileUtil.deleteFile(filePath,gm.getImage());
			   }
			}
			giftmanagementService.updateGift(giftmanagement);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(flag){
				return Msg.success();
			}else{
				return Msg.fail();
			}
		}
	}
	
	@RequestMapping("/upload.action")
	@ResponseBody
	public Msg upload(MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {

		if (file != null) {
			String fileName = file.getOriginalFilename();
			//判断是不是图片
			String extName=fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
			String regex="(gif|jpg|jpeg|png|GIF|JPG|PNG)";
			if(!Pattern.matches(regex, extName)){
				return Msg.fail();
			}
			String savePath = request.getServletContext().getRealPath(
					"/upload/oldmanback/accountmanage/giftmanage");
			fileName =FileUtil.uploadFile(file, savePath, fileName);
			// 将文件名保存到数据
			return Msg.success().add("fileName", fileName);
		}
		return Msg.fail();
	}
	/**
	 * 删除图片
	 * @param isImg
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkImg.action")
	@ResponseBody
	public Msg checkImg(String isImg ,HttpServletRequest request) throws Exception{
		
		if(isImg!=null&&!("".equals(isImg))){
			String filePath = request.getServletContext().getRealPath(
					"/upload/oldmanback/accountmanage/giftmanage");				
			FileUtil.deleteFile(filePath,isImg);
			return Msg.success();
		}
		return Msg.fail();
	}
}
