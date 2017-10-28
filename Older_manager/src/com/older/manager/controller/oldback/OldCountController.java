package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OldCountController {

	/**
	 * accountmanage.jsp
	 * @return
	 */
	@RequestMapping("/accountmanage")
	public String accountmanage(){
		return "oldback/oldaccountmanage/accountmanage";
	}
	
	/**
	 * accountManageindex.jsp
	 * @return
	 */
	@RequestMapping("/accountManageindex")
	public String accountManageindex(){
		return "oldback/oldaccountmanage/accountManageindex";
	}
	
	/**
	 *giftexchange.jsp
	 * @return
	 */
	@RequestMapping("/giftexchange")
	public String giftexchange(){
		return "oldback/oldaccountmanage/giftexchange";
	}
	
	/**
	 *giftmanage.jsp
	 * @return
	 */
	@RequestMapping("/giftmanage")
	public String giftmanage(){
		return "oldback/oldaccountmanage/giftmanage";
	}
	
	/**
	 *integralexchane.jsp
	 * @return
	 */
	@RequestMapping("/integralexchane")
	public String integralexchane(){
		return "oldback/oldaccountmanage/integralexchane";
	}
}
