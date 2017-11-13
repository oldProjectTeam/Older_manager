<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'about.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel='canonical' href='//www.dj14403652.icoc.bz/col.jsp?id=103'>
		<link type="text/css" href="//2.ss.faisys.com/css/base2.min.css?v=201710111627" rel="stylesheet" />
		<link type="text/css" href="//1.jzs.faisys.com/886/fkTheme.min.css?v=20170907160454&isNavV2=true&isBannerV2=true" rel="stylesheet" id="jzThemeFrame"/>
		<link type='text/css' href='//1.jzs.faisys.com/2/64_2/fkModule.min.css?v=20170921153212' rel='stylesheet' id='jzModule2_64_2'><link type='text/css' href='//2.ss.faisys.com/css/newSearchBoxStyle.min.css?v=201710111604' rel='stylesheet'>
		<link type="text/css" href="//2.ss.faisys.com/css/site/poshytipAndmCustomScrollbar.min.css?v=201707031157" rel="stylesheet" />
		<link type="text/css" href="jzcusstyle.jsp?colId=103&extId=0&_csw=0" rel="stylesheet" />
		<link type='text/css' href='//2.ss.faisys.com/css/fontsIco.min.css?v=201710111615' rel='stylesheet' />
		<script type="text/javascript" src="//1.ss.faisys.com/js/jzUtils.min.js?v=201710091348"></script>
		<script type="text/javascript" src="//1.ss.faisys.com/js/comm/jquery/jquery-core.min.js?v=201709211532"></script>
		<script type="text/javascript" src="//1.ss.faisys.com/js/comm/jquery/jquery-mousewheel.min.js?v=201408111734"></script>
		<script type="text/javascript" src="//1.ss.faisys.com/js/comm/fai.min.js?v=201710111210"></script>
		<script type="text/javascript" src="//1.ss.faisys.com/js/comm/jquery/jquery-ui-core.min.js?v=201709211532"></script>
		<script type="text/javascript" src="//1.ss.faisys.com/js/site.min.js?v=201710131524"></script>
		<script type="text/javascript" src="//1.ss.faisys.com/js/locale/2052.min.js?v=201710091348"></script>
	</head>
	<body>
		<div id="g_main" class='g_main g_col103 ' style='top:45px' >
			<div id="web" class="g_web ">
				<table class="webTopTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center">
							<div id="webTop" class="webTop">
								<div id='corpTitle' class='corpTitle corpTitle2' fontPatternTitle='false' style='top:41px;left:12px;;'  _linkType='0' >
									<span style="color: rgb(2, 178, 181);" color="rgb(2,178,181)">
										<div style="" class="newPrimaryTitle">
											<b><span style="font-size: 32px;">老人管理系统&nbsp;</span></b>
										</div>
									</span>
								</div>
							</div>
						</td>
					</tr>
				</table>
				<!-- <table class="absTopTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center">
							<div id="absTopForms" class="forms sideForms absForms">
								<div style="position:absolute;"></div>
							</div>
						</td>
					</tr>
				</table> -->
				<table class="webNavTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center">
							<div id="webNav" class="webNav webNavDefault">
								<div id='navV2' class='nav navV2'>
									<div class='navMainContent'>
										<div class='navContent'>
											<div id='navCenterContent' class='navCenterContent'>
												<div id='navCenter' class='navCenter'>
													<div class='itemPrev'></div>
													<div class='itemContainer'>
														<div title='' id='nav2' class='item itemCol2 itemIndex1' colId='2'  onclick='window.open("/", "_self")' _jump='window.open("/", "_self")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/' onclick="return false;"><span class='itemName0'>首页</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav103' class='item itemCol103 itemIndex2' colId='103'  onclick='window.open("/col.jsp?id=103", "_self")' _jump='window.open("/col.jsp?id=103", "_self")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/col.jsp?id=103' onclick="return false;"><span class='itemName0'>关于我们</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav104' class='item itemCol104 itemIndex3' colId='104'  onclick='window.open("/col.jsp?id=104", "_self")' _jump='window.open("/col.jsp?id=104", "_self")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/col.jsp?id=104' onclick="return false;"><span class='itemName0'>购物商城</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav105' class='item itemCol105 itemIndex4' colId='105'  onclick='window.open("/col.jsp?id=105", "_blank")' _jump='window.open("/col.jsp?id=105", "_blank")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/col.jsp?id=105' onclick="return false;"><span class='itemName0'>咨询服务</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav9' class='item itemCol9 itemIndex5' colId='9'  onclick='window.open("/msgBoard.jsp", "_self")' _jump='window.open("/msgBoard.jsp", "_self")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/msgBoard.jsp' onclick="return false;"><span class='itemName0'>会员登陆</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav18' class='item itemCol18 itemIndex6' colId='18'  onclick='window.open("/login.jsp", "_self")' _jump='window.open("/login.jsp", "_self")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/login.jsp' onclick="return false;"><span class='itemName0'>客户端下载</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav102' class='item itemCol102 itemIndex7' colId='102'  onclick='window.open("/col.jsp?id=102", "_blank")' _jump='window.open("/col.jsp?id=102", "_blank")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/col.jsp?id=102' onclick="return false;"><span class='itemName0'>视频直播</span></a></div>
														</div>
														<div class='itemSep'></div>
														<div title='' id='nav106' class='item itemCol106 itemIndex8' colId='106'  onclick='window.open("/col.jsp?id=106", "_self")' _jump='window.open("/col.jsp?id=106", "_self")'>
															<div class='itemCenter'><a hidefocus='true' style='outline:none;' href='/col.jsp?id=106' onclick="return false;"><span class='itemName0'>社区活动</span></a></div>
														</div>
													</div>
													<div class='itemNext'></div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<a href='/mcart.jsp' style='display:none;'>购物车</a>
							</div>
						</td>
					</tr>
				</table>
				<table class="webHeaderTable J_webHeaderTable" cellpadding="0" cellspacing="0" id="webHeaderTable">
					<tr>
						<td align="center" class="J_webHeaderTable webHeaderTd fk-moduleZoneWrap">
							<div id="fk-webHeaderZone" class="elemZone elemZoneModule J_moduleZone fk-webHeaderZone fk-moduleZone forms sideForms">
								<div class="fk-moduleZoneBg fk-elemZoneBg J_zoneContentBg elemZoneBg"></div>
							</div>
							<div id="webHeader" class="webHeader">
								<table class='headerTable' cellpadding='0' cellspacing='0'>
									<tr>
										<td class='headerCusLeft'></td>
										<td class='headerCusMiddle' align='center' valign='top'>
											<div class='headerNav headerNavDefault'></div>
										</td>
										<td class='headerCusRight'></td>
									</tr>
								</table>
							</div>
						</td>
					</tr>
				</table>
				<table class="webBannerTable J_webBannerTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center" class="fk-moduleZoneWrap">
							<div id="webBanner" class="webBanner">
								<table class="bannerTable" cellpadding="0" cellspacing="0">
									<tr>
										<td class="bannerLeft"></td>
										<td class="bannerCenter" align='center' valign='top'>
											<div style="visibility:hidden;" class="fk-inBannerListZone-tmp"></div>	
											<div class='bannerTop'></div>
											<div id='bannerV2' class='banner extBanner' fbHeight='400' defaultwidth='0' style=' height: 400px; background: none;' >
												<div class='banner defaultBannerMain J_bannerItem' style='background:url(http://13209747.s61i.faiusr.com/2/AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM.jpg) 50% 50% no-repeat;background-size: cover;height:400px;'></div>
											</div>
										</td>
										<td class="bannerRight"></td>
									</tr>
								</table>
							</div>
						</td>
					</tr>
				</table>
				<!-- <table class="absMiddleTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center">
							<div id="absForms" class="forms sideForms absForms"></div>
						</td>
					</tr>
				</table> -->
				<!-- <div id="fullmeasureTopForms" class="fullmeasureContainer forms fk-fullmeasureForms fullmeasureForms fullmeasureTopForms" 
				style='display:none'>
					<wbr style='display:none;' />
				</div> -->
				<table id="webContainerTable" class="webContainerTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center">
							<div id="webContainer" class="webContainer">
								<div id="container" class="container">
									<!-- <table class="containerTop" cellpadding='0' cellspacing='0'>
										<tr valign='top'>
											<td class="left"></td>
											<td class="center"></td>
											<td class="right"></td>
										</tr>
									</table> -->
									<table class="containerMiddle" cellpadding='0' cellspacing='0'>
										<tr valign='top'>
											<td id="containerMiddleLeft" class="containerMiddleLeft"></td>
											<td class="containerMiddleCenter">
												<div id="containerMiddleCenterTop" class="containerMiddleCenterTop"></div>
												<div id="containerForms" class="containerForms">
													<div id="topForms" class="column forms mainForms topForms" style='display:none'></div>
													<table class="containerFormsMiddle" cellpadding='0' cellspacing='0'>
														<tr>
															<td valign="top" id="containerFormsLeft" class="containerFormsLeft" style='display:none'>
																<div class="containerFormsLeftTop"></div>
																<div id="leftForms" class="column forms sideForms leftForms"></div>
																<div class="containerFormsLeftBottom"></div>
															</td>
															<td valign="top" id="containerFormsCenter" class="containerFormsCenter">
																<div id="centerTopForms" class="column forms mainForms centerTopForms" >
																	<div id='module324' _indexClass='formIndex1' _moduleType='1' _modulestyle='35' _moduleid='324'  class='form form324 formIndex1 formStyle35 layoutModule  formStyle35_2  fk-formCol ' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='0' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false'>
																		<!-- <table class='formTop formTop324' cellpadding='0' cellspacing='0'>
																			<tr>
																				<td class='left'></td>
																				<td class='center'></td>
																				<td class='right'></td>
																			</tr>
																		</table> -->
																		<table class=' formMiddle formMiddle324' style='' cellpadding='0' cellspacing='0'>
																			<tr>
																				<td class='formMiddleLeft formMiddleLeft324'></td>
																				<td class='formMiddleCenter formMiddleCenter324  f-colFormMiddleCenter ' valign='top'>
																					<div class='formMiddleContent formMiddleContent324 multiColFormMiddleContent f-colFormMiddleContent  fk-formContentOtherPadding' tabStyle='0'>
																						<div class='mulMColContent' id='mulMColContent324'>
																							<table width="100%" border="0" cellspacing="0" class="mulMColContentTable" cellpadding="0">
																								<tbody>
																									<tr>
																										<td class=" mulColLayout mulColPadding" style="width:590px;">
																											<div id="mulMCol324_cid_1" class="mulMColList">
																												<div id='module325' _indexClass='' _moduleType='1' _modulestyle='1' _moduleid='325' systemPattern=1099 class='form form325 formStyle1 formInMulMCol  jz-modulePattern1099' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='324' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false' >
																													<table class='formTop formTop325' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left'></td>
																															<td class='center'></td>
																															<td class='right'></td>
																														</tr>
																													</table>
																													<table class='formBanner formBanner325' cellpadding='0' cellspacing='0' style=''>
																														<tr>
																															<td class='left left325'></td>
																															<td class='center center325' valign='top'>
																																<table cellpadding='0' cellspacing='0' class='formBannerTitle formBannerTitle325'>
																																	<tr>
																																		<td class='titleLeft titleLeft325' valign='top'></td>
																																		<td class='titleCenter titleCenter325' valign='top'>
																																			<div class='titleText titleText325'>
																																				<span class='bannerNormalTitle fk_mainTitle mainTitle mainTitle325'>公司介绍</span>
																																				<div class='bannerTextOutWrap j_doubleTitleSkin'>
																																					<span class='bannerTextInnerWrap'>
																																						<span class='doubleTitleWrap doubleTitleWrap325'>
																																							<p class='mainTitleWrap'>
																																								<span class='mainTitle_fontIcon ' style=''></span>
																																								<span class='fk_mainTitle mainTitle mainTitle325'>公司介绍</span>
																																							</p>
																																							<p class='subTitleWrap'>
																																								<span class='subTitleLineTop dividingLine dividingLine325'></span>
																																								<span class='subTitleText fk_auxiliaryTitle auxiliaryTitle auxiliaryTitle325'>副标题</span>
																																								<span class='subTitleLineBottom dividingLine dividingLine325'></span>
																																							</p>
																																							<p class='titleUnderAidLine0 dividingLine dividingLine325'></p>
																																						</span>
																																						<p class='titleInnerAidLine0 dividingLine dividingLine325'></p>
																																						<p class='titleInnerAidLine1 dividingLine dividingLine325'></p>
																																						<p class='titleInnerAidLine dividingLineDefault dividingLineDefault325'></p>
																																					</span>
																																				</div>
																																			</div>
																																		</td>
																																		<td class='titleRight titleRight325' valign='top'></td>
																																	</tr>
																																</table>
																															</td>
																															<td class='right right325'></td>
																														</tr>
																													</table>
																													<table class=' formMiddle formMiddle325' style='' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='formMiddleLeft formMiddleLeft325'></td>
																															<td class='formMiddleCenter formMiddleCenter325 ' valign='top'>
																																<div class='formMiddleContent formMiddleContent325 fk-formContentOtherPadding' tabStyle='0'>
																																	<div class='richContent richContent0'><p><img src="http://13209747.s61i.faiusr.com/2/AD0Ik6GmBhACGAAg8YTZzQUo6teVuwIwsAQ43gI.jpg" width="560" height="350" / alt=" "></p></div>
																																</div>
																															</td>
																															<td class='formMiddleRight formMiddleRight325'></td>
																														</tr>
																													</table>
																													<table class='formBottom formBottom325' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left left325'></td>
																															<td class='center center325'></td>
																															<td class='right right325'></td>
																														</tr>
																													</table>
																													<div class='clearfloat clearfloat325'></div>
																												</div>
																												<div id='module327' _indexClass='' _moduleType='1' _modulestyle='1' _moduleid='327' systemPattern=1099 class='form form327 formStyle1 formInMulMCol  jz-modulePattern1099' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='324' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false' >
																													<table class='formTop formTop327' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left'></td>
																															<td class='center'></td>
																															<td class='right'></td>
																														</tr>
																													</table>
																													<table class='formBanner formBanner327' cellpadding='0' cellspacing='0' style=''>
																														<tr>
																															<td class='left left327'></td>
																															<td class='center center327' valign='top'>
																																<table cellpadding='0' cellspacing='0' class='formBannerTitle formBannerTitle327'>
																																	<tr>
																																		<td class='titleLeft titleLeft327' valign='top'></td>
																																		<td class='titleCenter titleCenter327' valign='top'>
																																			<div class='titleText titleText327'>
																																				<span class='bannerNormalTitle fk_mainTitle mainTitle mainTitle327'>荣誉证书</span>
																																				<div class='bannerTextOutWrap j_doubleTitleSkin'>
																																					<span class='bannerTextInnerWrap'>
																																						<span class='doubleTitleWrap doubleTitleWrap327'>
																																							<p class='mainTitleWrap'>
																																								<span class='mainTitle_fontIcon ' style=''></span>
																																								<span class='fk_mainTitle mainTitle mainTitle327'>荣誉证书</span>
																																							</p>
																																							<p class='subTitleWrap'>
																																								<span class='subTitleLineTop dividingLine dividingLine327'></span>
																																								<span class='subTitleText fk_auxiliaryTitle auxiliaryTitle auxiliaryTitle327'>副标题</span>
																																								<span class='subTitleLineBottom dividingLine dividingLine327'></span>
																																							</p>
																																							<p class='titleUnderAidLine0 dividingLine dividingLine327'></p>
																																						</span>
																																						<p class='titleInnerAidLine0 dividingLine dividingLine327'></p>
																																						<p class='titleInnerAidLine1 dividingLine dividingLine327'></p>
																																						<p class='titleInnerAidLine dividingLineDefault dividingLineDefault327'></p>
																																					</span>
																																				</div>
																																			</div>
																																		</td>
																																		<td class='titleRight titleRight327' valign='top'></td>
																																	</tr>
																																</table>
																															</td>
																															<td class='right right327'></td>
																														</tr>
																													</table>
																													<table class=' formMiddle formMiddle327' style='' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='formMiddleLeft formMiddleLeft327'></td>
																															<td class='formMiddleCenter formMiddleCenter327 ' valign='top'>
																																<div class='formMiddleContent formMiddleContent327 fk-formContentOtherPadding' tabStyle='0'>
																																	<div class='richContent richContent0'>
																																		<p><span style="font-size:20px;font-family:微软雅黑;color:#666666;"></span></p>
																																		<p>
																																			<span style="font-family:微软雅黑;font-size:20px;"></span>
																																			<img id="0.5248684993968169" src="http://15041690.s21i-15.faiusr.com/4/ABUIABAEGAAg197xzgUoqJnPvwQw4wQ45QM.png" width="611" height="485" alt=" "/>
																																			<span style="font-family:微软雅黑;font-size:20px;">
																																				<br/>
																																			</span>
																																			<br/>
																																		</p>
																																	</div>
																																</div>
																															</td>
																															<td class='formMiddleRight formMiddleRight327'></td>
																														</tr>
																													</table>
																													<table class='formBottom formBottom327' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left left327'></td>
																															<td class='center center327'></td>
																															<td class='right right327'></td>
																														</tr>
																													</table>
																													<div class='clearfloat clearfloat327'></div>
																												</div>
																												<div id='module329' _indexClass='' _moduleType='1' _modulestyle='1' _moduleid='329'  class='form form329 formStyle1 formInMulMCol ' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='324' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false'>
																													<table class='formTop formTop329' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left'></td>
																															<td class='center'></td>
																															<td class='right'></td>
																														</tr>
																													</table>
																													<table class=' formMiddle formMiddle329' style='' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='formMiddleLeft formMiddleLeft329'></td>
																															<td class='formMiddleCenter formMiddleCenter329 ' valign='top'>
																																<div class='formMiddleContent formMiddleContent329 fk-formContentOtherPadding' tabStyle='0'>
																																	<div class='richContent richContent0'>
																																		<p><img id="0.7532498517594386" src="http://15041690.s21i-15.faiusr.com/4/ABUIABAEGAAgmODxzgUou5yJzQMwwAM42gE.png" width="448" height="218" / alt=" "></p>
																																	</div>
																																</div>
																															</td>
																															<td class='formMiddleRight formMiddleRight329'></td>
																														</tr>
																													</table>
																													<table class='formBottom formBottom329' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left left329'></td>
																															<td class='center center329'></td>
																															<td class='right right329'></td>
																														</tr>
																													</table>
																													<div class='clearfloat clearfloat329'></div>
																												</div>
																											</div>
																											<div class="mulModuleColStyleLine" style=""></div>
																										</td>
																										<td class="mulColLayout" style="">
																											<div id="mulMCol324_cid_2" class="mulMColList">
																												<div id='module326' _indexClass='' _moduleType='1' _modulestyle='1' _moduleid='326'  class='form form326 formStyle1 formInMulMCol ' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='324' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false'>
																													<table class='formTop formTop326' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left'></td>
																															<td class='center'></td>
																															<td class='right'></td>
																														</tr>
																													</table>
																													<table class=' formMiddle formMiddle326' style='' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='formMiddleLeft formMiddleLeft326'></td>
																															<td class='formMiddleCenter formMiddleCenter326 ' valign='top'>
																																<div class='formMiddleContent formMiddleContent326 fk-formContentOtherPadding' tabStyle='0'>
																																	<div class='richContent richContent0'>
																																		<p>
																																			<span style="font-size:14px;font-family:微软雅黑;"></span>
																																			<span style="color:#555555;font-family:微软雅黑;font-size:16px;line-height:26px;text-indent:32px;">　 　公司成立于2001年10月，目前注册资金3808万元，专职员工100多人，是经认定的“国家级高新技术企业”、“国家乙级涉密信息系统集成资质企业”、“安徽省双软企业”、“安徽省双高企业”、“安徽省三优企业”、AAA级信用企业、国家级重合同守信用企业，连续多年被评为“安徽省优秀软件企业”，并通过了ISO9001：2008国际质量管理体系认证，并获得安徽省著名商标称号。依托公司具备的核心技术和科研实力，经合肥市科技局批准由我公司组建“合肥市人口社会事务信息管理工程技术研究中心”，承担社会管理创新方面的课题研究和建设工作。</span>
																																		</p>
																																	</div>
																																</div>
																															</td>
																															<td class='formMiddleRight formMiddleRight326'></td>
																														</tr>
																													</table>
																													<table class='formBottom formBottom326' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left left326'></td>
																															<td class='center center326'></td>
																															<td class='right right326'></td>
																														</tr>
																													</table>
																													<div class='clearfloat clearfloat326'></div>
																												</div>
																												<div id='module328' _indexClass='' _moduleType='1' _modulestyle='1' _moduleid='328'  class='form form328 formStyle1 formInMulMCol ' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='324' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false' >
																													<table class='formTop formTop328' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left'></td>
																															<td class='center'></td>
																															<td class='right'></td>
																														</tr>
																													</table>
																													<table class=' formMiddle formMiddle328' style='' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='formMiddleLeft formMiddleLeft328'></td>
																															<td class='formMiddleCenter formMiddleCenter328 ' valign='top'>
																																<div class='formMiddleContent formMiddleContent328 fk-formContentOtherPadding' tabStyle='0'>
																																	<div class='richContent richContent0'>
																																		<p><img id="0.6011717990608441" src="http://15041690.s21i-15.faiusr.com/4/ABUIABAEGAAgo9-xzgUomcvXwwMw3gQ4zgM.png" width="606" height="462" / alt=" "></p>
																																	</div>
																																</div>
																															</td>
																															<td class='formMiddleRight formMiddleRight328'></td>
																														</tr>
																													</table>
																													<table class='formBottom formBottom328' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left left328'></td>
																															<td class='center center328'></td>
																															<td class='right right328'></td>
																														</tr>
																													</table>
																													<div class='clearfloat clearfloat328'></div>
																												</div>
																												<div id='module330' _indexClass='' _moduleType='1' _modulestyle='1' _moduleid='330'  class='form form330 formStyle1 formInMulMCol ' title='' _sys='0' _banId='' style='' _side='0' _inTab='0' _inMulMCol='324' _inFullmeasure='0' _inpack='0' _inpopupzone='0' _autoHeight='1' _global='false' _independent='false'>
																													<table class='formTop formTop330' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left'></td>
																															<td class='center'></td>
																															<td class='right'></td>
																														</tr>
																													</table>
																													<table class=' formMiddle formMiddle330' style='' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='formMiddleLeft formMiddleLeft330'></td>
																															<td class='formMiddleCenter formMiddleCenter330 ' valign='top'>
																																<div class='formMiddleContent formMiddleContent330 fk-formContentOtherPadding' tabStyle='0'>
																																	<div class='richContent richContent0'>
																																		<p><span style="font-size:20px;color:#666666;">　　为什么选择我们？</span></p>
																																		<p><span style="font-size:20px;"></span><br /></p>
																																		<p><span style="font-family:微软雅黑;font-size:14px;color:#888888;"></span></p>
																																		<p style="text-indent:2em;color:#555555;font-family:微软雅黑;font-size:16px;line-height:26px;padding-top:6px;padding-bottom:6px;">宝剑锋从磨砺出，梅花香自苦寒来。兴博公司不断积累经验、敢于创新，现已成为一支具有结构精干、经验丰富的开发生产队伍。公司在努力为用户提供优质产品的同时还注重全面提升质量管理水平，力争打响企业品牌，为社会经济、科技发展做出积极卓越的贡献。</p>
																																		<p style="text-indent:2em;color:#555555;font-family:微软雅黑;font-size:16px;line-height:26px;padding-top:6px;padding-bottom:6px;">回顾历史，展望未来，我们将继续一步一个脚印地走好每一步！以人为本，依托市场、科技和品牌发展战略，朝向“多元化、品牌化、国际化”目标奋进，并以此为长期的战略目标。</p>
																																		<p><span style="font-family:微软雅黑;font-size:14px;color:#888888;"></span><br /></p>
																																		<p><br/></p>
																																	</div>
																																</div>
																															</td>
																															<td class='formMiddleRight formMiddleRight330'></td>
																														</tr>
																													</table>
																													<table class='formBottom formBottom330' cellpadding='0' cellspacing='0'>
																														<tr>
																															<td class='left left330'></td>
																															<td class='center center330'></td>
																															<td class='right right330'></td>
																														</tr>
																													</table>
																													<div class='clearfloat clearfloat330'></div>
																												</div>
																											</div>
																										</td>
																									</tr>
																								</tbody>
																							</table>
																						</div>
																					</div>
																				</td>
																				<td class='formMiddleRight formMiddleRight324'></td>
																			</tr>
																		</table>
																		<table class='formBottom formBottom324' cellpadding='0' cellspacing='0'>
																			<tr>
																				<td class='left left324'></td>
																				<td class='center center324'></td>
																				<td class='right right324'></td>
																			</tr>
																		</table>
																		<div class='clearfloat clearfloat324'></div>
																	</div>
																</div>
																<div class="containerFormsCenterMiddle J_containerFormsCenterMiddle">
																	<div id="middleLeftForms" class="column forms mainForms middleLeftForms" style='display:none'></div>
																	<div id="middleRightForms" class="column forms mainForms middleRightForms" style='display:none'></div>	
																	<div class="clearfloat"></div>
																</div>
																<div id="centerBottomForms" class="column forms mainForms centerBottomForms" style='display:none'></div>
															</td>
															<td valign="top" id="containerFormsRight" class="containerFormsRight" style='display:none'>
																<div class="containerFormsRightTop"></div>
																<div id="rightForms" class="column forms sideForms rightForms"></div>
																<div class="containerFormsRightBottom"></div>
															</td>
														</tr>
													</table>	
													<div id="bottomForms" class="column forms mainForms bottomForms" style='display:none'></div>
													<div id="containerPlaceholder" class="containerPlaceholder" ></div>
												</div>
												<div id="containerMiddleCenterBottom" class="containerMiddleCenterBottom"></div>
											</td>
											<td id="containerMiddleRight" class="containerMiddleRight"></td>
										</tr>
									</table>
									<table class="containerBottom" cellpadding='0' cellspacing='0'>
										<tr valign='top'>
											<td class="left"></td>
											<td class="center"></td>
											<td class="right"></td>
										</tr>
									</table>
								</div>
							</div>
						</td>
					</tr>
				</table>
				<div id="fullmeasureBottomForms" class="fullmeasureContainer forms fk-fullmeasureForms fullmeasureForms fullmeasureBottomForms" style='display:none'>
					<wbr style='display:none;' />
				</div>
				<table class="absBottomTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center">
							<div id="absBottomForms" class="forms sideForms absForms">
								<div style="position:absolute;"></div>
							</div>
						</td>
					</tr>
				</table>
				<table id="webFooterTable" class="webFooterTable J_webFooterTable" cellpadding="0" cellspacing="0">
					<tr>
						<td align="center" valign="top" class="fk-moduleZoneWrap">
							<div id="fk-webFooterZone" class="elemZone elemZoneModule J_moduleZone fk-webFooterZone fk-moduleZone forms sideForms">
								<div class="fk-moduleZoneBg fk-elemZoneBg J_zoneContentBg elemZoneBg"></div>
							</div>
							<div id="webFooter" class="webFooter">
								<div id='footer' class='footer' >
									<table class='footerTop' cellpadding='0' cellspacing='0'>
										<tr valign='top'>
											<td class='topLeft'></td>
											<td class='topCenter'></td>
											<td class='topRight'></td>
										</tr>
									</table>
									<table class='footerMiddle' cellpadding='0' cellspacing='0'>
										<tr valign='top'>
											<td class='middleLeft'></td>
											<td class='middleCenter' align='center'>
												<div class='footerContent'>
													<div class='footerInfo'>
														<p><font face="Arial">©</font>2017 网站模板-医院 版权所有</p>
													</div>
													<div class='footerSupport' id='footerSupport'>
														<span class='footerMobile'><a hidefocus='true' href='http://m.dj14403652.icoc.bz' target='_blank'>手机版</a></span>
														<span class='footerSep'>|</span>
														<span class='footerFaisco'>本站使用<a hidefocus='true' href='http://jz.faisco.com/?_ta=4' onclick='Site.logDog(100065, 0);' target='_blank'><span class='faisco-icons-logo' id='faisco-icons-logo' style='padding-left:2px;padding-right:2px;position:relative;top:2px;'></span>凡科建站</a>
															<span style='padding-left:8px;'>搭建</span>
														</span>
														<span class='footerSep'>|</span>
														<span id='footerLogin' class='footerLogin'><a name='popupLogin' rel='nofollow' hidefocus='true' href='http://www.faisco.cn?cacct=dj14403652' onclick='Fai.closeTip("#footerLogin");'>管理登录</a></span>
														<span class='bgplayerButton' id='bgplayerButton' style='display:none;'></span>
													</div>
												</div>
											</td>
											<td class='middleRight'></td>
										</tr>
									</table>
									<table class='footerBottom' cellpadding='0' cellspacing='0'>
										<tr valign='top'>
											<td class='bottomLeft'></td>
											<td class='bottomCenter'></td>
											<td class='bottomRight'></td>
										</tr>
									</table>
								</div>
							</div>
						</td>
					</tr>
				</table>
				<div class="clearfloat"></div>
			</div>	
		</div>
		<div class="floatLeftTop manageTranTop" style='top:45px' >
			<div id="floatLeftTopForms" class="forms sideForms floatForms"></div>
			</div>
			<div class="floatRightTop manageTranTop" style='top:45px' >
				<div id="floatRightTopForms" class="forms sideForms floatForms"></div>
			</div>
			<div class="floatLeftBottom">
				<div id="floatLeftBottomForms" class="forms sideForms floatForms"></div>
			</div>
			<div class="floatRightBottom">
				<div id="floatRightBottomForms" class="forms sideForms floatForms"></div>
			</div>
			<div id="popupLevel" class="popupLevel">
				<div id="popupLevelWrap" class='popupLevelWrap'>
					<div id="popupLevelEditToolArea" class="popupLevelEditToolArea">
						<div id="popupLevelEditPanel" class="popupLevelEditPanel"></div>
						<div id="popupLevelEditTool" class="popupLevelEditTool"></div>
					</div>
					<div id="popupLevelForms" class="forms sideForms popupLevelForms"></div>
				</div>
			</div>
			<div id="bgMusic"  class="bgMusic"></div>
			
			<script type="text/javascript">
				var fk_sale = new Object();	
				fk_sale.cid = 15041690;
				fk_sale.siteVer = 10;
				fk_sale.popupWindowSiteVer = 10;	
				fk_sale.isLuckyGuyFlag = false;
				fk_sale.popupWindowEndYear = 2017;
				fk_sale.popupWindowEndMonth = 10;
				fk_sale.popupWindowEndDay = 31;
				fk_sale.popupWindowDays = 17;
				fk_sale.popupWindowMs = 1498890724;
				fk_sale.openDays = 4;
				fk_sale.openMinutes = 6092;
				fk_sale.popupWindowEndSignupHours = 720.0;
				fk_sale.url = 'http://www.faisco.cn/portal.jsp#appId=shop';	
				fk_sale.showDomainWindowFlag = false;
				fk_sale.cacct = 'dj14403652';
				fk_sale.imgBigSrc = 'http://jz.faisys.com/image/pro/20170101/salesPromotion.png?v=201701101133';
				fk_sale.imgBigBtn = 'http://jz.faisys.com/image/pro/20170101/btn_buy.png?v=201701101133';
				fk_sale.imgClose = 'http://jz.faisys.com/image/pro/20170101/close.png?v=201701101133';
				fk_sale.siteFirstLogin = false;
				fk_sale.isShowAdvertisementWindowThreeMinute = false;
				fk_sale.textUrl = 'http://www.faisco.cn/portal.jsp#appId=shop';
				fk_sale.domainImgBigBg = 'http://jz.faisys.com/image/pro/20160101/domainSearchImg.png';
				fk_sale.domainImgClose = 'http://jz.faisys.com/image/pro/20160101/close.png?v=201601181937';
				fk_sale.siteBizBigClose = 'http://jz.faisys.com/image/pro/20160701/close_popup.png';
				fk_sale.siteBizBigBg = 'http://jz.faisys.com/image/pro/20160701/popup01.png';
				fk_sale.showSiteBizWindow = false;
				fk_sale.showSitePopWindow = false;
				fk_sale.openFlyer = false;
			</script>

			<div class='fk-siteAdBoxCA'>
				<div class='siteAdvertisement_box' id='sitePopVister' style='overflow:hidden;'>
					<div class='siteAdvertisement_Inner'>
						<div class='siteAdvertisement_title'>
							<a class='reportUrl' href='http://www.faisco.com/ts.html?t=3&a=dj14403652'  target='_blank' >举报</a>	
							<a class='closeImg' href='javascript:void(0)' onclick=''></a>
						</div>
						<a class='siteAdvertisement_adImg' target='_blank' href='http://jz.faisco.com/?_ta=4' onclick='Site.logDog(200004,1)'><img src='http://jz.faisys.com/image/pro/20151101/faisco_visitor.jpg' alt='轻松建网站' /></a>
					</div>
					<a  class='freeJZ'  href='http://jz.faisco.com/?_ta=4' onclick='Site.logDog(200004,1)'  target='_blank'><span>免费建站</span></a>
				</div>
			</div>
			
			<script type='text/javascript'>
				if( $.cookie('faiscoAd') == 'true'){$('.siteAdvertisement_box').show();}$('#sitePopVister').show();
			</script>

			<script type="text/javascript">
				Fai.top = window;
				var _Global = {},
					bgmCloseToOpen = false,
					statId = -1,
					_debug = false,
					_isPre = false,
					_devMode = false,
					_colOtherStyleData = {"independentList":[],"hh":false,"fh":false,"y":0,"h":0,"layout4Width":0,"layout5Width":0},	    // 当前页面的数据    
					_templateOtherStyleData = {"independentList":[],"hh":false,"fh":false,"h":824,"y":0,"layout4Width":0,"layout5Width":0},	// 全局的数据	_allowedHtmlUrl = false,
					_openHtmlUrl = false,
					_advertType = 4;
				var _templateDefLayout = {BANNER_NAV:0,NAV_FLOAT:1,LEFT_NAV_BANNER_RIGHT_HIDE:3,LEFT_NAV_CENTER_BANNER_RIGHT_HIDE:4,LEFT_BANNER_NAV_RIGHT_HIDE:5,LEFT_NAV_EXPEND_CENTER_BANNER:6,CENTER_TOP_BANNER_RIGHT_HIDE:7,LEFT_HIDE_CENTER_TOP_BANNER:8,NAV_FLOAT_ON_BANNER:9,NAV_BANNER:10};
				$(function() {
					Site.ajaxLoadModuleDom(103, 0, {"_ajaxLoadModuleList":[],"_partDomInfoList":[],"fullUrl":"http://www.dj14403652.icoc.bz/col.jsp?id=103"});
					Site.showOrHideMailBox();
					Site.loginSiteInit('dj14403652','faisco.cn', false,"");
					//topBarMember 
					//判断首次登录弹出广告弹窗begin
					function setAdvertisementContent(){
						var $popupWin = $(".bigAdvertisement"),
							$upgradeBtn = $(".bigAdvertisement").find(".jz-btn").eq(0), 
							$advCloseBtn = $popupWin.find(".advCloseBtn");
							$upgradeBtn.click(function(){
								window.location.href = "http://www.faisco.cn/portal.jsp#appId=shop&tab=0?fromPageId=3";
								Site.logDog(200004, 27);
							});
							setTimeout(function(){
							hidePopup();
							},3000);
							$advCloseBtn.unbind("click").bind("click",function(){
								hidePopup();
							});
					}
					function hidePopup(){  //自动隐藏广告弹窗
						$(".bigAdvertisement").addClass("transition");
						$(".popupBg").addClass("changeOpacity");
						$.cookie('bigAdHasShow', 'true');
					}
					//广告弹出框end
					// 绑定退出事件
					Site.bindBeforeUnloadEvent(false, false, false);
					Site.initTemplateLayout(_templateDefLayout.NAV_FLOAT, true, false );
					// spider统计
					// ajax统计
					Site.total({colId:103, pdId:-1, ndId:-1, sc:0, rf:"http://dj14403652.faisco.cn/col.jsp?id=103", statId:statId});
					//保留旧用户的初始化版式区域4 和区域5 中，区域4的padding-right空间
					Site.colLayout45Width();
					//各个模块inc吐出脚本
					$('#siteTipsMarquee').marquee({ yScroll:'bottom' });Site.initCorpTitleJump();
					Site.bannerV2.init({"_open":true,"data":[{"tip":"","desc":"","imgWidth":1920,"imgHeight":400,"ot":1,"i":"AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM","src":"http://13209747.s61i.faiusr.com/2/AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM.jpg"}],"width":1920,"cusBannerWidth":0,"widthType":0,"height":400,"playTime":4000,"animateTime":1500,"from":"banner","btnType":1,"wideScreen":true,"backgroundType":0,"backgroundColor":"","backgroundOpacity":100});
					Site.hoverChangeImage();Site.hoverStyle();
					Site.initMulColModuleInIE('#module324');
					//收集浏览器信息，统计dog
					Site.sendBrowerInfo(false);
					Site.initPage();	// 这个要放在最后，因为模块组初始化时会把一些模块隐藏，导致没有高度，所以要放最后执行
					setTimeout(afterModuleLoaded, 0);
					Site.triggerGobalEvent("siteReadyLoad");
				});
				function afterModuleLoaded() {
					Site.initPage2();
				} 
				// afterModuleLoaded end
				var _lcid = 2052,
					_siteDomain = '//www.dj14403652.icoc.bz',
					_resRoot = '//0.ss.faisys.com',
					_colId = 103,
					_fromColId = -1,
					_designAuth = false,
					_manageMode = false,
					_oem = false,
					_siteVer = 10,
					_manageStatus = false;
					_Global._webRightBar = false;
				var _isMemberLogin = false;// 会员是否登陆了
				var _noCover = 0; 			// 隐藏弹窗遮罩层
					_Global._footerHidden = false;	// 底部是否隐藏 原因：需要判断有些底部js方法是否运行 true:隐藏；false: 显示
				var nav2SubMenu=[];
				var nav103SubMenu=[];
				var nav104SubMenu=[{"hidden":false,"colId":13,"href":"/mcart.jsp","target":" target='_self'","colName":"购物车","html":"<span class='itemName0'>购物车<\/span>","title":"","onclick":"return true;"}];
				var nav105SubMenu=[];
				var nav9SubMenu=[];
				var nav18SubMenu=[];
				var nav102SubMenu=[];
				var nav106SubMenu=[];
				var _useBannerVersionTwo = true; //使用横幅2.0的标志
				var _customBackgroundData = {"styleDefault":true,"s":true,"h":false,"r":3,"ps":0,"o":"","sw":-1,"swt":0,"e":0,"wbh":-1,"wbw":-1,"clw":-1,"crw":-1,"wbws":-1,"wbs":0,"id":"","p":"","bBg":{"y":0,"r":3,"ps":0,"f":"","p":"","c":""},"cBg":{"y":0,"r":3,"ps":0,"f":"","p":"","c":""},"cmBg":{"y":0,"r":3,"ps":0,"f":"","p":"","c":""},"bm":{},"cm":{},"cp":{"y":0}};          //自定义的数据
				var _templateBackgroundData = {"styleDefault":true,"s":true,"h":false,"r":3,"o":"","sw":-1,"e":0,"wbh":-1,"wbw":-1,"clw":-1,"crw":-1,"wbws":-1,"wbs":1,"id":"","p":"","bBg":{"y":0,"r":3,"f":"","p":"","c":"#000","ps":0},"cBg":{"y":0,"r":3,"f":"","p":"","c":"#000","ps":0},"cmBg":{"y":0,"r":3,"f":"","p":"","c":"#000","ps":0},"bm":{},"cm":{},"cp":{"y":0},"ps":0,"swt":0};// 模版的数据
				var _resImageRoot = '//2.ss.faisys.com';
				var _templateBannerData = {"l":[{"i":"AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ","p":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ.jpg","w":1920,"h":600,"tp":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ!100x100.jpg","du":"http://12567122.s61i.faiusr.com/0/AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ?f=AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ.jpg&v="},{"i":"AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ","p":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ.jpg","w":1920,"h":600,"tp":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ!100x100.jpg","du":"http://12567122.s61i.faiusr.com/0/AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ?f=AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ.jpg&v="}],"n":[{"t":1,"i":"AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ","ot":1,"e":0,"u":"","p":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg65jiwwUo79KHsQcwgA842AQ.jpg","w":1920,"h":600,"el":"","er":""},{"t":1,"i":"AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ","ot":1,"e":0,"u":"","p":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg75jiwwUoyNfSigIwgA842AQ.jpg","w":1920,"h":600,"el":"","er":""}],"ce":{},"s":4,"c":2,"pl":0,"bt":0,"h":true,"i":4000,"a":1500,"o":false,"t":1,"p":0,"pt":0,"ws2":false,"f":{},"at":0,"ws":false};		// 模版的数据
				var _pageBannerData = {"l":[{"i":"AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM","p":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM.jpg","w":1920,"h":400,"tp":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM!100x100.jpg","du":"http://12567122.s61i.faiusr.com/0/AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM?f=AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM.jpg&v="}],"n":[{"t":1,"i":"AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM","ot":1,"e":0,"u":"","p":"http://12567122.s61i.faiusr.com/2/AD0I0oT-BRACGAAg-rbiwwUo4IGfkAcwgA84kAM.jpg","w":1920,"h":400,"el":"","er":""}],"ce":{},"s":4,"c":1,"pl":0,"i":4000,"a":1500,"h":false,"o":false,"t":1,"p":0,"pt":0,"bt":1,"ws2":false,"f":{},"at":0,"ws":false};					// 当前页面的自定义数据（页面独立样式设置）
				var _bannerData = _pageBannerData;
				var _templateBannerV2Data = {"bl":[{"t":1,"i":"ABUIABACGAAg-9zwzgUo4eCZygcwsAk4oAY","ot":0,"p":"http://15041690.s21i-15.faiusr.com/2/ABUIABACGAAg-9zwzgUo4eCZygcwsAk4oAY.jpg","w":1200,"h":800,"tp":"http://15041690.s21i-15.faiusr.com/2/ABUIABACGAAg-9zwzgUo4eCZygcwsAk4oAY!100x100.jpg","du":"http://15041690.s21i-15.faiusr.com/0/ABUIABACGAAg-9zwzgUo4eCZygcwsAk4oAY?f=ABUIABACGAAg-9zwzgUo4eCZygcwsAk4oAY.jpg&v=","e":0,"u":""},{"t":1,"i":"ABUIABACGAAgwN3wzgUotKmJGDDYBDikAw","ot":0,"p":"http://15041690.s21i-15.faiusr.com/2/ABUIABACGAAgwN3wzgUotKmJGDDYBDikAw.jpg","w":600,"h":420,"tp":"http://15041690.s21i-15.faiusr.com/2/ABUIABACGAAgwN3wzgUotKmJGDDYBDikAw!100x100.jpg","du":"http://15041690.s21i-15.faiusr.com/0/ABUIABACGAAgwN3wzgUotKmJGDDYBDikAw?f=ABUIABACGAAgwN3wzgUotKmJGDDYBDikAw.jpg&v=","e":0,"u":""}],"s":1,"bt":0,"at":0,"i":4000,"a":1500,"blh":{"t":0,"h":600},"blw":{"t":0,"w":1200},"bzb":{"t":0},"bla":0,"ble":{"t":0,"at":0}};		// 横幅2.0模版的数据
				var _pageBannerV2Data = {"bl":[{"t":1,"i":"AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM","ot":1,"p":"http://13209747.s61i.faiusr.com/2/AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM.jpg","w":1920,"h":400,"tp":"http://13209747.s61i.faiusr.com/2/AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM!100x100.jpg","du":"http://13209747.s61i.faiusr.com/0/AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM?f=AD0Ik6GmBhACGAAg4ITZzQUo2dyP9gMwgA84kAM.jpg&v=","e":0,"u":""}],"s":1,"bt":1,"at":0,"i":4000,"a":1500,"blh":{"t":0},"blw":{"t":0},"bzb":{"t":0},"bla":0,"ble":{"t":0,"at":0}};					// 横幅2.0当前页面的自定义数据（页面独立样式设置）
				var _bannerV2Data = _pageBannerV2Data;
				var _closePhotoDetailEditSettings = true;	// 针对全站搜索，判断是否要剔除三个搜索图片的功能
				var _siteSeachRangeLength = 11;  // 全站搜索的搜索范围总数
				var _useTemplateHeaderZone = true;				// 是否使用全局模版
				var _useTemplateFooterZone = true;				// 是否使用全局模版
				var _mallOpen = true;
				var _couponOpen = false
				var toolBoxShowView = false;
				var toolBoxShowSet = false;
				var _wideBanner = true;	
				var _navStyleData = {"ncp":{"y":1,"t":41,"r":-1,"b":-1,"l":732,"hl":351,"ht":50},"no":true,"s":0,"ns":{"w":448,"h":-1},"cs":{"w":448,"h":-1,"wy":0},"np":{},"cp":{"y":0,"t":-1,"l":-1},"nis":{"w":-1,"h":-1},"gt":{"f":"微软雅黑","s":16,"w":0,"c":"#656565","y":0},"ht":{"c":"#02b2b5","y":0},"nb":{"c":"#000","f":"","r":0,"p":"","y":0},"cb":{"c":"#000","f":"","r":0,"p":"","y":0},"nib":{"c":"#000","r":0,"f":"","p":"","y":0},"nihb":{"c":"#000","r":0,"f":"","p":"","y":0},"niss":{"w":-1,"h":-1},"nisb":{"c":"#dbdbdb","r":0,"f":"","p":"","y":0},"nsigt":{"f":"微软雅黑","s":12,"w":0,"c":"#000","y":0},"nsiht":{"c":"#000","y":0},"nsis":{"w":-1,"h":-1},"nsib":{"c":"#000","r":0,"f":"","p":"","y":0},"nsihb":{"c":"#000","r":0,"f":"","p":"","y":0},"nsiho":0,"nmove":1,"v":2,"ntf":{"t":0,"ht":0},"nsmt":{},"nsmb":{},"nrs":{"n":{"t":0},"c":{"t":0},"i":{"t":0},"smt":{"t":0},"smb":{"t":0},"si":{"t":0},"is":{"t":0},"sis":{"t":0},"tmt":{"t":0},"tmb":{"t":0},"ti":{"t":0},"tis":{"t":0}},"nsw":{"n":{"t":0},"c":{"t":0},"i":{"t":0},"sm":{"t":0},"si":{"t":0},"is":{"t":0},"sis":{"t":0}},"nbr":{"n":{"t":0},"i":{"t":0},"sm":{"t":0},"si":{"t":0},"is":{"t":0},"sis":{"t":0},"tm":{"t":0},"ti":{"t":0},"tis":{"t":0}},"ntmt":{},"ntmb":{},"onft":false};				      // 栏目导航样式
				var _navStyleV2Data = {"no":true,"s":0,"snt":0,"onft":false,"nmove":1,"oinc":false,"nhi":true,"ns":{"y":1,"w":927,"h":48},"np":{"y":1,"t":49,"l":273},"nct":{"y":0,"cw":834},"nal":{"y":0},"nifc":{"y":0},"nif":{"y":0},"nis":{"y":1,"w":-1,"h":48},"nisp":{"y":0},"nir":{"y":0},"nib":{"y":0,"t":true,"b":true,"l":true,"r":true},"snfc":{"y":0},"snf":{"y":0},"snr":{"y":0},"snb":{"y":0,"t":true,"b":true,"l":true,"r":true},"nst":0,"nmw":1200};				  // 栏目导航2.0样式
				var _useNavVersionTwo = true;					  // 使用导航2.0	
					_Global._navHidden =false;                    //true:隐藏；flase：显示
					_Global._topBarV2 = false; 
				var _useFooterVersionTwo = false;
					_Global._oemHiddenSupport = false;
					_Global._hideSupportAllowed = false;
					_Global._hiddenSupport = false;
					_Global._hiddenLogin = false;
					_Global._hiddenMobile = false;
					_Global._ipcList = 0;
					_Global._hiddenICP = false;
					_Global._hiddenFooterInfo = true;
					_Global._footerInfoV2 = "©2017 - 版权所有";
					_defaultFooterInfo = "©2017 - 版权所有";
				var _cityJsLink = "//1.ss.faisys.com/js/city2.min.js?v=201710121519";
				var _siteDemo = false;
					_Global._backToTop = false;
				var _aid = 15041690;
				var _templateLayout = _templateDefLayout.NAV_FLOAT;
				var _webBannerHeight = -1;
				var _isTemplateVersion2 = true;
				var _uiMode= false;
				var _isNewUserForLayoutToNewVersion = true;
				var _choiceCurrencyVal = "￥";
				var _moduleAnimationPercent = -1;
					_Global._useTemplateBackground = true;		// 是否使用模版
					_Global._siteAdvancedSetting = false;
			</script>
			<script type="text/javascript">
				var fk_old_onload = window.onload;
				$(window).load(function(){
					//双击侧停模块出现样式设置面板
					Site.cacheModuleFunc.runSiteInit();
					if(typeof fk_old_onload == "function"){
						fk_old_onload.apply(this, arguments);
					}
					Site.pageOnload();
				});
				Site.beforeUnloadFunc();
				// 在线视频模块
				Site.loadCss("//2.ss.faisys.com/css/comm/video.js/video-js.min.css?v=201707171209");
				Site.loadCss("//2.ss.faisys.com/css/video.min.css?v=201708031633");
				// $LAB.script("//0.ss.faisys.com/error_js_video_ie8_js");
				$LAB.script("//1.ss.faisys.com/js/comm/video.js/video.min.js?v=201707311501");
				//日历控件新样式，by jser 2017-10-7
				Site.loadCss("//2.ss.faisys.com/css/datepicker.min.css?v=201710111604");
				$LAB.script("//1.ss.faisys.com/js/photoSlide.min.js?v=201702271724");
				$LAB.script("//1.ss.faisys.com/js/imageEffect.min.js?v=201710101752")
					.wait(function () {
						jzUtils.trigger({
							"name": "ImageEffect.FUNC.BASIC.Init",
							"base":Site
						});
					});
			</script>
	</body>
</html>