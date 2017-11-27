package com.older.manager.shopfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Questionandanswer;
import com.older.manager.bean.Users;
import com.older.manager.service.shopfront.SafetyService;
import com.older.manager.utils.Msg;

@Controller
/**
 * 安全设置
 * @author 疯癫
 *
 */
@RequestMapping("/safety")
public class SafetyController {
    @Autowired
	private SafetyService safetyService;
    
    
    /**
     * 查
     * @param id
     * @return
     */
    @RequestMapping("/selectuserbyid/{id}")
    @ResponseBody
    public Msg selectUsersById(@PathVariable("id")Integer id){
    	Users users=safetyService.selectUserByid(id);
    	return Msg.success().add("users", users);
    }
    
    /**
     * 修改
     * @param str
     * @return
     */
    @RequestMapping("/upateusers/{id}&{str}")
    @ResponseBody
    public Msg upateUsers(@PathVariable("str")String str,@PathVariable Integer id){
    	Users users=new Users();
    	users.setPassword(str);
    	users.setId(id);
        safetyService.updateUser(users);
    	  return Msg.success();
    }
    
    /**
     * 跳到安全设置
     * @return
     */
    @RequestMapping("/skipsafety")
    public String skipSafety(){
    	
    	return "oldfront/person/safety";
    }
    
    /**
     * 跳到密码
     * @return
     */
    @RequestMapping("/skippassword")
    public String skipPassword(){
    	
    	return "oldfront/person/password";
    }
    
    /**
     * 跳到个人信息
     * @return
     */
    @RequestMapping("/skipinformation1")
    public String skipInformation(){
  	  return "oldfront/person/information";
    } 
    /**
     * 跳到问题
     * @return
     */
    @RequestMapping("/skipquestion")
    public String skipQuestion(){
    	
     return "oldfront/person/question";
    }
    /**
     * 增加问题
     * @param questionandanswer
     * @return
     */
   @RequestMapping("/addquestionandanswer")
   @ResponseBody
   public Msg addQuestionAndAnswer(Questionandanswer questionandanswer){
	   
	   //如果存在就修改
	   if(safetyService.selectQuestion(questionandanswer.getUserid())){
		   safetyService.addQuestion(questionandanswer);
	   }else{
		     safetyService.updateQuestion(questionandanswer);
	   }

	   return Msg.success();
   } 
    
   /**
    * 跳到支付密码
    * @return
    */
  @RequestMapping("/skipsetpay")
  public  String skipSetpay(){
	   
      return "oldfront/person/setpay"; 
  }
  /**
   * 跳到手机验证
   * @return
   */
  @RequestMapping("/skipbindphone")
  public  String skipBindphone(){
	   
      return "oldfront/person/bindphone"; 
  }
   /**
    * 邮箱验证
    * @return
    */
  @RequestMapping("/skipemail")
  public  String skipEmail(){
	   
      return "oldfront/person/email"; 
  }
  
   /**
    * 实名验证
    * @return
    */
  @RequestMapping("/skipidcard")
  public  String skipIdcard(){
	   
      return "oldfront/person/idcard"; 
  }

    
}
