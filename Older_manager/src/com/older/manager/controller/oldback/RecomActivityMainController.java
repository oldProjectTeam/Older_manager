/**
 * 
 */
package com.older.manager.controller.oldback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.service.oldback.RecomActivityDetailsService;
import com.older.manager.service.oldback.RecomActivityService;

/**
 * @author ym
 *
 */
@RequestMapping("/recomActivity")
@Controller
public class RecomActivityMainController {

	
	@Autowired
	RecomActivityService recomActivityService;
	
	
	
	@RequestMapping("addRecomActivity")
	@ResponseBody
	public int addRecomActivity(){
		
		return 0;
	}
	
	
}
