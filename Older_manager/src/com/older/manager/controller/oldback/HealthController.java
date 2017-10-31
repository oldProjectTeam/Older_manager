package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("health")
public class HealthController {

	/**
	 * 健康信息
	 * 
	 * @return
	 */
	@RequestMapping("/healthInfo")
	public String healthInfo() {
		return "oldback/healthManage/healthInfo";
	}

	/**
	 * 就诊记录
	 * 
	 * @return
	 */
	@RequestMapping("/healthattend")
	public String healthattend() {
		return "oldback/healthManage/healthattend";
	}

	/**
	 * 健康管理
	 * 
	 * @return
	 */
	@RequestMapping("/health")
	public String health() {
		return "oldback/healthManage/health";
	}
	
	/**
	 * 基本健康信息,新增
	 * 
	 * @return
	 */
	@RequestMapping("/addhealthInfo")
	public String addhealthInfo() {
		return "oldback/healthManage/addhealthInfo";
	}
	
	/**
	 * 基本健康信息,修改
	 * 
	 * @return
	 */
	@RequestMapping("/updateAttend")
	public String updateAttend() {
		return "oldback/healthManage/updateAttend";
	}
	
	/**
	 * 基本健康信息,查看
	 * 
	 * @return
	 */
	@RequestMapping("/selectAttend")
	public String selectAttend() {
		return "oldback/healthManage/selectAttend";
	}
}
