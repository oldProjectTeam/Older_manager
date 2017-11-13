﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Free Multipager Template : Linuji</title>

    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="${APP_PATH}/static/oldfront/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="${APP_PATH}/static/oldfront/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- ANIMATE STYLE  -->
    <link href="${APP_PATH}/static/oldfront/assets/css/animate.css" rel="stylesheet" />
    <!-- FLEXSLIDER STYLE  -->
    <link href="${APP_PATH}/static/oldfront/assets/css/flexslider.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="${APP_PATH}/static/oldfront/assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONTS  -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css' />
     <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css' />
</head>
<body>

 <div class="navbar navbar-inverse set-radius-zero" >
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">

                    <img src="${APP_PATH}/static/oldfront/assets/img/logo.png" />
                </a>

            </div>
            <div class="right-div">
<strong>欢迎 : </strong>  老人
            </div>
          
        </div>
    </div>
    <!-- LOGO HEADER END-->
    <section class="menu-section">
        <div class="container">
            <div class="row ">
                <div class="col-md-12">
                    <div class="navbar-collapse collapse ">
                        <ul id="menu-top" class="nav navbar-nav navbar-right">
                            <li><a href="index.jsp"  >主页</a></li>
                           
                            <li><a href="about.jsp"class="menu-top-active">关于我们</a></li>
                             
                             
                            <li><a href="contact.jsp">联系我们</a></li>
                            
                            <li><a href="activity.jsp">社区活动</a></li>
                            <li><a href="download.jsp">客户端下载</a></li>
                            <li><a href="vedio.jsp">视频直播</a></li>
                            <li><a href="blank.jsp">会员登陆</li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
     <!-- MENU SECTION END-->
  
    <div class="below-slideshow">
         <div class="container">
        <div class="row">
            
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="txt-block">

              
									<h1 class="head-line">关于我们</h1>
									
                      </div>
            </div>
        </div>

    </div>
    </div>
    <!-- BELOW SLIDESHOW SECTION END-->
      <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
             <h1 class="tag-home">  上海和孝养老服务有限公司是一家业内资深的专注于提供优质健康管理服务的老年养护集团公司。和孝集团在老年养护行业深耕十年有余，实力雄厚。</h1> 
               <hr />
                 </div>
            </div>
          </div>
     <!-- TAG HOME SECTION END-->
    <div class="just-sec">
        

        <div class="container">
             
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                <div class="just-txt-div">

              <img src="${APP_PATH}/static/oldfront/assets/img/t1.jpg" alt="" class="img-circle set-about-img"  />
									<h2><strong>我们的品牌理念</strong>  </h2>
									<p >
										和孝养老服务集团追求“5H”品牌理念，即HEALTH --- 健康、HAPPINESS --- 幸福、HARMONY --- 和谐、HOPE --- 希望、HOME --- 家一样的舒适，为我们的老年朋友打造健康、幸福和谐、有希望的家！
									</p>
                   
                      </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
               <div class="just-txt-div">

              <img src="${APP_PATH}/static/oldfront/assets/img/t2.jpg" alt="" class="img-circle set-about-img"  />
									<h2><strong>我们的发展目标</strong>  </h2>
									<p >
										和孝养老服务集团目标成为最符合社会需要的养老综合服务运营商，所以我们把握好时机和节奏，做好这三件事：
                                        1.     行业标准制定方，服务最完善的养老机构
                                        2.     一套内生增长、自动循环、修复、完善的标准系统模式
                                        3.     链接各行业的“养老+互联网”服务平台
									</p>
                   
                      </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
               <div class="just-txt-div">

              <img src="${APP_PATH}/static/oldfront/assets/img/t3.jpg" alt="" class="img-circle set-about-img"  />
									<h2><strong>我们的经营模式</strong>  </h2>
									<p >
										其主打的机构养老、社区养老和居家养老三级服务相结合的模式，打破了机构养老的单一模式，集团会员可自由选择居住、托管、康复或是仅参加日常园区内社团活动。会员在养护园区内既能享受舒适的设施和优质的养护、医疗服务，又不脱离生活社交圈，依然保有一定的社会活跃度。
									</p>
                   
                      </div>
            </div>
        </div>
             <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-46 col-xs-12">
                <div class="just-txt-div">

									<p >
										上海和孝养老服务有限公司是一家业内资深的专注于提供优质健康管理服务的老年养护集团公司。
										和孝集团在老年养护行业深耕十年有余，实力雄厚。其主打的机构养老、社区养老和居家养老三级服务相结合的模式，
										打破了机构养老的单一模式，集团会员可自由选择居住、托管、康复或是仅参加日常园区内社团活动。
										会员在养护园区内既能享受舒适的设施和优质的养护、医疗服务，又不脱离生活社交圈，依然保有一定的社会活跃度。
										这即是和孝集团倡导的安定、安心、安康、安享的“四安”养护生活方式，从而助力老年人享受充实而精彩的晚年生活。
									</p>
                    <p >
                                                   和孝养老服务集团在上海、浙江等地设有8家长寿家园养护机构，占地面积5万余平方，管理床位2000多张。
									</p>
                   
                      </div>
            </div>
            <div class="col-lg-6 col-md-6 col-sm-46 col-xs-12">
                 <div class="just-txt-div">
                     <img src="${APP_PATH}/static/oldfront/assets/img/side.jpg" class="img-responsive" />
                
                     </div>
            </div>
        </div>
    </div>
    </div>         
     <!--JUST SECTION END-->
      <div class="parallax-like">
        <div class="overlay">

       
       <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                <div class="just-txt-div">
                  <strong> 300+</strong> 
                    <p>
                        Clients
                    </p>
                </div>
                </div>
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                <div class="just-txt-div">
                  <strong> 100+</strong> 
                    <p>
                        Offices
                    </p>
                </div>
                </div>
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                <div class="just-txt-div">
                  <strong> 50000+</strong> 
                    <p>
                        Employees
                    </p>
                </div>
                </div>
            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                <div class="just-txt-div">
                  <strong> 500+</strong> 
                    <p>
                        Projects
                    </p>
                </div>
                </div>
            </div>
           </div>
             </div>
    </div>
     <!-- PARALLAX LIKE SECTION END-->
     <div class="container " >
         <div class="row ">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <h1 class="head-line">Our Clients </h1>
                <br />
                </div>
            </div>
             <div class="row ">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <hr />
                 <div class="flexslider carousel">
          <ul class="slides">
            <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
  	    		 <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
            <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
  	    		 <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
              <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
  	    		 <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
              <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
  	    		 <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
              <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
  	    		 <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
               <li>
  	    	    <img src="${APP_PATH}/static/oldfront/assets/img/client.jpg" />
  	    		</li>
          </ul>
        </div>
                <hr />
                <br />
                </div>
            </div>
         </div>
     
      <!--SET-DIV SECTION END-->
   
   <div class="footer-sec">
         <div class="container">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">

              
									<h3> <strong>ABOUT COMPANY</strong> </h3>
									<p style="padding-right:50px;" >
										Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sagittis felis dolor vitae.
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sagittis felis dolor vitae.
									</p>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 social-div">
               

              
										<h3> <strong>SOCIAL PRESENCE</strong> </h3>
                We love to be social,Catch Us On
                <a href="#" ><h4>FACEBOOK </h4></a>
                   <a href="#" ><h4>TWITTER </h4></a>
                 <a href="#" ><h4>LINKEDIN </h4></a>
									
                    
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
            <h3> <strong>PHYSICAL LOCATION</strong> </h3>
                Reach Us Below:
                <br />
                <h4>90/567, Raw Street Lane,</h4>
                 <h4>United States of America,</h4>
                 <h4>Pin: 309987-09</h4>
            </div>
        </div>
 <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <hr />
                <div style="text-align:right;padding:5px;">
                    &copy;2014 yourdomain.com | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                </div>
            </div>
    </div>
    </div>
       </div>
     <!--FOOTER SECTION END-->
      <!-- WE PUT SCRIPTS AT THE END TO LOAD PAGE FASTER-->
<!--CORE SCRIPTS PLUGIN-->
    <script src="${APP_PATH}/static/oldfront/assets/js/jquery-1.11.1.min.js"></script>
     <!--BOOTSTRAP SCRIPTS PLUGIN-->
<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
     <!--WOW SCRIPTS PLUGIN-->
    <script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
     <!--FLEXSLIDER SCRIPTS PLUGIN-->
    <script src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
     <!--CUSTOM SCRIPTS -->
    <script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
</body>

</html>
