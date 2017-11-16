<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>购物商城</title>
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet" type="text/css" />
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet" type="text/css" />

<link href="${APP_PATH}/static/css/demo.css" rel="stylesheet" type="text/css" />

<link href="${APP_PATH}/static/css/hmstyle.css" rel="stylesheet" type="text/css" />
<link href="${APP_PATH}/static/css/skin.css" rel="stylesheet" type="text/css" />
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.min.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
</head>

<body>
<jsp:include page="shopheader.jsp"></jsp:include>
	<div class="banner">
		<!--轮播 -->
		<div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
			<ul class="am-slides">
				<li class="banner1">
					<a href="introduction.html">
						<img src="${APP_PATH}/static/images/ad1.jpg" />
					</a>
				</li>
				<li class="banner2">
					<a>
						<img src="${APP_PATH}/static/images/ad2.jpg" />
					</a>
				</li>
				<li class="banner3">
					<a>
						<img src="${APP_PATH}/static/images/ad3.jpg" />
					</a>
				</li>
				<li class="banner4">
					<a>
						<img src="${APP_PATH}/static/images/ad4.jpg" />
					</a>
				</li>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
	<div class="shopNav">
		<div class="slideall">
			<div class="long-title">
				<span class="all-goods">全部分类</span>
			</div>
			<div class="nav-cont">
				<ul>
					<li class="index">
						<a href="${APP_PATH}/shop/oldfronthome">首页</a>
					</li>
					<li class="qc">
						<a href="#">闪购</a>
					</li>
					<li class="qc">
						<a href="#">限时抢</a>
					</li>
					<li class="qc">
						<a href="#">团购</a>
					</li>
					<li class="qc last">
						<a href="#">大包装</a>
					</li>
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利 <i class="am-icon-angle-right"
						style="padding-left: 10px;"></i>
				</div>
			</div>

			<!--侧边导航 -->
			<div id="nav" class="navfull">
				<div class="area clearfix">
					<div class="category-content" id="guide_2">
						<div class="category">
							<ul class="category-list" id="js_climit_li">
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="保健品">保健品</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="保健品">保健品</span>
															</dt>
															<dd>
																<a title="增强免疫力" href="#">
																	<span>增强免疫力</span>
																</a>
															</dd>
															<dd>
																<a title="肠胃消化" href="#">
																	<span>肠胃消化</span>
																</a>
															</dd>
															<dd>
																<a title="辅助改善记忆力" href="#">
																	<span>辅助改善记忆力</span>
																</a>
															</dd>
															<dd>
																<a title="辅助降血压" href="#">
																	<span>辅助降血压</span>
																</a>
															</dd>
															<dd>
																<a title="辅助降血脂" href="#">
																	<span>辅助降血脂</span>
																</a>
															</dd>
															<dd>
																<a title="辅助降血糖" href="#">
																	<span>辅助降血糖</span>
																</a>
															</dd>
															<dd>
																<a title="改善睡眠" href="#">
																	<span>改善睡眠</span>
																</a>
															</dd>
															<dd>
																<a title="增加骨密度" href="#">
																	<span>增加骨密度</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="药品">药品</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="药品">药品</span>
															</dt>
															<dd>
																<a title="感冒药" href="#">
																	<span>感冒药</span>
																</a>
															</dd>
															<dd>
																<a title="退烧药" href="#">
																	<span>退烧药</span>
																</a>
															</dd>
															<dd>
																<a title="胃药" href="#">
																	<span>胃药</span>
																</a>
															</dd>
															<dd>
																<a title="止泻药" href="#">
																	<span>止泻药</span>
																</a>
															</dd>
															<dd>
																<a title="安眠药" href="#">
																	<span>安眠药</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="医疗器械">医疗器械</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="医疗器械">医疗器械</span>
															</dt>
															<dd>
																<a title="体温计" href="#">
																	<span>体温计</span>
																</a>
															</dd>
															<dd>
																<a title="血压计" href="#">
																	<span>血压计</span>
																</a>
															</dd>
															<dd>
																<a title="血糖分析仪" href="#">
																	<span>血糖分析仪</span>
																</a>
															</dd>
															<dd>
																<a title="医用脱脂纱布" href="#">
																	<span>医用脱脂纱布</span>
																</a>
															</dd>
															<dd>
																<a title="医用脱脂棉" href="#">
																	<span>医用脱脂棉</span>
																</a>
															</dd>
															<dd>
																<a title="磁疗器具" href="#">
																	<span>磁疗器具</span>
																</a>
															</dd>
															<dd>
																<a title="轮椅" href="#">
																	<span>轮椅</span>
																</a>
															</dd>
															<dd>
																<a title="避孕套" href="#">
																	<span>避孕套</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="健身器材">健身器材</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="健身器材">健身器材</span>
															</dt>
															<dd>
																<a title="握力器" href="#">
																	<span>握力器</span>
																</a>
															</dd>
															<dd>
																<a title="哑铃" href="#">
																	<span>哑铃</span>
																</a>
															</dd>
															<dd>
																<a title="曲柄杠铃" href="#">
																	<span>曲柄杠铃</span>
																</a>
															</dd>
															<dd>
																<a title="弹簧拉力器" href="#">
																	<span>弹簧拉力器</span>
																</a>
															</dd>
															<dd>
																<a title="跑步机" href="#">
																	<span>跑步机</span>
																</a>
															</dd>
															<dd>
																<a title="健身车" href="#">
																	<span>健身车</span>
																</a>
															</dd>
															<dd>
																<a title="踏步机" href="#">
																	<span>踏步机</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="床上用品">床上用品</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="床上用品">床上用品</span>
															</dt>
															<dd>
																<a title="毯子" href="#">
																	<span>毯子</span>
																</a>
															</dd>
															<dd>
																<a title="凉席" href="#">
																	<span>凉席</span>
																</a>
															</dd>
															<dd>
																<a title="蚊帐" href="#">
																	<span>蚊帐</span>
																</a>
															</dd>
															<dd>
																<a title="被褥" href="#">
																	<span>被褥</span>
																</a>
															</dd>
															<dd>
																<a title="枕芯" href="#">
																	<span>枕芯</span>
																</a>
															</dd>
															<dd>
																<a title="床上四件套" href="#">
																	<span>床上四件套</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="厨卫用品">厨卫用品</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="厨卫用品">厨卫用品</span>
															</dt>
															<dd>
																<a title="不粘锅" href="#">
																	<span>不粘锅</span>
																</a>
															</dd>
															<dd>
																<a title="刀具" href="#">
																	<span>刀具</span>
																</a>
															</dd>
															<dd>
																<a title="碗/盘子" href="#">
																	<span>碗/盘子</span>
																</a>
															</dd>
															<dd>
																<a title="筷子/勺子/叉子/餐刀" href="#">
																	<span>筷子/勺子/叉子/餐刀</span>
																</a>
															</dd>
															<dd>
																<a title="粘钩" href="#">
																	<span>粘钩</span>
																</a>
															</dd>
															<dd>
																<a title="杯子" href="#">
																	<span>杯子</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="日常用品">日常用品</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="日常用品">日常用品</span>
															</dt>
															<dd>
																<a title="头部护理" href="#">
																	<span>头部护理</span>
																</a>
															</dd>
															<dd>
																<a title="脸部护理" href="#">
																	<span>脸部护理</span>
																</a>
															</dd>
															<dd>
																<a title="身部护理" href="#">
																	<span>身部护理</span>
																</a>
															</dd>
															<dd>
																<a title="洗漱用品" href="#">
																	<span>洗漱用品</span>
																</a>
															</dd>
															<dd>
																<a title="纸品类" href="#">
																	<span>纸品类</span>
																</a>
															</dd>
															<dd>
																<a title="盆/晾衣架" href="#">
																	<span>盆/晾衣架</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="首饰">首饰</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="首饰">首饰</span>
															</dt>
															<dd>
																<a title="头饰" href="#">
																	<span>头饰</span>
																</a>
															</dd>
															<dd>
																<a title="耳饰" href="#">
																	<span>耳饰</span>
																</a>
															</dd>
															<dd>
																<a title="颈饰" href="#">
																	<span>颈饰</span>
																</a>
															</dd>
															<dd>
																<a title="手饰" href="#">
																	<span>手饰</span>
																</a>
															</dd>
															<dd>
																<a title="胸饰" href="#">
																	<span>胸饰</span>
																</a>
															</dd>
															<dd>
																<a title="腰饰" href="#">
																	<span>腰饰</span>
																</a>
															</dd>
															<dd>
																<a title="挂饰" href="#">
																	<span>挂饰</span>
																</a>
															</dd>
															<dd>
																<a title="披肩/围巾" href="#">
																	<span>披肩/围巾</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="服装">服装</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="服装">服装</span>
															</dt>
															<dd>
																<a title="裤子" href="#">
																	<span>裤子</span>
																</a>
															</dd>
															<dd>
																<a title="裙子" href="#">
																	<span>裙子</span>
																</a>
															</dd>
															<dd>
																<a title="套装" href="#">
																	<span>套装</span>
																</a>
															</dd>
															<dd>
																<a title="羽绒服" href="#">
																	<span>羽绒服</span>
																</a>
															</dd>
															<dd>
																<a title="毛衣" href="#">
																	<span>毛衣</span>
																</a>
															</dd>
															<dd>
																<a title="外套" href="#">
																	<span>外套</span>
																</a>
															</dd>
															<dd>
																<a title="鞋子" href="#">
																	<span>鞋子</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"></i>
											<a class="ml-22" title="服装">服装</a>
										</h3>
										<em>&gt;</em>
									</div>
									<div class="menu-item menu-in top">
										<div class="area-in">
											<div class="area-bg">
												<div class="menu-srot">
													<div class="sort-side">
														<dl class="dl-sort">
															<dt>
																<span title="服装">服装</span>
															</dt>
															<dd>
																<a title="裤子" href="#">
																	<span>裤子</span>
																</a>
															</dd>
															<dd>
																<a title="裙子" href="#">
																	<span>裙子</span>
																</a>
															</dd>
															<dd>
																<a title="套装" href="#">
																	<span>套装</span>
																</a>
															</dd>
															<dd>
																<a title="羽绒服" href="#">
																	<span>羽绒服</span>
																</a>
															</dd>
															<dd>
																<a title="毛衣" href="#">
																	<span>毛衣</span>
																</a>
															</dd>
															<dd>
																<a title="外套" href="#">
																	<span>外套</span>
																</a>
															</dd>
															<dd>
																<a title="鞋子" href="#">
																	<span>鞋子</span>
																</a>
															</dd>
														</dl>
													</div>
													<div class="brand-side">
														<dl class="dl-sort">
															<dt>
																<span>实力商家</span>
															</dt>
															<dd>
																<a rel="nofollow" title="呵官方旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">呵官方旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="格瑞旗舰店" target="_blank" href="#" rel="nofollow">
																	<span>格瑞旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="飞彦大厂直供" target="_blank" href="#" rel="nofollow">
																	<span class="red">飞彦大厂直供</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="红e·艾菲妮" target="_blank" href="#" rel="nofollow">
																	<span>红e·艾菲妮</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="本真旗舰店" target="_blank" href="#" rel="nofollow">
																	<span class="red">本真旗舰店</span>
																</a>
															</dd>
															<dd>
																<a rel="nofollow" title="杭派女装批发网" target="_blank" href="#" rel="nofollow">
																	<span class="red">杭派女装批发网</span>
																</a>
															</dd>
														</dl>
													</div>
												</div>
											</div>
										</div>
									</div>
									<b class="arrow"></b>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>


			<!--轮播-->

			<script type="text/javascript">
                (function() {
                    $('.am-slider').flexslider();
                });
                $(document).ready(
                        function() {
                            $("li").hover(
                                    function() {
                                        $(".category-content .category-list li.first .menu-in")
                                                .css("display", "none");
                                        $(".category-content .category-list li.first").removeClass(
                                                "hover");
                                        $(this).addClass("hover");
                                        $(this).children("div.menu-in").css("display", "block");
                                    }, function() {
                                        $(this).removeClass("hover");
                                        $(this).children("div.menu-in").css("display", "none");
                                    });
                        });
            </script>



			<!--小导航 -->
			<div class="am-g am-g-fixed smallnav">
				<div class="am-u-sm-3">
					<a href="sort.html">
						<img src="${APP_PATH}/static/images/navsmall.jpg" />
						<div class="title">商品分类</div>
					</a>
				</div>
				<div class="am-u-sm-3">
					<a href="#">
						<img src="${APP_PATH}/static/images/huismall.jpg" />
						<div class="title">大聚惠</div>
					</a>
				</div>
				<div class="am-u-sm-3">
					<a href="shop/index">
						<img src="${APP_PATH}/static/images/mansmall.jpg" />
						<div class="title">个人中心</div>
					</a>
				</div>
				<div class="am-u-sm-3">
					<a href="#">
						<img src="${APP_PATH}/static/images/moneysmall.jpg" />
						<div class="title">投资理财</div>
					</a>
				</div>
			</div>

			<!--走马灯 -->

			<div class="marqueen">
				<span class="marqueen-title">商城头条</span>
				<div class="demo">

					<ul>
						<li class="title-first">
							<a target="_blank" href="#">
								<img src="${APP_PATH}/static/images/TJ2.jpg"></img> <span>[特惠]</span>商城爆品1分秒
							</a>
						</li>
						<span>[公告]</span>商城与广州市签署战略合作协议
						<img src="${APP_PATH}/static/images/TJ.jpg"></img>
						<p>XXXXXXXXXXXXXXXXXX</p>
						</a>
			</li>

			<div class="mod-vip">
				<div class="m-baseinfo">
					<a href="../person/index.html">
						<img src="${APP_PATH}/static/images/getAvatar.do.jpg">
					</a>
					<em> Hi,<span class="s-name"><c:if test="${uses}==null">小叮当</c:if>${users.account}</span> <a href="#">
							<p>点击更多优惠活动</p>
						</a>
					</em>
				</div>
				<c:if test="${uses}==null || ${uses}==''">
					<div class="member-logout">
						<a class="am-btn-warning btn" href="login.html">登录</a>
						<a class="am-btn-warning btn" href="register.html">注册</a>
					</div>
				</c:if>

				<div class="member-login">
					<a href="#">
						<strong>0</strong>待收货
					</a>
					<a href="#">
						<strong>0</strong>待发货
					</a>
					<a href="#">
						<strong>0</strong>待付款
					</a>
					<a href="#">
						<strong>0</strong>待评价
					</a>
				</div>
				<div class="clear"></div>
			</div>

			<li>
				<a target="_blank" href="#">
					<span>[特惠]</span>洋河年末大促，低至两件五折
				</a>
			</li>
			<li>
				<a target="_blank" href="#">
					<span>[公告]</span>华北、华中部分地区配送延迟
				</a>
			</li>
			<li>
				<a target="_blank" href="#">
					<span>[特惠]</span>家电狂欢千亿礼券 买1送1！
				</a>
			</li>

			</ul>
			<div class="advTip">
				<img src="${APP_PATH}/static/images/advTip.jpg" />
			</div>
		</div>
	</div>
	<div class="clear"></div>
	</div>
	<script type="text/javascript">
        if ($(window).width() < 640) {
            function autoScroll(obj) {
                $(obj).find("ul").animate({
                    marginTop : "-39px"
                }, 500, function() {
                    $(this).css({
                        marginTop : "0px"
                    }).find("li:first").appendTo(this);
                })
            }
            $(function() {
                setInterval('autoScroll(".demo")', 3000);
            })
        }
    </script>
	</div>
	<div class="shopMainbg">
		<div class="shopMain" id="shopmain">

			<!--今日推荐 -->

			<div class="am-g am-g-fixed recommendation">
				<div class="clock am-u-sm-3"">
					<img src="${APP_PATH}/static/images/2016.png "></img>
					<p>
						今日<br>推荐
					</p>
				</div>
				<div class="am-u-sm-4 am-u-lg-3 ">
					<div class="info ">
						<h3>真的有鱼</h3>
						<h4>开年福利篇</h4>
					</div>
					<div class="recommendationMain one">
						<a href="introduction.html">
							<img src="${APP_PATH}/static/images/tj.png "></img>
						</a>
					</div>
				</div>
				<div class="am-u-sm-4 am-u-lg-3 ">
					<div class="info ">
						<h3>囤货过冬</h3>
						<h4>让爱早回家</h4>
					</div>
					<div class="recommendationMain two">
						<img src="${APP_PATH}/static/images/tj1.png "></img>
					</div>
				</div>
				<div class="am-u-sm-4 am-u-lg-3 ">
					<div class="info ">
						<h3>浪漫情人节</h3>
						<h4>甜甜蜜蜜</h4>
					</div>
					<div class="recommendationMain three">
						<img src="${APP_PATH}/static/images/tj2.png "></img>
					</div>
				</div>

			</div>
			<div class="clear "></div>
			<!--热门活动 -->

			<div class="am-container activity ">
				<div class="shopTitle ">
					<h4>活动</h4>
					<h3>每期活动 优惠享不停</h3>
					<span class="more "> <a href="# ">
							全部活动<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
						</a>
					</span>
				</div>
				<div class="am-g am-g-fixed ">
					<div class="am-u-sm-3 ">
						<div class="icon-sale one "></div>
						<h4>秒杀</h4>
						<div class="activityMain ">
							<img src="${APP_PATH}/static/images/activity1.jpg "></img>
						</div>
						<div class="info ">
							<h3>春节送礼优选</h3>
						</div>
					</div>

					<div class="am-u-sm-3 ">
						<div class="icon-sale two "></div>
						<h4>特惠</h4>
						<div class="activityMain ">
							<img src="${APP_PATH}/static/images/activity2.jpg "></img>
						</div>
						<div class="info ">
							<h3>春节送礼优选</h3>
						</div>
					</div>

					<div class="am-u-sm-3 ">
						<div class="icon-sale three "></div>
						<h4>团购</h4>
						<div class="activityMain ">
							<img src="${APP_PATH}/static/images/activity3.jpg "></img>
						</div>
						<div class="info ">
							<h3>春节送礼优选</h3>
						</div>
					</div>

					<div class="am-u-sm-3 last ">
						<div class="icon-sale "></div>
						<h4>超值</h4>
						<div class="activityMain ">
							<img src="${APP_PATH}/static/images/activity.jpg "></img>
						</div>
						<div class="info ">
							<h3>春节送礼优选</h3>
						</div>
					</div>

				</div>
			</div>
			<div class="clear "></div>


			<div id="f1">
				<!--甜点-->

				<div class="am-container ">
					<div class="shopTitle ">
						<h4>甜品</h4>
						<h3>每一道甜品都有一个故事</h3>
						<div class="today-brands ">
							<a href="# ">桂花糕</a>
							<a href="# ">奶皮酥</a>
							<a href="# ">栗子糕 </a>
							<a href="# ">马卡龙</a>
							<a href="# ">铜锣烧</a>
							<a href="# ">豌豆黄</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>

				<div class="am-g am-g-fixed floodFour">
					<div class="am-u-sm-5 am-u-md-4 text-one list ">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<div class="outer-con ">
								<div class="title ">开抢啦！</div>
								<div class="sub-title ">零食大礼包</div>
							</div>
							<img src="${APP_PATH}/static/images/act1.png " />
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two sug">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/2.jpg" />
						</a>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/1.jpg" />
						</a>
					</div>


					<div class="am-u-sm-3 am-u-md-2 text-three big">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three sug">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/3.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/4.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three last big ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

				</div>
				<div class="clear "></div>
			</div>


			<div id="f2">
				<!--坚果-->
				<div class="am-container ">
					<div class="shopTitle ">
						<h4>坚果</h4>
						<h3>酥酥脆脆，回味无穷</h3>
						<div class="today-brands ">
							<a href="# ">腰果</a>
							<a href="# ">松子</a>
							<a href="# ">夏威夷果 </a>
							<a href="# ">碧根果</a>
							<a href="# ">开心果</a>
							<a href="# ">核桃仁</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>
				<div class="am-g am-g-fixed floodThree ">
					<div class="am-u-sm-4 text-four list">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/act1.png " />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
							</div>
						</a>
						<div class="triangle-topright"></div>
					</div>
					<div class="am-u-sm-4 text-four">
						<a href="# ">
							<img src="${APP_PATH}/static/images/6.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-4 text-four sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/7.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

					<div class="am-u-sm-6 am-u-md-3 text-five big ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/8.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/9.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five big">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

				</div>

				<div class="clear "></div>
			</div>


			<div id="f3">
				<!--甜点-->

				<div class="am-container ">
					<div class="shopTitle ">
						<h4>甜品</h4>
						<h3>每一道甜品都有一个故事</h3>
						<div class="today-brands ">
							<a href="# ">桂花糕</a>
							<a href="# ">奶皮酥</a>
							<a href="# ">栗子糕 </a>
							<a href="# ">马卡龙</a>
							<a href="# ">铜锣烧</a>
							<a href="# ">豌豆黄</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>

				<div class="am-g am-g-fixed floodFour">
					<div class="am-u-sm-5 am-u-md-4 text-one list ">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<div class="outer-con ">
								<div class="title ">开抢啦！</div>
								<div class="sub-title ">零食大礼包</div>
							</div>
							<img src="${APP_PATH}/static/images/act1.png " />
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two sug">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/2.jpg" />
						</a>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/1.jpg" />
						</a>
					</div>


					<div class="am-u-sm-3 am-u-md-2 text-three big">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three sug">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/3.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/4.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three last big ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

				</div>
				<div class="clear "></div>
			</div>


			<div id="f4">
				<!--坚果-->
				<div class="am-container ">
					<div class="shopTitle ">
						<h4>坚果</h4>
						<h3>酥酥脆脆，回味无穷</h3>
						<div class="today-brands ">
							<a href="# ">腰果</a>
							<a href="# ">松子</a>
							<a href="# ">夏威夷果 </a>
							<a href="# ">碧根果</a>
							<a href="# ">开心果</a>
							<a href="# ">核桃仁</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>
				<div class="am-g am-g-fixed floodThree ">
					<div class="am-u-sm-4 text-four list">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/act1.png " />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
							</div>
						</a>
						<div class="triangle-topright"></div>
					</div>
					<div class="am-u-sm-4 text-four">
						<a href="# ">
							<img src="${APP_PATH}/static/images/6.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-4 text-four sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/7.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

					<div class="am-u-sm-6 am-u-md-3 text-five big ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/8.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/9.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five big">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

				</div>

				<div class="clear "></div>
			</div>


			<div id="f5">
				<!--甜点-->

				<div class="am-container ">
					<div class="shopTitle ">
						<h4>甜品</h4>
						<h3>每一道甜品都有一个故事</h3>
						<div class="today-brands ">
							<a href="# ">桂花糕</a>
							<a href="# ">奶皮酥</a>
							<a href="# ">栗子糕 </a>
							<a href="# ">马卡龙</a>
							<a href="# ">铜锣烧</a>
							<a href="# ">豌豆黄</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>

				<div class="am-g am-g-fixed floodFour">
					<div class="am-u-sm-5 am-u-md-4 text-one list ">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<div class="outer-con ">
								<div class="title ">开抢啦！</div>
								<div class="sub-title ">零食大礼包</div>
							</div>
							<img src="${APP_PATH}/static/images/act1.png " />
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two sug">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/2.jpg" />
						</a>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/1.jpg" />
						</a>
					</div>


					<div class="am-u-sm-3 am-u-md-2 text-three big">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three sug">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/3.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/4.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three last big ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

				</div>
				<div class="clear "></div>
			</div>


			<div id="f6">
				<!--坚果-->
				<div class="am-container ">
					<div class="shopTitle ">
						<h4>坚果</h4>
						<h3>酥酥脆脆，回味无穷</h3>
						<div class="today-brands ">
							<a href="# ">腰果</a>
							<a href="# ">松子</a>
							<a href="# ">夏威夷果 </a>
							<a href="# ">碧根果</a>
							<a href="# ">开心果</a>
							<a href="# ">核桃仁</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>
				<div class="am-g am-g-fixed floodThree ">
					<div class="am-u-sm-4 text-four list">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/act1.png " />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
							</div>
						</a>
						<div class="triangle-topright"></div>
					</div>
					<div class="am-u-sm-4 text-four">
						<a href="# ">
							<img src="${APP_PATH}/static/images/6.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-4 text-four sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/7.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

					<div class="am-u-sm-6 am-u-md-3 text-five big ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/8.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/9.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five big">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

				</div>

				<div class="clear "></div>
			</div>



			<div id="f7">
				<!--甜点-->

				<div class="am-container ">
					<div class="shopTitle ">
						<h4>甜品</h4>
						<h3>每一道甜品都有一个故事</h3>
						<div class="today-brands ">
							<a href="# ">桂花糕</a>
							<a href="# ">奶皮酥</a>
							<a href="# ">栗子糕 </a>
							<a href="# ">马卡龙</a>
							<a href="# ">铜锣烧</a>
							<a href="# ">豌豆黄</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>

				<div class="am-g am-g-fixed floodFour">
					<div class="am-u-sm-5 am-u-md-4 text-one list ">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<div class="outer-con ">
								<div class="title ">开抢啦！</div>
								<div class="sub-title ">零食大礼包</div>
							</div>
							<img src="${APP_PATH}/static/images/act1.png " />
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two sug">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/2.jpg" />
						</a>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/1.jpg" />
						</a>
					</div>


					<div class="am-u-sm-3 am-u-md-2 text-three big">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three sug">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/3.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/4.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three last big ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

				</div>
				<div class="clear "></div>
			</div>

			<div id="f8">
				<!--坚果-->
				<div class="am-container ">
					<div class="shopTitle ">
						<h4>坚果</h4>
						<h3>酥酥脆脆，回味无穷</h3>
						<div class="today-brands ">
							<a href="# ">腰果</a>
							<a href="# ">松子</a>
							<a href="# ">夏威夷果 </a>
							<a href="# ">碧根果</a>
							<a href="# ">开心果</a>
							<a href="# ">核桃仁</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>
				<div class="am-g am-g-fixed floodThree ">
					<div class="am-u-sm-4 text-four list">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/act1.png " />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
							</div>
						</a>
						<div class="triangle-topright"></div>
					</div>
					<div class="am-u-sm-4 text-four">
						<a href="# ">
							<img src="${APP_PATH}/static/images/6.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-4 text-four sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/7.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

					<div class="am-u-sm-6 am-u-md-3 text-five big ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/8.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/9.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five big">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

				</div>

				<div class="clear "></div>
			</div>

			<div id="f9">
				<!--甜点-->

				<div class="am-container ">
					<div class="shopTitle ">
						<h4>甜品</h4>
						<h3>每一道甜品都有一个故事</h3>
						<div class="today-brands ">
							<a href="# ">桂花糕</a>
							<a href="# ">奶皮酥</a>
							<a href="# ">栗子糕 </a>
							<a href="# ">马卡龙</a>
							<a href="# ">铜锣烧</a>
							<a href="# ">豌豆黄</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>

				<div class="am-g am-g-fixed floodFour">
					<div class="am-u-sm-5 am-u-md-4 text-one list ">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<div class="outer-con ">
								<div class="title ">开抢啦！</div>
								<div class="sub-title ">零食大礼包</div>
							</div>
							<img src="${APP_PATH}/static/images/act1.png " />
						</a>
						<div class="triangle-topright"></div>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two sug">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/2.jpg" />
						</a>
					</div>

					<div class="am-u-sm-7 am-u-md-4 text-two">
						<div class="outer-con ">
							<div class="title ">雪之恋和风大福</div>
							<div class="sub-title ">¥13.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/1.jpg" />
						</a>
					</div>


					<div class="am-u-sm-3 am-u-md-2 text-three big">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three sug">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/3.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/4.jpg" />
						</a>
					</div>

					<div class="am-u-sm-3 am-u-md-2 text-three last big ">
						<div class="outer-con ">
							<div class="title ">小优布丁</div>
							<div class="sub-title ">¥4.8</div>
							<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/5.jpg" />
						</a>
					</div>

				</div>
				<div class="clear "></div>
			</div>


			<div id="f10">
				<!--坚果-->
				<div class="am-container ">
					<div class="shopTitle ">
						<h4>坚果</h4>
						<h3>酥酥脆脆，回味无穷</h3>
						<div class="today-brands ">
							<a href="# ">腰果</a>
							<a href="# ">松子</a>
							<a href="# ">夏威夷果 </a>
							<a href="# ">碧根果</a>
							<a href="# ">开心果</a>
							<a href="# ">核桃仁</a>
						</div>
						<span class="more "> <a href="# ">
								更多美味<i class="am-icon-angle-right" style="padding-left:10px ;"></i>
							</a>
						</span>
					</div>
				</div>
				<div class="am-g am-g-fixed floodThree ">
					<div class="am-u-sm-4 text-four list">
						<div class="word">
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
							<a class="outer" href="#">
								<span class="inner"><b class="text">核桃</b></span>
							</a>
						</div>
						<a href="# ">
							<img src="${APP_PATH}/static/images/act1.png " />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
							</div>
						</a>
						<div class="triangle-topright"></div>
					</div>
					<div class="am-u-sm-4 text-four">
						<a href="# ">
							<img src="${APP_PATH}/static/images/6.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-4 text-four sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/7.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

					<div class="am-u-sm-6 am-u-md-3 text-five big ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five ">
						<a href="# ">
							<img src="${APP_PATH}/static/images/8.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five sug">
						<a href="# ">
							<img src="${APP_PATH}/static/images/9.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>
					<div class="am-u-sm-6 am-u-md-3 text-five big">
						<a href="# ">
							<img src="${APP_PATH}/static/images/10.jpg" />
							<div class="outer-con ">
								<div class="title ">雪之恋和风大福</div>
								<div class="sub-title ">¥13.8</div>
								<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
							</div>
						</a>
					</div>

				</div>

				<div class="clear "></div>
			</div>



			<div class="footer ">
				<div class="footer-hd ">
					<p>
						<a href="# ">恒望科技</a>
						<b>|</b>
						<a href="shop/oldfronthome ">商城首页</a>
						<b>|</b>
						<a href="# ">支付宝</a>
						<b>|</b>
						<a href="# ">物流</a>
					</p>
				</div>
				<div class="footer-bd ">
					<p>
						<a href="# ">关于恒望</a>
						<a href="# ">合作伙伴</a>
						<a href="# ">联系我们</a>
						<a href="# ">网站地图</a>
						<em>© 2015-2025 Hengwang.com 版权所有</em>
					</p>
				</div>
			</div>

		</div>
	</div>
	<!--引导 -->
	<div class="navCir">
		<li class="active">
			<a href="shop/oldfronthome">
				<i class="am-icon-home "></i>首页
			</a>
		</li>
		<li>
			<a href="shop/sort">
				<i class="am-icon-list"></i>分类
			</a>
		</li>
		<li>
			<a href="shop/shopcart">
				<i class="am-icon-shopping-basket"></i>购物车
			</a>
		</li>
		<li>
			<a href="shop/index">
				<i class="am-icon-user"></i>我的
			</a>
		</li>
	</div>


	<!--菜单 -->
	<div class=tip>
		<div id="sidebar">
			<div id="wrap">
				<div id="prof" class="item ">
					<a href="# ">
						<span class="setting "></span>
					</a>
					<div class="ibar_login_box status_login ">
						<div class="avatar_box ">
							<p class="avatar_imgbox ">
								<img src="${APP_PATH}/static/images/no-img_mid_.jpg " />
							</p>
							<ul class="user_info ">
								<li>用户名sl1903</li>
								<li>级&nbsp;别普通会员</li>
							</ul>
						</div>
						<div class="login_btnbox ">
							<a href="# " class="login_order ">我的订单</a>
							<a href="shop/collection" class="login_favorite ">我的收藏</a>
						</div>
						<i class="icon_arrow_white "></i>
					</div>

				</div>
				<div id="shopCart " class="item ">
					<a href="shop/shopcart">
						<span class="message "></span>
					</a>
					<p>购物车</p>
					<p class="cart_num ">0</p>
				</div>
				<div id="asset " class="item ">
					<a href="# ">
						<span class="view "></span>
					</a>
					<div class="mp_tooltip ">
						我的资产 <i class="icon_arrow_right_black "></i>
					</div>
				</div>

				<div id="foot " class="item ">
					<a href="# ">
						<span class="zuji "></span>
					</a>
					<div class="mp_tooltip ">
						我的足迹 <i class="icon_arrow_right_black "></i>
					</div>
				</div>

				<div id="brand " class="item ">
					<a href="shop/collection">
						<span class="wdsc "><img src="${APP_PATH}/static/images/wdsc.png " /></span>
					</a>
					<div class="mp_tooltip ">
						我的收藏 <i class="icon_arrow_right_black "></i>
					</div>
				</div>

				<div id="broadcast " class="item ">
					<a href="# ">
						<span class="chongzhi "><img src="${APP_PATH}/static/images/chongzhi.png " /></span>
					</a>
					<div class="mp_tooltip ">
						我要充值 <i class="icon_arrow_right_black "></i>
					</div>
				</div>

				<div class="quick_toggle ">
					<li class="qtitem ">
						<a href="# ">
							<span class="kfzx "></span>
						</a>
						<div class="mp_tooltip ">
							客服中心<i class="icon_arrow_right_black "></i>
						</div>
					</li>
					<!--二维码 -->
					<li class="qtitem ">
						<a href="#none ">
							<span class="mpbtn_qrcode "></span>
						</a>
						<div class="mp_qrcode " style="display:none; ">
							<img src="${APP_PATH}/static/images/weixin_code_145.png " /><i class="icon_arrow_white "></i>
						</div>
					</li>
					<li class="qtitem ">
						<a href="#top " class="return_top ">
							<span class="top "></span>
						</a>
					</li>
				</div>

				<!--回到顶部 -->
				<div id="quick_links_pop " class="quick_links_pop hide "></div>

			</div>

		</div>
		<div id="prof-content " class="nav-content ">
			<div class="nav-con-close ">
				<i class="am-icon-angle-right am-icon-fw "></i>
			</div>
			<div>我</div>
		</div>
		<div id="shopCart-content " class="nav-content ">
			<div class="nav-con-close ">
				<i class="am-icon-angle-right am-icon-fw "></i>
			</div>
			<div>购物车</div>
		</div>
		<div id="asset-content " class="nav-content ">
			<div class="nav-con-close ">
				<i class="am-icon-angle-right am-icon-fw "></i>
			</div>
			<div>资产</div>

			<div class="ia-head-list ">
				<a href="# " target="_blank " class="pl ">
					<div class="num ">0</div>
					<div class="text ">优惠券</div>
				</a>
				<a href="# " target="_blank " class="pl ">
					<div class="num ">0</div>
					<div class="text ">红包</div>
				</a>
				<a href="# " target="_blank " class="pl money ">
					<div class="num ">￥0</div>
					<div class="text ">余额</div>
				</a>
			</div>

		</div>
		<div id="foot-content " class="nav-content ">
			<div class="nav-con-close ">
				<i class="am-icon-angle-right am-icon-fw "></i>
			</div>
			<div>足迹</div>
		</div>
		<div id="brand-content " class="nav-content ">
			<div class="nav-con-close ">
				<i class="am-icon-angle-right am-icon-fw "></i>
			</div>
			<div>收藏</div>
		</div>
		<div id="broadcast-content " class="nav-content ">
			<div class="nav-con-close ">
				<i class="am-icon-angle-right am-icon-fw "></i>
			</div>
			<div>充值</div>
		</div>
	</div>
	<script>
        window.jQuery || document.write('<script src="basic/js/jquery.min.js "><\/script>');
    </script>
	<script type="text/javascript " src="../basic/js/quick_links.js "></script>
	<script type="text/javascript">
        function logouttip() {
            layer.open({
                content : '是否需要退出登录？',
                btn : [ '退出', '取消' ],
                yes : function(index, layero) {
                    window.location.href = "Shop/Userlogout";
                },
                btn2 : function(index, layero) {
                    //return false 开启该代码可禁止点击该按钮关闭
                },

                cancel : function() {
                    //右上角关闭回调
                    //return false 开启该代码可禁止点击该按钮关闭
                }
            });
        }
    </script>
</body>

</html>