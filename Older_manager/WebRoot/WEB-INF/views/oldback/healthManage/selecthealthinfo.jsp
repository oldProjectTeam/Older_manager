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

</head>
  
  <body>
    <!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">

				<ol class="breadcrumb">
					<li><b>位置：健康管理>基本健康信息</b>>查看健康数据
				</ol>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
			  <form action="" id="addhealthinfo_form">
				 <table class="table table-bordered">
					<tr>
						<td colspan="8">基本信息</td>
					</tr>
					<tr>
						<td>老人姓名：</td>
						<td><p>${healthinfo.oldman.name}</p></td>

						<td>身高:</td>
						<td> 
						   ${healthinfo.height}cm
						</td>
						<td>体重</td>
						<td>${healthinfo.bodyweight}kg</td>
						<td>臀围：</td>
						<td>${healthinfo.numtwo}cm</td>
					</tr>
					<tr>
						<td>胸围：</td>
						<td>${healthinfo.numone}cm</td>
						<td>腰臂围比值:</td>
						<td>${healthinfo.armcirumferenceratio}</td>
						<td>个体指数：</td>
						<td>${healthinfo.bmi}kg/m2</td>
						<td>腰围</td>
						<td>${healthinfo.waistcircumference}cm</td>
					</tr>
					<tr>
						<td colspan="8">身体信息</td>
					</tr>
					<tr>
						<td>左眼视力:</td>
						<td>${healthinfo.lefteyesight}</td>
						<td>右眼视力:</td>
						<td>${healthinfo.righteyesight}</td>
						<td>矫正左眼视力:</td>
						<td>${healthinfo.correctlefteyesight}</td>
						<td>矫正右眼视力</td>
						<td>${healthinfo.correctrighteyesight}</td>
					</tr>
					<tr>
						<td><font color=red>*</font>右侧血压：</td>
						<td>${healthinfo.rightbloodpressure}mmHg</td>

						<td><font color=red>*</font>左侧血压:</td>
						<td>${healthinfo.leftbloodpressure}mmHg</td>
						<td>呼吸频率:</td>
						<td>${healthinfo.breathingrate}次/分钟</td>
						<td>脉率：</td>
						<td>${healthinfo.pulsefrequency}次/分钟</td>
					</tr>
					<tr>
						<td>口唇:</td>
						<td>${healthinfo.oral}</td>
						<td>齿列：</td>
						<td>${healthinfo.dentition}</td>
						<td>咽部：</td>
						<td>${healthinfo.pharyngeal}</td>
						<td>皮肤：</td>
						<td>${healthinfo.skin}</td>
					</tr>
					<tr>
						<td>巩膜:</td>
						<td>${healthinfo.sclera}</td>
						<td>淋巴结:</td>
						<td>${healthinfo.lymphnode}</td>
						<td>心律:</td>
						<td>${healthinfo.heartrate}次/分钟</td>
						<td>脾大：</td>
						<td>
						${healthinfo.splenomegaly}
								
						</td>
					<tr>
						<td>桶状胸:</td>
						<td>
						${healthinfo.barrelchest}
								
						</td>
						<td>呼吸音:</td>
						<td>
						${healthinfo.breathsounds}
						</td>
						<td>罗音:</td>
						<td>${healthinfo.rale}</td>
						<td>体温：</td>
						<td>${healthinfo.bodytemperature}℃</td>
					</tr>
					<tr>
						<td>听力:</td>
						<td>${healthinfo.hearing}</td>
						<td>杂音:</td>
						<td>
								${healthinfo.noise}
						   </td>
						<td>压痛:</td>
						<td>
								${healthinfo.tenderness}
						</td>
						<td>包块:</td>
						<td>
						        ${healthinfo.bagpiece}
						</td>
					</tr>
					<TR>
						<td>症状：</td>
						<td>${healthinfo.symptoms}</td>
						<td colspan="6"></td>
					</TR>
					<tr>
					<tr>
						<td colspan="8">日常习惯</td>
					</tr>
					<tr>
						<td>饮食习惯:</td>
						<td>${healthinfo.eationhabits}</td>
						<td>锻炼频率：</td>
						<td>${healthinfo.exercisefrequency}</td>
						<td>每次锻炼时间：</td>
						<td>${healthinfo.exercisetime}分钟</td>
						<td>坚持锻炼时间：</td>
						<td>${healthinfo.stickexercisetime}年</td>
					</tr>
					<tr>
						<td>锻炼方法：</td>
						<td>${healthinfo.exerciseway}</td>
						<td>吸烟状态：</td>
						<td>${healthinfo.smokingstatus}</td>
						<td>开始吸烟年龄：</td>
						<td>${healthinfo.beginsmokingage}岁</td>
						<td>戒烟年龄：</td>
						<td>${healthinfo.quitsmokingage}岁</td>
					</tr>
					<tr>
						<td>饮酒频率：</td>
						<td>${healthinfo.drinkingfrequency}</td>
						<td>日饮酒量：</td>
						<td>${healthinfo.dailydrinking}两</td>
						<td>开始饮酒年龄：</td>
						<td>${healthinfo.startdrinkingage}岁</td>
						<td>是否戒酒：</td>
						<td>
								${healthinfo.isquitdrinking}
						</td>
					</tr>
					
					<tr>
						<td>日吸烟量：</td>
						<td>${healthinfo.daysmokingamount}支</td>
						<td colspan="6"></td>
					</tr>
					<tr>
						<td colspan="8">评价信息</td>
					</tr>

					<tr>
						<td>健康状况评价:</td>
						<td>${healthinfo.healthassessment}</td>
						<td>自理能力评价：</td>
						<td>${healthinfo.selfevaluation}</td>
						<td>认知功能：</td>
						<td>${healthinfo.cognitivefunction}</td>
						<td colspan="2"></td>
					</tr>
				</table>
				<!-- 按钮 -->
		   <div class="row" style="margin-bottom:20px">
			<div align="center">
				<BUTTON class="btn btn-success" id="select_healthinfo" type="button">返回</BUTTON>
			</div>
		</div>
			</form>
			</div>
		</div>
		
	</div>
	
	<script type="text/javascript">
	
	 $("#select_healthinfo").click(function(){
     
				 window.location.href = "${APP_PATH}/health/healthInfo/${pn}";
  });
  
  
	</script>
  </body>
</html>
