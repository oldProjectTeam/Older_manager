<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'aboutus.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 
	    <!-- 引入jQuery -->
		<script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
		<!-- 引入样式 -->
		<link href="../../bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="../../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<script src="../../js/echarts.min.js"></script>
		<script type="application/javascript" src="../../js/jquery-3.2.1.min.js"></script>
		<script type="application/javascript" src="../../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	</head>
  
	<body>
		<!--导航-->
		<nav class="navbar navbar-default" role="navigation">
		    <div class="container">
		        <div class="navbar-header">
		            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#jy-navbar-collapse">
		                <span class="sr-only">Toggle navigation</span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		            </button>
		        </div>
		        <div class="collapse navbar-collapse" id="jy-navbar-collapse" >
		            <ul class="nav navbar-nav navbar-left">
		                <li><a href="#"><i class="glyphicon glyphicon-home"></i>  首页</a></li>
		                <li class="active"><a href="aboutus"><i class="glyphicon glyphicon-list-alt"></i> 关于我们</a> </li>
		                <li><a href="#"><i class="glyphicon glyphicon-picture"></i> 购物商城</a> </li>
		                <li><a href="#"><i class="glyphicon glyphicon-facetime-video"></i> 视频直播</a> </li>
		                <li><a href="#"><i class="glyphicon glyphicon-list-alt"></i> 社区活动</a> </li>
		                <li><a href="#"><i class="glyphicon glyphicon-list-alt"></i> 客户端下载</a> </li>
		            </ul>
		            <ul class="nav navbar-nav navbar-right">
		                <li><a href="#"><i class="glyphicon glyphicon-fire"></i> 咨询服务</a></li>
		                <li><a href="#"><i class="glyphicon glyphicon-user"></i> 会员登录</a> </li>
		            </ul>
		        </div>
		    </div>
		</nav>
		
		<!--主体-->
		<div class="container">
			<div class="row">
				<div class="col-md-1" ></div>
				<div class="col-md-10">
					<img src="../../images/about1.png" />
				</div>
				<div class="col-md-1" ></div>
			</div>
			<div class="row">
				<h2>公司介绍</h2>
			</div>
			<div class="row">
				<div class="col-md-6">
					<img src="../../images/about2.jpg">
				</div>
				<div class="col-md-6">
					<h3>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						公司成立于2001年10月，目前注册资金3808万元，专职员工100多人，是经认定的“国家级高新技术企业”、“国家乙级涉密信息系统集成资质企业”、“安徽省双软企业”、“安徽省
						双高企业”、“安徽省三优企业”、AAA级信用企业、国家级重合同守信用企业，连续多年被评为“安徽省优秀软件企业”，并通过了ISO9001：2008国际质量管理体系认证，并获得
						安徽省著名商标称号。依托公司具备的核心技术和科研实力，经合肥市科技局批准由我公司组建“合肥市人口社会事务信息管理工程技术研究中心”，承担社会管理创新方面的课题研究和
						建设工作。
					</h3>
				</div>
			</div>
			<div class="row">
				<h2>荣誉证书</h2>
			</div>
			<div class="row">
				<div class="col-md-6">
					<img src="../../images/about3.jpg">
				</div>
				<div class="col-md-6">
					<img src="../../images/about4.jpg">
				</div>
			</div>
			<div class="row">
				<h2>为什么选择我们？</h2>
			</div>
			<div class="row">
				<div class="col-md-6">
					<img src="../../images/about5.jpg">
				</div>
				<div class="col-md-6">
					<h3>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						宝剑锋从磨砺出，梅花香自苦寒来。兴博公司不断积累经验、敢于创新，现已成为一支具有结构精干、经验丰富的开发生产队伍。公司在努力为用户提供优质产品的同时还注重全面提升质量
						管理水平，力争打响企业品牌，为社会经济、科技发展做出积极卓越的贡献。
						</br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						回顾历史，展望未来，我们将继续一步一个脚印地走好每一步！以人为本，依托市场、科技和品牌发展战略，朝向“多元化、品牌化、国际化”目标奋进，并以此为长期的战略目标。
					</h3>
				</div>
			</div>
		</div>
		<!-- 底部 -->
	
	</body>
</html>