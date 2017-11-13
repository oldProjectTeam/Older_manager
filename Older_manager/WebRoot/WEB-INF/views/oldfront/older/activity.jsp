<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <!-- PRETTY PHOTO FOR GALLERY  -->
    <link href="${APP_PATH}/static/oldfront/assets/css/prettyPhoto.css" rel="stylesheet" />
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
<strong>Support : </strong>  info@yourdomain.com
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
                           
                            <li><a href="about.jsp">关于我们</a></li>
                             
                             
                            <li><a href="contact.jsp">联系我们</a></li>
                            
                            <li><a href="activity.jsp"class="menu-top-active">社区活动</a></li>
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

              
									<h1 class="head-line">社区活动</h1>
									
                      </div>
            </div>
        </div>

    </div>
    </div>
    <!-- BELOW SLIDESHOW SECTION END-->
     
    <div class="just-sec" id="port-folio">
        

        <div class="container">
            
            <div class="row " >
                  <ul id="filters" >
						<li><span class="filter active" data-filter="landscape nature awesome">比赛 </span></li>
						<li><span class="filter active">/</span></li>
						<li><span class="filter" data-filter="landscape">旅游</span></li>
						<li><span class="filter">/</span></li>
						<li><span class="filter" data-filter="nature">歌舞会</span></li>
						<li><span class="filter">/</span></li>
						<li><span class="filter" data-filter="awesome">欢迎您的加入</span></li>
					</ul>
              <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div><div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div><div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div><div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div><div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>

            </div>

             <div class="row " style="padding-top: 50px;">
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="${APP_PATH}/static/oldfront/assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                                                                                 这个是兵乓球赛
                                </span>
                               
                                                                                 点击了解详情
                            </p>
                          
                        </div>
                        <h6 style="text-align: center;">这是一个比赛</h6>
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
     <!--PRETTY PHOTO FOR GALLERY -->
    <script src="${APP_PATH}/static/oldfront/assets/js/jquery.prettyPhoto.js"></script>
     <!--PHOTO FILTER -->
    <script src="${APP_PATH}/static/oldfront/assets/js/jquery.mixitup.min.js"></script>
     <!--CUSTOM SCRIPTS -->
    <script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
</body>

</html>
