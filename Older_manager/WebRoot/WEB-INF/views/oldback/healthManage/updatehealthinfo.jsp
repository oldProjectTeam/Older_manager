<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'healthInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body>
	<!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">

				<ol class="breadcrumb">
					<li><b>位置：健康管理>基本健康信息</b> >新增信息
				</ol>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
			  <center><font color="red" ><i id="errormsg"></i></font></center>
				<form action="" id="addhealthinfo_form">
					<table class="table table-bordered">
						<tr>
							<td colspan="8">基本信息</td>
						</tr>
						<tr>
							<td>老人姓名：</td>
							<td><p>${healthinfo.oldman.name}</p></td>

							<td><font color=red>*</font>身高:</td>
							<td>
								<div class="form-inline">
									<input class="form-control" style="width:70%" id="heightid"
										required="required" value="${healthinfo.height}"
										placeholder="列如：165.00" name="height">cm
								</div>
								<font color="red" size="1"><i id="msgheightid"></i></font>
							</td>
							<td><font color=red>*</font>体重：</td>
							<td>
								<div class="form-inline">
									<input class="form-control" style="width:70%" id="bodyweightid"
										required="required" value="${healthinfo.bodyweight}"
										placeholder="列如58.00" name="bodyweight">kg
								</div><font color="red" size="1"><i id="msgbodyweightid"></i></font>
							</td>
							<td>臀围：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="numtwoid"
										value="${healthinfo.numtwo}" placeholder="列如：33.00"
										name="numtwo">cm
								</div><font color="red" size="1"><i id="msgnumtwoid"></i></font></td>
						</tr>
						<tr>
							<td>胸围：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="numoneid"
										value="${healthinfo.numone}" placeholder="列如：28.00"
										name="numone">cm
								</div><font color="red" size="1"><i id="msgnumoneid"></i></font></td>
							<td>腰臂围比值:</td>
							<td><input class="form-control" name="armcirumferenceratio" id="armcirumferenceratioid"
								value="${healthinfo.armcirumferenceratio}" placeholder="列如：0.50">
								<font color="red" size="1"><i id="msgarmcirumferenceratioid"></i></font>
								</td>
							<td>个体指数：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" name="bmi" id="bmiid"
										value="${healthinfo.bmi}" placeholder="列如：0.50">kg/m2
								</div>
								<font color="red" size="1"><i id="msgbmiid"></i></font>
								</td>
							<td>腰围</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="waistcircumferenceid"
										name="waistcircumference"
										value="${healthinfo.waistcircumference}"
										placeholder="列如：28.00">cm
								</div>
								<font color="red" size="1"><i id="msgwaistcircumferenceid"></i></font>
								</td>
						</tr>
						<tr>
							<td colspan="8">身体信息</td>
						</tr>
						<tr>
							<td>左眼视力:</td>
							<td><INPUT type="text" class="form-control"
								name="lefteyesight" value="${healthinfo.lefteyesight}"
								placeholder="列如：1.2米"></td>
							<td>右眼视力:</td>
							<td><INPUT type="text" class="form-control"
								name="righteyesight" value="${healthinfo.righteyesight}"
								placeholder="列如：1.2米"></td>
							<td>矫正左眼视力:</td>
							<td><INPUT type="text" class="form-control"
								name="correctlefteyesight"
								value="${healthinfo.correctlefteyesight}" placeholder="列如：1.2米"></td>
							<td>矫正右眼视力</td>
							<td><INPUT type="text" class="form-control"
								name="correctrighteyesight"
								value="${healthinfo.correctrighteyesight}" placeholder="列如：1.2米"></td>
						</tr>
						<tr>
							<td><font color=red>*</font>右侧血压：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="rightbloodpressureid"
										value="${healthinfo.rightbloodpressure}" required="required"
										placeholder="列如：150.00" name="rightbloodpressure">mmHg
								</div>
								<font color="red" size="1"><i id="msgrightbloodpressureid"></i></font>
								</td>

							<td><font color=red>*</font>左侧血压:</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="leftbloodpressureid"
										value="${healthinfo.leftbloodpressure}" required="required"
										placeholder="列如：150.00" name="leftbloodpressure">mmHg
								</div>
								<font color="red" size="1"><i id="msgleftbloodpressureid"></i></font>
								</td>
							<td>呼吸频率:</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="breathingrateid"
										value="${healthinfo.breathingrate}" name="breathingrate"
										placeholder="列如：150">次/分钟
								</div>
								<font color="red" size="1"><i id="msgbreathingrateid"></i></font>
								</td>
							<td>脉率：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="pulsefrequencyid"
										value="${healthinfo.pulsefrequency}" name="pulsefrequency"
										placeholder="列如：150">次/分钟
								</div>
								<font color="red" size="1"><i id="msgpulsefrequencyid"></i></font>
								</td>
						</tr>
						<tr>
							<td>口唇:</td>
							<td><INPUT type="text" class="form-control" name="oral"
								value="${healthinfo.oral}"></td>
							<td>齿列：</td>
							<td><INPUT type="text" class="form-control" name="dentition"
								value="${healthinfo.dentition}"></td>
							<td>咽部：</td>
							<td><INPUT type="text" class="form-control"
								name="pharyngeal" value="${healthinfo.pharyngeal}"></td>
							<td>皮肤：</td>
							<td><INPUT type="text" class="form-control" name="skin"
								value="${healthinfo.skin}"></td>
						</tr>
						<tr>
							<td>巩膜:</td>
							<td><INPUT type="text" class="form-control" name="sclera"
								value="${healthinfo.sclera}"></td>
							<td>淋巴结:</td>
							<td><INPUT type="text" class="form-control" name="lymphnode"
								value="${healthinfo.lymphnode}"></td>
							<td>心律:</td>
							<td><div class="form-inline">
									<input class="form-control" value="${healthinfo.heartrate}" id="heartrateid"
										style="width:70%" name="heartrate" placeholder="列如：80">次/分钟
								</div><font color="red" size="1"><i id="msgheartrateid"></i></font></td>
							<td>脾大：</td>
							<td><select class="form-control" name="splenomegaly"
								id="splenomegalyid">
									<OPTION value="是">是</OPTION>
									<OPTION value="否">否</OPTION>
							</select></td>
						<tr>
							<td>桶状胸:</td>
							<td><select class="form-control" name="barrelchest"
								id="barrelchestid">
									<OPTION value="是">是</OPTION>
									<OPTION value="否">否</OPTION>
							</select></td>
							<td>呼吸音:</td>
							<td><select class="form-control" name="breathsounds"
								id="breathsoundsid">
									<OPTION value="正常">正常</OPTION>
									<OPTION value="异常">异常</OPTION>
							</select></td>
							<td>罗音:</td>
							<td><INPUT type="text" class="form-control" name="rale"
								value="${healthinfo.rale}"></td>
							<td>体温：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="bodytemperatureid"
										placeholder="列如：32.50" value="${healthinfo.bodytemperature}"
										name="bodytemperature">℃
								</div>
								<font color="red" size="1"><i id="msgbodytemperatureid"></i></font>
								</td>
						</tr>
						<tr>
							<td>听力:</td>
							<td><INPUT type="text" class="form-control" name="hearing"
								value="${healthinfo.hearing}"></td>
							<td>杂音:</td>
							<td><select class="form-control" name="noise" id="noiseid">
									<OPTION value="是">是</OPTION>
									<OPTION value="否">否</OPTION>
							</select></td>
							<td>压痛:</td>
							<td><select class="form-control" name="tenderness"
								id="tendernessid">
									<OPTION value="是">是</OPTION>
									<OPTION value="否">否</OPTION>
							</select></td>
							<td>包块:</td>
							<td><select class="form-control" name="bagpiece"
								id="bagpieceid">
									<OPTION value="是">是</OPTION>
									<OPTION value="否">否</OPTION>
							</select></td>
						</tr>
						<TR>
							<td>症状：</td>
							<td><input class="form-control" name="symptoms"
								value="${healthinfo.symptoms}"></td>
							<td colspan="6"></td>
						</TR>
						<tr>
						<tr>
							<td colspan="8">日常习惯</td>
						</tr>
						<tr>
							<td>饮食习惯:</td>
							<td><INPUT type="text" class="form-control"
								name="eationhabits" value="${healthinfo.eationhabits}"></td>
							<td>锻炼频率：</td>
							<td><INPUT type="text" class="form-control"
								name="exercisefrequency" value="${healthinfo.exercisefrequency}"></td>
							<td>每次锻炼时间：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="exercisetimeid"
										value="${healthinfo.exercisetime}" name="exercisetime"
										placeholder="列如：150">分钟
								</div>
								<font color="red" size="1"><i id="msgexercisetimeid"></i></font>
								</td>
							<td>坚持锻炼时间：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="stickexercisetimeid"
										value="${healthinfo.stickexercisetime}" placeholder="列如：3.00"
										name="stickexercisetime"> 年
								</div>
								<font color="red" size="1"><i id="msgstickexercisetimeid"></i></font>
								</td>
						</tr>
						<tr>
							<td>锻炼方法：</td>
							<td><INPUT type="text" class="form-control"
								name="exerciseway" value="${healthinfo.exerciseway}"></td>
							<td>吸烟状态：</td>
							<td><INPUT type="text" class="form-control"
								name="smokingstatus" value="${healthinfo.smokingstatus}"></td>
							<td>开始吸烟年龄：</td>
							<td><div class="form-inline">
									<input class="form-control" id="beginsmokingageid"
										value="${healthinfo.beginsmokingage}" style="width:70%"
										name="beginsmokingage" placeholder="列如：20">岁
								</div>
								<font color="red" size="1"><i id="msgbeginsmokingageid"></i></font>
								</td>
							<td>戒烟年龄：</td>
							<td><div class="form-inline">
									<input class="form-control" id="quitsmokingageid"
										value="${healthinfo.quitsmokingage}" style="width:70%"
										name="quitsmokingage" placeholder="列如：30">岁
								</div>
								<font color="red" size="1"><i id="msgquitsmokingageid"></i></font>
								</td>
						</tr>
						<tr>
							<td>饮酒频率：</td>
							<td><INPUT type="text" class="form-control" id="drinkingfrequencyid"
								value="${healthinfo.drinkingfrequency}" name="drinkingfrequency"
								placeholder="列如：2.00">
								<font color="red" size="1"><i id="msgdrinkingfrequencyid"></i></font>
								</td>
							<td>日饮酒量：</td>
							<td><div class="form-inline">
									<input class="form-control" value="${healthinfo.dailydrinking}" id="dailydrinkingid"
										style="width:70%" placeholder="列如：5.00" name="dailydrinking">两
								</div>
								<font color="red" size="1"><i id="msgdailydrinkingid"></i></font>
								</td>
							<td>开始饮酒年龄：</td>
							<td><div class="form-inline">
									<input class="form-control"  id="startdrinkingageid"
										value="${healthinfo.startdrinkingage}" style="width:70%"
										name="startdrinkingage">岁
								</div>
								<font color="red" size="1"><i id="msgstartdrinkingageid"></i></font>
								</td>
							<td>是否戒酒：</td>
							<td><select class="form-control" name="isquitdrinking"
								id="isquitdrinkingid">
									<OPTION value="是">是</OPTION>
									<OPTION value="否">否</OPTION>
							</select></td>
						</tr>

						<tr>
							<td>日吸烟量：</td>
							<td><div class="form-inline">
									<input class="form-control" style="width:70%" id="daysmokingamountid"
										value="${healthinfo.daysmokingamount}" name="daysmokingamount">支
								</div>
								<font color="red" size="1"><i id="msgdaysmokingamountid"></i></font>
								</td>
							<td colspan="6"></td>
						</tr>
						<tr>
							<td colspan="8">评价信息</td>
						</tr>

						<tr>
							<td>健康状况评价:</td>
							<td><textarea rows="2" cols="" class="form-control"
									name="healthassessment">${healthinfo.healthassessment}</textarea></td>
							<td>自理能力评价：</td>
							<td><textarea rows="2" cols="" class="form-control"
									name="selfevaluation">${healthinfo.selfevaluation}</textarea></td>
							<td>认知功能：</td>
							<td><textarea rows="2" cols="" class="form-control"
									name="cognitivefunction">${healthinfo.cognitivefunction}</textarea></td>
							<td colspan="2"></td>
						</tr>
					</table>
					<!-- 按钮 -->
					<div class="row" style="margin-bottom:20px">
						<div align="center">
							<BUTTON class="btn btn-success" id="save_healthinfo"
								type="button">保存</BUTTON>
							<button type="button" class="btn btn-info"
								onClick="javascript :history.back(-1);">返回</button>
						</div>
					</div>
				</form>
			</div>
		</div>

	</div>

	<script type="text/javascript">
		$("#save_healthinfo")
				.click(
						function() {
							$
									.ajax({
										url : "${APP_PATH}/healthinfo/updatehealthinfo/"
												+ ${id},
										type : "POST",
										data : $("#addhealthinfo_form")
												.serialize(),
										success : function(result) {

											if (result.code == 100) {
												window.location.href = "${APP_PATH}/health/healthInfo/${pn}";
											}else if(result.code == 200){
											   
											   //$("#errormsg").text("请检查输入类容");
											  layer.open({
													title : '出错了',
													content : '请检查输入类容!'
												});
											}
										}

									});

						});

		$(function() {
			$("#isquitdrinkingid").val([ "${healthinfo.isquitdrinking}" ]);
			$("#bagpieceid").val([ "${healthinfo.bagpiece}" ]);
			$("#tendernessid").val([ "${healthinfo.tenderness}" ]);
			$("#noiseid").val([ "${healthinfo.noise}" ]);
			$("#barrelchestid").val([ "${healthinfo.barrelchest}" ]);
			$("#breathsoundsid").val([ "${healthinfo.breathsounds}" ]);
			$("#splenomegalyid").val([ "${healthinfo.splenomegaly}" ]);
		});

		//校验******************************************************************
		//double类型的
		var doublenum = /^[0-9]{1,3}\.([0-9]{1,2})$/;
		var intnum = /^\d{1,6}$/;
		var num = new Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1);

		$("#heightid").change(function() {
			var height = $("#heightid").val();
			if (!doublenum.test(height) && height != null) {
				$("#msgheightid").text("请输入正确的值");
				//$("#save_healthinfo").attr("disabled",true);
				num[0] = 0;
			} else {
				$("#msgheightid").text("");
				//$("#save_healthinfo").attr("disabled",false);
				num[0] = 1;
				//alert(document.write(num[0])+"****************");
			}
			save();
		});

		$("#bodyweightid").change(function() {
			var height = $("#bodyweightid").val();
			if (!doublenum.test(height) && height != null) {
				$("#msgbodyweightid").text("请输入正确的值");
				//$("#save_healthinfo").attr("disabled",true);
				num[1] = 0;
			} else {
				$("#msgbodyweightid").text("");
				//$("#save_healthinfo").attr("disabled",false);
				num[1] = 1;
				//document.write(num[1]);
			}
			save();
		});
		$("#rightbloodpressureid").change(function() {
			var height = $("#rightbloodpressureid").val();
			if (!doublenum.test(height) && height != null) {
				$("#msgrightbloodpressureid").text("请输入正确的值");
				//$("#save_healthinfo").attr("disabled",true);
				num[2] = 0;
			} else {
				$("#msgrightbloodpressureid").text("");
				//$("#save_healthinfo").attr("disabled",false);
				num[2] = 1;
			}
			save();
		});
		$("#leftbloodpressureid").change(function() {
			var height = $("#leftbloodpressureid").val();
			if (!doublenum.test(height) && height != null) {
				$("#msgleftbloodpressureid").text("请输入正确的值");
				//$("#save_healthinfo").attr("disabled",true);
				num[3] = 0;
			} else {
				$("#msgleftbloodpressureid").text("");
				//$("#save_healthinfo").attr("disabled",false);
				num[3] = 1;
			}
			save();

		});

		function save() {
			var count = 0;
			var j;

			for (j in num) {
				if (num[j] == 1) {
					count = count + 1;
				}
			}
			//alert(count);
			if (count == 21) {

				$("#save_healthinfo").attr("disabled", false);
			} else {
				$("#save_healthinfo").attr("disabled", true);
			}
		}

		$("#numtwoid").change(function() {
			var height = $("#numtwoid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgnumtwoid").text("");
				num[4] = 1;
			} else {
				$("#msgnumtwoid").text("请输入正确的值");
				num[4] = 0;
			}

			save();
		});

		$("#numoneid").change(function() {
			var height = $("#numoneid").val();

			if (height == "" || doublenum.test(height)) {
				$("#msgnumoneid").text("");
				num[5] = 1;
			} else {
				$("#msgnumoneid").text("请输入正确的值");
				num[5] = 0;
			}

			save();
		});

		$("#armcirumferenceratioid").change(function() {
			var height = $("#armcirumferenceratioid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgarmcirumferenceratioid").text("");
				num[6] = 1;
			} else {
				$("#msgarmcirumferenceratioid").text("请输入正确的值");
				num[6] = 0;
			}
			save();
		});
		$("#bmiid").change(function() {
			var height = $("#bmiid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgbmiid").text("");
				num[7] = 1;
			} else {
				$("#msgbmiid").text("请输入正确的值");
				num[7] = 0;
			}
			save();
		});

		$("#waistcircumferenceid").change(function() {
			var height = $("#waistcircumferenceid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgwaistcircumferenceid").text("");
				num[8] = 1;
			} else {
				$("#msgwaistcircumferenceid").text("请输入正确的值");
				num[8] = 0;
			}
			save();
		});

		$("#breathingrateid").change(function() {
			var height = $("#breathingrateid").val();
			if (height == "" || intnum.test(height)) {
				$("#msgbreathingrateid").text("");
				num[9] = 1;
			} else {
				$("#msgbreathingrateid").text("请输入正确的值");
				num[9] = 0;
			}
			save();
		});
		$("#pulsefrequencyid").change(function() {
			var height = $("#pulsefrequencyid").val();
			if (height == "" || intnum.test(height)) {
				$("#msgpulsefrequencyid").text("");
				num[10] = 1;
			} else {
				$("#msgpulsefrequencyid").text("请输入正确的值");
				num[10] = 0;
			}
			save();
		});
		$("#heartrateid").change(function() {
			var height = $("#heartrateid").val();
			if (height == "" || intnum.test(height)) {
				$("#msgheartrateid").text("");
				num[11] = 1;
			} else {
				$("#msgheartrateid").text("请输入正确的值");
				num[11] = 0;
			}
			save();
		});
		$("#bodytemperatureid").change(function() {
			var height = $("#bodytemperatureid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgbodytemperatureid").text("");
				num[12] = 1;
			} else {
				$("#msgbodytemperatureid").text("请输入正确的值");
				num[12] = 0;
			}
			save();
		});

		$("#exercisetimeid").change(function() {
			var height = $("#exercisetimeid").val();
			if (height == "" || intnum.test(height)) {
				$("#msgexercisetimeid").text("");
				num[13] = 1;
			} else {
				$("#msgexercisetimeid").text("请输入正确的值");
				num[13] = 0;
			}
			save();
		});
		$("#stickexercisetimeid").change(function() {
			var height = $("#stickexercisetimeid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgstickexercisetimeid").text("");
				num[14] = 1;
			} else {
				$("#msgstickexercisetimeid").text("请输入正确的值");
				num[14] = 0;
			}
			save();
		});
		$("#beginsmokingageid").change(function() {
			var height = $("#beginsmokingageid").val();
			if (height == "" || intnum.test(height)) {
				$("#msgbeginsmokingageid").text("");
				num[15] = 1;
			} else {
				$("#msgbeginsmokingageid").text("请输入正确的值");
				num[15] = 0;
			}
			save();
		});
		$("#quitsmokingageid").change(function() {
			var height = $("#quitsmokingageid").val();

			if (height == "" || intnum.test(height)) {
				$("#msgquitsmokingageid").text("");
				num[16] = 1;
			} else {
				$("#msgquitsmokingageid").text("请输入正确的值");
				num[16] = 0;
			}
			save();
		});
		$("#drinkingfrequencyid").change(function() {
			var height = $("#drinkingfrequencyid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgdrinkingfrequencyid").text("");
				num[17] = 1;
			} else {
				$("#msgdrinkingfrequencyid").text("请输入正确的值");
				num[17] = 0;
			}
			save();
		});
		$("#dailydrinkingid").change(function() {
			var height = $("#dailydrinkingid").val();
			if (height == "" || doublenum.test(height)) {
				$("#msgdailydrinkingid").text("");
				num[18] = 1;
			} else {
				$("#msgdailydrinkingid").text("请输入正确的值");
				num[18] = 0;
			}
			save();
		});
		$("#startdrinkingageid").change(function() {
			var height = $("#startdrinkingageid").val();
			if (height == "" || intnum.test(height)) {
				$("#msgstartdrinkingageid").text("");
				num[19] = 1;
			} else {
				$("#msgstartdrinkingageid").text("请输入正确的值");
				num[19] = 0;
			}
			save();
		});
		$("#daysmokingamountid").change(function() {
			var height = $("#daysmokingamountid").val();

			if (height == "" || intnum.test(height)) {
				$("#msgdaysmokingamountid").text("");
				num[20] = 1;
			} else {
				$("#msgdaysmokingamountid").text("请输入正确的值");
				num[20] = 0;
			}
			save();
		});
	</script>
</body>
</html>
