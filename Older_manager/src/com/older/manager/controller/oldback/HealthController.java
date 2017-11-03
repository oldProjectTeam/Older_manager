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

	/**
	 * 健康履历
	 * 
	 * @return
	 */
	@RequestMapping("/bloodTransfusion")
	public String bloodTransfusion() {
		return "oldback/healthManage/bloodTransfusion";
	}

	/**
	 * 购买能力
	 * 
	 * @return
	 */
	@RequestMapping("/BuyAbility")
	public String BuyAbility() {
		return "oldback/healthManage/BuyAbility";
	}

	/**
	 * 疾病列表
	 * 
	 * @return
	 */
	@RequestMapping("/Disease")
	public String Disease() {
		return "oldback/healthManage/Disease";
	}

	/**
	 * 家族史列表
	 * 
	 * @return
	 */
	@RequestMapping("/familyHistory")
	public String familyHistory() {
		return "oldback/healthManage/familyHistory";
	}

	/**
	 * 感染病史
	 * 
	 * @return
	 */
	@RequestMapping("/geneticHistory")
	public String geneticHistory() {
		return "oldback/healthManage/geneticHistory";
	}

	/**
	 * 健康评估
	 * 
	 * @return
	 */
	@RequestMapping("/healthAccess")
	public String healthAccess() {
		return "oldback/healthManage/healthAccess";
	}

	/**
	 * 手术列表
	 * 
	 * @return
	 */
	@RequestMapping("/surgery")
	public String surgery() {
		return "oldback/healthManage/surgery";
	}

	/**
	 * 外伤列表
	 * 
	 * @return
	 */
	@RequestMapping("/trauma")
	public String trauma() {
		return "oldback/healthManage/trauma";
	}
}
